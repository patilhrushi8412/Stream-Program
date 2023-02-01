package com.te;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Company {

	static Scanner sc = new Scanner(System.in);

	public static void emp(List<Employee> employees) {
		System.out.print("1.Get All Employees." + "\n2.Get All Employees By Salary From Low To High."
				+ "\n3.Get All Employees By Salary From High To Low." + "\n4.Get All Employees By Name Sorted."
				+ "\n5.Search Employee By Name\n6.Get The Employee Having Maximum Salary"
				+ "\n7.Get The Employee Having Mminimum Salary\n8.Search Employee"
				+ "\n9.Get Employees With Id And Name\n10.Get Employees With Name And Salary"
				+ "\n11.Get Employees By Designation\n12.Get List Of Employees whose Salary is Greater than Entered Salary"
				+ "\n13.Get The List Of Employees Contact Details" + "\nSelect : ");
		int k = sc.nextInt();
		switch (k) {

		case 1:
			System.out.println("Getting All Employee List : ");
			for (Employee employee : employees) {
				System.out.println(employee);
			}
			break;

		case 2:
			System.out.println("Employees By Salary From Low To High : ");
			employees.stream().sorted((o1, o2) -> o1.getEmployeesalary() - o2.getEmployeesalary())
					.forEach(t -> System.out.println(t));
			break;

		case 3:
			System.out.println("Employees By Salary From High To Low : ");
			employees.stream().sorted((o1, o2) -> o2.getEmployeesalary() - o1.getEmployeesalary())
					.forEach(t -> System.out.println(t));
			break;

		case 4:
			System.out.println("Employees By Name Sorted : ");
			employees.stream().sorted((o1, o2) -> o1.getEmployeeName().compareToIgnoreCase(o2.getEmployeeName()))
					.forEach(t -> System.out.println(t));
			break;

		case 5:
			System.out.print("Enter Name : ");
			String s = sc.next();
			List<Employee> list2 = employees.stream().filter(t -> t.getEmployeeName().toLowerCase().contains(s))
					.toList();
			if (list2.isEmpty()) {
				System.out.println("[]");
			} else {
				list2.forEach(t -> System.out.println(t));
			}

			break;

		case 6:
			System.out.println("Employee Having Maximum Salary : \n"
					+ employees.stream().max((o1, o2) -> o1.getEmployeesalary() - o2.getEmployeesalary()).get());
			break;

		case 7:
			System.out.println("Employee Having Minimum Salary : \n"
					+ employees.stream().min((o1, o2) -> o1.getEmployeesalary() - o2.getEmployeesalary()).get());
			break;

		case 8:
			System.out.print("Search : ");
			String s1 = sc.next();
			System.out.println("Employees : ");
			List<Employee> collect = employees.stream().filter(t -> t.getEmployeeName().toLowerCase().contentEquals(s1)
					|| t.getDesignation().toLowerCase().contains(s1) || t.getEmailId().toLowerCase().contains(s1)
					|| t.getEmployeeAddress().toLowerCase().contains(s1)).collect(Collectors.toList());
			if (collect.isEmpty()) {
				System.out.println("[]");
			} else {
				for (Employee emp : collect) {
					System.out.println(emp);
				}
			}
			break;
		
		case 9:
			System.out.println("Employee List With Id and Name : ");
			List<Map<Integer, String>> list = employees.stream().map(t -> {
				Map<Integer, String> m = new HashMap<>();
				m.put(t.getId(), t.getEmployeeName());
				return m;
			}).toList();
			list.forEach(t -> {
				System.out.println("Id : "
						+ t.entrySet().stream().map(x -> x.getKey()).toList().stream().findFirst().get() + ", Name : "
						+ t.entrySet().stream().map(x -> x.getValue()).toList().stream().findFirst().get() + ".");
			});
			break;
		
		case 10:
			System.out.println("Employee List With Name and Salary : ");
			List<Map<String, Integer>> list1 = employees.stream().map(t -> {
				Map<String, Integer> m = new HashMap<>();
				m.put(t.getEmployeeName(), t.getEmployeesalary());
				return m;
			}).toList();
			list1.forEach(t -> {
				System.out.println("Name : "
						+ t.entrySet().stream().map(x -> x.getKey()).toList().stream().findFirst().get() + ", Salary : "
						+ t.entrySet().stream().map(x -> x.getValue()).toList().stream().findFirst().get() + ".");
			});
			break;

		case 11:
			System.out.print("Enter Designation : ");
			String l = sc.next();

			List<Employee> collect2 = employees.stream().filter(t -> t.getDesignation().toLowerCase().contains(l))
					.collect(Collectors.toList());
			if (collect2.isEmpty()) {
				System.out.println("[]");
			} else {
				collect2.forEach(t -> System.out.println(t));
			}
			break;
		
		case 12:
			System.out.println("Enter Salary : ");
			int sal = sc.nextInt();
			System.out.println("List Of Employees Whose Salary is Greatre Than " + sal);
			List<Employee> collect3 = employees.stream().filter(t -> t.getEmployeesalary() >= sal)
					.collect(Collectors.toList());
			if (collect3.isEmpty()) {
				System.out.println("[]");
			} else {
				collect3.forEach(t -> System.out.println(t));
			}

		case 13:
			System.out.println("Employees Contact Details : ");
			List<EmpPojo> collect4 = employees.stream().map(t -> {
				EmpPojo pojo = new EmpPojo();
				pojo.setEmployeeName(t.getEmployeeName());
				pojo.setEmailId(t.getEmailId());
				pojo.setEmployeeAddress(t.getEmployeeAddress());
				pojo.setMobileNo(t.getMobileNo());
				return pojo;
			}).collect(Collectors.toList());

			if (collect4.isEmpty()) {
				System.out.println("[]");
			} else {
				collect4.forEach(t -> System.out.println(t));
			}
			break;
		
		default:
			System.err.println("You Entered The Wrong Input, Enter Again");
			emp(employees);
			break;
		}
	}

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Shreyas K", 53000, "Shirol", "shreyask@gmail.com", 9874563321l, "Q.A"),
				new Employee(2, "Hrushikesh Patil", 75000, "Kolhapur", "hrushiP@gmail.com", 7845961471l,
						"Backend Developer"),
				new Employee(3, "Anil Thapa", 83000, "Pune", "anilthapa@gmail.com", 9412358721l, "Senior Developer"),
				new Employee(4, "Dharshan Wawale", 57000, "Mangalweda", "dharshanw@gmail.com", 9413657820l,
						"Front End Developer"),
				new Employee(5, "Amir Mulla", 69000, "Mumbai", "amirmulla@gmail.com", 7458961230l, "Test Engineer"));

		emp(employees);

	}

}
