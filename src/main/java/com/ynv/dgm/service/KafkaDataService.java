package com.ynv.dgm.service;

import com.ynv.dgm.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
