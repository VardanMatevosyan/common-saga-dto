package org.saga.common.dto;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Getter;

@Getter
public abstract class EventDto {

  final UUID eventId;
  final LocalDateTime dateTime;

  public EventDto() {
    eventId = UUID.randomUUID();
    dateTime = LocalDateTime.now();
  }

}
