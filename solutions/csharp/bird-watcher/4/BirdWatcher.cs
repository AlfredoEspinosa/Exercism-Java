class BirdCount
{
    private int[] birdsPerDay = new int [] {2,5,0,7,4,1};

    public BirdCount(int[] birdsPerDay)
    {
        this.birdsPerDay = birdsPerDay;
    }

    public static int[] LastWeek()
    {
        int[] birdCountLastWeek = new int [] { 0, 2, 5, 3, 7, 8, 4 };
        return birdCountLastWeek;
    }

    public int Today()
    {
        return birdsPerDay[birdsPerDay.Lenght - 1];
    }

    public void IncrementTodaysCount()
    {
        int newCount = birdsPerDay[birdsPerDayLenght - 1] + 1;
        birdsPerDay[birdsPerDayLenght - 1] = newCount;
    }

    public bool HasDayWithoutBirds()
    {
        foreach (int i in birdCountLastWeek)
        {
            if (i == 0)
            {
                return true;
            }
        }
        return false;
    }

    public int CountForFirstDays(int numberOfDays)
    {
        int total = 0;
        for (int i = 0; i < numberOfDays; i++)
        {
            total = total + birdsPerDay[i];
        }
        return total;
    }

    public int BusyDays()
    {
        int busydays = 0;
        foreach (int i in birdsPerDay)
        {
            if (i >= 5)
            {
                busydays++;
            }
        }
        return busydays;
    }
}
