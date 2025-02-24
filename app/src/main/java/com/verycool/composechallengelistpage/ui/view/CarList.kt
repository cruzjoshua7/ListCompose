package com.verycool.composechallengelistpage.ui.view

import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.verycool.composechallengelistpage.repository.Car
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp

@Composable
fun CarList(
    cars : List<Car>,
    modifier: Modifier = Modifier
){
    LazyColumn {
        items(cars){ car ->
            CarCard(car)
        }
    }
}

@Composable
fun CarCard(car: Car) {
    Column {
        Row {
            Text(text = "For Sale: ${car.id} ${car.brand} ${car.name}")
            Spacer(modifier = Modifier.size(8.dp))
        }
        Row {
            Text(text = "Description: ${car.color} ${car.desc}")
            Spacer(modifier = Modifier.size(8.dp))
        }
    }
}
