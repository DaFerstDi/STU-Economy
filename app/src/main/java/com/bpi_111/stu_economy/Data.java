package com.bpi_111.stu_economy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    public static HashMap<String, Object> _c1 = new HashMap<>();


    public static HashMap<String, Object> _c2 = new HashMap<>();
    public static HashMap<String, Object> _c3 = new HashMap<>();
    public static HashMap<String, Object> _c4 = new HashMap<>();
    public static String _event = "";
    public static int _year = 0;
    public static int _new_comm_inp = 1;
    public static int _easter = -4;
    public static int _move = 1; // Не сохраняется
    public static final int OKT_P = 5;
    public static final int SEV_K_P = 5;
    public static final int DAL_V_p = 5;

    static {
        _c1.put("name", "");
        _c1.put("points", 0);
        _c1.put("money", 4000000);
        _c1.put("pv", 20);
        _c1.put("cis", 0);
        _c1.put("pl", 0);
        _c1.put("kr", 0);
        _c1.put("OKT_P", 0);
        _c1.put("SEV_K_P", 0);
        _c1.put("DAL_V_p", 0);

        _c2.put("name", "");
        _c2.put("points", 0);
        _c2.put("money", 4000000);
        _c2.put("pv", 20);
        _c2.put("cis", 0);
        _c2.put("pl", 0);
        _c2.put("kr", 0);

        _c3.put("name", "");
        _c3.put("points", 0);
        _c3.put("money", 4000000);
        _c3.put("pv", 20);
        _c3.put("cis", 0);
        _c3.put("pl", 0);
        _c3.put("kr", 0);

        _c4.put("name", "");
        _c4.put("points", 0);
        _c4.put("money", 4000000);
        _c4.put("pv", 20);
        _c4.put("cis", 0);
        _c4.put("pl", 0);
        _c4.put("kr", 0);

    }


    public static void setDefault(){
        _event = "";
        _year = 0;
        _move = 1;

        _c1.put("name", "");
        _c1.put("points", 0);
        _c1.put("money", 4000000);
        _c1.put("pv", 20);
        _c1.put("cis", 0);
        _c1.put("pl", 0);
        _c1.put("kr", 0);

        _c2.put("name", "");
        _c2.put("points", 0);
        _c2.put("money", 4000000);
        _c2.put("pv", 20);
        _c2.put("cis", 0);
        _c2.put("pl", 0);
        _c2.put("kr", 0);

        _c3.put("name", "");
        _c3.put("points", 0);
        _c3.put("money", 4000000);
        _c3.put("pv", 20);
        _c3.put("cis", 0);
        _c3.put("pl", 0);
        _c3.put("kr", 0);

        _c4.put("name", "");
        _c4.put("points", 0);
        _c4.put("money", 4000000);
        _c4.put("pv", 20);
        _c4.put("cis", 0);
        _c4.put("pl", 0);
        _c4.put("kr", 0);
    }


    public static void load(){

        String s = "";

        try(FileInputStream fin=new FileInputStream("/data/data/com.bpi_111.stu_economy/files/data"))
        {
            int i;
            while((i=fin.read())!=-1){
                s +=(char)i;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        String[] sp = s.split("\n");
        _event = sp[0].split("&")[0].toString();
        _year = Integer.parseInt(sp[0].split("&")[1]);

        _c1.put("name", sp[1].split("&")[0].toString());
        _c1.put("points", Integer.parseInt(sp[1].split("&")[1]));
        _c1.put("money", Integer.parseInt(sp[1].split("&")[2]));
        _c1.put("pv", Integer.parseInt(sp[1].split("&")[3]));
        _c1.put("cis", Integer.parseInt(sp[1].split("&")[4]));
        _c1.put("pl", Integer.parseInt(sp[1].split("&")[5]));
        _c1.put("kr", Integer.parseInt(sp[1].split("&")[6]));

        _c2.put("name", sp[2].split("&")[0].toString());
        _c2.put("points", Integer.parseInt(sp[2].split("&")[1]));
        _c2.put("money", Integer.parseInt(sp[2].split("&")[2]));
        _c2.put("pv", Integer.parseInt(sp[2].split("&")[3]));
        _c2.put("cis", Integer.parseInt(sp[2].split("&")[4]));
        _c2.put("pl", Integer.parseInt(sp[2].split("&")[5]));
        _c2.put("kr", Integer.parseInt(sp[2].split("&")[6]));

        _c3.put("name", sp[3].split("&")[0].toString());
        _c3.put("points", Integer.parseInt(sp[3].split("&")[1]));
        _c3.put("money", Integer.parseInt(sp[3].split("&")[2]));
        _c3.put("pv", Integer.parseInt(sp[3].split("&")[3]));
        _c3.put("cis", Integer.parseInt(sp[3].split("&")[4]));
        _c3.put("pl", Integer.parseInt(sp[3].split("&")[5]));
        _c3.put("kr", Integer.parseInt(sp[3].split("&")[6]));

        _c4.put("name", sp[4].split("&")[0].toString());
        _c4.put("points", Integer.parseInt(sp[4].split("&")[1]));
        _c4.put("money", Integer.parseInt(sp[4].split("&")[2]));
        _c4.put("pv", Integer.parseInt(sp[4].split("&")[3]));
        _c4.put("cis", Integer.parseInt(sp[4].split("&")[4]));
        _c4.put("pl", Integer.parseInt(sp[4].split("&")[5]));
        _c4.put("kr", Integer.parseInt(sp[4].split("&")[6]));
    }


    public static void save(){
        String text = String.format((String) _event + "&" + (Integer) _year + "\n");
        text += String.format((String) _c1.get("name") + "&" + (Integer) _c1.get("points")
                + "&" + (Integer) _c1.get("money") + "&" + (Integer) _c1.get("pv")
                + "&" + (Integer) _c1.get("cis") + "&" + (Integer) _c1.get("pl")
                + "&" + (Integer) _c1.get("kr")+"\n");
        text += String.format((String) _c2.get("name") + "&" + (Integer) _c2.get("points")
                + "&" + (Integer) _c2.get("money") + "&" + (Integer) _c2.get("pv")
                + "&" + (Integer) _c2.get("cis") + "&" + (Integer) _c2.get("pl")
                + "&" + (Integer) _c2.get("kr")+"\n");
        text += String.format((String) _c3.get("name") + "&" + (Integer) _c3.get("points")
                + "&" + (Integer) _c3.get("money") + "&" + (Integer) _c3.get("pv")
                + "&" + (Integer) _c3.get("cis") + "&" + (Integer) _c3.get("pl")
                + "&" + (Integer) _c3.get("kr")+"\n");
        text += String.format((String) _c4.get("name") + "&" + (Integer) _c4.get("points")
                + "&" + (Integer) _c4.get("money") + "&" + (Integer) _c4.get("pv")
                + "&" + (Integer) _c4.get("cis") + "&" + (Integer) _c4.get("pl")
                + "&" + (Integer) _c4.get("kr")+"\n");
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
