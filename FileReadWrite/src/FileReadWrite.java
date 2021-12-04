import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadWrite {
    public static void main(String[] args) throws Exception
    {
        FileInputStream in = null;
        FileOutputStream out = null;
        in = new FileInputStream("source_FileReadWrite.txt");
        out = new FileOutputStream("destination_FileReadWrite.txt");

        int byteData;
        while (true)
        {
            byteData = in.read();
            if (byteData == -1)
            {
                break;
            }
            out.write(byteData);
        }

        if (in!=null) in.close();
        if (out!=null) out.close();
    }
}
