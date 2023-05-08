package strings;

import java.util.Scanner;

public class javaSubstringComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		String s=sc.next();
		
		getSmallestAndLargest(s,k);
	}
	
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest=s.substring(0,k);
        largest =s.substring(0,k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        
        for(int i=0;i<=s.length()-k;i++){
             String sm= s.substring(i,i+k);
            if(smallest.compareTo(sm)>0){
                smallest =sm;
            } if(largest.compareTo(sm)<0){
               largest =sm;
            }
        }
        
       
        
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

}
