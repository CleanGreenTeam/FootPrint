package games.android.com.loconotemvp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLogTags;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.concurrent.ConcurrentLinkedDeque;

public class EventActivity extends AppCompatActivity {

    EditText title, description, owner, location;
    DatabaseReference event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        event = FirebaseDatabase.getInstance().getReference().child("Events");

        title = (EditText) findViewById(R.id.title);
        location = (EditText) findViewById(R.id.location);

        description = (EditText) findViewById(R.id.description);

        owner = (EditText) findViewById(R.id.owner);





        event.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot event: dataSnapshot.getChildren()){
                    if(event.getKey() == "ABCD"){
                        Event event1 = event.getValue(Event.class);
                        title.setText(event1.getTitle());
                        location.setText(event1.getLocation());
                        description.setText(event1.getDescription());
                        owner.setText(event1.getOwnerID());

                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
