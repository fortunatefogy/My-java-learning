import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number for the week");
        int num=obj.nextInt();
        switch (num){
            case 1:{
                System.out.println("this is monday");
                break;

            }
            case 2:{
                System.out.println("this is tuesday");
                break;
            }
            case 3:{
                System.out.println("this wednessday");
                break;
            }
            case 4:{
                System.out.println("this is thursday");
                break;
            }
            case 5:{
                System.out.println("this is friday");
                break;
            }
            case 6:{
                System.out.println("this is saturday");
                break;
            }
            case 7:{
                System.out.println("this is sunday");
                break;
            }
            default:{
                System.out.print("enter a valid day number");
                break;

            }

        }
    }
}
