import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
         * A CLI task manager
         * - each task: {int ID, String Description, String Priority}
         * - task manager: {display menu ['1- add new task',
         *                                '2- view all tasks',
         *                                '3- view a task',
         *                                '4- delete a task'] }
         * */

//        new TaskManager();

        /*
         * Learn File Handling
         * */

//        new MyFileHandler();

        /*
         * Learn Exception Handling
         * */
//        try{
//            checkNumber(-34);
//        }catch(NumberFormatException e){
//            System.out.println("Error");
//        } catch (NumberNotSuitableException e) {
//            System.out.println("HELLO");
//        }

        /*
         * Learn Arrays
         * */
//        boolean[] str = new boolean[8];
//        System.out.println(str[0]);

//        char [] chars = {'a','h','m','e','d'};
//        String name = new String(chars);
//        System.out.println(chars);
//        System.out.println(name.length());

//        int[] arr1 = {12, 321, 31234, 4};
//        int[] arr2 = new int[arr1.length];
        // COPY ARRAY
//        arr2 = Arrays.copyOf(arr1,arr1.length);
//        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

//        System.out.println(arr2[2]);
//        arr2[2] = 100;
//        System.out.println(arr2[2]);
//        System.out.println(arr1[2]);

        // traverse [traditional for loop - enhanced for loop - while loop]

        /*
         * Learn char / String
         * */

//        System.out.println("Heart: " + '\u2764'); // \u2764
//        System.out.println("char of 78: " + (char) 78);
//        System.out.println("ASCII of $: " + (int) '$');

        // char operations [ + , - , < , == ]
        char ch1 = 'a';
        char ch2 = 'b';
//        System.out.println(ch1+1 <= ch2);
//        System.out.println((int)ch1);
//        System.out.println((int)Character.toUpperCase(ch1+26));
//        System.out.println((int)Character.toLowerCase(ch1) - (int)ch1);
//        System.out.println((int) 'a');
//        System.out.println((int) 'z');
//        System.out.println((int) 'z' - (int) 'a');

        // String creation
        String st1 = "Name"; // string pool
        String st2 = "Name"; // string pool same reference

//        System.out.println(st1 == st2); // address reference

        String st3 = new String("Name"); // stored in heap
        String st4 = new String("Name");
//        System.out.println(st3 == st4); // two different objects
//        System.out.println(st3.equals(st4)); // compare content

        // length() / isEmpty() / isBlank() / trim() == strip()
        // indexOf() / lastIndexOf() / contains() / startsWith() / endsWith()
        // charAt()

        /*
        * Compare String
        * */
        String str1 = "name";
        String str2 = "Name";

//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println("A".compareTo("B")); // negative value (-1) "A" less than "B" by -1
//        System.out.println("C".compareTo("B")); // positive value (1)
//        System.out.println("a".compareTo("A")); // 32
//        System.out.println("a".compareToIgnoreCase("A")); // 0


        /*
        * Substring >> .substring(start, end-1)
        * */

//        String sentence = "Hema is here for learning JAVA";
//        System.out.println(sentence.substring(4));
//        System.out.println(sentence.substring(0,sentence.indexOf(' ')+1)); // first word
//        System.out.println(sentence.substring(sentence.lastIndexOf(' ')+1)); // last word

        // Practical example: Extract domain from email
        String email = "user@example.com";
//        System.out.println(email.substring(email.indexOf('@')+1, email.lastIndexOf('.'))); // example

        /*
        * String split() / join()
        * */

        // Splitting strings
//        String sentence = "Java is an object-oriented language";
//        String[] words = sentence.split(" ");  // Split by space
//
//        System.out.println("Words in sentence:");
//        for (String word : words) {
//            System.out.println("- " + word);
//        }


        // Split with limit
//        String csv = "apple,banana,orange,grape,mango";
//        String[] fruits = csv.split(",", 3);  // Split into 3 parts
//        System.out.println("\nLimited split (3 parts):");
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        // Split by multiple delimiters (regex)
//        String complex = "apple,banana;orange grape";
//        String[] items = complex.split("[,; ]");  // Split by comma, semicolon, or space
//        System.out.println("\nMultiple delimiters:");
//        for (String item : items) {
//            System.out.println(item);
//        }

        // Joining strings (Java 8+)
//        String[] colors = {"Red", "Green", "Blue"};
//        String joined1 = String.join(", ", colors);  // "Red, Green, Blue"
//        String joined2 = String.join(" - ", colors); // "Red - Green - Blue"
//        System.out.println("\nJoined with comma: " + joined1);
//        System.out.println("Joined with dash: " + joined2);

//        String name = "Alice";
//        int age = 25;
//        double salary = 50000.50;

        // Method 4: formatted() method (Java 15+)
//        String message4 = "%S is %d years old".formatted(name, age);
//        System.out.println(message4);

        // palindrome
//        String[] words = {"radar", "hello", "level", "world", "madam"};
//
//        for(String word:words){
//            String reversed = new StringBuilder(word).reverse().toString();
//            System.out.println("Word: "+word);
//            System.out.println("Word Reversed: "+reversed);
//            System.out.println("Is Palindrome: "+word.equals(reversed));
//            System.out.println("************");
//        }
//

        // Word counter
        String paragraph = "Java    very popular programming language. " +
                "Java    used for web development, mobile apps, " +
                "and enterprise applications.";

        // Convert to lowercase for case-insensitive counting
        paragraph = paragraph.toLowerCase();
//        System.out.println(paragraph);

        // Remove punctuation
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", ""); // remove all except a-z && ' '
        System.out.println(paragraph);

        // Split into words
        String[] words = paragraph.split("\\s+");

        // Count words
        System.out.println("Total words: " + words.length);

        // Count specific word
        String searchWord = "isss";
        int count = 0;
        for (String word : words) {
            System.out.println("_ "+ word);
            if (word.equals(searchWord)) {
                count++;
            }
        }
        System.out.println("The word '" + searchWord + "' appears " + count + " times");

        // Find longest word
        String longestWord = "";
        String shortestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            if(word.length() < shortestWord.length()){
                shortestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord + " (" + longestWord.length() + " chars)");
        System.out.println("Shortest word: " + shortestWord + " (" + shortestWord.length() + " chars)");



    }

    static void checkNumber(int num) throws NumberNotSuitableException {
        if (num <= 0) {
            throw new NumberNotSuitableException();
        }
    }
}