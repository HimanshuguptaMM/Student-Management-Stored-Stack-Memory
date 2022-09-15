package com.college.student.usescases

import com.college.student.models.Student
import com.college.student.store.StudentStore
import java.util.Scanner

class UseCaseCreateStudent (private val store:StudentStore):UseCaseTemplate(){
override fun perform(){
    val scannerInput = Scanner(System.`in`)
    println("\n Please input the student name")
    val name = scannerInput.nextLine()

    println("\n please input studentid")
    val studentId = scannerInput.nextLine()
    println("\n please input semester")
    val semester = scannerInput.nextLine()
    println("\n please input mobile number")
    val phoneNumber = scannerInput.nextLine()


    val student = Student(
        name,
        studentId,
        semester,
phoneNumber,
    )
    println(student)
    store.create(student)
}





}