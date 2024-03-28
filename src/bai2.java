import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int cD, cR;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chieu dai: ");
        cD = sc.nextInt();
        System.out.print("Moi ban nhap chieu rong: ");
        cR = sc.nextInt();
        int chuVi = (cD + cR) * 2;
        int dienTich = cD * cR;
        System.out.println("Chu vi la: "+chuVi);
        System.out.println("Dien tich la: "+dienTich);
    }
}
