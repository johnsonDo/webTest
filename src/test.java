import java.io.*;

/**
 * Created by jiangdongcheng on 16/8/4.
 */
public class test {
    public static void main(String[] args){
        InputStreamReader inputReader = null;
        BufferedReader bufferReader = null;
        OutputStream outputStream = null;
        try
        {
            InputStream inputStream = new FileInputStream("test.txt");
            inputReader = new InputStreamReader(inputStream);
            bufferReader = new BufferedReader(inputReader);

            // 读取一行
            String line = null;
            StringBuffer strBuffer = new StringBuffer();

            while ((line = bufferReader.readLine()) != null)
            {
                strBuffer.append(line);
            }
            System.out.println(strBuffer);

        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        finally
        {
          try{
              inputReader.close();
              bufferReader.close();
          }catch (IOException e){
              e.printStackTrace();
          }

        }


}}
