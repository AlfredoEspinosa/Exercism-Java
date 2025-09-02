public class JedliksToyCar {
     private int battery=100;
     private int meters=0;

    public static JedliksToyCar buy() {
        System.out.println("You bought a band new car");
        JedliksToyCar jtc = new JedliksToyCar();
        return jtc;
    }

    public String distanceDisplay() {
        return "Driven "+String.valueOf(this.meters)+" meters";
    }

    public String batteryDisplay() {
        return battery>0?"Battery at "+String.valueOf(this.battery)+"%":"Battery empty";
    }

    //Cars start with full (100%) batteries. Each time you drive the car using the remote control,
    // it covers 20 meters and drains one percent of the battery.

    public void drive() {
        if(battery>0){
            meters = meters+20;
            battery = battery-1;
        }
    }
}
