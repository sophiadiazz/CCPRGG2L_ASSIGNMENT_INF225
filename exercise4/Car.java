public class Car {
    
    String name;
    Myself keeper;

    Car(String carName, Myself keeperName){
        this.name = carName;
        this.keeper = keeperName;
    }

    void showKeeperName(){
        System.out.println("Car Owner Name: " + keeper.name + " | Car Model: " + this.name );

        }
}
