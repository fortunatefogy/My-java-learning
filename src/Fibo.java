public class Fibo {
    int fibonaci(int x){
        int a=0;
        int b=1;
        for (int i=0;i<x;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;

        }
        return 0;

    }
}

class mainly{
    public static void main(String[] args) {
        Fibo newobj=new Fibo();
        newobj.fibonaci(10);
    }
}