package Java8Features.Default_Static_Interfaces;

public class Car implements Vehicle{
    @Override
    public void startVehicle() {
        System.out.println("Inside car startVehicle(): ->  ");
    }
}
