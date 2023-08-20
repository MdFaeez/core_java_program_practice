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

public static void main(String args[]){

Test r=new Read();
r.m1();
}
}