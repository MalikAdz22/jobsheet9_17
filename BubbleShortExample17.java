import java.util.Scanner;

public class BubbleSortExample17 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        int[] intData = {34,18, 87, 72, 32, 54, 43};
        int temp = 0;

        for(int i=0; i<intData.length; i++){
            for(int j=1; j<intData.length; j++){
                // swap elemen
                if(intData[j-1]< intData[j]){
                    temp = intData[j];
                    intData[j] = intData[j-1];
                    intData[j-1] = temp;
                }
            }
        }

        System.out.println("Hasil pengurutan : ");
        for(int i=0; i<intData.length; i++){
            System.out.println(intData[i]);
        }
    }
}