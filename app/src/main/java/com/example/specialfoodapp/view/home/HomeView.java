package com.example.specialfoodapp.view.home;


import com.example.specialfoodapp.model.Categories;
import com.example.specialfoodapp.model.Meals;

import java.util.List;

public interface HomeView {

    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
