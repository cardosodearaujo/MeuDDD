package br.com.unclephill.meuddd.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.unclephill.meuddd.App.FunctionsApp;
import br.com.unclephill.meuddd.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void onClickClose(View view){
        FunctionsApp.fecharActivity(ForgotPasswordActivity.this);
    }
}
