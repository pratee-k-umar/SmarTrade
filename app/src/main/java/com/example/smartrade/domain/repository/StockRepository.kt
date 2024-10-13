package com.example.smartrade.domain.repository

import com.example.smartrade.domain.model.CompanyInfo
import com.example.smartrade.domain.model.CompanyListing
import com.example.smartrade.domain.model.IntraDayInfo
import com.example.smartrade.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntraDayInfo(
        symbol: String
    ): Resource<List<IntraDayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}