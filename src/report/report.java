package report;

import java.sql.Connection;
import java.util.HashMap;

/**
 *
 * @author Quemuel
 */
public class report {
    
    //Display paremeterized report
    public void display(Connection con, String report,HashMap options){
        try{
            /*
            
            
            code for generate reports
            
            
            */
        }catch(Exception e){
            System.out.println("Não foi possível gerar o relatório, erro: "+e.getMessage());
        }
    }
}
