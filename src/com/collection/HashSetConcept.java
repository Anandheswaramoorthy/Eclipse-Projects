package com.collection;
import java.util.HashSet;
import java.util.Scanner;


public class HashSetConcept {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        // Create HashSet to store unique employee IDs
		        HashSet<Integer> set = new HashSet<>();

		        // Read number of employee IDs
		        int n = sc.nextInt();

		        // Read initial employee IDs
		        for (int i = 0; i < n; i++) {
		            set.add(sc.nextInt());
		        }

		        sc.nextLine(); // clear buffer

		        // Perform operations until STOP
		        while (true) {

		            String command = sc.nextLine();

		            // Split command
		            String[] parts = command.split(" ");

		            // ADD operation
		            if (parts[0].equals("ADD")) {

		                int id = Integer.parseInt(parts[1]);
		                set.add(id);

		            }

		            // REMOVE operation
		            else if (parts[0].equals("REMOVE")) {

		                int id = Integer.parseInt(parts[1]);
		                set.remove(id);

		            }

		            // CHECK operation
		            else if (parts[0].equals("CHECK")) {

		                int id = Integer.parseInt(parts[1]);

		                if (set.contains(id)) {
		                    System.out.println("YES");
		                } else {
		                    System.out.println("NO");
		                }

		            }

		            // PRINT operation
		            else if (parts[0].equals("PRINT")) {

		                if (set.isEmpty()) {
		                    System.out.println("EMPTY");
		                } else {
		                    System.out.println(set);
		                }

		            }

		            // STOP operation
		            else if (parts[0].equals("STOP")) {

		                break;

		            }
		        }

		        sc.close();
		    }
		}
	


