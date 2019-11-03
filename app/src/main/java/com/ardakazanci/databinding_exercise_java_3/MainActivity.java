package com.ardakazanci.databinding_exercise_java_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ardakazanci.databinding_exercise_java_3.databinding.ActivityMainBinding;
import com.ardakazanci.databinding_exercise_java_3.model.User;
import com.ardakazanci.databinding_exercise_java_3.util.ClickHandlers;

public class MainActivity extends AppCompatActivity {

    private User user;
    private ClickHandlers clickHandlers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        user = new User();
        user.setName("Test");
        user.setEmail("test@gmail.com");

        mainBinding.setUser(user);

        clickHandlers = new ClickHandlers(getApplicationContext());
        mainBinding.contentMainLayout.setClickHandlers(clickHandlers);





    }
}
