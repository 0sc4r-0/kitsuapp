package com.example.oscar.kitsu.Views.retrofit
import com.google.gson.annotations.SerializedName



data class AnimeData(
    @SerializedName("data")
    var `data`: List<Data?>?
)

data class Data(
    @SerializedName("attributes")
    var attributes: Attributes?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("type")
    var type: String?
)

data class Attributes(
    @SerializedName("ageRating")
    var ageRating: String?,
    @SerializedName("ageRatingGuide")
    var ageRatingGuide: String?,
    @SerializedName("averageRating")
    var averageRating: String?,
    @SerializedName("canonicalTitle")
    var canonicalTitle: String?,
    @SerializedName("episodeCount")
    var episodeCount: Int?,
    @SerializedName("episodeLength")
    var episodeLength: Int?,
    @SerializedName("posterImage")
    var posterImage: PosterImage?,
    @SerializedName("status")
    var status: String?,
    @SerializedName("subtype")
    var subtype: String?,
    @SerializedName("synopsis")
    var synopsis: String?,
    @SerializedName("youtubeVideoId")
    var youtubeVideoId: String?
)

data class PosterImage(
    @SerializedName("large")
    var large: String?,
    @SerializedName("medium")
    var medium: String?,
    @SerializedName("original")
    var original: String?,
    @SerializedName("small")
    var small: String?,
    @SerializedName("tiny")
    var tiny: String?
)