public class Test{
     public static void main(String args[]){
        X x= new X();
       Y y = new  Y();
       y.m2();
      x.m1();
      y.m1();
     x = y;// parent pointing to object of child
     x.m1() ;
     y.a=10;
   }

}
class X{
   public int a;
   int b;
      public void m1(){
       System.out.println("This is method m1 of class X");
     }
}

class Y extends X{
      int c; // new instance variable of class Y
         public void m1(){
            // overriden method
            System.out.println("This is method m1 of class Y");
        }
       public void m2(){
           super.m1();
           System.out.println("This is method m2 of class Y");
      }
}

/*The keyword super can be used to access any data member or methods of the super class in the sub class.
Example:-To learn Inheritance, Polymorphism & super keyword

Step 1) Copy the following code into an Editor
Step 2) Save, Compile & Run the code. Observe the output.

Step 3) Uncomment lines # 6-9. Save, Compile & Run the code. Observe the output.

Step 4) Uncomment line # 10 . Save & Compile the code.

Step 5) Error = ? This is because sub-class cannot access private members of the super class.
 */