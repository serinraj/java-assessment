class CharCase {
	public static void main(String[] args) {

		String s="mAry hAs A liTTle dog. She calls Him Pun";
		System.out.println("Input:"+s);            
		System.out.println("\nOutput:");
		if(!s.equals(""))  
		{
			System.out.println("Uppercase:"+s.toUpperCase());
			System.out.println("\nLowercase:"+s.toLowerCase());
			
			System.out.print("\nCapitalize: ");
			char[] c= new char[s.length()];
			System.out.print( Character.toUpperCase(s.charAt(0)));
			for(int i=1;i<s.length();i++)
			{
				c[i]=s.charAt(i);
				if(s.charAt(i)==' ' )
				{
					System.out.print(' ');
					System.out.print( Character.toUpperCase(s.charAt(i+1))); 
					i++;
				}
				else
					System.out.print( Character.toLowerCase(c[i]));
			}
			
			System.out.print("\n\nSentense case: ");
			System.out.print( Character.toUpperCase(s.charAt(0)));
			for(int i=1;i<s.length();i++)
			{
				c[i]=s.charAt(i);
				if( s.charAt(i)=='.' && s.charAt(i+1)==' ' )
				{
					System.out.print(". "); 
					System.out.print( Character.toUpperCase(s.charAt(i+2)));  
					i+=2;
				}
				else
					System.out.print( Character.toLowerCase(c[i]));
			
			
			}
			
			System.out.print("\n\nInvert: ");
			for(int i=0;i<s.length();i++)
			{
				if(Character.isUpperCase(s.charAt(i)))
				{
					 System.out.print(Character.toLowerCase(s.charAt(i)));
				}
				else
					System.out.print(Character.toUpperCase(s.charAt(i)));
			}
			
		}

	}
}