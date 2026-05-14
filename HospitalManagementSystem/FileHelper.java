import java.io.*;

public class FileHelper {

    // Write Data
    public static void writeData(String fileName, String data) {

        try {

            FileWriter fw = new FileWriter(fileName, true);

            fw.write(data + "\n");

            fw.close();

        } catch (IOException e) {

            System.out.println("Error Writing File");
        }
    }

    // Read Data
    public static void readData(String fileName) {

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error Reading File");
        }
    }

    // Search Patient
    public static void searchPatient(int patientId) {

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("patients.txt"));

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {

                String data[] = line.split(",");

                int id = Integer.parseInt(data[0]);

                if (id == patientId) {

                    System.out.println("Patient Found:");
                    System.out.println(line);

                    found = true;
                    break;
                }
            }

            if (!found) {

                System.out.println("Patient Not Found");
            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error Searching Patient");
        }
    }
}