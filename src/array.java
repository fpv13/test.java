import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter number array");
        int length = sc.nextInt();
        int[] array = new int[length];

        for(int i=0;i<length;i++){
            System.out.println("Enter"+i+": ");
            array[i]=sc.nextInt();
            if(array[i]%4==0){
                sum=sum+array[i];
                }
        }

        System.out.println("Summa cratno 4 is"+sum);
    }
}
