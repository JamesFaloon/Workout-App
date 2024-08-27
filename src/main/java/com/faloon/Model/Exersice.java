package com.faloon.Model;




public class Exersice {
	
	
	protected String exersiceName;
    protected int sets;
    protected int reps;
    protected String[] musclesHit;



    Exersice(String name, int sets, int reps, String[] musclesHit) {
        this.exersiceName = name;
        this.sets = sets;
        this.reps = reps;
        this.musclesHit = musclesHit;
    }

    // Getter and Setter for exersiceName
    public String getExersiceName() {
        return exersiceName;
    }

    public void setExersiceName(String exersiceName) {
        this.exersiceName = exersiceName;
    }

    // Getter and Setter for sets
    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    // Getter and Setter for reps
    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    // Getter and Setter for musclesHit
    public String[] getMusclesHit() {
        return musclesHit;
    }

    public void setMusclesHit(String[] musclesHit) {
        this.musclesHit = musclesHit;
    }

}
