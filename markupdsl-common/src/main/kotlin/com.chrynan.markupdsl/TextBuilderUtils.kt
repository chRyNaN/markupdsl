@file:Suppress("unused")

package com.chrynan.markupdsl

import com.chrynan.markup.SpanTag
import com.chrynan.spannable.MutableSpannableCharSequence
import com.chrynan.spannable.MutableSpannableText
import com.chrynan.spannable.SpannableText

object TextBuilder

fun TextBuilder.bold(text: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Bold(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length)))

fun TextBuilder.bold(textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Bold(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length)))
        }

fun TextBuilder.boldWrapper(textAccessor: TextBuilder.() -> SpannableText<SpanTag.TextSpanTag>): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor(this).let { spannableText ->
            MutableSpannableCharSequence(
                    sourceText = spannableText.text,
                    sourceSpans = spannableText.spans +
                            SpanTag.TextSpanTag.Bold(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = spannableText.text.length))
        }

fun TextBuilder.italic(text: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Italic(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length)))

fun TextBuilder.italic(textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Italic(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length)))
        }

fun TextBuilder.italicWrapper(textAccessor: TextBuilder.() -> SpannableText<SpanTag.TextSpanTag>): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor(this).let { spannableText ->
            MutableSpannableCharSequence(
                    sourceText = spannableText.text,
                    sourceSpans = spannableText.spans +
                            SpanTag.TextSpanTag.Italic(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = spannableText.text.length))
        }

fun TextBuilder.boldAndItalic(text: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.BoldAndItalic(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length)))

fun TextBuilder.boldAndItalic(textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.BoldAndItalic(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length)))
        }

fun TextBuilder.boldAndItalicWrapper(textAccessor: TextBuilder.() -> SpannableText<SpanTag.TextSpanTag>): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor(this).let { spannableText ->
            MutableSpannableCharSequence(
                    sourceText = spannableText.text,
                    sourceSpans = spannableText.spans +
                            SpanTag.TextSpanTag.BoldAndItalic(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = spannableText.text.length))
        }

fun TextBuilder.highlight(text: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Highlight(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length)))

fun TextBuilder.highlight(textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Highlight(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length)))
        }

fun TextBuilder.highlightWrapper(textAccessor: () -> SpannableText<SpanTag.TextSpanTag>): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { spannableText ->
            MutableSpannableCharSequence(
                    sourceText = spannableText.text,
                    sourceSpans = spannableText.spans +
                            SpanTag.TextSpanTag.Highlight(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = spannableText.text.length))
        }

fun TextBuilder.subscript(text: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Subscript(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length)))

fun TextBuilder.subscript(textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Subscript(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length)))
        }

fun TextBuilder.superscript(text: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Superscript(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length)))

fun TextBuilder.superscript(textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Superscript(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length)))
        }

fun TextBuilder.link(text: String, url: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Link(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                url = url)))

fun TextBuilder.link(url: String, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Link(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    url = url)))
        }

fun TextBuilder.relativeLink(text: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.RelativeLink(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length)))

fun TextBuilder.relativeLink(textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.RelativeLink(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length)))
        }

fun TextBuilder.footNoteSource(text: String, sourceId: String, name: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.FootNoteSource(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                sourceId = sourceId,
                                name = name)))

fun TextBuilder.footNoteSource(sourceId: String, name: String, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.FootNoteSource(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    sourceId = sourceId,
                                    name = name)))
        }

fun TextBuilder.emoji(text: String, description: String? = null): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Emoji(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                description = description)))

fun TextBuilder.emoji(description: String? = null, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Emoji(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    description = description)))
        }

fun TextBuilder.epochTime(text: String, millisecondsSinceEpoch: Long): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.EpochTime(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                millisecondsSinceEpoch = millisecondsSinceEpoch)))

fun TextBuilder.epochTime(millisecondsSinceEpoch: Long, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.EpochTime(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    millisecondsSinceEpoch = millisecondsSinceEpoch)))
        }

fun TextBuilder.timeFormat(text: String, format: String, value: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.TimeFormat(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                format = format,
                                value = value)))

fun TextBuilder.timeFormat(format: String, value: String, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.TimeFormat(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    format = format,
                                    value = value)))
        }

fun TextBuilder.timeDuration(text: String, unit: String, value: Number): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.TimeDuration(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                unit = unit,
                                value = value)))

fun TextBuilder.timeDuration(unit: String, value: Number, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.TimeDuration(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    unit = unit,
                                    value = value)))
        }

