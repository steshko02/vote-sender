package senla.steshko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import senla.steshko.entities.EventDto;
import senla.steshko.service.EventService;

@RestController
public class SenderController {

    @Autowired
    private EventService eventService;

    @GetMapping("/event")
    public EventDto send(){
        return eventService.getEvent();
    }

    @GetMapping("/sayHello")
    public String  sayHello(){
        return "Hello from Rest :)";
    }

    @GetMapping("/sendTab")
    public void  sendTabRabbit(){
         eventService.send();
    }
}
