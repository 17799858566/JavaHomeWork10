import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size n:");

        n=input.nextInt();
        int [][] ary=new int[n][n];

        System.out.println("The random array is");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ary[i][j]=(int)(Math.random()+0.5);
                System.out.print(ary[i][j]);
            }
            System.out.println();
        }
        int maxr=-1,rt=0;
        int[]row=new int[n];
        int[]numr=new int[n];
        for(int i=0;i<n;i++){
            numr[i]=0;
            for(int j=0;j<n;j++){
                if(ary[i][j]==1){
                    numr[i]++;
                }
            }
            if(numr[i]>=maxr){
                maxr=numr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(numr[i]==maxr){
                row[rt]=i;
                rt++;
            }
        }
        int maxc=-1,ct=0;
        int[]col=new int[n];
        int[]numc=new int[n];
        for(int i=0;i<n;i++){
            numc[i]=0;
            for(int j=0;j<n;j++){
                if(ary[j][i]==1){
                    numc[i]++;
                }
            }
            if(numc[i]>maxc){
                maxc=numc[i];
            }
        }
        for(int i=0;i<n;i++){
            if(numc[i]==maxc) {
                col[ct] = i;
                ct++;
            }
        }
        System.out.print("The largest row index:");
        for(int i=0;i<rt;i++){
            System.out.print(row[i]);
            if(i!=rt-1)
                System.out.print(",");
            else
                System.out.println();
        }
        System.out.print("The largest column index:");
        for(int i=0;i<ct;i++){
            System.out.print(col[i]);
            if(i!=ct-1)
                System.out.print(",");
            else
                System.out.println();
        }

    }
}
