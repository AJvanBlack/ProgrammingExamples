class elseIfStatement {

    public static void main(String[] args) {
        int age = 25;

        if(age <= 0) {
            System.out.println("An error occured");
        } else if(age <= 18) {
            System.out.println("You are too young");
        } else if(age < 100) {
            System.out.println("You are old enough");
        } else {
            System.out.println("Really????");
        }

    }
}

// Rather than using nested if-else statements, use Else-If statements //
