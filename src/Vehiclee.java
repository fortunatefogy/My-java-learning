interface Vehiclee{
    public void vehiclemessage();
    public void vehiclecolor();
}

class Car implements Vehiclee{
    @Override
    public void vehiclemessage() {
        System.out.println("vehicle pom pom");
    }

    @Override
    public void vehiclecolor() {
        System.out.println("color of the vehicle is yellow");
    }
}

class main{
    public static void main(String[] args) {
        Car newobj=new Car();
        newobj.vehiclemessage();
        newobj.vehiclecolor();
    }
}