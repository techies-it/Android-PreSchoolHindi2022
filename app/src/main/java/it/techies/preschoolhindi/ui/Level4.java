package it.techies.preschoolhindi.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
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

public class Level4 extends BaseActivity implements View.OnClickListener
{
    private int currentApiVersion;

    private String carAtPosition;

    int CHEERS_SOUND = 1;
    int AWW_SOUND = 2;

    private ArrayList<String> mList, mCharactersList;

    private Random randomGenerator;

    @Bind(R.id.characterTV)
    TextView mCharacterTV;

    @Bind(R.id.smallBoardLabel)
    TextView mSmallBoardLabel;

    @Bind(R.id.tvFruitName)
    TextView mFruitName;

    @Bind(R.id.ivFruitImage)
    ImageView mFruitImage;

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

    TextView char34, char35, char36, char37, char38, char39, char40, char41, char42, char43, char44, char45, char46;

    View mSwarAlphabets, mVarnmalaAlphabets;

    Animation animation270Sec, animation330Sec, animation390Sec, rotation;

    String[] varnmalaNamesArray, swarNamesArray;
    int[] varnmalaImagesArray, swarImagesArray;

    String[] swarArray, varnmalaArray;

    String[] swarVarnmalaArray, swarVarnmalaNamesArray;
    int[] swarVarnmalaImagesArray;

    int SWAR = 1, VARNMALA = 2, swarVarnmala;

    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        currentApiVersion = android.os.Build.VERSION.SDK_INT;

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
        setContentView(R.layout.activity_level4);

        ButterKnife.bind(this);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/lohit_devanagari.ttf");

        mCharacterTV.setTypeface(typeface);
        mFruitName.setTypeface(typeface);
        mSmallBoardLabel.setTypeface(typeface);
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

            swarVarnmalaArray = new String[]{"अ", "आ", "इ", "ई", "उ", "ऊ", "ऋ", "ए", "ऐ", "ओ", "औ", "अं", "अः", "क", "ख", "ग", "घ", "ङ", "च", "छ", "ज", "झ", "ञ", "ट", "ठ", "ड", "ढ", "ण", "त", "थ", "द", "ध", "न", "प", "फ", "ब", "भ", "म", "य", "र", "ल", "व", "श", "ष", "स", "ह"};

            swarVarnmalaNamesArray = new String[]{"अनार", "आम", "इमारत", "ईख", "उल्लू", "ऊन", "ॠषि", "एड़ी", "ऐनक", "ओखली", "औरत", "अंगूर", "", "कमल", "खरगोश", "गाय", "घड़ी", "", "चम्मच", "छतरी", "जहाज", "झाड़ू", "", "टमाटर", "ठेला", "डमरू", "ढोल", "बाण", "तरबूज", "थरमस", "दवात", "धनुष", "नल", "पतंग", "फल", "बत्तख", "भालू", "मछली", "योग", "रेल", "लट्टू", "वृक्ष", "शंख", "षट्कोण", "सेब", "हाथी"};

            swarVarnmalaImagesArray = new int[]{R.drawable.pomegranate_600, R.drawable.mango_600, R.drawable.building_600, R.drawable.reed_600, R.drawable.owl_600,
                    R.drawable.wool_600, R.drawable.shadi_600, R.drawable.heel_600, R.drawable.specs_600, R.drawable.mortar_600,
                    R.drawable.ladies_600, R.drawable.grapes_600, 0, R.drawable.lotus_600, R.drawable.rabbit_600, R.drawable.cow_600,
                    R.drawable.watch_600, 0, R.drawable.spoon_600, R.drawable.umbrella_600, R.drawable.ship_600, R.drawable.broom_600,
                    0, R.drawable.tomato_600, R.drawable.jamming_600, R.drawable.cornets_600, R.drawable.drum_600, R.drawable.arrow_600,
                    R.drawable.watermelon_600, R.drawable.thermos_600, R.drawable.ink_600, R.drawable.bow_600, R.drawable.tap_600,
                    R.drawable.kite_600, R.drawable.fruit_600, R.drawable.duck_600, R.drawable.bear_600, R.drawable.fish_600, R.drawable.yoga_600,
                    R.drawable.train_600, R.drawable.topspin_600, R.drawable.tree_600, R.drawable.shell_600, R.drawable.hexagonal_600,
                    R.drawable.apple_600, R.drawable.elephant_600};

            char34 = (TextView) findViewById(R.id.char34);
            char35 = (TextView) findViewById(R.id.char35);
            char36 = (TextView) findViewById(R.id.char36);
            char37 = (TextView) findViewById(R.id.char37);
            char38 = (TextView) findViewById(R.id.char38);
            char39 = (TextView) findViewById(R.id.char39);
            char40 = (TextView) findViewById(R.id.char40);
            char41 = (TextView) findViewById(R.id.char41);
            char42 = (TextView) findViewById(R.id.char42);
            char43 = (TextView) findViewById(R.id.char43);
            char44 = (TextView) findViewById(R.id.char44);
            char45 = (TextView) findViewById(R.id.char45);
            char46 = (TextView) findViewById(R.id.char46);

            char34.setTypeface(typeface);
            char35.setTypeface(typeface);
            char36.setTypeface(typeface);
            char37.setTypeface(typeface);
            char38.setTypeface(typeface);
            char39.setTypeface(typeface);
            char40.setTypeface(typeface);
            char41.setTypeface(typeface);
            char42.setTypeface(typeface);
            char43.setTypeface(typeface);
            char44.setTypeface(typeface);
            char45.setTypeface(typeface);
            char46.setTypeface(typeface);

            char34.setOnClickListener(this);
            char35.setOnClickListener(this);
            char36.setOnClickListener(this);
            char37.setOnClickListener(this);
            char38.setOnClickListener(this);
            char39.setOnClickListener(this);
            char40.setOnClickListener(this);
            char41.setOnClickListener(this);
            char42.setOnClickListener(this);
            char43.setOnClickListener(this);
            char44.setOnClickListener(this);
            char45.setOnClickListener(this);
            char46.setOnClickListener(this);

