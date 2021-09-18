import java.util.LinkedList;

class linkedList {
  public static void main(String[] args) {
    LinkedList<String> c = new LinkedList<String>();
      c.add("Red");
      c.add("Green");
      c.add("Blue");
      c.add("Yellow");
      c.remove("Yellow");
    System.out.println(c);
  }
}


/* You cannot specify an initial capacity for the LinkedList.
The LinkedList is better for manipulating data, such as making numerous inserts and deletes.
In addition to storing the object, the LinkedList stores the memory address (or link) of the
element that follows it. It's called a LinkedList because each element contains a link to the neighboring element.
Use a LinkedList when you need to make a large number of inserts and/or deletes.*/
