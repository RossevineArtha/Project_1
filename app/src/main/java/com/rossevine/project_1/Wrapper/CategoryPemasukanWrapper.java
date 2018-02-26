package com.rossevine.project_1.Wrapper;

import com.rossevine.project_1.entity.CategoryPemasukan;

/**
 * Created by LENOVO on 2/25/2018.
 */

public class CategoryPemasukanWrapper {
    private  int status;
    private  String message;
    private CategoryPemasukan categoryPemasukan;

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

    public CategoryPemasukan getCategoryPemasukan() {
        return categoryPemasukan;
    }

    public void setCategoryPemasukan(CategoryPemasukan categoryPemasukan) {
        this.categoryPemasukan = categoryPemasukan;
    }
}
