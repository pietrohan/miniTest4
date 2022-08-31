package controller;

import model.Client;
import model.Hotel;
import model.ReadAndWriteFile;

import java.io.Serializable;
import java.util.ArrayList;

public class ManagerHotel  {

    private ArrayList<Hotel> list = ReadAndWriteFile.readDatatFromFile("client.txt");

    public void setList(ArrayList<Hotel> list) {
        this.list = list;
    }
    public ArrayList<Hotel> getList() {
        return list;
    }

    public  ManagerHotel() {

    }

    public  ManagerHotel(ArrayList<Hotel> list) {
        this.list = list;
    }

    // kiểm tra xem phòng đã có người thuê chưa

    //1. thêm vào danh sách.
    public void addClient(Hotel c) {
        this.list.add(c);
    }

    public void inDanhSach() {
        for (Hotel cl : list) {
            System.out.println(cl);
        }
    }
    public void deleteClient(String name) {
        int check = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getClient().getName().equals(name)) {
                list.remove(i);
                check = 1;
            }
        }
        if(check == 0) System.out.println("Không có khách hàng này.");
    }
    public void search(int id){
        int check = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdRoom()==id) {
                System.out.println(list.get(i));
                check = 1;
            }
        }
        if(check == 0) System.out.println("Không có khách tại phòng này.");
    }
}
