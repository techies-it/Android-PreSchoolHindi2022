package it.techies.preschoolhindi.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.techies.preschoolhindi.R;
import it.techies.preschoolhindi.base.BaseActivity;

public class GameLevels extends BaseActivity implements View.OnClickListener
{

    Context mContext = this;
    private int currentApiVersion;

    @Bind(R.id.backBT)
    ImageButton mBack;

    @Bind(R.id.btLevel1)
    ImageButton mLevel1;

    @Bind(R.id.btLevel2)
    ImageButton mLevel2;

    @Bind(R.id.btLevel3)
    ImageButton mLevel3;

    @Bind(R.id.btLevel4)
    ImageButton mLevel4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        currentApiVersion = android.os.Build.VERSION.SDK_INT;

        // This work only for android 4.4+
        if (currentApiVersion >= Build.VERSION_CODES.KITKAT)
        {
            final int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

            getWindow().getDecorView().setSystemUiVisibility(flags);

            // Code below is to handle presses of Volume up or Volume down.
            // Without this, after pressing volume buttons, the navigation bar will
            // show up and won't hide
            final View decorView = getWindow().getDecorView();
            decorView
                    .setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener()
                    {

                        @Override
                        public void onSystemUiVisibilityChange(int visibility)
                        {
                            if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0)
                            {
                                decorView.setSystemUiVisibility(flags);
                            }
                        }
                    });
        }

        setContentView(R.layout.activity_game_levels);
        ButterKnife.bind(this);

        mBack.setOnClickListener(this);
        mLevel1.setOnClickListener(this);
        mLevel2.setOnClickListener(this);
        mLevel3.setOnClickListener(this);
        mLevel4.setOnClickListener(this);
    }

    @SuppressLint("NewApi")
    @Override
    public void onWindowFocusChanged(boolean hasFocus)
    {
        super.onWindowFocusChanged(hasFocus);
        if (currentApiVersion >= Build.VERSION_CODES.KITKAT && hasFocus)
        {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.backBT)
        {
            finish();
        }
        else if (v.getId() == R.id.btLevel1)
        {
            // this button take us to game level 1
            Intent goToLevel1 = new Intent(mContext, Level1.class);
            startActivity(goToLevel1);
        }
        else if (v.getId() == R.id.btLevel2)
        {
            // this button take us to game level 2
            Intent goToLevel1 = new Intent(mContext, Level2.class);
            startActivity(goToLevel1);
        }
        else if (v.getId() == R.id.btLevel3)
        {
            // this button take us to game level 3
            Intent goToLevel1 = new Intent(mContext, Level3.class);
            startActivity(goToLevel1);
        }
        else if (v.getId() == R.id.btLevel4)
        {
            // this button take us to game level 4
            Intent goToLevel1 = new Intent(mContext, Level4.class);
            startActivity(goToLevel1);
        }
    }
}
