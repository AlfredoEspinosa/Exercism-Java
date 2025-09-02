



class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int battery = 100;

    public  NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return  this.battery <= 0;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        this.distanceDriven = this.distanceDriven + this.speed;
        this.battery = this.battery > 0 ? this.battery - this.batteryDrain : 0; 
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }

        System.out.println("Battery is enterily drained, total distance driven is: "+car.distanceDriven());

        return car.distanceDriven() >= this.distance;
    }
}
