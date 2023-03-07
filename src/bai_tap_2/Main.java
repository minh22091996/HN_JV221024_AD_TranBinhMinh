package bai_tap_2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int check = 0;
        Student sv = new Student();
       do{
           System.out.println("MENU :");
           System.out.println("*1. Nhập số sinh viên và nhập thông tin cho các sinh viên");
           System.out.println("*2. In thông tin các sinh viên đang quản lý");
           System.out.println("*3. Sắp xếp các sinh viên theo điểm trung bình tăng dần");
           System.out.println("*4. Nhập vào tên sinh viên và tìm kiếm sinh viên theo tên");
           System.out.println("*5. Thống kê số sinh viên nam, nữ đang quản lý");
           System.out.println("*6. In ra thông tin các sinh viên xếp loại giỏi và trung bình");
           System.out.println("*7. Thoát");
           int choice = sc.nextInt();
           switch (choice){
               case 1:case1(sv);
                   break;
               case 2:
                   System.out.println(sv);
                   break;
               case 3:case3(sv);
                   break;
               case 4:
                   break;
               case 5:
                   break;
               case 6:
                   break;
               case 7:
                   System.exit(0);
           }
       }while (check != 7);
    }
    static Student case1(Student sv){
        System.out.println("Nhập ID sinh viên :");
        sv.setStudentId(sc.next());
        System.out.println("Nhập tên sinh viên :");
        sv.setStudentName(sc.next());
        System.out.println("Nhập tuổi sinh viên :");
        sv.setAge(sc.nextInt());
        System.out.println("Nhập giới tính sinh viên :");
        sv.setSex(sc.next());
        System.out.println("Nhập số điện thoại sinh viên :");
        sv.setPhone(sc.next());
        System.out.println("Nhập địa chỉ sinh viên :");
        sv.setAddress(sc.next());
        System.out.println("Nhập điểm html sinh viên :");
        sv.setHtml(sc.nextFloat());
        System.out.println("Nhập điểm css sinh viên :");
        sv.setCss(sc.nextFloat());
        System.out.println("Nhập điểm javascript viên :");
        sv.setJavascript(sc.nextFloat());
        return sv;
    }
     static void case3(Student sv){
            System.out.println("Sinh viên tên " + sv.getStudentName() + " có giới tính là " + sv.getSex());
        }



    }

