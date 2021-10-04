import java.util.Scanner;

public class Display_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int number =sc.nextInt();
        while(number!=0){
            int p=number%10;
            number=number/10;
            System.out.println(p);

        }

    }
}
