package view;

import controller.ManagerHotel;
import model.Client;
import model.Hotel;
import model.ReadAndWriteFile;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ManagerHotel listRoom= new ManagerHotel();

        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("------Menu-------");
            System.out.println("1. thêm khách hàng: \n" +
                    "2. Hiển thị thông tin khách hàng: \n" +
                    "3. Xóa thông tin khách hàng theo tên: \n" +
                    "4. Tính số tiền phòng khi khách trả phòng: \n" +
                    "5. Tìm kiếm thông tin khách hàng dựa trên số phòng: \n" +
                    "0. thoát chương trình.");
            choice = sc.nextInt();
            switch (choice){
                // 1. thêm khách hàng.
                case 1:
  //int idRoom, int boardingDay, String kindOfRoom, double price, String clientImformation, String name, int age, String cMND    
                    System.out.println(" nhập số phòng: ");
                    int idRoom = sc.nextInt();
                    System.out.println(" nhập số ngày thuê phòng: ");
                    int boardingDay = sc.nextInt();
                    System.out.println(" nhập loại phòng(VIP, phòng đôi,khác): ");
                    String kindOfRoom = scanner.nextLine();
                    double price;
                    if (kindOfRoom.equals("VIP"))
                        price = 1000;
                    else if (kindOfRoom.equals("phòng đôi") ) {
                        price = 700;
                    }else
                        price =400;
                    System.out.println(" Nhập tên khách hàng: ");
                    String name = scanner.nextLine();
                    System.out.println(" nhập tuổi: ");
                    int age = scanner.nextInt();
                    System.out.println(" nhập số căn cước hoặc hộ chiếu khách hàng: ");
                    String idCard = sc1.nextLine();
                    Hotel hotel = new Hotel(idRoom,boardingDay,kindOfRoom,price,name,age,idCard);
                    listRoom.addClient(hotel);
                    break;
                case 2:
                    //2. Hiển thị thông tin khách hàng:
                    listRoom.inDanhSach();
                    break;
                case 3:
                    //3. Xóa thông tin khách hàng theo số phòng:
                    System.out.println("nhập tên khách hàng");
                    String name1 = sc1.nextLine();
                    listRoom.deleteClient(name1);
                   break;
                case 0:
                    ReadAndWriteFile.writeToFile("Client.txt",listRoom.getList());
            }
        }while (choice != 0);

    }
}
