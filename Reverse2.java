package task_9thSept;
import java.io.*;
              /*routine that reverses the order of words in a string*/
public class Reverse2 {

	public static void main(String[] args) {
		
		System.out.print("Enter a String");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str=br.readLine();
			
			String result="";
			int p=str.length();
			for(int i=str.length()-1;i>=0;i--) {
				if(str.charAt(i)==' ') {
					result+=str.substring(i, p)+" ";
					p=i;
				}
			}
			result+=str.substring(0,p);

			System.out.println(result);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
