package it.techies.preschoolhindi.ui

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import it.techies.preschoolhindi.R
import it.techies.preschoolhindi.databinding.ActivityLevel4Binding
import it.techies.preschoolhindi.services.SoundService
import java.util.*

class Level4 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityLevel4Binding
    var view: View?=null

    private var carAtPosition: String? = null
    var CHEERS_SOUND = 1
    var AWW_SOUND = 2
    private var mList: ArrayList<String>? = null
    private var mCharactersList: ArrayList<String>? = null
    private var randomGenerator: Random? = null
    var animation270Sec: Animation? = null
    var animation330Sec: Animation? = null
    var animation390Sec: Animation? = null
    var rotation: Animation? = null
    lateinit var varnmalaNamesArray: Array<String>
    lateinit var swarNamesArray: Array<String>
    lateinit var varnmalaImagesArray: IntArray
    lateinit var swarImagesArray: IntArray
    lateinit var swarArray: Array<String>
    lateinit var varnmalaArray: Array<String>
    lateinit var swarVarnmalaArray: Array<String>
    lateinit var swarVarnmalaNamesArray: Array<String>
    lateinit var swarVarnmalaImagesArray: IntArray
    var SWAR = 1
    var VARNMALA = 2
    var swarVarnmala = 0
    var pos = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevel4Binding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)
        
        binding.char1.setOnClickListener(this)
        binding.char2.setOnClickListener(this)
        binding.char3.setOnClickListener(this)
        binding.char4.setOnClickListener(this)
        binding.char5.setOnClickListener(this)
        binding.char6.setOnClickListener(this)
        binding.char7.setOnClickListener(this)
        binding.char8.setOnClickListener(this)
        binding.char9.setOnClickListener(this)
        binding.char10.setOnClickListener(this)
        binding.char11.setOnClickListener(this)
        binding.char12.setOnClickListener(this)
        binding.char13.setOnClickListener(this)
        binding.char14.setOnClickListener(this)
        binding.char15.setOnClickListener(this)
        binding.char16.setOnClickListener(this)
        binding.char17.setOnClickListener(this)
        binding.char18.setOnClickListener(this)
        binding.char19.setOnClickListener(this)
        binding.char20.setOnClickListener(this)
        binding.char21.setOnClickListener(this)
        binding.char22.setOnClickListener(this)
        binding.char23.setOnClickListener(this)
        binding.char24.setOnClickListener(this)
        binding.char25.setOnClickListener(this)
        binding.char26.setOnClickListener(this)
        binding.char27.setOnClickListener(this)
        binding.char28.setOnClickListener(this)
        binding.char29.setOnClickListener(this)
        binding.char30.setOnClickListener(this)
        binding.char31.setOnClickListener(this)
        binding.char32.setOnClickListener(this)
        binding.char33.setOnClickListener(this)
        binding.backBT.setOnClickListener(this)
        
        if (resources.getBoolean(R.bool.isTab)) {
            // for tab
            animation270Sec = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.translation_left_to_right_270_sec_600
            )
            animation330Sec = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.translation_left_to_right_330_sec_600
            )
            animation390Sec = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.translation_left_to_right_390_sec_600
            )
            rotation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.rotation_600
            )
            binding.cloud0IV.startAnimation(animation270Sec)
            binding.cloud1IV.startAnimation(animation330Sec)
            binding.cloud3IV.startAnimation(animation330Sec)
            binding.cloud6IV.startAnimation(animation390Sec)
            binding.cloud7IV.startAnimation(animation390Sec)
            binding.sunRaysIV.startAnimation(rotation)
            swarVarnmalaArray = arrayOf(
                "अ",
                "आ",
                "इ",
                "ई",
                "उ",
                "ऊ",
                "ऋ",
                "ए",
                "ऐ",
                "ओ",
                "औ",
                "अं",
                "अः",
                "क",
                "ख",
                "ग",
                "घ",
                "ङ",
                "च",
                "छ",
                "ज",
                "झ",
                "ञ",
                "ट",
                "ठ",
                "ड",
                "ढ",
                "ण",
                "त",
                "थ",
                "द",
                "ध",
                "न",
                "प",
                "फ",
                "ब",
                "भ",
                "म",
                "य",
                "र",
                "ल",
                "व",
                "श",
                "ष",
                "स",
                "ह"
            )
            swarVarnmalaNamesArray = arrayOf(
                "अनार",
                "आम",
                "इमारत",
                "ईख",
                "उल्लू",
                "ऊन",
                "ॠषि",
                "एड़ी",
                "ऐनक",
                "ओखली",
                "औरत",
                "अंगूर",
                "",
                "कमल",
                "खरगोश",
                "गाय",
                "घड़ी",
                "",
                "चम्मच",
                "छतरी",
                "जहाज",
                "झाड़ू",
                "",
                "टमाटर",
                "ठेला",
                "डमरू",
                "ढोल",
                "बाण",
                "तरबूज",
                "थरमस",
                "दवात",
                "धनुष",
                "नल",
                "पतंग",
                "फल",
                "बत्तख",
                "भालू",
                "मछली",
                "योग",
                "रेल",
                "लट्टू",
                "वृक्ष",
                "शंख",
                "षट्कोण",
                "सेब",
                "हाथी"
            )
            swarVarnmalaImagesArray = intArrayOf(
                R.drawable.pomegranate_600,
                R.drawable.mango_600,
                R.drawable.building_600,
                R.drawable.reed_600,
                R.drawable.owl_600,
                R.drawable.wool_600,
                R.drawable.shadi_600,
                R.drawable.heel_600,
                R.drawable.specs_600,
                R.drawable.mortar_600,
                R.drawable.ladies_600,
                R.drawable.grapes_600,
                0,
                R.drawable.lotus_600,
                R.drawable.rabbit_600,
                R.drawable.cow_600,
                R.drawable.watch_600,
                0,
                R.drawable.spoon_600,
                R.drawable.umbrella_600,
                R.drawable.ship_600,
                R.drawable.broom_600,
                0,
                R.drawable.tomato_600,
                R.drawable.jamming_600,
                R.drawable.cornets_600,
                R.drawable.drum_600,
                R.drawable.arrow_600,
                R.drawable.watermelon_600,
                R.drawable.thermos_600,
                R.drawable.ink_600,
                R.drawable.bow_600,
                R.drawable.tap_600,
                R.drawable.kite_600,
                R.drawable.fruit_600,
                R.drawable.duck_600,
                R.drawable.bear_600,
                R.drawable.fish_600,
                R.drawable.yoga_600,
                R.drawable.train_600,
                R.drawable.topspin_600,
                R.drawable.tree_600,
                R.drawable.shell_600,
                R.drawable.hexagonal_600,
                R.drawable.apple_600,
                R.drawable.elephant_600
            )

            binding.char34?.setOnClickListener(this)
            binding.char35?.setOnClickListener(this)
            binding.char36?.setOnClickListener(this)
            binding.char37?.setOnClickListener(this)
            binding.char38?.setOnClickListener(this)
            binding.char39?.setOnClickListener(this)
            binding.char40?.setOnClickListener(this)
            binding.char41?.setOnClickListener(this)
            binding.char42?.setOnClickListener(this)
            binding.char43?.setOnClickListener(this)
            binding.char44?.setOnClickListener(this)
            binding.char45?.setOnClickListener(this)
            binding.char46?.setOnClickListener(this)
            
            randomNumbersForButtons()
            generateRandomCharacter()
        } else {
            // for mobile
            rotation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.rotation_320
            )
            binding.sunRaysIV.startAnimation(rotation)            
            binding.swarAlphabets?.setOnClickListener(this)
            binding.varnmalaAlphabets?.setOnClickListener(this)
            swarArray = arrayOf("अ", "आ", "इ", "ई", "उ", "ऊ", "ऋ", "ए", "ऐ", "ओ", "औ", "अं", "अः")
            varnmalaArray = arrayOf(
                "क",
                "ख",
                "ग",
                "घ",
                "ङ",
                "च",
                "छ",
                "ज",
                "झ",
                "ञ",
                "ट",
                "ठ",
                "ड",
                "ढ",
                "ण",
                "त",
                "थ",
                "द",
                "ध",
                "न",
                "प",
                "फ",
                "ब",
                "भ",
                "म",
                "य",
                "र",
                "ल",
                "व",
                "श",
                "ष",
                "स",
                "ह"
            )
            swarImagesArray = intArrayOf(
                R.drawable.pomegranate_320,
                R.drawable.mango_320,
                R.drawable.building_320,
                R.drawable.reed_320,
                R.drawable.owl_320,
                R.drawable.wool_320,
                R.drawable.shadi_320,
                R.drawable.heel_320,
                R.drawable.specs_320,
                R.drawable.mortar_320,
                R.drawable.ladies_320,
                R.drawable.grapes_320,
                0
            )
            varnmalaImagesArray = intArrayOf(
                R.drawable.lotus_320,
                R.drawable.rabbit_320,
                R.drawable.cow_320,
                R.drawable.watch_320,
                0,
                R.drawable.spoon_320,
                R.drawable.umbrella_320,
                R.drawable.ship_320,
                R.drawable.broom_320,
                0,
                R.drawable.tomato_320,
                R.drawable.jamming_320,
                R.drawable.cornets_320,
                R.drawable.drum_320,
                R.drawable.arrow_320,
                R.drawable.watermelon_320,
                R.drawable.thermos_320,
                R.drawable.ink_320,
                R.drawable.bow_320,
                R.drawable.tap_320,
                R.drawable.kite_320,
                R.drawable.fruit_320,
                R.drawable.duck_320,
                R.drawable.bear_320,
                R.drawable.fish_320,
                R.drawable.yoga_320,
                R.drawable.train_320,
                R.drawable.topspin_320,
                R.drawable.tree_320,
                R.drawable.shell_320,
                R.drawable.hexagonal_320,
                R.drawable.apple_320,
                R.drawable.elephant_320
            )
            swarNamesArray = arrayOf(
                "अनार",
                "आम",
                "इमारत",
                "ईख",
                "उल्लू",
                "ऊन",
                "ॠषि",
                "एड़ी",
                "ऐनक",
                "ओखली",
                "औरत",
                "अंगूर",
                ""
            )
            varnmalaNamesArray = arrayOf(
                "कमल",
                "खरगोश",
                "गाय",
                "घड़ी",
                "",
                "चम्मच",
                "छतरी",
                "जहाज",
                "झाड़ू",
                "",
                "टमाटर",
                "ठेला",
                "डमरू",
                "ढोल",
                "बाण",
                "तरबूज",
                "थरमस",
                "दवात",
                "धनुष",
                "नल",
                "पतंग",
                "फल",
                "बत्तख",
                "भालू",
                "मछली",
                "योग",
                "रेल",
                "लट्टू",
                "वृक्ष",
                "शंख",
                "षट्कोण",
                "सेब",
                "हाथी"
            )
            swarDisplay()
        }
    }

    private fun swarDisplay() {
        swarVarnmala = SWAR
        binding.char1.visibility = View.INVISIBLE
        binding.char2.visibility = View.INVISIBLE
        binding.char3.visibility = View.VISIBLE
        binding.char4.visibility = View.INVISIBLE
        binding.char5.visibility = View.VISIBLE
        binding.char6.visibility = View.INVISIBLE
        binding.char7.visibility = View.INVISIBLE
        binding.char8.visibility = View.INVISIBLE
        binding.char9.visibility = View.VISIBLE
        binding.char10.visibility = View.INVISIBLE
        binding.char11.visibility = View.VISIBLE
        binding.char12.visibility = View.VISIBLE
        binding.char13.visibility = View.VISIBLE
        binding.char14.visibility = View.INVISIBLE
        binding.char15.visibility = View.INVISIBLE
        binding.char16.visibility = View.INVISIBLE
        binding.char17.visibility = View.INVISIBLE
        binding.char18.visibility = View.VISIBLE
        binding.char19.visibility = View.INVISIBLE
        binding.char20.visibility = View.VISIBLE
        binding.char21.visibility = View.VISIBLE
        binding.char22.visibility = View.VISIBLE
        binding.char23.visibility = View.INVISIBLE
        binding.char24.visibility = View.INVISIBLE
        binding.char25.visibility = View.VISIBLE
        binding.char26.visibility = View.INVISIBLE
        binding.char27.visibility = View.INVISIBLE
        binding.char28.visibility = View.INVISIBLE
        binding.char29.visibility = View.INVISIBLE
        binding.char30.visibility = View.INVISIBLE
        binding.char31.visibility = View.INVISIBLE
        binding.char32.visibility = View.VISIBLE
        binding.char33.visibility = View.VISIBLE
        enableAll()
        randomNumberGenerator()
        generateRandomCharacter()
    }

    private fun varnmalaDisplay() {
        swarVarnmala = VARNMALA
        binding.char1.visibility = View.VISIBLE
        binding.char2.visibility = View.VISIBLE
        binding.char3.visibility = View.VISIBLE
        binding.char4.visibility = View.VISIBLE
        binding.char5.visibility = View.VISIBLE
        binding.char6.visibility = View.VISIBLE
        binding.char7.visibility = View.VISIBLE
        binding.char8.visibility = View.VISIBLE
        binding.char9.visibility = View.VISIBLE
        binding.char10.visibility = View.VISIBLE
        binding.char11.visibility = View.VISIBLE
        binding.char12.visibility = View.VISIBLE
        binding.char13.visibility = View.VISIBLE
        binding.char14.visibility = View.VISIBLE
        binding.char15.visibility = View.VISIBLE
        binding.char16.visibility = View.VISIBLE
        binding.char17.visibility = View.VISIBLE
        binding.char18.visibility = View.VISIBLE
        binding.char19.visibility = View.VISIBLE
        binding.char20.visibility = View.VISIBLE
        binding.char21.visibility = View.VISIBLE
        binding.char22.visibility = View.VISIBLE
        binding.char23.visibility = View.VISIBLE
        binding.char24.visibility = View.VISIBLE
        binding.char25.visibility = View.VISIBLE
        binding.char26.visibility = View.VISIBLE
        binding.char27.visibility = View.VISIBLE
        binding.char28.visibility = View.VISIBLE
        binding.char29.visibility = View.VISIBLE
        binding.char30.visibility = View.VISIBLE
        binding.char31.visibility = View.VISIBLE
        binding.char32.visibility = View.VISIBLE
        binding.char33.visibility = View.VISIBLE
        enableAll()
        randomNumberGenerator()
        generateRandomCharacter()
    }

    private fun randomNumberGenerator() {
        randomGenerator = Random()
        mCharactersList = ArrayList()
        mList = ArrayList()
        if (mList!!.size != 0) {
            mList!!.clear()
        }

        //enableAll();
        if (swarVarnmala == SWAR) {
            mCharactersList!!.addAll(Arrays.asList(*swarArray))
            mList!!.addAll(Arrays.asList(*swarArray))
            // swarDisplay();
        } else {
            mCharactersList!!.addAll(Arrays.asList(*varnmalaArray))
            mList!!.addAll(Arrays.asList(*varnmalaArray))
            // varnmalaDisplay();
        }
        var id = 0
        do {
            val position = randomGenerator!!.nextInt(mList!!.size)
            val carAtPosition = mList!![position]
            if (swarVarnmala == SWAR) {
                when (id) {
                    0 -> binding.char3.text = carAtPosition
                    1 -> binding.char5.text = carAtPosition
                    2 -> binding.char9.text = carAtPosition
                    3 -> binding.char11.text = carAtPosition
                    4 -> binding.char12.text = carAtPosition
                    5 -> binding.char13.text = carAtPosition
                    6 -> binding.char18.text = carAtPosition
                    7 -> binding.char20.text = carAtPosition
                    8 -> binding.char21.text = carAtPosition
                    9 -> binding.char22.text = carAtPosition
                    10 -> binding.char25.text = carAtPosition
                    11 -> binding.char32.text = carAtPosition
                    12 -> binding.char33.text = carAtPosition
                }
            } else {
                when (id) {
                    0 -> binding.char1.text = carAtPosition
                    1 -> binding.char2.text = carAtPosition
                    2 -> binding.char3.text = carAtPosition
                    3 -> binding.char4.text = carAtPosition
                    4 -> binding.char5.text = carAtPosition
                    5 -> binding.char6.text = carAtPosition
                    6 -> binding.char7.text = carAtPosition
                    7 -> binding.char8.text = carAtPosition
                    8 -> binding.char9.text = carAtPosition
                    9 -> binding.char10.text = carAtPosition
                    10 -> binding.char11.text = carAtPosition
                    11 -> binding.char12.text = carAtPosition
                    12 -> binding.char13.text = carAtPosition
                    13 -> binding.char14.text = carAtPosition
                    14 -> binding.char15.text = carAtPosition
                    15 -> binding.char16.text = carAtPosition
                    16 -> binding.char17.text = carAtPosition
                    17 -> binding.char18.text = carAtPosition
                    18 -> binding.char19.text = carAtPosition
                    19 -> binding.char20.text = carAtPosition
                    20 -> binding.char21.text = carAtPosition
                    21 -> binding.char22.text = carAtPosition
                    22 -> binding.char23.text = carAtPosition
                    23 -> binding.char24.text = carAtPosition
                    24 -> binding.char25.text = carAtPosition
                    25 -> binding.char26.text = carAtPosition
                    26 -> binding.char27.text = carAtPosition
                    27 -> binding.char28.text = carAtPosition
                    28 -> binding.char29.text = carAtPosition
                    29 -> binding.char30.text = carAtPosition
                    30 -> binding.char31.text = carAtPosition
                    31 -> binding.char32.text = carAtPosition
                    32 -> binding.char33.text = carAtPosition
                }
            }
            id++
            mList!!.removeAt(position)
        } while (mList!!.size > 0)
        pos = 0
    }

    @SuppressLint("NewApi")
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.decorView.windowInsetsController?.hide(
                android.view.WindowInsets.Type.statusBars()
                        or android.view.WindowInsets.Type.navigationBars()
            )
        }else{
            WindowCompat.setDecorFitsSystemWindows(window, false)
            view?.let {
                WindowInsetsControllerCompat(window, it).let { controller ->
                    controller.hide(WindowInsetsCompat.Type.systemBars())
                    controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                }
            }
        }
    }

    override fun onClick(v: View) {
        var charAt: String? = null
        val boardChar: String = binding.characterTV.text.toString().trim { it <= ' ' }
        var sender = 0
        if (resources.getBoolean(R.bool.isTab)) {
            // for tab
            if (v.id == R.id.char1) {
                charAt = binding.char1.text.toString().trim { it <= ' ' }
                sender = 1
            } else if (v.id == R.id.char2) {
                charAt = binding.char2.text.toString().trim { it <= ' ' }
                sender = 2
            } else if (v.id == R.id.char3) {
                charAt = binding.char3.text.toString().trim { it <= ' ' }
                sender = 3
            } else if (v.id == R.id.char4) {
                charAt = binding.char4.text.toString().trim { it <= ' ' }
                sender = 4
            } else if (v.id == R.id.char5) {
                charAt = binding.char5.text.toString().trim { it <= ' ' }
                sender = 5
            } else if (v.id == R.id.char6) {
                charAt = binding.char6.text.toString().trim { it <= ' ' }
                sender = 6
            } else if (v.id == R.id.char7) {
                charAt = binding.char7.text.toString().trim { it <= ' ' }
                sender = 7
            } else if (v.id == R.id.char8) {
                charAt = binding.char8.text.toString().trim { it <= ' ' }
                sender = 8
            } else if (v.id == R.id.char9) {
                charAt = binding.char9.text.toString().trim { it <= ' ' }
                sender = 9
            } else if (v.id == R.id.char10) {
                charAt = binding.char10.text.toString().trim { it <= ' ' }
                sender = 10
            } else if (v.id == R.id.char11) {
                charAt = binding.char11.text.toString().trim { it <= ' ' }
                sender = 11
            } else if (v.id == R.id.char12) {
                charAt = binding.char12.text.toString().trim { it <= ' ' }
                sender = 12
            } else if (v.id == R.id.char13) {
                charAt = binding.char13.text.toString().trim { it <= ' ' }
                sender = 13
            } else if (v.id == R.id.char14) {
                charAt = binding.char14.text.toString().trim { it <= ' ' }
                sender = 14
            } else if (v.id == R.id.char15) {
                charAt = binding.char15.text.toString().trim { it <= ' ' }
                sender = 15
            } else if (v.id == R.id.char16) {
                charAt = binding.char16.text.toString().trim { it <= ' ' }
                sender = 16
            } else if (v.id == R.id.char17) {
                charAt = binding.char17.text.toString().trim { it <= ' ' }
                sender = 17
            } else if (v.id == R.id.char18) {
                charAt = binding.char18.text.toString().trim { it <= ' ' }
                sender = 18
            } else if (v.id == R.id.char19) {
                charAt = binding.char19.text.toString().trim { it <= ' ' }
                sender = 19
            } else if (v.id == R.id.char20) {
                charAt = binding.char20.text.toString().trim { it <= ' ' }
                sender = 20
            } else if (v.id == R.id.char21) {
                charAt = binding.char21.text.toString().trim { it <= ' ' }
                sender = 21
            } else if (v.id == R.id.char22) {
                charAt = binding.char22.text.toString().trim { it <= ' ' }
                sender = 22
            } else if (v.id == R.id.char23) {
                charAt = binding.char23.text.toString().trim { it <= ' ' }
                sender = 23
            } else if (v.id == R.id.char24) {
                charAt = binding.char24.text.toString().trim { it <= ' ' }
                sender = 24
            } else if (v.id == R.id.char25) {
                charAt = binding.char25.text.toString().trim { it <= ' ' }
                sender = 25
            } else if (v.id == R.id.char26) {
                charAt = binding.char26.text.toString().trim { it <= ' ' }
                sender = 26
            } else if (v.id == R.id.char27) {
                charAt = binding.char27.text.toString().trim { it <= ' ' }
                sender = 27
            } else if (v.id == R.id.char28) {
                charAt = binding.char28.text.toString().trim { it <= ' ' }
                sender = 28
            } else if (v.id == R.id.char29) {
                charAt = binding.char29.text.toString().trim { it <= ' ' }
                sender = 29
            } else if (v.id == R.id.char30) {
                charAt = binding.char30.text.toString().trim { it <= ' ' }
                sender = 30
            } else if (v.id == R.id.char31) {
                charAt = binding.char31.text.toString().trim { it <= ' ' }
                sender = 31
            } else if (v.id == R.id.char32) {
                charAt = binding.char32.text.toString().trim { it <= ' ' }
                sender = 32
            } else if (v.id == R.id.char33) {
                charAt = binding.char33.text.toString().trim { it <= ' ' }
                sender = 33
            }
            if (v.id == R.id.char34) {
                charAt = binding.char34?.text.toString().trim { it <= ' ' }
                sender = 34
            } else if (v.id == R.id.char35) {
                charAt = binding.char35?.text.toString().trim { it <= ' ' }
                sender = 35
            } else if (v.id == R.id.char36) {
                charAt = binding.char36?.text.toString().trim { it <= ' ' }
                sender = 36
            } else if (v.id == R.id.char37) {
                charAt = binding.char37?.text.toString().trim { it <= ' ' }
                sender = 37
            } else if (v.id == R.id.char38) {
                charAt = binding.char38?.text.toString().trim { it <= ' ' }
                sender = 38
            } else if (v.id == R.id.char39) {
                charAt = binding.char39?.text.toString().trim { it <= ' ' }
                sender = 39
            } else if (v.id == R.id.char40) {
                charAt = binding.char40?.text.toString().trim { it <= ' ' }
                sender = 40
            } else if (v.id == R.id.char41) {
                charAt = binding.char41?.text.toString().trim { it <= ' ' }
                sender = 41
            } else if (v.id == R.id.char42) {
                charAt = binding.char42?.text.toString().trim { it <= ' ' }
                sender = 42
            } else if (v.id == R.id.char43) {
                charAt = binding.char43?.text.toString().trim { it <= ' ' }
                sender = 43
            } else if (v.id == R.id.char44) {
                charAt = binding.char44?.text.toString().trim { it <= ' ' }
                sender = 44
            } else if (v.id == R.id.char45) {
                charAt = binding.char45?.text.toString().trim { it <= ' ' }
                sender = 45
            } else if (v.id == R.id.char46) {
                charAt = binding.char46?.text.toString().trim { it <= ' ' }
                sender = 46
            } else if (v.id == R.id.backBT) {
                sender = 0
                finish()
            }
            if (sender > 0) {
                when (pos) {
                    0 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    1 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    2 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    3 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    4 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    5 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    6 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    7 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    8 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    9 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    10 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    11 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    12 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    13 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    14 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    15 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    16 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    17 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    18 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    19 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    20 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    21 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    22 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    23 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    24 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    25 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    26 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    27 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    28 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    29 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    30 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    31 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    32 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    33 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    34 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    35 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    36 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    37 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    38 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    39 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    40 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    41 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    42 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    43 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    44 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    45 -> if (boardChar == charAt) {
                        startSoundService(CHEERS_SOUND)
                        generateRandomCharacter()
                        disable(sender)
                        if (pos < 46) {
                            pos++
                        }
                        alert()
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                }
            }
        } else {
            // for mobile
            if (v.id == R.id.char1) {
                charAt = binding.char1.text.toString().trim { it <= ' ' }
                sender = 1
            } else if (v.id == R.id.char2) {
                charAt = binding.char2.text.toString().trim { it <= ' ' }
                sender = 2
            } else if (v.id == R.id.char3) {
                charAt = binding.char3.text.toString().trim { it <= ' ' }
                sender = 3
            } else if (v.id == R.id.char4) {
                charAt = binding.char4.text.toString().trim { it <= ' ' }
                sender = 4
            } else if (v.id == R.id.char5) {
                charAt = binding.char5.text.toString().trim { it <= ' ' }
                sender = 5
            } else if (v.id == R.id.char6) {
                charAt = binding.char6.text.toString().trim { it <= ' ' }
                sender = 6
            } else if (v.id == R.id.char7) {
                charAt = binding.char7.text.toString().trim { it <= ' ' }
                sender = 7
            } else if (v.id == R.id.char8) {
                charAt = binding.char8.text.toString().trim { it <= ' ' }
                sender = 8
            } else if (v.id == R.id.char9) {
                charAt = binding.char9.text.toString().trim { it <= ' ' }
                sender = 9
            } else if (v.id == R.id.char10) {
                charAt = binding.char10.text.toString().trim { it <= ' ' }
                sender = 10
            } else if (v.id == R.id.char11) {
                charAt = binding.char11.text.toString().trim { it <= ' ' }
                sender = 11
            } else if (v.id == R.id.char12) {
                charAt = binding.char12.text.toString().trim { it <= ' ' }
                sender = 12
            } else if (v.id == R.id.char13) {
                charAt = binding.char13.text.toString().trim { it <= ' ' }
                sender = 13
            } else if (v.id == R.id.char14) {
                charAt = binding.char14.text.toString().trim { it <= ' ' }
                sender = 14
            } else if (v.id == R.id.char15) {
                charAt = binding.char15.text.toString().trim { it <= ' ' }
                sender = 15
            } else if (v.id == R.id.char16) {
                charAt = binding.char16.text.toString().trim { it <= ' ' }
                sender = 16
            } else if (v.id == R.id.char17) {
                charAt = binding.char17.text.toString().trim { it <= ' ' }
                sender = 17
            } else if (v.id == R.id.char18) {
                charAt = binding.char18.text.toString().trim { it <= ' ' }
                sender = 18
            } else if (v.id == R.id.char19) {
                charAt = binding.char19.text.toString().trim { it <= ' ' }
                sender = 19
            } else if (v.id == R.id.char20) {
                charAt = binding.char20.text.toString().trim { it <= ' ' }
                sender = 20
            } else if (v.id == R.id.char21) {
                charAt = binding.char21.text.toString().trim { it <= ' ' }
                sender = 21
            } else if (v.id == R.id.char22) {
                charAt = binding.char22.text.toString().trim { it <= ' ' }
                sender = 22
            } else if (v.id == R.id.char23) {
                charAt = binding.char23.text.toString().trim { it <= ' ' }
                sender = 23
            } else if (v.id == R.id.char24) {
                charAt = binding.char24.text.toString().trim { it <= ' ' }
                sender = 24
            } else if (v.id == R.id.char25) {
                charAt = binding.char25.text.toString().trim { it <= ' ' }
                sender = 25
            } else if (v.id == R.id.char26) {
                charAt = binding.char26.text.toString().trim { it <= ' ' }
                sender = 26
            } else if (v.id == R.id.char27) {
                charAt = binding.char27.text.toString().trim { it <= ' ' }
                sender = 27
            } else if (v.id == R.id.char28) {
                charAt = binding.char28.text.toString().trim { it <= ' ' }
                sender = 28
            } else if (v.id == R.id.char29) {
                charAt = binding.char29.text.toString().trim { it <= ' ' }
                sender = 29
            } else if (v.id == R.id.char30) {
                charAt = binding.char30.text.toString().trim { it <= ' ' }
                sender = 30
            } else if (v.id == R.id.char31) {
                charAt = binding.char31.text.toString().trim { it <= ' ' }
                sender = 31
            } else if (v.id == R.id.char32) {
                charAt = binding.char32.text.toString().trim { it <= ' ' }
                sender = 32
            } else if (v.id == R.id.char33) {
                charAt = binding.char33.text.toString().trim { it <= ' ' }
                sender = 33
            } else if (v.id == R.id.swarAlphabets) {
                sender = 0
                swarDisplay()
            } else if (v.id == R.id.varnmalaAlphabets) {
                sender = 0
                varnmalaDisplay()
            } else if (v.id == R.id.backBT) {
                sender = 0
                finish()
            }
            if (sender > 0) {
                if (swarVarnmala == SWAR) {
                    when (pos) {
                        0 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        1 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        2 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        3 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        4 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        5 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        6 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        7 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        8 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        9 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        10 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        11 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        12 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            //generateRandomCharacter();
                            disable(sender)
                            if (pos < 13) {
                                pos++
                            }
                            varnmalaDisplay()
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                    }
                } else {
                    when (pos) {
                        0 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        1 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        2 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        3 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        4 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        5 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        6 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        7 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        8 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        9 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        10 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        11 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        12 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        13 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        14 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        15 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        16 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        17 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        18 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        19 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        20 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        21 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        22 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        23 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        24 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        25 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        26 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        27 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        28 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        29 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        30 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        31 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                        32 -> if (boardChar == charAt) {
                            startSoundService(CHEERS_SOUND)
                            generateRandomCharacter()
                            disable(sender)
                            if (pos < 33) {
                                pos++
                            }
                            alert()
                        } else {
                            startSoundService(AWW_SOUND)
                        }
                    }
                }
            }
        }
    }

    private fun alert() {
        val layoutInflater: LayoutInflater = LayoutInflater.from(this@Level4)
        val customAlert: View = layoutInflater.inflate(R.layout.alert_screen, null)
        val alertDialog = Dialog(this)
        alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        alertDialog.setContentView(customAlert)
        alertDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        alertDialog.setCancelable(false)
        alertDialog.show()
        val mHome: ImageButton = customAlert.findViewById<View>(R.id.btHome) as ImageButton
        val mReplay: ImageButton = customAlert.findViewById<View>(R.id.btReplay) as ImageButton
        mHome.setOnClickListener(View.OnClickListener { finish() })
        mReplay.setOnClickListener(View.OnClickListener {
            alertDialog.dismiss()
            if (resources.getBoolean(R.bool.isTab)) {
                // for tab
                randomNumbersForButtons()
                generateRandomCharacter()
                enableAll()
            } else {
                // for mobile
                swarDisplay()
            }
        })
    }

    fun disable(number: Int) {
        if (resources.getBoolean(R.bool.isTab)) {
            // for tab
            when (number) {
                1 -> {
                    binding.char1.alpha = 0.5f
                    binding.char1.isClickable = false
                }
                2 -> {
                    binding.char2.alpha = 0.5f
                    binding.char2.isClickable = false
                }
                3 -> {
                    binding.char3.alpha = 0.5f
                    binding.char3.isClickable = false
                }
                4 -> {
                    binding.char4.alpha = 0.5f
                    binding.char4.isClickable = false
                }
                5 -> {
                    binding.char5.alpha = 0.5f
                    binding.char5.isClickable = false
                }
                6 -> {
                    binding.char6.alpha = 0.5f
                    binding.char6.isClickable = false
                }
                7 -> {
                    binding.char7.alpha = 0.5f
                    binding.char7.isClickable = false
                }
                8 -> {
                    binding.char8.alpha = 0.5f
                    binding.char8.isClickable = false
                }
                9 -> {
                    binding.char9.alpha = 0.5f
                    binding.char9.isClickable = false
                }
                10 -> {
                    binding.char10.alpha = 0.5f
                    binding.char10.isClickable = false
                }
                11 -> {
                    binding.char11.alpha = 0.5f
                    binding.char11.isClickable = false
                }
                12 -> {
                    binding.char12.alpha = 0.5f
                    binding.char12.isClickable = false
                }
                13 -> {
                    binding.char13.alpha = 0.5f
                    binding.char13.isClickable = false
                }
                14 -> {
                    binding.char14.alpha = 0.5f
                    binding.char14.isClickable = false
                }
                15 -> {
                    binding.char15.alpha = 0.5f
                    binding.char15.isClickable = false
                }
                16 -> {
                    binding.char16.alpha = 0.5f
                    binding.char16.isClickable = false
                }
                17 -> {
                    binding.char17.alpha = 0.5f
                    binding.char17.isClickable = false
                }
                18 -> {
                    binding.char18.alpha = 0.5f
                    binding.char18.isClickable = false
                }
                19 -> {
                    binding.char19.alpha = 0.5f
                    binding.char19.isClickable = false
                }
                20 -> {
                    binding.char20.alpha = 0.5f
                    binding.char20.isClickable = false
                }
                21 -> {
                    binding.char21.alpha = 0.5f
                    binding.char21.isClickable = false
                }
                22 -> {
                    binding.char22.alpha = 0.5f
                    binding.char22.isClickable = false
                }
                23 -> {
                    binding.char23.alpha = 0.5f
                    binding.char23.isClickable = false
                }
                24 -> {
                    binding.char24.alpha = 0.5f
                    binding.char24.isClickable = false
                }
                25 -> {
                    binding.char25.alpha = 0.5f
                    binding.char25.isClickable = false
                }
                26 -> {
                    binding.char26.alpha = 0.5f
                    binding.char26.isClickable = false
                }
                27 -> {
                    binding.char27.alpha = 0.5f
                    binding.char27.isClickable = false
                }
                28 -> {
                    binding.char28.alpha = 0.5f
                    binding.char28.isClickable = false
                }
                29 -> {
                    binding.char29.alpha = 0.5f
                    binding.char29.isClickable = false
                }
                30 -> {
                    binding.char30.alpha = 0.5f
                    binding.char30.isClickable = false
                }
                31 -> {
                    binding.char31.alpha = 0.5f
                    binding.char31.isClickable = false
                }
                32 -> {
                    binding.char32.alpha = 0.5f
                    binding.char32.isClickable = false
                }
                33 -> {
                    binding.char33.alpha = 0.5f
                    binding.char33.isClickable = false
                }
                34 -> {
                    binding.char34?.alpha = 0.5f
                    binding.char34?.isClickable = false
                }
                35 -> {
                    binding.char35?.alpha = 0.5f
                    binding.char35?.isClickable = false
                }
                36 -> {
                    binding.char36?.alpha = 0.5f
                    binding.char36?.isClickable = false
                }
                37 -> {
                    binding.char37?.alpha = 0.5f
                    binding.char37?.isClickable = false
                }
                38 -> {
                    binding.char38?.alpha = 0.5f
                    binding.char38?.isClickable = false
                }
                39 -> {
                    binding.char39?.alpha = 0.5f
                    binding.char39?.isClickable = false
                }
                40 -> {
                    binding.char40?.alpha = 0.5f
                    binding.char40?.isClickable = false
                }
                41 -> {
                    binding.char41?.alpha = 0.5f
                    binding.char41?.isClickable = false
                }
                42 -> {
                    binding.char42?.alpha = 0.5f
                    binding.char42?.isClickable = false
                }
                43 -> {
                    binding.char43?.alpha = 0.5f
                    binding.char43?.isClickable = false
                }
                44 -> {
                    binding.char44?.alpha = 0.5f
                    binding.char44?.isClickable = false
                }
                45 -> {
                    binding.char45?.alpha = 0.5f
                    binding.char45?.isClickable = false
                }
                46 -> {
                    binding.char46?.alpha = 0.5f
                    binding.char46?.isClickable = false
                }
            }
        } else {
            // for mobile
            when (number) {
                1 -> {
                    binding.char1.alpha = 0.5f
                    binding.char1.isClickable = false
                }
                2 -> {
                    binding.char2.alpha = 0.5f
                    binding.char2.isClickable = false
                }
                3 -> {
                    binding.char3.alpha = 0.5f
                    binding.char3.isClickable = false
                }
                4 -> {
                    binding.char4.alpha = 0.5f
                    binding.char4.isClickable = false
                }
                5 -> {
                    binding.char5.alpha = 0.5f
                    binding.char5.isClickable = false
                }
                6 -> {
                    binding.char6.alpha = 0.5f
                    binding.char6.isClickable = false
                }
                7 -> {
                    binding.char7.alpha = 0.5f
                    binding.char7.isClickable = false
                }
                8 -> {
                    binding.char8.alpha = 0.5f
                    binding.char8.isClickable = false
                }
                9 -> {
                    binding.char9.alpha = 0.5f
                    binding.char9.isClickable = false
                }
                10 -> {
                    binding.char10.alpha = 0.5f
                    binding.char10.isClickable = false
                }
                11 -> {
                    binding.char11.alpha = 0.5f
                    binding.char11.isClickable = false
                }
                12 -> {
                    binding.char12.alpha = 0.5f
                    binding.char12.isClickable = false
                }
                13 -> {
                    binding.char13.alpha = 0.5f
                    binding.char13.isClickable = false
                }
                14 -> {
                    binding.char14.alpha = 0.5f
                    binding.char14.isClickable = false
                }
                15 -> {
                    binding.char15.alpha = 0.5f
                    binding.char15.isClickable = false
                }
                16 -> {
                    binding.char16.alpha = 0.5f
                    binding.char16.isClickable = false
                }
                17 -> {
                    binding.char17.alpha = 0.5f
                    binding.char17.isClickable = false
                }
                18 -> {
                    binding.char18.alpha = 0.5f
                    binding.char18.isClickable = false
                }
                19 -> {
                    binding.char19.alpha = 0.5f
                    binding.char19.isClickable = false
                }
                20 -> {
                    binding.char20.alpha = 0.5f
                    binding.char20.isClickable = false
                }
                21 -> {
                    binding.char21.alpha = 0.5f
                    binding.char21.isClickable = false
                }
                22 -> {
                    binding.char22.alpha = 0.5f
                    binding.char22.isClickable = false
                }
                23 -> {
                    binding.char23.alpha = 0.5f
                    binding.char23.isClickable = false
                }
                24 -> {
                    binding.char24.alpha = 0.5f
                    binding.char24.isClickable = false
                }
                25 -> {
                    binding.char25.alpha = 0.5f
                    binding.char25.isClickable = false
                }
                26 -> {
                    binding.char26.alpha = 0.5f
                    binding.char26.isClickable = false
                }
                27 -> {
                    binding.char27.alpha = 0.5f
                    binding.char27.isClickable = false
                }
                28 -> {
                    binding.char28.alpha = 0.5f
                    binding.char28.isClickable = false
                }
                29 -> {
                    binding.char29.alpha = 0.5f
                    binding.char29.isClickable = false
                }
                30 -> {
                    binding.char30.alpha = 0.5f
                    binding.char30.isClickable = false
                }
                31 -> {
                    binding.char31.alpha = 0.5f
                    binding.char31.isClickable = false
                }
                32 -> {
                    binding.char32.alpha = 0.5f
                    binding.char32.isClickable = false
                }
                33 -> {
                    binding.char33.alpha = 0.5f
                    binding.char33.isClickable = false
                }
            }
        }
    }

    private fun generateRandomCharacter() {
        if (resources.getBoolean(R.bool.isTab)) {
            // for tab
            if (mCharactersList!!.size > 0) {
                val position = randomGenerator!!.nextInt(mCharactersList!!.size)
                carAtPosition = mCharactersList!![position]
                binding.characterTV.text = carAtPosition
                if (swarVarnmalaArray[0] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[0])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[0]
                } else if (swarVarnmalaArray[1] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[1])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[1]
                } else if (swarVarnmalaArray[2] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[2])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[2]
                } else if (swarVarnmalaArray[3] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[3])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[3]
                } else if (swarVarnmalaArray[4] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[4])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[4]
                } else if (swarVarnmalaArray[5] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[5])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[5]
                } else if (swarVarnmalaArray[6] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[6])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[6]
                } else if (swarVarnmalaArray[7] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[7])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[7]
                } else if (swarVarnmalaArray[8] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[8])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[8]
                } else if (swarVarnmalaArray[9] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[9])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[9]
                } else if (swarVarnmalaArray[10] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[10])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[10]
                } else if (swarVarnmalaArray[11] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[11])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[11]
                } else if (swarVarnmalaArray[12] == carAtPosition) {
                    binding.ivFruitImage.setImageBitmap(null)
                    binding.tvFruitName.text = swarVarnmalaNamesArray[12]
                } else if (swarVarnmalaArray[13] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[13])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[13]
                } else if (swarVarnmalaArray[14] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[14])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[14]
                } else if (swarVarnmalaArray[15] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[15])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[15]
                } else if (swarVarnmalaArray[16] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[16])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[16]
                } else if (swarVarnmalaArray[17] == carAtPosition) {
                    binding.ivFruitImage.setImageBitmap(null)
                    binding.tvFruitName.text = swarVarnmalaNamesArray[17]
                } else if (swarVarnmalaArray[18] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[18])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[18]
                } else if (swarVarnmalaArray[19] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[19])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[19]
                } else if (swarVarnmalaArray[20] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[20])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[20]
                } else if (swarVarnmalaArray[21] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[21])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[21]
                } else if (swarVarnmalaArray[22] == carAtPosition) {
                    binding.ivFruitImage.setImageBitmap(null)
                    binding.tvFruitName.text = swarVarnmalaNamesArray[22]
                } else if (swarVarnmalaArray[23] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[23])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[23]
                } else if (swarVarnmalaArray[24] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[24])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[24]
                } else if (swarVarnmalaArray[25] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[25])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[25]
                } else if (swarVarnmalaArray[26] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[26])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[26]
                } else if (swarVarnmalaArray[27] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[27])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[27]
                } else if (swarVarnmalaArray[28] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[28])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[28]
                } else if (swarVarnmalaArray[29] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[29])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[29]
                } else if (swarVarnmalaArray[30] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[30])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[30]
                } else if (swarVarnmalaArray[31] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[31])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[31]
                } else if (swarVarnmalaArray[32] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[32])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[32]
                } else if (swarVarnmalaArray[33] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[33])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[33]
                } else if (swarVarnmalaArray[34] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[34])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[34]
                } else if (swarVarnmalaArray[35] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[35])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[35]
                } else if (swarVarnmalaArray[36] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[36])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[36]
                } else if (swarVarnmalaArray[37] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[37])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[37]
                } else if (swarVarnmalaArray[38] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[38])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[38]
                } else if (swarVarnmalaArray[39] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[39])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[39]
                } else if (swarVarnmalaArray[40] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[40])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[40]
                } else if (swarVarnmalaArray[41] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[41])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[41]
                } else if (swarVarnmalaArray[42] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[42])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[42]
                } else if (swarVarnmalaArray[43] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[43])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[43]
                } else if (swarVarnmalaArray[44] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[44])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[44]
                } else if (swarVarnmalaArray[45] == carAtPosition) {
                    binding.ivFruitImage.setImageResource(swarVarnmalaImagesArray[45])
                    binding.tvFruitName.text = swarVarnmalaNamesArray[45]
                }
                mCharactersList!!.removeAt(position)
            }
            /*else if (mCharactersList.size() == 0)
            {
                alert();
            }*/
        } else {
            // for moblie
            if (mCharactersList!!.size > 0) {
                val position = randomGenerator!!.nextInt(mCharactersList!!.size)
                carAtPosition = mCharactersList!![position]
                binding.characterTV.text = carAtPosition
                if (swarVarnmala == SWAR) {
                    if (swarArray[0] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[0])
                        binding.tvFruitName.text = swarNamesArray[0]
                    } else if (swarArray[1] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[1])
                        binding.tvFruitName.text = swarNamesArray[1]
                    } else if (swarArray[2] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[2])
                        binding.tvFruitName.text = swarNamesArray[2]
                    } else if (swarArray[3] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[3])
                        binding.tvFruitName.text = swarNamesArray[3]
                    } else if (swarArray[4] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[4])
                        binding.tvFruitName.text = swarNamesArray[4]
                    } else if (swarArray[5] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[5])
                        binding.tvFruitName.text = swarNamesArray[5]
                    } else if (swarArray[6] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[6])
                        binding.tvFruitName.text = swarNamesArray[6]
                    } else if (swarArray[7] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[7])
                        binding.tvFruitName.text = swarNamesArray[7]
                    } else if (swarArray[8] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[8])
                        binding.tvFruitName.text = swarNamesArray[8]
                    } else if (swarArray[9] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[9])
                        binding.tvFruitName.text = swarNamesArray[9]
                    } else if (swarArray[10] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[10])
                        binding.tvFruitName.text = swarNamesArray[10]
                    } else if (swarArray[11] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(swarImagesArray[11])
                        binding.tvFruitName.text = swarNamesArray[11]
                    } else if (swarArray[12] == carAtPosition) {
                        binding.ivFruitImage.setImageBitmap(null)
                        binding.tvFruitName.text = swarNamesArray[12]
                    }
                } else {
                    if (varnmalaArray[0] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[0])
                        binding.tvFruitName.text = varnmalaNamesArray[0]
                    } else if (varnmalaArray[1] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[1])
                        binding.tvFruitName.text = varnmalaNamesArray[1]
                    } else if (varnmalaArray[2] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[2])
                        binding.tvFruitName.text = varnmalaNamesArray[2]
                    } else if (varnmalaArray[3] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[3])
                        binding.tvFruitName.text = varnmalaNamesArray[3]
                    } else if (varnmalaArray[4] == carAtPosition) {
                        binding.ivFruitImage.setImageBitmap(null)
                        binding.tvFruitName.text = varnmalaNamesArray[4]
                    } else if (varnmalaArray[5] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[5])
                        binding.tvFruitName.text = varnmalaNamesArray[5]
                    } else if (varnmalaArray[6] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[6])
                        binding.tvFruitName.text = varnmalaNamesArray[6]
                    } else if (varnmalaArray[7] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[7])
                        binding.tvFruitName.text = varnmalaNamesArray[7]
                    } else if (varnmalaArray[8] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[8])
                        binding.tvFruitName.text = varnmalaNamesArray[8]
                    } else if (varnmalaArray[9] == carAtPosition) {
                        binding.ivFruitImage.setImageBitmap(null)
                        binding.tvFruitName.text = varnmalaNamesArray[9]
                    } else if (varnmalaArray[10] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[10])
                        binding.tvFruitName.text = varnmalaNamesArray[10]
                    } else if (varnmalaArray[11] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[11])
                        binding.tvFruitName.text = varnmalaNamesArray[11]
                    } else if (varnmalaArray[12] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[12])
                        binding.tvFruitName.text = varnmalaNamesArray[12]
                    } else if (varnmalaArray[13] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[13])
                        binding.tvFruitName.text = varnmalaNamesArray[13]
                    } else if (varnmalaArray[14] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[14])
                        binding.tvFruitName.text = varnmalaNamesArray[14]
                    } else if (varnmalaArray[15] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[15])
                        binding.tvFruitName.text = varnmalaNamesArray[15]
                    } else if (varnmalaArray[16] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[16])
                        binding.tvFruitName.text = varnmalaNamesArray[16]
                    } else if (varnmalaArray[17] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[17])
                        binding.tvFruitName.text = varnmalaNamesArray[17]
                    } else if (varnmalaArray[18] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[18])
                        binding.tvFruitName.text = varnmalaNamesArray[18]
                    } else if (varnmalaArray[19] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[19])
                        binding.tvFruitName.text = varnmalaNamesArray[19]
                    } else if (varnmalaArray[20] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[20])
                        binding.tvFruitName.text = varnmalaNamesArray[20]
                    } else if (varnmalaArray[21] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[21])
                        binding.tvFruitName.text = varnmalaNamesArray[21]
                    } else if (varnmalaArray[22] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[22])
                        binding.tvFruitName.text = varnmalaNamesArray[22]
                    } else if (varnmalaArray[23] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[23])
                        binding.tvFruitName.text = varnmalaNamesArray[23]
                    } else if (varnmalaArray[24] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[24])
                        binding.tvFruitName.text = varnmalaNamesArray[24]
                    } else if (varnmalaArray[25] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[25])
                        binding.tvFruitName.text = varnmalaNamesArray[25]
                    } else if (varnmalaArray[26] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[26])
                        binding.tvFruitName.text = varnmalaNamesArray[26]
                    } else if (varnmalaArray[27] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[27])
                        binding.tvFruitName.text = varnmalaNamesArray[27]
                    } else if (varnmalaArray[28] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[28])
                        binding.tvFruitName.text = varnmalaNamesArray[28]
                    } else if (varnmalaArray[29] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[29])
                        binding.tvFruitName.text = varnmalaNamesArray[29]
                    } else if (varnmalaArray[30] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[30])
                        binding.tvFruitName.text = varnmalaNamesArray[30]
                    } else if (varnmalaArray[31] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[31])
                        binding.tvFruitName.text = varnmalaNamesArray[31]
                    } else if (varnmalaArray[32] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[32])
                        binding.tvFruitName.text = varnmalaNamesArray[32]
                    } else if (varnmalaArray[33] == carAtPosition) {
                        binding.ivFruitImage.setImageResource(varnmalaImagesArray[33])
                        binding.tvFruitName.text = varnmalaNamesArray[33]
                    }
                }
                mCharactersList!!.removeAt(position)
            }
            /*else if (mCharactersList.size() == 0)
            {
                alert();
            }*/
        }
    }

    private fun startSoundService(soundToPlay: Int) {
        Thread {
            val intent = Intent(this@Level4, SoundService::class.java)
            intent.putExtra("Sound_To_Play", soundToPlay)
            startService(intent)
        }.start()
    }

    private fun stopSoundService() {
        Thread { stopService(Intent(this@Level4, SoundService::class.java)) }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        stopSoundService()
    }

    override fun onPause() {
        super.onPause()
        stopSoundService()
    }

    fun randomNumbersForButtons() {
        randomGenerator = Random()
        mCharactersList = ArrayList()
        mCharactersList!!.addAll(Arrays.asList(*swarVarnmalaArray))
        mList = ArrayList()
        mList!!.addAll(Arrays.asList(*swarVarnmalaArray))
        var id = 0
        do {
            val position = randomGenerator!!.nextInt(mList!!.size)
            val carAtPosition = mList!![position]
            when (id) {
                0 -> binding.char1.text = carAtPosition
                1 -> binding.char2.text = carAtPosition
                2 -> binding.char3.text = carAtPosition
                3 -> binding.char4.text = carAtPosition
                4 -> binding.char5.text = carAtPosition
                5 -> binding.char6.text = carAtPosition
                6 -> binding.char7.text = carAtPosition
                7 -> binding.char8.text = carAtPosition
                8 -> binding.char9.text = carAtPosition
                9 -> binding.char10.text = carAtPosition
                10 -> binding.char11.text = carAtPosition
                11 -> binding.char12.text = carAtPosition
                12 -> binding.char13.text = carAtPosition
                13 -> binding.char14.text = carAtPosition
                14 -> binding.char15.text = carAtPosition
                15 -> binding.char16.text = carAtPosition
                16 -> binding.char17.text = carAtPosition
                17 -> binding.char18.text = carAtPosition
                18 -> binding.char19.text = carAtPosition
                19 -> binding.char20.text = carAtPosition
                20 -> binding.char21.text = carAtPosition
                21 -> binding.char22.text = carAtPosition
                22 -> binding.char23.text = carAtPosition
                23 -> binding.char24.text = carAtPosition
                24 -> binding.char25.text = carAtPosition
                25 -> binding.char26.text = carAtPosition
                26 -> binding.char27.text = carAtPosition
                27 -> binding.char28.text = carAtPosition
                28 -> binding.char29.text = carAtPosition
                29 -> binding.char30.text = carAtPosition
                30 -> binding.char31.text = carAtPosition
                31 -> binding.char32.text = carAtPosition
                32 -> binding.char33.text = carAtPosition
                33 -> binding.char34?.text = carAtPosition
                34 -> binding.char35?.text = carAtPosition
                35 -> binding.char36?.text = carAtPosition
                36 -> binding.char37?.text = carAtPosition
                37 -> binding.char38?.text = carAtPosition
                38 -> binding.char39?.text = carAtPosition
                39 -> binding.char40?.text = carAtPosition
                40 -> binding.char41?.text = carAtPosition
                41 -> binding.char42?.text = carAtPosition
                42 -> binding.char43?.text = carAtPosition
                43 -> binding.char44?.text = carAtPosition
                44 -> binding.char45?.text = carAtPosition
                45 -> binding.char46?.text = carAtPosition
            }
            id++
            mList!!.removeAt(position)
        } while (mList!!.size > 0)
        pos = 0
    }

    private fun enableAll() {
        binding.char1.alpha = 1.0f
        binding.char1.isClickable = true
        binding.char2.alpha = 1.0f
        binding.char2.isClickable = true
        binding.char3.alpha = 1.0f
        binding.char3.isClickable = true
        binding.char4.alpha = 1.0f
        binding.char4.isClickable = true
        binding.char5.alpha = 1.0f
        binding.char5.isClickable = true
        binding.char6.alpha = 1.0f
        binding.char6.isClickable = true
        binding.char7.alpha = 1.0f
        binding.char7.isClickable = true
        binding.char8.alpha = 1.0f
        binding.char8.isClickable = true
        binding.char9.alpha = 1.0f
        binding.char9.isClickable = true
        binding.char10.alpha = 1.0f
        binding.char10.isClickable = true
        binding.char11.alpha = 1.0f
        binding.char11.isClickable = true
        binding.char12.alpha = 1.0f
        binding.char12.isClickable = true
        binding.char13.alpha = 1.0f
        binding.char13.isClickable = true
        binding.char14.alpha = 1.0f
        binding.char14.isClickable = true
        binding.char15.alpha = 1.0f
        binding.char15.isClickable = true
        binding.char16.alpha = 1.0f
        binding.char16.isClickable = true
        binding.char17.alpha = 1.0f
        binding.char17.isClickable = true
        binding.char18.alpha = 1.0f
        binding.char18.isClickable = true
        binding.char19.alpha = 1.0f
        binding.char19.isClickable = true
        binding.char20.alpha = 1.0f
        binding.char20.isClickable = true
        binding.char21.alpha = 1.0f
        binding.char21.isClickable = true
        binding.char22.alpha = 1.0f
        binding.char22.isClickable = true
        binding.char23.alpha = 1.0f
        binding.char23.isClickable = true
        binding.char24.alpha = 1.0f
        binding.char24.isClickable = true
        binding.char25.alpha = 1.0f
        binding.char25.isClickable = true
        binding.char26.alpha = 1.0f
        binding.char26.isClickable = true
        binding.char27.alpha = 1.0f
        binding.char27.isClickable = true
        binding.char28.alpha = 1.0f
        binding.char28.isClickable = true
        binding.char29.alpha = 1.0f
        binding.char29.isClickable = true
        binding.char30.alpha = 1.0f
        binding.char30.isClickable = true
        binding.char31.alpha = 1.0f
        binding.char31.isClickable = true
        binding.char32.alpha = 1.0f
        binding.char32.isClickable = true
        binding.char33.alpha = 1.0f
        binding.char33.isClickable = true
        if (resources.getBoolean(R.bool.isTab)) {
            // for tab
            binding.char34?.alpha = 1.0f
            binding.char34?.isClickable = true
            binding.char35?.alpha = 1.0f
            binding.char35?.isClickable = true
            binding.char36?.alpha = 1.0f
            binding.char36?.isClickable = true
            binding.char37?.alpha = 1.0f
            binding.char37?.isClickable = true
            binding.char38?.alpha = 1.0f
            binding.char38?.isClickable = true
            binding.char39?.alpha = 1.0f
            binding.char39?.isClickable = true
            binding.char40?.alpha = 1.0f
            binding.char40?.isClickable = true
            binding.char41?.alpha = 1.0f
            binding.char41?.isClickable = true
            binding.char42?.alpha = 1.0f
            binding.char42?.isClickable = true
            binding.char43?.alpha = 1.0f
            binding.char43?.isClickable = true
            binding.char44?.alpha = 1.0f
            binding.char44?.isClickable = true
            binding.char45?.alpha = 1.0f
            binding.char45?.isClickable = true
            binding.char46?.alpha = 1.0f
            binding.char46?.isClickable = true
        }
    }
}