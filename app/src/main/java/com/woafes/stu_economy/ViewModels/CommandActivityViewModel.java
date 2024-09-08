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
import com.woafes.stu_economy.Models.CommandGroup;
import com.woafes.stu_economy.Repository.DataBase;

public class CommandActivityViewModel extends ViewModel {
    private CommandGroup _commandGroup; // Переменная, хранящая данные для передатчика
    private Command _command; // Активная команда
    private int _activeCommand;
    final private MutableLiveData<Command> commandMutableLiveData; // передатчик

    public CommandActivityViewModel(){
        try {
            DataBase db = DataBase.getInstance();
            _commandGroup = db.getCommands();
        }
        catch (Exception e){
            Log.e("AAA", e.getMessage());
            _commandGroup = new CommandGroup();
        }
        _command = _commandGroup.get_command1();
        commandMutableLiveData = new MutableLiveData<>(_command);
        _activeCommand = 1;

        BusStation.getBus().register(this);
        BusStation.getBus().post(new CommandEvent(_command));

        Log.e("AAA", "CommandActivity VM created");
    }

    public LiveData<Command> get_command(){
        return commandMutableLiveData;
    }

    public void clearLastSave(){
        _commandGroup.set_lastSave("");
    }

    public void set_command(Command command){
        _command = command;
        commandMutableLiveData.setValue(_command);
        BusStation.getBus().post(new CommandEvent(_command));
    }

    public void createNewCommandGroup(){
        _commandGroup = new CommandGroup();
        _commandGroup.set_lastSave("");
        _command = _commandGroup.get_command1();
        commandMutableLiveData.setValue(_command);
        _activeCommand = 1;
    }

    @Override
    public void onCleared(){
        super.onCleared();
        DataBase db = DataBase.getInstance();
        try {
            db.saveCommands(_commandGroup);
        } catch (Exception e) {
            Log.e("AAA", e.getMessage());
        }


        BusStation.getBus().unregister(this);

        Log.e("AAA", "PlayerActivity VM cleared");
    }

    public void setPrevCommand(){
        if (_activeCommand == 1){
            _activeCommand = 4;
            _command = _commandGroup.get_command4();
            commandMutableLiveData.setValue(_command);
        }
        else if (_activeCommand == 2){
            _activeCommand = 1;
            _command = _commandGroup.get_command1();
            commandMutableLiveData.setValue(_command);
        }
        else if (_activeCommand == 3){
            _activeCommand = 2;
            _command = _commandGroup.get_command2();
            commandMutableLiveData.setValue(_command);
        }
        else if (_activeCommand == 4){
            _activeCommand = 3;
            _command = _commandGroup.get_command3();
            commandMutableLiveData.setValue(_command);
        }
    }

    public void setNextCommand(){
        if (_activeCommand == 1){
            _activeCommand = 2;
            _command = _commandGroup.get_command2();
            commandMutableLiveData.setValue(_command);
        }
        else if (_activeCommand == 2){
            _activeCommand = 3;
            _command = _commandGroup.get_command3();
            commandMutableLiveData.setValue(_command);
        }
        else if (_activeCommand == 3){
            _activeCommand = 4;
            _command = _commandGroup.get_command4();
            commandMutableLiveData.setValue(_command);
        }
        else if (_activeCommand == 4){
            _activeCommand = 1;
            _command = _commandGroup.get_command1();
            commandMutableLiveData.setValue(_command);
        }
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
