package com.example.api;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<ExampleItem> mExampleList;

    public ExampleAdapter(Context context, ArrayList<ExampleItem> exampleList) {
        mContext = context;
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.example_item, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleList.get(position);

        int id=currentItem.getId();
        String nom = currentItem.getNom();
        String prenom = currentItem.getPrenom();
        String cne = currentItem.getCne();

        holder.name.setText(nom);
        holder.prenom.setText(prenom);
        holder.cne.setText(cne);
        holder.id.setText(""+id);


    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView prenom;
        public TextView id;
        public TextView cne;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.text_view_nom);
            prenom = itemView.findViewById(R.id.text_view_prenom);
            id = itemView.findViewById(R.id.text_view_id);
            cne = itemView.findViewById(R.id.text_view_cne);

        }
    }
}