package com.college.student.usescases

import com.college.student.informUser
import com.college.student.models.Student
import com.college.student.store.StudentStore
import java.util.Scanner
import kotlin.math.max

class UseCaseCreateStudent(private val store: StudentStore) : UseCaseTemplate() {
    override fun perform() {

        val scannerInput = Scanner(System.`in`)
        println("\n Please input the student name")
        val name = scannerInput.nextLine()
        println("\n please input studentid")
        val studentId = scannerInput.nextLine()
        println("\n please input semester")
        val semester = scannerInput.nextLine()

println("\n please type phone number")
        var phoneNumber = scannerInput.nextLine()
        val length = phoneNumber.length
        if (length < 10 || length > 10) {
            println("please enter valid phoneNumber")
 phoneNumber=scannerInput.nextLine()



        }

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


