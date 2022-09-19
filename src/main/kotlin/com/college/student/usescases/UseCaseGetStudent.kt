package com.college.student.usescases

import com.college.student.store.StudentStore

/**
 * @param StudentStore the user stores the data in a memory.
 * */
class UseCaseGetStudent(private val StudentStore: StudentStore) : UseCaseTemplate() {
    override fun perform() {
        StudentStore.getData().forEach {
            println(it)
        }
    }
}