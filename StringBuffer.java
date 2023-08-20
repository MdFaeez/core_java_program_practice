class StringBuffer{

public static void main(String args[]){

String s=new String("1234-1234-1234-1098");

String sb=new String("xxxx-xxxx-xxxx-");

sb=sb+s.substring(15,19);

System.out.println(sb);
}

}