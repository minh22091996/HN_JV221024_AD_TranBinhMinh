package bai_tap_1;

import java.time.Year;
import java.util.Scanner;

public class ClassStudent {
    private String studentId;
    private String studentName;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private float html;
    private float css;
    private float javascript;
    private float avgMark;

    public ClassStudent() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHtml() {
        return html;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public float getCss() {
        return css;
    }

    public void setCss(float css) {
        this.css = css;
    }

    public float getJavascript() {
        return javascript;
    }

    public void setJavascript(float javascript) {
        this.javascript = javascript;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        boolean checkStudentId = true;
        boolean checkPhone = true;
        //Mã sinh viên
        do {
            System.out.println("Nhập mã sinh viên (Phải có RA ở đầu) :");
            this.studentId = sc.nextLine();
            if (this.studentId.startsWith("RA")) {
                checkStudentId = false;
            } else {
                System.out.println("Vui lòng nhập RA!!");
            }
        } while (checkStudentId);

        // Tên sinh viên
        do {
            System.out.println("Nhập tên sinh viên (20 đến 50 ký tự");
            this.studentName = sc.nextLine();
        } while (this.studentName.length() < 5 || this.studentName.length() > 50);

        // Tuổi sinh viên
        do {
            System.out.println("Nhập tuổi sinh viên : ( >=18<=100");
            while (!sc.hasNextInt()) {
                sc.next();
            }
            this.age = sc.nextInt();
        } while (this.age < 18 || this.age > 100);

        //giới tính
        do {
            System.out.println("Nhập giới tính nam/nữ");
            this.gender = sc.next();
        }while (!this.gender.equals("nam") && !this.gender.equals("nữ"));

       // sdt
        do{
            System.out.printf("Nhập số điện thoại :");
            this.phone = sc.next();
            if(this.phone.startsWith("0")){
                checkPhone = false;
            }else {
                System.out.println("Số điện thoại phải bắt đầu bằng số 0. Vui lòng nhập lại ");
            }
        }while (checkPhone);

                //Địa chỉ
        System.out.println("Nhập địa chỉ ");
        do{

            this.address = sc.nextLine();
        }while (this.address.length()<1 || this.address.length()>100);

        //html

        do{
            System.out.println("Nhập điểm html");
            this.html = sc.nextFloat();
        }while (this.html < 0 || this.html >10);

        //scc

        do{
            System.out.println("Nhập điểm css");
            this.css = sc.nextFloat();
        }while (this.css < 0 || this.css >10);

        //javascrip


        do{
            System.out.println("Nhập điểm javascrip");
            this.javascript = sc.nextFloat();
        }while (this.javascript < 0 || this.javascript >10);
    }

    public void displayData(){
        int day = Year.now().getValue();
        System.out.println(" Mã sinh viên: "+ studentId+ " Tên sinh viên: " + studentName);
        System.out.println( " Năm sinh :"+ (day-age)+" Gioi tính : "+ gender+ " Điện thoại : " +phone );
        System.out.println(" Địa chỉ :"+ address + " Điểm trung bình : " + avgMark());

    }
    public float avgMark(){
        return (html + css + 2 * javascript)/4;
    }

}
