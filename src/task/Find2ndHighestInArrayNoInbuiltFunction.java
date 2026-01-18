package task;

public class Find2ndHighestInArrayNoInbuiltFunction {
    public static void main(String[] args){
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max = numbers[0];
        int secondMax = numbers[0];
        for(int i : numbers)
        {
            if(i > max)
            {
                max = i;
            }
        }
        for(int i : numbers)
        {
            if((i != max) && (i > secondMax))
            {
                secondMax = i;
            }
        }
        System.out.println("The 2nd highest number is array is: " + secondMax);

    }
}
