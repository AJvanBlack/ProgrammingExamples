import java.util.ArrayList;

class arrayList {
  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>(10);
      colors.add("Red");
      colors.add("Green");
      colors.add("Blue");
      colors.add("Purple");
      colors.add("Orange");
      colors.remove("Red");
    System.out.println(colors);
  }
}

/* ArrayLists store objects. Thus, the type specified must be a class type. You cannot pass, for example,
int as the objects' type. Instead, use the special class types that correspond to the desired value type,
such as Integer for int, Double for double, and so on. An initial arrayList size can be specified in ArrayLists
Use an ArrayList when you need rapid access to your data.

 Other useful methods include the following:
- contains(): Returns true if the list contains the specified element
- get(int index): Returns the element at the specified position in the list
- size(): Returns the number of elements in the list
- clear(): Removes all of the elements from the list

Note: As with arrays, the indexing starts with 0.
The ArrayList is better for storing and accessing data, as it is very similar to a normal array. */
