class Cellphone {
    public void ring() {
        System.out.println("ringing...");
    }
    
    public void vibrate() {
        System.out.println("vibrating...");
    }
    
    public void call() {
        System.out.println("calling your friend...");
    }
}

public class cwh_39_ps_pr_02 {
    public static void main(String args[]) {
        Cellphone apple = new Cellphone();
        apple.ring();
        apple.vibrate();
        apple.call();
    }
}