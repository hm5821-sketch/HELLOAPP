public class HelloApp {
public static void main (String[] args) {
<<<<<<< HEAD
String name;
if (args.length > 0) {
	name = args[0];
} else {
	name = "World";
}
System.out.println("Hello," + name + "!");
=======
String name = "World" ;
if (args.length > 0) {
	name = args[0];
} 
System.out.println("Hello, " + name + "!" );
>>>>>>> feature/UC3-display-name-default
}
}