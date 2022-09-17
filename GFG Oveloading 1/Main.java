
import java.util.Scanner;
//Java program to illustrate method overloading when one method declared and one is inherited
class Base{
//display method of Base class
   public void display(){
       System.out.println("in Base display ");
   }
}

//Derived class inherites methods of Base class
class Derived extends Base{

//display method of Derived class
   public int display(int n){
       System.out.println("\nin Derived display n : ");
       return n;	
   }
}

class Main {
   
  	public static void main (String[] args) {
       Derived d = new Derived();
       //calling display() inherited method of Base class 
       d.display();
       //calling display(int n) method of Derived class 
       int n = d.display(10);
       System.out.println(n);
    }
}
