package com.StudyCat.StudyCatDemo.controller

import com.StudyCat.StudyCatDemo.model.StudentModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class StudentController {
    private var studentList = mutableListOf(
        StudentModel(1, "Sam", "Kimbinyi", "StudyCat"),
        StudentModel(2, "Nurideen", "Kalmey", "StudyCat"),
        StudentModel(3, "Jawarneh", "Muhammad", "StudyCat")

    )

    @GetMapping("")
    fun getStudents () = studentList

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    fun postStudents(@RequestBody student: StudentModel) : StudentModel {
        val maxId = studentList.maxOfOrNull { it.id } ?: 0
        val nextId = maxId + 1
        val newStudent = StudentModel(id = nextId, firstName = student.firstName, lastName = student.lastName, institution = student.institution)
        studentList.add(newStudent)
        return newStudent

    }
}