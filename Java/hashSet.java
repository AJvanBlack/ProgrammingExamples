import java.util.HashSet;

class hashSet {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();
      set.add("A");
      set.add("B");
      set.add("C");
      set.add("D");
      set.add("E");
      set.add("F");
    System.out.println(set);
  }
}

/* A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
One of the implementations of the Set is the HashSet class.
You can use the size() method to get the number of elements in the HashSet.
The HashSet class does not automatically retain the order of the elements as they're added*/
