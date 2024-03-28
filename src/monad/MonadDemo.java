package monad;


import java.util.function.Function;

public class MonadDemo {
    public static void main(String[] args) {
Monad<Integer> x = new Monad<>(1);
Monad<Integer> s = (Monad<Integer>) x.bind(v->new Monad<>(v*2));
Monad<Double> r = (Monad<Double>) s.bind(v->new Monad<>(v.doubleValue()*3));

        System.out.println(r.getObj());
    }
}
interface IMonad<T>{
    <U> IMonad<U> bind(Function<T,Monad<U>> f);
}
class Monad<T> implements IMonad<T> {
    private T obj;

    public Monad(T obj) {
        this.obj = obj;
    }
    @Override
    public <U> IMonad<U> bind(Function<T, Monad<U>> f) {
        if (obj == null)
            return new Monad<U>(null);
        return f.apply(obj);
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}