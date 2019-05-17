package chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * 코드 넘겨주기 예제
 */
public class AfterJava8Example1 {

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 50;
    }

    /**
     * 명확히 하기 위해 추가함(보통 java.util.funtion에서 임포트.
     *
     * @param <T>
     */
    public interface Predicate<T> {
        boolean test(T t);
    }

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 호출
        List<Apple> inventory = new ArrayList<>();

        filterApples(inventory, AfterJava8Example1::isGreenApple);
        filterApples(inventory, AfterJava8Example1::isHeavyApple);
    }

    private class Apple {
        private String name;
        private String color;
        private int weight;

        public int getWeight() {
            return weight;
        }

        public Apple(String name, String color, int weight) {
            this.name = name;
            this.color = color;
            this.weight = weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

}
