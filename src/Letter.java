public class Letter {

    private static char character;

    public static int letter(String word){

        int count = 0;

        for(int i = 0; i < word.length(); i++){
            character = word.charAt(i);
            if(character == 'A' | character == 'a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        String word = "target sistema teste";
        int count = letter(word);

        System.out.println("The word " + word + " has " + count + " letters a/A");

    }
}
