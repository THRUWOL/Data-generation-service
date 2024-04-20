package com.ynv.dgm.web.controller;

import com.ynv.dgm.model.Data;
import com.ynv.dgm.service.KafkaDataService;
import com.ynv.dgm.web.dto.DataDto;
import com.ynv.dgm.web.mapper.DataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/data")
public class DataController {

    private final KafkaDataService kafkaDataService;

    private final DataMapper dataMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto){
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }
}
