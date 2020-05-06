package Task1;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Methods {
    public void serialize(Employee employee) {

        try {

            System.out.println("Enter file name to serializeble");
            Scanner scanner = new Scanner(System.in);
            String filename = scanner.nextLine();
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(employee);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException has been caught");
        }

    }

    public void deserealize(Employee employee) {
        System.out.println("Enter name to deserealize");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            employee = (Employee) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("name = " + employee.getName());
            System.out.println("id = " + employee.getId());
            System.out.println("salary = " + employee.getSalary());
        } catch (IOException ex) {
            System.out.println("IOException has been caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException has been caught");
        }
    }

    public void serialize(LinkedList<Employee> eList) {

        try {

            System.out.println("Enter  name to serializeble");
            Scanner scanner = new Scanner(System.in);
            String filename = scanner.nextLine();

            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);


            out.writeObject(eList);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

    }

}

