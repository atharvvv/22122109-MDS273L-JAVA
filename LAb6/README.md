## Name: Atharva Vetal
## Registration no: 22122109
## Lab 6

## Description of program: 
Write a JAVA program that reads a file (text file) and finds the following details.
Vowels and their count. Eg: [a:100, e:45, I:55, ..]
Digits and their count. Eg: [0:1000, 1:10, 2:40, ...]
Top Five repeated words and their count.
Least Five repeated words and their count.
Top Five repeated characters and their count.
Least FIve repeated characters and their count.
Note:
Use the file attached.
Use functions to implement the six functions asked.
Pass the file content to the functions and return the values accordingly.
No Global variables are allowed to be used.

## Code snippet:

import java.io.File;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        String fileName = "text.txt";
        int[] vowelCounts = countVowels(fileName);
        int[] numberCounts = countNumbers(fileName);
        char[] topFiveChars = getTopFiveChars(fileName);
   

        System.out.println("Vowel Counts:");
        System.out.println("a: " + vowelCounts[0]);
        System.out.println("e: " + vowelCounts[1]);
        System.out.println("i: " + vowelCounts[2]);
        System.out.println("o: " + vowelCounts[3]);
        System.out.println("u: " + vowelCounts[4]);

        System.out.println("Number Counts:");
        for (int i = 0; i < numberCounts.length; i++) {
            System.out.println(i + ": " + numberCounts[i]);
        }

        String result = findTopWords(fileName);
        System.out.println(result);

        String[][] leastFiveWordsAndCounts = leastFiveRepeatedWords(fileName);
        System.out.println("Least five repeated words and their counts:");
        for (String[] wordAndCount : leastFiveWordsAndCounts) {
            System.out.println(wordAndCount[0] + ": " + wordAndCount[1]);
        }

        System.out.println("Top Five Characters:");
        for (int i = 0; i < topFiveChars.length; i++) {
            System.out.println(topFiveChars[i] + ": " + countChar(fileName, topFiveChars[i]));
        }
      
   
        int[] lastFiveCounts = countLastFiveCharacters(fileName);
        System.out.println("Last Five Character Counts:");
        for (int i = 0; i < lastFiveCounts.length; i++) {
            char c = (char) (i + 48);
            System.out.println(c + ": " + lastFiveCounts[i]);
        }


        


      

    }

    public static int[] countVowels(String fileName) {
        int[] vowelCounts = new int[5];
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == 'a' || c == 'A') {
                        vowelCounts[0]++;
                    } else if (c == 'e' || c == 'E') {
                        vowelCounts[1]++;
                    } else if (c == 'i' || c == 'I') {
                        vowelCounts[2]++;
                    } else if (c == 'o' || c == 'O') {
                        vowelCounts[3]++;
                    } else if (c == 'u' || c == 'U') {
                        vowelCounts[4]++;
                    }
                }
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

        return vowelCounts;
    }

    public static int[] countNumbers(String fileName) {
        int[] numberCounts = new int[10];
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isDigit(c)) {
                        int digit = Character.getNumericValue(c);
                        numberCounts[digit]++;
                    }
                }
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return numberCounts;
    }

    public static String findTopWords(String filePath) {
        String result = "";
        int totalCount = 0;
        try {
            Scanner scanner = new Scanner(new File(filePath));
            String line;
            int count = 0;
            String[] words = new String[1000];
            int[] freq = new int[1000];
            while (scanner.hasNext()) {
                line = scanner.next();
                totalCount++;
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (line.equals(words[i])) {
                        freq[i]++;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    words[count] = line;
                    freq[count] = 1;
                    count++;
                }
            }
            for (int i = 0; i < count - 1; i++) {
                for (int j = i + 1; j < count; j++) {
                    if (freq[j] > freq[i]) {
                        int temp = freq[i];
                        freq[i] = freq[j];
                        freq[j] = temp;
                        String tempStr = words[i];
                        words[i] = words[j];
                        words[j] = tempStr;
                    }
                }
            }
            result += "Top five repeated words:\n";
            int[] topFiveFreq = new int[5];
            int topFiveCount = 0;
            for (int i = 0; i < 5; i++) {
                if (freq[i] == 0) {
                    break;
                }
                result += words[i] + " - " + freq[i] + "\n";
                topFiveFreq[i] = freq[i];
                topFiveCount += freq[i];
            }
            result += "Count of top five repeated words: " + topFiveCount(topFiveFreq) + "\n";
            result += "Total word count: " + totalCount + "\n";
            scanner.close();
        } catch (Exception e) {
            result += "File not found: " + filePath + "\n";
        }
        return result;
    }

    public static int topFiveCount(int[] freq) {
        int topFiveCount = 0;
        for (int i = 0; i < 5; i++) {
            topFiveCount += freq[i];
        }
        return topFiveCount;
    }

    public static String[][] leastFiveRepeatedWords(String fileName) {
        int maxWords = 10000;
        String[] words = new String[maxWords];
        int[] counts = new int[maxWords];
        int numWords = 0;

        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    int index = -1;
                    for (int i = 0; i < numWords; i++) {
                        if (words[i].equals(word)) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        counts[index]++;
                    } else {
                        words[numWords] = word;
                        counts[numWords] = 1;
                        numWords++;
                    }
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        String[][] leastFiveWordsAndCounts = new String[5][2];
        int[] leastFiveCounts = new int[5];
        for (int i = 0; i < numWords; i++) {
            if (counts[i] > leastFiveCounts[0]) {
                int index = -1;
                for (int j = 0; j < 5; j++) {
                    if (leastFiveCounts[j] == counts[i]) {
                        index = j;
                        break;
                    }
                }
                if (index != -1) {
                    leastFiveWordsAndCounts[index][0] = words[i];
                    leastFiveWordsAndCounts[index][1] = Integer.toString(counts[i]);
                } else {
                    int minCount = leastFiveCounts[0];
                    int minIndex = 0;
                    for (int j = 1; j < 5; j++) {
                        if (leastFiveCounts[j] < minCount) {
                            minCount = leastFiveCounts[j];
                            minIndex = j;
                        }
                    }
                    leastFiveWordsAndCounts[minIndex][0] = words[i];
                    leastFiveWordsAndCounts[minIndex][1] = Integer.toString(counts[i]);
                    leastFiveCounts[minIndex] = counts[i];
                }
            }
        }
        return leastFiveWordsAndCounts;
    }

    public static char[] getTopFiveChars(String fileName) {
        char[] topFiveChars = new char[5];
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            int[] charCounts = new int[128]; // ASCII characters only
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c < 128) { // count only ASCII characters
                        charCounts[c]++;
                    }
                }
            }

            for (int i = 0; i < 5; i++) {
                int maxCount = -1;
                char maxChar = ' ';
                for (int j = 0; j < charCounts.length; j++) {
                    if (charCounts[j] > maxCount) {
                        maxCount = charCounts[j];
                        maxChar = (char) j;
                    }
                }
                topFiveChars[i] = maxChar;
                charCounts[maxChar] = -1; // mark as visited
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return topFiveChars;
    }

    public static int countChar(String fileName, char c) {
        int count = 0;
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == c) {
                        count++;
                    }
                }
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return count;
    }

    public static int[] countLastFiveCharacters(String fileName) {
        int[] lastFiveCounts = new int[10];
        char[] lastFiveChars = new char[5];
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isDigit(c)) {
                        int digit = Character.getNumericValue(c);
                        lastFiveChars = updateLastFiveChars(lastFiveChars, c);
                        lastFiveCounts[digit]++;
                    }
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lastFiveCounts;
    }
    
    public static char[] updateLastFiveChars(char[] lastFiveChars, char c) {
        for (int i = 0; i < lastFiveChars.length - 1; i++) {
            lastFiveChars[i] = lastFiveChars[i+1];
        }
        lastFiveChars[lastFiveChars.length - 1] = c;
        return lastFiveChars;
    }
  

}

## Code Output:
```
Vowel Counts:
a: 357
e: 504
i: 360
o: 260
u: 107
Number Counts:
0: 6
1: 6
2: 7
3: 4
4: 2
5: 4
6: 2
7: 4
8: 2
9: 0
Top five repeated words:
and - 34
of - 32
to - 25
the - 23
energy - 12
Count of top five repeated words: 126
Total word count: 734

Least five repeated words and their counts:
to: 25
of: 32
the: 23
and: 34
a: 7
Top Five Characters:
 : 730
e: 502
a: 351
i: 349
n: 334
Last Five Character Counts:
0: 6
1: 6
2: 7
3: 4
4: 2
5: 4
6: 2
7: 4
8: 2
9: 0
```
## Flowchart Diagram:
