class CharacterCase {
    public static void main(String[] args) {
       
       String s="Mary has a little dog. she calls him Pun";
        System.out.println("Input:"+s);
       if(!s.equals(""))
       {
           System.out.println("Output:");
                      System.out.println("Uppercase:"+s.toUpperCase());
                      System.out.println("Lowercase:"+s.toLowerCase());

           
       }
       
       char[] c= new char[s.length()];
       for(int i=0;i<s.length();i++){
           c[i]=s.charAt(i);
           
       }
       
    }
}
