package com.example.stateapp.model

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class EstadoDataStore( val contex : Context) {

    val Context.dataStore by preferencesDataStore("preferences-usuario")

    private val ESTADO_ACTIVADO = booleanPreferencesKey("modo-activado")

    suspend fun guardarEstado(valor: Boolean){
        contex.dataStore.edit { preferencias -> preferencias[ESTADO_ACTIVADO]=valor}
    }

    fun obtenerEstado(): Flow<Boolean?>{
        return contex.dataStore.data.map { preferencias -> preferencias[ESTADO_ACTIVADO]
    }


}



}