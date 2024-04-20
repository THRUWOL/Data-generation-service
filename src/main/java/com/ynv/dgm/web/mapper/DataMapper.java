package com.ynv.dgm.web.mapper;

import com.ynv.dgm.model.Data;
import com.ynv.dgm.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
