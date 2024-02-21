package com.woafes.stu_economy.Models;

import com.woafes.stu_economy.R;

public class Command{
    private String _name;
    private String _lastSave;
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
        this.money = new Resource("Наличные", 4000000, 0, R.drawable.money);
        this.points = new Resource("Победные очки", 0, 0, R.drawable.zvizda);
        this.pv = new Resource("Полувагоны (ПВ)", 20, -10, R.drawable.poluvagon);
        this.cis = new Resource("Цистерны (Ц)", 0, -10, R.drawable.bochka);
        this.pl = new Resource("Платформы (ПЛ)", 0, -10, R.drawable.platforma);
        this.kr = new Resource("Крытые вагоны (КР)", 0, -10, R.drawable.vagon);
        this.ports_okt = new Resource("Порты Октябрьской ж.д.", 0, 5, R.drawable.ports_okt);
        this.ports_sev = new Resource("Порты Северо-Кавказской ж.д.", 0, 5, R.drawable.ports_sk);
        this.ports_dv = new Resource("Порты Дальневосточной ж.д.", 0, 5, R.drawable.ports_dv);
        this.coal = new Resource("Каменный уголь", 0, 10, R.drawable.kam_ug);
        this.oil = new Resource("Нефть и нефтепродукты", 0, 6, R.drawable.oil);
        this.coke = new Resource("Кокс", 0, 6, R.drawable.koks);
        this.bl_met = new Resource("Чёрные металлы", 0, 6, R.drawable.bl_met);
        this.iron = new Resource("Руда железная", 0, 6, R.drawable.iron);
        this.build = new Resource("Строительные грузы", 0, 6, R.drawable.str_gru);
        this.cement = new Resource("Цемент", 0, 4, R.drawable.cement);
        this.forest = new Resource("Лес", 0, 4, R.drawable.bobir);
        this.chemical = new Resource("Химические грузы", 0, 4, R.drawable.zhiza);
        this.seed = new Resource("Зерновые", 0, 4, R.drawable.seed);
        this.container = new Resource("Грузы в контейнерах", 0, 4, R.drawable.kont);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name){
     this._name = name;
    }

    public String get_lastSave() {
        return _lastSave;
    }

    public void set_lastSave(String _lastSave) {
        this._lastSave = _lastSave;
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

    public Resource getResByName(String _name){
        switch (_name){
            case ("Наличные"):{
                return money;
            }
            case ("Победные очки"):{
                return points;
            }
            case ("Полувагоны (ПВ)"):{
                return pv;
            }
            case ("Цистерны (Ц)"):{
                return cis;
            }
            case ("Платформы (ПЛ)"):{
                return pl;
            }
            case ("Крытые вагоны (КР)"):{
                return kr;
            }
            case ("Порты Октябрьской ж.д."):{
                return ports_okt;
            }
            case ("Порты Северо-Кавказской ж.д."):{
                return ports_sev;
            }
            case ("Порты Дальневосточной ж.д."):{
                return ports_dv;
            }
            case ("Каменный уголь"):{
                return coal;
            }
            case ("Нефть и нефтепродукты"):{
                return oil;
            }
            case ("Кокс"):{
                return coke;
            }
            case ("Чёрные металлы"):{
                return bl_met;
            }
            case ("Руда железная"):{
                return iron;
            }
            case ("Строительные грузы"):{
                return build;
            }
            case ("Цемент"):{
                return cement;
            }
            case ("Лес"):{
                return forest;
            }
            case ("Химические грузы"):{
                return chemical;
            }
            case ("Зерновые"):{
                return seed;
            }
            case ("Грузы в контейнерах"):{
                return container;
            }

        }
        return new Resource("Null", 0, 0, R.drawable.stu);
    }
}
