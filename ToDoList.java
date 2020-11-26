import java.util.*;

public class ToDoList {

	public static void main(String[] args) {
		
		System.out.println("Welcom to the virtual To Do list! \n");
		Scanner kb = new Scanner(System.in);
		int option;
		ArrayList<String> list = new ArrayList<String>();
		
		do {
			System.out.println("1. Check your To Do List on console. \n" +
					"2. Add a new task to the list. \n" +
					"3. Clear the list. ");
			System.out.println("Please select a option: ");
			
			option = Integer.parseInt(kb.next());
			
			if (option == 1) {
				System.out.println("Showing To Do list: \n");
				System.out.println(list);
				
			}
			
			if(option == 2) {
				System.out.println("Add a task: \n");
				Scanner addScan = new Scanner(System.in);
				String item = addScan.nextLine();
				list.add(item);
				
			}
			
			if(option == 3) {
				System.out.println("Task List Cleared. \n");
				list.clear();
				
				
			}
			
		}while(option != 4);
	}//end of main
}//end of class
