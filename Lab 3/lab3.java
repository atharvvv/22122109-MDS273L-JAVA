import java.util.Scanner;

public class lab3 {

    static float meanfunc(int[] newarray1) {
        int sum = 0, count = 0;
        float mean = 0;
        for (int i = 0; i < newarray1.length; i++) {
            sum += newarray1[i];
            count++;
            mean = (sum / count);

        }
        return mean;
    }

    static int modefunc(int[] newarray1) {
        int maxValue = 0;
        int maxCount = 0, i, j;

        for (i = 0; i < newarray1.length; ++i) {
            int count = 0;
            for (j = 0; j < newarray1.length; ++j) {
                if (newarray1[j] == newarray1[i]) {
                    ++count;

                }
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = newarray1[i];
                    
                }

            }
        }
        return maxValue;

    }
    static int medianfunc(int[] newarray1) {
        int m=0;
        if(newarray1.length%2==0){
            m = newarray1[(newarray1.length/2)-1];
        }else{
            m = newarray1[((newarray1.length+1)/2)-1];
        } return m;
        
        // }if else
        // {
        //     m=(newarray1[newarray1.length/2-1]+newarray1[newarray1.length/2])/2;
        // }return m;



    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int a = 1;
        System.out.println("Enter the size of your array");
        int sizenumber = myobj.nextInt();

        int newarray1[] = new int[sizenumber];
        for (int i = 0; i < newarray1.length; i++) {
            System.out.println("enter the new value  you want to print");
            newarray1[i] = myobj.nextInt();
        }

        do {
            System.out.println("Menu to Calculate Mean , Median and Mode");
            System.out.println("Press 1. to Calculate mean");
            System.out.println("Press 2. to Calculate mode");
            System.out.println("Press 3. to Calculate medium");
            int selectmeanu = myobj.nextInt();
            System.out.println("=============================================================================================");
            switch (selectmeanu) {
                case 1:
                    System.out.println("Mean of the array is" +meanfunc(newarray1));
                    break;

                case 2:
                    System.out.println("Mode of the array is " +modefunc(newarray1));
                    break;

                case 3:
                System.out.println("Mdeian of the array is " +medianfunc(newarray1));
                    break;

                case 4:
                    System.out.println("CASE 4");
                    break;

            }

            System.out.println("print 0 to exit or 1 to continue");
            a = myobj.nextInt();
        } while (a == 1);

    }

}
