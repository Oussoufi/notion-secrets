package mr.mayatech.motionsecrets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/notion")
public class NotionController {

    private final NotionConfigProperties notionConfigP;

    public NotionController(NotionConfigProperties notionConfigP) {
        this.notionConfigP = notionConfigP;
    }

    @GetMapping
    public Map<String, String> printAllProps() {
        return Map.of("apiUrl", notionConfigP.apiUrl(),
                "apiVersion", notionConfigP.apiVersion(),
                "authToken", notionConfigP.authToken(),
                "databaseId", notionConfigP.databaseId());
    }


}
