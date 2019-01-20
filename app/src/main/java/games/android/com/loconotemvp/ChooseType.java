package games.android.com.loconotemvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseType extends AppCompatActivity {

    Button volunteerReg, coordinatorReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_type);


        volunteerReg = findViewById(R.id.volunteerReg);
        coordinatorReg = findViewById(R.id.coordinatorReg);


        volunteerReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseType.this,VolunteerReg.class);
                startActivity(intent);
                finish();

            }
        });

        coordinatorReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ChooseType.this, VolunteerReg.class);
                startActivity(intent1);
                finish();
            }
        });


    }
}
