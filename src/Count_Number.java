import java.util.Scanner;

public class Count_Number {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number=");
            int number =sc.nextInt();
            int count=0;
            while(number!=0){
                number=number/10;
                count++;
            }
        System.out.println(count);
    }
}
