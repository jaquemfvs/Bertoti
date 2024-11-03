package telegram;

import model.Restaurante;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBotConfig {
    public static void iniciarBot(Restaurante restaurante) {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();

        try {
            TelegramBotNotifier bot = new TelegramBotNotifier("SeuChatID");
            botsApi.registerBot(bot);
            restaurante.registerObserver(bot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}