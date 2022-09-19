package com.college.student.usescases

import com.college.student.models.Student
import com.college.student.store.StudentStore
import java.util.Scanner

/**
 * This function takes input from the user and if the option is valid, it executes that operation.
 * @param store when the user input the data.it is stores in a memory element.
 * @return perform The user wants to perform from the console.
 */
class UseCaseCreateStudent(private val store: StudentStore) : UseCaseTemplate() {
    override fun perform() {
        val scannerInput = Scanner(System.`in`)
        println("\n Please input the student name")
        val name = scannerInput.nextLine()
        println("\n please input studentid")
        val studentId = scannerInput.nextLine()
        println("\n please input semester")
        val semester = scannerInput.nextLine()
        println("\n please input phoneNUmber")
        var phoneNumber = scannerInput.nextLine()
        while (phoneNumber.length != 10) {
            println("\n please input phoneNUmber")
            phoneNumber = scannerInput.nextLine()
        }
        val student = Student(
            name,
            studentId,
            semester,
            phoneNumber,
        )
        store.create(student)
        println("student created successfully: $student")
    }
}


