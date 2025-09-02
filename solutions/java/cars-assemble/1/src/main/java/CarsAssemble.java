
public class CarsAssemble {
    // number of cars produced at production speed 1
    private int producedCars = 221;

    public double productionRatePerHour(int speed) {
        double cars_per_hour = 0;
        int success_rate = 0 ;

        if(speed <=0){
          throw new InvalidSuccessRateException("Speed Cannot be 0 or less");
        }else if(speed <=4){
            success_rate = 100;
        }else if (speed >= 5 && speed <=8) {
            success_rate = 90;
        }else if (speed == 9){
            success_rate = 80;
        }else if (speed == 10){
            success_rate = 77;
        }else if (speed < 10) {
            throw  new InvalidSuccessRateException("Speed cannot be grater than 10");
        }
        cars_per_hour = (double)((speed * producedCars)*success_rate)/100;
        return cars_per_hour;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed)/60;
    }
}
