package com.woafes.stu_economy.EventBus;

import com.woafes.stu_economy.Models.Command;

public class CommandEvent {
    public final Command command;
    public CommandEvent(Command command){
        this.command = command;
    }
}
