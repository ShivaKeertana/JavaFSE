public class TestSingleton{
	public static void main(String args[]){
		Logger log1 = Logger.getInstance();
		log1.log("This is the first log message");


		Logger log2 = Logger.getInstance();
		log2.log("This is the second log message");

		if(log1==log2){
			System.out.println("Singleton proved because both the logger instances are same");
		}
		else{
			System.out.println("Singleton failed");
		}
	}
}