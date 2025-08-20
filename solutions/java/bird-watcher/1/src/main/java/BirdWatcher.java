
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};


    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeek.clone();
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count=0;
        for (int i = 0; i < numberOfDays; i++) {
            count=count+birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count=0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i]>=5) {
                count++;
            }
        }
        return count;
    }
}
