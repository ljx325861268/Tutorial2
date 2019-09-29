package li.emily.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.id_title1);
        TextView title1 = (TextView) view;
        title1.setText("‘We’ve lost our suburb’: Town washed away");


        TextView contant1 = (TextView)findViewById(R.id.id_contant1);
        contant1.setText("An entire beach has vanished and an Aussie " +
                "town is in crisis after a powerful major blitz of heavy surf, captured in powerful " +
                "aerial footage, wreaked havoc.");

        TextView title2 = (TextView)findViewById(R.id.id_title2);
        title2.setText("‘Amazing upset’: Fiji stunned by minnows");

        TextView contant2 = (TextView)findViewById(R.id.id_contant2);
        contant2.setText("Not so long ago Fiji looked like stunning the Wallabies now they have " +
                "fallen in one of the greatest upsets in the history of the Rugby World Cup.");

    }
    public void onRead(View view)

    {

        Toast.makeText(this,"waiting..", Toast.LENGTH_SHORT).show();

    }

}
