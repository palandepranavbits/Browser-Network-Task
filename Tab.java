package Assignment2;

import java.util.ArrayList;
import java.util.Random;

public class Tab {
	private int num_tasks;
	//private ArrayList<Task> tasks;
	private String url;
	protected ArrayList<Integer> percentages;
	public Tab(int n,String url1)
	{	
		url=url1;
		num_tasks=n;
		percentages = new ArrayList<>();
		this.generateTaskSizes();
		//Task t = new Task(1);
		//t.function1(this.url);
		
		
	}
	public void generateTaskSizes()
	{
		ArrayList<Integer> size = new ArrayList<>();
		int total_task_size = 0;
		for (int i = 0; i < this.num_tasks; i++) {
			Random rand = new Random();
			int task_size = rand.nextInt(900) + 100;
			new Task(task_size);
			total_task_size += task_size;
			//percentages.add(100 * task_size/total_task_size);
			size.add(total_task_size);
		}
		for(int i=0;i<this.num_tasks;i++)
		{
			percentages.add(100*size.get(i)/total_task_size);
		}
		System.out.println("Total size of tasks = " + total_task_size);
	}
	/*
	public void generatePercentage(int totalTaskSize , int taskSize){
			
	}
	*/
}
