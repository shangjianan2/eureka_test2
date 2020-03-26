package consumer0.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getStr")
    public String getStr(){
        String res = restTemplate.getForObject("http://PROVIDER0/getStr", String.class);
        return res;
    }
}
