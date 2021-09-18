
/* Getters and Setters are used to effectively protect your data, particularly when creating classes.
   For each variable, the get method returns its value, while the set method sets the value.
   The getter method returns the value of the attribute.
   The setter method takes a parameter and assigns it to the attribute.
   Getters start with get, followed by the variable name, with the first letter of the variable name capitalized.
   Setters start with set, followed by the variable name, with the first letter of the variable name capitalized. */

public class Vehicle {
    // Variable
    private String color;

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }
}

class Program {
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        v1.setColor("Red");
        System.out.println(v1.getColor());
    }
}
