package com.woafes.stu_economy.EventBus;

import com.woafes.stu_economy.Models.Command;

public class ComandEvent {
    public final Command command;
    public ComandEvent(Command command){
        this.command = command;
    }
}
