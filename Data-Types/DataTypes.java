public class DataTypes{
    public static void main(String[] args){
        final int[] INPUT = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        String sumString = "0";
        double sumDouble = 0.0;

        for(int i = 0; i < INPUT.length; i++){
            sum += INPUT[i];
            sumString = Integer.toString((Integer.parseInt(sumString) + INPUT[i]));
            sumDouble += INPUT[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Sum String: " + sumString);
        System.out.println("Sum Double: " + sumDouble);
    }
}