package com.iceblue.appbaseutils.object;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by AntonioTorres on 20/05/15.
 */
public class RequestResponse {
    public static final int SERVER_RESPONSE_INCORRECT = 3;
    public static final int UNKNOWN = -1;
    public static final int SUCCESS = 0;
    @Getter
    @Setter
    private Object response = null;
    @Getter
    @Setter
    private int code = UNKNOWN;
    @Getter
    @Setter
    private int errorCode = UNKNOWN;
    @Getter
    @Setter
    private String message = "";
    @Getter
    @Setter
    private Object tag;
    public RequestResponse(){}
    public RequestResponse(int code, Object response, String message, Object tag) {
        this.code = code;
        this.response = response;
        this.message = message;
        this.tag = tag;
    }
}
