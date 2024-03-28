import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        String hoVaten;
        String mSsv;
        float diemTrungbinh;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        hoVaten = sc.nextLine();
        System.out.print("Nhap MSSV: ");
        mSsv = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemTrungbinh = sc.nextFloat();
        System.out.println("Ho va ten: " + hoVaten);    
        System.out.println("MSSV: " + mSsv);
        System.out.println("Diem trung binh: " + diemTrungbinh);
    }
}
