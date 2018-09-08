package Generic;

public class MultiGenericClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MultiGenericContainer<String, String> weather = new MultiGenericContainer<>("Monday", "Sunny");
        MultiGenericContainer<Integer, Double> dayOfWeekDegrees = new MultiGenericContainer<>(1, 78.0);

        String mondayForcast = weather.getFirst();
        //int mondayWeather = Integer.parseInt(weather.getSecond());
        System.out.println(mondayForcast);
        double degree = dayOfWeekDegrees.getSecond();
        System.out.println(degree);
    }

}

class MultiGenericContainer<T, S> {
    private T first;
    private S second;

    public MultiGenericContainer(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

}
