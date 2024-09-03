package com.matheusgb.housing.core.dataprovider;

import com.matheusgb.housing.core.domain.Address;

public interface FindAddressByZipCode {
  Address find(final String zipCode);
}
