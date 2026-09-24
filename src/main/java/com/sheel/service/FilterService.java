package com.sheel.service;


import com.sheel.model.RdaResponse;
import com.sheel.model.Source;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.Format;

@Service
@Log4j2
public class FilterService {
    public RdaResponse readFileFromNetwork(String networkPath, String filter){
        RdaResponse rdaResponse = RdaResponse.builder().format("tbl").filter("").source(Source.INSTRUMENT_STATIC).data(null).build();
        return rdaResponse;
    }
}
