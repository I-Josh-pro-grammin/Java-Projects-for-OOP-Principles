package FileHandler;

import java.io.*;

public class EmployeeName {
    public static  void main(String[] args){
        File file = new File("D:\\LECTURES\\MY CODES\\Java\\New\\Teacher's exercises\\FileHandler\\ReadFile.txt");
        Employee em = new Employee("Honorine", "Kirezi");

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LECTURES\\MY CODES\\Java\\New\\Teacher's exercises\\FileHandler\\ReadFile.txt"))) {
            out.writeObject(em);

        } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream("D:\\LECTURES\\MY CODES\\Java\\New\\Teacher's exercises\\FileHandler\\myFile"))) {
            Employee emp = (Employee)reader.readObject();
            System.out.println("First name: " + emp.getfName() );
            System.out.println("Last name: " + emp.getlName() );
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }}

