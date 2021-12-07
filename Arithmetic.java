public class Arithmetic {

    int length;
    int height;
    int perimeter;
    int square;
    int max;
    int min;

    public Arithmetic(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public void calculatePerimeter() {
        perimeter = (length + height) * 2;
        System.out.println("Вместо суммы, как в задании, я нахожу периметр (сумма чисел, умноженная на 2) = " + perimeter);
    }

    public void calculateSquare() {
        square = length * height;
        System.out.println("Площадь или произведение чисел = " + square);
    }

    public void max() {
        if (length >= height) {
            max = length;
            System.out.println(length + " Длина больше ширины");
        } else {
            max = height;
            System.out.println(height + " Ширина больше длины");
        }
    }

    public void min() {
        if (length <= height) {
            min = length;
            System.out.println(length + " Длина меньше ширины");
        } else {
            min = height;
            System.out.println(height + " Ширина меньше длины");
        }
    }


    public void print(String result) {
        System.out.println(result);
    }

}



