package refactoring_guru.design_patterns.creational.builder.example.builders;

import refactoring_guru.design_patterns.creational.builder.example.cars.Type;
import refactoring_guru.design_patterns.creational.builder.example.components.Engine;
import refactoring_guru.design_patterns.creational.builder.example.components.GPSNavigator;
import refactoring_guru.design_patterns.creational.builder.example.components.Transmission;
import refactoring_guru.design_patterns.creational.builder.example.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
