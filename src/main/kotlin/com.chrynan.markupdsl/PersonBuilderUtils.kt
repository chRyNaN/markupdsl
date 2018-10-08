@file:Suppress("unused")

package com.chrynan.markupdsl

import com.chrynan.markup.model.Person

class PersonBuilder(var name: String) {

    var photoUrl: String? = null
    var bioUrl: String? = null

    internal fun build() = Person(
            name = name,
            photoUrl = photoUrl,
            bioUrl = bioUrl)
}

class PersonsListBuilder {

    private val persons = mutableListOf<Person>()

    fun person(name: String, init: (PersonBuilder.() -> Unit)? = null) {
        persons.add(PersonBuilder(name).apply { init?.invoke(this) }.build())
    }

    internal fun build() = persons.toList()
}