/**
 * Use some string methods.
 * 
 * @author Kevin Lo
 * @version 2020-08-31
 */
public class StringMethods
{
    public static void main(String[] args)
    {
        String word =  "riGhtS"; 
        // Do not change the line above
        //Finding length of given string
        System.out.print("The length of \"");
        System.out.print(word);
        System.out.print("\"");
        System.out.print(" is ");
        System.out.print(word.length());
        System.out.println(".");
        //Making string all uppercase
        System.out.print("ALL UPPER CASE: ");
        System.out.print(word.toUpperCase());
        System.out.println(".");
        //Making string all lower case
        System.out.print("all lower case: ");
        System.out.print(word.toLowerCase());
        System.out.println(".");
        //Making string lower case with space removed
        System.out.print("all lower case with space removed: ");
        System.out.print(word.replace(" ", "").toLowerCase());
        System.out.println(".");
        //Making string replace 'S' by '$'
        System.out.print("The original word with 'S' replaced by '$': ");
        System.out.print(word.replace("S","$"));
        System.out.println(".");
        
 
    }
}