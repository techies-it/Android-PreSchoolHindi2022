package it.techies.preschoolhindi.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.techies.preschoolhindi.R;
import it.techies.preschoolhindi.base.BaseActivity;
import it.techies.preschoolhindi.util.DrawingView;

public class Level2 extends BaseActivity implements View.OnClickListener
{
    private int currentApiVersion;

    DrawingView drawingView;

    private Paint mPaint;

    private boolean mBtnEnable = true;

    @Bind(R.id.contentLayoutGameLevel2)
    RelativeLayout mContentLayoutGameLevel2;

    @Bind(R.id.dusterIB)
    ImageButton mDuster;

    @Bind(R.id.chalkIB)
    ImageButton mChalk;

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

    @Bind(R.id.backBT)
    ImageButton mBack;

    @Bind(R.id.swarAlphabetsText)
    TextView mSwarAlphabetsText;

    @Bind(R.id.varnmalaAlphabetsText)
    TextView mVarnmalaAlphabetsText;

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

    Animation animation270Sec, animation330Sec, animation390Sec, rotation;

    String[] varnmalaNamesArray, swarNamessArray;
    int[] varnmalaImagesArray, swarImagesArray;

    String[] swarArray, varnmalaArray;

    int SWAR = 1, VARNMALA = 2, swarVarnmala;

    TextView char4, char5, char6, char7, char8, char9, char10, char11, char12, char13, char14, char15,
            char16, char17, char18, char19, char20, char21, char22, char23, char24, char25, char26,
            char27, char28, char29, char30, char31, char32, char33;

    ImageButton mPrevious, mNext;

    @Bind(R.id.swarAlphabets)
    View mSwarAlphabets;

    @Bind(R.id.varnmalaAlphabets)
    View mVarnmalaAlphabets;


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
        setContentView(R.layout.activity_level2);

        ButterKnife.bind(this);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/lohit_devanagari.ttf");

        mCharacterTV.setTypeface(typeface);
        mFruitName.setTypeface(typeface);
        mSwarAlphabetsText.setTypeface(typeface);
        mVarnmalaAlphabetsText.setTypeface(typeface);
        mSmallBoardLabel.setTypeface(typeface);
        char1.setTypeface(typeface);
        char2.setTypeface(typeface);
        char3.setTypeface(typeface);

        swarArray = new String[]{"अ", "आ", "इ", "ई", "उ", "ऊ", "ऋ", "ए", "ऐ", "ओ", "औ", "अं", "अः"};

        varnmalaArray = new String[]{"क", "ख", "ग", "घ", "ङ", "च", "छ", "ज", "झ", "ञ", "ट", "ठ", "ड", "ढ", "ण", "त", "थ", "द", "ध", "न", "प", "फ", "ब", "भ", "म", "य", "र", "ल", "व", "श", "ष", "स", "ह"};

        swarNamessArray = new String[]{"अनार", "आम", "इमारत", "ईख", "उल्लू", "ऊन", "ॠषि", "एड़ी", "ऐनक", "ओखली", "औरत", "अंगूर", ""};

        varnmalaNamesArray = new String[]{"कमल", "खरगोश", "गाय", "घड़ी", "", "चम्मच", "छतरी", "जहाज", "झाड़ू", "", "टमाटर", "ठेला", "डमरू", "ढोल", "बाण", "तरबूज", "थरमस", "दवात", "धनुष", "नल", "पतंग", "फल", "बत्तख", "भालू", "मछली", "योग", "रेल", "लट्टू", "वृक्ष", "शंख", "षट्कोण", "सेब", "हाथी"};

        char1.setOnClickListener(this);
        char2.setOnClickListener(this);
        char3.setOnClickListener(this);
        mChalk.setOnClickListener(this);
        mDuster.setOnClickListener(this);
        mBack.setOnClickListener(this);
        mSwarAlphabets.setOnClickListener(this);
        mVarnmalaAlphabets.setOnClickListener(this);

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

            swarImagesArray = new int[]{R.drawable.pomegranate_600, R.drawable.mango_600, R.drawable.building_600, R.drawable.reed_600, R.drawable.owl_600,
                    R.drawable.wool_600, R.drawable.shadi_600, R.drawable.heel_600, R.drawable.specs_600, R.drawable.mortar_600,
                    R.drawable.ladies_600, R.drawable.grapes_600, 0};

            varnmalaImagesArray = new int[]{R.drawable.lotus_600, R.drawable.rabbit_600, R.drawable.cow_600, R.drawable.watch_600, 0, R.drawable.spoon_600, R.drawable.umbrella_600,
                    R.drawable.ship_600, R.drawable.broom_600, 0, R.drawable.tomato_600, R.drawable.jamming_600, R.drawable.cornets_600, R.drawable.drum_600,
                    R.drawable.arrow_600, R.drawable.watermelon_600, R.drawable.thermos_600, R.drawable.ink_600, R.drawable.bow_600, R.drawable.tap_600,
                    R.drawable.kite_600, R.drawable.fruit_600, R.drawable.duck_600, R.drawable.bear_600, R.drawable.fish_600, R.drawable.yoga_600, R.drawable.train_600,
                    R.drawable.topspin_600, R.drawable.tree_600, R.drawable.shell_600, R.drawable.hexagonal_600, R.drawable.apple_600, R.drawable.elephant_600};

            char4 = (TextView) findViewById(R.id.char4);
            char5 = (TextView) findViewById(R.id.char5);
            char6 = (TextView) findViewById(R.id.char6);
            char7 = (TextView) findViewById(R.id.char7);
            char8 = (TextView) findViewById(R.id.char8);
            char9 = (TextView) findViewById(R.id.char9);
            char10 = (TextView) findViewById(R.id.char10);
            char11 = (TextView) findViewById(R.id.char11);
            char12 = (TextView) findViewById(R.id.char12);
            char13 = (TextView) findViewById(R.id.char13);
            char14 = (TextView) findViewById(R.id.char14);
            char15 = (TextView) findViewById(R.id.char15);
            char16 = (TextView) findViewById(R.id.char16);
            char17 = (TextView) findViewById(R.id.char17);
            char18 = (TextView) findViewById(R.id.char18);
            char19 = (TextView) findViewById(R.id.char19);
            char20 = (TextView) findViewById(R.id.char20);
            char21 = (TextView) findViewById(R.id.char21);
            char22 = (TextView) findViewById(R.id.char22);
            char23 = (TextView) findViewById(R.id.char23);
            char24 = (TextView) findViewById(R.id.char24);
            char25 = (TextView) findViewById(R.id.char25);
            char26 = (TextView) findViewById(R.id.char26);
            char27 = (TextView) findViewById(R.id.char27);
            char28 = (TextView) findViewById(R.id.char28);
            char29 = (TextView) findViewById(R.id.char29);
            char30 = (TextView) findViewById(R.id.char30);
            char31 = (TextView) findViewById(R.id.char31);
            char32 = (TextView) findViewById(R.id.char32);
            char33 = (TextView) findViewById(R.id.char33);

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

        }
        else
        {
            // for mobile

            rotation = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.rotation_320);

            mSunRays.startAnimation(rotation);

            swarImagesArray = new int[]{R.drawable.pomegranate_320, R.drawable.mango_320, R.drawable.building_320, R.drawable.reed_320, R.drawable.owl_320,
                    R.drawable.wool_320, R.drawable.shadi_320, R.drawable.heel_320, R.drawable.specs_320, R.drawable.mortar_320,
                    R.drawable.ladies_320, R.drawable.grapes_320, 0};

            varnmalaImagesArray = new int[]{R.drawable.lotus_320, R.drawable.rabbit_320, R.drawable.cow_320, R.drawable.watch_320, 0, R.drawable.spoon_320, R.drawable.umbrella_320,
                    R.drawable.ship_320, R.drawable.broom_320, 0, R.drawable.tomato_320, R.drawable.jamming_320, R.drawable.cornets_320, R.drawable.drum_320,
                    R.drawable.arrow_320, R.drawable.watermelon_320, R.drawable.thermos_320, R.drawable.ink_320, R.drawable.bow_320, R.drawable.tap_320,
                    R.drawable.kite_320, R.drawable.fruit_320, R.drawable.duck_320, R.drawable.bear_320, R.drawable.fish_320, R.drawable.yoga_320, R.drawable.train_320,
                    R.drawable.topspin_320, R.drawable.tree_320, R.drawable.shell_320, R.drawable.hexagonal_320, R.drawable.apple_320, R.drawable.elephant_320};

            mPrevious = (ImageButton) findViewById(R.id.btPrevious);
            mNext = (ImageButton) findViewById(R.id.btNext);

            mPrevious.setEnabled(false);
            mPrevious.setClickable(false);
            mPrevious.setAlpha(0.5f);

            mPrevious.setOnClickListener(this);
            mNext.setOnClickListener(this);

        }

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        brushSize(Level2.this, mPaint);

        drawingView = new DrawingView(this, mPaint);
        drawingView.setBackgroundColor(Color.TRANSPARENT);
        drawingView.setButtonEnableListener(new DrawingView.BtnEnableListener()
        {
            @Override
            public void enableButton(boolean enable)
            {
                mBtnEnable = enable;
            }
        });
        mContentLayoutGameLevel2.addView(drawingView);

        // to display swar
        swarDisplay();


    }

    public void swarDisplay()
    {
        swarVarnmala = SWAR;
        mCharacterTV.setText(swarArray[0]);
        mSmallBoardLabel.setText("Vowels (स्वर)");
        mFruitName.setText(swarNamessArray[0]);
        mFruitImage.setImageResource(swarImagesArray[0]);

        if (getResources().getBoolean(R.bool.isTab))
        {
            // for tab

            char1.setText(swarArray[0]);
            char2.setText(swarArray[1]);
            char3.setText(swarArray[2]);
            char4.setText(swarArray[3]);
            char5.setText(swarArray[4]);
            char6.setText(swarArray[5]);
            char7.setText(swarArray[6]);
            char8.setText(swarArray[7]);
            char9.setText(swarArray[8]);
            char10.setText(swarArray[9]);
            char11.setText(swarArray[10]);
            char12.setText(swarArray[11]);
            char13.setText(swarArray[12]);

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
            char14.setVisibility(View.GONE);
            char15.setVisibility(View.GONE);
            char16.setVisibility(View.GONE);
            char17.setVisibility(View.GONE);
            char18.setVisibility(View.INVISIBLE);
            char19.setVisibility(View.INVISIBLE);
            char20.setVisibility(View.INVISIBLE);
            char21.setVisibility(View.INVISIBLE);
            char22.setVisibility(View.INVISIBLE);
            char23.setVisibility(View.INVISIBLE);
            char24.setVisibility(View.INVISIBLE);
            char25.setVisibility(View.INVISIBLE);
            char26.setVisibility(View.INVISIBLE);
            char27.setVisibility(View.INVISIBLE);
            char28.setVisibility(View.INVISIBLE);
            char29.setVisibility(View.INVISIBLE);
            char30.setVisibility(View.INVISIBLE);
            char31.setVisibility(View.INVISIBLE);
            char32.setVisibility(View.INVISIBLE);
            char33.setVisibility(View.INVISIBLE);
        }
        else
        {
            // for mobile

            char1.setVisibility(View.VISIBLE);
            char2.setVisibility(View.VISIBLE);
            char3.setVisibility(View.VISIBLE);

            mNext.setEnabled(true);
            mNext.setClickable(true);
            mNext.setAlpha(1.0f);

            mPrevious.setEnabled(false);
            mPrevious.setClickable(false);
            mPrevious.setAlpha(0.5f);

            char1.setText(swarArray[0]);
            char2.setText(swarArray[1]);
            char3.setText(swarArray[2]);
        }
    }

    public void varnmalaDisplay()
    {

        swarVarnmala = VARNMALA;
        mCharacterTV.setText(varnmalaArray[0]);
        mSmallBoardLabel.setText("Consonants (व्यंजन)");
        mFruitName.setText(varnmalaNamesArray[0]);
        mFruitImage.setImageResource(varnmalaImagesArray[0]);

        if (getResources().getBoolean(R.bool.isTab))
        {
            // for tab

            char1.setText(varnmalaArray[0]);
            char2.setText(varnmalaArray[1]);
            char3.setText(varnmalaArray[2]);
            char4.setText(varnmalaArray[3]);
            char5.setText(varnmalaArray[4]);
            char6.setText(varnmalaArray[5]);
            char7.setText(varnmalaArray[6]);
            char8.setText(varnmalaArray[7]);
            char9.setText(varnmalaArray[8]);
            char10.setText(varnmalaArray[9]);
            char11.setText(varnmalaArray[10]);
            char12.setText(varnmalaArray[11]);
            char13.setText(varnmalaArray[12]);
            char14.setText(varnmalaArray[13]);
            char15.setText(varnmalaArray[14]);
            char16.setText(varnmalaArray[15]);
            char17.setText(varnmalaArray[16]);
            char18.setText(varnmalaArray[17]);
            char19.setText(varnmalaArray[18]);
            char20.setText(varnmalaArray[19]);
            char21.setText(varnmalaArray[20]);
            char22.setText(varnmalaArray[21]);
            char23.setText(varnmalaArray[22]);
            char24.setText(varnmalaArray[23]);
            char25.setText(varnmalaArray[24]);
            char26.setText(varnmalaArray[25]);
            char27.setText(varnmalaArray[26]);
            char28.setText(varnmalaArray[27]);
            char29.setText(varnmalaArray[28]);
            char30.setText(varnmalaArray[29]);
            char31.setText(varnmalaArray[30]);
            char32.setText(varnmalaArray[31]);
            char33.setText(varnmalaArray[32]);

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
        }
        else
        {
            // for mobile
            char1.setVisibility(View.VISIBLE);
            char2.setVisibility(View.VISIBLE);
            char3.setVisibility(View.VISIBLE);

            mNext.setEnabled(true);
            mNext.setClickable(true);
            mNext.setAlpha(1.0f);

            mPrevious.setEnabled(false);
            mPrevious.setClickable(false);
            mPrevious.setAlpha(0.5f);

            char1.setText(varnmalaArray[0]);
            char2.setText(varnmalaArray[1]);
            char3.setText(varnmalaArray[2]);

        }
    }

    @Override
    public void onClick(View v)
    {
        if (mBtnEnable)
        {
            mPaint.setXfermode(null);
            mPaint.setAlpha(0xFF);

            if (getResources().getBoolean(R.bool.isTab))
            {
                // for tab

                if (v.getId() == R.id.char1)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char1.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[0]);
                        mFruitName.setText(varnmalaNamesArray[0]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[0]);
                        mFruitName.setText(swarNamessArray[0]);
                    }
                }
                else if (v.getId() == R.id.char2)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char2.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[1]);
                        mFruitName.setText(varnmalaNamesArray[1]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[1]);
                        mFruitName.setText(swarNamessArray[1]);
                    }
                }
                else if (v.getId() == R.id.char3)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char3.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[2]);
                        mFruitName.setText(varnmalaNamesArray[2]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[2]);
                        mFruitName.setText(swarNamessArray[2]);
                    }
                }
                else if (v.getId() == R.id.char4)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char4.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[3]);
                        mFruitName.setText(varnmalaNamesArray[3]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[3]);
                        mFruitName.setText(swarNamessArray[3]);
                    }
                }
                else if (v.getId() == R.id.char5)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char5.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[4]);
                        mFruitName.setText(varnmalaNamesArray[4]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[4]);
                        mFruitName.setText(swarNamessArray[4]);
                    }
                }
                else if (v.getId() == R.id.char6)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char6.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[5]);
                        mFruitName.setText(varnmalaNamesArray[5]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[5]);
                        mFruitName.setText(swarNamessArray[5]);
                    }
                }
                else if (v.getId() == R.id.char7)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char7.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[6]);
                        mFruitName.setText(varnmalaNamesArray[6]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[6]);
                        mFruitName.setText(swarNamessArray[6]);
                    }
                }
                else if (v.getId() == R.id.char8)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char8.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[7]);
                        mFruitName.setText(varnmalaNamesArray[7]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[7]);
                        mFruitName.setText(swarNamessArray[7]);
                    }
                }
                else if (v.getId() == R.id.char9)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char9.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[8]);
                        mFruitName.setText(varnmalaNamesArray[8]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[8]);
                        mFruitName.setText(swarNamessArray[8]);
                    }
                }
                else if (v.getId() == R.id.char10)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char10.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageBitmap(null);
                        mFruitName.setText(varnmalaNamesArray[9]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[9]);
                        mFruitName.setText(swarNamessArray[9]);
                    }
                }
                else if (v.getId() == R.id.char11)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char11.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[10]);
                        mFruitName.setText(varnmalaNamesArray[10]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[10]);
                        mFruitName.setText(swarNamessArray[10]);
                    }
                }
                else if (v.getId() == R.id.char12)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char12.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[11]);
                        mFruitName.setText(varnmalaNamesArray[11]);
                    }
                    else
                    {
                        mFruitImage.setImageResource(swarImagesArray[11]);
                        mFruitName.setText(swarNamessArray[11]);
                    }
                }
                else if (v.getId() == R.id.char13)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char13.getText().toString().trim());
                    if (swarVarnmala == VARNMALA)
                    {
                        mFruitImage.setImageResource(varnmalaImagesArray[12]);
                        mFruitName.setText(varnmalaNamesArray[12]);
                    }
                    else
                    {
                        mFruitImage.setImageBitmap(null);
                        mFruitName.setText(swarNamessArray[12]);
                    }
                }
                else if (v.getId() == R.id.char14)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char14.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[13]);
                    mFruitName.setText(varnmalaNamesArray[13]);
                }
                else if (v.getId() == R.id.char15)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char15.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[14]);
                    mFruitName.setText(varnmalaNamesArray[14]);
                }
                else if (v.getId() == R.id.char16)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char16.getText().toString().trim());
                    mFruitImage.setImageResource(R.drawable.pomegranate_600);
                    mFruitName.setText(varnmalaNamesArray[15]);
                }
                else if (v.getId() == R.id.char17)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    mPaint.setStrokeWidth(12);
                    mCharacterTV.setText(char17.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[16]);
                    mFruitName.setText(varnmalaNamesArray[16]);
                }
                else if (v.getId() == R.id.char18)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char18.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[17]);
                    mFruitName.setText(varnmalaNamesArray[17]);
                }
                else if (v.getId() == R.id.char19)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char19.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[18]);
                    mFruitName.setText(varnmalaNamesArray[18]);
                }
                else if (v.getId() == R.id.char20)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char20.getText().toString().trim());
                    mFruitImage.setImageResource(R.drawable.tomato_600);
                    mFruitName.setText(varnmalaNamesArray[19]);
                }
                else if (v.getId() == R.id.char21)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char21.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[20]);
                    mFruitName.setText(varnmalaNamesArray[20]);
                }
                else if (v.getId() == R.id.char22)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char22.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[21]);
                    mFruitName.setText(varnmalaNamesArray[21]);
                }
                else if (v.getId() == R.id.char23)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char23.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[22]);
                    mFruitName.setText(varnmalaNamesArray[22]);
                }
                else if (v.getId() == R.id.char24)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char24.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[23]);
                    mFruitName.setText(varnmalaNamesArray[23]);
                }
                else if (v.getId() == R.id.char25)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char25.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[24]);
                    mFruitName.setText(varnmalaNamesArray[24]);

                }
                else if (v.getId() == R.id.char26)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char26.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[25]);
                    mFruitName.setText(varnmalaNamesArray[25]);
                }
                else if (v.getId() == R.id.char27)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char27.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[26]);
                    mFruitName.setText(varnmalaNamesArray[26]);
                }
                else if (v.getId() == R.id.char28)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char28.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[27]);
                    mFruitName.setText(varnmalaNamesArray[27]);
                }
                else if (v.getId() == R.id.char29)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char29.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[28]);
                    mFruitName.setText(varnmalaNamesArray[28]);
                }
                else if (v.getId() == R.id.char30)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char30.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[29]);
                    mFruitName.setText(varnmalaNamesArray[29]);
                }
                else if (v.getId() == R.id.char31)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char31.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[30]);
                    mFruitName.setText(varnmalaNamesArray[30]);
                }
                else if (v.getId() == R.id.char32)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char32.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[31]);
                    mFruitName.setText(varnmalaNamesArray[31]);

                }
                else if (v.getId() == R.id.char33)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    mCharacterTV.setText(char33.getText().toString().trim());
                    mFruitImage.setImageResource(varnmalaImagesArray[32]);
                    mFruitName.setText(varnmalaNamesArray[32]);
                }
                else if (v.getId() == R.id.dusterIB)
                {
                    mPaint.setStrokeWidth(40);
                    mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                else if (v.getId() == R.id.chalkIB)
                {
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                }
                else if (v.getId() == R.id.backBT)
                {
                    finish();
                }
                else if (v.getId() == R.id.swarAlphabets)
                {
                    mPaint.setXfermode(null);

                    mPaint.setAlpha(0xFF);

                    if (drawingView != null)
                    {
                        drawingView.startNew();
                    }

                    swarDisplay();
                }
                else if (v.getId() == R.id.varnmalaAlphabets)
                {
                    mPaint.setXfermode(null);

                    mPaint.setAlpha(0xFF);

                    if (drawingView != null)
                    {
                        drawingView.startNew();
                    }

                    varnmalaDisplay();
                }
            }
            else
            {
                // for mobile
                if (v.getId() == R.id.char1)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    String charAt1 = char1.getText().toString().trim();

                    if (swarVarnmala == VARNMALA)
                    {
                        int position = Arrays.asList(varnmalaArray).indexOf(charAt1);
                        mCharacterTV.setText(varnmalaArray[position]);
                        mFruitImage.setImageResource(varnmalaImagesArray[position]);
                        mFruitName.setText(varnmalaNamesArray[position]);
                    }
                    else
                    {
                        int position = Arrays.asList(swarArray).indexOf(charAt1);
                        mCharacterTV.setText(swarArray[position]);
                        mFruitImage.setImageResource(swarImagesArray[position]);
                        mFruitName.setText(swarNamessArray[position]);
                    }

                }
                else if (v.getId() == R.id.char2)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    String charAt1 = char2.getText().toString().trim();

                    if (swarVarnmala == VARNMALA)
                    {
                        int position = Arrays.asList(varnmalaArray).indexOf(charAt1);
                        mCharacterTV.setText(varnmalaArray[position]);
                        mFruitImage.setImageResource(varnmalaImagesArray[position]);
                        mFruitName.setText(varnmalaNamesArray[position]);
                    }
                    else
                    {
                        int position = Arrays.asList(swarArray).indexOf(charAt1);
                        mCharacterTV.setText(swarArray[position]);
                        mFruitImage.setImageResource(swarImagesArray[position]);
                        mFruitName.setText(swarNamessArray[position]);
                    }

                }
                else if (v.getId() == R.id.char3)
                {
                    drawingView.startNew();
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                    String charAt1 = char3.getText().toString().trim();

                    if (swarVarnmala == VARNMALA)
                    {
                        int position = Arrays.asList(varnmalaArray).indexOf(charAt1);
                        mCharacterTV.setText(varnmalaArray[position]);
                        mFruitImage.setImageResource(varnmalaImagesArray[position]);
                        mFruitName.setText(varnmalaNamesArray[position]);
                    }
                    else
                    {
                        int position = Arrays.asList(swarArray).indexOf(charAt1);
                        mCharacterTV.setText(swarArray[position]);
                        mFruitImage.setImageResource(swarImagesArray[position]);
                        mFruitName.setText(swarNamessArray[position]);
                    }

                }
                else if (v.getId() == R.id.btNext)
                {
                    drawingView.startNew();
                    brushSize(Level2.this, mPaint);

                    mPrevious.setEnabled(true);
                    mPrevious.setClickable(true);
                    mPrevious.setAlpha(1.0f);

                    String charAt1 = char1.getText().toString().trim();

                    if (swarVarnmala == VARNMALA)
                    {
                        int position = Arrays.asList(varnmalaArray).indexOf(charAt1);

                        if (position == 30)
                        {
                            mNext.setEnabled(false);
                            mNext.setClickable(false);
                            mNext.setAlpha(0.5f);

                            char1.setText(varnmalaArray[30]);
                            char2.setText(varnmalaArray[31]);
                            char3.setText(varnmalaArray[32]);
                            mCharacterTV.setText(varnmalaArray[30]);
                            mFruitImage.setImageResource(varnmalaImagesArray[30]);
                            mFruitName.setText(varnmalaNamesArray[30]);
                        }
                        else if (position >= 0 && position < 30)
                        {
                            char1.setText(varnmalaArray[position + 3]);
                            char2.setText(varnmalaArray[position + 4]);
                            char3.setText(varnmalaArray[position + 5]);
                            mCharacterTV.setText(varnmalaArray[position + 3]);
                            mFruitImage.setImageResource(varnmalaImagesArray[position + 3]);
                            mFruitName.setText(varnmalaNamesArray[position + 3]);
                        }
                    }
                    else
                    {
                        int position = Arrays.asList(swarArray).indexOf(charAt1);

                        if (position == 9)
                        {
                            mNext.setEnabled(false);
                            mNext.setClickable(false);
                            mNext.setAlpha(0.5f);

                            char1.setVisibility(View.INVISIBLE);
                            char2.setText(swarArray[12]);
                            char3.setVisibility(View.INVISIBLE);
                            mCharacterTV.setText(swarArray[12]);
                            mFruitImage.setImageResource(swarImagesArray[12]);
                            mFruitName.setText(swarNamessArray[12]);
                        }
                        else if (position >= 0 && position < 9)
                        {
                            char1.setText(swarArray[position + 3]);
                            char2.setText(swarArray[position + 4]);
                            char3.setText(swarArray[position + 5]);
                            mCharacterTV.setText(swarArray[position + 3]);
                            mFruitImage.setImageResource(swarImagesArray[position + 3]);
                            mFruitName.setText(swarNamessArray[position + 3]);
                        }
                    }

                }
                else if (v.getId() == R.id.btPrevious)
                {
                    drawingView.startNew();
                    brushSize(Level2.this, mPaint);

                    mNext.setEnabled(true);
                    mNext.setClickable(true);
                    mNext.setAlpha(1.0f);

                    String charAt1 = char1.getText().toString().trim();

                    if (swarVarnmala == VARNMALA)
                    {
                        int position = Arrays.asList(varnmalaArray).indexOf(charAt1);

                        if (position == 3)
                        {
                            mPrevious.setEnabled(false);
                            mPrevious.setClickable(false);
                            mPrevious.setAlpha(0.5f);

                            char1.setText(varnmalaArray[0]);
                            char2.setText(varnmalaArray[1]);
                            char3.setText(varnmalaArray[2]);
                            mCharacterTV.setText(varnmalaArray[0]);
                            mFruitImage.setImageResource(varnmalaImagesArray[0]);
                            mFruitName.setText(varnmalaNamesArray[0]);
                        }
                        else if (position > 0 && position < 32)
                        {
                            char1.setText(varnmalaArray[position - 3]);
                            char2.setText(varnmalaArray[position - 4]);
                            char3.setText(varnmalaArray[position - 5]);
                            mCharacterTV.setText(varnmalaArray[position - 3]);
                            mFruitImage.setImageResource(varnmalaImagesArray[position - 3]);
                            mFruitName.setText(varnmalaNamesArray[position - 3]);
                        }
                    }
                    else
                    {
                        int position = Arrays.asList(swarArray).indexOf(charAt1);

                        if (position == 3)
                        {
                            mPrevious.setEnabled(false);
                            mPrevious.setClickable(false);
                            mPrevious.setAlpha(0.5f);

                            char1.setText(swarArray[0]);
                            char2.setText(swarArray[1]);
                            char3.setText(swarArray[2]);
                            mCharacterTV.setText(swarArray[0]);
                            mFruitImage.setImageResource(swarImagesArray[0]);
                            mFruitName.setText(swarNamessArray[0]);
                        }
                        else if (position > 0 && position < 12)
                        {
                            char1.setVisibility(View.VISIBLE);
                            char3.setVisibility(View.VISIBLE);

                            char1.setText(swarArray[position - 3]);
                            char2.setText(swarArray[position - 4]);
                            char3.setText(swarArray[position - 5]);
                            mCharacterTV.setText(swarArray[position - 3]);
                            mFruitImage.setImageResource(swarImagesArray[position - 3]);
                            mFruitName.setText(swarNamessArray[position - 3]);
                        }
                    }
                }
                else if (v.getId() == R.id.dusterIB)
                {
                    mPaint.setStrokeWidth(40);
                    mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                else if (v.getId() == R.id.chalkIB)
                {
                    mPaint.setColor(Color.WHITE);
                    brushSize(Level2.this, mPaint);
                }
                else if (v.getId() == R.id.backBT)
                {
                    finish();
                }
                else if (v.getId() == R.id.swarAlphabets)
                {
                    mPaint.setXfermode(null);

                    mPaint.setAlpha(0xFF);

                    if (drawingView != null)
                    {
                        drawingView.startNew();
                    }

                    swarDisplay();
                }
                else if (v.getId() == R.id.varnmalaAlphabets)
                {
                    mPaint.setXfermode(null);

                    mPaint.setAlpha(0xFF);

                    if (drawingView != null)
                    {
                        drawingView.startNew();
                    }

                    varnmalaDisplay();
                }

            }
        }
    }


    public static void brushSize(Context context, Paint mPaint)
    {
        mPaint.setColor(Color.WHITE);

        if (context.getResources().getBoolean(R.bool.isTab))
        {
            mPaint.setStrokeWidth(12);
        }
        else
        {
            mPaint.setStrokeWidth(24);
        }

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
}
