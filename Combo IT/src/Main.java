import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inputF = null;
		BufferedWriter outputF = null;
		
		try {
			inputF = new BufferedReader(new FileReader(new File("combo.txt")));
			outputF = new BufferedWriter(new FileWriter("filtered.txt"));
			String data;
			Set<String> set = new HashSet<String>();
			
			while((data = inputF.readLine()) != null) {
				if(set.add(data)) {   									//DI BASE HA TRUE
					if(data.contains(".it:")) {
						outputF.write(data + '\n');
						System.out.println(data);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputF!=null)
			inputF.close();
			outputF.close();
		}
			
	}

}
