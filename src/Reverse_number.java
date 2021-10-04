import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int number =sc.nextInt();
        int a=0;
        int p = 0;
        while(number>0){
            a=number%10;
            p=p*10+a;
            number=number/10;

        }
        System.out.println("reverse string is"+p);
    }
}
