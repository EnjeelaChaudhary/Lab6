package com.example.lab7

import java.io.Serializable

class Person:Serializable {
    var Name: String;
    var Address: String;


    constructor(name:String,address:String, Gender:String,Mobile:String){
        this.Name=name;
        this.Address=address;



    }
    override fun toString():String{
        return Name;
    }
}