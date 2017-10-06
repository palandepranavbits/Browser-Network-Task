package Assignment2;

import java.util.Random;

public class Tab {
	private int num_tasks;
	//private ArrayList<Task> tasks;
	private String url;
	public Tab(int n,String url1)
	{	
		url=url1;
		num_tasks=n;
		this.generateTaskSizes();
		//Task t = new Task(1);
		//t.function1(this.url);
	}
	public void generateTaskSizes()
	{
		int total_task_size = 0;
		for (int i = 0; i < this.num_tasks; i++) {
			Random rand = new Random();
			int task_size = rand.nextInt(900) + 100;
			new Task(task_size);
			total_task_size += task_size;
		}
		System.out.println("Total size of tasks = " + total_task_size);
	}
	
}
