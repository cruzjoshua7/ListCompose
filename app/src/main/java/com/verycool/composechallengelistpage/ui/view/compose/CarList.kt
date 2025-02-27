package com.verycool.composechallengelistpage.ui.view.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.verycool.composechallengelistpage.repository.Car

@Composable
fun CarList(cars: List<Car>, modifier: Modifier = Modifier){
    Column {
        Text(text = "Cars for Sale")
        LazyColumn {
            items(cars) { car ->
                CarCard(car)
            }
        }
    }
}

