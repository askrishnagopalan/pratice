package java_practice;

import java.util.Arrays;

public class abcprogram {
    public static void main (String[] args) {

        // Original String
        String str = "Hello Java";

        // 1. toUpperCase()
        System.out.println("1. toUpperCase(): " + str.toUpperCase());

        // 2. toLowerCase()
        System.out.println("2. toLowerCase(): " + str.toLowerCase());

        // 3. length()
        System.out.println("3. length(): " + str.length());

        // 4. equals()
        String str2 = "  Hello Java  ";
        System.out.println("4. equals(): " + str.equals(str2));
        
        // 5. equals()
        String str3 = "  hello java  ";
        System.out.println("5. equals(): " + str.equals(str3));

        // 6. trim()
        String str4 = "  Hello Java  ";
        String trimmed = str4.trim();
        System.out.println("6. trim(): " + trimmed);

        // 7. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("7. valueOf(): " + numStr);

        // 8. concat()
        String result = str2.concat(" Programming");
        System.out.println("8. concat(): " + result);

        // 9. isEmpty()
        String emptyStr = "";
        System.out.println("9. isEmpty(): " + emptyStr.isEmpty());

        // 10. split()
        String data = "Java,Python,C";
        String[] arr = data.split(",");
        System.out.println("10. split():"+ Arrays.toString(arr));

        // 11. substring()
        String sub = trimmed.substring(0, 5);
        System.out.println("11. substring(): " + sub);
        String str5 = "Hello Java Programming";

        // 12. toCharArray()
        char[] chars = str5.toCharArray();
        System.out.println("12. toCharArray(): ");
        for(char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 13. getBytes()
        byte[] bytes = str5.getBytes();
        System.out.println("13. getBytes(): ");
        for(byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        // 14. contains()
        System.out.println("14. contains(\"Java\"): " + str5.contains("Java"));

        // 15. indexOf(int ch)
        System.out.println("15. indexOf('o'): " + str5.indexOf('o'));

        // 16. indexOf(String str)
        System.out.println("16. indexOf(\"Java\"): " + str5.indexOf("Java"));

        // 17. lastIndexOf(int ch)
        System.out.println("17. lastIndexOf('a'): " + str5.lastIndexOf('a'));

        // 18. lastIndexOf(String str)
        System.out.println("18. lastIndexOf(\"Java\"): " + str5.lastIndexOf("Java"));

        // 19. startsWith()
        System.out.println("19. startsWith(\"Hello\"): " + str5.startsWith("Hello"));

        // 20. endsWith()
        System.out.println("20. endsWith(\"Programming\"): " + str5.endsWith("Programming"));
        
         // 21. contains()
        System.out.println("21. contains(\"Qspider\"): " + str5.contains("Qspider"));
        
        // 22. startsWith()
        System.out.println("22. startsWith(\"Qspider\"): " + str5.startsWith("Qspider"));

        // 23. endsWith()
        System.out.println("23. endsWith(\"Qspider\"): " + str5.endsWith("Qspider"));
    }
}
