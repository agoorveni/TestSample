
public class EmployeeTestClass {

	
		
		public static void main(String[] args) {
			try {
				
				String s= "Welcome";
				int length = s.length();
				System.out.println(length);
				char charAt = s.charAt(8);
				System.out.println(charAt);
				
				
			} 
			
catch (StringIndexOutOfBoundsException e) {
				
				System.out.println("handled");
				
			}

			
			
			catch (Exception e) {
				
				System.out.println("Exception handled");
				
			}
			
			
			finally {
				System.out.println("completed");
			}
		}
		
	}
	

