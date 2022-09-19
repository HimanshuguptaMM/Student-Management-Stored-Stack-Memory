package com.college.student.models
/**
 * @param DataClassStudent It is denoted a list of data set allocation attributes abd their values.
 * @return String that denotes user operation.
 * */
data class Student(
    var name: String,
    var semester: String,
    var studentid: String,
    var phone:String,
)
{
    companion object
}