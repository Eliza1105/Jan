package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        /*Stack<String> stack = new Stack<>();
        stack.push("1");
        String s = stack.pop();*/

        //Упаковка большой коробки
        List<Stack<String>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < 5; j++)
                stack.push(String.format("string %d", i * 5 + j));
            list.add(stack);
        }
        //Изменение 2-й строки в 1й коробке
        Stack<String> stack = list.get(1);
        String s = stack.get(3);
        stack.set(2, "String selected");

        //распакоука
        for (int i = 0; i < 3; i++) {
            Stack<String> stack1 = new Stack<>();
        while (!stack1.empty()){
            String s1= stack1.pop();
            System.out.println(s+" ");
        }
            System.out.println();
        }
    }
}
