package edu.temple.colorapp;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] myColors;


    public ColorAdapter(Context con, String[] colors)
    {
        this.context = con;
        this.myColors = colors;
    }


    @Override
    public int getCount()
    {
        return myColors.length;
    }

    @Override
    public Object getItem(int position)
    {
        return myColors[position];
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        TextView tv = new TextView(context);
        tv.setText(getItem(position).toString());
        //tv.setPadding(2,2,2,2);
        tv.setTextSize(24);

        try
        {
            tv.setBackgroundColor(Color.parseColor(getItem(position).toString()));
        }
        catch(IllegalArgumentException e)
        {
            Log.e("ColorAdapter", "illegal argument for parseColor():" + getItem(position).toString());
            tv.setBackgroundColor(Color.WHITE);
        }

        return tv;
    }


}
