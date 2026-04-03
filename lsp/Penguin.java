package lsp;

// LSP Fix: Penguin doesn't implement FlyingBird — no more UnsupportedOperationException
public class Penguin extends Bird {
    @Override
    public void eat() { System.out.println("Penguin is eating."); }

    public void swim() { System.out.println("Penguin is swimming."); }
}
