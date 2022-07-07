package it.techies.preschoolhindi.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.techies.preschoolhindi.R;
import it.techies.preschoolhindi.base.BaseActivity;
import it.techies.preschoolhindi.services.SoundService;

public class Level3 extends BaseActivity implements View.OnClickListener
{
    private int currentApiVersion;

    private ArrayList<String> mList;
    private Random randomGenerator;

    int CHEERS_SOUND = 1;
    int AWW_SOUND = 2;

    @Bind(R.id.char1)
    TextView char1;

    @Bind(R.id.char2)
    TextView char2;

    @Bind(R.id.char3)
    TextView char3;

    @Bind(R.id.char4)
    TextView char4;

    @Bind(R.id.char5)
    TextView char5;

    @Bind(R.id.char6)
    TextView char6;

    @Bind(R.id.char7)
    TextView char7;

    @Bind(R.id.char8)
    TextView char8;

    @Bind(R.id.char9)
    TextView char9;

    @Bind(R.id.char10)
    TextView char10;

    @Bind(R.id.char11)
    TextView char11;

    @Bind(R.id.char12)
    TextView char12;

    @Bind(R.id.char13)
    TextView char13;

    @Bind(R.id.char14)
    TextView char14;

    @Bind(R.id.char15)
    TextView char15;

    @Bind(R.id.char16)
    TextView char16;

    @Bind(R.id.char17)
    TextView char17;

    @Bind(R.id.char18)
    TextView char18;

    @Bind(R.id.char19)
    TextView char19;

    @Bind(R.id.char20)
    TextView char20;

    @Bind(R.id.char21)
    TextView char21;

    @Bind(R.id.char22)
    TextView char22;

    @Bind(R.id.char23)
    TextView char23;

    @Bind(R.id.char24)
    TextView char24;

    @Bind(R.id.char25)
    TextView char25;

    @Bind(R.id.char26)
    TextView char26;

    @Bind(R.id.char27)
    TextView char27;

    @Bind(R.id.char28)
    TextView char28;

    @Bind(R.id.char29)
    TextView char29;

    @Bind(R.id.char30)
    TextView char30;

    @Bind(R.id.char31)
    TextView char31;

    @Bind(R.id.char32)
    TextView char32;

    @Bind(R.id.char33)
    TextView char33;

    @Bind(R.id.charH1)
    TextView charH1;

    @Bind(R.id.charH2)
    TextView charH2;

    @Bind(R.id.charH3)
    TextView charH3;

    @Bind(R.id.charH4)
    TextView charH4;

    @Bind(R.id.charH5)
    TextView charH5;

    @Bind(R.id.charH6)
    TextView charH6;

    @Bind(R.id.charH7)
    TextView charH7;

    @Bind(R.id.charH8)
    TextView charH8;

    @Bind(R.id.charH9)
    TextView charH9;

    @Bind(R.id.charH10)
    TextView charH10;

    @Bind(R.id.charH11)
    TextView charH11;

    @Bind(R.id.charH12)
    TextView charH12;

    @Bind(R.id.charH13)
    TextView charH13;

    @Bind(R.id.charH14)
    TextView charH14;

    @Bind(R.id.charH15)
    TextView charH15;

    @Bind(R.id.charH16)
    TextView charH16;

    @Bind(R.id.charH17)
    TextView charH17;

    @Bind(R.id.charH18)
    TextView charH18;

    @Bind(R.id.charH19)
    TextView charH19;

    @Bind(R.id.charH20)
    TextView charH20;

    @Bind(R.id.charH21)
    TextView charH21;

    @Bind(R.id.charH22)
    TextView charH22;

    @Bind(R.id.charH23)
    TextView charH23;

    @Bind(R.id.charH24)
    TextView charH24;

    @Bind(R.id.charH25)
    TextView charH25;

    @Bind(R.id.charH26)
    TextView charH26;

    @Bind(R.id.charH27)
    TextView charH27;

    @Bind(R.id.charH28)
    TextView charH28;

    @Bind(R.id.charH29)
    TextView charH29;

    @Bind(R.id.charH30)
    TextView charH30;

    @Bind(R.id.charH31)
    TextView charH31;

    @Bind(R.id.charH32)
    TextView charH32;

    @Bind(R.id.charH33)
    TextView charH33;

    @Bind(R.id.backBT)
    ImageButton mBack;

    @Bind(R.id.cloud0IV)
    ImageView mCloud0;

    @Bind(R.id.cloud6IV)
    ImageView mCloud6;

    @Bind(R.id.cloud7IV)
    ImageView mCloud7;

    @Bind(R.id.cloud1IV)
    ImageView mCloud1;

    @Bind(R.id.cloud3IV)
    ImageView mCloud3;

    @Bind(R.id.sunRaysIV)
    ImageView mSunRays;

    @Bind(R.id.titleLabel)
    TextView mTitleLabel;

    @Bind(R.id.swarAlphabetsText)
    TextView mSwarAlphabetsText;

    @Bind(R.id.varnmalaAlphabetsText)
    TextView mVarnmalaAlphabetsText;

    @Bind(R.id.swarAlphabets)
    View mSwarAlphabets;

    @Bind(R.id.varnmalaAlphabets)
    View mVarnmalaAlphabets;

