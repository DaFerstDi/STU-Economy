package com.woafes.stu_economy.Models;

public class Contract {
    private String _destination = null;
    private int _carriage = 0;
    private String _cargo = null;
    private long _cost = 0;

    public String get_destination() {
        return _destination;
    }

    public void set_destination(String _destination) {
        this._destination = _destination;
    }

    public int get_carriage() {
        return _carriage;
    }

    public void set_carriage(int _carriage) {
        this._carriage = _carriage;
    }

    public String get_cargo() {
        return _cargo;
    }

    public void set_cargo(String _cargo) {
        this._cargo = _cargo;
    }

    public long get_cost() {
        return _cost;
    }

    public void set_cost(long _cost) {
        this._cost = _cost;
    }
}
