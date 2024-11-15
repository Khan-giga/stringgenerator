package khan.application.stringgenerator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Класс для передачи строки в json формате
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WordPayload {

    private String word;

}
