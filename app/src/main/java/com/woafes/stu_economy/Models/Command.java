package com.woafes.stu_economy.Models;

public class Command{
    private String _name;
    private boolean _is_maxCarriage;
    private boolean _is_maxPoints;
    public Resource money;
    public Resource points; // Победные очки
    public Resource pv; // Полувагоны
    public Resource cis; // Цистерны
    public Resource pl; // Платформы
    public Resource kr; // Крытые
    public Resource ports_okt; // Порты Октябрьской
    public Resource ports_sev; // Порты Северо-Кавказской
    public Resource ports_dv; // Порты Дальневосточной
    public Resource coal;
    public Resource oil;
    public Resource coke; // Кокс
    public Resource bl_met; // Чёрные металлы
    public Resource iron;
    public Resource build; // Строительныйе
    public Resource cement;
    public Resource forest;
    public Resource chemical;
    public Resource seed;
    public Resource container;

    public Command(String name){
        this._name = name;
        this.money = new Resource(0, 0);
        this.points = new Resource(0, 0);
        this.pv = new Resource(0, -10);
        this.cis = new Resource(0, -10);
        this.pl = new Resource(0, -10);
        this.kr = new Resource(0, -10);
        this.ports_okt = new Resource(0, 5);
        this.ports_sev = new Resource(0, 5);
        this.ports_dv = new Resource(0, 5);
        this.coal = new Resource(0, 10);
        this.oil = new Resource(0, 6);
        this.coke = new Resource(0, 6);
        this.bl_met = new Resource(0, 6);
        this.iron = new Resource(0, 6);
        this.build = new Resource(0, 6);
        this.cement = new Resource(0, 4);
        this.forest = new Resource(0, 4);
        this.chemical = new Resource(0, 4);
        this.seed = new Resource(0, 4);
        this.container = new Resource(0, 4);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name){
     this._name = name;
    }

    public boolean is_maxCarriage() {
        return _is_maxCarriage;
    }

    public void set_is_maxCarriage(boolean _is_maxCarriage) {
        this._is_maxCarriage = _is_maxCarriage;
    }

    public boolean is_maxPoints() {
        return _is_maxPoints;
    }

    public void set_is_maxPoints(boolean _is_maxPoints) {
        this._is_maxPoints = _is_maxPoints;
    }
}
