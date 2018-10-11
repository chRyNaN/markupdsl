package com.chrynan.markupdsl

import com.chrynan.markup.model.VersionControl

class VersionControlBuilder(var versionCode: String, var versionNumber: Int, var lastUpdated: Long) {

    var type: String? = null
    var sourceUrl: String? = null

    internal fun build() = VersionControl(
            versionCode = versionCode,
            versionNumber = versionNumber,
            lastUpdated = lastUpdated,
            type = type,
            sourceUrl = sourceUrl)
}