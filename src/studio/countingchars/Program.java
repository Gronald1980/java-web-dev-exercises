package studio.countingchars;

import java.util.HashMap;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String quote;

        System.out.println("Enter your quote:");
        quote = input.nextLine();
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String modifiedQuote = quote.toUpperCase();
        char[] charactersInString = modifiedQuote.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
        /*characterCount.put('', );
        characterCount.put('', );
        characterCount.put('', );
        characterCount.put('', );*/

        for(char character : charactersInString){
            if(characterCount.containsKey(character)) {
                characterCount.put(character, characterCount.get(character) + 1);
            }else{
                characterCount.put(character, 1);
            }


        }

        System.out.println(characterCount);
    }
}
