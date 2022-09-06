package com.example.newmobile

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirPlaneModeReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirpalneModeEnabled = intent?.getBooleanExtra("state", false) ?: return
        if(isAirpalneModeEnabled) {
            Toast.makeText(context,"Mode Pesawat Aktif", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context,"ModePesawat Tidak Aktif", Toast.LENGTH_LONG).show()

        }
    }
}