/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinetop;
import org.telegram.telegrambots.ApiContext;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ric_2
 */
public class Cinetop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ApiContextInitializer.init();
        TelegramBotsApi con =new TelegramBotsApi();
        CinetopBot cine= new CinetopBot();
        try
          {
            con.registerBot(cine);
          }
          catch (TelegramApiRequestException e)
           {
            e.printStackTrace();
           }
    }
    
}
