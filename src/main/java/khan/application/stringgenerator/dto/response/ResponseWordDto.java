package khan.application.stringgenerator.dto.response;

import java.time.LocalDateTime;

public record ResponseWordDto(Long id, String text, LocalDateTime saveTime) {
}
