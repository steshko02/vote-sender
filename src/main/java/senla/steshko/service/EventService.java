package senla.steshko.service;

import senla.steshko.entities.EventDto;

public interface EventService {

    EventDto getEvent();

    void send();
}
