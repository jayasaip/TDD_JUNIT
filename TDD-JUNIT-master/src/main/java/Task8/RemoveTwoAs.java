package Task8;

public class RemoveTwoAs {
	public String DelA(String st1){
		int n = st1.length();
		if(st1.charAt(0)=='A' && st1.charAt(1)=='A')
		{
			st1=st1.substring(2,n);
		}
		else if(st1.charAt(0)=='A')
		{
			st1=st1.substring(1,n);
		}
		else if(st1.charAt(1)=='A')
		{
			st1=st1.charAt(0)+st1.substring(2,n);
		}
		return (st1);
	}
}
