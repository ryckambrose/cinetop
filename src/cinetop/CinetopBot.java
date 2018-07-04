/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinetop;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
/**
 *
 * @author ric_2
 */
public class CinetopBot extends TelegramLongPollingBot {
        @Override
    public void onUpdateReceived(Update update) {
        System.out.print(update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getText());

        //se manda el mensaje
        SendMessage MandaMensaje = new SendMessage().setChatId(update.getMessage().getChatId());
        if (update.getMessage().getText().equals("hola")||update.getMessage().getText().equals("Hola"))
        {
            MandaMensaje.setText("HOLA " + update.getMessage().getFrom().getFirstName());
        }else {
            if (update.getMessage().getText().equals("quien soy?") || update.getMessage().getText().equals("Quien soy?")) {
                MandaMensaje.setText("eres " + update.getMessage().getFrom().getFirstName());
            } else {
                MandaMensaje.setText("ki asco escribe bien we " + update.getMessage().getFrom().getFirstName());
            }
        }
        try {
            sendMessage(MandaMensaje);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {
        return "579504958:AAGWf0EHfvBnu6NNPdZkUhadp7y0wa8sOBg";
    }
}
