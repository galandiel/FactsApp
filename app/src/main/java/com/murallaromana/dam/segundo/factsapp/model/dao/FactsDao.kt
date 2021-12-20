package com.murallaromana.dam.segundo.factsapp.model.dao

import com.murallaromana.dam.segundo.factsapp.model.entities.Fact

interface FactsDao {

    fun getAll(): List<Fact>

}