public class Arithmetic {

    public static void main(String[] args) {
        //** используя  арифметические  операторы  (+,  -,  *,  /,  div,  mod),  а  также  функции  round(),  trunc()  и  abs(),  составляем  арифметические  выражения  для  вычисления  следующей  величины:
        // 1.  n-e  чётное  число  (первым  считается  2,  второе  4  и  т.д.)
        // 2.n-е  нечётное  число  (первое  равно  1,  второе  3  и  т.д.)
        // 3. В  очереди  стоят  n  людей,  сколько  человек  находится  между  i -м  и  к-м  в  очереди.
        // 4.Сколько  нечетных  чисел  на  отрезке  (a,  b),  если  a  и  b  –  четные?  Если  а  и  б  –  нечетные?  а  –четное,  б  –  нечетное?
        // 5.Сколько  полных  минут  и  часов  составляют  х  секунд  ?
        // 6. В  доме  9  этажей,  на  каждом  этаже  по одному  подъезду  по  4  квартиры.  В  каком  подъезде  и  на  каком  этаже  находится  н-я  квартира.
        // 7.  Старинными  русскими  денежными  единицами  являются:  1  рубль  –  100  копеек,  1  гривна  –  10  копеек,  1  алтын  –  3  копейки,  1  полушка  –  0,25  копейки.  Имеется  копейка  .  Запишите  выражения  для  представления  суммы в  рублях , гривнах, алтынах и полушках.
        // 8.         Вращение стрелки  прибора  происходит  с  постоянной  скоростью,  делая  обороты в  секунду (не обязательно стрелка прибора, может быть это волчок в игре « Что? Где? Когда?» и т.п.) Угол поворота стрелки в нулевой момент времени примем за 0. Каков будет угол поворота через t секунд?
        // 9. Вы стоите на краю дороги и от вас до ближайшего фонарного столба на x метров. Расстояние между столбами и метров. На каком расстоянии от вас находится n-й столб?
        // 10. Та же ситуация, что и в предыдущей задаче. Длина вашего шага z метров. Мимо скольких столбов вы пройдете, предпримите n шагов.

        int n=3;
        System.out.println(n*2);

        int m=4;
        System.out.println(m*2-1);

        int i=5, k=12;
        System.out.println(k-i-1);

        int a=4, b=11;
        System.out.println((b-a)/2);
        if (a%2==1&&b%2==1)
            System.out.println((b-a)/2-1);
        else System.out.println((b-a)/2);

        int floors=9;
                int flats=4;
        int number = 5;
        int entrance=(number-1)/(floors*flats);
        int floor=(number-1)%(floors*flats)/flats;
        System.out.println(entrance+1);
        System.out.println(floor+1);

        double w=0.5; //об.сек.
        double t=1; //сек
        double fi=w*t*360;
        System.out.println(fi);

        double x=10;
        double y=30, p=3;
        System.out.println((p-1)*y+x);

        double h=0.9, n1=10;
        System.out.println(Math.floor((h*n1-x)/y+1));
double j=1.2;
        System.out.println(Math.round(j));
        System.out.println(Math.floor(j));
        System.out.println(Math.ceil(j)+" "+(int)x);
    }
}
