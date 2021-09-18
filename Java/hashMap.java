import java.util.HashMap;

class hashMap {
  public static void main(String[] args) {
    HashMap<String, Integer> points = new HashMap<String, Integer>();
      points.put("Sakkie", 7);
      points.put("Stacey", 6);
      points.put("Amy", 13);
    System.out.println(points.get("Amy"));
  }
}

/* HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value).
The put, remove, and get methods are used to add, delete, and access values in the HashMap.
A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.
The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.
If you try to get a value that is not present in your map, it returns the value of null.
Null is a special type that represents the absence of a value. */
