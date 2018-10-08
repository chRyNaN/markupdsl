package com.chrynan.markupdsl

import com.chrynan.markup.BlockTag

class MediaBuilder(var sourceUrl: String) {

    var format: String? = null
    var sourceId: String? = null
    var description: String? = null

    internal fun buildImage() = BlockTag.Image(
            format = format,
            sourceId = sourceId,
            sourceUrl = sourceUrl,
            description = description)

    internal fun buildVideo() = BlockTag.Video(
            format = format,
            sourceId = sourceId,
            sourceUrl = sourceUrl,
            description = description)

    internal fun buildAudio() = BlockTag.Audio(
            format = format,
            sourceId = sourceId,
            sourceUrl = sourceUrl,
            description = description)
}