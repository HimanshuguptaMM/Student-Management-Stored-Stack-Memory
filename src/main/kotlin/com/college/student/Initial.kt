package com.college.student

import com.college.student.models.Student
import com.college.student.store.StudentStore
import com.college.student.usescases.*

import java.util.*

val studentStore = StudentStore()

object MyConstants {
    const val CREATE = 1
    const val DELETE = 2
    const val UPDATE = 3
    const val GETLIST = 4
    const val SEARCH = 5
}

fun main() {
    informUser()

    askUserAgain()

}

fun askUserAgain() {
    showOptions()

    val scannerInput = Scanner(System.`in`)
    val optionThatUserChoose = scannerInput.nextInt()
    println("Use choose $optionThatUserChoose")

    processOption(optionThatUserChoose)
}

fun informUser() {
    println("Hello! Welcome to College")
    Thread.sleep(500)
    println("Please choose from a list of options")
    Thread.sleep(500)
}

fun processOption(optionThatUserChoose: Int) {
    when (optionThatUserChoose) {
        MyConstants.CREATE -> {
            val useCaseCreateStudent = UseCaseCreateStudent(studentStore)
            useCaseCreateStudent.perform()
            askUserAgain()
        }

        MyConstants.DELETE -> {
            val useCaseDeleteStudent = UseCaseDeleteStudent(studentStore)
            useCaseDeleteStudent.perform()
            askUserAgain()
        }

        MyConstants.UPDATE -> {
            val useCaseUpdateStudent = UseCaseUpdateStudent(studentStore)
            useCaseUpdateStudent.perform()
            askUserAgain()
        }

        MyConstants.GETLIST -> {
            val useCaseGetStudent = UseCaseGetStudent(studentStore)
            useCaseGetStudent.perform()
            askUserAgain()
        }

        MyConstants.SEARCH -> {
            val useCaseSearch = UseCaseSearch(studentStore)
            useCaseSearch.perform()
            askUserAgain()
        }

        else -> {
            println("Option not available")
        }
    }
}
fun showOptions() {
    println("${MyConstants.CREATE}. Create Student")
    Thread.sleep(500)
    println("${MyConstants.DELETE}. Delete Student")
    Thread.sleep(500)
    println("${MyConstants.UPDATE}. Update Student")
    Thread.sleep(500)
    println("${MyConstants.GETLIST}. Get List of Student")
    Thread.sleep(500)
    println("${MyConstants.SEARCH}. Search Student")
}


