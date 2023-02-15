## Name: Atharva Vetal
## Registration no: 22122109
## Lab 3


## Description of program: 
Java program to calculate Mean , Median and Mode using functions and user input array

## Code snippet:
import java.util.Scanner;

public class lab3 {

    static float meanfunc(int[] newarray1) { //function to calculate mean
        int sum = 0, count = 0;
        float mean = 0;
        for (int i = 0; i < newarray1.length; i++) {  //take a for loop to itterate through every element and add
            sum += newarray1[i]; // sum if element
            count++;
            mean = (sum / count); //To calculate mean

        }
        return mean; 
    }

    static int modefunc(int[] newarray1) { //Function to calculate mode
        int maxValue = 0;
        int maxCount = 0, i, j;

        for (i = 0; i < newarray1.length; ++i) { //Taking first loop to choose element from array
            int count = 0;

            for (j = 0; j < newarray1.length; ++j) { //Taking second loop to compare elements in array

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
    static int medianfunc(int[] newarray1) { //Taking function to calculate median
        int m=0;
        if(newarray1.length%2==0){
            m = newarray1[(newarray1.length/2)-1]; //to choose middle element from array
        }else{
            m = newarray1[((newarray1.length+1)/2)-1];
        } return m;
        


       



    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int a = 1;

        System.out.println("Enter the size of your array");
        int sizenumber = myobj.nextInt();
        System.out.println("**************************************************************");


        int newarray1[] = new int[sizenumber];   // intializing empty array with element size
        for (int i = 0; i < newarray1.length; i++) {   //for loop to itterate through empty array
            System.out.println("enter the new value  you want to print");
            newarray1[i] = myobj.nextInt(); // user input array
        }

        do {  // take do while loop
            
            System.out.println("===========================================");
            System.out.println("================MENU FOR CALCULATION=======");
            System.out.println("===========================================");
         



            System.out.println("Menu to Calculate Mean , Median and Mode"); // meanu to choose mean median and mode
            System.out.println("Press 1. to Calculate mean"); 
            System.out.println("Press 2. to Calculate mode");
            System.out.println("Press 3. to Calculate medium");
            int selectmeanu = myobj.nextInt();
            System.out.println("====================================CALCULATION FOR MEAN , MEDIAN AND MODE=========================================================");
            switch (selectmeanu) {   //Swtich statement to choose what to do
                case 1:
                    System.out.println("Mean of the array is " +meanfunc(newarray1)); // to call mean function
                    break;

                case 2:
                    System.out.println("Mode of the array is " +modefunc(newarray1)); // to call mode function
                    break;

                case 3:
                System.out.println("Median of the array is " +medianfunc(newarray1)); // to call median function
                    break;

                case 4:
                    System.out.println("CASE 4");
                    break;

            }

            System.out.println("print 0 to exit or 1 to continue");
            a = myobj.nextInt();
        } while (a == 1); // to exit loop or continue

    }

}


## Code Output:
Enter the size of your array
5               
**************************************************************
enter the new value  you want to print
1
enter the new value  you want to print
3
enter the new value  you want to print
4
enter the new value  you want to print
4
enter the new value  you want to print
4
===========================================
================MENU FOR CALCULATION=======
===========================================
Menu to Calculate Mean , Median and Mode
Press 1. to Calculate mean
Press 2. to Calculate mode
Press 3. to Calculate medium
1
====================================CALCULATION FOR MEAN , MEDIAN AND MODE=========================================================
Mean of the array is 3.0
print 0 to exit or 1 to continue
1
===========================================
================MENU FOR CALCULATION=======
===========================================
Menu to Calculate Mean , Median and Mode
Press 1. to Calculate mean
Press 2. to Calculate mode
Press 3. to Calculate medium
2
====================================CALCULATION FOR MEAN , MEDIAN AND MODE=========================================================
Mode of the array is 4
print 0 to exit or 1 to continue
1
===========================================
================MENU FOR CALCULATION=======
===========================================
Menu to Calculate Mean , Median and Mode
Press 1. to Calculate mean
Press 2. to Calculate mode
Press 3. to Calculate medium
3
====================================CALCULATION FOR MEAN , MEDIAN AND MODE=========================================================
Median of the array is 4
print 0 to exit or 1 to continue


22122109 lab3.drawio.png

