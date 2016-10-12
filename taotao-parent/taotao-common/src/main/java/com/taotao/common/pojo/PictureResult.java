package com.taotao.common.pojo;

/**
 * Created by yazhou on 16-10-8.
 */
public class PictureResult {
    private int error;
    private String url;
    private String message;

    public PictureResult() {
    }

    public PictureResult(int error, String url, String message) {
        this.error = error;
        this.url = url;
        this.message = message;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
