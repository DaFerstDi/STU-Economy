package com.woafes.stu_economy.ViewModels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.squareup.otto.Produce;
import com.squareup.otto.Subscribe;
import com.woafes.stu_economy.EventBus.BusStation;
import com.woafes.stu_economy.EventBus.CommandEvent;
import com.woafes.stu_economy.Models.Command;
import com.woafes.stu_economy.Repository.DataBase;

import org.json.JSONException;

public class PlayerActivityViewModel extends ViewModel {
    private Command _command; // Переменная, хранящая данные для передатчика
    final private MutableLiveData<Command> commandMutableLiveData; // передатчик
    //final private MutableLiveData<String>

    public PlayerActivityViewModel(){
        try {
            DataBase db = DataBase.getInstance();
            _command = db.getPlayer();
        }
        catch (Exception e){
            Log.e("AAA", e.getMessage());
            _command = new Command("Игрок");
        }
        commandMutableLiveData = new MutableLiveData<>(_command);

        BusStation.getBus().register(this);
        BusStation.getBus().post(new CommandEvent(_command));

        Log.e("AAA", "PlayerActivity VM created");
    }

    public LiveData<Command> get_Command(){
        return commandMutableLiveData;
    }

    public void  set_command(Command command){
        _command = command;
        commandMutableLiveData.setValue(command);
        BusStation.getBus().post(new CommandEvent(_command));
    }

    @Override
    public void onCleared(){
        super.onCleared();
        DataBase db = DataBase.getInstance();
        try {
            db.savePlayer(_command);
        } catch (Exception e) {
            Log.e("AAA", e.getMessage());
        }


        BusStation.getBus().unregister(this);

        Log.e("AAA", "PlayerActivity VM cleared");
    }

    @Produce
    public CommandEvent produceAnswer(){
        return new CommandEvent(_command);
    }
    @Subscribe
    public void update(CommandEvent event){
        _command = event.command;
        commandMutableLiveData.setValue(_command);
    }

}
