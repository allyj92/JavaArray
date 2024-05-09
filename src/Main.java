//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//    String[] cars = {"Camaro","Corvette","Tesla","BMW"};
//
//    cars[0] = "Mustang";
//
//    System.out.println(cars[3]);

    String[ ] cars = new String[3];

    cars[0] = "Camero";
    cars[1] = "Corvette";
    cars[2] = "Tesla";

//    System.out.println(cars[0]);

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }



    }
}