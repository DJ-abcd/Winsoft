// Q4:Write a Java Program to find the duplicate characters in a string.

public class duplicatecharacters{
    
    public static void main(String[] args) {
        String str = new String("Computer Engineering");
  
        char[] ch = str.toCharArray();
        for (int i=0; i<ch.length; i++) {
            for (int j=i+1; j<ch.length; j++) {
                if(ch[i] == ch[j]) {
                    System.out.println("duplicate characters in String are:"+ch[j]);
                
                    
                }
                
            }
        }
    }
}
