package com.example.specialfoodapp.view.detail;

import com.example.specialfoodapp.model.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);
}
