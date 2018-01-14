package StudentsAdmin;

public class Operate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManageSystem sys = new ManageSystem();
		AConsole console = new AConsole();
		
		console.println("********Welcome to students administration system!********");
		
		while(true) {
			console.print("Order > ");
			//Read your input
			String input = console.readString("");
			
			if(input.equals("add")) {
				console.print("Please input the ID of student:");
				String id = console.readString("");
				console.print("Please input the student's fullname:");
				String name = console.readString("");
				console.print("Please input your cellphone's number:");
				String cellphone = console.readString("");
				
				Student s = new Student(id, name, cellphone);
				sys.add(s);  
				console.println("Success!");
			}
			
			else if (input.equals("list")) {
				//Print out the content of list
				sys.list();  
			}
			
			else if(input.equals("find")) {
				console.print("Please input the name who you are looking for:");
				String name = console.readString("");
				Student s = sys.find(name);
				if (s != null) {
					console.println("Found the student " + s);
				}
				else {
					console.println("Didn't find!");
				}
			}
			
			else if(input.equals("remove")) {
				
			}
			
			else {
				console.println("Undefined input! " + input);
			}
			//Process your input
			//console.println(input + " Okay!"); 
			
		}
	}

}
