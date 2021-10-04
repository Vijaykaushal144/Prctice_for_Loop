import java.util.Scanner;

public class Palindrom_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int number =sc.nextInt();
        int r,rev = 0,m=number;
        while (number>0){
            r=number%10;
            rev=rev*10+r;
            number=number/10;


        }
        System.out.println(rev);
        if (rev==m)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }

}
