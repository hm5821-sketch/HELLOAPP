public class HelloApp {
public static void main (String[] args) {


	if (args.length == 0)
	{
		System.out.println("Hello,World!");
	} else {
StringBuilder nameBuilder = new StringBuilder();
boolean first = true;
for ( String name : args)  {
	
	if (!first) {
		nameBuilder.append(", ");
	}
	nameBuilder.append(name);
	first = false;
             }
			 nameBuilder.toString();
			 System.out.println("Hello," + nameBuilder.toString()  + "!" );
			
 }
 
}
}