package Generic;


import java.util.ArrayList;
import java.util.List;

public class UpperBoundGenericClass {

    public static void main(String[] args) {

        GenericNumberContainer<Integer> gn = new GenericNumberContainer<>();
        gn.setObj(3);
        System.out.println(gn.getObj().toString());

        GenericNumberContainer<Double> gf = new GenericNumberContainer<>();
        gf.setObj(3.0);
        System.out.println(gf.getObj().toString());
        //GenericNumberContainer<String> gs = new GenericNumberContainer<>();

        double gv = GenericNumberContainer.add(3, 5f);
        System.out.println(gv);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        GenericNumberContainer.checkList(intList, 3);
        GenericNumberContainer.checkList(intList, 4);
        GenericNumberContainer.checkNumber(intList, 3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.add(2.0);
        doubleList.add(3.0);
        GenericNumberContainer.checkList(doubleList, 3.0);
        GenericNumberContainer.checkList(doubleList, 4);
        GenericNumberContainer.checkNumber(doubleList, 3.0);


        List<String> strList = new ArrayList<>();
        strList.add("one");
        strList.add("two");
        strList.add("three");
        GenericNumberContainer.checkList(strList, "three");
        GenericNumberContainer.checkList(strList, "four");
        //GenericNumberContainer.checkNumber(strList, "one");


        List<Object> objList = new ArrayList<Object>();
        objList.add("two");
        objList.add("four");
        objList.add(strList);
        GenericNumberContainer.checkList(objList, "four");

        GenericNumberContainer.checkList(objList, strList);
        //GenericNumberContainer.checkNumber(objList, "four");

    }

}

class GenericNumberContainer<T extends Number> {
    private T obj;

    public GenericNumberContainer() {

    }

    public GenericNumberContainer(T obj) {
        super();
        this.obj = obj;
    }

    public static <T extends Number> double add(T a, T b) {

        double sum = 0;
        sum = a.doubleValue() + b.doubleValue();
        return sum;
    }

    public static <T> void checkList(List<?> myList, T obj) {

        if (myList.contains(obj)) {
            System.out.println("contain element: " + obj);
        } else {
            System.out.println("Do not contain element: " + obj);

        }
    }

    public static <T> void checkNumber(List<? extends Number> myList, T obj) {
        if (myList.contains(obj)) {
            System.out.println("contain element: " + obj);
        } else {
            System.out.println("Do not contain element: " + obj);

        }
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
