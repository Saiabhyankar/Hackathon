package com.example.d_place

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
var colors =mutableStateOf(-1)
var color=mutableStateOf(-1)
var tileColor= mutableListOf(-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1)

@Composable

fun PixelArt() {

    Box() {
        LazyVerticalGrid(columns = GridCells.Fixed(5),
            modifier= Modifier
                .offset(y = 100.dp)
                .fillMaxSize()) {
            items(60) {
                Box(modifier=Modifier.border(2.dp, Color.Black)) {
                    Button(onClick = { if(colors.value==0)
                                    color.value=0
                                    else if(colors.value==1)
                                        color.value=1
                                    else if(colors.value==2)
                                        color.value=2
                                    else if(colors.value==3)
                                        color.value=3
                                    else
                                    color.value=4
                                    tileColor[it]=1

                       },
                        modifier= Modifier
                            .size(height = 50.dp, width = 80.dp)
                            .clip(shape = RectangleShape),
                        colors = ButtonDefaults.buttonColors(containerColor =
                        if(color.value==0 && tileColor[it]==1)
                            Color(255, 255, 0)
                        else if(color.value==1 && tileColor[it]==1)
                            Color(255, 165, 0)
                        else if(color.value==2 && tileColor[it]==1)
                            Color(238, 130, 238)
                        else if(color.value==3 && tileColor[it]==1)
                            Color(0,255,0)
                        else if(color.value==4 && tileColor[it]==1)
                            Color.Black
                        else
                            Color.White)){
                    }
                }
            }
        }
        LazyRow(Modifier.offset(x=5.dp,y = 800.dp)) {
            items(5){
                Button(onClick = { colors.value=it },
                   colors = ButtonDefaults.buttonColors(containerColor = if(it==0) Color(255, 255, 0)
                   else if(it==1)
                       Color(255, 165, 0)
                   else if(it==2)
                       Color(238, 130, 238)
                   else if(it==3)
                       Color(0,255,0)
                   else
                       Color.Black)){

                }
                Spacer(Modifier.padding(12.dp))
            }
        }

    }
}