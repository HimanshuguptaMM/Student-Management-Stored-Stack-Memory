package com.college.student.usescases

import com.college.student.models.Student
import com.college.student.store.StudentStore

import java.util.*

class UseCaseUpdateStudent(private val studentStore: StudentStore) : UseCaseTemplate() {
    override fun perform() {
        val systemIn = Scanner(System.`in`)
        val name = systemIn.nextLine()
        println("enter the name ")
        val semester = systemIn.nextLine()
        println("enter the semester ")
        val studentid = systemIn.nextLine()
        println("enter the id")
        val phoneNumber = systemIn.nextLine()
        println("enter the phoneNumber ")
        val updatedstudent = Student(
            name,
            semester,
            studentid,
            phoneNumber,
        )
        studentStore.update(updatedstudent)
    }
}