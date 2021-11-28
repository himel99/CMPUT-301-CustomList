package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }


    /**
     * Return the size of city list
     * @return
     *      size of city list
     */
    public int countCities(){
        return cities.size();
    }


    /**
     * delete a city object from the list if exists, else throw an exception
     * @param city
     *      This is a candidate city to be deleted if exists in the list
     */
    public void deleteCity(City city){
        try{
            cities.remove(city);
        }
        catch (Exception exp){
            System.out.println("Exception : " + exp.toString() );
        }
    }


}
