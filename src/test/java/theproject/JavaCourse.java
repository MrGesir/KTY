package theproject;

import javax.lang.model.element.VariableElement;
import java.util.HashMap;
import java.util.Map;

//Java basic - variables, strings etc. (crash course)

public class JavaCourse {
    public static void main(String[] args) {
        System.out.println("Hello, today date: ");
        System.out.println(java.time.LocalDate.now());

        System.out.println("And time: ");
        System.out.println(java.time.LocalTime.now());

        String stringvariable = "Thank You!!!";
                System.out.println(stringvariable);

        System.out.println();

        exple();
        arrayExample();
    }

    private static String getsomeText() {
        return "So far so good";
    }

    private static void arrayExample(){
        String[] carNames={"Tojota", "Nissan", "BMW", "Lada"};
        System.out.println(carNames[2]);

        carNames[2] = "Tesla";
    }

    private static void exple(){
        Map<Integer, String> people= new HashMap<Integer, String>();
        people.put(11, "Rembo");
        people.put(444, "Alex");

        System.out.println(people);

    }

}