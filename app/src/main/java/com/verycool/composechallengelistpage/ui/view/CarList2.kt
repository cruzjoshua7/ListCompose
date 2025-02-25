package com.verycool.composechallengelistpage.ui.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.verycool.composechallengelistpage.repository.Car2

@Composable
fun CarList2(cars:List<Car2>){
    LazyColumn {
        items(cars){ car ->
            CarCard2(car)
        }
    }
}

@Composable
fun CarCard2(car:Car2, modifier: Modifier=Modifier){
    Card(
        modifier = modifier
            .border(2.dp, Color.Black)
            .padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Row {
                Text(text = "Car4Sale")
            }
            Row {
                Text(text = "Type: ")
                Text(text = "${car.brand} ${car.name}")
            }
            Row {
                Text(text = "Description: ")
                Text(text = "${car.color} ${car.price}")
            }
            Row {
                Text(text = car.description)
            }
        }
    }
}