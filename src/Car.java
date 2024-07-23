public class Car {
    String model;

    public Car(String model) {
        this.model=model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void printModel() {
        System.out.println("Model :" +getModel());
    }
}
