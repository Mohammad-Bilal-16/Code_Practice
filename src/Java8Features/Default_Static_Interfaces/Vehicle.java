package Java8Features.Default_Static_Interfaces;

public interface Vehicle {
    void startVehicle();

    public default void cleanVehicle(){
        System.out.println("default method called cleaning complete!!!");
    }

}
