@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package com.chrynan.markupdsl

import com.chrynan.markup.model.Person
import com.chrynan.markup.model.Publisher
import com.chrynan.markup.model.Source

class SourceListBuilder {

    private val sources = mutableListOf<Source>()

    fun book(id: String, title: String, init: (BookSourceBuilder.() -> Unit)? = null) {
        sources.add(BookSourceBuilder(id = id, title = title).apply { init?.invoke(this) }.build())
    }

    fun magazine(id: String, magazineName: String, init: (MagazineSourceBuilder.() -> Unit)? = null) {
        sources.add(MagazineSourceBuilder(id = id, magazineName = magazineName).apply { init?.invoke(this) }.build())
    }

    fun encyclopedia(id: String, encyclopediaName: String, init: (EncyclopediaSourceBuilder.() -> Unit)? = null) {
        sources.add(EncyclopediaSourceBuilder(id = id, encyclopediaName = encyclopediaName).apply { init?.invoke(this) }.build())
    }

    fun web(id: String, title: String, url: String, init: (WebSourceBuilder.() -> Unit)? = null) {
        sources.add(WebSourceBuilder(id = id, title = title, url = url).apply { init?.invoke(this) }.build())
    }

    fun article(id: String, articleId: String, title: String, url: String, init: (OnlineArticleSourceBuilder.() -> Unit)? = null) {
        sources.add(OnlineArticleSourceBuilder(id = id, articleId = articleId, title = title, url = url).apply { init?.invoke(this) }.build())
    }

    fun direct(id: String, init: (DirectSourceBuilder.() -> Unit)? = null) {
        sources.add(DirectSourceBuilder(id = id).apply { init?.invoke(this) }.build())
    }

    internal fun build() = sources.toList()
}

class BookSourceBuilder(var id: String, var title: String) {

    var publicationDate: Long? = null
    var publisher: Publisher? = null
    var publishingPlace: String? = null
    var edition: Int? = null
    var volume: Int? = null
    var startPage: Int? = null
    var endPage: Int? = null
    var startLine: Int? = null
    var endLine: Int? = null
    var hasConnectionToSource: Boolean? = null
    var sourceConnection: String? = null
    var disclosureStatement: String? = null

    private val authors = mutableListOf<Person>()

    fun authors(init: PersonsListBuilder.() -> Unit) {
        authors.addAll(PersonsListBuilder().apply(init).build())
    }

    internal fun build() = Source.Book(
            id = id,
            title = title,
            publicationDate = publicationDate,
            publisher = publisher,
            publishingPlace = publishingPlace,
            edition = edition,
            volume = volume,
            startPage = startPage,
            endPage = endPage,
            startLine = startLine,
            endLine = endLine,
            hasConnectionToSource = hasConnectionToSource,
            sourceConnection = sourceConnection,
            disclosureStatement = disclosureStatement)
}

class MagazineSourceBuilder(var id: String, var magazineName: String) {

    var articleTitle: String? = null
    var publicationDate: Long? = null
    var publisher: Publisher? = null
    var publishingPlace: String? = null
    var edition: Int? = null
    var volume: Int? = null
    var startPage: Int? = null
    var endPage: Int? = null
    var startLine: Int? = null
    var endLine: Int? = null
    var hasConnectionToSource: Boolean? = null
    var sourceConnection: String? = null
    var disclosureStatement: String? = null

    private val authors = mutableListOf<Person>()

    fun authors(init: PersonsListBuilder.() -> Unit) {
        authors.addAll(PersonsListBuilder().apply(init).build())
    }

    internal fun build() = Source.Magazine(
            id = id,
            magazineName = magazineName,
            articleTitle = articleTitle,
            publicationDate = publicationDate,
            publisher = publisher,
            publishingPlace = publishingPlace,
            edition = edition,
            volume = volume,
            startPage = startPage,
            endPage = endPage,
            startLine = startLine,
            endLine = endLine,
            hasConnectionToSource = hasConnectionToSource,
            sourceConnection = sourceConnection,
            disclosureStatement = disclosureStatement)
}

class EncyclopediaSourceBuilder(var id: String, var encyclopediaName: String) {

