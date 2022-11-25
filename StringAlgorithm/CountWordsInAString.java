/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringAlgorithm;

import java.util.StringTokenizer;

/**
 *
 * @author Acer
 */
public class CountWordsInAString {
    
    //Normal Approch
    public static int countWord(String s){
        int state = 0;
        int words = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' || s.charAt(i) == '\n' || s.charAt(i) == '\t'){
                state = 0;
            }
            else if(state == 0){
                words++;
                state = 1;
            }
        }
        return words;
    }
    
    
    //Using Split Function
    public static int countWordSplit(String s){
        String arr[] = s.split("\\s+");
        return arr.length;
    }
    
    //Using String Tokenizer
    public static int countWordToken(String s){
        StringTokenizer tokens = new StringTokenizer(s);
        return tokens.countTokens();        
    }
    
    
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit emmet. A sit emmet dolor    lorem ipsum.";
        
        System.out.println("Using simple approch: ");
        System.out.println(countWord(s));
        
        System.out.println();
        
        System.out.println("Using spit function: ");
        System.out.println(countWordSplit(s));  
        
        System.out.println();
        
        System.out.println("Using String Tokenizer: ");
        System.out.println(countWordToken(s));
        
    }
    
}
