package com.example.smartrade.di

import com.example.smartrade.data.csv.CSVParser
import com.example.smartrade.data.csv.CompanyListingParser
import com.example.smartrade.data.csv.IntraDayInfoParser
import com.example.smartrade.data.repository.StockRepositoryImpl
import com.example.smartrade.domain.model.CompanyListing
import com.example.smartrade.domain.model.IntraDayInfo
import com.example.smartrade.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntraDayInfoParser(
        intraDayInfoParser: IntraDayInfoParser
    ): CSVParser<IntraDayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}