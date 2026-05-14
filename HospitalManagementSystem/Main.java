import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Add Doctor");
            System.out.println("5. View Doctors");
            System.out.println("6. Book Appointment");
            System.out.println("7. View Appointments");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    Patient p =
                            new Patient(pid, pname, age, disease);

                    FileHelper.writeData("patients.txt", p.toString());

                    System.out.println("Patient Added Successfully");

                    break;

                case 2:

                    System.out.println("\n--- Patient Records ---");

                    FileHelper.readData("patients.txt");

                    break;

                case 3:

                    System.out.print("Enter Patient ID to Search: ");

                    int searchId = sc.nextInt();

                    FileHelper.searchPatient(searchId);

                    break;

                case 4:

                    System.out.print("Enter Doctor ID: ");

                    int did = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Doctor Name: ");

                    String dname = sc.nextLine();

                    System.out.print("Enter Specialization: ");

                    String spec = sc.nextLine();

                    Doctor d =
                            new Doctor(did, dname, spec);

                    FileHelper.writeData("doctors.txt", d.toString());

                    System.out.println("Doctor Added Successfully");

                    break;

                case 5:

                    System.out.println("\n--- Doctor Records ---");

                    FileHelper.readData("doctors.txt");

                    break;

                case 6:

                    System.out.print("Enter Patient ID: ");

                    int patientId = sc.nextInt();

                    System.out.print("Enter Doctor ID: ");

                    int doctorId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Appointment Date: ");

                    String date = sc.nextLine();

                    Appointment ap =
                            new Appointment(patientId, doctorId, date);

                    FileHelper.writeData(
                            "appointments.txt",
                            ap.toString());

                    System.out.println("Appointment Booked");

                    break;

                case 7:

                    System.out.println("\n--- Appointment Records ---");

                    FileHelper.readData("appointments.txt");

                    break;

                case 8:

                    System.out.println("Thank You");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 8);

        sc.close();
    }
}