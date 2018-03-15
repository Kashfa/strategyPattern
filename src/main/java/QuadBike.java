public class QuadBike extends DodgemCar implements IDrive {

    int engineCapacity;


    QuadBike(int speed, int seats, int engineCapacity) {
        super(speed, seats);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getDriveDistance() {
        return 30;
    }




}
