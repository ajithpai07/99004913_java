import java.util.*;

public class GayleCount{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Matches:");
		int n= sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count_50=0;
		int count_100=0;
		System.out.println("Enter the Scores:");
		for(int i=0; i<n;i++){
			arr.add(sc.nextInt());
			if(arr.get(i)>49 && arr.get(i)<100)
				count_50++;
			if(arr.get(i)>99)
				count_100++;
			
		}
		System.out.println("No. of 50's: "+count_50);
		System.out.println("No. of 100's: "+count_100);
	}
}