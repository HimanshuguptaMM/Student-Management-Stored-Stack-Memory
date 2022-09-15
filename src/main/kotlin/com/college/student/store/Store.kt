package com.college.student.store



abstract class Store<T>{
    abstract fun create(data: T)
    abstract fun getData()  :List<T>
    abstract fun delete(data: T)
    abstract fun update(data:T)
abstract fun search(data:T) :List<T>
}