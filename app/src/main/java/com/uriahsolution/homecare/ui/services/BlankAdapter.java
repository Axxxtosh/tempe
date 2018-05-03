package com.uriahsolution.homecare.ui.services;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.uriahsolution.homecare.R;

/**
 * Created by Ashet on 08-02-2018.
 */

public class BlankAdapter extends RecyclerView.Adapter<BlankAdapter.ViewHolder> {

    private Context ctx;
    public BlankAdapter(Context ctx){

        this.ctx=ctx;

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)


    {
        View v = LayoutInflater.from(ctx)
                .inflate(R.layout.temp_row, parent, false);
        return new BlankAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener

    {


        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }

}


