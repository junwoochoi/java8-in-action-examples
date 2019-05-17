package chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * 코드 넘겨주기 예제
 */
public class BeforeJava8Example1 {

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 50) {
                result.add(apple);
            }
        }
        return result;
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
