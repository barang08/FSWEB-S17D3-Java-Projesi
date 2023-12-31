package com.workintech.zoo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KoalaErrorResponse {
    private int status;
    private String message;
    private long timestamp;
}
