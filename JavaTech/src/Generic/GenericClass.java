package Generic;


import java.util.ArrayList;
import java.util.List;

public class GenericClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GenericContainer<Integer> myInt = new GenericContainer<>();

        myInt.setObj(3);
        System.out.println(myInt.getObj().toString());

        //myInt.setObj("2");

        List<GenericContainer> list = new ArrayList<>();
        for (int x = 0; x <= 10; x++) {
            GenericContainer<String> myGeneric = new GenericContainer<>();
            myGeneric.setObj("Generic Test" + x);
            list.add(myGeneric);
        }

        for (GenericContainer<String> obj : list) {
            String str = obj.getObj();
            System.out.println(str);

        }

        List<GenericContainer> list2 = new ArrayList<>();
        for (int x = 0; x <= 10; x++) {
            GenericContainer<Integer> myGeneric2 = new GenericContainer<>();
            myGeneric2.setObj(x);
            list2.add(myGeneric2);
        }

        for (GenericContainer<Integer> obj : list2) {
            int value = obj.getObj();
            System.out.println("Generic Integer: " + value);
        }

        GenericContainer<Integer> gc1 = new GenericContainer<>(3);
        System.out.println(gc1.getObj().toString());

        GenericContainer<String> gc2 = new GenericContainer<>("String");
        System.out.println(gc2.getObj().toString());

    }

}

class GenericContainer<T> {
    private T obj;

    public GenericContainer() {

    }

    public GenericContainer(T t) {
        obj = t;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T t) {
        obj = t;
    }
}
