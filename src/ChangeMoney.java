import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tien USD");
        double USD = sc.nextDouble();
        double VND;
        VND = USD * 23000;
        System.out.print(USD + " doi dc: ");
        System.out.println(VND);

    }
}
