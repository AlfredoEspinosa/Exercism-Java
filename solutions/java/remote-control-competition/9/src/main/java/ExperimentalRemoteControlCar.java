public class ExperimentalRemoteControlCar  implements RemoteControlCar{
    private int distanceTraveled = 0;   

    @Override
    public void drive() {
        distanceTraveled = distanceTraveled + 20;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTraveled;
    }
}