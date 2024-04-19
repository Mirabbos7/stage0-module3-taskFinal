package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int result;
        int first = number % 10;
        int second = (number / 10) % 10;
        int third = number / 100;
        result = Integer.parseInt(first + "" + second + "" + third);
        System.out.println(result);
    }
}
