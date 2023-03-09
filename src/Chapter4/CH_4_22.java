package Chapter4;
/*
(Tabular Output) Write a Java application that uses looping to print the following table of
values:

N   10*N    100*N   1000*N
1   10      100     1000
2   20      200     2000
3   30      300     3000
4   40      400     4000
5   50      500     5000
 */
public class CH_4_22 {
    public static void main(String[] args) {
        int counter = 1;

        System.out.printf("N\t10*N\t100*N\t1000*N%n");

        while(counter <= 5){
            System.out.printf("%d\t%d\t\t%d\t\t%d%n", counter,(counter*10),(counter*100),(counter*1000));
            counter++;
        }
    }
}
