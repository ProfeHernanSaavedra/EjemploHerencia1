
import java.util.Date;



/**
 *
 * @author USRVI-LC2
 */
public class TestRedSocial {
    public static void main(String[] args) {
        
        Instagram insta = new Instagram(1, "en clases", true, "aaa", "123");
        insta.metodoSobreescritura();
        System.out.println(insta.toString());
        System.out.println("");
        Date fecha = new Date();
        Twitter tw = new Twitter(2, "trabajando", fecha, "bbb", "e21");
        tw.metodoSobreescritura();
        System.out.println(tw.toString());
        System.out.println("******POLIMORFISMO*****");
        RedSocial rs = new Instagram(3, "polimorfo", true, "aaa", "123");
        rs.metodoSobreescritura();
        System.out.println(rs.toString());
        
        //List<RedSocial> lista = new ArrayList<>();
        
    }
    
}
