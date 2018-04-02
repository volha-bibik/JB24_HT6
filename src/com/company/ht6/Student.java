package com.company.ht6;

public class Student {
    private int physics;
    private int math;
    private int logic;
    private int english;
    private int economy;
    public static int numberOfExams = 5;

    Student() {
        this(0, 0, 0, 0, 0);
    }

    Student(int physics, int math, int logic, int english, int economy) {
        this.physics = physics;
        this.math = math;
        this.logic = logic;
        this.english = english;
        this.economy = economy;
    }

    public int getPhysics() {
        return this.physics;
    }
    public int getMath() {
        return this.math;
    }
    public int getLogic() {
        return this.logic;
    }
    public int getEnglish() {
        return this.english;
    }
    public int getEconomy() {
        return this.economy;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public void setLogic(int logic) {
        this.logic = logic;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public void setEconomy(int economy) {
        this.economy = economy;
    }

    public void printStudent() {
        System.out.print("\tPhythics - " + this.physics);
        System.out.print("\tMath - " + this.math);
        System.out.print("\tLogic - " + this.logic);
        System.out.print("\tEnglish - " + this.english);
        System.out.print("\tEconomy - " + this.economy);
        System.out.println("\tAverage - " + this.avrStudent());
    }

    public double avrStudent() {
        double avrStudent = 0;
        avrStudent +=  this.getPhysics();
        avrStudent +=  this.getMath();
        avrStudent +=  this.getLogic();
        avrStudent +=  this.getEnglish();
        avrStudent +=  this.getEconomy();
        avrStudent /= this.numberOfExams;
        return avrStudent;
    }

    public boolean isExcellent() {
        if(getPhysics() > 8 && getMath() > 8 && getLogic() > 8 && getEconomy() > 8 && getEnglish() > 8) {
            return true;
        } else {
            return false;
        }
    }

    public boolean is2() {
        if(getPhysics() < 4 || getMath() < 4 || getLogic() < 4 || getEconomy() < 4 || getEnglish() < 4) {
            return true;
        } else {
            return false;
        }
    }
 }
