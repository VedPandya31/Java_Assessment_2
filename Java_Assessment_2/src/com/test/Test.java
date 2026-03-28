package com.test;

import java.util.Scanner;

import com.dao.PatientDao;
import com.model.PatientModel;

public class Test 
{
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        PatientDao dao = new PatientDao();
	        Bill billing = new Bill();

	        int choice;

	        do {
	            System.out.println("\n===== SmileCare Dental System =====");
	            System.out.println("1. Add Patient");
	            System.out.println("2. View Patients");
	            System.out.println("3. Generate Bill");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();
	            sc.nextLine(); // fix buffer

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Mobile: ");
	                    String mobile = sc.nextLine();

	                    PatientModel p = new PatientModel(name,mobile);
	                    dao.addPatient(p);
	                    break;

	                case 2:
	                    dao.viewPatients();
	                    break;

	                case 3:
	                    System.out.print("Treatment Cost: ");
	                    double t = sc.nextDouble();

	                    System.out.print("Medicine Cost: ");
	                    double m = sc.nextDouble();

	                    double total = billing.calculateTotal(t, m);
	                    System.out.println("💰 Total Bill = " + total);
	                    break;

	                case 4:
	                    System.out.println("Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
}
