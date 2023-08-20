//instance method

class InstanceDemo{

public void m1(){

System.out.println("hello m1");

int value1=10;
int value2=20;
int sum=value1+value2;
System.out.println(sum);

}

public void m2(){

System.out.println("hello m2");

m1();
}

public static void main(String args[]){
System.out.println("main method");
InstanceDemo id=new InstanceDemo();
id.m2();

}
}