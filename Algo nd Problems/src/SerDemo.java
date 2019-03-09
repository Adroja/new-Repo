import java.io.*;
//comment added

public class SerDemo implements Serializable {
	
	
	int r;
	String war;
	

	public SerDemo(int r, String war) {
		super();
		this.r = r;
		this.war = war;
	}

}

class test{
	
	
	public static void main(String args[]) {
		
		SerDemo obj = new SerDemo(7, "Mnis");
		
		
		try {
			FileOutputStream fout =new FileOutputStream("serfile");
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
			
			objOut.writeObject(obj);
			
			objOut.close();
			fout.close();
			
		}
			
		catch(IOException ex) {
			System.out.println("Io exception caught");
		}
		
		
		SerDemo obj2 = null;
		
		try {
			
			FileInputStream fin = new FileInputStream("serfile");
			ObjectInputStream objin = new ObjectInputStream(fin);
			
			obj2 = (SerDemo)objin.readObject();
			
			System.out.println(obj2.r);
			System.out.println(obj2.war);

			
		}
		
		catch(IOException ex2) {
			System.out.println("Ex2 caught");
		}
		catch (ClassNotFoundException ex3) {
			System.out.println("cls nt fnd ex in ex 3");
		}
		
	}
	
}
