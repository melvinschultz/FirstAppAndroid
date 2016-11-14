package net.schultzoss_montpellier.melvin.firstappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_login = (Button)findViewById(R.id.button_login);

        button_login.setOnClickListener(new View.OnClickListener()
        {
            /** Called when the user clicks the login button */
            public void onClick(View view)
            {
                EditText username = (EditText)findViewById(R.id.edit_username);
                EditText password = (EditText)findViewById(R.id.edit_password);

                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), R.string.redirecting, Toast.LENGTH_SHORT).show();
                    // correct username and password
                } else {
                    // wrong username or password
                    Toast.makeText(getApplicationContext(), R.string.wrong_login, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    /** Called when the user clicks the send button *//*
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }*/

    public final static String EXTRA_MESSAGE = "net.schultzoss_montpellier.melvin.firstappandroid.MESSAGE";
}
