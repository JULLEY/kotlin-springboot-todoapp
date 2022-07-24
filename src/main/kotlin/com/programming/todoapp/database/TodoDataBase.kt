package com.programming.todoapp.database

data class TodoDataBase (
    var index: Int=0,
    var todoLists: MutableList<String> = mutableListOf()
){
    fun init(){
        this.todoLists = mutableListOf()
        println("[DEBUG] todo database init")
    }
}