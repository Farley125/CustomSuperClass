public class FPS extends VideoGames {

    private boolean isTacticalShooter;

    public FPS(String name, double cost, boolean isTacticalShooter) {
        super(name, cost);
        this.isTacticalShooter = isTacticalShooter;
    }

    public void compMatch() {
        System.out.println("Stand tall, we are Valorant, we are fighters.");
    }

}
