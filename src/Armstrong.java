import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int number =sc.nextInt();
        int r,rev = 0,m=number;
        while (number>0){
            r=number%10;
            rev=rev+r*r*r;
            number=number/10;
        }
        if (rev==m)
            System.out.println("Number is armstrong "+m);
        else
            System.out.println("NUmber is not armstrong "+m);
    }
}
