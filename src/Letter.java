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

        String word = "camaleão";
        int count = letter(word);

        System.out.println("A palavra " + word + " tem " + count + " letras a/A");

    }
}
