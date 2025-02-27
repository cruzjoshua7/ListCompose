package com.verycool.composechallengelistpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.verycool.composechallengelistpage.repository.Car
import com.verycool.composechallengelistpage.ui.theme.ComposeChallengeListPageTheme
import com.verycool.composechallengelistpage.ui.view.compose.CarList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeChallengeListPageTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp)
                ) { innerPadding ->
                    CarList(
                        cars = List(100){ index ->
                            Car(
                                id = index,
                                name = "Civic",
                                brand = "Honda",
                                color = "blue",
                                price = 19000.00,
                                description ="Great family car with a lot of MPG"
                            )
                        },
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
