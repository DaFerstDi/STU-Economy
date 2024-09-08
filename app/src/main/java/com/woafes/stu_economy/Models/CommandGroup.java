package com.woafes.stu_economy.Models;

public class CommandGroup {
    private Command _command1;
    private Command _command2;
    private Command _command3;
    private Command _command4;

    private String _lastSave;


    public CommandGroup() {
        this.set_command1(new Command("Команда 1"));
        this.set_command2(new Command("Команда 2"));
        this.set_command3(new Command("Команда 3"));
        this.set_command4(new Command("Команда 4"));
    }

    public String get_lastSave() {
        return _lastSave;
    }

    public void set_lastSave(String _lastSave) {
        this._lastSave = _lastSave;
        _command1.set_lastSave(_lastSave);
        _command2.set_lastSave(_lastSave);
        _command3.set_lastSave(_lastSave);
        _command4.set_lastSave(_lastSave);
    }

    public Command get_command1() {
        return _command1;
    }

    public void set_command1(Command _command1) {
        this._command1 = _command1;
    }

    public Command get_command2() {
        return _command2;
    }

    public void set_command2(Command _command2) {
        this._command2 = _command2;
    }

    public Command get_command3() {
        return _command3;
    }

    public void set_command3(Command _command3) {
        this._command3 = _command3;
    }

    public Command get_command4() {
        return _command4;
    }

    public void set_command4(Command _command4) {
        this._command4 = _command4;
    }
}
