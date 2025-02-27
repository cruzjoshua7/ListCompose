package com.verycool.composechallengelistpage.ui.view.compose

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.verycool.composechallengelistpage.repository.Car

@Composable
fun CarCard(car: Car, modifier: Modifier=Modifier){
    Card(
        modifier = modifier
            .border(2.dp, Color.Black )
            .padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "Car Icon",
                modifier = Modifier
                    .size(40.dp)
                    .padding(8.dp)
            )

            Column(modifier = Modifier.padding(8.dp)) {
                Text(text = "${car.id} ${car.brand} ${car.name}")
                Text(text = "Color: ${car.color} Price: ${car.price}")
                Text(text = "Description")
                Text(text = car.description)
            }
        }
    }
}