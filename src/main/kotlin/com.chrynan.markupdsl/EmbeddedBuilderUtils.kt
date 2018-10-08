package com.chrynan.markupdsl

import com.chrynan.markup.BlockTag

class EmbeddedBuilder(var type: String) {

    var format: String? = null
    var sourceId: String? = null
    var sourceUrl: String? = null
    var content: String? = null

    internal fun build() = BlockTag.Embedded(
            type = type,
            format = format,
            sourceId = sourceId,
            sourceUrl = sourceUrl,
            content = content)
}