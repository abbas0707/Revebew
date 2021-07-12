package com.revenew.error;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum ServiceError {
    VEHICLE_EXISTS("901", "Vehicle exists already!"),
    INVALID_PERSON("902", "PersonId does,'t exist!"),
    VALUE_REQUIRED("903", "Required value for the field"),
    UNKNOWN("900", "Internal System Failure");

    private static final Map<String, ServiceError> ERROR_MAP = new HashMap();
    private final String code;
    private final String description;

    private ServiceError(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static ServiceError getErrorType(String v) {
        ServiceError errorTypes = (ServiceError)ERROR_MAP.get(v);
        return errorTypes == null ? UNKNOWN : errorTypes;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    static {
        Arrays.stream(values()).forEach((ct) -> {
            ERROR_MAP.put(ct.code, ct);
        });
    }
}

