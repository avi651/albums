package com.example.avinash.plantquiz

class Plant(genuys : String , species : String , cultivar : String
            , common : String, pictureName : String , description : String , difficulty : Int , id : Int = 0 ) {

    constructor() : this(genuys = "" , species = "" , cultivar = ""
        , common = "", pictureName = "" , description = "" , difficulty = 0 , id = 0 )

     private  var _plantName : String? = null

     var plantName : String?
       get() = _plantName
       set(value) {
           _plantName = value
       }

}