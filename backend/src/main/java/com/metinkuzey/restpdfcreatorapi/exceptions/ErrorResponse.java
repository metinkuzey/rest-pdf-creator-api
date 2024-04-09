package com.metinkuzey.restpdfcreatorapi.exceptions;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private List<String> details;
}
