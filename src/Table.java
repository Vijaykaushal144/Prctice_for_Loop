import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number= ");
        int number=sc.nextInt();
        int i,Table;
        for (i=1;i<=10;i++){
            Table=i*number;
            System.out.println(number +" *" +i +"=" +Table);
        }
    }
}
