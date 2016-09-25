package com.amakode.dataset.daten.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.amakode.dataset.daten.R;
import com.amakode.dataset.daten.app.AppController;
import com.amakode.dataset.daten.model.Film;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Film> filmItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<Film> filmItems) {
        this.activity = activity;
        this.filmItems = filmItems;
    }

    @Override
    public int getCount() {
        return filmItems.size();
    }

    @Override
    public Object getItem(int location) {
        return filmItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.row_listitem, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
        NetworkImageView thumbNail = (NetworkImageView) convertView
                .findViewById(R.id.thumbnail);
        TextView title = (TextView) convertView.findViewById(R.id.title);

        // data for the row
        Film m = filmItems.get(position);
        // thumbnail image
        thumbNail.setImageUrl(m.getThumbnailUrl(), imageLoader);
        // title
        title.setText(m.getTitle());
        return convertView;
    }

}

