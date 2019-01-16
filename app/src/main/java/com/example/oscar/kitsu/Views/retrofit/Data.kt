package com.example.oscar.kitsu.Views.retrofit
import com.google.gson.annotations.SerializedName


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
    @SerializedName("coverImageTopOffset")
    var coverImageTopOffset: Int?,
    @SerializedName("createdAt")
    var createdAt: String?,
    @SerializedName("episodeCount")
    var episodeCount: Int?,
    @SerializedName("nsfw")
    var nsfw: Boolean?,
    @SerializedName("posterImage")
    var posterImage: PosterImage?,
    @SerializedName("showType")
    var showType: String?,
    @SerializedName("slug")
    var slug: String?,
    @SerializedName("subtype")
    var subtype: String?,
    @SerializedName("synopsis")
    var synopsis: String?,
    @SerializedName("updatedAt")
    var updatedAt: String?,
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

