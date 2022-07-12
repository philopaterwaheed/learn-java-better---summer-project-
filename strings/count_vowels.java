public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    char [] ch = {'a','u','e','i','o'};
    for ( int i =0 ; i < str.length();i ++ )
        
      {
       for ( int c =0 ; c < ch.length ; c++)   
         {
         if (str.charAt(i)==ch[c])
              vowelsCount ++;
       }      
          
         
      
      
    }
    
    
    return vowelsCount;
  }

}
