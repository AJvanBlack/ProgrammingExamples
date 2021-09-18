class Animal {                                     // Creating OOP Classes

  void bark() {
    System.out.println("Woof-Woof");
  }
}

class newClass {

  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.bark();                                    //dog is an object of type Animal.
  }
}
