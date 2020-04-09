package ru.skillbranch.skillarticles.viewmodels

import java.util.*

data class ArticleState(
    val isDarkMode: Boolean = false,
    val isBigText: Boolean = false,
    val isLike: Boolean = false,
    val isBookmark: Boolean = false,
    val isLoadingContent: Boolean = false,
    val shareLink: String = "",
    val title: String = "",
    val category: String = "",
    val author: String = "",
    val categoryIcon: String = "",
    val poster: String = "",
    val date: Date = Date(),
    val content: String = "",
    val isShowMenu: Boolean = false
)
