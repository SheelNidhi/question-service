package com.sheel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RdaRequest extends Request{
    private String filter;
    private Source source;
    private String format;
}
