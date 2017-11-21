package com.example.antepimentel.eng4000.household;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.antepimentel.eng4000.R;
import java.util.ArrayList;


/**
 * Created by Ante Pimentel on 11/20/2017.
 *
 * Customer Array Adapter class for displaying a list of Goals
 */

public class GoalAdapter extends ArrayAdapter<Goal>{

    public GoalAdapter(Context context, ArrayList<Goal> goals){
        super(context, 0, goals);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Goal goal = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.goal_layout, parent, false);
        }

        TextView title = (TextView)convertView.findViewById(R.id.title_view);
        TextView points = (TextView)convertView.findViewById(R.id.points_view);

        title.setText(goal.TITLE);
        points.setText(Integer.toString(goal.VALUE));

        return convertView;
    }
}
