package com.example.beatr.uicontrolller

import com.airbnb.epoxy.AsyncEpoxyController


class HomeController : AsyncEpoxyController() {

    private lateinit var title: String

    override fun buildModels() {
        HeaderItemModel_(title)
            .id("${title}_id")
            .addTo(this)

        HeaderItemModel_(title)
            .id("${title}_id")
            .addTo(this)
    }

    fun setTitle(title: String) {
        this.title = title
        requestModelBuild()
    }

}

