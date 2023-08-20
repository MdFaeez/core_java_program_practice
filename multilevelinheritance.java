class Test{

public void m1(){

System.out.println("hello");
}
}

class Read extends Test{

public void m1(){

super.m1();
System.out.println("good");
}
}

class Main extends Read{

public void m1(){

super.m1();
System.out.println("ananya");
}

public static void main(String args[]){

Main m=new Main();
m.m1();
}
}