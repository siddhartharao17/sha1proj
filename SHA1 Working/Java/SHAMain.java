public class SHAMain
{  
  public static void main(String args[])
  { 
    //String testarray = "abc";
    //String resultarray = "A9 99 3E 36 47 06 81 6A BA 3E 25 71 78 50 C2 6C 9C D0 D8 9D";
    
    String testarray = "a";
    String resultarray = "86 F7 E4 37 FA A5 A7 FC E1 5D 1D DC B9 EA EA EA 37 76 67 B8";
    
    /* Reference created of class MySHA */
    MySHA context;
    
    int i, j; 
    byte[] Message_Digest = new byte[20];
    
    /* Perform SHA-1 tests */
    
    context = new MySHA(); /* Object created */
    char[] charArray = testarray.toCharArray();
    
    context.SHA1Input(charArray, testarray.length());
    context.SHA1Result(Message_Digest);

    System.out.print("\nResult #:\t");
    
    for(i = 0; i < 20 ; ++i)
      System.out.printf("%02X ", Message_Digest[i]);
    
    System.out.println("\nMatches #:\t"+resultarray);
  }
}
