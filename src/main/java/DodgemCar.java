public abstract class DodgemCar implements IDrive  {

    private int speed;
    private int seats;

    DodgemCar(int speed, int seats ) {
        this.speed = speed;
        this.seats = seats;

    }

    public int getAverageSpeed() {
        return this.speed;
    }

    public int getNumberOfSeats() {
        return this.seats;

        }

        public int driveDistance() {
        return 0;
        }


    }

