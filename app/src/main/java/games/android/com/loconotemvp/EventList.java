package games.android.com.loconotemvp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EventList {
    private Activity context;
//    private List<Event> eventsList;
//
//    public EventList(Activity context, List<Event> eventsList){
//        this.context = context;
//        this.eventsList = eventsList;
//    }
//
//    @NonNull
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        LayoutInflater inflater = context.getLayoutInflater();
//
//        View listViewItem = inflater.inflate(R.layout.post_layout,null,true);
//
//        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
//        TextView textViewEmail = (TextView) listViewItem.findViewById(R.id.textViewEmail);
//
//        Event event= eventsList.get(position);
//        String id = event.getTitle();
//
//        textViewName.setText(event.getTitle());
//        textViewEmail.setText(event.getDescription().substring(0,15));
//
//
//
//        return listViewItem;
//    }
}
