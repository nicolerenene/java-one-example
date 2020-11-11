public class MathDemo {
    public static void main(String[] arg) {
        int result = 1 + 2;
        // result is 3
        System.out.println("1 + 2 = " + result);
        int originalResult = result;

        result = result - 1;
        // result is 2
        System.out.println(originalResult + " - 1 = " + result);
        originalResult = result;

        result = result * 2;
        // result is 4
        System.out.println(originalResult + " * 2 = " + result);
        originalResult = result;

        result = result / 2;
        //result is 2
        System.out.println(originalResult + " / 2 = " + result);
        originalResult = result;

        result = result + 8;
        //result is 10
        System.out.println(originalResult + " + 8 = " + result);
        originalResult = result;

        result = result % 7;
        //result is 3
        System.out.println(originalResult + " % 7 = " + result);
        originalResult = result;

    }
    
}
