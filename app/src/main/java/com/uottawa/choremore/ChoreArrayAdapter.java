package com.uottawa.choremore;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.uottawa.choremore.models.Chore;
import com.uottawa.choremore.models.Individual;

import java.util.List;


public class ChoreArrayAdapter extends ArrayAdapter <Chore> {

    private Context context;
    private List<Chore> choreList;


    ChoreArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Chore> objects) {
        super(context, resource, objects);
        this.context = context;
        this.choreList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView != null) {
            return convertView;
        } else {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.chore_list_item, parent, false);
            Chore chore = choreList.get(position);
            TextView titleTV = rowView.findViewById(R.id.tv_chore_list_name);
            titleTV.setText(chore.getTitle());
            TextView assigneesTV = rowView.findViewById(R.id.tv_chore_list_user);
            StringBuilder assigneesNames = new StringBuilder();
            for (Individual assignee : chore.getAssignees()) {
                assigneesNames.append(assignee.getName());
                assigneesNames.append(", ");
            }
            assigneesTV.setText(assigneesNames.toString());
            return rowView;
        }
    }
}
