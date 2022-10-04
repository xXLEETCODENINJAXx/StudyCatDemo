package com.StudyCat.StudyCatDemo.model

import javax.persistence.*

//@Entity
data class StudentModel(
    override var id: Int, override var firstName: String, override var lastName: String,
    override var institution: String) : UserModel
//) {
//    public constructor() : this(0," ", " ", " ")
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    open var id2: Int? = null
//}