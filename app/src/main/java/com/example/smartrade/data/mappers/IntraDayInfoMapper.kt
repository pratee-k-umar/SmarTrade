package com.example.smartrade.data.mappers

import java.util.Locale
import com.example.smartrade.data.remote.dto.IntraDayInfoDto
import com.example.smartrade.domain.model.IntraDayInfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun IntraDayInfoDto.toIntraDayInfo(): IntraDayInfo {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timestamp, formatter)
    return IntraDayInfo(date = localDateTime, close = close)
}