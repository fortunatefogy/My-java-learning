import java.util.Scanner;
public class Conditionss {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter number a");
        int a=obj.nextInt();
        System.out.println("Enter number b");
        int b=obj.nextInt();
        System.out.println("Enter number c");
        int c=obj.nextInt();

        if (a==b | b==c || a==c ){
            System.out.println("donot enter same numbers");
        } else if (a>b) {
            System.out.println("A is greater");

        } else if (b>c) {
            System.out.println("B is graeter");


        }else{
            System.out.println("C is greater");
        }
    }
}
