public class FunctionalInterfaceExample {

    public static void main(String[] args) {
//        Add calculator = new Calculator();
//        calculator.addition(10,20);


        // Ignore -> Access Modifier, return type, method name, {} replace as ->, return key word not needed

        Add add = (n1,  n2) -> n1 + n2;

        int addition = add.addition(10, 20);

        System.out.println(addition);
    }

}
