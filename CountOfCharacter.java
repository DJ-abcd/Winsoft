
// Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;
public class CountOfCharacter{
public static void main(String[] args) {// {s=2, r = 6, u = 6, t = 0 }
String string = "java@is@super@language";
int count;
char ch;
;
HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
for(int i = 0; i < string.length(); i++) {
ch= string.charAt(i);
if(hashMap.containsKey(ch)) {
count = hashMap.get(ch);
count++;
hashMap.replace(ch, count);
}else {
hashMap.put(ch,1);
}
}
for (Character key : hashMap.keySet()) {
System.out.println(key+" = "+hashMap.get(key));
}
}
}