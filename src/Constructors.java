public class Constructors {
    int age1;
    String name1;
    public Constructors(int age, String name){
        age1=age;
        name1=name;


    }
    public static void main(String[] args) {
        Constructors newobj = new Constructors(20,"anandhu");
        int m=newobj.age1;
        String n=newobj.name1;
        System.out.println("my name is "+n+" and my age is "+m);


    }
}
