package com.collection;
import java.util.PriorityQueue;
import java.util.Scanner;
public class PriorityQueueConcept {

	public static void main(String[] args) {
		

 	        Scanner sc = new Scanner(System.in);

		        // Read number of tasks
		        int n = sc.nextInt();

		        // Create PriorityQueue
		        PriorityQueue<Integer> pq = new PriorityQueue<>();

		        // Read task priorities and add to queue
		        for (int i = 0; i < n; i++) {
		            pq.add(sc.nextInt());
		        }

		        // Read new task priority
		        int newTask = sc.nextInt();

		        // Add new task
		        pq.add(newTask);

		        // Remove highest-priority task
		        // (smallest number = highest priority)
		        pq.poll();

		        // Print updated queue
		        System.out.println("Updated Queue of Task Priorities:");

		        while (!pq.isEmpty()) {
		            System.out.print(pq.poll() + " ");
		        }

		        sc.close();
		    }
	}


