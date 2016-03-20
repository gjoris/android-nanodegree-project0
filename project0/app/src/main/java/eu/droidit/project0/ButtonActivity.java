package eu.droidit.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Map<Integer, Integer> buttonMap = new HashMap<>(6);

        buttonMap.put(R.id.build_it_bigger_button, R.string.build_it_bigger_label);
        buttonMap.put(R.id.library_button, R.string.library_label);
        buttonMap.put(R.id.my_own_app_button, R.string.captone_label);
        buttonMap.put(R.id.scores_button, R.string.scores_label);
        buttonMap.put(R.id.spotify_streamer_button, R.string.spotify_streamer_label);
        buttonMap.put(R.id.xyz_reader_button, R.string.xyz_reader_label);

        for (final Map.Entry<Integer, Integer> buttonOnScreen : buttonMap.entrySet()) {
            Button button = (Button) this.findViewById(buttonOnScreen.getKey());
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "This button will launch: " + getResources().getString(buttonOnScreen.getValue()), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }

    private class ButtonRepresentation {
        private int id;
        private int stringRef;

        public ButtonRepresentation(int id, int stringRef) {
            this.id = id;
            this.stringRef = stringRef;
        }
    }
}
