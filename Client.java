import java.io.*;
import java.net.*;
 class MyClient {
    Socket s;
    BufferedReader brkey;
    BufferedReader br;
    PrintWriter out;
    String msg,data;
    MyClient()
    {
        brkey=new BufferedReader(new InputStreamReader(System.in));
        try {
        s=new Socket(InetAddress.getLocalHost(),9998);
            System.out.println("Connecting on Port 9999");
    
            if(s!=null)
            {
                System.out.println("Connected with server on port 9999");
                br=new BufferedReader (new InputStreamReader(s.getInputStream()));
                out=new PrintWriter(s.getOutputStream(),true);
                boolean check=true;
                while(check)
                {
                    System.out.println("<<");
                    msg=brkey.readLine();
                    out.println(msg);
                    data=br.readLine();
                    System.out.println("Server:"+data);
                    if(data.equalsIgnoreCase("Bye"))
                    {
                        check=false;
                    }
                
                }
            }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
         
                }
            public class Client{
                public static void main(String[] args) {
                    new MyClient();
                
                }
            }
        

    