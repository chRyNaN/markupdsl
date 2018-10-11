@file:Suppress("unused")

package com.chrynan.markupdsl

import com.chrynan.markup.SpanTag
import com.chrynan.spannable.MutableSpannableCharSequence
import com.chrynan.spannable.MutableSpannableText

object QuoteBuilder

fun QuoteBuilder.emphasis(text: String, added: Boolean = false): MutableSpannableText<SpanTag.QuoteSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.QuoteSpanTag.Emphasis(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                added = added)))

fun QuoteBuilder.plain(text: String): MutableSpannableText<SpanTag.QuoteSpanTag> =
        MutableSpannableCharSequence(sourceText = text)