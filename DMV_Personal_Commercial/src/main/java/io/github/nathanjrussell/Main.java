package io.github.nathanjrussell;

import io.github.nathanjrussell.vehicles.Vehicle;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.Make;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums.CumminsEngines;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.engines.enums.DetroitEngines;
import io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.enums.PaccarEngines;
import io.github.nathanjrussell.vehicles.engines.interfaces.IEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void printModels(){
        Random random = new Random();
        random.setSeed(44535);
        List<Vehicle> vehicles = new ArrayList<>();
        for (io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.enums.Models model : io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.enums.Models.values()) {
            vehicles.add(new io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.Make(generateRandomVIN(random), model));
        }
        for (io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Models model : io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.enums.Models.values()) {
            vehicles.add(new io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.Make(generateRandomVIN(random), model));
        }
        for (io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.enums.Models model : io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.enums.Models.values()) {
            vehicles.add(new io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.Make(generateRandomVIN(random), model));
        }
        for (io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.enums.Models model : io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.enums.Models.values()) {
            vehicles.add(new io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.Make(generateRandomVIN(random), model));
        }

        for (io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.enums.Models model : io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.enums.Models.values()) {
            vehicles.add(new io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.Make(generateRandomVIN(random), model));
        }
        for (io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.enums.Models model : io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.freightliner.enums.Models.values()) {
            vehicles.add(new Make(generateRandomVIN(random), model));
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }

    public static void printEngines() {
        List<IEngine> engines = new ArrayList<>();
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.enums.CombustionEngines.values()) {
            engines.add(engine);
        }
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.harleydavidson.engines.enums.ElectricEngines.values()) {
            engines.add(engine);
        }

        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.enums.CombustionEngines.values()) {
            engines.add(engine);
        }
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : io.github.nathanjrussell.vehicles.categories.noncommercial.motorcycle.makes.bmw.engines.enums.ElectricEngines.values()) {
            engines.add(engine);
        }

        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.enums.CombustionEngines.values()) {
            engines.add(engine);
        }
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.ford.engines.enums.ElectricEngines.values()) {
            engines.add(engine);
        }
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.enums.CombustionEngines.values()) {
            engines.add(engine);
        }
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : io.github.nathanjrussell.vehicles.categories.noncommercial.truck.makes.chevy.engines.enums.ElectricEngines.values()) {
            engines.add(engine);
        }
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : PaccarEngines.values()) {
            engines.add(engine);
        }
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : io.github.nathanjrussell.vehicles.categories.commercial.truck.makes.kenworth.engines.enums.CumminsEngines.values()) {
            engines.add(engine);
        }
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : DetroitEngines.values()) {
            engines.add(engine);
        }
        for (io.github.nathanjrussell.vehicles.engines.interfaces.IEngine engine : CumminsEngines.values()) {
            engines.add(engine);
        }
        for (IEngine engine : engines) {
            System.out.println(engine);
        }
    }

    public static String generateRandomVIN(Random random) {
        StringBuilder vin = new StringBuilder();
        String chars = "ABCDEFGHJKLMNPRSTVWXYZ0123456789";
        for (int i = 0; i < 17; i++) {
            vin.append(chars.charAt(random.nextInt(chars.length())));
        }
        return vin.toString();
    }

    public static void main(String[] args) {
        printModels();
    }
}