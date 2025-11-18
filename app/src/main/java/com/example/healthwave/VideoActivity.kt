package com.example.healthwave

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.textfield.TextInputLayout
import com.zegocloud.uikit.plugin.invitation.ZegoInvitationType
import com.zegocloud.uikit.prebuilt.call.ZegoUIKitPrebuiltCallConfig
import com.zegocloud.uikit.prebuilt.call.invite.ZegoUIKitPrebuiltCallConfigProvider
import com.zegocloud.uikit.prebuilt.call.invite.ZegoUIKitPrebuiltCallInvitationConfig
import com.zegocloud.uikit.prebuilt.call.invite.ZegoUIKitPrebuiltCallInvitationService
import com.zegocloud.uikit.prebuilt.call.invite.widget.ZegoSendCallInvitationButton
import com.zegocloud.uikit.service.defines.ZegoUIKitUser
import java.util.Random

class VideoActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_video)

                // Setup bottom navigation
                val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

                bottomNavigationView.setOnItemSelectedListener { menuItem ->
                    when (menuItem.itemId) {
                        R.id.bottom_home -> {
                            val intent = Intent(this, ActivityHome::class.java)
                            startActivity(intent)
                            true
                        }
                        R.id.bottom_virtualconsult -> {
                            val intent = Intent(this, VirtualConsultActivity::class.java)
                            startActivity(intent)
                            true
                        }
                        R.id.bottom_diagnosis -> {
                            val intent = Intent(this, BotActivity::class.java)
                            startActivity(intent)
                            true
                        }
                        else -> false
                    }
                }

                val yourUserID = findViewById<TextView>(R.id.your_user_id)
                val generateUserID = generateUserID()
                yourUserID.text = "Your User ID :$generateUserID"
                initCallInviteService(generateUserID)
                initVoiceButton()
                initVideoButton()
        }

        private fun initVideoButton() {
                val newVideoCall = findViewById<ZegoSendCallInvitationButton>(R.id.new_video_call)
                newVideoCall.setIsVideoCall(true)
                newVideoCall.setOnClickListener { v: View? ->
                        val inputLayout =
                                findViewById<TextInputLayout>(R.id.target_user_id)
                        val targetUserID = inputLayout.editText!!.getText().toString()
                        val split =
                                targetUserID.split(",".toRegex()).dropLastWhile { it.isEmpty() }
                                        .toTypedArray()
                        val users: MutableList<ZegoUIKitUser> =
                                ArrayList()
                        for (userID in split) {
                                val userName = userID + "_name"
                                users.add(ZegoUIKitUser(userID, userName))
                        }
                        newVideoCall.setInvitees(users)
                }
        }

        private fun initVoiceButton() {
                val newVoiceCall = findViewById<ZegoSendCallInvitationButton>(R.id.new_voice_call)
                newVoiceCall.setIsVideoCall(false)
                newVoiceCall.setOnClickListener { v: View? ->
                        val inputLayout =
                                findViewById<TextInputLayout>(R.id.target_user_id)
                        val targetUserID = inputLayout.editText!!.getText().toString()
                        val split =
                                targetUserID.split(",".toRegex()).dropLastWhile { it.isEmpty() }
                                        .toTypedArray()
                        val users: MutableList<ZegoUIKitUser> =
                                ArrayList()
                        for (userID in split) {
                                val userName = userID + "_name"
                                users.add(ZegoUIKitUser(userID, userName))
                        }
                        newVoiceCall.setInvitees(users)
                }
        }

        fun initCallInviteService(generateUserID: String) {
                val appID: Long = 161064806
                val appSign = "5fdb68068e6b4a350aadd876225d79ebbd6f22d4f596533d552dc29a8c5b08a9"
                val userName = generateUserID + "_" + Build.MANUFACTURER
                val callInvitationConfig = ZegoUIKitPrebuiltCallInvitationConfig()
                callInvitationConfig.provider =
                        ZegoUIKitPrebuiltCallConfigProvider { invitationData ->
                                var config: ZegoUIKitPrebuiltCallConfig? = null
                                val isVideoCall = invitationData.type == ZegoInvitationType.VIDEO_CALL.value
                                val isGroupCall = invitationData.invitees.size > 1
                                config = if (isVideoCall && isGroupCall) {
                                        ZegoUIKitPrebuiltCallConfig.groupVideoCall()
                                } else if (!isVideoCall && isGroupCall) {
                                        ZegoUIKitPrebuiltCallConfig.groupVoiceCall()
                                } else if (!isVideoCall) {
                                        ZegoUIKitPrebuiltCallConfig.oneOnOneVoiceCall()
                                } else {
                                        ZegoUIKitPrebuiltCallConfig.oneOnOneVideoCall()
                                }
                                config
                        }
                ZegoUIKitPrebuiltCallInvitationService.init(
                        application, appID, appSign, generateUserID, userName,
                        callInvitationConfig
                )
        }

        private fun generateUserID(): String {
                val builder = StringBuilder()
                val random = Random()
                while (builder.length < 5) {
                        val nextInt = random.nextInt(10)
                        if (builder.length == 0 && nextInt == 0) {
                                continue
                        }
                        builder.append(nextInt)
                }
                return builder.toString()
        }

        override fun onDestroy() {
                super.onDestroy()
                ZegoUIKitPrebuiltCallInvitationService.unInit()
        }
}