fun TextBuilder.timeRange(text: String, startMillisecondsSinceEpoch: Long, endMillisecondsSinceEpoch: Long): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.TimeRange(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                startMillisecondsSinceEpoch = startMillisecondsSinceEpoch,
                                endMillisecondsSinceEpoch = endMillisecondsSinceEpoch)))

fun TextBuilder.timeRange(startMillisecondsSinceEpoch: Long, endMillisecondsSinceEpoch: Long, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.TimeRange(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    startMillisecondsSinceEpoch = startMillisecondsSinceEpoch,
                                    endMillisecondsSinceEpoch = endMillisecondsSinceEpoch)))
        }

fun TextBuilder.locationPlaceId(text: String, placeID: String, provider: String, sourceUrl: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.LocationPlaceID(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                placeID = placeID,
                                provider = provider,
                                sourceUrl = sourceUrl)))

fun TextBuilder.locationPlaceId(placeID: String, provider: String, sourceUrl: String, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.LocationPlaceID(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    placeID = placeID,
                                    provider = provider,
                                    sourceUrl = sourceUrl)))
        }

fun TextBuilder.locationLatLong(text: String, latitude: String, longitude: String, altitude: String? = null): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.LocationLatLong(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                latitude = latitude,
                                longitude = longitude,
                                altitude = altitude)))

fun TextBuilder.locationLatLong(latitude: String, longitude: String, altitude: String? = null, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.LocationLatLong(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    latitude = latitude,
                                    longitude = longitude,
                                    altitude = altitude)))
        }

fun TextBuilder.locationAddress(text: String, address: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.LocationAddress(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                address = address)))

fun TextBuilder.locationAddress(address: String, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.LocationAddress(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    address = address)))
        }

fun TextBuilder.unit(text: String, unit: String, value: Number, format: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Unit(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                unit = unit,
                                value = value,
                                format = format)))

fun TextBuilder.unit(unit: String, value: Number, format: String, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Unit(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    unit = unit,
                                    value = value,
                                    format = format)))
        }

fun TextBuilder.currency(text: String, currencyUnit: String, value: Number): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Currency(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                currencyUnit = currencyUnit,
                                value = value)))

fun TextBuilder.currency(currencyUnit: String, value: Number, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Currency(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    currencyUnit = currencyUnit,
                                    value = value)))
        }

fun TextBuilder.number(text: String, value: Number, format: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Number(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                value = value,
                                format = format)))

fun TextBuilder.number(value: Number, format: String, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Number(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    value = value,
                                    format = format)))
        }

fun TextBuilder.inlineQuote(text: String, sourceId: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.InlineQuote(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                sourceId = sourceId)))

fun TextBuilder.inlineQuote(sourceId: String, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.InlineQuote(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    sourceId = sourceId)))
        }

fun TextBuilder.aside(text: String, message: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Aside(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                message = message)))

fun TextBuilder.aside(message: String, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Aside(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    message = message)))
        }

fun TextBuilder.phoneNumber(text: String, fullPhoneNumber: String, countryCode: String? = null, extension: String? = null, number: String? = null): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.PhoneNumber(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                fullPhoneNumber = fullPhoneNumber,
                                countryCode = countryCode,
                                extension = extension,
                                number = number)))

fun TextBuilder.phoneNumber(fullPhoneNumber: String, countryCode: String? = null, extension: String? = null, number: String? = null, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.PhoneNumber(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    fullPhoneNumber = fullPhoneNumber,
                                    countryCode = countryCode,
                                    extension = extension,
                                    number = number)))
        }

fun TextBuilder.person(text: String, name: String, url: String? = null): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(
                sourceText = text,
                sourceSpans = listOf(
                        SpanTag.TextSpanTag.Person(
                                startIndexInclusive = 0,
                                endIndexExclusive = text.length,
                                name = name,
                                url = url)))

fun TextBuilder.person(name: String, url: String? = null, textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        textAccessor().let { text ->
            MutableSpannableCharSequence(
                    sourceText = text,
                    sourceSpans = listOf(
                            SpanTag.TextSpanTag.Person(
                                    startIndexInclusive = 0,
                                    endIndexExclusive = text.length,
                                    name = name,
                                    url = url)))
        }

fun TextBuilder.plain(text: String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(sourceText = text)

fun TextBuilder.plain(textAccessor: () -> String): MutableSpannableText<SpanTag.TextSpanTag> =
        MutableSpannableCharSequence(sourceText = textAccessor())