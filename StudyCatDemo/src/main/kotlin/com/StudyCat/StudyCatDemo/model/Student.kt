package com.StudyCat.StudyCatDemo.model

import javax.persistence.*

@Entity
data class Student(
    @Id @GeneratedValue val id: Long,  val firstName: String = "",  val lastName: String = " ",
    val institution: String = " ") {
    constructor() : this(-1) {

    }
}
//) {
//    public constructor() : this(0," ", " ", " ")
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    open var id2: Int? = null
//}