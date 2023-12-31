package com.workintech.zoo.exception;

import lombok.Getter;

@Getter
public class KangrooErrorResponse {

    private int status;
    private String message;
    private long timestamp;
}
