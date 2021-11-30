import java.io.IOException;


// import com.fasterxml.jackson.core.type.TypeReference;
// import com.fasterxml.jackson.datablind.ObjectMapper;

public class Main {
    public static void main (String[] args) throws InterruptedException, IOException{
        ioHandler handler = new ioHandler();
        String fromCurr = handler.fromCurr();
        String toCurr = handler.toCurr();
        urlBuilder builder = new urlBuilder(fromCurr, toCurr);
        String url = builder.getUrl();
        urlHandler mrHandler = new urlHandler(url);
        String response = mrHandler.request();
        System.out.println(response);
        
        
    }
}