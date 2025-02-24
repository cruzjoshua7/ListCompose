package com.verycool.composechallengelistpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.verycool.composechallengelistpage.repository.Car
import com.verycool.composechallengelistpage.ui.theme.ComposeChallengeListPageTheme
import com.verycool.composechallengelistpage.ui.view.CarList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeChallengeListPageTheme {
                Scaffold(modifier = Modifier.fillMaxSize().padding(30.dp)) { innerPadding ->
                    CarList(
                        cars = List(100) { index ->
                            Car(id = index, "Corolla", "Toyota", "Gret", "Super nice family car good for gas")
                        }
                    )
                }
            }
        }
    }
}
