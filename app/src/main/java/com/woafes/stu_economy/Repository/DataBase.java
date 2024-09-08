package com.woafes.stu_economy.Repository;

import com.woafes.stu_economy.Models.Command;
import com.woafes.stu_economy.Models.CommandGroup;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

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
        String playerDataString = commandToString(command);

        try(FileOutputStream fos = new FileOutputStream("/data/data/com.woafes.stu_economy/files/player"))
        {
            byte[] buffer = playerDataString.getBytes();

            fos.write(buffer, 0, buffer.length);
            Log.e("AAA", "The player file has been written");
        }
        catch(IOException ex){
            Log.e("AAA", ex.getMessage());
        }
    }

    public Command getPlayer(){
        String jsonStr = "";
        Command command = new Command("");
        try (FileInputStream fin = new FileInputStream("/data/data/com.woafes.stu_economy/files/player");
             InputStreamReader isr = new InputStreamReader(fin, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr)) {
            int i;
            while ((i = reader.read()) != -1) {
                jsonStr += (char) i;
            }

            command = stringToCommand(jsonStr);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        Log.e("AAA", "The player file has been read");
        return command;
    }

    public void saveCommands(CommandGroup commandGroup) throws JSONException{
        String commandDataString = "";
        commandDataString += commandToString(commandGroup.get_command1()) + "%";
        commandDataString += commandToString(commandGroup.get_command2()) + "%";
        commandDataString += commandToString(commandGroup.get_command3()) + "%";
        commandDataString += commandToString(commandGroup.get_command4());

        try(FileOutputStream fos = new FileOutputStream("/data/data/com.woafes.stu_economy/files/commands"))
        {
            byte[] buffer = commandDataString.getBytes();

            fos.write(buffer, 0, buffer.length);
            Log.e("AAA", "The command file has been written");
        }
        catch(IOException ex){
            Log.e("AAA", ex.getMessage());
        }
    }

    public CommandGroup getCommands(){
        String jsonStr = "";
        CommandGroup commandGroup = new CommandGroup();
        try (FileInputStream fin = new FileInputStream("/data/data/com.woafes.stu_economy/files/commands");
             InputStreamReader isr = new InputStreamReader(fin, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr)) {
            int i;
            while ((i = reader.read()) != -1) {
                jsonStr += (char) i;
            }
            String[] sddsd = jsonStr.split("%");
            commandGroup.set_command1(stringToCommand(jsonStr.split("%")[0]));
            commandGroup.set_command2(stringToCommand(jsonStr.split("%")[1]));
            commandGroup.set_command3(stringToCommand(jsonStr.split("%")[2]));
            commandGroup.set_command4(stringToCommand(jsonStr.split("%")[3]));
            commandGroup.set_lastSave(commandGroup.get_command1().get_lastSave());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        Log.e("AAA", "The command file has been read");
        return commandGroup;
    }


    private String commandToString(Command command) throws JSONException{
        JSONObject playerData = new JSONObject();
        Calendar cld = Calendar.getInstance();
        String month = ("0000" + (cld.get(Calendar.MONTH) + 1));
        month = month.substring(month.length() - 2);
        String day = ("0000" + cld.get(Calendar.DATE));
        day = day.substring(day.length() - 2);
        String hour = ("0000" + cld.get(Calendar.HOUR_OF_DAY));
        hour = hour.substring(hour.length() - 2);
        String minute = ("0000" + cld.get(Calendar.MINUTE));
        minute = minute.substring(minute.length() - 2);

        String date = day + "." + month + "." + cld.get(Calendar.YEAR) + " " + hour + ":" + minute;

        playerData.put("last_save", date);
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

        return playerData.toString(1);
    }

    private Command stringToCommand(String jsonStr) throws JSONException{
        JSONObject playerData;
        Command command = new Command("");
        playerData = new JSONObject(jsonStr);

        command.set_lastSave(playerData.getString("last_save"));
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
        return command;
    }

}
