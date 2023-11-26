package com.example.searchapp_hw11.data

import com.example.searchapp_hw11.R.drawable.img1
import com.example.searchapp_hw11.R.drawable.img10
import com.example.searchapp_hw11.R.drawable.img11
import com.example.searchapp_hw11.R.drawable.img12
import com.example.searchapp_hw11.R.drawable.img13
import com.example.searchapp_hw11.R.drawable.img14
import com.example.searchapp_hw11.R.drawable.img2
import com.example.searchapp_hw11.R.drawable.img3
import com.example.searchapp_hw11.R.drawable.img4
import com.example.searchapp_hw11.R.drawable.img5
import com.example.searchapp_hw11.R.drawable.img6
import com.example.searchapp_hw11.R.drawable.img7
import com.example.searchapp_hw11.R.drawable.img8
import com.example.searchapp_hw11.R.drawable.img9
import com.example.searchapp_hw11.model.Animal

object Datasource {
    val animals = listOf(
        Animal("Jellyfish", img1, "Underwater picture of a jellyfish"),
        Animal("Fox", img2, "Edgy picture of a fox"),
        Animal("Turtle", img3, "Turtle in the ocean"),
        Animal("Dog", img4, "Sad dog"),
        Animal("Monkey", img5, "Saddest monkey"),
        Animal("Dolphin", img6, "Happy dolphin"),
        Animal("Panda", img7, "Panda - eats all the time"),
        Animal("Hedgehog", img8, "Who's this cute gentleman"),
        Animal("Penguin", img9, "Confused penguin"),
        Animal("Duck", img10, "Just a duck ducking, nothing to see here"),
        Animal("Squirrel", img11, "Squirrel goes: WHERE ARE MY NUTS???"),
        Animal("Parrot", img12, "Little potatoe parrot"),
        Animal("Rabbit", img13, "Rabbit is about to get eaten"),
        Animal("Tiger", img14, "We all need one good stretch from time to time")
    ).associateBy { it.title }
}