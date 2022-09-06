package senla.steshko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import senla.steshko.entities.EventDto;
import senla.steshko.jms.Sender;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    private Sender sender;

    @Override
    public EventDto getEvent() {

        EventDto entity =  new EventDto();
        entity.setName("Test");
        entity.setStart(new Date());
        entity.setFinish(new Date());
        entity.setDescription("TESTETSTTESTTEST");
        entity.setVoteIds(Set.of(1L,2L));
        entity.setCandidateIds(Set.of(1L));

        return entity;
    }

    @Override
    public void send() {
        sender.send();
    }
}
