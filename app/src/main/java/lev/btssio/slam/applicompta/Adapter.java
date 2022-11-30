package lev.btssio.slam.applicompta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<MonViewHolder> {

    Context context;
    List<Comptes> comptes;

    public Adapter(Context context, List<Comptes> comptes) {
        this.context = context;
        this.comptes = comptes;
    }

    @NonNull
    @Override
    public MonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MonViewHolder(LayoutInflater.from(context).inflate(R.layout.view_compte,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MonViewHolder holder, int position) {
        holder.nom.setText(comptes.get(position).getNom());
        holder.description.setText(comptes.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return comptes.size();
    }
}

