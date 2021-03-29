public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        new Phone(number, model); //не совсем понял 8) Вызвать из конструктора с тремя параметрами конструктор с двумя
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName + " " + this.number);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", его номер: " + callerNumber);
    }

    public void sendMessage(String ... phoneNumber) {
        for(String number : phoneNumber) {
            System.out.println(number);
        }
    }
}
