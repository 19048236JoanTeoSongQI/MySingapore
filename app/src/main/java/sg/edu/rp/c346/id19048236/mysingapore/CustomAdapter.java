package sg.edu.rp.c346.id19048236.mysingapore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Island> islandList;

    public CustomAdapter(Context context, int resource, ArrayList<Island> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        islandList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvname = rowView.findViewById(R.id.textViewName);
        TextView tvDesc = rowView.findViewById(R.id.textViewDesc);
        TextView tvArea = rowView.findViewById(R.id.textViewArea);
        RatingBar rbStar=rowView.findViewById(R.id.ratingBar);


        Island currentIsland = islandList.get(position);

        tvname.setText(currentIsland.getName());
        tvDesc.setText(currentIsland.getDescription());
        tvArea.setText(String.valueOf(currentIsland.getArea()));
        rbStar.setRating(currentIsland.getStars());


        return rowView;
    }
}