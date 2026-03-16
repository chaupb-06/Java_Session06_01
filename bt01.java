package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] list = {};
        while(true) {
            System.out.println("******************** QUẢN LÝ ĐIỂM SINH VIÊN ********************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int n = Integer.parseInt(sc.nextLine());
            switch(n) {
                case 1:
                    System.out.println("Nhập danh sách điểm sinh viên:");
                    while (true) {
                        double x = Double.parseDouble(sc.nextLine());
                        if (x >= 0.0 && x <= 10.0) {
                            double[] list1 = new double[list.length + 1];
                            System.arraycopy(list, 0, list1, 0, list.length);
                            list1[list1.length-1] = x;
                            list = list1;
                        }
                        else {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("In danh sách điểm:");
                    for (int i = 0; i < list.length; i++) {
                        System.out.println("Sinh viên "+(i+1)+": "+list[i]);
                    }
                    break;
                case 3:
                    double dtb = 0.0;
                    for (double v : list) {
                        dtb += v;
                    }
                    dtb /= list.length;
                    System.out.println("Điểm trung bình của các sinh viên: "+dtb);
                    break;
                case 4:
                    System.out.println("Điểm cao nhất: "+ Arrays.stream(list).max().getAsDouble());
                    System.out.println("Điểm thấp nhất: "+ Arrays.stream(list).min().getAsDouble());
                    break;
                case 5:
                    int cnt = 0;
                    for (double v : list) {
                        if (v >= 5.0) {
                            cnt++;
                        }
                    }
                    System.out.println("Số lượng sinh viên đạt: "+cnt);
                    System.out.println("Số lượng sinh viên trượt: "+(list.length - cnt));
                    break;
                case 6:
                    Arrays.sort(list);
                    System.out.println("Đã sắp xếp điểm của các sinh viên theo chiều tăng dần!");
                    break;
                case 7:
                    int cnt1 = 0;
                    for (double v : list) {
                        if (v >= 8.0) cnt1++;
                    }
                    System.out.println("Số lượng sinh viên giỏi và xuất sắc: "+cnt1);
                    break;
                case 8:
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng lựa chọn đúng trong danh sách trên!");
            }
        }
    }
}
