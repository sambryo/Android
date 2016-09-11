package comsam.example.android.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void okButton (View view) {

        EditText nameField = (EditText) findViewById(R.id.nameField);
        EditText passwordField = (EditText) findViewById(R.id.nameField);

        Log.i("Name : ", nameField.getText().toString());
        Log.i("Password: ", passwordField.getText().toString());
        




    }

}
