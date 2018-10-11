package com.chrynan.markupdsl

import com.chrynan.markup.model.Publisher

class PublisherBuilder(var name: String) {

    var url: String? = null
    var logoUrl: String? = null

    internal fun build() = Publisher(
            name = name,
            url = url,
            logoUrl = logoUrl)
}