import java.util.Scanner;
class Test{

public void m1(int a,int b){

int sum=a+b;
System.out.println(sum);
}
// user input
public void m2(int a,int b,int c){

int sum=a+b+c;
System.out.println(sum);
}

Test(int a, int b){

System.out.println("default constructor"+a+" "+b);

}
public static void main(String args[]){

Test t1=new Test(10,20);
Test t2=new Test(21,65);
Test t3=new Test(12,67);


Scanner sc=new Scanner(System.in);
System.out.println("please enter the value of a,b,c");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();



t1.m1(10,20);
t1.m2(a,b,c);

}
}