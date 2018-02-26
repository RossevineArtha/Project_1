package com.rossevine.project_1.entity;

import java.util.Date;

/**
 * Created by LENOVO on 2/25/2018.
 */

public class Pemasukan {
    private int idPemasukan;
    private int jumlahPemasukan;
    private String informasiPemasukan;
    private Date waktuPemasukan;
    private String judulPemasukan;
    private CategoryPemasukan categoryPemasukan_idCategoryPemasukan;
    private User user_idUser;

    public int getIdPemasukan() {
        return idPemasukan;
    }

    public void setIdPemasukan(int idPemasukan) {
        this.idPemasukan = idPemasukan;
    }

    public int getJumlahPemasukan() {
        return jumlahPemasukan;
    }

    public void setJumlahPemasukan(int jumlahPemasukan) {
        this.jumlahPemasukan = jumlahPemasukan;
    }

    public String getInformasiPemasukan() {
        return informasiPemasukan;
    }

    public void setInformasiPemasukan(String informasiPemasukan) {
        this.informasiPemasukan = informasiPemasukan;
    }

    public Date getWaktuPemasukan() {
        return waktuPemasukan;
    }

    public void setWaktuPemasukan(Date waktuPemasukan) {
        this.waktuPemasukan = waktuPemasukan;
    }

    public String getJudulPemasukan() {
        return judulPemasukan;
    }

    public void setJudulPemasukan(String judulPemasukan) {
        this.judulPemasukan = judulPemasukan;
    }

    public CategoryPemasukan getCategoryPemasukan_idCategoryPemasukan() {
        return categoryPemasukan_idCategoryPemasukan;
    }

    public void setCategoryPemasukan_idCategoryPemasukan(CategoryPemasukan categoryPemasukan_idCategoryPemasukan) {
        this.categoryPemasukan_idCategoryPemasukan = categoryPemasukan_idCategoryPemasukan;
    }

    public User getUser_idUser() {
        return user_idUser;
    }

    public void setUser_idUser(User user_idUser) {
        this.user_idUser = user_idUser;
    }
}
