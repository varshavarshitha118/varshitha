class example
{
public static void main(String args[])
{
String str1=new String("My name is ");
String str2=new String("Shalya");
System.out.println(str1.concat(str2));
{
String str=new String("My name is srividya");
char c;
c=str.charAt(5);
System.out.println(c);
}
{
String str=new String("my name is srividya");
System.out.println("Substring is "+str.substring(11));
}
{
String str=new String("puttur");
String s=str.replace('u','a');
System.out.println(s);
}
{
String s1="java";
int s;
s=s1.length();
System.out.println("length of string "+s);
}
}
}