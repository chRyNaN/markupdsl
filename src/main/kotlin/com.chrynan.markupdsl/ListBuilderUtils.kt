@file:Suppress("unused")

package com.chrynan.markupdsl

import com.chrynan.markup.BlockTag
import com.chrynan.markup.SpanTag
import com.chrynan.spannable.SpannableText

class ListBuilder {

    private val listItems = mutableListOf<SpannableText<SpanTag.TextSpanTag>>()

    fun listItem(init: TextBuilder.() -> SpannableText<SpanTag.TextSpanTag>) {
        listItems.add(init(TextBuilder))
    }

    internal fun buildOrdered() = BlockTag.OrderedList(listItems = listItems)

    internal fun buildUnordered() = BlockTag.UnorderedList(listItems = listItems)
}