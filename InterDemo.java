interface Bike{
void self();
}

interface Car{
void key();
}

class Main implements Bike,Car
{
public void key(){
System.out.println("the car is started");
}
public  void self(){
System.out.println("bike is started");
}
public static void main(String args[])
{


Bike b=new Main();
Car c=new Main();

b.self();
c.key();

}
}