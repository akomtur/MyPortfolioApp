package de.kaubisch.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToastMessageWhenClicked(R.id.button_streamer_app, "This will launch the Spotify Streamer app!");
        showToastMessageWhenClicked(R.id.button_scores_app, "This will launch the Scorer app!");
        showToastMessageWhenClicked(R.id.button_library_app, "This will launch the Library app!");
        showToastMessageWhenClicked(R.id.button_build_it_bigger_app, "This will launch the 'build it bigger' app!");
        showToastMessageWhenClicked(R.id.button_reader_app, "This will launch the XYZ Reader app!");
        showToastMessageWhenClicked(R.id.button_my_own_app, "This will launch my capstone app!");
    }

    private void showToastMessageWhenClicked(int buttonId, final String message) {
        Button streamerAppButton = (Button) findViewById(buttonId);
        streamerAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(message);
            }
        });
    }

    private void showToast(final String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
    }
}
