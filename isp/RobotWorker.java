package isp;

// ISP Fix: Robot only implements what it actually does — no dummy throws
public class RobotWorker implements Workable {
    @Override
    public void work() { System.out.println("Robot is working."); }
}
