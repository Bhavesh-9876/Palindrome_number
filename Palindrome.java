
import java.util.Scanner;
public class Palindrome {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;//545
        System.out.println("Enter a number:");
        number=sc.nextInt();
        int trmp;
        trmp=number;//trmp=545
        int Palindrome_=0;
        while (trmp!=0) {
            int rmd=trmp%10; //rmd=545%10=5
            Palindrome_=Palindrome_*10+rmd;//Palindrome_=0*10+5=5
            trmp=trmp/10;//545/10=54
        }
        if (number==Palindrome_) {
            System.out.println("IT is Palindrome number");
        } else {
            System.out.println("IT is not Palindrome number");
        }
        sc.close();
     }
}
