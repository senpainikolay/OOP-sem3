public class TextManipulation  {

         int numberOfSentences;
        int numberOfWords;
         int numberOfLetters;
        int numberOfVowels;
        int numberOfConsonants;
       String text;
       String longestWord;

       TextManipulation(String str) {
           text = str;
           sentenceCount();
           text = text.replaceAll("[^a-zA-Z0-9 ]", ""); // removes the extra characters. Only numbers, letters and space remain.
           wordsCount();
           lettersCount();
           vowelsCount();
           consonantsCount();
            theLongestWord();

       }

        public void sentenceCount()
        {
            numberOfSentences = text.split("[!?.:]").length; // Whenever the !/./:/? meets, the text is split
        }

        public void wordsCount()
        {
            numberOfWords = text.split("\\s").length;  // Separates and counts by whitespaces
        }

        public void lettersCount()
        {
            numberOfLetters = text.split("[a-zA-Z]").length; // counts all chars from a-z and A-Z
        }

        public void vowelsCount()
        {
            numberOfVowels = text.split("[aeiouAEIOU]").length; // counts specified vowels in regex
        }

        public void consonantsCount()
        {
            numberOfConsonants = text.split("[bcdfgjklmnpqstvxzhrwyBCDFGJKLMNPQSTVXZHRWY]").length;  // counts specified consonants in regex
        }

        public void theLongestWord()
        {
            String[] wordsInText = text.split("\\s");
            longestWord = wordsInText[0];
            for(int k = 0; k < wordsInText.length; k++) {
                //If length of longest word is less than any word present in the string
                if (longestWord.length() < wordsInText[k].length())
                    longestWord = wordsInText[k];
            }

        }


}
