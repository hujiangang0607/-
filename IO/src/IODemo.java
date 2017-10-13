import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class IODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader read=new FileReader("C:/Users/hujia/Desktop/12.docx");
			Writer wri=new FileWriter("C:/Users/hujia/Desktop/copy.docx");
			char[] cha=new char[32];
			while(read.read()>0){
				wri.write(cha, 0, cha.length);
				wri.flush();
			}
//			InputStreamReader in=new InputStreamReader(new FileInputStream("C:/Users/hujia/Desktop/12.docx"),"UTF-8");
//			OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("C:/Users/hujia/Desktop/copy.TXT"),"UTF-8");
//			BufferedReader br=new BufferedReader(in);
//			BufferedWriter bw=new BufferedWriter(out);
//			String str=br.readLine();
//			while(str!=null){
//				bw.write(str);
//				bw.flush();
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
