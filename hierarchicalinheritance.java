class Test{

public void m1(){

int a=12;
int b=34;
int sum=a+b;
System.out.println(sum);
}
}

class Read extends Test{

public void m1(){
super.m1();
System.out.println("aalia");
}
}

class Main extends Test{

public void m1(){
super.m1();
System.out.println("ananya");
}

public static void main(String args[]){

Main m=new Main();
m.m1();
}
}

