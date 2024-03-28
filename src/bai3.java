import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap canh hinh lap phuong: ");
        a = sc.nextInt();
        System.out.println("The tich la: "+ Math.pow(a, 3));
    }
}
