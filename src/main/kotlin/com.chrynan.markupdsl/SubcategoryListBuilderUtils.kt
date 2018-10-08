@file:Suppress("unused")

package com.chrynan.markupdsl

class SubcategoryListBuilder {

    private val subcategories = mutableListOf<String>()

    fun subcategory(name: String) {
        subcategories.add(name)
    }

    internal fun build() = subcategories.toList()
}