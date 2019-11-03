package com.ardakazanci.databinding_exercise_java_3.util;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.ardakazanci.databinding_exercise_java_3.model.User;

public class ClickHandlers {

    Context context;

    public ClickHandlers(Context context) {
        this.context = context;
    }

    public void onFabClicked(View view) {
        Toast.makeText(context, "FAB clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClick(View view) {
        Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClickWithParam(View view, User user) {
        Toast.makeText(context, "Button clicked! Name: " + user.name, Toast.LENGTH_SHORT).show();
    }

    public boolean onButtonLongPressed(View view) {
        Toast.makeText(context, "Button long pressed!", Toast.LENGTH_SHORT).show();
        return false;
    }
}
