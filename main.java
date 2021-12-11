public class main {

    public static void main(String[] args) {

        Arithmetic quadrate = new Arithmetic(7,1);
        quadrate.print("Расчет");
        int perimeter = quadrate.getPerimeter();
        int square = quadrate.getSquare();
        int max = quadrate.getMax();
        int min = quadrate.getMin();

        System.out.println("периметр = " + perimeter);
        System.out.println("площадь = " + square);
        System.out.println("максимальное значение = " + max);
        System.out.println("минмиальное значение = " + min);
    }
}
