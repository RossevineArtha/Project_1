package com.rossevine.project_1.entity;

import java.util.Date;

/**
 * Created by LENOVO on 2/25/2018.
 */

public class Pengeluwaran {
    private int idPengeluwaran;
    private int jumlahPengeluwaran;
    private String informasiPengeluwaran;
    private Date waktuPengeluwaran;
    private String judulPengeluwaran;
    private CategoryPengeluwaran categoryPengeluwaran_idCategoryPengeluwaran;
    private User user_idUser;

    public int getIdPengeluwaran() {
        return idPengeluwaran;
    }

    public void setIdPengeluwaran(int idPengeluwaran) {
        this.idPengeluwaran = idPengeluwaran;
    }

    public int getJumlahPengeluwaran() {
        return jumlahPengeluwaran;
    }

    public void setJumlahPengeluwaran(int jumlahPengeluwaran) {
        this.jumlahPengeluwaran = jumlahPengeluwaran;
    }

    public String getInformasiPengeluwaran() {
        return informasiPengeluwaran;
    }

    public void setInformasiPengeluwaran(String informasiPengeluwaran) {
        this.informasiPengeluwaran = informasiPengeluwaran;
    }

    public Date getWaktuPengeluwaran() {
        return waktuPengeluwaran;
    }

    public void setWaktuPengeluwaran(Date waktuPengeluwaran) {
        this.waktuPengeluwaran = waktuPengeluwaran;
    }

    public String getJudulPengeluwaran() {
        return judulPengeluwaran;
    }

    public void setJudulPengeluwaran(String judulPengeluwaran) {
        this.judulPengeluwaran = judulPengeluwaran;
    }

    public CategoryPengeluwaran getCategoryPengeluwaran_idCategoryPengeluwaran() {
        return categoryPengeluwaran_idCategoryPengeluwaran;
    }

    public void setCategoryPengeluwaran_idCategoryPengeluwaran(CategoryPengeluwaran categoryPengeluwaran_idCategoryPengeluwaran) {
        this.categoryPengeluwaran_idCategoryPengeluwaran = categoryPengeluwaran_idCategoryPengeluwaran;
    }

    public User getUser_idUser() {
        return user_idUser;
    }

    public void setUser_idUser(User user_idUser) {
        this.user_idUser = user_idUser;
    }
}
