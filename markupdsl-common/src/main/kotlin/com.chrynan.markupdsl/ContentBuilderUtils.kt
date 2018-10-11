@file:Suppress("unused")

package com.chrynan.markupdsl

import com.chrynan.markup.BlockTag
import com.chrynan.markup.SpanTag
import com.chrynan.markup.model.Content
import com.chrynan.spannable.SpannableText

class ContentBuilder {

    private val tags = mutableListOf<BlockTag>()

    fun text(init: TextBuilder.() -> SpannableText<SpanTag.TextSpanTag>) {
        tags.add(BlockTag.Text(init(TextBuilder)))
    }

    fun text(text: String) {
        tags.add(BlockTag.Text(TextBuilder.plain(text)))
    }

    fun headerOne(content: String) {
        tags.add(BlockTag.HeaderOne(content = content))
    }

    fun headerTwo(content: String) {
        tags.add(BlockTag.HeaderTwo(content = content))
    }

    fun headerThree(content: String) {
        tags.add(BlockTag.HeaderThree(content = content))
    }

    fun attentionNote(init: TextBuilder.() -> SpannableText<SpanTag.TextSpanTag>) {
        tags.add(BlockTag.AttentionNote(init(TextBuilder)))
    }

    fun image(sourceUrl: String, init: (MediaBuilder.() -> Unit)? = null) {
        tags.add(MediaBuilder(sourceUrl = sourceUrl).apply { init?.invoke(this) }.buildImage())
    }

    fun video(sourceUrl: String, init: (MediaBuilder.() -> Unit)? = null) {
        tags.add(MediaBuilder(sourceUrl = sourceUrl).apply { init?.invoke(this) }.buildVideo())
    }

    fun audio(sourceUrl: String, init: (MediaBuilder.() -> Unit)? = null) {
        tags.add(MediaBuilder(sourceUrl = sourceUrl).apply { init?.invoke(this) }.buildAudio())
    }

    fun quote(sourceID: String? = null, init: QuoteBuilder.() -> SpannableText<SpanTag.QuoteSpanTag>) {
        tags.add(BlockTag.Quote(sourceId = sourceID, content = init(QuoteBuilder)))
    }

    fun orderedList(init: ListBuilder.() -> Unit) {
        tags.add(ListBuilder().apply(init).buildOrdered())
    }

    fun unorderedList(init: ListBuilder.() -> Unit) {
        tags.add(ListBuilder().apply(init).buildUnordered())
    }

    fun code(content: String, init: (CodeBuilder.() -> Unit)? = null) {
        tags.add(CodeBuilder(content).apply { init?.invoke(this) }.build())
    }

    fun embedded(type: String, init: (EmbeddedBuilder.() -> Unit)? = null) {
        tags.add(EmbeddedBuilder(type).apply { init?.invoke(this) }.build())
    }

    internal fun build() = Content(tags = tags)
}

fun content(init: ContentBuilder.() -> Unit) = ContentBuilder().apply(init).build()