            randomNumbersForButtons();
            generateRandomCharacter();
        }
        else
        {
            // for mobile

            rotation = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.rotation_320);

            mSunRays.startAnimation(rotation);

            TextView mSwarAlphabetsText = (TextView) findViewById(R.id.swarAlphabetsText);
            TextView mVarnmalaAlphabetsText = (TextView) findViewById(R.id.varnmalaAlphabetsText);

            mSwarAlphabetsText.setTypeface(typeface);
            mVarnmalaAlphabetsText.setTypeface(typeface);

            mSwarAlphabets = (View) findViewById(R.id.swarAlphabets);
            mVarnmalaAlphabets = (View) findViewById(R.id.varnmalaAlphabets);

            mSwarAlphabets.setOnClickListener(this);
            mVarnmalaAlphabets.setOnClickListener(this);

            swarArray = new String[]{"अ", "आ", "इ", "ई", "उ", "ऊ", "ऋ", "ए", "ऐ", "ओ", "औ", "अं", "अः"};

            varnmalaArray = new String[]{"क", "ख", "ग", "घ", "ङ", "च", "छ", "ज", "झ", "ञ", "ट", "ठ", "ड", "ढ", "ण", "त", "थ", "द", "ध", "न", "प", "फ", "ब", "भ", "म", "य", "र", "ल", "व", "श", "ष", "स", "ह"};

            swarImagesArray = new int[]{R.drawable.pomegranate_320, R.drawable.mango_320, R.drawable.building_320, R.drawable.reed_320, R.drawable.owl_320,
                    R.drawable.wool_320, R.drawable.shadi_320, R.drawable.heel_320, R.drawable.specs_320, R.drawable.mortar_320,
                    R.drawable.ladies_320, R.drawable.grapes_320, 0};

            varnmalaImagesArray = new int[]{R.drawable.lotus_320, R.drawable.rabbit_320, R.drawable.cow_320, R.drawable.watch_320, 0, R.drawable.spoon_320, R.drawable.umbrella_320,
                    R.drawable.ship_320, R.drawable.broom_320, 0, R.drawable.tomato_320, R.drawable.jamming_320, R.drawable.cornets_320, R.drawable.drum_320,
                    R.drawable.arrow_320, R.drawable.watermelon_320, R.drawable.thermos_320, R.drawable.ink_320, R.drawable.bow_320, R.drawable.tap_320,
                    R.drawable.kite_320, R.drawable.fruit_320, R.drawable.duck_320, R.drawable.bear_320, R.drawable.fish_320, R.drawable.yoga_320, R.drawable.train_320,
                    R.drawable.topspin_320, R.drawable.tree_320, R.drawable.shell_320, R.drawable.hexagonal_320, R.drawable.apple_320, R.drawable.elephant_320};

            swarNamesArray = new String[]{"अनार", "आम", "इमारत", "ईख", "उल्लू", "ऊन", "ॠषि", "एड़ी", "ऐनक", "ओखली", "औरत", "अंगूर", ""};


            varnmalaNamesArray = new String[]{"कमल", "खरगोश", "गाय", "घड़ी", "", "चम्मच", "छतरी", "जहाज", "झाड़ू", "", "टमाटर", "ठेला", "डमरू", "ढोल", "बाण", "तरबूज", "थरमस", "दवात", "धनुष", "नल", "पतंग", "फल", "बत्तख", "भालू", "मछली", "योग", "रेल", "लट्टू", "वृक्ष", "शंख", "षट्कोण", "सेब", "हाथी"};

            swarDisplay();

        }


    }

    public void swarDisplay()
    {
        swarVarnmala = SWAR;

        char1.setVisibility(View.INVISIBLE);
        char2.setVisibility(View.INVISIBLE);
        char3.setVisibility(View.VISIBLE);
        char4.setVisibility(View.INVISIBLE);
        char5.setVisibility(View.VISIBLE);
        char6.setVisibility(View.INVISIBLE);
        char7.setVisibility(View.INVISIBLE);
        char8.setVisibility(View.INVISIBLE);
        char9.setVisibility(View.VISIBLE);
        char10.setVisibility(View.INVISIBLE);
        char11.setVisibility(View.VISIBLE);
        char12.setVisibility(View.VISIBLE);
        char13.setVisibility(View.VISIBLE);
        char14.setVisibility(View.INVISIBLE);
        char15.setVisibility(View.INVISIBLE);
        char16.setVisibility(View.INVISIBLE);
        char17.setVisibility(View.INVISIBLE);
        char18.setVisibility(View.VISIBLE);
        char19.setVisibility(View.INVISIBLE);
        char20.setVisibility(View.VISIBLE);
        char21.setVisibility(View.VISIBLE);
        char22.setVisibility(View.VISIBLE);
        char23.setVisibility(View.INVISIBLE);
        char24.setVisibility(View.INVISIBLE);
        char25.setVisibility(View.VISIBLE);
        char26.setVisibility(View.INVISIBLE);
        char27.setVisibility(View.INVISIBLE);
        char28.setVisibility(View.INVISIBLE);
        char29.setVisibility(View.INVISIBLE);
        char30.setVisibility(View.INVISIBLE);
        char31.setVisibility(View.INVISIBLE);
        char32.setVisibility(View.VISIBLE);
        char33.setVisibility(View.VISIBLE);

        enableAll();
        randomNumberGenerator();
        generateRandomCharacter();
    }

    public void varnmalaDisplay()
    {

        swarVarnmala = VARNMALA;

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

        enableAll();
        randomNumberGenerator();
        generateRandomCharacter();
    }

    public void randomNumberGenerator()
    {
        randomGenerator = new Random();
        mCharactersList = new ArrayList<>();
        mList = new ArrayList<>();

        if (mList.size() != 0)
        {
            mList.clear();
        }

        //enableAll();

        if (swarVarnmala == SWAR)
        {
            mCharactersList.addAll(Arrays.asList(swarArray));
            mList.addAll(Arrays.asList(swarArray));
            // swarDisplay();
        }
        else
        {
            mCharactersList.addAll(Arrays.asList(varnmalaArray));
            mList.addAll(Arrays.asList(varnmalaArray));
            // varnmalaDisplay();
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
                        char3.setText(carAtPosition);
                        break;
                    case 1:
                        char5.setText(carAtPosition);
                        break;
                    case 2:
                        char9.setText(carAtPosition);
                        break;
                    case 3:
                        char11.setText(carAtPosition);
                        break;
                    case 4:
                        char12.setText(carAtPosition);
                        break;
                    case 5:
                        char13.setText(carAtPosition);
                        break;
                    case 6:
                        char18.setText(carAtPosition);
                        break;
                    case 7:
                        char20.setText(carAtPosition);
                        break;
                    case 8:
                        char21.setText(carAtPosition);
                        break;
                    case 9:
                        char22.setText(carAtPosition);
                        break;
                    case 10:
                        char25.setText(carAtPosition);
                        break;
                    case 11:
                        char32.setText(carAtPosition);
                        break;
                    case 12:
                        char33.setText(carAtPosition);
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
        String charAt = null, boardChar = mCharacterTV.getText().toString().trim();
        int sender = 0;

        if (getResources().getBoolean(R.bool.isTab))
        {
            // for tab

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
                sender = 7;
            }
            else if (v.getId() == R.id.char8)
            {
                charAt = char8.getText().toString().trim();
                sender = 8;
            }
            else if (v.getId() == R.id.char9)
            {
                charAt = char9.getText().toString().trim();
                sender = 9;
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
                sender = 12;
            }
            else if (v.getId() == R.id.char13)
            {
                charAt = char13.getText().toString().trim();
                sender = 13;
            }
            else if (v.getId() == R.id.char14)
            {
                charAt = char14.getText().toString().trim();
                sender = 14;
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
                sender = 17;
            }
            else if (v.getId() == R.id.char18)
            {
                charAt = char18.getText().toString().trim();
                sender = 18;
            }
            else if (v.getId() == R.id.char19)
            {
                charAt = char19.getText().toString().trim();
                sender = 19;
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
                sender = 22;
            }
            else if (v.getId() == R.id.char23)
            {
                charAt = char23.getText().toString().trim();
                sender = 23;
            }
            else if (v.getId() == R.id.char24)
            {
                charAt = char24.getText().toString().trim();
                sender = 24;
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
                sender = 28;
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
            if (v.getId() == R.id.char34)
            {
                charAt = char34.getText().toString().trim();
                sender = 34;
            }
            else if (v.getId() == R.id.char35)
            {
                charAt = char35.getText().toString().trim();
                sender = 35;
            }
            else if (v.getId() == R.id.char36)
            {
                charAt = char36.getText().toString().trim();
                sender = 36;
            }
            else if (v.getId() == R.id.char37)
            {
                charAt = char37.getText().toString().trim();
                sender = 37;
            }
            else if (v.getId() == R.id.char38)
            {
                charAt = char38.getText().toString().trim();
                sender = 38;
            }
            else if (v.getId() == R.id.char39)
            {
                charAt = char39.getText().toString().trim();
                sender = 39;
            }
            else if (v.getId() == R.id.char40)
            {
                charAt = char40.getText().toString().trim();
                sender = 40;
            }
            else if (v.getId() == R.id.char41)
            {
                charAt = char41.getText().toString().trim();
                sender = 41;
            }
            else if (v.getId() == R.id.char42)
            {
                charAt = char42.getText().toString().trim();
                sender = 42;
            }
            else if (v.getId() == R.id.char43)
            {
                charAt = char43.getText().toString().trim();
                sender = 43;
            }
            else if (v.getId() == R.id.char44)
            {
                charAt = char44.getText().toString().trim();
                sender = 44;
            }
            else if (v.getId() == R.id.char45)
            {
                charAt = char45.getText().toString().trim();
                sender = 45;
            }
            else if (v.getId() == R.id.char46)
            {
                charAt = char46.getText().toString().trim();
                sender = 46;
            }
            else if (v.getId() == R.id.backBT)
            {
                sender = 0;
                finish();
            }

            if (sender > 0)
            {
                switch (pos)
                {
                    case 0:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
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

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 33:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);
                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 34:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 35:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 36:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 37:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 38:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 39:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 40:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 41:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 42:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 43:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 44:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
                            {
                                pos++;
                            }
                        }
                        else
                        {
                            startSoundService(AWW_SOUND);
                        }

                        break;
                    case 45:

                        if (boardChar.equals(charAt))
                        {
                            startSoundService(CHEERS_SOUND);
                            generateRandomCharacter();
                            disable(sender);

                            if (pos < 46)
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
        else
        {
            // for mobile

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
                sender = 7;
            }
            else if (v.getId() == R.id.char8)
            {
                charAt = char8.getText().toString().trim();
                sender = 8;
            }
            else if (v.getId() == R.id.char9)
            {
                charAt = char9.getText().toString().trim();
                sender = 9;
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
                sender = 12;
            }
            else if (v.getId() == R.id.char13)
            {
                charAt = char13.getText().toString().trim();
                sender = 13;
            }
            else if (v.getId() == R.id.char14)
            {
                charAt = char14.getText().toString().trim();
                sender = 14;
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
                sender = 17;
            }
            else if (v.getId() == R.id.char18)
            {
                charAt = char18.getText().toString().trim();
                sender = 18;
            }
            else if (v.getId() == R.id.char19)
            {
                charAt = char19.getText().toString().trim();
                sender = 19;
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
                sender = 22;
            }
            else if (v.getId() == R.id.char23)
            {
                charAt = char23.getText().toString().trim();
                sender = 23;
            }
            else if (v.getId() == R.id.char24)
            {
                charAt = char24.getText().toString().trim();
                sender = 24;
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
                sender = 28;
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
            else if (v.getId() == R.id.swarAlphabets)
            {
                sender = 0;
                swarDisplay();
            }
            else if (v.getId() == R.id.varnmalaAlphabets)
            {
                sender = 0;
                varnmalaDisplay();
            }
            else if (v.getId() == R.id.backBT)
            {
                sender = 0;
                finish();
            }

            if (sender > 0)
            {

                if (swarVarnmala == SWAR)
                {
                    switch (pos)
                    {
                        case 0:

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                //generateRandomCharacter();
                                disable(sender);

                                if (pos < 13)
                                {
                                    pos++;
                                }

                                varnmalaDisplay();

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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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

                            if (boardChar.equals(charAt))
                            {
                                startSoundService(CHEERS_SOUND);
                                generateRandomCharacter();
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
    }


    public void alert()
    {
        LayoutInflater layoutInflater = LayoutInflater.from(Level4.this);
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
                if (getResources().getBoolean(R.bool.isTab))
                {
                    // for tab
                    randomNumbersForButtons();
                    generateRandomCharacter();
                    enableAll();
                }
                else
                {
                    // for mobile
                    swarDisplay();
                }

            }
        });
    }

    ;


    public void disable(int number)
    {
        if (getResources().getBoolean(R.bool.isTab))
        {
            // for tab

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
                case 34:

                    char34.setAlpha(0.5f);
                    char34.setClickable(false);

                    break;
                case 35:

                    char35.setAlpha(0.5f);
                    char35.setClickable(false);

                    break;
                case 36:

                    char36.setAlpha(0.5f);
                    char36.setClickable(false);

                    break;
                case 37:

                    char37.setAlpha(0.5f);
                    char37.setClickable(false);

                    break;
                case 38:

                    char38.setAlpha(0.5f);
                    char38.setClickable(false);

                    break;
                case 39:

                    char39.setAlpha(0.5f);
                    char39.setClickable(false);

                    break;
                case 40:

                    char40.setAlpha(0.5f);
                    char40.setClickable(false);

                    break;
                case 41:

                    char41.setAlpha(0.5f);
                    char41.setClickable(false);

                    break;
                case 42:

                    char42.setAlpha(0.5f);
                    char42.setClickable(false);

                    break;
                case 43:

                    char43.setAlpha(0.5f);
                    char43.setClickable(false);

                    break;
                case 44:

                    char44.setAlpha(0.5f);
                    char44.setClickable(false);

                    break;
                case 45:

                    char45.setAlpha(0.5f);
                    char45.setClickable(false);

                    break;
                case 46:

                    char46.setAlpha(0.5f);
                    char46.setClickable(false);

                    break;
            }
        }
        else
        {
            // for mobile

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


    public void generateRandomCharacter()
    {
        if (getResources().getBoolean(R.bool.isTab))
        {
            // for tab

            if (mCharactersList.size() > 0)
            {
                int position = randomGenerator.nextInt(mCharactersList.size());

                carAtPosition = mCharactersList.get(position);

                mCharacterTV.setText(carAtPosition);

                if (swarVarnmalaArray[0].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[0]);
                    mFruitName.setText(swarVarnmalaNamesArray[0]);
                }
                else if (swarVarnmalaArray[1].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[1]);
                    mFruitName.setText(swarVarnmalaNamesArray[1]);
                }
                else if (swarVarnmalaArray[2].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[2]);
                    mFruitName.setText(swarVarnmalaNamesArray[2]);
                }
                else if (swarVarnmalaArray[3].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[3]);
                    mFruitName.setText(swarVarnmalaNamesArray[3]);
                }
                else if (swarVarnmalaArray[4].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[4]);
                    mFruitName.setText(swarVarnmalaNamesArray[4]);
                }
                else if (swarVarnmalaArray[5].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[5]);
                    mFruitName.setText(swarVarnmalaNamesArray[5]);
                }
                else if (swarVarnmalaArray[6].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[6]);
                    mFruitName.setText(swarVarnmalaNamesArray[6]);
                }
                else if (swarVarnmalaArray[7].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[7]);
                    mFruitName.setText(swarVarnmalaNamesArray[7]);
                }
                else if (swarVarnmalaArray[8].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[8]);
                    mFruitName.setText(swarVarnmalaNamesArray[8]);
                }
                else if (swarVarnmalaArray[9].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[9]);
                    mFruitName.setText(swarVarnmalaNamesArray[9]);
                }
                else if (swarVarnmalaArray[10].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[10]);
                    mFruitName.setText(swarVarnmalaNamesArray[10]);
                }
                else if (swarVarnmalaArray[11].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[11]);
                    mFruitName.setText(swarVarnmalaNamesArray[11]);
                }
                else if (swarVarnmalaArray[12].equals(carAtPosition))
                {
                    mFruitImage.setImageBitmap(null);
                    mFruitName.setText(swarVarnmalaNamesArray[12]);
                }
                else if (swarVarnmalaArray[13].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[13]);
                    mFruitName.setText(swarVarnmalaNamesArray[13]);
                }
                else if (swarVarnmalaArray[14].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[14]);
                    mFruitName.setText(swarVarnmalaNamesArray[14]);
                }
                else if (swarVarnmalaArray[15].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[15]);
                    mFruitName.setText(swarVarnmalaNamesArray[15]);
                }
                else if (swarVarnmalaArray[16].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[16]);
                    mFruitName.setText(swarVarnmalaNamesArray[16]);
                }
                else if (swarVarnmalaArray[17].equals(carAtPosition))
                {
                    mFruitImage.setImageBitmap(null);
                    mFruitName.setText(swarVarnmalaNamesArray[17]);
                }
                else if (swarVarnmalaArray[18].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[18]);
                    mFruitName.setText(swarVarnmalaNamesArray[18]);
                }
                else if (swarVarnmalaArray[19].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[19]);
                    mFruitName.setText(swarVarnmalaNamesArray[19]);
                }
                else if (swarVarnmalaArray[20].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[20]);
                    mFruitName.setText(swarVarnmalaNamesArray[20]);
                }
                else if (swarVarnmalaArray[21].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[21]);
                    mFruitName.setText(swarVarnmalaNamesArray[21]);
                }
                else if (swarVarnmalaArray[22].equals(carAtPosition))
                {
                    mFruitImage.setImageBitmap(null);
                    mFruitName.setText(swarVarnmalaNamesArray[22]);
                }
                else if (swarVarnmalaArray[23].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[23]);
                    mFruitName.setText(swarVarnmalaNamesArray[23]);
                }
                else if (swarVarnmalaArray[24].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[24]);
                    mFruitName.setText(swarVarnmalaNamesArray[24]);

                }
                else if (swarVarnmalaArray[25].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[25]);
                    mFruitName.setText(swarVarnmalaNamesArray[25]);
                }
                else if (swarVarnmalaArray[26].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[26]);
                    mFruitName.setText(swarVarnmalaNamesArray[26]);
                }
                else if (swarVarnmalaArray[27].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[27]);
                    mFruitName.setText(swarVarnmalaNamesArray[27]);
                }
                else if (swarVarnmalaArray[28].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[28]);
                    mFruitName.setText(swarVarnmalaNamesArray[28]);
                }
                else if (swarVarnmalaArray[29].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[29]);
                    mFruitName.setText(swarVarnmalaNamesArray[29]);
                }
                else if (swarVarnmalaArray[30].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[30]);
                    mFruitName.setText(swarVarnmalaNamesArray[30]);
                }
                else if (swarVarnmalaArray[31].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[31]);
                    mFruitName.setText(swarVarnmalaNamesArray[31]);
                }
                else if (swarVarnmalaArray[32].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[32]);
                    mFruitName.setText(swarVarnmalaNamesArray[32]);
                }
                else if (swarVarnmalaArray[33].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[33]);
                    mFruitName.setText(swarVarnmalaNamesArray[33]);
                }
                else if (swarVarnmalaArray[34].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[34]);
                    mFruitName.setText(swarVarnmalaNamesArray[34]);
                }
                else if (swarVarnmalaArray[35].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[35]);
                    mFruitName.setText(swarVarnmalaNamesArray[35]);
                }
                else if (swarVarnmalaArray[36].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[36]);
                    mFruitName.setText(swarVarnmalaNamesArray[36]);
                }
                else if (swarVarnmalaArray[37].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[37]);
                    mFruitName.setText(swarVarnmalaNamesArray[37]);
                }
                else if (swarVarnmalaArray[38].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[38]);
                    mFruitName.setText(swarVarnmalaNamesArray[38]);
                }
                else if (swarVarnmalaArray[39].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[39]);
                    mFruitName.setText(swarVarnmalaNamesArray[39]);
                }
                else if (swarVarnmalaArray[40].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[40]);
                    mFruitName.setText(swarVarnmalaNamesArray[40]);
                }
                else if (swarVarnmalaArray[41].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[41]);
                    mFruitName.setText(swarVarnmalaNamesArray[41]);
                }
                else if (swarVarnmalaArray[42].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[42]);
                    mFruitName.setText(swarVarnmalaNamesArray[42]);
                }
                else if (swarVarnmalaArray[43].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[43]);
                    mFruitName.setText(swarVarnmalaNamesArray[43]);
                }
                else if (swarVarnmalaArray[44].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[44]);
                    mFruitName.setText(swarVarnmalaNamesArray[44]);
                }
                else if (swarVarnmalaArray[45].equals(carAtPosition))
                {
                    mFruitImage.setImageResource(swarVarnmalaImagesArray[45]);
                    mFruitName.setText(swarVarnmalaNamesArray[45]);
                }

                mCharactersList.remove(position);
            }
            /*else if (mCharactersList.size() == 0)
            {
                alert();
            }*/
        }
        else
        {
            // for moblie

            if (mCharactersList.size() > 0)
            {
                int position = randomGenerator.nextInt(mCharactersList.size());

                carAtPosition = mCharactersList.get(position);

                mCharacterTV.setText(carAtPosition);

                if (swarVarnmala == SWAR)
                {
                    if (swarArray[0].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[0]);
                        mFruitName.setText(swarNamesArray[0]);
                    }
                    else if (swarArray[1].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[1]);
                        mFruitName.setText(swarNamesArray[1]);
                    }
                    else if (swarArray[2].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[2]);
                        mFruitName.setText(swarNamesArray[2]);
                    }
                    else if (swarArray[3].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[3]);
                        mFruitName.setText(swarNamesArray[3]);
                    }
                    else if (swarArray[4].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[4]);
                        mFruitName.setText(swarNamesArray[4]);
                    }
                    else if (swarArray[5].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[5]);
                        mFruitName.setText(swarNamesArray[5]);
                    }
                    else if (swarArray[6].equals(carAtPosition))
                    {
                      mFruitImage.setImageResource(swarImagesArray[6]);
                        mFruitName.setText(swarNamesArray[6]);
                    }
                    else if (swarArray[7].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[7]);
                        mFruitName.setText(swarNamesArray[7]);
                    }
                    else if (swarArray[8].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[8]);
                        mFruitName.setText(swarNamesArray[8]);
                    }
                    else if (swarArray[9].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[9]);
                        mFruitName.setText(swarNamesArray[9]);
                    }
                    else if (swarArray[10].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[10]);
                        mFruitName.setText(swarNamesArray[10]);
                    }
                    else if (swarArray[11].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(swarImagesArray[11]);
                        mFruitName.setText(swarNamesArray[11]);
                    }
                    else if (swarArray[12].equals(carAtPosition))
                    {
                        mFruitImage.setImageBitmap(null);
                        mFruitName.setText(swarNamesArray[12]);
                    }
                }
                else
                {
                    if (varnmalaArray[0].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[0]);
                        mFruitName.setText(varnmalaNamesArray[0]);
                    }
                    else if (varnmalaArray[1].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[1]);
                        mFruitName.setText(varnmalaNamesArray[1]);
                    }
                    else if (varnmalaArray[2].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[2]);
                        mFruitName.setText(varnmalaNamesArray[2]);
                    }
                    else if (varnmalaArray[3].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[3]);
                        mFruitName.setText(varnmalaNamesArray[3]);
                    }
                    else if (varnmalaArray[4].equals(carAtPosition))
                    {
                        mFruitImage.setImageBitmap(null);
                        mFruitName.setText(varnmalaNamesArray[4]);
                    }
                    else if (varnmalaArray[5].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[5]);
                        mFruitName.setText(varnmalaNamesArray[5]);
                    }
                    else if (varnmalaArray[6].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[6]);
                        mFruitName.setText(varnmalaNamesArray[6]);
                    }
                    else if (varnmalaArray[7].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[7]);
                        mFruitName.setText(varnmalaNamesArray[7]);
                    }
                    else if (varnmalaArray[8].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[8]);
                        mFruitName.setText(varnmalaNamesArray[8]);
                    }
                    else if (varnmalaArray[9].equals(carAtPosition))
                    {
                        mFruitImage.setImageBitmap(null);
                        mFruitName.setText(varnmalaNamesArray[9]);
                    }
                    else if (varnmalaArray[10].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[10]);
                        mFruitName.setText(varnmalaNamesArray[10]);
                    }
                    else if (varnmalaArray[11].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[11]);
                        mFruitName.setText(varnmalaNamesArray[11]);
                    }
                    else if (varnmalaArray[12].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[12]);
                        mFruitName.setText(varnmalaNamesArray[12]);
                    }
                    else if (varnmalaArray[13].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[13]);
                        mFruitName.setText(varnmalaNamesArray[13]);
                    }
                    else if (varnmalaArray[14].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[14]);
                        mFruitName.setText(varnmalaNamesArray[14]);
                    }
                    else if (varnmalaArray[15].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[15]);
                        mFruitName.setText(varnmalaNamesArray[15]);
                    }
                    else if (varnmalaArray[16].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[16]);
                        mFruitName.setText(varnmalaNamesArray[16]);
                    }
                    else if (varnmalaArray[17].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[17]);
                        mFruitName.setText(varnmalaNamesArray[17]);
                    }
                    else if (varnmalaArray[18].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[18]);
                        mFruitName.setText(varnmalaNamesArray[18]);
                    }
                    else if (varnmalaArray[19].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[19]);
                        mFruitName.setText(varnmalaNamesArray[19]);
                    }
                    else if (varnmalaArray[20].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[20]);
                        mFruitName.setText(varnmalaNamesArray[20]);
                    }
                    else if (varnmalaArray[21].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[21]);
                        mFruitName.setText(varnmalaNamesArray[21]);
                    }
                    else if (varnmalaArray[22].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[22]);
                        mFruitName.setText(varnmalaNamesArray[22]);
                    }
                    else if (varnmalaArray[23].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[23]);
                        mFruitName.setText(varnmalaNamesArray[23]);
                    }
                    else if (varnmalaArray[24].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[24]);
                        mFruitName.setText(varnmalaNamesArray[24]);
                    }
                    else if (varnmalaArray[25].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[25]);
                        mFruitName.setText(varnmalaNamesArray[25]);
                    }
                    else if (varnmalaArray[26].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[26]);
                        mFruitName.setText(varnmalaNamesArray[26]);
                    }
                    else if (varnmalaArray[27].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[27]);
                        mFruitName.setText(varnmalaNamesArray[27]);
                    }
                    else if (varnmalaArray[28].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[28]);
                        mFruitName.setText(varnmalaNamesArray[28]);
                    }
                    else if (varnmalaArray[29].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[29]);
                        mFruitName.setText(varnmalaNamesArray[29]);
                    }
                    else if (varnmalaArray[30].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[30]);
                        mFruitName.setText(varnmalaNamesArray[30]);
                    }
                    else if (varnmalaArray[31].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[31]);
                        mFruitName.setText(varnmalaNamesArray[31]);
                    }
                    else if (varnmalaArray[32].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[32]);
                        mFruitName.setText(varnmalaNamesArray[32]);
                    }
                    else if (varnmalaArray[33].equals(carAtPosition))
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[33]);
                        mFruitName.setText(varnmalaNamesArray[33]);
                    }
                }

                mCharactersList.remove(position);
            }
            /*else if (mCharactersList.size() == 0)
            {
                alert();
            }*/

        }

    }

    public void startSoundService(final int soundToPlay)
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(Level4.this, SoundService.class);
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
                stopService(new Intent(Level4.this, SoundService.class));
            }
        }).start();

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        stopSoundService();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        stopSoundService();
    }

    public void randomNumbersForButtons()
    {
        randomGenerator = new Random();

        mCharactersList = new ArrayList<>();

        mCharactersList.addAll(Arrays.asList(swarVarnmalaArray));

        mList = new ArrayList<>();

        mList.addAll(Arrays.asList(swarVarnmalaArray));

        int id = 0;

        do
        {
            int position = randomGenerator.nextInt(mList.size());

            String carAtPosition = mList.get(position);

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
                case 33:
                    char34.setText(carAtPosition);
                    break;
                case 34:
                    char35.setText(carAtPosition);
                    break;
                case 35:
                    char36.setText(carAtPosition);
                    break;
                case 36:
                    char37.setText(carAtPosition);
                    break;
                case 37:
                    char38.setText(carAtPosition);
                    break;
                case 38:
                    char39.setText(carAtPosition);
                    break;
                case 39:
                    char40.setText(carAtPosition);
                    break;
                case 40:
                    char41.setText(carAtPosition);
                    break;
                case 41:
                    char42.setText(carAtPosition);
                    break;
                case 42:
                    char43.setText(carAtPosition);
                    break;
                case 43:
                    char44.setText(carAtPosition);
                    break;
                case 44:
                    char45.setText(carAtPosition);
                    break;
                case 45:
                    char46.setText(carAtPosition);
                    break;

            }

            id++;

            mList.remove(position);

        } while (mList.size() > 0);

        pos = 0;
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

        if (getResources().getBoolean(R.bool.isTab))
        {
            // for tab

            char34.setAlpha(1.0f);
            char34.setClickable(true);

            char35.setAlpha(1.0f);
            char35.setClickable(true);

            char36.setAlpha(1.0f);
            char36.setClickable(true);

            char37.setAlpha(1.0f);
            char37.setClickable(true);

            char38.setAlpha(1.0f);
            char38.setClickable(true);

            char39.setAlpha(1.0f);
            char39.setClickable(true);

            char40.setAlpha(1.0f);
            char40.setClickable(true);

            char41.setAlpha(1.0f);
            char41.setClickable(true);

            char42.setAlpha(1.0f);
            char42.setClickable(true);

            char43.setAlpha(1.0f);
            char43.setClickable(true);

            char44.setAlpha(1.0f);
            char44.setClickable(true);

            char45.setAlpha(1.0f);
            char45.setClickable(true);

            char46.setAlpha(1.0f);
            char46.setClickable(true);
        }


    }
}
