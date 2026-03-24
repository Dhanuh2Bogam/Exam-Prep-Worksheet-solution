public class Leela extends Fry { 
public void method1() { 
System.out.print("Leela1 "); 
} 
public void method2() { 
System.out.print("Leela2 "); 
super.method2(); 
} 
} 
public class Farnsworth extends Bender { 
public void method1() { 
System.out.print("Farnsworth1 "); 
} 
public String toString() { 
return "Good news everyone!"; } 
} 
}
public class Fry extends Bender { 
public void method2() { 
System.out.print("Fry2 "); 
super.method2(); 
}
} 
public class Bender { 
public void method1() { 
System.out.print("Bender1 "); 
}		 
public void method2() {
System.out.print("Bender2 "); 
method1(); 
} 
public String toString() { 
return "We're doomed!"; } 
}
/*Bender[] rodriguez = { new Leela(), new Bender(), 
     new Farnsworth(), new Fry() };
for (int i = 0; i < rodriguez.length; i++) {
	Bender b = rodriguez[i];
b.method1();
b.method2();
System.out.println(b);
}
*/
//The output prediction for this code
/* Leela1 Leela2 Fry2 Bender2 Leela1 We're doomed!
  Bender1 Bender2 Bender1 We're doomed!
  FarnsWorth1 Bender2 FarnsWorth1 Good news everyone!
  Bender1 Fry2 Bender2 Bender1 We're doomed!
*/
//
