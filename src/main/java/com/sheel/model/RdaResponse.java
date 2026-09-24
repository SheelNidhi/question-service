package com.sheel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RdaResponse {
    private String filter;
    private Source source;
    private String format;
    Map<String, Object> data;
}
