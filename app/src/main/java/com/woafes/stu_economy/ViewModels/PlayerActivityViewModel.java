package com.woafes.stu_economy.ViewModels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.squareup.otto.Produce;
import com.squareup.otto.Subscribe;
import com.woafes.stu_economy.EventBus.BusStation;
import com.woafes.stu_economy.EventBus.ComandEvent;
import com.woafes.stu_economy.Models.Command;

public class PlayerActivityViewModel extends ViewModel {
    private Command command; // Переменная, хранящая данные для передатчика
    final private MutableLiveData<Command> commandMutableLiveData; // передатчик

    public PlayerActivityViewModel(){
        command = new Command("Игрок");
        commandMutableLiveData = new MutableLiveData<>(command);

        BusStation.getBus().register(this);
        BusStation.getBus().post(new ComandEvent(command));

        Log.e("AAA", "PlayerActivity VM created");
    }

    public LiveData<Command> get_Command(){
        return commandMutableLiveData;
    }

    @Override
    public void onCleared(){
        super.onCleared();

        BusStation.getBus().unregister(this);

        Log.e("AAA", "PlayerActivity VM destroyed");
    }

    @Produce
    public ComandEvent produceAnswer(){
        return new ComandEvent(this.command);
    }
    @Subscribe
    public void update(ComandEvent event){
        command = event.command;
        commandMutableLiveData.setValue(command);
    }

}
