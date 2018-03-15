public class Driver {

    String name;
    IDrive drive;

    public Driver(String name, IDrive drive) {
        this.name = name;
        this.drive = drive;



    }

    public String getName() {
        return name;
    }

    public  IDrive getDrive() {
        return this.drive;
    }

    public int Drive() {
        return this.drive.driveDistance();
    }

    public void setDrive() {
        this.drive = drive;
    }



}
