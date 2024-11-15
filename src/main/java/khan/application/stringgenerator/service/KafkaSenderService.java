package khan.application.stringgenerator.service;

import khan.application.stringgenerator.dto.WordPayload;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Класс для отправки строки чрез kafka
 */
@Slf4j
@Service("kafkaSender")
@RequiredArgsConstructor
public class KafkaSenderService implements WordSender {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendWord(String word) {
        WordPayload payload = new WordPayload(word);
        kafkaTemplate.send("words-topic", payload);
        log.info("Отправка через kafka!");
    }

}
