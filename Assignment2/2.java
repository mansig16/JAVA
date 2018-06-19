public class old {
public static void main(String[] args) {

int age=15;
String a=&quot;You can&#39;t drive.&quot;;
String b=&quot;You can&#39;t vote.&quot;;
String c=&quot;You can&#39;t rent a car.&quot;;
String d=&quot;You can do anything that&#39;s legal.&quot;;
if(age&lt;16)
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
else if(age&gt;16 &amp;&amp; age&lt;18)
{
System.out.println(b);
System.out.println(c);
}
else if(age&gt;18 &amp;&amp; age&lt;25)
{
System.out.println(c);
}

else
{
System.out.println(d);
}
}
}