package diamond;

public class DiamondMain implements InterfaceB, InterfaceA {
    public static void main(String[] args) {
        DiamondMain diamondMain = new DiamondMain();
        diamondMain.methodA();
    }

    @Override
    public void methodA() {
        InterfaceA.super.methodA();
        // or
        InterfaceB.super.methodA();
    }
}