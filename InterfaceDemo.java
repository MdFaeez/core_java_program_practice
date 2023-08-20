interface Demo{

void m1();
void m2();
}

interface Demo1 extends Demo{

void m3();
}

class Main implements Demo1,Demo{

public void m1(){

System.out.println("interface 1");
}

public void m2(){

System.out.println("interface 2");
}

public void m3(){

System.out.println("interface 3");
}
public static void main(String args[]){

Demo1 d=new Main();
d.m1();
d.m2();
d.m3(); 
}
}