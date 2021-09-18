/* Constructors are special methods invoked when an object is created and are used to initialize them.
   A constructor can be used to provide initial values for object attributes.
   - A constructor name must be same as its class name.
   - A constructor must have no explicit return type. */

   public class Vehicle {
       private String color;

       Vehicle() {
           this.setColor("Red");
       }
       Vehicle(String c) {
           this.setColor(c);
       }

       // Setter
       public void setColor(String c) {
           this.color = c;
       }

       // Getter
       public String getColor() {
           return color;
       }
   }

   public class Program {
       public static void main(String[] args) {
           //color will be "Red"
           Vehicle v1 = new Vehicle();

           //color will be "Green"
           Vehicle v2 = new Vehicle("Green");

           System.out.println(v1.getColor());
       }
   }
