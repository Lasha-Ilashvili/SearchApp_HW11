package com.example.searchapp_hw11.data

import com.example.searchapp_hw11.R.drawable.*
import com.example.searchapp_hw11.model.Animal

class Datasource {
    fun getSettings() = listOf(
        Animal(id = 0, title = "Jellyfish", image = img1),
        Animal(id = 1, title = "Fox", image = img2),
        Animal(id = 2, title = "Turtle", image = img3),
        Animal(id = 3, title = "Dog", image = img4),
        Animal(id = 4, title = "Monkey", image = img5),
        Animal(id = 5, title = "Dolphin", image = img6),
        Animal(id = 6, title = "Panda", image = img7),
        Animal(id = 7, title = "Hedgehog", image = img8),
        Animal(id = 8, title = "Penguin", image = img9),
        Animal(id = 9, title = "Duck", image = img10),
        Animal(id = 10, title = "Squirrel", image = img11),
        Animal(id = 11, title = "Parrot", image = img12),
        Animal(id = 12, title = "Rabbit", image = img13),
        Animal(id = 13, title = "Monkey", image = img14),
        Animal(id = 14, title = "Tiger", image = img15)
    )
}