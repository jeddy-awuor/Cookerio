package com.example.happycooking.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happycooking.PlayfairDisplayFontFamily
import com.example.happycooking.R

@Composable
fun Login(){
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.CenterStart) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Bowl of Vegetables",
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow),
            contentScale = ContentScale.Crop
        )

            Column (modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp),
                verticalArrangement = Arrangement.Center){
                Spacer(modifier = Modifier.height(50.dp))
                Row( modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                    horizontalArrangement = Arrangement.Start){
                    Text(
                        text = "over 1000+ recipes",
                        fontFamily = PlayfairDisplayFontFamily,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row( modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                    horizontalArrangement = Arrangement.Start){
                    Text(
                        text = "Happy",
                        fontFamily = PlayfairDisplayFontFamily,
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.sp
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row( modifier = Modifier
                    .padding(start = 20.dp)
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start){
                    Text(
                        text = "Cooking",
                        fontFamily = PlayfairDisplayFontFamily,
                        fontSize = 50.sp,
                        letterSpacing = 1.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))
                Row( modifier = Modifier
                    .padding(end = 20.dp)
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End){
                    IconButton(onClick = { /* Handle the click here */ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "Forward",
                            tint = Color.Black,
                            modifier = Modifier.size(48.dp)
                        )
                    }
                }
                }


            }


}