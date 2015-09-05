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

import java.util.List;

import se.sarang.jesperhj.essenspiel.model.bgg.Item;

/**
 * Created by jesper on 01/09/15.
 */
public class ItemAdapter extends ArrayAdapter<Item> {
    private List<Item> items;

    public ItemAdapter(Context context, List<Item> items) {
        super(context, 0, items);
        this.items = items;
        imageLoader.init(ImageLoaderConfiguration.createDefault(context));
    }

    public ImageLoader imageLoader = ImageLoader.getInstance();

    public String imageURL(String id) {
        return "http://cf.geekdo-images.com/images/pic" + id + "_t.jpg";
    }

    private DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
            .cacheOnDisc(true).resetViewBeforeLoading(true)
            .showImageOnFail(R.drawable.default_image)
            .build();

    @Override
    public int getCount() {
        return items.size();
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
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView description = (TextView) convertView.findViewById(R.id.description);

        // Populate the data into the template view using the data object
        name.setText(item.getObjectname());
        String desc = item.getBody();
        if(desc.length() > 50) {
            desc = desc.substring(0, 50);
        }

        description.setText(desc);

        //initialize image view
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        //download and display image from url
        imageLoader.displayImage(imageURL(item.getImageid()), image, options);

        /*try {
            imageLoader.displayImage(imageURL(item.getImageid()), image, options);
        } catch(FileNotFoundException e) {
            Log.e("App", e.getMessage());
        }*/

        // Return the completed view to render on screen
        return convertView;
    }
}
