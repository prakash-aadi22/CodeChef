import java.util.Scanner;

public class ReviewProblem1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            String s = read.next();
            // Update the code below to solve this problem
            char[] c = s.toCharArray();
            int countA = 0;
            int countB = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[j] == 'a') {
                    countA++;
                } else if (c[j] == 'b') {
                    countB++;
                }
            }
            System.out.println(Math.min(countA, countB));
        }
    }
}

/*
Malvika likes only 2 colours - amber and brass.
Her mother bought n balloons - each of which is either amber or brass in colour.
The colours of the balls is provided as a string consisting of characters 'a' and 'b'

'a' denotes amber coloured balloon
'b' denotes brass coloured balloon
Malvika wants all balloons to be of the same colour - she can paint some balloons with opposite colour.
Find out the minimum number of balloons she needs to paint to make all of them the same colour.

Input Format
The first line of input contains a single integer T, denoting the number of test cases. The first and only line of each test case contains a string s.

Output Format
For each test case, output a single line containing an integer — the minimum number of flips required.

Sample 1:
Input
Output
3
ab
bb
baaba
Output
1
0
2
Explanation:
In the first example, you can change amber to brass or brass to amber. In both the cases, both the balloons will have same colors. So, you will need to paint 1 balloon. So the answer is 1.

In the second example, As the color of all the balloons is already the same, you don't need to paint any of them. So, the answer is 0.

*/