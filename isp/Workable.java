package isp;

// ISP Fix: fine-grained interface instead of one fat Worker interface
public interface Workable {
    void work();
}
