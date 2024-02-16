package com.woafes.stu_economy.Repository;

import com.woafes.stu_economy.Models.Command;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class DataBase {
    private static DataBase instance;
    private DataBase(){
    }
    public static DataBase getInstance(){
        if (instance == null){
            instance = new DataBase();
        }
        return instance;
    }

    public void savePlayer(Command command) throws JSONException {
        JSONObject playerData = new JSONObject();

        playerData.put("name", command.get_name());
        playerData.put("_is_maxCarriage", command.is_maxCarriage());
        playerData.put("_is_maxPoints", command.is_maxPoints());
        playerData.put("money", command.money.get_value());
        playerData.put("points", command.points.get_value()); // Победные очки
        playerData.put("pv", command.pv.get_value()); // Полувагоны
        playerData.put("cis", command.cis.get_value()); // Цистерны
        playerData.put("pl", command.pl.get_value()); // Платформы
        playerData.put("kr", command.kr.get_value()); // Крытые
        playerData.put("ports_okt", command.ports_okt.get_value()); // Порты Октябрьской
        playerData.put("ports_sev", command.ports_sev.get_value()); // Порты Северо-Кавказской
        playerData.put("ports_dv", command.ports_dv.get_value()); // Порты Дальневосточной
        playerData.put("coal", command.coal.get_value());
        playerData.put("oil", command.oil.get_value());
        playerData.put("coke", command.coke.get_value()); // Кокс
        playerData.put("bl_met", command.bl_met.get_value()); // Чёрные металлы
        playerData.put("iron", command.iron.get_value());
        playerData.put("build", command.build.get_value()); // Строительныйе
        playerData.put("cement", command.cement.get_value());
        playerData.put("forest", command.forest.get_value());
        playerData.put("chemical", command.chemical.get_value());
        playerData.put("seed", command.seed.get_value());
        playerData.put("container", command.container.get_value());

        String playerDataString = playerData.toString(1);

        try(FileOutputStream fos = new FileOutputStream("/data/data/com.daferstdi.testviewactivity/files/player"))
        {
            byte[] buffer = playerDataString.getBytes();

            fos.write(buffer, 0, buffer.length);
            Log.e("AAA", "The file has been written");
            //System.out.println("The file has been written");
        }
        catch(IOException ex){
            Log.e("AAA", ex.getMessage());
            //System.out.println(ex.getMessage());
        }
    }


    public Command getPlayer(){
        Command command = new Command("");
        String json = "";
        JSONObject playerData;
        try (FileInputStream fin = new FileInputStream("/data/data/com.daferstdi.testviewactivity/files/player");
             InputStreamReader isr = new InputStreamReader(fin, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr)) {
            int i;
            while ((i = reader.read()) != -1) {
                json += (char) i;
            }

            playerData = new JSONObject(json);

            command.set_name(playerData.getString("name"));
            command.set_is_maxCarriage(playerData.getBoolean("_is_maxCarriage"));
            command.set_is_maxPoints(playerData.getBoolean("_is_maxPoints"));
            command.money.set_value(playerData.getInt("money"));
            command.points.set_value(playerData.getInt("points"));
            command.pv.set_value(playerData.getInt("pv"));
            command.cis.set_value(playerData.getInt("cis"));
            command.pl.set_value(playerData.getInt("pl"));
            command.kr.set_value(playerData.getInt("kr"));
            command.ports_okt.set_value(playerData.getInt("ports_okt"));
            command.ports_sev.set_value(playerData.getInt("ports_sev"));
            command.ports_dv.set_value(playerData.getInt("ports_dv"));
            command.coal.set_value(playerData.getInt("coal"));
            command.oil.set_value(playerData.getInt("oil"));
            command.coke.set_value(playerData.getInt("coke"));
            command.bl_met.set_value(playerData.getInt("bl_met"));
            command.iron.set_value(playerData.getInt("iron"));
            command.build.set_value(playerData.getInt("build"));
            command.cement.set_value(playerData.getInt("cement"));
            command.forest.set_value(playerData.getInt("forest"));
            command.chemical.set_value(playerData.getInt("chemical"));
            command.seed.set_value(playerData.getInt("seed"));
            command.container.set_value(playerData.getInt("container"));


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return command;
    }

}
