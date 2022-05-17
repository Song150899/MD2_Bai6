package miniTest;

import java.util.Scanner;

public class QLNhanVien {

    NhanVien[] nhanViens = new NhanVien[0];
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("===Menu===");
        System.out.println("1. Thêm nhân viên");
        System.out.println("2. Sửa nhân viên");
        System.out.println("3. Xóa nhân viên");
        System.out.println("4. Tính lương nhân viên");
        System.out.println("5. Hiển thị nhân viên");
        System.out.println("Hãy Chọn chức năng");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {

            case 1:
                System.out.println("1. Thêm nhân viên full time");
                System.out.println("2. Thêm nhân viên part time");
                int choice1 = Integer.parseInt(scanner.nextLine());

                switch (choice1) {

                    case 1:
                        add(taoNhanVien(true));
                        break;

                    case 2:
                        add(taoNhanVien(false));
                        break;
                }

                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                System.out.println("Tính lương nhân viên Full time");
                System.out.println("Tính lương nhân viên Part time");
                int choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2){

                            case 1:
                                break;

                            case 2:
                                break;
                        }
                break;

            case 5:
                for (NhanVien hienThi : nhanViens) {
                    System.out.println(hienThi);
                }
                break;

        }
    }

    public NhanVien taoNhanVien(boolean fullTime) {

        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên");
        String ten = scanner.nextLine();

        System.out.println("Nhập tuổi");
        int tuoi = Integer.parseInt(scanner.nextLine());

        if (fullTime) {

            System.out.println("Nhập hệ số");
            int heSo = Integer.parseInt(scanner.nextLine());

            return new FullTime(id, ten, tuoi, heSo);
        } else {

            System.out.println("Nhập số buổi");
            int soBuoi = Integer.parseInt(scanner.nextLine());

            return new PartTime(id, ten, tuoi, soBuoi);
        }

    }

    public void add(NhanVien nhanVien) {
        NhanVien[] newNhanVien = new NhanVien[nhanViens.length + 1];

        for (int i = 0; i < nhanViens.length; i++) {
            newNhanVien[i] = nhanViens[i];

        }
        newNhanVien[newNhanVien.length - 1] = nhanVien;
        nhanViens = newNhanVien;
    }

}
