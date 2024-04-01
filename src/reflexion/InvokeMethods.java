package reflexion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethods {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      // System.setSecurityManager(new SecurityManager());//сам себя ограничил в доступе к приватным методам

        Method sum = Calc.class.getMethod("sum", int.class, double.class);
        Calc calc = new Calc();
        double res = (double) sum.invoke(calc,1,2);
        System.out.println(res);

        Method mult = Calc.class.getMethod("mult", float.class, long.class);
        double res2 = (double) mult.invoke(calc,2,3);
        System.out.println(res2);

        Method and = Calc.class.getDeclaredMethod("and", boolean.class, boolean.class);
        and.setAccessible(true);
        boolean res3 = (boolean) and.invoke(calc,true,true);
        System.out.println(res3);

        Method max = Calc.class.getDeclaredMethod("max", int.class, int.class);
        //max.setAccessible(true);
        int res4 = (int) max.invoke(calc,1,2);
        System.out.println(res4);
    }
    //Класс, в котором содержатся методы с различным доступом и аргументами
    static class Calc{
        public double sum(int a, double b) {
            return a + b;
        }
        public double mult(float a, long b) {
            return a * b;
        }
        private boolean and(boolean a, boolean b) {
            return a && b;
        }
        protected int max(int a, int b) {
            return a > b ? a : b;
        }
    }
}
