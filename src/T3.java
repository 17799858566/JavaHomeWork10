import java.util.*;

class point{
    public float x;
    public float y;
    point(){
        this.x=0;
        this.y=0;
    }
}

public class T3 {
    public static void main(String[] args) {
        point[] a=new point[999];
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of the points:");
        num=input.nextInt();
        for(int i=0;i<num;i++){
            a[i]=new point();
        }
        System.out.println("Enter the coordinates of the points:");
        for(int i=0;i<num;i++){
            a[i].x=input.nextFloat();
            a[i].y=input.nextFloat();
        }
        System.out.println("The total area is: "+area(a,num));
    }
    public static float area(point a[],int num){
        float temp=0;
        int i;
        for(i=0;i<num-1;i++){
            temp+=(a[i].x-a[i+1].x)*(a[i].y+a[i+1].y);
        }
        temp+=(a[i].x-a[0].x)*(a[i].y+a[0].y);
        return Math.abs(temp/2);
    }
}
