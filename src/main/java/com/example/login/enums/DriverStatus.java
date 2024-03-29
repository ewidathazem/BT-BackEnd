package com.example.login.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DriverStatus {
    IN_SHIFT,
    OUT_SHIFT;

    @JsonValue
    public String toJson() {
        return name().toLowerCase();
    }
}
