package com.rossevine.project_1.Wrapper;

import com.rossevine.project_1.entity.Pemasukan;

/**
 * Created by LENOVO on 2/25/2018.
 */

public class PemasukanWrapper {
    private  int status;
    private  String message;
    private Pemasukan pemasukan;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Pemasukan getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(Pemasukan pemasukan) {
        this.pemasukan = pemasukan;
    }
}
