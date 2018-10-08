package com.chrynan.markupdsl

import com.chrynan.markup.BlockTag

class CodeBuilder(var content: String) {

    var sourceID: String? = null
    var language: String? = null

    internal fun build() = BlockTag.Code(
            sourceId = sourceID,
            language = language,
            content = content)
}