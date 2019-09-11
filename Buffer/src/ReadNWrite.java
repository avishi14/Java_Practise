import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class WriteToFile extends Thread{
	public void fileWriteMethod()
	{
		try {
			FileWriter fw1=new FileWriter("IOFile.txt");
			BufferedWriter fw=new BufferedWriter(fw1);
			for(int i=1;i<=10;i++) {
				fw.write("Hello this is line..."+ i +"times\n" );
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Finished file writing process..");
				fw.write(" ");
			}
			fw.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error writing to file.."+e);
		}	

	}
}


class ReadFromFile extends Thread{

	public void ReadFromFile() throws IOException
	{
		try {
			FileReader fr1=new FileReader("IOFile.txt");
			BufferedReader br1=new BufferedReader(fr1);
			String str;

			while((str=br1.readLine())!=null)
				System.out.println(str);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

public class ReadNWrite extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadNWrite t1=new ReadNWrite();
		Runnable r1=new Runnable() {
			@Override
			public void run()
			{
				WriteToFile wrf=new WriteToFile();
				wrf.fileWriteMethod();
			}
		};
		Runnable r2=new Runnable() {

			@Override
			public void run() {
				ReadFromFile rff=new ReadFromFile();
				try {
					rff.ReadFromFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		//	Thread t = new Thread();
		r1.run();
		r2.run();
	}

}