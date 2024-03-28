import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner pt = new Scanner(System.in);
        System.out.print("Moi ban nhap a: ");
        a = pt.nextInt();
        System.out.print("Moi ban nhap b: ");
        b = pt.nextInt();
        System.out.print("Moi ban nhap c: ");
        c = pt.nextInt();
        float delta = (b * b) - 4 * a * c;
        System.out.println("Delta la: "+delta);
        System.out.println("Can delta la: "+Math.sqrt(delta));
    }
}
