package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main fileJson = new Main();
        fileJson.serializeUser();
    }

    public void serializeUser() throws IOException {
        //Select startDate and endDate
        Calendar calendar = new GregorianCalendar(2017, 0, 25);
        Calendar calendar1 = new GregorianCalendar(2018, 5, 15);

        Date startDate = calendar.getTime();     //Data startDate = Calendar.getInstance().getTime();
        Date endDate = calendar1.getTime();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String stringStartDate = dateFormat.format(startDate);
        String stringEndDate = dateFormat.format(endDate);

        //Get hashMap id
        HashMap<String, String> id = getStringHashMap();

        User user = new User("Title",
                stringStartDate,
                stringEndDate,
                "Description",
                id,
                new String[]{"keywords", "keywords1"},
                new String[]{"invites","invites1"},
                "inviteMessage",
                "project id");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // String json = gson.toJson(user);
        // System.out.println(json);
        Writer writer = Files.newBufferedWriter(Paths.get("src\\main\\resources\\user.json"));
        gson.toJson(user, writer);
        writer.close();
    }

    private HashMap<String, String> getStringHashMap() {
        HashMap<String, String> id = new HashMap<>();
        id.put("id", "string");
        id.put("name", "string");
        return id;
    }

    private void deserializeUser(){

    }
}
