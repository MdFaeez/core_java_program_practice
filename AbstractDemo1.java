abstract class A{

public abstract void m1();
public abstract void m2();
public abstract void m3();
}

abstract class B extends A{

public void m1(){
System.out.println("single over riding");
}
}

class Main extends B{
public void m2(){

}
public void m3(){

}
public static void main(String args[]){
A a=new Main();
a.m1();
}
}