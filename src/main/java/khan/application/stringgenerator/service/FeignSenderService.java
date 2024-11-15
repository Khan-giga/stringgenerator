package khan.application.stringgenerator.service;

import khan.application.stringgenerator.dto.request.RequestWordDto;
import khan.application.stringgenerator.feignClient.SaveWordsFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Класс для отправки строки через FeignClient
 */
@Slf4j
@Service("feignSender")
@RequiredArgsConstructor
public class FeignSenderService implements WordSender{

    private final SaveWordsFeignClient saveWordsFeignClient;

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendWord(String word) {
        saveWordsFeignClient.saveWord(new RequestWordDto(word));
        log.info("Вызов FeignClient!");
    }

}
