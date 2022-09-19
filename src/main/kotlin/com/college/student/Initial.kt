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
    processOption(scannerInput.nextInt())
}

fun informUser() {
    println("Hello! Welcome to College")
    Thread.sleep(500)
    println("Please choose from a list of options")
    Thread.sleep(500)
}

/**
 * This function takes input from the user and if the option is valid, it executes that operation.
 * @param optionThatUserChoose This is the option that the user wants to perform.
 * @return A string that denotes user operation.
 *  */
fun processOption(optionThatUserChoose: Int) { //documentation....
    when (optionThatUserChoose) {
        MyConstants.CREATE -> {
            val useCaseCreateStudent = UseCaseCreateStudent(studentStore)
            useCaseCreateStudent.perform()
        }

        MyConstants.DELETE -> {
            val useCaseDeleteStudent = UseCaseDeleteStudent(studentStore)
            useCaseDeleteStudent.perform()
        }

        MyConstants.UPDATE -> {
            val useCaseUpdateStudent = UseCaseUpdateStudent(studentStore)
            useCaseUpdateStudent.perform()
        }

        MyConstants.GETLIST -> {
            val useCaseGetStudent = UseCaseGetStudent(studentStore)
            useCaseGetStudent.perform()
        }

        MyConstants.SEARCH -> {
            val useCaseSearch = UseCaseSearch(studentStore)
            useCaseSearch.perform()
        }

        else -> {
            println("Option not available")
        }
    }
    askUserAgain()
}

/**
 *  showOptions - This is the option that the user wants to choose.
 */
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


