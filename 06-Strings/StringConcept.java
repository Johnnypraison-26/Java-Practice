public class StringConcept { 
    public static void main(String[] args) { 
        String s = "johnny"; // create a separate object (string pool) 
        String str = new String("karunya"); // FIXED: Removed invalid parameter label 'original:'

        // length - find the length of String 
        System.out.println("length : " + s.length()); 

        // charat - to print a specific Character 
        System.out.println("char : " + s.charAt(3)); // 3 is index 

        // toUpperCase - convert to capital 
        System.out.println("upper : " + s.toUpperCase()); 

        // toLowerCase - convert to lower 
        System.out.println("lower : " + s.toLowerCase()); 

        // equals - check both strings are same 
        System.out.println("Equals : " + s.equals(str)); 

        // equalsIgnoreCase - it will ignore capital or small letter 
        String s1 = "jaVa"; 
        String s2 = "java"; 
        System.out.println(s1.equalsIgnoreCase(s2)); 

        // compareTo - compare lexicographical 
        String s3 = "abd"; 
        String s4 = "abc"; 
        System.out.println("Compare : " + s3.compareTo(s4)); // learn, important 

        // contains - checks whether string is present or not 
        System.out.println(s4.contains("ab")); // checks whether the string "ab" is present or not and return true or false 

        // startsWith - check given string is starting 
        String k = "programming"; 
        System.out.println("StartsWith : " + k.startsWith("pro")); // case sensitive 

        // endsWith - check whether the string ends 
        System.out.println("endsWith : " + k.endsWith("ing")); 

        // substring 
        System.out.println("substring : " + k.substring(3)); // FIXED: Removed invalid parameter label 'beginindex:'
        System.out.println("Another substring : " + k.substring(3, 7)); 

        // indexof - give index of current Character 
        System.out.println("Index of: " + k.indexOf('g')); // if u put anything other than which is in the string it returns its default value "-1" 
        System.out.println("LAstindex : " + k.lastIndexOf('m')); // FIXED: Added missing 'k.' reference and removed invalid parameter label 'ch:'

        // replace - change the Character 
        System.out.println("Replace : " + k.replace('m', '#')); // FIXED: Removed invalid parameter labels 'oldchar:' and 'newchar:'

        // trim - removes trailing and leading spaces 
        String a = "java"; 
        System.out.println("Trim : " + a.trim()); // learn 

        // split - splits each word from the used string 
        String b = "Roshan Ooty Coimbatore"; 
        String arr[] = b.split(" "); // FIXED: Removed invalid parameter label 'regex:'
        for(String abc : arr){ 
            System.out.println(abc); 
        } 

        // isEmpty - check empty or not 
        String x = "a"; 
        System.out.println("isEmpty : " + x.isEmpty()); 

        // how to add 2 strings 
        String first = "java"; 
        String second = "programming";
        
        // we need combine both string into one that is java programming 
        System.out.println(first + " " + second); // FIXED: Corrected spelling from 'fisrt' to 'first'
        System.out.println(first.concat(second)); 
    } 
}