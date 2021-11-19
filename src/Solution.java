
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNICADO:

// Max i min d'un gràfic:

/* El següent gràfic de línia ens mostra les precipitacions d'una regió durant 12 mesos, amb els seus màxims i mínims relatius, així que el febre, juny i setembre vam obtenir mínims relatius i el maig, agost i octubre màxims relatius.

Un punt serà mínim relatiu si els punts que té al seu costat són més grans que ell, per contra, un punt serà un màxim relatiu si els punts que té al seu costat són més petits que ell.

image

Representem l'entrada d'aquest gràfic amb els seus valors acabats en un -1. Es tracta que imprimeixis quants min i quants maxims hi ha en aquest ordre i després que imprimeixis el mínim relatiu més petit i el màxim relatiu més gran.

Input Format

Successió d'enters acabats amb -1.

Constraints

No n'hi ha.

Output Format

Imprimeix en files diferents el nombre de mínims relatius i després el nombre de màxims relatius. Tot seguit imprimeix en files diferents el mínim relatiu més petit i el màxim relatiu més gran.

Sample Input 0

40 20 80 110 120 40 85 130 35 165 65 55 -1
Sample Output 0

3
3
20
165
Explanation 0

És el gràfic d'exemple

 */



public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int numMin = 0;
        int numMax = 0;
        int minRel= 999999;
        int maxRel= 0;

        while (num3 != -1)
        {
            if (num2 > num1 && num2 > num3)
            {
                numMax++;
                if(num2 > maxRel )
                {
                    maxRel = num2;
                }
            }

            if (num2 < num1 && num2 < num3)
            {
                numMin++;
                if(num2 < minRel)
                {
                    minRel = num2;
                }

            }

            num1 = num2;
            num2 = num3;
            num3 = sc.nextInt();

        }
        System.out.println(numMin);
        System.out.println(numMax);
        System.out.println(minRel);
        System.out.println(maxRel);

    }
}
