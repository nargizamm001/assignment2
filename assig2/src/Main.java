import models.Employee;
import models.Payable;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Student("Nargiza", "Mnaidarova", 3));
        persons.add(new Student("Harry", "Potter", 2));

        persons.add(new Employee("Aray", "Tyulebayeva", "Presidentka", 5000000));

        Collections.sort(persons);

        printData(persons);

    }

    public static void printData(Iterable<Person> payables) {
        payables.forEach(payable -> {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        });
    }

}
