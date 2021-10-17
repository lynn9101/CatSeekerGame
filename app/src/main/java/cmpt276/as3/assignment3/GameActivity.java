package cmpt276.as3.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Activity that displays the game
 */
public class GameActivity extends AppCompatActivity {

    public static Intent gameLaunchIntent(Context c) {
        Intent intent = new Intent(c, GameActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    // call getter method to create the game
}