    var articleTitle: String? = null
    var publisher: Publisher? = null
    var publicationDate: Long? = null
    var publishingPlace: String? = null
    var edition: Int? = null
    var volume: Int? = null
    var startPage: Int? = null
    var endPage: Int? = null
    var startLine: Int? = null
    var endLine: Int? = null
    var hasConnectionToSource: Boolean? = null
    var sourceConnection: String? = null
    var disclosureStatement: String? = null

    private val authors = mutableListOf<Person>()

    fun authors(init: PersonsListBuilder.() -> Unit) {
        authors.addAll(PersonsListBuilder().apply(init).build())
    }

    internal fun build() = Source.Encyclopedia(
            id = id,
            encyclopediaName = encyclopediaName,
            articleTitle = articleTitle,
            publisher = publisher,
            publicationDate = publicationDate,
            publishingPlace = publishingPlace,
            edition = edition,
            volume = volume,
            startPage = startPage,
            endPage = endPage,
            startLine = startLine,
            endLine = endLine,
            hasConnectionToSource = hasConnectionToSource,
            sourceConnection = sourceConnection,
            disclosureStatement = disclosureStatement)
}

class WebSourceBuilder(var id: String, var title: String, var url: String) {

    var siteTitle: String? = null
    var publisher: Publisher? = null
    var publicationDate: Long? = null
    var publishingPlace: String? = null
    var retrievedDate: Long? = null
    var hasConnectionToSource: Boolean? = null
    var sourceConnection: String? = null
    var disclosureStatement: String? = null

    private val authors = mutableListOf<Person>()
    private val editors = mutableListOf<Person>()

    fun authors(init: PersonsListBuilder.() -> Unit) {
        authors.addAll(PersonsListBuilder().apply(init).build())
    }

    fun editors(init: PersonsListBuilder.() -> Unit) {
        editors.addAll(PersonsListBuilder().apply(init).build())
    }

    internal fun build() = Source.Web(
            id = id,
            title = title,
            url = url,
            siteTitle = siteTitle,
            publisher = publisher,
            publicationDate = publicationDate,
            publishingPlace = publishingPlace,
            retrievedDate = retrievedDate,
            hasConnectionToSource = hasConnectionToSource,
            sourceConnection = sourceConnection,
            disclosureStatement = disclosureStatement)
}

class OnlineArticleSourceBuilder(var id: String, var title: String, var articleId: String, var url: String) {

    var siteTitle: String? = null
    var publisher: Publisher? = null
    var publicationDate: Long? = null
    var publishingPlace: String? = null
    var retrievedDate: Long? = null
    var hasConnectionToSource: Boolean? = null
    var sourceConnection: String? = null
    var disclosureStatement: String? = null

    private val authors = mutableListOf<Person>()
    private val editors = mutableListOf<Person>()

    fun authors(init: PersonsListBuilder.() -> Unit) {
        authors.addAll(PersonsListBuilder().apply(init).build())
    }

    fun editors(init: PersonsListBuilder.() -> Unit) {
        editors.addAll(PersonsListBuilder().apply(init).build())
    }

    internal fun build() = Source.OnlineArticle(
            id = id,
            title = title,
            articleId = articleId,
            url = url,
            siteTitle = siteTitle,
            publisher = publisher,
            publicationDate = publicationDate,
            publishingPlace = publishingPlace,
            retrievedDate = retrievedDate,
            hasConnectionToSource = hasConnectionToSource,
            sourceConnection = sourceConnection,
            disclosureStatement = disclosureStatement)
}

class DirectSourceBuilder(var id: String) {

    var person: Person? = null
    var date: Long? = null
    var credentials: String? = null
    var hasConnectionToSource: Boolean? = null
    var sourceConnection: String? = null
    var disclosureStatement: String? = null
    var communicationMethod: String? = null

    internal fun build() = Source.Direct(
            id = id,
            person = person,
            credentials = credentials,
            date = date,
            hasConnectionToSource = hasConnectionToSource,
            sourceConnection = sourceConnection,
            disclosureStatement = disclosureStatement,
            communicationMethod = communicationMethod)
}