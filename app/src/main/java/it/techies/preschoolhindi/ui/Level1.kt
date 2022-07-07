package it.techies.preschoolhindi.ui

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import it.techies.preschoolhindi.R
import it.techies.preschoolhindi.databinding.ActivityLevel1Binding

class Level1 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityLevel1Binding
    var view: View?=null

    var animation270Sec: Animation? = null
    var animation330Sec: Animation? = null
    var animation390Sec: Animation? = null
    var rotation: Animation? = null
    lateinit var varnmalaNamesArray: Array<String>
    lateinit var swarNamesArray: Array<String>
    lateinit var varnmalaImagesArray: IntArray
    lateinit var swarImagesArray: IntArray
    var SWAR = 1
    var VARNMALA = 2
    var swarVarnmala = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevel1Binding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)
        
        //val typeface: Typeface = Typeface.createFromAsset(getAssets(), "font/lohit_devanagari.ttf")
        
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
            swarImagesArray = intArrayOf(
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
                0
            )
            varnmalaImagesArray = intArrayOf(
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
        } else {
            // for mobile
            rotation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.rotation_320
            )
            binding.sunRaysIV.startAnimation(rotation)
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
        }
        
        swarDisplay()
        
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
        binding.swarAlphabets.setOnClickListener(this)
        binding.varnmalaAlphabets.setOnClickListener(this)
    }

    private fun swarDisplay() {
        val swarArray = arrayOf("अ", "आ", "इ", "ई", "उ", "ऊ", "ऋ", "ए", "ऐ", "ओ", "औ", "अं", "अः")
        swarVarnmala = SWAR
        binding.characterTV.text = swarArray[0]
        binding.smallBoardLabel.text = "Vowels (स्वर)"
        binding.tvFruitName.text = swarNamesArray[0]
        binding.ivFruitImage.setImageResource(swarImagesArray[0])
        binding.char7.text = swarArray[0]
        binding.char8.text = swarArray[1]
        binding.char9.text = swarArray[2]
        binding.char12.text = swarArray[3]
        binding.char13.text = swarArray[4]
        binding.char14.text = swarArray[5]
        binding.char17.text = swarArray[6]
        binding.char18.text = swarArray[7]
        binding.char19.text = swarArray[8]
        binding.char22.text = swarArray[9]
        binding.char23.text = swarArray[10]
        binding.char24.text = swarArray[11]
        binding.char28.text = swarArray[12]
        binding.char1.visibility = View.INVISIBLE
        binding.char2.visibility = View.INVISIBLE
        binding.char3.visibility = View.INVISIBLE
        binding.char4.visibility = View.INVISIBLE
        binding.char5.visibility = View.INVISIBLE
        binding.char6.visibility = View.INVISIBLE
        binding.char7.visibility = View.VISIBLE
        binding.char8.visibility = View.VISIBLE
        binding.char9.visibility = View.VISIBLE
        binding.char10.visibility = View.INVISIBLE
        binding.char11.visibility = View.INVISIBLE
        binding.char12.visibility = View.VISIBLE
        binding.char13.visibility = View.VISIBLE
        binding.char14.visibility = View.VISIBLE
        binding.char15.visibility = View.INVISIBLE
        binding.char16.visibility = View.INVISIBLE
        binding.char17.visibility = View.VISIBLE
        binding.char18.visibility = View.VISIBLE
        binding.char19.visibility = View.VISIBLE
        binding.char20.visibility = View.INVISIBLE
        binding.char21.visibility = View.INVISIBLE
        binding.char22.visibility = View.VISIBLE
        binding.char23.visibility = View.VISIBLE
        binding.char24.visibility = View.VISIBLE
        binding.char25.visibility = View.INVISIBLE
        binding.char26.visibility = View.INVISIBLE
        binding.char27.visibility = View.INVISIBLE
        binding.char28.visibility = View.VISIBLE
        binding.char29.visibility = View.INVISIBLE
        binding.char30.visibility = View.INVISIBLE
        binding.char31.visibility = View.INVISIBLE
        binding.char32.visibility = View.INVISIBLE
        binding.char33.visibility = View.INVISIBLE
    }

    fun varnmalaDisplay() {
        val varnmalaArray = arrayOf(
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
        swarVarnmala = VARNMALA
        binding.characterTV.text = varnmalaArray[0]
        binding.smallBoardLabel.text = "Consonants (व्यंजन)"
        binding.tvFruitName.text = varnmalaNamesArray[0]
        binding.ivFruitImage.setImageResource(varnmalaImagesArray[0])
        binding.char1.text = varnmalaArray[0]
        binding.char2.text = varnmalaArray[1]
        binding.char3.text = varnmalaArray[2]
        binding.char4.text = varnmalaArray[3]
        binding.char5.text = varnmalaArray[4]
        binding.char6.text = varnmalaArray[5]
        binding.char7.text = varnmalaArray[6]
        binding.char8.text = varnmalaArray[7]
        binding.char9.text = varnmalaArray[8]
        binding.char10.text = varnmalaArray[9]
        binding.char11.text = varnmalaArray[10]
        binding.char12.text = varnmalaArray[11]
        binding.char13.text = varnmalaArray[12]
        binding.char14.text = varnmalaArray[13]
        binding.char15.text = varnmalaArray[14]
        binding.char16.text = varnmalaArray[15]
        binding.char17.text = varnmalaArray[16]
        binding.char18.text = varnmalaArray[17]
        binding.char19.text = varnmalaArray[18]
        binding.char20.text = varnmalaArray[19]
        binding.char21.text = varnmalaArray[20]
        binding.char22.text = varnmalaArray[21]
        binding.char23.text = varnmalaArray[22]
        binding.char24.text = varnmalaArray[23]
        binding.char25.text = varnmalaArray[24]
        binding.char26.text = varnmalaArray[25]
        binding.char27.text = varnmalaArray[26]
        binding.char28.text = varnmalaArray[27]
        binding.char29.text = varnmalaArray[28]
        binding.char30.text = varnmalaArray[29]
        binding.char31.text = varnmalaArray[30]
        binding.char32.text = varnmalaArray[31]
        binding.char33.text = varnmalaArray[32]
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
    }

    override fun onClick(v: View) {
        if (v.id == R.id.char1) {
            binding.characterTV.text = binding.char1.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[0])
            binding.tvFruitName.text = varnmalaNamesArray[0]
        } else if (v.id == R.id.char2) {
            binding.characterTV.text = binding.char2.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[1])
            binding.tvFruitName.text = varnmalaNamesArray[1]
        } else if (v.id == R.id.char3) {
            binding.characterTV.text = binding.char3.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[2])
            binding.tvFruitName.text = varnmalaNamesArray[2]
        } else if (v.id == R.id.char4) {
            binding.characterTV.text = binding.char4.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[3])
            binding.tvFruitName.text = varnmalaNamesArray[3]
        } else if (v.id == R.id.char5) {
            binding.characterTV.text = binding.char5.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageBitmap(null)
            binding.tvFruitName.text = varnmalaNamesArray[4]
        } else if (v.id == R.id.char6) {
            binding.characterTV.text = binding.char6.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[5])
            binding.tvFruitName.text = varnmalaNamesArray[5]
        } else if (v.id == R.id.char7) {
            binding.characterTV.text = binding.char7.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[6])
                binding.tvFruitName.text = varnmalaNamesArray[6]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[0])
                binding.tvFruitName.text = swarNamesArray[0]
            }
        } else if (v.id == R.id.char8) {
            binding.characterTV.text = binding.char8.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[7])
                binding.tvFruitName.text = varnmalaNamesArray[7]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[1])
                binding.tvFruitName.text = swarNamesArray[1]
            }
        } else if (v.id == R.id.char9) {
            binding.characterTV.text = binding.char9.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[8])
                binding.tvFruitName.text = varnmalaNamesArray[8]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[2])
                binding.tvFruitName.text = swarNamesArray[2]
            }
        } else if (v.id == R.id.char10) {
            binding.characterTV.text = binding.char10.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageBitmap(null)
            binding.tvFruitName.text = varnmalaNamesArray[9]
        } else if (v.id == R.id.char11) {
            binding.characterTV.text = binding.char11.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[10])
            binding.tvFruitName.text = varnmalaNamesArray[10]
        } else if (v.id == R.id.char12) {
            binding.characterTV.text = binding.char12.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[11])
                binding.tvFruitName.text = varnmalaNamesArray[11]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[3])
                binding.tvFruitName.text = swarNamesArray[3]
            }
        } else if (v.id == R.id.char13) {
            binding.characterTV.text = binding.char13.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[12])
                binding.tvFruitName.text = varnmalaNamesArray[12]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[4])
                binding.tvFruitName.text = swarNamesArray[4]
            }
        } else if (v.id == R.id.char14) {
            binding.characterTV.text = binding.char14.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[13])
                binding.tvFruitName.text = varnmalaNamesArray[13]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[5])
                binding.tvFruitName.text = swarNamesArray[5]
            }
        } else if (v.id == R.id.char15) {
            binding.characterTV.text = binding.char15.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[14])
            binding.tvFruitName.text = varnmalaNamesArray[14]
        } else if (v.id == R.id.char16) {
            binding.characterTV.text = binding.char16.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[15])
            binding.tvFruitName.text = varnmalaNamesArray[15]
        } else if (v.id == R.id.char17) {
            binding.characterTV.text = binding.char17.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[16])
                binding.tvFruitName.text = varnmalaNamesArray[16]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[6])
                binding.tvFruitName.text = swarNamesArray[6]
            }
        } else if (v.id == R.id.char18) {
            binding.characterTV.text = binding.char18.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[17])
                binding.tvFruitName.text = varnmalaNamesArray[17]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[7])
                binding.tvFruitName.text = swarNamesArray[7]
            }
        } else if (v.id == R.id.char19) {
            binding.characterTV.text = binding.char19.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[18])
                binding.tvFruitName.text = varnmalaNamesArray[18]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[8])
                binding.tvFruitName.text = swarNamesArray[8]
            }
        } else if (v.id == R.id.char20) {
            binding.characterTV.text = binding.char20.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[19])
            binding.tvFruitName.text = varnmalaNamesArray[19]
        } else if (v.id == R.id.char21) {
            binding.characterTV.text = binding.char21.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[20])
            binding.tvFruitName.text = varnmalaNamesArray[20]
        } else if (v.id == R.id.char22) {
            binding.characterTV.text = binding.char22.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[21])
                binding.tvFruitName.text = varnmalaNamesArray[21]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[9])
                binding.tvFruitName.text = swarNamesArray[9]
            }
        } else if (v.id == R.id.char23) {
            binding.characterTV.text = binding.char23.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[22])
                binding.tvFruitName.text = varnmalaNamesArray[22]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[10])
                binding.tvFruitName.text = swarNamesArray[10]
            }
        } else if (v.id == R.id.char24) {
            binding.characterTV.text = binding.char24.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[23])
                binding.tvFruitName.text = varnmalaNamesArray[23]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[11])
                binding.tvFruitName.text = swarNamesArray[11]
            }
        } else if (v.id == R.id.char25) {
            binding.characterTV.text = binding.char25.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[24])
            binding.tvFruitName.text = varnmalaNamesArray[24]
        } else if (v.id == R.id.char26) {
            binding.characterTV.text = binding.char26.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[25])
            binding.tvFruitName.text = varnmalaNamesArray[25]
        } else if (v.id == R.id.char27) {
            binding.characterTV.text = binding.char27.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[26])
            binding.tvFruitName.text = varnmalaNamesArray[26]
        } else if (v.id == R.id.char28) {
            binding.characterTV.text = binding.char28.text.toString().trim { it <= ' ' }
            if (swarVarnmala == VARNMALA) {
                binding.ivFruitImage.setImageResource(varnmalaImagesArray[27])
                binding.tvFruitName.text = varnmalaNamesArray[27]
            } else {
                binding.ivFruitImage.setImageResource(swarImagesArray[12])
                binding.tvFruitName.text = swarNamesArray[12]
            }
        } else if (v.id == R.id.char29) {
            binding.characterTV.text = binding.char29.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[28])
            binding.tvFruitName.text = varnmalaNamesArray[28]
        } else if (v.id == R.id.char30) {
            binding.characterTV.text = binding.char30.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[29])
            binding.tvFruitName.text = varnmalaNamesArray[29]
        } else if (v.id == R.id.char31) {
            binding.characterTV.text = binding.char31.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[30])
            binding.tvFruitName.text = varnmalaNamesArray[30]
        } else if (v.id == R.id.char32) {
            binding.characterTV.text = binding.char32.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[31])
            binding.tvFruitName.text = varnmalaNamesArray[31]
        } else if (v.id == R.id.char33) {
            binding.characterTV.text = binding.char33.text.toString().trim { it <= ' ' }
            binding.ivFruitImage.setImageResource(varnmalaImagesArray[32])
            binding.tvFruitName.text = varnmalaNamesArray[32]
        } else if (v.id == R.id.backBT) {
            finish()
        } else if (v.id == R.id.swarAlphabets) {
            swarDisplay()
        } else if (v.id == R.id.varnmalaAlphabets) {
            varnmalaDisplay()
        }
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
}