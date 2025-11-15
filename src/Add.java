@FunctionalInterface
public interface Add {

    int addition(int n1, int n2);

    default void print() {
        System.out.println("Functional interface can have any number of default methods," +
                " but must have only one abstract method");
    }

}
