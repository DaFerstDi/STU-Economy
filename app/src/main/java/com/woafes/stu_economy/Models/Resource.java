package com.woafes.stu_economy.Models;
public class Resource {
    private int _value;
    private int _maxValue;
    private int _icon;
    private String _name;

    public Resource(String name, int value, int maxValue, int icon){
        this._name = name;
        set_value(value);
        set_maxValue(maxValue);
        set_icon(icon);
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

    public int get_icon() {
        return _icon;
    }

    public void set_icon(int _icon) {
        this._icon = _icon;
    }

    private boolean validate(int val){
            if (val < 0) return false;
            if (_maxValue == -10 && val % 10 == 0) return true;
            else if (_maxValue == 0) return true;
            else return val <= _maxValue;
    }

    public String getName(){
        return this._name;
    }
}
