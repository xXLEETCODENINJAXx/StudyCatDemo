package com.StudyCat.StudyCatDemo.repository

import com.StudyCat.StudyCatDemo.model.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository



@Repository
interface StudentRepository: CrudRepository<Student, Long> {

}