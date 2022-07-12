import java.util.Scanner ;
public class Main{
	public static void main(String[]args){
	Scanner input = new Scanner (System.in);
	int[]  arr = new int[5];
        int count = 0;
        int count_2 = 0;

    for(int i =0 ;i<arr.length;i++ )
        {

            arr[i]=input.nextInt();
            if ( arr[i]<0)
                break;
        }
    for (int c = 0 ; c<arr.length;c++  ) {
            count += arr[c] ;
            count_2++;
        }

            System.out.println("ave is " + count/count_2 );
    }


}
