public class Lasagna {
    int minutesInOven = 40;

    public int expectedMinutesInOven(){
        return minutesInOven;
    }

    public int remainingMinutesInOven(int elapsed_minutes){
        return minutesInOven - elapsed_minutes;
    }

    public int preparationTimeInMinutes(int number_of_layers){
        return number_of_layers * 2;
    }

    public int totalTimeInMinutes( int number_of_layers, int total_elapsed_time){
        return preparationTimeInMinutes(number_of_layers) + total_elapsed_time;
    }
}
