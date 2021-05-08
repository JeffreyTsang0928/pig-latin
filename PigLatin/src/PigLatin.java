import java.util.Scanner;
public class PigLatin {
	public static String createPigLatin(String s) {
		if(s.length()>1) {	
			if(s.charAt(0)!='a' || s.charAt(0)!='A' || s.charAt(0)!='e'
				|| s.charAt(0)!='E' || s.charAt(0)!='i' || s.charAt(0)!='I'
				|| s.charAt(0)!='o' || s.charAt(0)!='O' || s.charAt(0)!='u'
				|| s.charAt(1)!='U') {
			int firstVowelIndex=0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e'
						|| s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I'
						|| s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u'
						|| s.charAt(i)=='U') {
					firstVowelIndex=i;
					break;
				}
			}
				String substring1=s.substring(firstVowelIndex);
				String substring2=s.substring(0,firstVowelIndex) + "ay";
				return substring1+substring2;
			}
		}
		return s+"yay";		
	}
	
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("Enter a string to convert to "
				+ "pig latin: ");
		String s=stdin.next();
		System.out.println("Your pig-latin word is: " + createPigLatin(s));
		stdin.close();
	}
	
}
