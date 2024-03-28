package magicBox;

import org.jsoup.select.Evaluator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MagicBoxDemo {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
        //magicBox.setObject(1);
        // magicBox.setObject("abc");
        //magicBox.setObject(LocalDate.now());
        //magicBox.setObject(new ArrayList<String>(Arrays.asList("hocus", "pocus","lumus")));
        magicBox.setObject(new MagicBox());
        System.out.println(magicBox.getObject());

        Object object = magicBox.getObject();
        System.out.println(object.getClass());

        Class clazz = object.getClass();//reflexion
        System.out.println(clazz);

        MagicBoxGeneric<Integer> magicBoxGeneric = new MagicBoxGeneric<>();
        magicBoxGeneric.setObject(1);
        System.out.println(magicBoxGeneric.getObject());

        MagicBoxGeneric<MagicBoxGeneric<Integer>> magicBoxGeneric1 = new MagicBoxGeneric<>();
    magicBoxGeneric1.setObject(new MagicBoxGeneric<>());
    magicBoxGeneric1.getObject().setObject(1);
        System.out.println(magicBoxGeneric1.getObject().getObject());
    }
}

class MagicBox { //контейнер
    private Object object; //Mатрешка

    @Override
    public String toString() {
        return "MagicBox{" +
                "object=" + object +
                '}';
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
class MagicBoxGeneric<T>{
        private T object;
        public T getObject(){
            return object;
        }

    public void setObject(T object) {
        this.object = object;
    }
}

