import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int r= scanner.nextInt();
        if (r>999 || r<100) {
            System.out.println("Введено неверное число");}
        int r1=r/100;
        int r2=(r%100)%10;
        if (r1==r2) {
            System.out.println("Это палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }
    }
}
