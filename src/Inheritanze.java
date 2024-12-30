class Inheritanze {
    int age=23;
    public void ager(){
        System.out.println("Myage is "+age);
    }
}

class Inhi extends Inheritanze{
    String name="aju";
    public static void main(String[] args) {
        Inhi newobj= new Inhi();
        newobj.ager();
        System.out.println("my age is "+newobj.age+" "+"my name is"+ newobj.name);

    }
}
