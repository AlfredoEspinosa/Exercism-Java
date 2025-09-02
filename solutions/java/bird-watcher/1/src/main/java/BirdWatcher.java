


class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] lastWeek = {0,2,5,3,7,8,4}; 

    public BirdWatcher(int [] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] = getToday() + 1; 
    }

    public boolean hasDayWithoutBirds() {
        boolean zeroBirds = false;
        for(int countsOfDay : birdsPerDay){
            if(countsOfDay == 0){
                zeroBirds = true;
                break;
            }
        }
        return zeroBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirdsCount = 0;
        try {
            // if number of days is zero then do not decrement value
            numberOfDays = numberOfDays == 0 ? 0: numberOfDays -1;
            for(int i=0; i<=numberOfDays ; i++){
                totalBirdsCount = totalBirdsCount + birdsPerDay[i];
            }
        } catch (Exception IndexOutOfBoundsException) {
            System.err.println("Week only has 7 days");
        }
        return totalBirdsCount;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int dayCount : birdsPerDay){
            if(dayCount>=5){
                busyDays = busyDays+1;
            }
        }
        return busyDays;
    }
}
