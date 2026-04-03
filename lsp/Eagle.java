package lsp;

public class Eagle extends Bird implements FlyingBird {
    @Override
    public void eat() { System.out.println("Eagle is eating."); }

    @Override
    public void fly() { System.out.println("Eagle soars through the sky."); }
}
