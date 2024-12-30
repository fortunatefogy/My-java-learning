public class Fact {
    int factorial (int x){
        int fact=1;
        for (int i=1;i<=x;i++){
            fact=fact*i;
        }
        return fact;

    }
}

class mainl{
    public static void main(String[] args) {
        Fact newobj=new Fact();
        int b=newobj.factorial(3);
        System.out.println("factorial="+b);
    }
}