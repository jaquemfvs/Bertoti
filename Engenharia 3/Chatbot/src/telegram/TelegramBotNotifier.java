package telegram;

import observer.Observer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBotNotifier extends TelegramLongPollingBot implements Observer {
    private final String chatId;

    public TelegramBotNotifier(String chatId) {
        this.chatId = chatId;
    }

    @Override
    public String getBotUsername() {
        return "SeuBotUsername";
    }

    @Override
    public String getBotToken() {
        return "SeuBotToken";
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Aqui, você pode tratar mensagens recebidas no bot
    }

    @Override
    public void update(String mensagem) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(mensagem);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}