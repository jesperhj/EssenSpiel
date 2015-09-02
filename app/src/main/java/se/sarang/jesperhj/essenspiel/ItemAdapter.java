package se.sarang.jesperhj.essenspiel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;
import java.util.List;

import se.sarang.jesperhj.essenspiel.model.Item;

/**
 * Created by jesper on 01/09/15.
 */
public class ItemAdapter extends ArrayAdapter<Item> {
    public ItemAdapter(Context context, List<Item> items) {
        super(context, 0, items);
        imageLoader.init(ImageLoaderConfiguration.createDefault(context));
    }

    public ImageLoader imageLoader = ImageLoader.getInstance();

    public String imageURL(String id) {
        return "http://cf.geekdo-images.com/images/pic" + id + "_t.jpg";
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Item item = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_game, parent, false);
        }

        // Lookup view for data population
        TextView itemName = (TextView) convertView.findViewById(R.id.itemName);
        TextView itemObjectType = (TextView) convertView.findViewById(R.id.itemObjectType);

        // Populate the data into the template view using the data object
        itemName.setText(item.getObjectname());
        itemObjectType.setText(item.getObjecttype());

        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .build();

        /*DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(fallback)
                .showImageOnFail(fallback)
                .showImageOnLoading(fallback).build();*/

        //initialize image view
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView1);

        //download and display image from url
        imageLoader.displayImage(imageURL(item.getImageid()), imageView, options);

        // Return the completed view to render on screen
        return convertView;
    }
}
