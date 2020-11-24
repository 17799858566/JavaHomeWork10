import java.util.ArrayList;
import java.util.Scanner;

public class T2 {
    static ArrayList<Integer> b=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Enter ten integers:");
        ArrayList<Integer> ary=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int num=input.nextInt();
            ary.add(num);
        }
        removeDuplicate(ary);
        for(int i=0;i<b.size();i++){
            System.out.print(b.get(i)+" ");
        }
    }
    public static void removeDuplicate(ArrayList<Integer> ary){

        int t=0;

        for(int i=0;i<ary.size();i++){
            t=0;
            for(int j=0;j<b.size();j++){
                if(ary.get(i)==b.get(j)){
                    t++;
                }
            }
            if(t==0){
                b.add(ary.get(i));
            }
        }

    }
}
