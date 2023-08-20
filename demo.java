class Test{

public void m1(){

System.out.println("hello");
}
}

class Main{

public void m1(){

System.out.println("ANANYA");
}

public static void main(String args[]){

Test t=new Test();
t.m1();

Main t1=new Main();
t1.m1();

}
}