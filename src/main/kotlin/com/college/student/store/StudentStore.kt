package com.college.student.store

import com.college.student.models.Student
import com.college.student.studentStore


class StudentStore : Store<Student>() {
    private val studentList = mutableListOf<Student>()
    override fun create(data: Student) {
        studentList.add(data)
    }

    override fun delete(data: Student) {
        studentList.remove(data)
    }

    override fun update(data: Student) {
        var newStudent: Student? = studentList.firstOrNull { student: Student ->

            student.studentid == data.studentid
        }
        newStudent?.let {
            newStudent.name = data.name
            newStudent.semester = data.semester
            newStudent.phone = data.phone

        }
    }


    override fun search(data: String): MutableList<Student> {
        var searchResult = mutableListOf<Student>() //Consider Student as a Data Type LIKE STRING AND int

            for (i in 0 until studentList.size) { //
                if (i % 2 == 0) {
                    if (studentList[i -1].name == data) {
                        searchResult.add(studentList[i])
                    }
                }
            }



    return searchResult
}


override fun getData(): MutableList<Student> {

    return studentList
}

}

