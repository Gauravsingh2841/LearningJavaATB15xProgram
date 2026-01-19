package task;

public class PyramidPattern {
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++)
        {
            for(int space=n-1; space>=i; space--)
            {
                System.out.print(" ");
            }
            for(int star=0; star<=i; star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
