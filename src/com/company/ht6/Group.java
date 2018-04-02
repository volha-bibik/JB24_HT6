package com.company.ht6;

public class Group {
    private int groupSize;
    private Student[] studentsArray;

    Group(int groupSize) {
        this.setGroupSize(groupSize);
        this.setStudentsArray();
    }

    private void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }
    public int getGroupSize() {
        return groupSize;
    }

    private void setStudentsArray() {
        this.studentsArray = new Student[groupSize];
        for (int i = 0; i < groupSize; i++) {
            studentsArray[i] = new Student();
            studentsArray[i].setPhysics(2 + (int) (Math.random() * 8));
            studentsArray[i].setMath(2 + (int) (Math.random() * 8));
            studentsArray[i].setLogic(2 + (int) (Math.random() * 8));
            studentsArray[i].setEconomy(2 + (int) (Math.random() * 8));
            studentsArray[i].setEnglish(2 + (int) (Math.random() * 8));
        }
    }

    public double avrScoreGroup() {
        double avrGroup = 0;
        for (int i = 0; i < studentsArray.length; i++) {
            avrGroup +=  studentsArray[i].avrStudent();
        }
        return avrGroup/groupSize;
    }

    public void printStudentsArray() {
        System.out.println("Group: ");
        for(int i = 0; i < studentsArray.length; i++) {
            System.out.print("Student" + (i+1) + ": ");
            studentsArray[i].printStudent();
        }
    }

    public int numberOfExcellent() {
        int numberOfExcellent = 0;
        for (int i = 0; i < studentsArray.length; i++) {
            if(studentsArray[i].isExcellent()) {
                numberOfExcellent++;
            }
        }
        return numberOfExcellent;
    }

    public int numberOf2() {
        int numberOf2 = 0;
        for (int i = 0; i < studentsArray.length; i++) {
            if(studentsArray[i].is2()) {
                numberOf2++;
            }
        }
        return numberOf2;
    }
}
