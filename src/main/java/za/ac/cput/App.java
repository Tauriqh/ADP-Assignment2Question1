package za.ac.cput;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("List:");

        List listA = new ArrayList();

        listA.add("Tauriq");
        listA.add("Junaid");
        listA.add("James");
        listA.add("Ricky");
        listA.add(0,"John");

        System.out.println("List:" +listA+"\n");

        listA.remove("James");
        listA.remove(2);

        System.out.println("List:" +listA+"\n");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Set:");

        Set setA = new HashSet();

        setA.add("Tauriq");
        setA.add("Junaid");
        setA.add("James");
        setA.add("Ricky");

        System.out.println("Set:" +setA+"\n");

        setA.remove("James");

        System.out.println("Set:" +setA+"\n");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Map:");

        Map mapA = new HashMap();

        mapA.put("0815073883", "Tauriq");
        mapA.put("1234567890", "Junaid");
        mapA.put("0836533737", "James");
        mapA.put("0875412250", "Ricky");

        String user1 = (String)mapA.get("0815073883");
        String user2 = (String)mapA.get("1234567890");
        String user3 = (String)mapA.get("0836533737");
        String user4 = (String)mapA.get("0875412250");

        System.out.println("user1: " +user1+"\n");
        System.out.println("user2: " +user2+"\n");
        System.out.println("user3: " +user3+"\n");
        System.out.println("user4: " +user4+"\n");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Collection:");

        Collection<Car> carCollection = new HashSet<Car>();

        Car car1 = new Car("VW","Golf 7","Blue");
        Car car2 = new Car("Mazda","Rx7","White");
        Car car3 = new Car("Nissan","GTR","Black");
        Car car4 = new Car("Toyota","Supra","Red");

        carCollection.add(car1);
        carCollection.add(car2);
        carCollection.add(car3);
        carCollection.add(car4);

        System.out.println("Collection:\n" +carCollection+"\n");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
