package FileIOPackage;
import java.io.*;
public class CheckFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of file");
		String filename=br.readLine();
		
		String path="C:\\Users\\HP\\Desktop\\Java Sept 2023\\StreamFileIo\\src\\FileIOPackage";
		File f=new File(path+"\\"+filename);
		if(f.isDirectory())
		{
			System.out.println("It is a directory");
			f.list();
			for(String s:f.list())
			{
				System.out.println(s);
			}
			
		}else if(f.isFile())
		{
			System.out.println("It is a file");
			System.out.println(f.length());
			if(f.length()<25)
			{
				System.out.println("Using buffered reader");
				BufferedReader br1=new BufferedReader(new FileReader((path+"\\"+f.getName())));
				String str;
				while((str=br1.readLine())!=null)
				{
					System.out.println(str);
				}
				br1.close();
			}
			else
			{
				System.out.println("Using filestream");
				InputStream is=new FileInputStream(path+"\\"+f.getName());
				int i;
				while((i=is.read())!=-1)
					System.out.print((char)i);
				is.close();
			}
			
		}
		
	}

}