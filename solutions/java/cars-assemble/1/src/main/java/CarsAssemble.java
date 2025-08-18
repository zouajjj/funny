public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productionRate = 0;
        if(speed >= 0 && speed <= 4) {
            productionRate= speed*221;
        }
        else if(speed >= 5 && speed <= 8) {
            productionRate= speed*221*0.9;
        }
        else if(speed == 9 ) {
            productionRate= speed*221*0.8;
        }
        else if(speed ==10) {
            productionRate= speed*221*0.77;
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed)/60;


    }
}
