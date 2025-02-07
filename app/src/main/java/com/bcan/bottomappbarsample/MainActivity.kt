package com.bcan.bottomappbarsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.bcan.bottomappbarsample.navigation.BottomAppBarSampleNavigation
import com.bcan.bottomappbarsample.ui.theme.BottomAppBarSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BottomAppBarSampleTheme { BottomAppBarSampleNavigation() }
        }
    }
}