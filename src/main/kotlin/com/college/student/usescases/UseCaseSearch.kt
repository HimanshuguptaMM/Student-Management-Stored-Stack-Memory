package com.college.student.usescases

import com.college.student.models.Student
import com.college.student.store.StudentStore
import java.util.*
import java.util.jar.Attributes.Name

class UseCaseSearch(private val studentStore: StudentStore) : UseCaseTemplate() {
    override fun perform() {
        val systemIn = Scanner(System.`in`)
        println("search by student name")
        val name = systemIn.nextLine()
        val searchstudent = Student(
            name,
            "",
        "",
        "",
        )
        studentStore.search(searchstudent).forEach {
           println(it)
        }
    }
}