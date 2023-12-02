package com.bpi_111.stu_economy;

import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    public static HashMap<String, Object> _c1 = new HashMap<>();


    public static HashMap<String, Object> _c2 = new HashMap<>();
    public static HashMap<String, Object> _c3 = new HashMap<>();
    public static HashMap<String, Object> _c4 = new HashMap<>();
    public static int _year = 1;
    public static boolean _cubes = true;
    public static int _easter = -666; // Исходное -4
    public static int _move = 1; // Не сохраняется
    public static int _leader = 0;
    public static int _new_comm_inp = 1;

    static {
        _c1.put("name", "");
        _c1.put("points", 0);
        _c1.put("money", 4000000);
        _c1.put("vict_p", 0);
        _c1.put("pv", 20);
        _c1.put("cis", 0);
        _c1.put("pl", 0);
        _c1.put("kr", 0);
        _c1.put("ports_okt", 0);
        _c1.put("ports_sk", 0);
        _c1.put("ports_dv", 0);
        _c1.put("kam_ug", 0);
        _c1.put("koks", 0);
        _c1.put("oil", 0);
        _c1.put("iron", 0);
        _c1.put("bl_met", 0);
        _c1.put("str_gru", 0);
        _c1.put("him_soda", 0);
        _c1.put("cement", 0);
        _c1.put("les", 0);
        _c1.put("seed", 0);
        _c1.put("kont", 0);

        _c2.put("name", "");
        _c2.put("points", 0);
        _c2.put("money", 4000000);
        _c2.put("vict_p", 0);
        _c2.put("pv", 20);
        _c2.put("cis", 0);
        _c2.put("pl", 0);
        _c2.put("kr", 0);
        _c2.put("ports_okt", 0);
        _c2.put("ports_sk", 0);
        _c2.put("ports_dv", 0);
        _c2.put("kam_ug", 0);
        _c2.put("koks", 0);
        _c2.put("oil", 0);
        _c2.put("iron", 0);
        _c2.put("bl_met", 0);
        _c2.put("str_gru", 0);
        _c2.put("him_soda", 0);
        _c2.put("cement", 0);
        _c2.put("les", 0);
        _c2.put("seed", 0);
        _c2.put("kont", 0);

        _c3.put("name", "");
        _c3.put("points", 0);
        _c3.put("money", 4000000);
        _c3.put("vict_p", 0);
        _c3.put("pv", 20);
        _c3.put("cis", 0);
        _c3.put("pl", 0);
        _c3.put("kr", 0);
        _c3.put("ports_okt", 0);
        _c3.put("ports_sk", 0);
        _c3.put("ports_dv", 0);
        _c3.put("kam_ug", 0);
        _c3.put("koks", 0);
        _c3.put("oil", 0);
        _c3.put("iron", 0);
        _c3.put("bl_met", 0);
        _c3.put("str_gru", 0);
        _c3.put("him_soda", 0);
        _c3.put("cement", 0);
        _c3.put("les", 0);
        _c3.put("seed", 0);
        _c3.put("kont", 0);

        _c4.put("name", "");
        _c4.put("points", 0);
        _c4.put("money", 4000000);
        _c4.put("vict_p", 0);
        _c4.put("pv", 20);
        _c4.put("cis", 0);
        _c4.put("pl", 0);
        _c4.put("kr", 0);
        _c4.put("ports_okt", 0);
        _c4.put("ports_sk", 0);
        _c4.put("ports_dv", 0);
        _c4.put("kam_ug", 0);
        _c4.put("koks", 0);
        _c4.put("oil", 0);
        _c4.put("iron", 0);
        _c4.put("bl_met", 0);
        _c4.put("str_gru", 0);
        _c4.put("him_soda", 0);
        _c4.put("cement", 0);
        _c4.put("les", 0);
        _c4.put("seed", 0);
        _c4.put("kont", 0);

    }


    public static void setDefault(){
        _year = 1;
        _move = 1;
        _leader = 0;

        _c1.put("name", "");
        _c1.put("points", 0);
        _c1.put("money", 4000000);
        _c1.put("vict_p", 0);
        _c1.put("pv", 20);
        _c1.put("cis", 0);
        _c1.put("pl", 0);
        _c1.put("kr", 0);
        _c1.put("ports_okt", 0);
        _c1.put("ports_sk", 0);
        _c1.put("ports_dv", 0);
        _c1.put("kam_ug", 0);
        _c1.put("koks", 0);
        _c1.put("oil", 0);
        _c1.put("iron", 0);
        _c1.put("bl_met", 0);
        _c1.put("str_gru", 0);
        _c1.put("him_soda", 0);
        _c1.put("cement", 0);
        _c1.put("les", 0);
        _c1.put("seed", 0);
        _c1.put("kont", 0);

        _c2.put("name", "");
        _c2.put("points", 0);
        _c2.put("money", 4000000);
        _c2.put("vict_p", 0);
        _c2.put("pv", 20);
        _c2.put("cis", 0);
        _c2.put("pl", 0);
        _c2.put("kr", 0);
        _c2.put("ports_okt", 0);
        _c2.put("ports_sk", 0);
        _c2.put("ports_dv", 0);
        _c2.put("kam_ug", 0);
        _c2.put("koks", 0);
        _c2.put("oil", 0);
        _c2.put("iron", 0);
        _c2.put("bl_met", 0);
        _c2.put("str_gru", 0);
        _c2.put("him_soda", 0);
        _c2.put("cement", 0);
        _c2.put("les", 0);
        _c2.put("seed", 0);
        _c2.put("kont", 0);

        _c3.put("name", "");
        _c3.put("points", 0);
        _c3.put("money", 4000000);
        _c3.put("vict_p", 0);
        _c3.put("pv", 20);
        _c3.put("cis", 0);
        _c3.put("pl", 0);
        _c3.put("kr", 0);
        _c3.put("ports_okt", 0);
        _c3.put("ports_sk", 0);
        _c3.put("ports_dv", 0);
        _c3.put("kam_ug", 0);
        _c3.put("koks", 0);
        _c3.put("oil", 0);
        _c3.put("iron", 0);
        _c3.put("bl_met", 0);
        _c3.put("str_gru", 0);
        _c3.put("him_soda", 0);
        _c3.put("cement", 0);
        _c3.put("les", 0);
        _c3.put("seed", 0);
        _c3.put("kont", 0);

        _c4.put("name", "");
        _c4.put("points", 0);
        _c4.put("money", 4000000);
        _c4.put("vict_p", 0);
        _c4.put("pv", 20);
        _c4.put("cis", 0);
        _c4.put("pl", 0);
        _c4.put("kr", 0);
        _c4.put("ports_okt", 0);
        _c4.put("ports_sk", 0);
        _c4.put("ports_dv", 0);
        _c4.put("kam_ug", 0);
        _c4.put("koks", 0);
        _c4.put("oil", 0);
        _c4.put("iron", 0);
        _c4.put("bl_met", 0);
        _c4.put("str_gru", 0);
        _c4.put("him_soda", 0);
        _c4.put("cement", 0);
        _c4.put("les", 0);
        _c4.put("seed", 0);
        _c4.put("kont", 0);
    }


    public static boolean load(){
        File fl = new File("/data/data/com.bpi_111.stu_economy/files/data");
        if (!fl.exists()){
            return false;
        }

        _cubes = true;

        String s = "";

        try(FileInputStream fin=new FileInputStream("/data/data/com.bpi_111.stu_economy/files/data");
        InputStreamReader isr = new InputStreamReader(fin, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(isr))
        {
            int i;
            while((i=reader.read())!=-1){
                s +=(char)i;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        String[] sp = s.split("\n");
        _move = Integer.parseInt(sp[0].split("&")[0]);
        _year = Integer.parseInt(sp[0].split("&")[1]);

        _c1.put("name", sp[1].split("&")[0].toString());
        _c1.put("points", Integer.parseInt(sp[1].split("&")[1]));
        _c1.put("money", Integer.parseInt(sp[1].split("&")[2]));
        _c1.put("vict_p", Integer.parseInt(sp[1].split("&")[3]));
        _c1.put("pv", Integer.parseInt(sp[1].split("&")[4]));
        _c1.put("cis", Integer.parseInt(sp[1].split("&")[5]));
        _c1.put("pl", Integer.parseInt(sp[1].split("&")[6]));
        _c1.put("kr", Integer.parseInt(sp[1].split("&")[7]));
        _c1.put("ports_okt", Integer.parseInt(sp[1].split("&")[8]));
        _c1.put("ports_sk", Integer.parseInt(sp[1].split("&")[9]));
        _c1.put("ports_dv", Integer.parseInt(sp[1].split("&")[10]));
        _c1.put("kam_ug", Integer.parseInt(sp[1].split("&")[11]));
        _c1.put("koks", Integer.parseInt(sp[1].split("&")[12]));
        _c1.put("oil", Integer.parseInt(sp[1].split("&")[13]));
        _c1.put("iron", Integer.parseInt(sp[1].split("&")[14]));
        _c1.put("bl_met", Integer.parseInt(sp[1].split("&")[15]));
        _c1.put("str_gru", Integer.parseInt(sp[1].split("&")[16]));
        _c1.put("him_soda", Integer.parseInt(sp[1].split("&")[17]));
        _c1.put("cement", Integer.parseInt(sp[1].split("&")[18]));
        _c1.put("les", Integer.parseInt(sp[1].split("&")[19]));
        _c1.put("seed", Integer.parseInt(sp[1].split("&")[20]));
        _c1.put("kont", Integer.parseInt(sp[1].split("&")[21]));

        _c2.put("name", sp[2].split("&")[0].toString());
        _c2.put("points", Integer.parseInt(sp[2].split("&")[1]));
        _c2.put("money", Integer.parseInt(sp[2].split("&")[2]));
        _c2.put("vict_p", Integer.parseInt(sp[2].split("&")[3]));
        _c2.put("pv", Integer.parseInt(sp[2].split("&")[4]));
        _c2.put("cis", Integer.parseInt(sp[2].split("&")[5]));
        _c2.put("pl", Integer.parseInt(sp[2].split("&")[6]));
        _c2.put("kr", Integer.parseInt(sp[2].split("&")[7]));
        _c2.put("ports_okt", Integer.parseInt(sp[2].split("&")[8]));
        _c2.put("ports_sk", Integer.parseInt(sp[2].split("&")[9]));
        _c2.put("ports_dv", Integer.parseInt(sp[2].split("&")[10]));
        _c2.put("kam_ug", Integer.parseInt(sp[2].split("&")[11]));
        _c2.put("koks", Integer.parseInt(sp[2].split("&")[12]));
        _c2.put("oil", Integer.parseInt(sp[2].split("&")[13]));
        _c2.put("iron", Integer.parseInt(sp[2].split("&")[14]));
        _c2.put("bl_met", Integer.parseInt(sp[2].split("&")[15]));
        _c2.put("str_gru", Integer.parseInt(sp[2].split("&")[16]));
        _c2.put("him_soda", Integer.parseInt(sp[2].split("&")[17]));
        _c2.put("cement", Integer.parseInt(sp[2].split("&")[18]));
        _c2.put("les", Integer.parseInt(sp[2].split("&")[19]));
        _c2.put("seed", Integer.parseInt(sp[2].split("&")[20]));
        _c2.put("kont", Integer.parseInt(sp[2].split("&")[21]));

        _c3.put("name", sp[3].split("&")[0].toString());
        _c3.put("points", Integer.parseInt(sp[3].split("&")[1]));
        _c3.put("money", Integer.parseInt(sp[3].split("&")[2]));
        _c3.put("vict_p", Integer.parseInt(sp[3].split("&")[3]));
        _c3.put("pv", Integer.parseInt(sp[3].split("&")[4]));
        _c3.put("cis", Integer.parseInt(sp[3].split("&")[5]));
        _c3.put("pl", Integer.parseInt(sp[3].split("&")[6]));
        _c3.put("kr", Integer.parseInt(sp[3].split("&")[7]));
        _c3.put("ports_okt", Integer.parseInt(sp[3].split("&")[8]));
        _c3.put("ports_sk", Integer.parseInt(sp[3].split("&")[9]));
        _c3.put("ports_dv", Integer.parseInt(sp[3].split("&")[10]));
        _c3.put("kam_ug", Integer.parseInt(sp[3].split("&")[11]));
        _c3.put("koks", Integer.parseInt(sp[3].split("&")[12]));
        _c3.put("oil", Integer.parseInt(sp[3].split("&")[13]));
        _c3.put("iron", Integer.parseInt(sp[3].split("&")[14]));
        _c3.put("bl_met", Integer.parseInt(sp[3].split("&")[15]));
        _c3.put("str_gru", Integer.parseInt(sp[3].split("&")[16]));
        _c3.put("him_soda", Integer.parseInt(sp[3].split("&")[17]));
        _c3.put("cement", Integer.parseInt(sp[3].split("&")[18]));
        _c3.put("les", Integer.parseInt(sp[3].split("&")[19]));
        _c3.put("seed", Integer.parseInt(sp[3].split("&")[20]));
        _c3.put("kont", Integer.parseInt(sp[3].split("&")[21]));

        _c4.put("name", sp[4].split("&")[0].toString());
        _c4.put("points", Integer.parseInt(sp[4].split("&")[1]));
        _c4.put("money", Integer.parseInt(sp[4].split("&")[2]));
        _c4.put("vict_p", Integer.parseInt(sp[4].split("&")[3]));
        _c4.put("pv", Integer.parseInt(sp[4].split("&")[4]));
        _c4.put("cis", Integer.parseInt(sp[4].split("&")[5]));
        _c4.put("pl", Integer.parseInt(sp[4].split("&")[6]));
        _c4.put("kr", Integer.parseInt(sp[4].split("&")[7]));
        _c4.put("ports_okt", Integer.parseInt(sp[4].split("&")[8]));
        _c4.put("ports_sk", Integer.parseInt(sp[4].split("&")[9]));
        _c4.put("ports_dv", Integer.parseInt(sp[4].split("&")[10]));
        _c4.put("kam_ug", Integer.parseInt(sp[4].split("&")[11]));
        _c4.put("koks", Integer.parseInt(sp[4].split("&")[12]));
        _c4.put("oil", Integer.parseInt(sp[4].split("&")[13]));
        _c4.put("iron", Integer.parseInt(sp[4].split("&")[14]));
        _c4.put("bl_met", Integer.parseInt(sp[4].split("&")[15]));
        _c4.put("str_gru", Integer.parseInt(sp[4].split("&")[16]));
        _c4.put("him_soda", Integer.parseInt(sp[4].split("&")[17]));
        _c4.put("cement", Integer.parseInt(sp[4].split("&")[18]));
        _c4.put("les", Integer.parseInt(sp[4].split("&")[19]));
        _c4.put("seed", Integer.parseInt(sp[4].split("&")[20]));
        _c4.put("kont", Integer.parseInt(sp[4].split("&")[21]));

        return true;
    }


    public static void save(){

        String text = String.format((Integer) _move + "&" + (Integer) _year + "\n");

        text += String.format((String) _c1.get("name").toString() + "&" +
                (Integer) Integer.parseInt(_c1.get("points").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("money").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("vict_p").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("pv").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("cis").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("pl").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("kr").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("ports_okt").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("ports_sk").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("ports_dv").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("kam_ug").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("koks").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("oil").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("iron").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("bl_met").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("str_gru").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("him_soda").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("cement").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("les").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("seed").toString()) + "&" +
                (Integer) Integer.parseInt(_c1.get("kont").toString()) +
                "\n");

        text += String.format((String) _c2.get("name").toString() + "&" +
                (Integer) Integer.parseInt(_c2.get("points").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("money").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("vict_p").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("pv").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("cis").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("pl").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("kr").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("ports_okt").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("ports_sk").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("ports_dv").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("kam_ug").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("koks").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("oil").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("iron").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("bl_met").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("str_gru").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("him_soda").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("cement").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("les").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("seed").toString()) + "&" +
                (Integer) Integer.parseInt(_c2.get("kont").toString()) +
                "\n");

        text += String.format((String) _c3.get("name").toString() + "&" +
                (Integer) Integer.parseInt(_c3.get("points").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("money").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("vict_p").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("pv").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("cis").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("pl").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("kr").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("ports_okt").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("ports_sk").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("ports_dv").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("kam_ug").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("koks").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("oil").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("iron").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("bl_met").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("str_gru").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("him_soda").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("cement").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("les").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("seed").toString()) + "&" +
                (Integer) Integer.parseInt(_c3.get("kont").toString()) +
                "\n");

        text += String.format((String) _c4.get("name").toString() + "&" +
                (Integer) Integer.parseInt(_c4.get("points").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("money").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("vict_p").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("pv").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("cis").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("pl").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("kr").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("ports_okt").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("ports_sk").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("ports_dv").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("kam_ug").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("koks").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("oil").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("iron").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("bl_met").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("str_gru").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("him_soda").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("cement").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("les").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("seed").toString()) + "&" +
                (Integer) Integer.parseInt(_c4.get("kont").toString()) +
                "\n");

        try(FileOutputStream fos = new FileOutputStream("/data/data/com.bpi_111.stu_economy/files/data"))
        {
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
