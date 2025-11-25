package student;

import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.Constants;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.enums.Models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class constantsTest {
    @Test
    void verifyConstantsFreight() {
        assertEquals(300000, Constants.COMBUSTION_ENGINE_WARRANTY_MILES);
        assertEquals(5, Constants.COMBUSTION_ENGINE_WARRANTY_YEARS);

    }
    @Test
    void verifyConstantsKenworth() {
        assertEquals(500000, io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.Constants.COMBUSTION_ENGINE_WARRANTY_MILES);
        assertEquals(5, io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.Constants.COMBUSTION_ENGINE_WARRANTY_YEARS);
    }

    @Test
    void verifytoString() {
        String expected = """
    Vehicle Information:
    \tVIN: 9E300KSCCA4189DEF
    \tVehicle Category: Commercial
    \tCommercial Category: Truck
    \tCommercial Truck Details:
    \t\tMake: Freightliner
    \t\tManufacture ID: F44556
    \tModel: Model: FLD Series 60
    \tFrame Details:
    \t\tFrame Type: FLD Frame
    \t\tDescription: Classic Freightliner frame for on-highway use, known for strength and serviceability.
    \tDetroit Diesel Engine Model: Detroit Diesel Series 60 12.7L I6
    \t\tEngine Type: Combustion
    \t\tMax Power Output: 127 HP
    \t\tFuel Type: Diesel
    \t\tNumber of Cylinders: 6
    \t\tDisplacement: 12.7 L
    \t\tEngine Warranty Information:
    \t\t\tWarranty Years: 5
    \t\t\tWarranty Miles: 300000
    """;

        io.github.nathanjrussell.vehicles.Vehicle vehicle =
                new io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.Make(
                        "9E300KSCCA4189DEF",
                        Models.FLD_SERIES60
                );

        assertEquals(expected.trim(), vehicle.toString().trim());
    }
}
