package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];

    int images[] = {R.mipmap.ic_launcher_round};
    Random ran = new Random();
    int value = ran.nextInt(1000000000);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        //String[] user = getResources().getStringArray(R.array.user);
        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.user);
        s2 = getResources().getStringArray(R.array.description);

        Myadapter myadapter = new Myadapter(this,s1 ,s2, images);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        /*ConstraintLayout constraintLayout = findViewById(R.id.eachUser);
        constraintLayout.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);
            builder.setMessage("MADness");
            builder.setCancelable(false);
            builder.setPositiveButton("View", (dialogInterface, i) -> {

                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                startActivity(intent);
            });

            builder.setNegativeButton("Close", (dialogInterface, i) -> dialogInterface.cancel());

                AlertDialog alert = builder.create();
                alert.setTitle("Profile");
                alert.show();

            });*/
    }
}