package com.mrpaul.retrofitapi1

data class Product( val images:List<String>,
                    val title:String,
                    val price:Double,
                    val id:Int,
                    val description:String)