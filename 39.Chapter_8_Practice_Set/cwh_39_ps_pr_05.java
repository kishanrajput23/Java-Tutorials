class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class cwh_39_ps_pr_05 {
    public static void main(String args[]) {
        TommyVecetti player = new TommyVecetti();
        player.hit();
        player.run();
        player.fire();
    }
}