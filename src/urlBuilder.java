import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class urlBuilder {
    
    private static final String api_token = get_api_token();
    
    
    private static final String base_url = "https://www.alphavantage.co/query?";
    private static final String curr_exc_rate = "function=CURRENCY_EXCHANGE_RATE";
    private static final String from_curr = "&from_currency=";
    private static final String to_curr = "&to_currency=";
    private static final String api = "&apikey=";
    
    private String f_curr;
    private String t_curr;
    private String url;

    public urlBuilder(String from_curr, String to_curr){
        this.f_curr = from_curr;
        this.t_curr = to_curr;
        check_token(this.api_token);
        build();
    }

    private static String get_api_token(){
        String token = "";
        try {
            Scanner diskScanner = new Scanner(new File("/home/dd/projects/my_projects/market-checker/src/token.txt"));
            token = diskScanner.nextLine();
            diskScanner.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return token;
    }

    private static void check_token(String token){
        if(token == ""){
            System.out.println("Token invalid, Please try again.");
            System.exit(0);
        }
    }
    private void build(){
        this.url = base_url + curr_exc_rate + from_curr + f_curr + to_curr + t_curr + api + api_token; 
    }
    public String getUrl(){
        return this.url;
    }
}
