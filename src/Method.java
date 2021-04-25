
public class Method {

	public static void main(String[]args)
	{
		Method m=new Method();
		m.demo(); 
		
	}
	public void demo() 
	{
		String s=new String("monala");
		String t=" ";
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("a")); //will give index of 1st search //
		System.out.println(s.indexOf("m"));
		System.out.println(s.substring(2,4));
		System.out.println(s.substring(2));
		
		//reverse string pgm
		for(int i=s.length()-1;i>=0;i--)
		{
		System.out.print(s.charAt(i));
		}
      //check whether string is palindrome or not
		for(int i=s.length()-1;i>=0;i--)
		{
		t=t+s.charAt(i);
		}
		System.out.println(t);

		if(s==t) 
		{
			System.out.println("string is not palindrome");
		}
	}
	

}
