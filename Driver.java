import java.io.*;
import java.util.*;
public class Driver
{
    public static void main(String[] args)
    {
        FileReader file = null;
        try
        {
            file = new FileReader("data.txt");
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Oooops!");
        }
        finally
        {
            System.out.println("Finished try/catch");
        }
        Scanner in = new Scanner(file);
        char ch = '0';
        String s = null;
        s = in.nextLine();
        System.out.printf("s = %s%n", s);
        GenStack<Character> stack = new GenStack<Character>();
        for (int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));
        String rev = new String("");
        while (!stack.empty())
            rev += stack.pop();
        System.out.printf("rev = %s%n", rev);
        GenStack<Integer> intStack = new GenStack<Integer>();
        intStack.push(4);
        intStack.push(2);
        intStack.push(11);
        intStack.push(7);
        intStack.push(88);
        System.out.printf("Top = %d%n", intStack.pop());
        GenStack<String> strStack = new GenStack<String>();
        strStack.push("AA");
        strStack.push("BB");
        strStack.push("CC");
        strStack.push("DD");
        strStack.push("EE");
        System.out.printf("Top = %s%n", strStack.pop());
        FileReader file2 = null;
        try{
            file2 = new FileReader("students.txt");

        }catch(FileNotFoundException fnfe){
            System.out.println("students.txt not found");
            return;
        }finally{
            System.out.println("Finished try/catch for students file");
        }

        Scanner in2 =  new Scanner(file2);
        GenStack<Student> studentStack  = new GenStack<Student>();

        while(in2.hasNextLine()){

                String firstName  = in2.nextLine().trim();
                String lastName = in2.nextLine().trim();
                String major  = in2.nextLine().trim();

                Student student  = new Student(firstName, lastName,major);
                studentStack.push(student);



        }
        System.out.println("Popping elements from stack");
        while(!studentStack.empty()){
            System.out.println(studentStack.pop());

        }
        in2.close();



    }
}
