package Java8Features.Default_Static_Interfaces;

import org.w3c.dom.css.ViewCSS;

public class Bike implements Vehicle {
    @Override
    public void startVehicle() {
        System.out.println("Inside bike startVehicle(): ->  ");
    }
}
