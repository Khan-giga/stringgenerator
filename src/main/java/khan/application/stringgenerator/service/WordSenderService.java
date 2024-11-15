package khan.application.stringgenerator.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Класс который содержит основную логику по отправке строк
 */
@Slf4j
@Service
public class WordSenderService {

    private final Map<String, WordSender> wordSenders;
    private final RandomStringGenerator textGenerator;

    @Value("${sending.method}")
    private String sendingMethod;

    public WordSenderService(Map<String, WordSender> wordSenders, RandomStringGenerator textGenerator) {
        this.wordSenders = wordSenders;
        this.textGenerator = textGenerator;
    }

    /**
     * Шедулер вызывает данный метод каждую секунду, и отправляет рандомную строку
     */
    @Scheduled(fixedRate = 1000)
    public void send() {
        String text = textGenerator.generate(100);
        WordSender wordSender = wordSenders.get(sendingMethod);
        wordSender.sendWord(text);
        log.info("Строка: {} была успешно отправлена", text);
    }

}
