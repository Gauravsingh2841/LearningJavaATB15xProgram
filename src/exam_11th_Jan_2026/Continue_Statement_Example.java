package exam_11th_Jan_2026;

public class Continue_Statement_Example {
    public static void main(String[] args){
        for(int i=1; i<=10; i++)
        {
            if(i==5)
            {
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
