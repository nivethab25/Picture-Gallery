package com.nivetha.cs478.picturegallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by nivetha on 10/29/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    //Adapter must store AdapterView's items
    private List<Integer> mPictureIds;

    ImageAdapter(Context c, List<Integer> pictureIds) {

        //Save the list of picture IDs and the context
        mContext = c;
        this.mPictureIds = pictureIds;

     }

    //Now the methods inherited from abstract superclass BaseAdapter

    //Return the number of items in the Adapter
    @Override
    public int getCount() {
        return mPictureIds.size();
    }

    //Return the data item at position
    @Override
    public Object getItem(int position) {
        return mPictureIds.get(position);
    }

    //Will get called to provide the ID that is passed to OnItemClickListener.onItemClick()
    @Override
    public long getItemId(int position) {
        return position;
    }

    //Return a View for each item referenced by the Adapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(750,750));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        }

        else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mPictureIds.get(position));
        return imageView;
    }
}
