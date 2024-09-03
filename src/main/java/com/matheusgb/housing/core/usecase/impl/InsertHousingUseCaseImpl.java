package com.matheusgb.housing.core.usecase.impl;

import com.matheusgb.housing.core.dataprovider.FindAddressByZipCode;
import com.matheusgb.housing.core.dataprovider.InsertHousing;
import com.matheusgb.housing.core.domain.Housing;
import com.matheusgb.housing.core.usecase.InsertHousingUseCase;

public class InsertHousingUseCaseImpl implements InsertHousingUseCase {

  private final FindAddressByZipCode findAddressByZipCode;
  private final InsertHousing insertHousing;

  public InsertHousingUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertHousing insertHousing) {
    this.findAddressByZipCode = findAddressByZipCode;
    this.insertHousing = insertHousing;
  }

  @Override
  public void insert(Housing housing) {
    var address = findAddressByZipCode.find(housing.getZipCode());
    housing.setAddress(address);
    insertHousing.insert(housing);
  }

}
