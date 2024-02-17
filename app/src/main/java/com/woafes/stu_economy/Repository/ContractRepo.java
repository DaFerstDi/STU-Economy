package com.woafes.stu_economy.Repository;

import com.woafes.stu_economy.Models.Contract;

public class ContractRepo {
    public static Contract getContract(int yellow, int blue, int red, boolean is_mainStage){
        Contract contract = new Contract();

        if (is_mainStage){
            switch (red){
                case (1):{contract.set_carriage(10); break;}
                case (2):{contract.set_carriage(20); break;}
                case (3):{contract.set_carriage(30); break;}
                case (4):{contract.set_carriage(40); break;}
                case (5):{contract.set_carriage(50); break;}
                case (6):{contract.set_carriage(60); break;}
            }
        }
        else {
            switch (red){
                case (1):{contract.set_carriage(10); break;}
                case (2):{contract.set_carriage(10); break;}
                case (3):{contract.set_carriage(20); break;}
                case (4):{contract.set_carriage(20); break;}
                case (5):{contract.set_carriage(30); break;}
                case (6):{contract.set_carriage(30); break;}
            }
        }
        switch (yellow){
            case (2):{
                contract.set_cargo("Руда железная (ПВ)");
                switch (blue){
                    case (2):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (3):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (4):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (5):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (6):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (7):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (8):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (9):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (10):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (11):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}
                    case (12):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(320000); break;}

                }
                break;
            }
            case (3):{
                contract.set_cargo("Строительные грузы (ПВ)");
                switch (blue){
                    case (2):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(1500000); break;}
                    case (3):{contract.set_destination("Восточно-Сибирская  ж.д."); contract.set_cost(740000); break;}
                    case (4):{contract.set_destination("Красноярская ж.д."); contract.set_cost(420000); break;}
                    case (5):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(240000); break;}
                    case (6):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(240000); break;}
                    case (7):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(240000); break;}
                    case (8):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(240000); break;}
                    case (9):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(240000); break;}
                    case (10):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(240000); break;}
                    case (11):{contract.set_destination("Забайкальская ж.д."); contract.set_cost(940000); break;}
                    case (12):{contract.set_destination("Свердловская ж.д."); contract.set_cost(660000); break;}
                }
                break;
            }
            case (4):{
                contract.set_cargo("Кокс (ПВ)");
                switch (blue){
                    case (2):{contract.set_destination("Свердловская ж.д."); contract.set_cost(800000); break;}
                    case (3):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(300000); break;}
                    case (4):{contract.set_destination("Украина"); contract.set_cost(1380000); break;}
                    case (5):{contract.set_destination("Московская ж.д."); contract.set_cost(1240000); break;}
                    case (6):{contract.set_destination("Московская ж.д."); contract.set_cost(1240000); break;}
                    case (7):{contract.set_destination("Юго-Восточная ж.д."); contract.set_cost(1260000); break;}
                    case (8):{contract.set_destination("Юго-Восточная ж.д."); contract.set_cost(1260000); break;}
                    case (9):{contract.set_destination("Юго-Восточная ж.д."); contract.set_cost(1260000); break;}
                    case (10):{contract.set_destination("Средняя Азия"); contract.set_cost(1100000); break;}
                    case (11):{contract.set_destination("Южно-Уральская ж.д."); contract.set_cost(760000); break;}
                    case (12):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(1820000); break;}
                }
                break;
            }
            case (5):{
                contract.set_cargo("Лес (ПЛ)");
                switch (blue){
                    case (2):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(280000); break;}
                    case (3):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(280000); break;}
                    case (4):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(280000); break;}
                    case (5):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(280000); break;}
                    case (6):{contract.set_destination("Средняя Азия"); contract.set_cost(1600000); break;}
                    case (7):{contract.set_destination("Средняя Азия"); contract.set_cost(1600000); break;}
                    case (8):{contract.set_destination("Средняя Азия"); contract.set_cost(1600000); break;}
                    case (9):{contract.set_destination("Средняя Азия"); contract.set_cost(1600000); break;}
                    case (10):{contract.set_destination("Средняя Азия"); contract.set_cost(1600000); break;}
                    case (11):{contract.set_destination("Забайкальская ж.д."); contract.set_cost(1160000); break;}
                    case (12):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(1460000); break;}
                }
                break;
            }
            case (6):{
                contract.set_cargo("Цемент (КР)");
                switch (blue){
                    case (2):{contract.set_destination("Восточно-Сибирская  ж.д."); contract.set_cost(1140000); break;}
                    case (3):{contract.set_destination("Южно-Уральская ж.д."); contract.set_cost(960000); break;}
                    case (4):{contract.set_destination("Красноярская ж.д."); contract.set_cost(640000); break;}
                    case (5):{contract.set_destination("Свердловская ж.д."); contract.set_cost(1020000); break;}
                    case (6):{contract.set_destination("Свердловская ж.д."); contract.set_cost(1020000); break;}
                    case (7):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(380000); break;}
                    case (8):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(380000); break;}
                    case (9):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(380000); break;}
                    case (10):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(380000); break;}
                    case (11):{contract.set_destination("Средняя Азия"); contract.set_cost(1420000); break;}
                    case (12):{contract.set_destination("Северная ж.д."); contract.set_cost(1540000); break;}
                }
                break;
            }
            case (7):{
                contract.set_cargo("Каменный уголь (ПВ)");
                switch (blue){
                    case (2):{contract.set_destination("Беларусь"); contract.set_cost(1300000); break;}
                    case (3):{contract.set_destination("Северо-Кавказская ж.д."); contract.set_cost(1340000); break;}
                    case (4):{contract.set_destination("Украина"); contract.set_cost(1360000); break;}
                    case (5):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(300000); break;}
                    case (6):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(300000); break;}
                    case (7):{contract.set_destination("Октябрьская ж.д."); contract.set_cost(1300000); break;}
                    case (8):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(1580000); break;}
                    case (9):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(1580000); break;}
                    case (10):{contract.set_destination("Прибалтика"); contract.set_cost(1320000); break;}
                    case (11):{contract.set_destination("Южно-Уральская ж.д."); contract.set_cost(760000); break;}
                    case (12):{contract.set_destination("Юго-Восточная ж.д."); contract.set_cost(1260000); break;}
                }
                break;
            }
            case (8):{
                contract.set_cargo("Нефть (ЦС)");
                switch (blue){
                    case (2):{contract.set_destination("Восточно-Сибирская  ж.д."); contract.set_cost(1720000); break;}
                    case (3):{contract.set_destination("Средняя Азия"); contract.set_cost(2140000); break;}
                    case (4):{contract.set_destination("Красноярская ж.д."); contract.set_cost(880000); break;}
                    case (5):{contract.set_destination("Свердловская ж.д."); contract.set_cost(1480000); break;}
                    case (6):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(480000); break;}
                    case (7):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(480000); break;}
                    case (8):{contract.set_destination("Октябрьская ж.д."); contract.set_cost(3020000); break;}
                    case (9):{contract.set_destination("Октябрьская ж.д."); contract.set_cost(3020000); break;}
                    case (10):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(3700000); break;}
                    case (11):{contract.set_destination("Северо-Кавказская ж.д."); contract.set_cost(3320000); break;}
                    case (12):{contract.set_destination("Южно-Уральская ж.д."); contract.set_cost(1400000); break;}
                }
                break;
            }
            case (9):{
                contract.set_cargo("Грузы в контейнерах (ПЛ)");
                switch (blue){
                    case (2):{contract.set_destination("Куйбышевская ж.д."); contract.set_cost(1500000); break;}
                    case (3):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(420000); break;}
                    case (4):{contract.set_destination("Октябрьская ж.д."); contract.set_cost(2080000); break;}
                    case (5):{contract.set_destination("Восточно-Сибирская  ж.д."); contract.set_cost(1220000); break;}
                    case (6):{contract.set_destination("Забайкальская ж.д."); contract.set_cost(1880000); break;}
                    case (7):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(3180000); break;}
                    case (8):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(3180000); break;}
                    case (9):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(3180000); break;}
                    case (10):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(3180000); break;}
                    case (11):{contract.set_destination("Якутия"); contract.set_cost(2260000); break;}
                    case (12):{contract.set_destination("Северо-Кавказская ж.д."); contract.set_cost(2260000); break;}
                }
                break;
            }
            case (10):{
                contract.set_cargo("Зерно (КР)");
                switch (blue){
                    case (2):{contract.set_destination("Забайкальская ж.д."); contract.set_cost(1740000); break;}
                    case (3):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(420000); break;}
                    case (4):{contract.set_destination("Прибалтика"); contract.set_cost(1900000); break;}
                    case (5):{contract.set_destination("Калининградская ж.д."); contract.set_cost(3060000); break;}
                    case (6):{contract.set_destination("Восточно-Сибирская  ж.д."); contract.set_cost(1360000); break;}
                    case (7):{contract.set_destination("Октябрьская ж.д."); contract.set_cost(1840000); break;}
                    case (8):{contract.set_destination("Северо-Кавказская ж.д."); contract.set_cost(1940000); break;}
                    case (9):{contract.set_destination("Северо-Кавказская ж.д."); contract.set_cost(1940000); break;}
                    case (10):{contract.set_destination("Северо-Кавказская ж.д."); contract.set_cost(1940000); break;}
                    case (11):{contract.set_destination("Свердловская ж.д."); contract.set_cost(1200000); break;}
                    case (12):{contract.set_destination("Беларусь"); contract.set_cost(1860000); break;}
                }
                break;
            }
            case (11):{
                contract.set_cargo("Химикаты (ЦС)");
                switch (blue){
                    case (2):{contract.set_destination("Красноярская ж.д."); contract.set_cost(1400000); break;}
                    case (3):{contract.set_destination("Горьковская ж.д."); contract.set_cost(3660000); break;}
                    case (4):{contract.set_destination("Куйбышевская ж.д."); contract.set_cost(3300000); break;}
                    case (5):{contract.set_destination("Октябрьская ж.д."); contract.set_cost(4660000); break;}
                    case (6):{contract.set_destination("Октябрьская ж.д."); contract.set_cost(4660000); break;}
                    case (7):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(780000); break;}
                    case (8):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(780000); break;}
                    case (9):{contract.set_destination("Восточно-Сибирская  ж.д."); contract.set_cost(2660000); break;}
                    case (10):{contract.set_destination("Свердловская ж.д."); contract.set_cost(2320000); break;}
                    case (11):{contract.set_destination("Средняя Азия"); contract.set_cost(3720000); break;}
                    case (12):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(7260000); break;}
                }
                break;
            }
            case (12):{
                contract.set_cargo("Чёрные металлы (ПВ)");
                switch (blue){
                    case (2):{contract.set_destination("Свердловская ж.д."); contract.set_cost(1520000); break;}
                    case (3):{contract.set_destination("Красноярская ж.д."); contract.set_cost(940000); break;}
                    case (4):{contract.set_destination("Восточно-Сибирская  ж.д."); contract.set_cost(1720000); break;}
                    case (5):{contract.set_destination("Западно-Сибирская ж.д."); contract.set_cost(560000); break;}
                    case (6):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(2680000); break;}
                    case (7):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(2680000); break;}
                    case (8):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(2680000); break;}
                    case (9):{contract.set_destination("Дальневосточная ж.д."); contract.set_cost(2680000); break;}
                    case (10):{contract.set_destination("Средняя Азия"); contract.set_cost(2440000); break;}
                    case (11):{contract.set_destination("Московская ж.д."); contract.set_cost(2600000); break;}
                    case (12):{contract.set_destination("Северо-Кавказская ж.д."); contract.set_cost(3120000); break;}
                }
                break;
            }
        }
        return contract;
    }
}
