public class power_using_recursion {

    public static int calculatePower(int num, int power) {
        if (power != 0) {

        return (num * calculatePower(num, power - 1));
        }
        else {
        return 1;
        }
        }
    public static void main(String[] args) {
        int num = 4, power = 3;
        int result = calculatePower(num, power);

        System.out.println(num + "^" + power + "=" + result);
    }
}
