import java.util.Arrays;

public class MultiDimensionArray {

    public static void main(String [] args) {
       //Normal Int Array
        int [] values = new int[4];


        // 2 dimension Array with fixed size
        int [][] valuesTwoDimension = new int[4][3];  //={ {1,2,3}, {4,5,6}, {6,7,8}, {10,11,12}}

        //3 dimension Array
        int [][][] valuesThreeDimensionArray = new int[4][3][2]; // {{ {1}, {2}, },{ {3},{4}},{ {5},{6}, }}


        //Assign Values to array
        for (int i=0;i<values.length;i++){
            values[i] = i;
        }

        //Loop Through Array Printing Values in Normal Order
       for (int j = 0;j<values.length;j++){
           System.out.println(values[j]+"");
       }

       System.out.println("Reversed Looping");

       // Loop Through Array Printing Values in Reversed Order
       for (int j = values.length-1;j>=0;j--){
           System.out.println(values[j]+"");
       }

        int random = 0;

       //Assign Values to two dimensional array
        for (int k=0;k<4;k++){
            for (int n=0;n<3;n++){
                valuesTwoDimension[k][n]=random;
                random++;
            }
        }

        //AssignValue to Three Dimension Array
        for (int a=0;a<4;a++){
            for (int b=0;b<3;b++){
                for (int c=0;c<2;c++){
                    valuesThreeDimensionArray[a][b][c]=random;
                    random++;
                }
            }
        }

        System.out.println("Print Values From the Two Dimension"+"\n");

        for (int l=0;l<4;l++){
            System.out.println(Arrays.toString(valuesTwoDimension[l])+"");
        }

        System.out.println("Print Values From the Three Dimension"+"\n");

        for (int t=0;t<4;t++){

            for (int z=0;z<3;z++){
                System.out.println(Arrays.toString(valuesThreeDimensionArray[t][z])+"");
            }
        }

    }
}
