package com.woafes.stu_economy.Activities;

import com.woafes.stu_economy.Models.Command;

public class CostCalculator {
    public static long Calculate(Command command) {
        long summ = 0;
        summ += (1 + 0.2*command.bl_met.get_value()) * 4500000;
        summ += (1 + 0.2*command.build.get_value()) * 500000;
        summ += (1 + 0.2*command.cement.get_value()) * 400000;
        summ += (1 + 0.2*command.chemical.get_value()) * 5000000;
        summ += (1 + 0.2*command.coal.get_value()) * 5500000;
        summ += (1 + 0.2*command.coke.get_value()) * 1000000;
        summ += (1 + 0.2*command.forest.get_value()) * 600000;
        summ += (1 + 0.2*command.iron.get_value()) * 700000;
        summ += (1 + 0.2*command.oil.get_value()) * 2500000;
        summ += (1 + 0.2*command.seed.get_value()) * 2000000;
        summ += (1 + 0.2*command.container.get_value()) * 3000000;
        summ += (1 + 0.2*command.ports_dv.get_value()) * 5000000;
        summ += (1 + 0.2*command.ports_okt.get_value()) * 4000000;
        summ += (1 + 0.2*command.ports_sev.get_value()) * 1000000;


        if (command.is_maxPoints()){
            summ += command.points.get_value() * 1000000 * 1.5;
        }
        else {
            summ += command.points.get_value() * 1000000;
        }



        if (command.is_maxCarriage()){
            summ += command.cis.get_value() * 1600000 * 1.2;
            summ += command.pv.get_value() * 1200000 * 1.2;
            summ += command.kr.get_value() * 1400000 * 1.2;
            summ += command.pl.get_value() * 1000000 * 1.2;
        }
        else {
            summ += command.cis.get_value() * 1600000;
            summ += command.pv.get_value() * 1200000;
            summ += command.kr.get_value() * 1400000;
            summ += command.pl.get_value() * 1000000;
        }


        return summ;
    }
}
