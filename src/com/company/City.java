package com.company;

import java.sql.SQLOutput;

public class City implements Comparable<City>{

    private int codeOfCity;
    private String nameOfCity;

    public City() {
    }

    public City(int codeOfCity, String nameOfCity) {
        this.codeOfCity = codeOfCity;
        this.nameOfCity = nameOfCity;
    }

    public int getCodeOfCity() {
        return codeOfCity;
    }

    public void setCodeOfCity(int codeOfCity) {
        this.codeOfCity = codeOfCity;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }


    @Override
    public String toString() {
        return "\nCity{" +
                "codeOfCity=" + codeOfCity +
                ", nameOfCity='" + nameOfCity + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return this.getCodeOfCity() < o.codeOfCity? 1 : -1;
    }
}
