package diamond;

public interface InterfaceB {

    default void methodA() {
        System.out.println(getClass().getName());
    }
}
