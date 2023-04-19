package diamond;

public interface InterfaceA {

    default void methodA() {
        System.out.println(getClass().getName());
    }

}
