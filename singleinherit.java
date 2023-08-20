// single inheritance

class Test{

public void m1(){

int a=10;
int b=5;
int sum=a+b;
System.out.print(sum);
}
}

class Read extends Test{

public void m1(){

System.out.println("body");
super.m1();

}
public static void main(String args[]){

Test r=new Test();
r.m1();

}
}
