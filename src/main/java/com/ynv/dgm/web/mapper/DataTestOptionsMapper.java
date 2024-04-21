package com.ynv.dgm.web.mapper;

import com.ynv.dgm.model.test.DataTestOptions;
import com.ynv.dgm.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
