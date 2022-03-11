package com.company;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeSet<City> code = new TreeSet<>();

        City city1 = new City(312,"Bishkek");
        City city2 = new City(543,"Berlin");
        City city3 = new City(872,"New-York");
        City city4 = new City(361,"Vena");
        City city5 = new City(932,"Moskow");

        code.add(city1);
        code.add(city2);
        code.add(city3);
        code.add(city4);
        code.add(city5);

        System.out.println(code);

    }
}
