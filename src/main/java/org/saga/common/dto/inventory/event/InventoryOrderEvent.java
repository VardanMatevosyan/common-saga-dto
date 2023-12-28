package org.saga.common.dto.inventory.event;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.saga.common.dto.EventDto;
import org.saga.common.dto.inventory.InventoryDto;
import org.saga.common.enums.PaymentStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InventoryOrderEvent extends EventDto {

  InventoryDto inventoryDto;
  PaymentStatus paymentStatus;

}
