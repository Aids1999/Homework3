package com.example.myapplication66;

public class Animal {
    private String name;
    private String animalDescription;
    private String populationSize;
    private int animalRes;

    public Animal(String name, String animalDescription, int animalRes) {
        this.name = name;
        this.animalDescription = animalDescription;
        this.populationSize = populationSize;
        this.animalRes = animalRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }

    public String getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }

    public int getAnimalRes() {
        return animalRes;
    }

    public void setAnimalRes(int animalRes) {
        this.animalRes = animalRes;
    }
}
