import java.io.*;

public class pr26 {
    public static void main(String[] args) {
        int chars = 0, words = 0, lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();

                String[] w = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    words += w.length;
            }

            br.close();

            System.out.println("Characters: " + chars);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide file name");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
/*
output
  > java pr26 sample.txt
Characters: 45
Words: 8
Lines: 3
  */
  
