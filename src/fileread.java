import java.io.*;
import java.util.Scanner;

public class fileread
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter Roll No:");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            System.out.println("Enter Subject:");
            String subject = sc.nextLine();
            System.out.println("Enter Marks:");
            int marks = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter existing file name:");
            String fileName = sc.nextLine();
            FileWriter fw = new FileWriter(fileName, true);
            fw.write("Roll No: " + roll + "\n");
            fw.write("Name: " + name + "\n");
            fw.write("Subject: " + subject + "\n");
            fw.write("Marks: " + marks + "\n");
            fw.write("----------------------\n");
            fw.close();
            System.out.println("\nData written successfully.\n");
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("File Content:\n");
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

