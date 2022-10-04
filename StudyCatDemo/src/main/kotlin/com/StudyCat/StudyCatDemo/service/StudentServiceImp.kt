package com.StudyCat.StudyCatDemo.service

import com.StudyCat.StudyCatDemo.model.Student
import com.StudyCat.StudyCatDemo.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class StudentServiceImp: StudentService {

    @Autowired
    lateinit var repository: StudentRepository
    override fun addStudent(student: Student) {
        repository.save(student)
        println("Student Saved!")
    }
}