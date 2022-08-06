package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random ran = new Random();
        int value = ran.nextInt(1000000000);
        TextView text =  findViewById(R.id.madName);
        text.setText("Mad " + value);

        Button button = (Button) findViewById(R.id.followButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(button.getText().equals("Follow")){
                    button.setText("Unfollow");
                    Toast.makeText(MainActivity.this,"Follow",Toast.LENGTH_SHORT).show();
            }
                else{
                    button.setText("Follow");
                    Toast.makeText(MainActivity.this,"Unfollow",Toast.LENGTH_SHORT).show();
                }
        }});

        Button msgButton = (Button) findViewById(R.id.messageButton);
        msgButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(myIntent);
            }
        });

    }
}
