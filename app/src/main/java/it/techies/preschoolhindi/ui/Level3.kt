package it.techies.preschoolhindi.ui

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
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
import it.techies.preschoolhindi.databinding.ActivityLevel3Binding
import it.techies.preschoolhindi.services.SoundService
import java.util.*

class Level3 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityLevel3Binding
    var view: View?=null
    
    private var mList: ArrayList<String>? = null
    private var randomGenerator: Random? = null
    var CHEERS_SOUND = 1
    var AWW_SOUND = 2    
    var animation270Sec: Animation? = null
    var animation330Sec: Animation? = null
    var animation390Sec: Animation? = null
    var rotation: Animation? = null
    lateinit var swarArray: Array<String>
    lateinit var varnmalaArray: Array<String>
    var SWAR = 1
    var VARNMALA = 2
    var swarVarnmala = 0
    var pos = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevel3Binding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)
        
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
        } else {
            // for mobile
            rotation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.rotation_320
            )
            binding.sunRaysIV.startAnimation(rotation)
        }
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
        swarVarnmala = SWAR
        randomNumberGenerator()
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
        var sender = 0
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
            sender = if (swarVarnmala == SWAR) {
                1
            } else {
                7
            }
        } else if (v.id == R.id.char8) {
            charAt = binding.char8.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                2
            } else {
                8
            }
        } else if (v.id == R.id.char9) {
            charAt = binding.char9.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                3
            } else {
                9
            }
        } else if (v.id == R.id.char10) {
            charAt = binding.char10.text.toString().trim { it <= ' ' }
            sender = 10
        } else if (v.id == R.id.char11) {
            charAt = binding.char11.text.toString().trim { it <= ' ' }
            sender = 11
        } else if (v.id == R.id.char12) {
            charAt = binding.char12.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                4
            } else {
                12
            }
        } else if (v.id == R.id.char13) {
            charAt = binding.char13.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                5
            } else {
                13
            }
        } else if (v.id == R.id.char14) {
            charAt = binding.char14.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                6
            } else {
                14
            }
        } else if (v.id == R.id.char15) {
            charAt = binding.char15.text.toString().trim { it <= ' ' }
            sender = 15
        } else if (v.id == R.id.char16) {
            charAt = binding.char16.text.toString().trim { it <= ' ' }
            sender = 16
        } else if (v.id == R.id.char17) {
            charAt = binding.char17.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                7
            } else {
                17
            }
        } else if (v.id == R.id.char18) {
            charAt = binding.char18.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                8
            } else {
                18
            }
        } else if (v.id == R.id.char19) {
            charAt = binding.char19.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                9
            } else {
                19
            }
        } else if (v.id == R.id.char20) {
            charAt = binding.char20.text.toString().trim { it <= ' ' }
            sender = 20
        } else if (v.id == R.id.char21) {
            charAt = binding.char21.text.toString().trim { it <= ' ' }
            sender = 21
        } else if (v.id == R.id.char22) {
            charAt = binding.char22.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                10
            } else {
                22
            }
        } else if (v.id == R.id.char23) {
            charAt = binding.char23.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                11
            } else {
                23
            }
        } else if (v.id == R.id.char24) {
            charAt = binding.char24.text.toString().trim { it <= ' ' }
            sender = if (swarVarnmala == SWAR) {
                12
            } else {
                24
            }
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
            sender = if (swarVarnmala == SWAR) {
                13
            } else {
                28
            }
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
        } else if (v.id == R.id.backBT) {
            sender = 0
            finish()
        } else if (v.id == R.id.swarAlphabets) {
            sender = 0
            swarDisplay()
            randomNumberGenerator()
        } else if (v.id == R.id.varnmalaAlphabets) {
            sender = 0
            varnmalaDisplay()
            randomNumberGenerator()
        }
        if (sender > 0) {
            if (swarVarnmala == SWAR) {
                when (pos) {
                    0 -> if (swarArray[0] == charAt) {
                        binding.charH7.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    1 -> if (swarArray[1] == charAt) {
                        binding.charH8.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    2 -> if (swarArray[2] == charAt) {
                        binding.charH9.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    3 -> if (swarArray[3] == charAt) {
                        binding.charH12.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    4 -> if (swarArray[4] == charAt) {
                        binding.charH13.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    5 -> if (swarArray[5] == charAt) {
                        binding.charH14.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    6 -> if (swarArray[6] == charAt) {
                        binding.charH17.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    7 -> if (swarArray[7] == charAt) {
                        binding.charH18.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    8 -> if (swarArray[8] == charAt) {
                        binding.charH19.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    9 -> if (swarArray[9] == charAt) {
                        binding.charH22.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    10 -> if (swarArray[10] == charAt) {
                        binding.charH23.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    11 -> if (swarArray[11] == charAt) {
                        binding.charH24.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    12 -> if (swarArray[12] == charAt) {
                        binding.charH28.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 13) {
                            pos++
                        }
                        swarVarnmala = VARNMALA
                        randomNumberGenerator()
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                }
            } else {
                when (pos) {
                    0 -> if (varnmalaArray[0] == charAt) {
                        binding.charH1.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    1 -> if (varnmalaArray[1] == charAt) {
                        binding.charH2.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    2 -> if (varnmalaArray[2] == charAt) {
                        binding.charH3.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    3 -> if (varnmalaArray[3] == charAt) {
                        binding.charH4.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    4 -> if (varnmalaArray[4] == charAt) {
                        binding.charH5.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    5 -> if (varnmalaArray[5] == charAt) {
                        binding.charH6.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    6 -> if (varnmalaArray[6] == charAt) {
                        binding.charH7.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    7 -> if (varnmalaArray[7] == charAt) {
                        binding.charH8.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    8 -> if (varnmalaArray[8] == charAt) {
                        binding.charH9.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    9 -> if (varnmalaArray[9] == charAt) {
                        binding.charH10.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    10 -> if (varnmalaArray[10] == charAt) {
                        binding.charH11.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    11 -> if (varnmalaArray[11] == charAt) {
                        binding.charH12.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    12 -> if (varnmalaArray[12] == charAt) {
                        binding.charH13.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    13 -> if (varnmalaArray[13] == charAt) {
                        binding.charH14.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    14 -> if (varnmalaArray[14] == charAt) {
                        binding.charH15.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    15 -> if (varnmalaArray[15] == charAt) {
                        binding.charH16.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    16 -> if (varnmalaArray[16] == charAt) {
                        binding.charH17.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    17 -> if (varnmalaArray[17] == charAt) {
                        binding.charH18.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    18 -> if (varnmalaArray[18] == charAt) {
                        binding.charH19.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    19 -> if (varnmalaArray[19] == charAt) {
                        binding.charH20.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    20 -> if (varnmalaArray[20] == charAt) {
                        binding.charH21.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    21 -> if (varnmalaArray[21] == charAt) {
                        binding.charH22.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    22 -> if (varnmalaArray[22] == charAt) {
                        binding.charH23.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    23 -> if (varnmalaArray[23] == charAt) {
                        binding.charH24.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    24 -> if (varnmalaArray[24] == charAt) {
                        binding.charH25.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    25 -> if (varnmalaArray[25] == charAt) {
                        binding.charH26.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    26 -> if (varnmalaArray[26] == charAt) {
                        binding.charH27.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    27 -> if (varnmalaArray[27] == charAt) {
                        binding.charH28.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    28 -> if (varnmalaArray[28] == charAt) {
                        binding.charH29.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    29 -> if (varnmalaArray[29] == charAt) {
                        binding.charH30.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    30 -> if (varnmalaArray[30] == charAt) {
                        binding.charH31.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    31 -> if (varnmalaArray[31] == charAt) {
                        binding.charH32.text = charAt
                        startSoundService(CHEERS_SOUND)
                        disable(sender)
                        if (pos < 33) {
                            pos++
                        }
                    } else {
                        startSoundService(AWW_SOUND)
                    }
                    32 -> if (varnmalaArray[32] == charAt) {
                        binding.charH33.text = charAt
                        startSoundService(CHEERS_SOUND)
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

    fun disable(number: Int) {
        if (swarVarnmala == SWAR) {
            when (number) {
                1 -> {
                    binding.char7.alpha = 0.5f
                    binding.char7.isClickable = false
                }
                2 -> {
                    binding.char8.alpha = 0.5f
                    binding.char8.isClickable = false
                }
                3 -> {
                    binding.char9.alpha = 0.5f
                    binding.char9.isClickable = false
                }
                4 -> {
                    binding.char12.alpha = 0.5f
                    binding.char12.isClickable = false
                }
                5 -> {
                    binding.char13.alpha = 0.5f
                    binding.char13.isClickable = false
                }
                6 -> {
                    binding.char14.alpha = 0.5f
                    binding.char14.isClickable = false
                }
                7 -> {
                    binding.char17.alpha = 0.5f
                    binding.char17.isClickable = false
                }
                8 -> {
                    binding.char18.alpha = 0.5f
                    binding.char18.isClickable = false
                }
                9 -> {
                    binding.char19.alpha = 0.5f
                    binding.char19.isClickable = false
                }
                10 -> {
                    binding.char22.alpha = 0.5f
                    binding.char22.isClickable = false
                }
                11 -> {
                    binding.char23.alpha = 0.5f
                    binding.char23.isClickable = false
                }
                12 -> {
                    binding.char24.alpha = 0.5f
                    binding.char24.isClickable = false
                }
                13 -> {
                    binding.char28.alpha = 0.5f
                    binding.char28.isClickable = false
                }
            }
        } else {
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

    private fun alert() {
        val layoutInflater: LayoutInflater = LayoutInflater.from(this@Level3)
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
            swarVarnmala = SWAR
            randomNumberGenerator()
            enableAll()
        })
    }

    private fun startSoundService(soundToPlay: Int) {
        Thread {
            val intent = Intent(this@Level3, SoundService::class.java)
            intent.putExtra("Sound_To_Play", soundToPlay)
            startService(intent)
        }.start()
    }

    private fun stopSoundService() {
        Thread { stopService(Intent(this@Level3, SoundService::class.java)) }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("log", "onDestroy")
        stopSoundService()
    }

    override fun onPause() {
        super.onPause()
        Log.d("log", "onPause")
        stopSoundService()
    }

    private fun randomNumberGenerator() {
        randomGenerator = Random()
        mList = ArrayList()
        if (mList!!.size != 0) {
            mList!!.clear()
        }
        enableAll()
        if (swarVarnmala == SWAR) {
            mList!!.addAll(Arrays.asList(*swarArray))
            swarDisplay()
        } else {
            mList!!.addAll(Arrays.asList(*varnmalaArray))
            varnmalaDisplay()
        }
        var id = 0
        do {
            val position = randomGenerator!!.nextInt(mList!!.size)
            val carAtPosition = mList!![position]
            if (swarVarnmala == SWAR) {
                when (id) {
                    0 -> binding.char7.text = carAtPosition
                    1 -> binding.char8.text = carAtPosition
                    2 -> binding.char9.text = carAtPosition
                    3 -> binding.char12.text = carAtPosition
                    4 -> binding.char13.text = carAtPosition
                    5 -> binding.char14.text = carAtPosition
                    6 -> binding.char17.text = carAtPosition
                    7 -> binding.char18.text = carAtPosition
                    8 -> binding.char19.text = carAtPosition
                    9 -> binding.char22.text = carAtPosition
                    10 -> binding.char23.text = carAtPosition
                    11 -> binding.char24.text = carAtPosition
                    12 -> binding.char28.text = carAtPosition
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
        binding.charH1.text = null
        binding.charH2.text = null
        binding.charH3.text = null
        binding.charH4.text = null
        binding.charH5.text = null
        binding.charH6.text = null
        binding.charH7.text = null
        binding.charH8.text = null
        binding.charH9.text = null
        binding.charH10.text = null
        binding.charH11.text = null
        binding.charH12.text = null
        binding.charH13.text = null
        binding.charH14.text = null
        binding.charH15.text = null
        binding.charH16.text = null
        binding.charH17.text = null
        binding.charH18.text = null
        binding.charH19.text = null
        binding.charH20.text = null
        binding.charH21.text = null
        binding.charH22.text = null
        binding.charH23.text = null
        binding.charH24.text = null
        binding.charH25.text = null
        binding.charH26.text = null
        binding.charH27.text = null
        binding.charH28.text = null
        binding.charH29.text = null
        binding.charH30.text = null
        binding.charH31.text = null
        binding.charH32.text = null
        binding.charH33.text = null
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
    }

    private fun swarDisplay() {
        swarVarnmala = SWAR
        binding.titleLabel.text = "Arrange\nthe\nVowels\n(स्वर)"
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
        binding.charH1.visibility = View.INVISIBLE
        binding.charH2.visibility = View.INVISIBLE
        binding.charH3.visibility = View.INVISIBLE
        binding.charH4.visibility = View.INVISIBLE
        binding.charH5.visibility = View.INVISIBLE
        binding.charH6.visibility = View.INVISIBLE
        binding.charH7.visibility = View.VISIBLE
        binding.charH8.visibility = View.VISIBLE
        binding.charH9.visibility = View.VISIBLE
        binding.charH10.visibility = View.INVISIBLE
        binding.charH11.visibility = View.INVISIBLE
        binding.charH12.visibility = View.VISIBLE
        binding.charH13.visibility = View.VISIBLE
        binding.charH14.visibility = View.VISIBLE
        binding.charH15.visibility = View.INVISIBLE
        binding.charH16.visibility = View.INVISIBLE
        binding.charH17.visibility = View.VISIBLE
        binding.charH18.visibility = View.VISIBLE
        binding.charH19.visibility = View.VISIBLE
        binding.charH20.visibility = View.INVISIBLE
        binding.charH21.visibility = View.INVISIBLE
        binding.charH22.visibility = View.VISIBLE
        binding.charH23.visibility = View.VISIBLE
        binding.charH24.visibility = View.VISIBLE
        binding.charH25.visibility = View.INVISIBLE
        binding.charH26.visibility = View.INVISIBLE
        binding.charH27.visibility = View.INVISIBLE
        binding.charH28.visibility = View.VISIBLE
        binding.charH29.visibility = View.INVISIBLE
        binding.charH30.visibility = View.INVISIBLE
        binding.charH31.visibility = View.INVISIBLE
        binding.charH32.visibility = View.INVISIBLE
        binding.charH33.visibility = View.INVISIBLE
    }

    private fun varnmalaDisplay() {
        swarVarnmala = VARNMALA
        binding.titleLabel.text = "Arrange\nthe\nConsonants\n(व्यंजन)"
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
        binding.charH1.visibility = View.VISIBLE
        binding.charH2.visibility = View.VISIBLE
        binding.charH3.visibility = View.VISIBLE
        binding.charH4.visibility = View.VISIBLE
        binding.charH5.visibility = View.VISIBLE
        binding.charH6.visibility = View.VISIBLE
        binding.charH7.visibility = View.VISIBLE
        binding.charH8.visibility = View.VISIBLE
        binding.charH9.visibility = View.VISIBLE
        binding.charH10.visibility = View.VISIBLE
        binding.charH11.visibility = View.VISIBLE
        binding.charH12.visibility = View.VISIBLE
        binding.charH13.visibility = View.VISIBLE
        binding.charH14.visibility = View.VISIBLE
        binding.charH15.visibility = View.VISIBLE
        binding.charH16.visibility = View.VISIBLE
        binding.charH17.visibility = View.VISIBLE
        binding.charH18.visibility = View.VISIBLE
        binding.charH19.visibility = View.VISIBLE
        binding.charH20.visibility = View.VISIBLE
        binding.charH21.visibility = View.VISIBLE
        binding.charH22.visibility = View.VISIBLE
        binding.charH23.visibility = View.VISIBLE
        binding.charH24.visibility = View.VISIBLE
        binding.charH25.visibility = View.VISIBLE
        binding.charH26.visibility = View.VISIBLE
        binding.charH27.visibility = View.VISIBLE
        binding.charH28.visibility = View.VISIBLE
        binding.charH29.visibility = View.VISIBLE
        binding.charH30.visibility = View.VISIBLE
        binding.charH31.visibility = View.VISIBLE
        binding.charH32.visibility = View.VISIBLE
        binding.charH33.visibility = View.VISIBLE
    }
}