package games.android.com.loconotemvp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.EventTarget;

import java.util.ArrayList;
import java.util.List;

public class ListPostActivity extends AppCompatActivity {

    TextView event1,event2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_post);

        event1 = (TextView) findViewById(R.id.event1);

        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ListPostActivity.this,EventActivity.class);
                startActivity(intent1);
                finish();
            }
        });




    }

//
//
//    public void fetchEventList(){
//        databaseEvents = FirebaseDatabase.getInstance().getReference("Events");
//
//        databaseEvents.addValueEventListener(new ValueEventListener() {
//
//            @Override
//
//            public void onDataChange(@NonNull final DataSnapshot dataSnapshot) {
//
//                eventsList.clear();
//
//                for(DataSnapshot userSnapshot: dataSnapshot.getChildren()){
//
//                    String parentId = userSnapshot.getKey();
//
//                    Event event = userSnapshot.getValue(Event.class);
//
//                    eventsList.add(event);
//
//                    String event_id = userSnapshot.getKey();
//
//                }
//                //EventList adapter = new EventList(ListPostActivity.this, eventsList);
//
//                //listViewEvents.setAdapter(adapter);
//
//                listViewEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//                        String event = eventsList.get(position).getId();
//
//                        Intent chatIntent = new Intent(ListPostActivity.this, EventActivity.class);
//                        chatIntent.putExtra("chat_id", event);
//                        startActivity(chatIntent);
//                        finish();
//
//                    }
//                });
//
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//    }


}
