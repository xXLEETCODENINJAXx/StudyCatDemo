package com.StudyCat.StudyCatDemo.controller

import com.StudyCat.StudyCatDemo.model.Student
import com.StudyCat.StudyCatDemo.repository.StudentRepository
import com.StudyCat.StudyCatDemo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class StudentController {

    @Autowired
    lateinit var studentService: StudentService
    private var studentList = mutableListOf(
        Student(1, "Sam", "Kimbinyi", "StudyCat"),
        Student(2, "Nurideen", "Kalmey", "StudyCat"),
        Student(3, "Jawarneh", "Muhammad", "StudyCat")

    )

    @GetMapping("")
    fun getStudents () = studentList

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    fun postStudents(@RequestBody student: Student) : Student {
        val maxId = studentList.maxOfOrNull { it.id } ?: 0
        val nextId = maxId + 1
        val newStudent = Student(id = nextId, firstName = student.firstName, lastName = student.lastName, institution = student.institution)
        println("Adding new student...")
        studentService.addStudent(student)
        studentList.add(newStudent)
        return newStudent

    }

//    @RequestMapping("/findall")
//    fun findAll(): MutableIterable<StudentModel> = repository.findAll()
//
//    @RequestMapping("/findbyid/{id}")
//    fun findById(@PathVariable id: Long)
//            = repository.findById(id)
//
//    @RequestMapping("findbylastname/{lastName}")
//    fun findByLastName(@PathVariable lastName: String)
//            = repository.findByLastName(lastName)

}