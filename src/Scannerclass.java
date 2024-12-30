import java.util.Scanner;
public class Scannerclass {
    public static void main(String[] args) {
        Scanner newobj= new Scanner(System.in);
        String name,address,state ;
        System.out.println("enter the name");
        name=newobj.nextLine();
        System.out.println("my name is "+name);
        address=newobj.nextLine();
        state=newobj.nextLine();
        System.out.println(address+state);


    }

}
