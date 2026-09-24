package com.sheel.controller;


import com.sheel.model.RdaRequest;
import com.sheel.model.RdaResponse;
import com.sheel.model.Source;
import com.sheel.service.FilterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class FileController {
    private FilterService filterService;
    private  String networkPath ="sometest";

    @PostMapping("/data")
    public ResponseEntity<RdaResponse> readFile(@RequestBody RdaRequest requestData){
        String filter = requestData.getFilter();
        Source source = requestData.getSource().INSTRUMENT_STATIC;
        String format = requestData.getFormat();
        try{
            return ResponseEntity.ok(filterService.readFileFromNetwork(networkPath,filter));
        }catch(Exception ex){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error reading file"+ex.getMessage());

        }

    }
}
