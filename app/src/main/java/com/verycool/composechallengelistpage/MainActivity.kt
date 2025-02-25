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
import com.verycool.composechallengelistpage.repository.Car2
import com.verycool.composechallengelistpage.ui.theme.ComposeChallengeListPageTheme
import com.verycool.composechallengelistpage.ui.view.CarList2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeChallengeListPageTheme {
                Scaffold(modifier = Modifier.fillMaxSize().padding(30.dp)) { innerPadding ->
                    CarList2(
                        cars = List(100) { index ->
                            Car2(id = index, brand = "Toyota", name = "Corolla", color = "red", price = 18000.00, description = "Great family car with good gas mileage " )
                        }
                    )
                }
            }
        }
    }
}
