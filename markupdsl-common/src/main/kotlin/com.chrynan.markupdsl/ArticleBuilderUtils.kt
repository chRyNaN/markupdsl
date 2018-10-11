@file:Suppress("unused")

package com.chrynan.markupdsl

import com.chrynan.markup.model.*

class ArticleBuilder(var id: String) {

    var title = ""
    var subTitle = ""
    var description = ""
    var language = ""
    var lastUpdated = 0L
    var created = 0L
    var contentSourceUrl: String? = null
    var category: String? = null
    var imageUrl: String? = null

    private val authors = mutableListOf<Person>()
    private val editors = mutableListOf<Person>()
    private val subcategories = mutableListOf<String>()
    private val tags = mutableListOf<String>()
    private val sources = mutableListOf<Source>()
    private var versionControl: VersionControl? = null
    private var content: Content? = null
    private var publisher: Publisher? = null

    fun authors(init: PersonsListBuilder.() -> Unit) {
        authors.addAll(PersonsListBuilder().apply(init).build())
    }

    fun editors(init: PersonsListBuilder.() -> Unit) {
        editors.addAll(PersonsListBuilder().apply(init).build())
    }

    fun versionControl(versionCode: String, versionNumber: Int, lastUpdated: Long, init: (VersionControlBuilder.() -> Unit)? = null) {
        versionControl = VersionControlBuilder(versionCode = versionCode, versionNumber = versionNumber, lastUpdated = lastUpdated).apply {
            init?.invoke(this)
        }.build()
    }

    fun publisher(name: String, init: (PublisherBuilder.() -> Unit)? = null) {
        publisher = PublisherBuilder(name = name).apply { init?.invoke(this) }.build()
    }

    fun content(init: ContentBuilder.() -> Unit) {
        content = ContentBuilder().apply(init).build()
    }

    fun subcategories(init: SubcategoryListBuilder.() -> Unit) {
        subcategories.addAll(SubcategoryListBuilder().apply(init).build())
    }

    fun tags(init: TagListBuilder.() -> Unit) {
        tags.addAll(TagListBuilder().apply(init).build())
    }

    fun sources(init: SourceListBuilder.() -> Unit) {
        sources.addAll(SourceListBuilder().apply(init).build())
    }

    // TODO add a source function and builder

    internal fun build() = Article(
            id = id,
            authors = authors,
            editors = editors,
            publisher = publisher,
            versionControl = versionControl,
            lastUpdated = lastUpdated,
            created = created,
            title = title,
            subTitle = subTitle,
            description = description,
            category = category,
            subcategories = subcategories,
            imageUrl = imageUrl,
            language = language,
            contentSourceUrl = contentSourceUrl,
            content = content,
            sources = sources)
}

fun article(id: String, init: ArticleBuilder.() -> Unit) = ArticleBuilder(id = id).apply(init).build()