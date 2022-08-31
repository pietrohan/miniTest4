package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeToFile(String path, List<Hotel> hotels) {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Hotel h: hotels){
                bw.write(h.getIdRoom()+","+h.getBoardingDay()+","+h.getKindOfRoom()+","+h.getPrice());
                if(h.getClient().getName() != null) {
                    bw.write("," + h.getClient().getName()+","+h.getClient().getAge()+","+h.getClient().getIdCard());
                }
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Hotel> readDatatFromFile(String path){
        ArrayList<Hotel> hotels = new ArrayList<>();
        try{
            FileReader fw = new FileReader(path);
            BufferedReader br = new BufferedReader(fw);

            String line="";
            while(true) {
                line = br.readLine();
                if (line == null)
                    break;
                String[] text = line.split(",");
                int idRoom = Integer.parseInt(text[0]);
                int boardingDay = Integer.parseInt(text[1]);
                String  kindOfRoom = text[2];
                double price = Double.parseDouble(text[3]);
                if (text.length == 4){
                    Hotel hotel = new Hotel(idRoom,boardingDay,kindOfRoom,price);
                    hotels.add(hotel);
                }else {
                    String name = text[4];
                    int age = Integer.parseInt(text[5]);
                    String cMND = text[6];
                    Hotel hotel = new Hotel(idRoom,boardingDay,kindOfRoom,price,name,age,cMND);
                    hotels.add(hotel);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return hotels;
    }
}
