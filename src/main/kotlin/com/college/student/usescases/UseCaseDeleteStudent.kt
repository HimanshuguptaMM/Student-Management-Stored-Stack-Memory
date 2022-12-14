package com.college.student.usescases

import com.college.student.store.StudentStore
import java.util.*

/**
 * @param studentStore the unused data can be delete from studentStore.
 * */
class UseCaseDeleteStudent(private val studentStore: StudentStore) : UseCaseTemplate() {
    override fun perform() {
        val systemIn = Scanner(System.`in`)
        println("choose the student which you want to delete !")
        val student = studentStore.getData()
        for (student in student) {
            println("do yo want to Delete $student")
            val yes = systemIn.nextBoolean()   //boolean operation TRUE OR FALSE
            if (yes) {
                studentStore.delete(student)
                break
            }
        }
    }
}