import java.io.*;

public class FW {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\HCL Training\\codes.txt");
            String str;
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);

            System.out.println("Enter the string for writing:");
            str = br.readLine();

            fw.write(str);
            fw.close();

            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}