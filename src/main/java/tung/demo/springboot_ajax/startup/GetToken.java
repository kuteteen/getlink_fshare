package tung.demo.springboot_ajax.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tung.demo.springboot_ajax.service.FshareService;

@Component
public class GetToken implements CommandLineRunner {
    @Autowired
    private FshareService fshareService;

    @Override
    public void run(String... strings) {
//        fshareService.setToken();
    }
}
