package id.ac.umn.uts_30573;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button submitBtnLogin;
    EditText passwordET, usernameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        submitBtnLogin = findViewById(R.id.submitLoginBtn);
        passwordET = findViewById(R.id.passwordEditText);
        usernameET = findViewById(R.id.usernameEditText);

        submitBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameET.getText().toString();
                String password = passwordET.getText().toString();
                if(username.equals("uasmobile") && password.equals("uasmobilegenap")) {
                    Intent tunes = new Intent(LoginActivity.this, Tunes.class);
                    startActivity(tunes);
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid Username or Password!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}