package khan.application.stringgenerator.feignClient;

import khan.application.stringgenerator.dto.request.RequestWordDto;
import khan.application.stringgenerator.dto.response.ResponseWordDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "save-word-api-client", url = "http://localhost:8085/api")
public interface SaveWordsFeignClient {

    @PostMapping("/save")
    ResponseWordDto saveWord(@RequestBody RequestWordDto requestDto);

}
