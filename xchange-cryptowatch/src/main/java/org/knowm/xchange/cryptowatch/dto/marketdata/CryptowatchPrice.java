package org.knowm.xchange.cryptowatch.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
public class CryptowatchPrice {

  private final BigDecimal price;

  public CryptowatchPrice(@JsonProperty("price") BigDecimal price) {
    this.price = price;
  }
}
