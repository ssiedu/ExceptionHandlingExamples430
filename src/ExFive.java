
import java.util.Scanner;


public class ExFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First No. : ");
        int n1=sc.nextInt();
        System.out.println("Enter Second No. : ");
        int n2=sc.nextInt();
        int res=0;
        try{
            if(n2>n1){
                //ArithmeticException ob=new ArithmeticException();
                LargeNumberException ob=new LargeNumberException();
                throw ob;
            }
            res=n1/n2;
        }catch(ArithmeticException e){
            System.out.println("You Cant Divide By Zero ");
        }catch(LargeNumberException e){
            System.out.println("You Cant Divide By Large No. ");
        }
        
        System.out.println("RESULT : "+res);
        
        
        
    }
}
