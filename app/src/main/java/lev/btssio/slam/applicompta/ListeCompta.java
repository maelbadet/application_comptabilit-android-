package lev.btssio.slam.applicompta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;



public class ListeCompta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        Button button = (Button)findViewById(R.id.buttonAjouteCompte);

        RecyclerView recyclerView =  findViewById(R.id.recyclerview);

        List<Comptes> comptes = new ArrayList<Comptes>();
        comptes.add(new Comptes("compte provisoir 1", "descrition du compte provisoir 1 "));
        comptes.add(new Comptes("compte provisoir 2", "descrition du compte provisoir 2 "));
        comptes.add(new Comptes("compte provisoir 3", "descrition du compte provisoir 3 "));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),comptes));

        //changement de page
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
