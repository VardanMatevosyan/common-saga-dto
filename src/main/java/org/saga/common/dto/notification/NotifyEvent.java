package org.saga.common.dto.notification;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.saga.common.dto.EventDto;
import org.saga.common.dto.order.ProductItemDto;
import org.saga.common.enums.OrderStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotifyEvent extends EventDto {

  String customerEmail;
  Long orderId;
  List<ProductItemDto> productItems;
  OrderStatus orderStatus;
  Integer price;

}
