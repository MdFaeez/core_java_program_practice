//static method

class StaticDemo{
  int value1=23;
  int value2=32;

public void m1(int a,int b){

 int sum=a+b;

System.out.println(sum);

System.out.println("hello m1");

m2();

}

public void m2(){

System.out.println("hello m2");

}

public static void main(String args[]){
StaticDemo sd=new StaticDemo();
System.out.println(sd.value1);

sd.m1(sd.value1,sd.value2);
}
}