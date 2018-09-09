package task_9thSept;
import java.io.*;     /* routine that reverses each word in a string  
*/
public class Reverese1 {             

	public static void main(String[] args) {

		
        System.out.print("Enter a String");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str=br.readLine();
			
			String result="";
			int p=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==' ') {
					result+=new StringBuffer(str.substring(p, i)).reverse().toString()+" ";
					p=i+1;
				}
			}
			result+=new StringBuffer(str.substring(p, str.length())).reverse().toString();
			System.out.println(result);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		}


}
