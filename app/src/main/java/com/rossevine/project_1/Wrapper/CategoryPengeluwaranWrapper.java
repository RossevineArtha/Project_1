package com.rossevine.project_1.Wrapper;

import com.rossevine.project_1.entity.CategoryPengeluwaran;

/**
 * Created by LENOVO on 2/25/2018.
 */

public class CategoryPengeluwaranWrapper {
    private  int status;
    private  String message;
    private CategoryPengeluwaran categoryPengeluwaran;

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

    public CategoryPengeluwaran getCategoryPengeluwaran() {
        return categoryPengeluwaran;
    }

    public void setCategoryPengeluwaran(CategoryPengeluwaran categoryPengeluwaran) {
        this.categoryPengeluwaran = categoryPengeluwaran;
    }
}
