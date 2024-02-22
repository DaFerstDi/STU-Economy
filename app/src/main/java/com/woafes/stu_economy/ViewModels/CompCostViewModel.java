package com.woafes.stu_economy.ViewModels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.squareup.otto.Subscribe;
import com.woafes.stu_economy.EventBus.BusStation;
import com.woafes.stu_economy.EventBus.CommandEvent;
import com.woafes.stu_economy.Models.Command;

public class CompCostViewModel extends ViewModel {

    private Command _command;
    final private MutableLiveData<Command> commandMutableLiveData;

    public CompCostViewModel(){
        _command = new Command("");
        commandMutableLiveData = new MutableLiveData<>(_command);
        BusStation.getBus().register(this);
    }

    public void set_command(Command command){
        _command = command;
        BusStation.getBus().post(new CommandEvent(_command));
    }

    public void setIsMaxCarriage(boolean val){
        _command.set_is_maxCarriage(val);
        BusStation.getBus().post(new CommandEvent(_command));
    }
    public void setIsMaxPoints(boolean val){
        _command.set_is_maxPoints(val);
        BusStation.getBus().post(new CommandEvent(_command));
    }

    public LiveData<Command> get_Command(){
        return commandMutableLiveData;
    }

    @Override
    public void onCleared(){
        super.onCleared();

        BusStation.getBus().unregister(this);

        Log.e("AAA", "CompCost VM cleared");
    }

    @Subscribe
    public void update(CommandEvent event){
        _command = event.command;
        commandMutableLiveData.setValue(_command);
    }
}
