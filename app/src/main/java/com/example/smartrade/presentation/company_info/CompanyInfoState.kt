package com.example.smartrade.presentation.company_info

import com.example.smartrade.domain.model.CompanyInfo
import com.example.smartrade.domain.model.IntraDayInfo

data class CompanyInfoState (
    val stockInfo: List<IntraDayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)