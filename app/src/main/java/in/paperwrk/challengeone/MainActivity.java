package in.paperwrk.challengeone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            // TODO: Display the Home Fragment (use getSupportFragmentManager)
            getSupportFragmentManager().beginTransaction().add(R.id.container, new HomeFragment()).commit();
        }
    }
}
