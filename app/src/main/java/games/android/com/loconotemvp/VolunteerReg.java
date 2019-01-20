package games.android.com.loconotemvp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;

import java.util.HashMap;
import java.util.Map;

public class VolunteerReg extends AppCompatActivity {

    Button go_back, register_user;

    EditText name, email, password;


    DatabaseReference databaseUsers, rootRef;

    String mname,mpassword,memail;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_reg);

        name = (EditText) findViewById(R.id.sign_up_name);
        email = (EditText) findViewById(R.id.sign_up_email);
        password = (EditText) findViewById(R.id.sign_up_password);
        register_user = (Button) findViewById(R.id.register_user);
        databaseUsers = FirebaseDatabase.getInstance().getReference("Users");


        register_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();


            }
        });

    }
    public void registerUser(){
        final String mname = name.getText().toString();
        final String memail = email.getText().toString();
        final String mpassword = password.getText().toString();
        databaseUsers =  FirebaseDatabase.getInstance().getReference().child("Users");
        rootRef = FirebaseDatabase.getInstance().getReference();


        if(mname.matches("") || memail.matches("") || mpassword.matches("")) {
            Toast.makeText(this, "Please fill out every part", Toast.LENGTH_SHORT).show();
            return;


        }
        DatabaseReference user_key = rootRef.child("users").push();
        Volunteer user = new Volunteer(mname,memail,mpassword,user_key.toString(),0);
        user_key.setValue(user);

        Toast.makeText(this, "DONE", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(VolunteerReg.this,MapsActivity.class);
        startActivity(intent);
        finish();


    }

}
