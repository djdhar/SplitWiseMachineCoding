import group.Group;
import manager.Calculator;
import manager.Distributor;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(0, "A", 0.0);
        Person p2 = new Person(1, "B", 0.0);
        Person p3 = new Person(2, "C", 0.0);
        Person p4 = new Person(3, "D", 0.0);
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p1);
        personArrayList.add(p2);
        personArrayList.add(p3);
        personArrayList.add(p4);

        Group g = new Group("G1", personArrayList);
        System.out.println(g);
        ArrayList<Double> percentage = new ArrayList<>();
        percentage.add(12.0);
        percentage.add(18.0);
        percentage.add(50.0);
        percentage.add(20.0);

        Distributor distributor = new Distributor();
        distributor.distributeByPercentage(
                percentage, 2, 500, g
        );
        System.out.println(g);
        System.out.println(new Calculator().getGroupCredit(g));
        distributor.distributeEqually(1, 400, g);
        System.out.println(g);
        System.out.println(new Calculator().getGroupCredit(g));
        distributor.distributeEqually(2, 400, g);
        System.out.println(g);
        System.out.println(new Calculator().getGroupCredit(g));
        distributor.distributeEqually(3, 571, g);
        System.out.println(g);
        System.out.println(new Calculator().getGroupCredit(g));
    }


}
