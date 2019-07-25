package RigoRetos.StonesAndJewels;

import java.util.HashSet;

/*
 You’re given strings J representing the types of stones that are jewels,
 and S representing the stones you have. Each character in S is a type of stone you have. 
 You want to know how many of the stones you have are also jewels. 
 The letters in J are guaranteed distinct, and all characters in J and S are letters. 
 Letters are case sensitive, so “a” is considered different type of stone from “A”.

			Example 1: 				Example 2:
			Input:					Input:
				J=”aA”					J="z"
				S=”aAAbbbb”				S="ZZ"
			Output:					Output:
				3						0
	
	- S and J consist of letters and have length at most 50.
	- The characters in J are distinct.

*/
public class App{
	
    public static void main( String[] args ){
    	
    	String jewels = "aA";
        String stones = "aAAbbbb";
        
        HashSet<Character> stonesHs = jAndS(jewels, stones);
        System.out.println(stonesHs);
        
    }
    
    public static HashSet<Character> jAndS(String jewels, String stones) {
    	HashSet<Character> stonesHs = new HashSet<Character>();
    	for(int i=0; i<stones.length(); i++) {
    		stonesHs.add(stones.charAt(i));
    	}
    	char[] stonesA = stones.toCharArray();
    	char[] jewelA = jewels.toCharArray();
    	
    	for(int i=0; i<stonesA.length;i++) {
    		char x = stonesA[i];
    		if(jewelA) {
    			
    		}
    	}
    	return stonesHs;
    
    }
}


