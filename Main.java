//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Main Class
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vehicle myVehicle = new Vehicle(6, "Gray", 14.5f, "Diesel");
        Car myCar = new Car(4, "Blue", 3.0f, "Gasoline");
        //Instantiated a Vehicle object and a Car object

        System.out.println(myVehicle.toString());
        System.out.println(myCar.toString());

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        }
    }