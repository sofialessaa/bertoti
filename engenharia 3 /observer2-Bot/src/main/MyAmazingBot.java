import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

import java.util.ArrayList;
import java.util.List;

public class MyAmazingBot implements LongPollingSingleThreadUpdateConsumer {
    private final TelegramClient telegramClient;
    private final List<String> clientes; 

    public MyAmazingBot(String botToken) {
        telegramClient = new OkHttpTelegramClient(botToken);
        clientes = new ArrayList<>();
    }

    @Override
    public void consume(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String chatId = update.getMessage().getChatId().toString();
            String message = update.getMessage().getText();

            if (message.equalsIgnoreCase("/start")) {
                if (!clientes.contains(chatId)) {
                    clientes.add(chatId);
                    enviarMensagem(chatId, "Você foi cadastrado para receber promoções da Cafeteria!");
                } else {
                    enviarMensagem(chatId, "Você já está cadastrado!");
                }
            } else if (message.equalsIgnoreCase("/promocao")) {
                notificarClientes("Promoção: Café com 80% de desconto só hoje!");
            }
        }
    }

    // Método para enviar mensagem a um cliente
    private void enviarMensagem(String chatId, String texto) {
        SendMessage sendMessage = new SendMessage(chatId, texto);
        try {
            telegramClient.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    // Método para notificar todos os clientes
    private void notificarClientes(String mensagem) {
        for (String cliente : clientes) {
            enviarMensagem(cliente, mensagem);
        }
    }
}
