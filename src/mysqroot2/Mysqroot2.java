package mysqroot2;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Mysqroot2 {
	public static void main(String[] args) throws Exception {
		// Hardcoded  file path
		String filePath = "C:\\All_Demoprojects\\Mysqroot2\\src\\number.txt";
		
		if(filePath.isEmpty()) {
			System.out.println("file path not provided");
		}else {
			// Reading the lines from the file  and calculating the square the root
			Files.lines(Paths.get(filePath))
            .forEach(line -> System.out.println(sqrt(line.trim())));//  Trimmimg the input for safety
	}
}
	// Function to compute square root using Newton's method
     private static String sqrt(String input) {
		// TODO Auto-generated method stub
		try {
			double x=Double.parseDouble(input);// Convert the input String to a double
			double z=1; // Start with the initial guess for square root
			// Handle numbers less 25
			if(x<0) {
				return x+" is an Incorrect number 12 ";
			}
			// Newton's method loop to compute the square root
			for(int i=0;i<25 && Math.abs(z - (z = (z + x / z) / 2))  > 0.001;i++);
			return String.format("Square root of %.4f is %.4f",x,z);
			
		}catch(NumberFormatException e) {
			return input + " is an incorrect number (not a valid numeric value)";
			
		} catch (Exception e) {
			// TODO: handle exception
			return "An error occurred: " + e.getMessage();
		}
	}
 }
