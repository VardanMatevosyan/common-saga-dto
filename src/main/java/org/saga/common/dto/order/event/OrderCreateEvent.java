package org.saga.common.dto.order.event;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.saga.common.dto.EventDto;
import org.saga.common.dto.order.OrderCreateRequest;
import org.saga.common.enums.OrderStatus;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderCreateEvent extends EventDto {

  OrderCreateRequest orderCreateRequest;
  OrderStatus orderStatus;

  public OrderCreateEvent() {
    super();
  }

}
