@file:Suppress("unused")

package com.chrynan.markupdsl

class TagListBuilder {

    private val tags = mutableListOf<String>()

    fun tag(name: String) {
        tags.add(name)
    }

    internal fun build() = tags.toList()
}