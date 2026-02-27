import java.io.*;
import java.util.Scanner;

public class FileCopy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the source file name:");
            String source = sc.nextLine();
            System.out.println("Enter the destination file name:");
            String destination = sc.nextLine();
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);
            int ch;
            while((ch = fr.read()) != -1)
            {
                fw.write(ch);
            }
            fr.close();
            fw.close();
            System.out.println("File Copied using Character Stream.");
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream("byte_" + destination);
            int data;
            while((data = fis.read()) != -1)
            {
                fos.write(data);
            }
            fis.close();
            fos.close();
            System.out.println("File Copied using Byte Stream.");
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}