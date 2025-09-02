

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distanceTraveled = 0;
    private int numberOfVictories = 0;

    @Override
    public void drive() {
        distanceTraveled = distanceTraveled + 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTraveled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return this.getNumberOfVictories() - o.getNumberOfVictories();
    }
}
