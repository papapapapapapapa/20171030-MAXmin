import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int a,b,c;
        int max,min;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        max=a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
        System.out.print("最大值:");
        System.out.println(max);
        min=a;
        if(b<min)
            min=b;
        if(c<min)
            min=c;
        System.out.print("最小值:");
        System.out.println(min);
    }
}
