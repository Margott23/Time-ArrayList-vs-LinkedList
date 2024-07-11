import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getTimeToAddInFirstArrayList(100000));
        System.out.println(getTimeToAddInMiddleArrayList(100000));
        System.out.println(getTimeToAddInFineArrayList(100000));
        System.out.println(getTimeToAddInFirstLinkedList(100000));
        System.out.println(getTimeToAddInMiddleLinkedList(100000));
        System.out.println(getTimeToAddInFineLinkedList(100000));
}

    static String getTimeToAddInFineArrayList(int lengthArrayList) {
        Date startTime = new Date();
        List<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i < lengthArrayList; i++) {
            doubleArrayList.add(Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time ArrayList: add in fine = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    static String getTimeToAddInFirstArrayList(int lengthArrayList) {
        Date startTime = new Date();
        List<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i < lengthArrayList; i++) {
            doubleArrayList.add(0, Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time ArrayList: add in first = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    static String getTimeToAddInMiddleArrayList(int lengthArrayList) {
        Date startTime = new Date();
        List<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i < lengthArrayList; i++) {
            doubleArrayList.add(i / 2, Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time ArrayList: add in middle = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    static String getTimeToAddInFineLinkedList(int lengthList) {
        Date startTime = new Date();
        List<Double> doubleLinkedList = new LinkedList<>();
        for (int i = 0; i < lengthList; i++) {
            doubleLinkedList.add(Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time LinkedList: add in fine = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    static String getTimeToAddInFirstLinkedList(int lengthList) {
        Date startTime = new Date();
        List<Double> doubleLinkedList = new LinkedList<>();
        for (int i = 0; i < lengthList; i++) {
            doubleLinkedList.add(0, Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time LinkedList: add in first = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    static String getTimeToAddInMiddleLinkedList(int lengthList) {
        Date startTime = new Date();
        List<Double> doubleLinkedList = new LinkedList<>();
        for (int i = 0; i < lengthList; i++) {
            doubleLinkedList.add(i / 2, Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time LinkedList: add in middle = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }
}