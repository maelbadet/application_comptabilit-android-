package lev.btssio.slam.applicompta;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MonViewHolder extends RecyclerView.ViewHolder {

    TextView nom,description;

    public MonViewHolder(@NonNull View itemView) {
        super(itemView);
        nom=itemView.findViewById(R.id.nom);
        description=itemView.findViewById(R.id.description);
    }
}
