package algor;

import java.util.Arrays;
import java.util.List;

public class Bubble {
    public static void main(String[] args) {
        int mass[] = new int[]{5,3,4,2,1,7,9,4,-4};
        int size = mass.length;
        for (int i = size-1;i >= 1;i--){
            for (int j = 0;j<i;j++){
                if(mass[j] > mass[j+1]){
                    mass[j] ^= (mass[j+1] ^= mass[j]);
                    mass[j+1] ^= mass[j];
                }
            }
        }

        System.out.println(Arrays.toString(mass));
    }
}
