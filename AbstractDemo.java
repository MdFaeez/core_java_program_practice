abstract class A {

public abstract void m1();
public abstract  void m2();
public abstract  void m3();
} 

class B extends A{

public void m1(){
System.out.println("method a over ride");
}
public void m2(){
System.out.println("method b over ride");
}

public void m3(){
System.out.println("method c over ride");
}

public static void main(String args[]){

A a=new B();
a.m1();
a.m2();
a.m3();
}
}