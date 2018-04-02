package com.company.ht6;

public class StartWork {
    public static void main(String[] args) {
        Group group1 = new Group(5);
        group1.printStudentsArray();
        Group group2 = new Group(10);
        group2.printStudentsArray();

        System.out.println("Average score group 1: " + group1.avrScoreGroup() + "\tNumber of excellent students: " + group1.numberOfExcellent() + "\tNumber of '2': " + group1.numberOf2());
        System.out.println("Average score group 2: " + group2.avrScoreGroup() + "\tNumber of excellent students: " + group2.numberOfExcellent() + "\tNumber of '2': " + group2.numberOf2());

    }
}
