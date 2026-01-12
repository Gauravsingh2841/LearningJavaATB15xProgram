package exam_11th_Jan_2026;

public class print_Even_Number_Do_While {
    public static void main(String[] args){
        int num = 1;
        do{
            if(num%2==0)
            {
                System.out.println(num);
            }
            num++;
        }while (num<=50);
    }
}
