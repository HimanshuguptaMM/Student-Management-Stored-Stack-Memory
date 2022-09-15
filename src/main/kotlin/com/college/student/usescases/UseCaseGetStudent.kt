package com.college.student.usescases

import com.college.student.store.StudentStore

class UseCaseGetStudent(private val StudentStore: StudentStore): UseCaseTemplate(){
    override fun perform() {
      StudentStore.getData().forEach{
          println(it)
      }
    }
}