## Name : Atharva Vetal
## Reg : 22122109
## Lab : 4

## Aim : 
This Java program calculates summary statistics for the famous Iris dataset. It provides the 5-point summary (Mean, Median, Mode, Min, and Max) for the attributes: SepalLengthCm, SepalWidthCm, PetalLengthCm, and PetalWidthCm.

## Solution:

``` import java.io.File;
import java.nio.channels.NetworkChannel;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;

public class lab7 {

    public static void main(String[] args) {
        try {
            float[] sw = new float[150];
            float[] sl = new float[150];
            float[] pl = new float[150];
            float[] pw = new float[150];

            float[] setosa_s_length = new float[50];
            float[] setosa_s_width = new float[50];
            float[] setosa_p_length = new float[50];
            float[] setosa_p_width = new float[50];

            float[] versi_sepal_length = new float[50];
            float[] versi_sepal_width = new float[50];
            float[] versi_petal_length = new float[50];
            float[] versi_petal_width = new float[50];

            float[] virgi_sepal_length = new float[50];
            float[] virgi_sepal_width = new float[50];
            float[] virgi_petal_length = new float[50];
            float[] virgi_petal_width = new float[50];

            int i = 0;

            Scanner sc = new Scanner(new File("iris.csv"));
            sc.nextLine();
            while (sc.hasNextLine()) {
                String newline = sc.nextLine();
                String[] iris = newline.split(",");
                sw[i] = Float.parseFloat(iris[2]);
                sl[i] = Float.parseFloat(iris[1]);
                pl[i] = Float.parseFloat(iris[3]);
                pw[i] = Float.parseFloat(iris[4]);

                i++;
            }

            for (int j = 0; j < 50; j++) {
                setosa_s_length[j] = sl[j];
                setosa_s_width[j] = sw[j];
                setosa_p_length[j] = pl[j];
                setosa_p_width[j] = pw[j];
            }

            for (int k = 0; k < 50; k++) {
                versi_sepal_length[k] = sl[k + 50];
                versi_sepal_width[k] = sw[k + 50];
                versi_petal_length[k] = pl[k + 50];
                versi_petal_width[k] = pw[k + 50];
            }

            for (int k = 0; k < 50; k++) {
                virgi_sepal_length[k] = sl[k + 100];
                virgi_sepal_width[k] = sw[k + 100];
                virgi_petal_length[k] = pl[k + 100];
                virgi_petal_width[k] = pw[k + 100];
            }

            // System.out.println(setosa_petal_length[1]);

            float mean_sw = calculatemean_sw(sw);
            float mean_sl = calculatemean_sl(sl);
            float mean_pl = calculatemean_pl(pl);
            float mean_pw = calculatemean_pl(pw);
            float median_sw = calculateMedian_sw(sw);
            float median_sl = calculateMedian_sl(sl);
            float median_pl = calculateMedian_pl(pl);
            float median_pw = calculateMedian_pw(pw);
            float mode_sw = calculateMode_sw(sw);
            float mode_sl = calculateMode_sl(sl);
            float mode_pl = calculateMode_pl(pl);
            float mode_pw = calculateMode_pw(pw);
            float Max_sw = Max_sw(sw);
            float Max_sl = Max_sl(sl);
            float Max_pl = Max_pl(pl);
            float Max_pw = Max_pw(pw);
            float Min_sw = Min_sw(sw);
            float Min_sl = Min_sl(sl);
            float Min_pl = Min_pl(pl);
            float Min_pw = Min_pw(pw);
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.println(
                    "                                                    MEAN                                                                                                                   ");
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.println("====================================================");
            System.out.print("Mean of sepal width :  ");
            System.out.println(mean_sw);
            System.out.println("====================================================");
            System.out.print("Mean of sepal length :  ");
            System.out.println(mean_sl);
            System.out.println("====================================================");
            System.out.print("Mean of petal length :  ");
            System.out.println(mean_pl);
            System.out.println("====================================================");
            System.out.print("Mean of petal width :  ");
            System.out.println(mean_pw);
            System.out.println("====================================================");
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.println(
                    "                                                    MEDIAN                                                                                                                   ");
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.print("Median of sepal width :  ");
            System.out.println(median_sw);
            System.out.println("====================================================");
            System.out.print("Median of sepal length :  ");
            System.out.println(median_sl);
            System.out.println("====================================================");
            System.out.print("Median of petal length :  ");
            System.out.println(median_pl);
            System.out.println("====================================================");
            System.out.print("Median of petal width :  ");
            System.out.println(median_pw);
            System.out.println("====================================================");
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.println(
                    "                                                    MODE                                                                                                              ");
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.print("Mode of sepal width :  ");
            System.out.println(mode_sw);
            System.out.println("====================================================");
            System.out.print("Mode of sepal length :  ");
            System.out.println(mode_sl);
            System.out.println("====================================================");
            System.out.print("Mode of petal length :  ");
            System.out.println(mode_pl);
            System.out.println("====================================================");
            System.out.print("Mode of petal length :  ");
            System.out.println(mode_pw);
            System.out.println("====================================================");
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.println(
                    "                                                    MAXIMUM                                                                                                              ");
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.print("Max of sepal width  :  ");
            System.out.println(Max_sw);
            System.out.println("====================================================");
            System.out.print("Max of speal length :  ");
            System.out.println(Max_sl);
            System.out.println("====================================================");
            System.out.print("Max of petal length :  ");
            System.out.println(Max_pl);
            System.out.println("====================================================");
            System.out.print("Max of petal width :  ");
            System.out.println(Max_pw);
            System.out.println("====================================================");
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.println(
                    "                                                    MINIMUM                                                                                                            ");
            System.out.println(
                    "****************************************************************************************************************************");
            System.out.print("Min of sepal width :  ");
            System.out.println(Min_sw);
            System.out.println("====================================================");
            System.out.print("Min of sepal length :  ");
            System.out.println(Min_sl);
            System.out.println("====================================================");
            System.out.print("Min of petal length :  ");
            System.out.println(Min_pl);
            System.out.println("====================================================");
            System.out.print("Min of petal width :  ");
            System.out.println(Min_pw);

            System.out.println("======================================================================");
            System.out.println("                       FIVE NUMBER SUMMARY(SETOSA)                         ");
            System.out.println("======================================================================");
            System.out.println("  MEAN for setosa   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + mean(setosa_s_length));
            System.out.println("Sepal Width   " + mean(setosa_s_width));
            System.out.println("Petal Length  " + mean(setosa_p_length));
            System.out.println("Petal Width   " + mean(setosa_p_width));
            System.out.println("______________________________________________________________________");

            System.out.println("  MEDIAN for setosa   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + median(setosa_s_length));
            System.out.println("Sepal Width   " + median(setosa_s_width));
            System.out.println("Petal Length  " + median(setosa_p_length));
            System.out.println("Petal Width   " + median(setosa_p_width));

            System.out.println("  Mode for setosa   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + mode(setosa_s_length));
            System.out.println("Sepal Width   " + mode(setosa_s_width));
            System.out.println("Petal Length  " + mode(setosa_p_length));
            System.out.println("Petal Width   " + mode(setosa_p_width));

            System.out.println("______________________________________________________________________");

            System.out.println("  Minimum for setosa   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + minimum(setosa_s_length));
            System.out.println("Sepal Width   " + minimum(setosa_s_width));
            System.out.println("Petal Length  " + minimum(setosa_p_length));
            System.out.println("Petal Width   " + minimum(setosa_p_width));

            System.out.println("______________________________________________________________________");

            System.out.println("  Maximum for setosa   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + maximum(setosa_s_length));
            System.out.println("Sepal Width   " + maximum(setosa_s_width));
            System.out.println("Petal Length  " + maximum(setosa_p_length));
            System.out.println("Petal Width   " + maximum(setosa_p_width));

            System.out.println("======================================================================");
            System.out.println("                       FIVE NUMBER SUMMARY(versicolor)                         ");
            System.out.println("======================================================================");
            System.out.println("  MEAN for versicolor   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + mean(versi_sepal_length));
            System.out.println("Sepal Width   " + mean(versi_sepal_width));
            System.out.println("Petal Length  " + mean(versi_petal_length));
            System.out.println("Petal Width   " + mean(versi_petal_width));
            System.out.println("______________________________________________________________________");

            System.out.println("  Median for versicolor   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + median(versi_sepal_length));
            System.out.println("Sepal Width   " + median(versi_sepal_width));
            System.out.println("Petal Length  " + median(versi_petal_length));
            System.out.println("Petal Width   " + median(versi_petal_width));
            System.out.println("______________________________________________________________________");

            System.out.println("  Mode for versicolor   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + mode(versi_sepal_length));
            System.out.println("Sepal Width   " + mode(versi_sepal_width));
            System.out.println("Petal Length  " + mode(versi_petal_length));
            System.out.println("Petal Width   " + mode(versi_petal_width));
            System.out.println("______________________________________________________________________");

            System.out.println("  Maximum for versicolor   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + maximum(versi_sepal_length));
            System.out.println("Sepal Width   " + maximum(versi_sepal_width));
            System.out.println("Petal Length  " + maximum(versi_petal_length));
            System.out.println("Petal Width   " + maximum(versi_petal_width));
            System.out.println("______________________________________________________________________");
            System.out.println("  Minimum for versicolor   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + minimum(versi_sepal_length));
            System.out.println("Sepal Width   " + minimum(versi_sepal_width));
            System.out.println("Petal Length  " + minimum(versi_petal_length));
            System.out.println("Petal Width   " + minimum(versi_petal_width));
            System.out.println("______________________________________________________________________");

            System.out.println("======================================================================");
            System.out.println("                       FIVE NUMBER SUMMARY(verginica)                         ");
            System.out.println("======================================================================");
            System.out.println("  MEAN for verginica   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + mean(virgi_sepal_length));
            System.out.println("Sepal Width   " + mean(virgi_sepal_width));
            System.out.println("Petal Length  " + mean(virgi_petal_length));
            System.out.println("Petal Width   " + mean(virgi_petal_width));
            System.out.println("______________________________________________________________________");

            System.out.println("  Median for verginica   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + median(virgi_sepal_length));
            System.out.println("Sepal Width   " + median(virgi_sepal_width));
            System.out.println("Petal Length  " + median(versi_petal_length));
            System.out.println("Petal Width   " + median(virgi_petal_width));
            System.out.println("______________________________________________________________________");

            System.out.println("  Mode for verginica   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + mode(virgi_sepal_length));
            System.out.println("Sepal Width   " + mode(virgi_sepal_width));
            System.out.println("Petal Length  " + mode(virgi_petal_length));
            System.out.println("Petal Width   " + mode(virgi_petal_width));
            System.out.println("______________________________________________________________________");

            System.out.println("  Maximum for verginica   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + maximum(virgi_sepal_length));
            System.out.println("Sepal Width   " + maximum(virgi_sepal_width));
            System.out.println("Petal Length  " + maximum(virgi_petal_length));
            System.out.println("Petal Width   " + maximum(virgi_petal_width));
            System.out.println("______________________________________________________________________");
            System.out.println("  Minimum for verginica   ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  " + minimum(virgi_sepal_length));
            System.out.println("Sepal Width   " + minimum(virgi_sepal_width));
            System.out.println("Petal Length  " + minimum(virgi_petal_length));
            System.out.println("Petal Width   " + minimum(virgi_petal_width));
            System.out.println("______________________________________________________________________");

            FileWriter fWriter = new FileWriter("Iris.txt");
            // Writing mean values
            fWriter.write("Mean of sepal width :  " + Float.toString(mean_sw) + "\n");
            fWriter.write("Mean of sepal length :  " + Float.toString(mean_sl) + "\n");
            fWriter.write("Mean of petal length :  " + Float.toString(mean_pl) + "\n");
            fWriter.write("Mean of petal width :  " + Float.toString(mean_pw) + "\n");

            // Writing median values
            fWriter.write("Median of sepal width :  " + Float.toString(median_sw) + "\n");
            fWriter.write("Median of sepal length :  " + Float.toString(median_sl) + "\n");
            fWriter.write("Median of petal length :  " + Float.toString(median_pl) + "\n");
            fWriter.write("Median of petal width :  " + Float.toString(median_pw) + "\n");

            // Writing mode values
            fWriter.write("Mode of sepal width :  " + Float.toString(mode_sw) + "\n");
            fWriter.write("Mode of sepal length :  " + Float.toString(mode_sl) + "\n");
            fWriter.write("Mode of petal length :  " + Float.toString(mode_pl) + "\n");
            fWriter.write("Mode of petal width :  " + Float.toString(mode_pw) + "\n");

            // Writing maximum and minimum values
            fWriter.write("Max of sepal width  :  " + Float.toString(Max_sw) + "\n");
            fWriter.write("Max of sepal length :  " + Float.toString(Max_sl) + "\n");
            fWriter.write("Max of petal length :  " + Float.toString(Max_pl) + "\n");
            fWriter.write("Max of petal width :  " + Float.toString(Max_pw) + "\n");

            fWriter.write("Min of sepal width :  " + Float.toString(Min_sw) + "\n");
            fWriter.write("Min of sepal length :  " + Float.toString(Min_sl) + "\n");
            fWriter.write("Min of petal length :  " + Float.toString(Min_pl) + "\n");
            fWriter.write("Min of petal width :  " + Float.toString(Min_pw) + "\n");
            fWriter.write("======================================================================\n");
            fWriter.write("               FIVE NUMBER SUMMARY (verginica)\n");
            fWriter.write("======================================================================\n");

            fWriter.write("MEAN for verginica\n");
            fWriter.write("______________________________________________________________________\n");
            fWriter.write("Sepal Length: " + mean(virgi_sepal_length) + "\n");
            fWriter.write("Sepal Width:  " + mean(virgi_sepal_width) + "\n");
            fWriter.write("Petal Length: " + mean(virgi_petal_length) + "\n");
            fWriter.write("Petal Width:  " + mean(virgi_petal_width) + "\n");
            fWriter.write("______________________________________________________________________\n");

            fWriter.write("Median for verginica\n");
            fWriter.write("______________________________________________________________________\n");
            fWriter.write("Sepal Length: " + median(virgi_sepal_length) + "\n");
            fWriter.write("Sepal Width:  " + median(virgi_sepal_width) + "\n");
            fWriter.write("Petal Length: " + median(virgi_petal_length) + "\n");
            fWriter.write("Petal Width:  " + median(virgi_petal_width) + "\n");
            fWriter.write("______________________________________________________________________\n");

            fWriter.write("Mode for verginica\n");
            fWriter.write("______________________________________________________________________\n");
            fWriter.write("Sepal Length: " + mode(virgi_sepal_length) + "\n");
            fWriter.write("Sepal Width:  " + mode(virgi_sepal_width) + "\n");
            fWriter.write("Petal Length: " + mode(virgi_petal_length) + "\n");
            fWriter.write("Petal Width:  " + mode(virgi_petal_width) + "\n");
            fWriter.write("______________________________________________________________________\n");

            fWriter.write("  Maximum for verginica  \n");
            fWriter.write("______________________________________________________________________ \n");
            fWriter.write("Sepal Length \n" + maximum(virgi_sepal_length) + "\n");
            fWriter.write("Sepal Width \n" + maximum(virgi_sepal_width) + "\n");
            fWriter.write("Petal Length \n" + maximum(virgi_petal_length) + "\n");
            fWriter.write("Petal Width \n" + maximum(virgi_petal_width) + "\n");
            fWriter.write("______________________________________________________________________ \n");

            fWriter.write("Minimum for verginica\n");
            fWriter.write("______________________________________________________________________\n");
            fWriter.write("Sepal Length: " + minimum(virgi_sepal_length) + "\n");
            fWriter.write("Sepal Width:  " + minimum(virgi_sepal_width) + "\n");
            fWriter.write("Petal Length: " + minimum(virgi_petal_length) + "\n");
            fWriter.write("Petal Width:  " + minimum(virgi_petal_width) + "\n");
            fWriter.write("______________________________________________________________________\n");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static float calculatemean_sw(float[] sw) {
        float sum_sw = 0;
        float sum_sl = 0;
        for (int i = 0; i < sw.length; i++) {
            sum_sw += sw[i];

        }
        return sum_sw / sw.length;

    }

    public static float calculatemean_sl(float[] sl) {
        float sum_sl = 0;
        for (int i = 0; i < sl.length; i++) {
            sum_sl += sl[i];

        }
        return sum_sl / sl.length;

    }

    public static float calculatemean_pl(float[] pl) {
        float sum_pl = 0;
        for (int i = 0; i < pl.length; i++) {
            sum_pl += pl[i];

        }
        return sum_pl / pl.length;

    }

    public static float calculatemean_pw(float[] pw) {
        float sum_pw = 0;
        for (int i = 0; i < pw.length; i++) {
            sum_pw += pw[i];

        }
        return sum_pw / pw.length;

    }

    public static float calculateMedian_sw(float[] sw) {
        int n = sw.length;
        int mid = n / 2;
        boolean isEven = n % 2 == 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sw[j] > sw[j + 1]) {
                    float temp = sw[j];
                    sw[j] = sw[j + 1];
                    sw[j + 1] = temp;
                }
            }
        }

        if (isEven) {
            return (sw[mid - 1] + sw[mid]) / 2.0f;
        } else {
            return sw[mid];
        }
    }

    public static float calculateMedian_sl(float[] sl) {
        int n = sl.length;
        int mid = n / 2;
        boolean isEven = n % 2 == 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sl[j] > sl[j + 1]) {
                    float temp = sl[j];
                    sl[j] = sl[j + 1];
                    sl[j + 1] = temp;
                }
            }
        }

        if (isEven) {
            return (sl[mid - 1] + sl[mid]) / 2.0f;
        } else {
            return sl[mid];
        }
    }

    public static float calculateMedian_pl(float[] pl) {
        int n = pl.length;
        int mid = n / 2;
        boolean isEven = n % 2 == 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pl[j] > pl[j + 1]) {
                    float temp = pl[j];
                    pl[j] = pl[j + 1];
                    pl[j + 1] = temp;
                }
            }
        }

        if (isEven) {
            return (pl[mid - 1] + pl[mid]) / 2.0f;
        } else {
            return pl[mid];
        }
    }

    public static float calculateMedian_pw(float[] pw) {
        int n = pw.length;
        int mid = n / 2;
        boolean isEven = n % 2 == 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pw[j] > pw[j + 1]) {
                    float temp = pw[j];
                    pw[j] = pw[j + 1];
                    pw[j + 1] = temp;
                }
            }
        }

        if (isEven) {
            return (pw[mid - 1] + pw[mid]) / 2.0f;
        } else {
            return pw[mid];
        }
    }

    public static float calculateMode_sw(float[] sw) {
        int n = sw.length;
        int maxCount = 0;
        float mode = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (sw[j] == sw[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = sw[i];
            }
        }

        return mode;
    }

    public static float calculateMode_sl(float[] sl) {
        int n = sl.length;
        int maxCount = 0;
        float mode = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (sl[j] == sl[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = sl[i];
            }
        }

        return mode;
    }

    public static float calculateMode_pl(float[] pl) {
        int n = pl.length;
        int maxCount = 0;
        float mode = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (pl[j] == pl[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = pl[i];
            }
        }

        return mode;
    }

    public static float calculateMode_pw(float[] pw) {
        int n = pw.length;
        int maxCount = 0;
        float mode = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (pw[j] == pw[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = pw[i];
            }
        }

        return mode;
    }

    public static float Max_sw(float[] sw) {
        float max = sw[0];
        for (int i = 1; i < sw.length; i++) {
            if (sw[i] > max) {
                max = sw[i];
            }
        }
        return max;
    }

    public static float Max_sl(float[] sl) {
        float max = sl[0];
        for (int i = 1; i < sl.length; i++) {
            if (sl[i] > max) {
                max = sl[i];
            }
        }
        return max;
    }

    public static float Max_pl(float[] pl) {
        float max = pl[0];
        for (int i = 1; i < pl.length; i++) {
            if (pl[i] > max) {
                max = pl[i];
            }
        }
        return max;
    }

    public static float Max_pw(float[] pw) {
        float max = pw[0];
        for (int i = 1; i < pw.length; i++) {
            if (pw[i] > max) {
                max = pw[i];
            }
        }
        return max;
    }

    public static float Min_sw(float[] sw) {
        float min = sw[0];
        for (int i = 1; i < sw.length; i++) {
            if (sw[i] < min) {
                min = sw[i];
            }
        }
        return min;
    }

    public static float Min_sl(float[] sl) {
        float min = sl[0];
        for (int i = 1; i < sl.length; i++) {
            if (sl[i] < min) {
                min = sl[i];
            }
        }
        return min;
    }

    public static float Min_pl(float[] pl) {
        float min = pl[0];
        for (int i = 1; i < pl.length; i++) {
            if (pl[i] < min) {
                min = pl[i];
            }
        }
        return min;
    }

    public static float Min_pw(float[] pw) {
        float min = pw[0];
        for (int i = 1; i < pw.length; i++) {
            if (pw[i] < min) {
                min = pw[i];
            }
        }
        return min;
    }

    public static float mean(float[] data) {
        float sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        float mean = sum / (data.length);
        return mean;
    }

    public static float median(float[] data) {
        float[] newdata = data;
        Arrays.sort(newdata);
        float num1 = newdata[data.length / 2];
        float num2 = newdata[(data.length / 2) + 1];
        float median = (num1 + num2) / 2;
        return median;
    }

    static float mode(float data[]) {
        float maxValue = 0;
        int maxCount = 0, i, j;

        for (i = 0; i < data.length; ++i) {
            int count = 0;
            for (j = 0; j < data.length; ++j) {
                if (data[j] == data[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = data[i];
            }
        }
        return maxValue;
    }

    static float maximum(float[] data) {
        float max = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    static float minimum(float[] data) {
        float min = mean(data);
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

}
```
## Output
``` 
PS D:\Semister 2\Java\22122109-MDS273L-JAVA\Lab 7> javac lab7.java
PS D:\Semister 2\Java\22122109-MDS273L-JAVA\Lab 7> java lab7      
****************************************************************************************************************************
                                                    MEAN
****************************************************************************************************************************
====================================================
Mean of sepal width :  3.054
====================================================
Mean of sepal length :  5.8433347
====================================================
Mean of petal length :  3.7586665
====================================================
Mean of petal width :  1.1986669
====================================================
****************************************************************************************************************************
                                                    MEDIAN
****************************************************************************************************************************
Median of sepal width :  3.0
====================================================
Median of sepal length :  5.8
====================================================
Median of petal length :  4.3500004
====================================================
Median of petal width :  1.3
====================================================
****************************************************************************************************************************
                                                    MODE
****************************************************************************************************************************
Mode of sepal width :  3.0
====================================================
Mode of sepal length :  5.0
====================================================
Mode of petal length :  1.5
====================================================
Mode of petal length :  0.2
====================================================
****************************************************************************************************************************
                                                    MAXIMUM
****************************************************************************************************************************
Max of sepal width  :  4.4
====================================================
Max of speal length :  7.9
====================================================
Max of petal length :  6.9
====================================================
Max of petal width :  2.5
====================================================
****************************************************************************************************************************
                                                    MINIMUM
****************************************************************************************************************************
Min of sepal width :  2.0
====================================================
Min of sepal length :  4.3
====================================================
Min of petal length :  1.0
====================================================
Min of petal width :  0.1
======================================================================
                       FIVE NUMBER SUMMARY(SETOSA)
======================================================================
  MEAN for setosa
______________________________________________________________________
Sepal Length  5.0059996
Sepal Width   3.4180002
Petal Length  1.464
Petal Width   0.24399997
______________________________________________________________________
  MEDIAN for setosa   
______________________________________________________________________
Sepal Length  5.0
Sepal Width   3.4
Petal Length  1.5
Petal Width   0.2
  Mode for setosa
______________________________________________________________________
Sepal Length  5.0
Sepal Width   3.4
Petal Length  1.5
Petal Width   0.2
______________________________________________________________________
  Minimum for setosa
______________________________________________________________________
Sepal Length  4.3
Sepal Width   2.3
Petal Length  1.0
Petal Width   0.1
______________________________________________________________________
  Maximum for setosa
______________________________________________________________________
Sepal Length  5.8
Sepal Width   4.4
Petal Length  1.9
Petal Width   0.6
======================================================================
                       FIVE NUMBER SUMMARY(versicolor)
======================================================================
  MEAN for versicolor
______________________________________________________________________
Sepal Length  5.936002
Sepal Width   2.77
Petal Length  4.26
Petal Width   1.3259999
______________________________________________________________________
  Median for versicolor
______________________________________________________________________
Sepal Length  5.95
Sepal Width   2.8
Petal Length  4.4
Petal Width   1.3
______________________________________________________________________
  Mode for versicolor
______________________________________________________________________
Sepal Length  5.5
Sepal Width   3.0
Petal Length  4.5
Petal Width   1.3
______________________________________________________________________
  Maximum for versicolor
______________________________________________________________________
Sepal Length  7.0
Sepal Width   3.4
Petal Length  5.1
Petal Width   1.8
______________________________________________________________________
  Minimum for versicolor
______________________________________________________________________
Sepal Length  4.9
Sepal Width   2.0
Petal Length  3.0
Petal Width   1.0
______________________________________________________________________
======================================================================
                       FIVE NUMBER SUMMARY(verginica)
======================================================================
  MEAN for verginica
______________________________________________________________________
Sepal Length  6.5879993
Sepal Width   2.9740002
Petal Length  5.5520005
Petal Width   2.0260003
______________________________________________________________________
  Median for verginica
______________________________________________________________________
Sepal Length  6.5
Sepal Width   3.0
Petal Length  4.4
Petal Width   2.0
______________________________________________________________________
  Mode for verginica
______________________________________________________________________
Sepal Length  6.3
Sepal Width   3.0
Petal Length  5.1
Petal Width   1.8
______________________________________________________________________
  Maximum for verginica   
______________________________________________________________________
Sepal Length  7.9
Sepal Width   3.8
Petal Length  6.9
Petal Width   2.5
______________________________________________________________________
  Minimum for verginica
______________________________________________________________________
Sepal Length  4.9
Sepal Width   2.2
Petal Length  4.5
Petal Width   1.4
______________________________________________________________________


Text File Output
Mean of sepal width :  3.054
Mean of sepal length :  5.8433347
Mean of petal length :  3.7586665
Mean of petal width :  1.1986669
Median of sepal width :  3.0
Median of sepal length :  5.8
Median of petal length :  4.3500004
Median of petal width :  1.3
Mode of sepal width :  3.0
Mode of sepal length :  5.0
Mode of petal length :  1.5
Mode of petal width :  0.2
Max of sepal width  :  4.4
Max of sepal length :  7.9
Max of petal length :  6.9
Max of petal width :  2.5
Min of sepal width :  2.0
Min of sepal length :  4.3
Min of petal length :  1.0
Min of petal width :  0.1
======================================================================
               FIVE NUMBER SUMMARY (verginica)
======================================================================
MEAN for verginica
______________________________________________________________________
Sepal Length: 6.5880003
Sepal Width:  2.9739997
Petal Length: 5.5520005
Petal Width:  2.0260003
______________________________________________________________________
Median for verginica
______________________________________________________________________
Sepal Length: 6.5
Sepal Width:  3.0
Petal Length: 5.6
Petal Width:  2.0
______________________________________________________________________
Mode for verginica
______________________________________________________________________
Sepal Length: 6.3
Sepal Width:  3.0
Petal Length: 5.1
Petal Width:  1.8
______________________________________________________________________


```