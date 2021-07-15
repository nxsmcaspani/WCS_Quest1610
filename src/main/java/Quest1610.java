public class Quest1610 {

    public static String reverseWords(String sentence){
        String reversed = "";
        for (String word : sentence.split(" ")){
            reversed = word+ " "+reversed;
        }
        return reversed.trim();
    }

    public static String reverseLetters(String sentence){
        String reversed="";
        for (String word : sentence.split(" ")){
            StringBuilder sb = new StringBuilder(word);
            reversed += sb.reverse()+" ";
        }
        return reversed.trim();
    }

    public static void main(String args[]){
        String sent1 = "This is a sample sentence";
        String sent2 = "This is another test sentence that we will twist";
        System.out.println(reverseWords(sent1));
        System.out.println(reverseWords(sent2));
        System.out.println(reverseLetters(sent1));
        System.out.println(reverseLetters(sent2));
    }
}
