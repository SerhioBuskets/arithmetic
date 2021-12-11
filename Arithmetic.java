public class Arithmetic {

    int length;
    int height;


    public Arithmetic(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getPerimeter() {
        return (length + height) * 2;
    }

    public int getSquare() {
        return length * height;
    }

    public int getMax() {
        if (length >= height) {
            return length;
        } else {
            return height;
        }
    }

    public int getMin() {
        if (length <= height) {
            return length;
        } else {
            return height;
        }
    }

    public void print(String result) {
        System.out.println(result);
    }

}



