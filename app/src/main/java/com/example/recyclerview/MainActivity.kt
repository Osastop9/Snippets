package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf(
            Todo("Number one", false),
            Todo("Number two", false),
            Todo("Number three", false),
            Todo("Number four", false),
            Todo("Number five", false),
            Todo("Number six", false),
            Todo("Number seven", false),
            Todo("Number eight", false),
            Todo("Number nine", false),
            Todo("Number ten", false),
            Todo("Number eleven", false),
            Todo("Number twelve", false)

        )

        val adapter = TodoAdapter(todoList)
        rvTodos.adapter = adapter
        rvTodos.layoutManager  = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title = etTodo.text.toString().trim()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size -1 )
        }
    }
}