    Animation animation270Sec, animation330Sec, animation390Sec, rotation;

    String[] swarArray, varnmalaArray;

    int SWAR = 1, VARNMALA = 2, swarVarnmala;

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("log", "onresume");
    };

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("log", "onstart");
    };



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        currentApiVersion = android.os.Build.VERSION.SDK_INT;
        Log.d("log", "oncreate");
        final int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        // This work only for android 4.4+
        if (currentApiVersion >= Build.VERSION_CODES.KITKAT)
        {

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
        setContentView(R.layout.activity_level3);

        ButterKnife.bind(this);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/lohit_devanagari.ttf");


        mSwarAlphabetsText.setTypeface(typeface);
        mVarnmalaAlphabetsText.setTypeface(typeface);
        mTitleLabel.setTypeface(typeface);
        char1.setTypeface(typeface);
        char2.setTypeface(typeface);
        char3.setTypeface(typeface);
        char4.setTypeface(typeface);
        char5.setTypeface(typeface);
        char6.setTypeface(typeface);
        char7.setTypeface(typeface);
        char8.setTypeface(typeface);
        char9.setTypeface(typeface);
        char10.setTypeface(typeface);
        char11.setTypeface(typeface);
        char12.setTypeface(typeface);
        char13.setTypeface(typeface);
        char14.setTypeface(typeface);
        char15.setTypeface(typeface);
        char16.setTypeface(typeface);
        char17.setTypeface(typeface);
        char18.setTypeface(typeface);
        char19.setTypeface(typeface);
        char20.setTypeface(typeface);
        char21.setTypeface(typeface);
        char22.setTypeface(typeface);
        char23.setTypeface(typeface);
        char24.setTypeface(typeface);
        char25.setTypeface(typeface);
        char26.setTypeface(typeface);
        char27.setTypeface(typeface);
        char28.setTypeface(typeface);
        char29.setTypeface(typeface);
        char30.setTypeface(typeface);
        char31.setTypeface(typeface);
        char32.setTypeface(typeface);
        char33.setTypeface(typeface);
        charH1.setTypeface(typeface);
        charH2.setTypeface(typeface);
        charH3.setTypeface(typeface);
        charH4.setTypeface(typeface);
        charH5.setTypeface(typeface);
        charH6.setTypeface(typeface);
        charH7.setTypeface(typeface);
        charH8.setTypeface(typeface);
        charH9.setTypeface(typeface);
        charH10.setTypeface(typeface);
        charH11.setTypeface(typeface);
        charH12.setTypeface(typeface);
        charH13.setTypeface(typeface);
        charH14.setTypeface(typeface);
        charH15.setTypeface(typeface);
        charH16.setTypeface(typeface);
        charH17.setTypeface(typeface);
        charH18.setTypeface(typeface);
        charH19.setTypeface(typeface);
        charH20.setTypeface(typeface);
        charH21.setTypeface(typeface);
        charH22.setTypeface(typeface);
        charH23.setTypeface(typeface);
        charH24.setTypeface(typeface);
        charH25.setTypeface(typeface);
        charH26.setTypeface(typeface);
        charH27.setTypeface(typeface);
        charH28.setTypeface(typeface);
        charH29.setTypeface(typeface);
        charH30.setTypeface(typeface);
        charH31.setTypeface(typeface);
        charH32.setTypeface(typeface);
        charH33.setTypeface(typeface);

        if (getResources().getBoolean(R.bool.isTab))
        {
            // for tab

            animation270Sec = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.translation_left_to_right_270_sec_600);

            animation330Sec = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.translation_left_to_right_330_sec_600);

            animation390Sec = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.translation_left_to_right_390_sec_600);

            rotation = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.rotation_600);

            mCloud0.startAnimation(animation270Sec);
            mCloud1.startAnimation(animation330Sec);
            mCloud3.startAnimation(animation330Sec);
            mCloud6.startAnimation(animation390Sec);
            mCloud7.startAnimation(animation390Sec);
            mSunRays.startAnimation(rotation);


        }
        else
        {
            // for mobile

            rotation = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.rotation_320);

            mSunRays.startAnimation(rotation);

        }

        swarArray = new String[]{"अ", "आ", "इ", "ई", "उ", "ऊ", "ऋ", "ए", "ऐ", "ओ", "औ", "अं", "अः"};

        varnmalaArray = new String[]{"क", "ख", "ग", "घ", "ङ", "च", "छ", "ज", "झ", "ञ", "ट", "ठ", "ड", "ढ", "ण", "त", "थ", "द", "ध", "न", "प", "फ", "ब", "भ", "म", "य", "र", "ल", "व", "श", "ष", "स", "ह"};

        swarVarnmala = SWAR;
        randomNumberGenerator();

        char1.setOnClickListener(this);
        char2.setOnClickListener(this);
        char3.setOnClickListener(this);
        char4.setOnClickListener(this);
        char5.setOnClickListener(this);
        char6.setOnClickListener(this);
        char7.setOnClickListener(this);
        char8.setOnClickListener(this);
        char9.setOnClickListener(this);
        char10.setOnClickListener(this);
        char11.setOnClickListener(this);
        char12.setOnClickListener(this);
        char13.setOnClickListener(this);
        char14.setOnClickListener(this);
        char15.setOnClickListener(this);
        char16.setOnClickListener(this);
        char17.setOnClickListener(this);
        char18.setOnClickListener(this);
        char19.setOnClickListener(this);
        char20.setOnClickListener(this);
        char21.setOnClickListener(this);
        char22.setOnClickListener(this);
        char23.setOnClickListener(this);
        char24.setOnClickListener(this);
        char25.setOnClickListener(this);
        char26.setOnClickListener(this);
        char27.setOnClickListener(this);
        char28.setOnClickListener(this);
        char29.setOnClickListener(this);
        char30.setOnClickListener(this);
        char31.setOnClickListener(this);
        char32.setOnClickListener(this);
        char33.setOnClickListener(this);
        mBack.setOnClickListener(this);
        mSwarAlphabets.setOnClickListener(this);
        mVarnmalaAlphabets.setOnClickListener(this);
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

    int pos = 0;

    @Override
    public void onClick(View v)
    {
        String charAt = null;
        int sender = 0;

        if (v.getId() == R.id.char1)
        {
            charAt = char1.getText().toString().trim();
            sender = 1;
        }
        else if (v.getId() == R.id.char2)
        {
            charAt = char2.getText().toString().trim();
            sender = 2;
        }
        else if (v.getId() == R.id.char3)
        {
            charAt = char3.getText().toString().trim();
            sender = 3;
        }
        else if (v.getId() == R.id.char4)
        {
            charAt = char4.getText().toString().trim();
            sender = 4;
        }
        else if (v.getId() == R.id.char5)
        {
            charAt = char5.getText().toString().trim();
            sender = 5;
        }
        else if (v.getId() == R.id.char6)
        {
            charAt = char6.getText().toString().trim();
            sender = 6;
        }
        else if (v.getId() == R.id.char7)
        {
            charAt = char7.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 1;
            }
            else
            {
                sender = 7;
            }

        }
        else if (v.getId() == R.id.char8)
        {
            charAt = char8.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 2;
            }
            else
            {
                sender = 8;
            }
        }
        else if (v.getId() == R.id.char9)
        {
            charAt = char9.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 3;
            }
            else
            {
                sender = 9;
            }
        }
        else if (v.getId() == R.id.char10)
        {
            charAt = char10.getText().toString().trim();
            sender = 10;
        }
        else if (v.getId() == R.id.char11)
        {
            charAt = char11.getText().toString().trim();
            sender = 11;
        }
        else if (v.getId() == R.id.char12)
        {
            charAt = char12.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 4;
            }
            else
            {
                sender = 12;
            }
        }
        else if (v.getId() == R.id.char13)
        {
            charAt = char13.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 5;
            }
            else
            {
                sender = 13;
            }
        }
        else if (v.getId() == R.id.char14)
        {
            charAt = char14.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 6;
            }
            else
            {
                sender = 14;
            }
        }
        else if (v.getId() == R.id.char15)
        {
            charAt = char15.getText().toString().trim();
            sender = 15;
        }
        else if (v.getId() == R.id.char16)
        {
            charAt = char16.getText().toString().trim();
            sender = 16;
        }
        else if (v.getId() == R.id.char17)
        {
            charAt = char17.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 7;
            }
            else
            {
                sender = 17;
            }
        }
        else if (v.getId() == R.id.char18)
        {
            charAt = char18.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 8;
            }
            else
            {
                sender = 18;
            }
        }
        else if (v.getId() == R.id.char19)
        {
            charAt = char19.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 9;
            }
            else
            {
                sender = 19;
            }
        }
        else if (v.getId() == R.id.char20)
        {
            charAt = char20.getText().toString().trim();
            sender = 20;
        }
        else if (v.getId() == R.id.char21)
        {
            charAt = char21.getText().toString().trim();
            sender = 21;
        }
        else if (v.getId() == R.id.char22)
        {
            charAt = char22.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 10;
            }
            else
            {
                sender = 22;
            }
        }
        else if (v.getId() == R.id.char23)
        {
            charAt = char23.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 11;
            }
            else
            {
                sender = 23;
            }
        }
        else if (v.getId() == R.id.char24)
        {
            charAt = char24.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 12;
            }
            else
            {
                sender = 24;
            }
        }
        else if (v.getId() == R.id.char25)
        {
            charAt = char25.getText().toString().trim();
            sender = 25;
        }
        else if (v.getId() == R.id.char26)
        {
            charAt = char26.getText().toString().trim();
            sender = 26;
        }
        else if (v.getId() == R.id.char27)
        {
            charAt = char27.getText().toString().trim();
            sender = 27;
        }
        else if (v.getId() == R.id.char28)
        {
            charAt = char28.getText().toString().trim();
            if (swarVarnmala == SWAR)
            {
                sender = 13;
            }
            else
            {
                sender = 28;
            }
        }
        else if (v.getId() == R.id.char29)
        {
            charAt = char29.getText().toString().trim();
            sender = 29;
        }
        else if (v.getId() == R.id.char30)
        {
            charAt = char30.getText().toString().trim();
            sender = 30;
        }
        else if (v.getId() == R.id.char31)
        {
            charAt = char31.getText().toString().trim();
            sender = 31;
        }
        else if (v.getId() == R.id.char32)
        {
            charAt = char32.getText().toString().trim();
            sender = 32;
        }
        else if (v.getId() == R.id.char33)
        {
            charAt = char33.getText().toString().trim();
            sender = 33;
        }
        else if (v.getId() == R.id.backBT)
        {
            sender = 0;
            finish();
        }
        else if (v.getId() == R.id.swarAlphabets)
        {
            sender = 0;
            swarDisplay();
            randomNumberGenerator();
        }
        else if (v.getId() == R.id.varnmalaAlphabets)
        {
            sender = 0;
            varnmalaDisplay();
            randomNumberGenerator();
        }

        if (sender > 0)
        {
            if (swarVarnmala == SWAR)
            {
                switch (pos)
                {
                    case 0:

                        if (swarArray[0].equals(charAt))
                        {
                            charH7.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 1:

                        if (swarArray[1].equals(charAt))
                        {
                            charH8.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 2:

                        if (swarArray[2].equals(charAt))
                        {
                            charH9.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 3:

                        if (swarArray[3].equals(charAt))
                        {
                            charH12.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 4:

                        if (swarArray[4].equals(charAt))
                        {
                            charH13.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 5:

                        if (swarArray[5].equals(charAt))
                        {
                            charH14.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 6:

                        if (swarArray[6].equals(charAt))
                        {
                            charH17.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 7:

                        if (swarArray[7].equals(charAt))
                        {
                            charH18.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 8:

                        if (swarArray[8].equals(charAt))
                        {
                            charH19.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 9:

                        if (swarArray[9].equals(charAt))
                        {
                            charH22.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 10:

                        if (swarArray[10].equals(charAt))
                        {
                            charH23.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 11:

                        if (swarArray[11].equals(charAt))
                        {
                            charH24.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 13)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 12:

                        if (swarArray[12].equals(charAt))
                        {
                            charH28.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 13)
                            {
                                pos++;
                            }

                            swarVarnmala = VARNMALA;
                            randomNumberGenerator();
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;

                }

            }
            else
            {
                switch (pos)
                {
                    case 0:

                        if (varnmalaArray[0].equals(charAt))
                        {
                            charH1.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 1:

                        if (varnmalaArray[1].equals(charAt))
                        {
                            charH2.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 2:

                        if (varnmalaArray[2].equals(charAt))
                        {
                            charH3.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 3:

                        if (varnmalaArray[3].equals(charAt))
                        {
                            charH4.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 4:

                        if (varnmalaArray[4].equals(charAt))
                        {
                            charH5.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 5:

                        if (varnmalaArray[5].equals(charAt))
                        {
                            charH6.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 6:

                        if (varnmalaArray[6].equals(charAt))
                        {
                            charH7.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 7:

                        if (varnmalaArray[7].equals(charAt))
                        {
                            charH8.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);
                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 8:

                        if (varnmalaArray[8].equals(charAt))
                        {
                            charH9.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 9:

                        if (varnmalaArray[9].equals(charAt))
                        {
                            charH10.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 10:

                        if (varnmalaArray[10].equals(charAt))
                        {
                            charH11.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 11:

                        if (varnmalaArray[11].equals(charAt))
                        {
                            charH12.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 12:

                        if (varnmalaArray[12].equals(charAt))
                        {
                            charH13.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 13:

                        if (varnmalaArray[13].equals(charAt))
                        {
                            charH14.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 14:

                        if (varnmalaArray[14].equals(charAt))
                        {
                            charH15.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 15:

                        if (varnmalaArray[15].equals(charAt))
                        {
                            charH16.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 16:

                        if (varnmalaArray[16].equals(charAt))
                        {
                            charH17.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 17:

                        if (varnmalaArray[17].equals(charAt))
                        {
                            charH18.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 18:

                        if (varnmalaArray[18].equals(charAt))
                        {
                            charH19.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 19:

                        if (varnmalaArray[19].equals(charAt))
                        {
                            charH20.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 20:

                        if (varnmalaArray[20].equals(charAt))
                        {
                            charH21.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;

                    case 21:

                        if (varnmalaArray[21].equals(charAt))
                        {
                            charH22.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 22:

                        if (varnmalaArray[22].equals(charAt))
                        {
                            charH23.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 23:

                        if (varnmalaArray[23].equals(charAt))
                        {
                            charH24.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 24:

                        if (varnmalaArray[24].equals(charAt))
                        {
                            charH25.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 25:

                        if (varnmalaArray[25].equals(charAt))
                        {
                            charH26.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }


                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 26:

                        if (varnmalaArray[26].equals(charAt))
                        {
                            charH27.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }


                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 27:

                        if (varnmalaArray[27].equals(charAt))
                        {
                            charH28.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }


                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 28:

                        if (varnmalaArray[28].equals(charAt))
                        {
                            charH29.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }


                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 29:

                        if (varnmalaArray[29].equals(charAt))
                        {
                            charH30.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }


                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 30:

                        if (varnmalaArray[30].equals(charAt))
                        {
                            charH31.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }


                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 31:

                        if (varnmalaArray[31].equals(charAt))
                        {
                            charH32.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }


                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 32:

                        if (varnmalaArray[32].equals(charAt))
                        {
                            charH33.setText(charAt);
                            startSoundService(CHEERS_SOUND);
                            disable(sender);

                            if (pos < 33)
                            {
                                pos++;
                            }

                            alert();

                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                }

            }
        }

    }


    public void disable(int number)
    {
        if (swarVarnmala == SWAR)
        {
            switch (number)
            {
                case 1:

                    char7.setAlpha(0.5f);
                    char7.setClickable(false);

                    break;
                case 2:

                    char8.setAlpha(0.5f);
                    char8.setClickable(false);

                    break;
                case 3:

                    char9.setAlpha(0.5f);
                    char9.setClickable(false);

                    break;
                case 4:

                    char12.setAlpha(0.5f);
                    char12.setClickable(false);

                    break;
                case 5:

                    char13.setAlpha(0.5f);
                    char13.setClickable(false);

                    break;
                case 6:

                    char14.setAlpha(0.5f);
                    char14.setClickable(false);

                    break;
                case 7:

                    char17.setAlpha(0.5f);
                    char17.setClickable(false);

                    break;
                case 8:

                    char18.setAlpha(0.5f);
                    char18.setClickable(false);

                    break;
                case 9:

                    char19.setAlpha(0.5f);
                    char19.setClickable(false);

                    break;
                case 10:

                    char22.setAlpha(0.5f);
                    char22.setClickable(false);

                    break;
                case 11:

                    char23.setAlpha(0.5f);
                    char23.setClickable(false);

                    break;
                case 12:

                    char24.setAlpha(0.5f);
                    char24.setClickable(false);

                    break;
                case 13:

                    char28.setAlpha(0.5f);
                    char28.setClickable(false);

                    break;
            }
        }
        else
        {
            switch (number)
            {
                case 1:

                    char1.setAlpha(0.5f);
                    char1.setClickable(false);

                    break;
                case 2:

                    char2.setAlpha(0.5f);
                    char2.setClickable(false);

                    break;
                case 3:

                    char3.setAlpha(0.5f);
                    char3.setClickable(false);

                    break;
                case 4:

                    char4.setAlpha(0.5f);
                    char4.setClickable(false);

                    break;
                case 5:

                    char5.setAlpha(0.5f);
                    char5.setClickable(false);

                    break;
                case 6:

                    char6.setAlpha(0.5f);
                    char6.setClickable(false);

                    break;
                case 7:

                    char7.setAlpha(0.5f);
                    char7.setClickable(false);

                    break;
                case 8:

                    char8.setAlpha(0.5f);
                    char8.setClickable(false);

                    break;
                case 9:

                    char9.setAlpha(0.5f);
                    char9.setClickable(false);

                    break;
                case 10:

                    char10.setAlpha(0.5f);
                    char10.setClickable(false);

                    break;
                case 11:

                    char11.setAlpha(0.5f);
                    char11.setClickable(false);

                    break;
                case 12:

                    char12.setAlpha(0.5f);
                    char12.setClickable(false);

                    break;
                case 13:

                    char13.setAlpha(0.5f);
                    char13.setClickable(false);

                    break;
                case 14:

                    char14.setAlpha(0.5f);
                    char14.setClickable(false);

                    break;
                case 15:

                    char15.setAlpha(0.5f);
                    char15.setClickable(false);

                    break;
                case 16:

                    char16.setAlpha(0.5f);
                    char16.setClickable(false);

                    break;
                case 17:

                    char17.setAlpha(0.5f);
                    char17.setClickable(false);

                    break;
                case 18:

                    char18.setAlpha(0.5f);
                    char18.setClickable(false);

                    break;
                case 19:

                    char19.setAlpha(0.5f);
                    char19.setClickable(false);

                    break;
                case 20:

                    char20.setAlpha(0.5f);
                    char20.setClickable(false);

                    break;
                case 21:

                    char21.setAlpha(0.5f);
                    char21.setClickable(false);

                    break;

                case 22:

                    char22.setAlpha(0.5f);
                    char22.setClickable(false);

                    break;
                case 23:

                    char23.setAlpha(0.5f);
                    char23.setClickable(false);

                    break;
                case 24:

                    char24.setAlpha(0.5f);
                    char24.setClickable(false);

                    break;
                case 25:

                    char25.setAlpha(0.5f);
                    char25.setClickable(false);

                    break;
                case 26:

                    char26.setAlpha(0.5f);
                    char26.setClickable(false);

                    break;
                case 27:

                    char27.setAlpha(0.5f);
                    char27.setClickable(false);

                    break;
                case 28:

                    char28.setAlpha(0.5f);
                    char28.setClickable(false);

                    break;
                case 29:

                    char29.setAlpha(0.5f);
                    char29.setClickable(false);

                    break;
                case 30:

                    char30.setAlpha(0.5f);
                    char30.setClickable(false);

                    break;
                case 31:

                    char31.setAlpha(0.5f);
                    char31.setClickable(false);

                    break;
                case 32:

                    char32.setAlpha(0.5f);
                    char32.setClickable(false);

                    break;
                case 33:

                    char33.setAlpha(0.5f);
                    char33.setClickable(false);

                    break;
            }

        }
    }


    public void alert()
    {
        LayoutInflater layoutInflater = LayoutInflater.from(Level3.this);
        View customAlert = layoutInflater.inflate(R.layout.alert_screen, null);

        final Dialog alertDialog = new Dialog(this);
        alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        alertDialog.setContentView(customAlert);
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.setCancelable(false);
        alertDialog.show();

        ImageButton mHome = (ImageButton) customAlert.findViewById(R.id.btHome);
        ImageButton mReplay = (ImageButton) customAlert.findViewById(R.id.btReplay);

        mHome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        mReplay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                alertDialog.dismiss();
                swarVarnmala = SWAR;
                randomNumberGenerator();
                enableAll();
            }
        });
    }

    public void startSoundService(final int soundToPlay)
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(Level3.this, SoundService.class);
                intent.putExtra("Sound_To_Play", soundToPlay);
                startService(intent);
            }
        }).start();
    }


    public void stopSoundService()
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                stopService(new Intent(Level3.this, SoundService.class));
            }
        }).start();

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("log", "onDestroy");
        stopSoundService();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("log", "onPause");
        stopSoundService();
    }


    public void randomNumberGenerator()
    {
        randomGenerator = new Random();
        mList = new ArrayList<>();

        if (mList.size() != 0)
        {
            mList.clear();
        }

        enableAll();

        if (swarVarnmala == SWAR)
        {
            mList.addAll(Arrays.asList(swarArray));
            swarDisplay();
        }
        else
        {
            mList.addAll(Arrays.asList(varnmalaArray));
            varnmalaDisplay();
        }

        int id = 0;

        do
        {
            int position = randomGenerator.nextInt(mList.size());

            String carAtPosition = mList.get(position);

            if (swarVarnmala == SWAR)
            {
                switch (id)
                {
                    case 0:
                        char7.setText(carAtPosition);
                        break;
                    case 1:
                        char8.setText(carAtPosition);
                        break;
                    case 2:
                        char9.setText(carAtPosition);
                        break;
                    case 3:
                        char12.setText(carAtPosition);
                        break;
                    case 4:
                        char13.setText(carAtPosition);
                        break;
                    case 5:
                        char14.setText(carAtPosition);
                        break;
                    case 6:
                        char17.setText(carAtPosition);
                        break;
                    case 7:
                        char18.setText(carAtPosition);
                        break;
                    case 8:
                        char19.setText(carAtPosition);
                        break;
                    case 9:
                        char22.setText(carAtPosition);
                        break;
                    case 10:
                        char23.setText(carAtPosition);
                        break;
                    case 11:
                        char24.setText(carAtPosition);
                        break;
                    case 12:
                        char28.setText(carAtPosition);
                        break;
                }

            }
            else
            {
                switch (id)
                {
                    case 0:
                        char1.setText(carAtPosition);
                        break;
                    case 1:
                        char2.setText(carAtPosition);
                        break;
                    case 2:
                        char3.setText(carAtPosition);
                        break;
                    case 3:
                        char4.setText(carAtPosition);
                        break;
                    case 4:
                        char5.setText(carAtPosition);
                        break;
                    case 5:
                        char6.setText(carAtPosition);
                        break;
                    case 6:
                        char7.setText(carAtPosition);
                        break;
                    case 7:
                        char8.setText(carAtPosition);
                        break;
                    case 8:
                        char9.setText(carAtPosition);
                        break;
                    case 9:
                        char10.setText(carAtPosition);
                        break;
                    case 10:
                        char11.setText(carAtPosition);
                        break;
                    case 11:
                        char12.setText(carAtPosition);
                        break;
                    case 12:
                        char13.setText(carAtPosition);
                        break;
                    case 13:
                        char14.setText(carAtPosition);
                        break;
                    case 14:
                        char15.setText(carAtPosition);
                        break;
                    case 15:
                        char16.setText(carAtPosition);
                        break;
                    case 16:
                        char17.setText(carAtPosition);
                        break;
                    case 17:
                        char18.setText(carAtPosition);
                        break;
                    case 18:
                        char19.setText(carAtPosition);
                        break;
                    case 19:
                        char20.setText(carAtPosition);
                        break;
                    case 20:
                        char21.setText(carAtPosition);
                        break;
                    case 21:
                        char22.setText(carAtPosition);
                        break;
                    case 22:
                        char23.setText(carAtPosition);
                        break;
                    case 23:
                        char24.setText(carAtPosition);
                        break;
                    case 24:
                        char25.setText(carAtPosition);
                        break;
                    case 25:
                        char26.setText(carAtPosition);
                        break;
                    case 26:
                        char27.setText(carAtPosition);
                        break;
                    case 27:
                        char28.setText(carAtPosition);
                        break;
                    case 28:
                        char29.setText(carAtPosition);
                        break;
                    case 29:
                        char30.setText(carAtPosition);
                        break;
                    case 30:
                        char31.setText(carAtPosition);
                        break;
                    case 31:
                        char32.setText(carAtPosition);
                        break;
                    case 32:
                        char33.setText(carAtPosition);
                        break;
                }

            }


            id++;

            mList.remove(position);

        } while (mList.size() > 0);


        pos = 0;

        charH1.setText(null);
        charH2.setText(null);
        charH3.setText(null);
        charH4.setText(null);
        charH5.setText(null);
        charH6.setText(null);
        charH7.setText(null);
        charH8.setText(null);
        charH9.setText(null);
        charH10.setText(null);
        charH11.setText(null);
        charH12.setText(null);
        charH13.setText(null);
        charH14.setText(null);
        charH15.setText(null);
        charH16.setText(null);
        charH17.setText(null);
        charH18.setText(null);
        charH19.setText(null);
        charH20.setText(null);
        charH21.setText(null);
        charH22.setText(null);
        charH23.setText(null);
        charH24.setText(null);
        charH25.setText(null);
        charH26.setText(null);
        charH27.setText(null);
        charH28.setText(null);
        charH29.setText(null);
        charH30.setText(null);
        charH31.setText(null);
        charH32.setText(null);
        charH33.setText(null);
    }


    public void enableAll()
    {

        char1.setAlpha(1.0f);
        char1.setClickable(true);

        char2.setAlpha(1.0f);
        char2.setClickable(true);

        char3.setAlpha(1.0f);
        char3.setClickable(true);

        char4.setAlpha(1.0f);
        char4.setClickable(true);

        char5.setAlpha(1.0f);
        char5.setClickable(true);

        char6.setAlpha(1.0f);
        char6.setClickable(true);

        char7.setAlpha(1.0f);
        char7.setClickable(true);

        char8.setAlpha(1.0f);
        char8.setClickable(true);

        char9.setAlpha(1.0f);
        char9.setClickable(true);

        char10.setAlpha(1.0f);
        char10.setClickable(true);

        char11.setAlpha(1.0f);
        char11.setClickable(true);

        char12.setAlpha(1.0f);
        char12.setClickable(true);

        char13.setAlpha(1.0f);
        char13.setClickable(true);

        char14.setAlpha(1.0f);
        char14.setClickable(true);

        char15.setAlpha(1.0f);
        char15.setClickable(true);

        char16.setAlpha(1.0f);
        char16.setClickable(true);

        char17.setAlpha(1.0f);
        char17.setClickable(true);

        char18.setAlpha(1.0f);
        char18.setClickable(true);

        char19.setAlpha(1.0f);
        char19.setClickable(true);

        char20.setAlpha(1.0f);
        char20.setClickable(true);

        char21.setAlpha(1.0f);
        char21.setClickable(true);

        char22.setAlpha(1.0f);
        char22.setClickable(true);

        char23.setAlpha(1.0f);
        char23.setClickable(true);

        char24.setAlpha(1.0f);
        char24.setClickable(true);

        char25.setAlpha(1.0f);
        char25.setClickable(true);

        char26.setAlpha(1.0f);
        char26.setClickable(true);

        char27.setAlpha(1.0f);
        char27.setClickable(true);

        char28.setAlpha(1.0f);
        char28.setClickable(true);

        char29.setAlpha(1.0f);
        char29.setClickable(true);

        char30.setAlpha(1.0f);
        char30.setClickable(true);

        char31.setAlpha(1.0f);
        char31.setClickable(true);

        char32.setAlpha(1.0f);
        char32.setClickable(true);

        char33.setAlpha(1.0f);
        char33.setClickable(true);
    }

    public void swarDisplay()
    {
        swarVarnmala = SWAR;

        mTitleLabel.setText("Arrange\nthe\nVowels\n(स्वर)");

        char1.setVisibility(View.INVISIBLE);
        char2.setVisibility(View.INVISIBLE);
        char3.setVisibility(View.INVISIBLE);
        char4.setVisibility(View.INVISIBLE);
        char5.setVisibility(View.INVISIBLE);
        char6.setVisibility(View.INVISIBLE);
        char7.setVisibility(View.VISIBLE);
        char8.setVisibility(View.VISIBLE);
        char9.setVisibility(View.VISIBLE);
        char10.setVisibility(View.INVISIBLE);
        char11.setVisibility(View.INVISIBLE);
        char12.setVisibility(View.VISIBLE);
        char13.setVisibility(View.VISIBLE);
        char14.setVisibility(View.VISIBLE);
        char15.setVisibility(View.INVISIBLE);
        char16.setVisibility(View.INVISIBLE);
        char17.setVisibility(View.VISIBLE);
        char18.setVisibility(View.VISIBLE);
        char19.setVisibility(View.VISIBLE);
        char20.setVisibility(View.INVISIBLE);
        char21.setVisibility(View.INVISIBLE);
        char22.setVisibility(View.VISIBLE);
        char23.setVisibility(View.VISIBLE);
        char24.setVisibility(View.VISIBLE);
        char25.setVisibility(View.INVISIBLE);
        char26.setVisibility(View.INVISIBLE);
        char27.setVisibility(View.INVISIBLE);
        char28.setVisibility(View.VISIBLE);
        char29.setVisibility(View.INVISIBLE);
        char30.setVisibility(View.INVISIBLE);
        char31.setVisibility(View.INVISIBLE);
        char32.setVisibility(View.INVISIBLE);
        char33.setVisibility(View.INVISIBLE);

        charH1.setVisibility(View.INVISIBLE);
        charH2.setVisibility(View.INVISIBLE);
        charH3.setVisibility(View.INVISIBLE);
        charH4.setVisibility(View.INVISIBLE);
        charH5.setVisibility(View.INVISIBLE);
        charH6.setVisibility(View.INVISIBLE);
        charH7.setVisibility(View.VISIBLE);
        charH8.setVisibility(View.VISIBLE);
        charH9.setVisibility(View.VISIBLE);
        charH10.setVisibility(View.INVISIBLE);
        charH11.setVisibility(View.INVISIBLE);
        charH12.setVisibility(View.VISIBLE);
        charH13.setVisibility(View.VISIBLE);
        charH14.setVisibility(View.VISIBLE);
        charH15.setVisibility(View.INVISIBLE);
        charH16.setVisibility(View.INVISIBLE);
        charH17.setVisibility(View.VISIBLE);
        charH18.setVisibility(View.VISIBLE);
        charH19.setVisibility(View.VISIBLE);
        charH20.setVisibility(View.INVISIBLE);
        charH21.setVisibility(View.INVISIBLE);
        charH22.setVisibility(View.VISIBLE);
        charH23.setVisibility(View.VISIBLE);
        charH24.setVisibility(View.VISIBLE);
        charH25.setVisibility(View.INVISIBLE);
        charH26.setVisibility(View.INVISIBLE);
        charH27.setVisibility(View.INVISIBLE);
        charH28.setVisibility(View.VISIBLE);
        charH29.setVisibility(View.INVISIBLE);
        charH30.setVisibility(View.INVISIBLE);
        charH31.setVisibility(View.INVISIBLE);
        charH32.setVisibility(View.INVISIBLE);
        charH33.setVisibility(View.INVISIBLE);
    }

    public void varnmalaDisplay()
    {
        swarVarnmala = VARNMALA;

        mTitleLabel.setText("Arrange\nthe\nConsonants\n(व्यंजन)");

        char1.setVisibility(View.VISIBLE);
        char2.setVisibility(View.VISIBLE);
        char3.setVisibility(View.VISIBLE);
        char4.setVisibility(View.VISIBLE);
        char5.setVisibility(View.VISIBLE);
        char6.setVisibility(View.VISIBLE);
        char7.setVisibility(View.VISIBLE);
        char8.setVisibility(View.VISIBLE);
        char9.setVisibility(View.VISIBLE);
        char10.setVisibility(View.VISIBLE);
        char11.setVisibility(View.VISIBLE);
        char12.setVisibility(View.VISIBLE);
        char13.setVisibility(View.VISIBLE);
        char14.setVisibility(View.VISIBLE);
        char15.setVisibility(View.VISIBLE);
        char16.setVisibility(View.VISIBLE);
        char17.setVisibility(View.VISIBLE);
        char18.setVisibility(View.VISIBLE);
        char19.setVisibility(View.VISIBLE);
        char20.setVisibility(View.VISIBLE);
        char21.setVisibility(View.VISIBLE);
        char22.setVisibility(View.VISIBLE);
        char23.setVisibility(View.VISIBLE);
        char24.setVisibility(View.VISIBLE);
        char25.setVisibility(View.VISIBLE);
        char26.setVisibility(View.VISIBLE);
        char27.setVisibility(View.VISIBLE);
        char28.setVisibility(View.VISIBLE);
        char29.setVisibility(View.VISIBLE);
        char30.setVisibility(View.VISIBLE);
        char31.setVisibility(View.VISIBLE);
        char32.setVisibility(View.VISIBLE);
        char33.setVisibility(View.VISIBLE);

        charH1.setVisibility(View.VISIBLE);
        charH2.setVisibility(View.VISIBLE);
        charH3.setVisibility(View.VISIBLE);
        charH4.setVisibility(View.VISIBLE);
        charH5.setVisibility(View.VISIBLE);
        charH6.setVisibility(View.VISIBLE);
        charH7.setVisibility(View.VISIBLE);
        charH8.setVisibility(View.VISIBLE);
        charH9.setVisibility(View.VISIBLE);
        charH10.setVisibility(View.VISIBLE);
        charH11.setVisibility(View.VISIBLE);
        charH12.setVisibility(View.VISIBLE);
        charH13.setVisibility(View.VISIBLE);
        charH14.setVisibility(View.VISIBLE);
        charH15.setVisibility(View.VISIBLE);
        charH16.setVisibility(View.VISIBLE);
        charH17.setVisibility(View.VISIBLE);
        charH18.setVisibility(View.VISIBLE);
        charH19.setVisibility(View.VISIBLE);
        charH20.setVisibility(View.VISIBLE);
        charH21.setVisibility(View.VISIBLE);
        charH22.setVisibility(View.VISIBLE);
        charH23.setVisibility(View.VISIBLE);
        charH24.setVisibility(View.VISIBLE);
        charH25.setVisibility(View.VISIBLE);
        charH26.setVisibility(View.VISIBLE);
        charH27.setVisibility(View.VISIBLE);
        charH28.setVisibility(View.VISIBLE);
        charH29.setVisibility(View.VISIBLE);
        charH30.setVisibility(View.VISIBLE);
        charH31.setVisibility(View.VISIBLE);
        charH32.setVisibility(View.VISIBLE);
        charH33.setVisibility(View.VISIBLE);
    }
}
