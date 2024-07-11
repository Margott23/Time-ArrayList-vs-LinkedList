import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int length = sc.nextInt();
        System.out.println(getTimeToAddInFirstArrayList(length));
        System.out.println(getTimeToAddInMiddleArrayList(length));
        System.out.println(getTimeToAddInFineArrayList(length));
        System.out.println(getTimeToAddInFirstLinkedList(length));
        System.out.println(getTimeToAddInMiddleLinkedList(length));
        System.out.println(getTimeToAddInFineLinkedList(length));
        sc.close();
    }

    /**
     * Создает и добавляет в конец коллекции элемент: Math.random() * 1000 количеством раз, переданном в аргументе.
     * Возвращает строковое представление времени выполнения метода для указанного количества элементов коллекции.
     *
     * @param lengthList number of items in the collection
     * @return String "Time ArrayList: add in fine = time ms", where "time" - method execution time.
     */
    static String getTimeToAddInFineArrayList(int lengthList) {
        Date startTime = new Date();
        List<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i < lengthList; i++) {
            doubleArrayList.add(Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time ArrayList: add in fine = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    /**
     * Создает и добавляет в начало коллекции элемент: Math.random() * 1000 количеством раз, переданном в аргументе.
     * Возвращает строковое представление времени выполнения метода для указанного количества элементов коллекции.
     *
     * @param lengthList number of items in the collection
     * @return String "Time ArrayList: add in fine = time ms", where "time" - method execution time.
     */
    static String getTimeToAddInFirstArrayList(int lengthList) {
        Date startTime = new Date();
        List<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i < lengthList; i++) {
            doubleArrayList.add(0, Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time ArrayList: add in first = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    /**
     * Создает и добавляет в середину коллекции элемент: Math.random() * 1000 количеством раз, переданном в аргументе.
     * Возвращает строковое представление времени выполнения метода для указанного количества элементов коллекции.
     *
     * @param lengthList number of items in the collection
     * @return String "Time ArrayList: add in fine = time ms", where "time" - method execution time.
     */
    static String getTimeToAddInMiddleArrayList(int lengthList) {
        Date startTime = new Date();
        List<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i < lengthList; i++) {
            doubleArrayList.add(i / 2, Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time ArrayList: add in middle = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    /**
     * Создает и добавляет в конец коллекции элемент: Math.random() * 1000 количеством раз, переданном в аргументе.
     * Возвращает строковое представление времени выполнения метода для указанного количества элементов коллекции.
     *
     * @param lengthList number of items in the collection
     * @return String "Time ArrayList: add in fine = time ms", where "time" - method execution time.
     */
    static String getTimeToAddInFineLinkedList(int lengthList) {
        Date startTime = new Date();
        List<Double> doubleLinkedList = new LinkedList<>();
        for (int i = 0; i < lengthList; i++) {
            doubleLinkedList.add(Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time LinkedList: add in fine = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    /**
     * Создает и добавляет в начало коллекции элемент: Math.random() * 1000 количеством раз, переданном в аргументе.
     * Возвращает строковое представление времени выполнения метода для указанного количества элементов коллекции.
     *
     * @param lengthList number of items in the collection
     * @return String "Time ArrayList: add in fine = time ms", where "time" - method execution time.
     */
    static String getTimeToAddInFirstLinkedList(int lengthList) {
        Date startTime = new Date();
        List<Double> doubleLinkedList = new LinkedList<>();
        for (int i = 0; i < lengthList; i++) {
            doubleLinkedList.add(0, Math.random() * 1000);
        }
        Date finishTime = new Date();
        return "Time LinkedList: add in first = " + (finishTime.getTime() - startTime.getTime()) + "ms";
    }

    /**
     * Создает и добавляет в середину коллекции элемент: Math.random() * 1000 количеством раз, переданном в аргументе.
     * Возвращает строковое представление времени выполнения метода для указанного количества элементов коллекции.
     *
     * @param lengthList number of items in the collection
     * @return String "Time ArrayList: add in fine = time ms", where "time" - method execution time.
     */
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