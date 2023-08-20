class EncapsulationDemo{

private int a;
private int b;


public void setA(int a)
{
this.a=a;
}

public int getA()
{
return this.a;
}



public static void main(String args[])
{
EncapsulationDemo a=new EncapsulationDemo();
a.setA(20);
System.out.println(a.getA());
}

}