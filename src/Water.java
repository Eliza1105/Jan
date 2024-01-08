public class Water {
    public static void main(String[] args) {
        int temp=55;
        if (temp<0) System.out.println("Твердое состояние");
        else if ((temp<=100)&&(0<temp)) System.out.println("Жидкое состояние");
        else System.out.println("Газообразное сосояние");
    }
}
