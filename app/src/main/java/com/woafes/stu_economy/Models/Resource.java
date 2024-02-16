package com.woafes.stu_economy.Models;
public class Resource {
    private int _value;
    private int _maxValue;

    public Resource(int value, int maxValue){
        set_value(value);
        set_maxValue(maxValue);
    }

    public void set_maxValue(int maxValue) {
        this._maxValue = maxValue;
    }
    public void set_value(int value){
        if (validate(value)) _value = value;
        else throw new IllegalArgumentException("---Check the entered number---");
    }
    public int get_value() {
        return _value;
    }

    private boolean validate(int val){
            if (val < 0) return false;
            if (_maxValue == -10 && val % 10 == 0) return true;
            else if (_maxValue == 0) return true;
            else return val <= _maxValue;
    }
}
