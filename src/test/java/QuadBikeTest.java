import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quadBike;
    DodgemCar dodgemCar;

    @Before
    public void before () {
        quadBike = new QuadBike(30, 2, 400);

    }

    @Test
    public void getAverageSpeed(){
        assertEquals(30, quadBike.getAverageSpeed());
    }

    @Test
    public void getNumberOfSeats() {
        assertEquals(2, quadBike.getNumberOfSeats());
    }

    @Test
    public void getNumberOfEngineCapacity() {
        assertEquals(400, quadBike.getEngineCapacity());
    }

    @Test
    public void getDrive() {
        assertEquals(30, quadBike.getDriveDistance() );
    }
}
