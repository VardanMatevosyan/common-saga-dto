package org.saga.common.dto.payment.event;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.saga.common.dto.EventDto;
import org.saga.common.dto.payment.PaymentDto;
import org.saga.common.enums.PaymentStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentEvent extends EventDto {

  PaymentDto paymentDto;
  PaymentStatus paymentStatus;

}
