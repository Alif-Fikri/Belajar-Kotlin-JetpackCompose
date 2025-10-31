package com.example.belajarjetpackcompose.formlogin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class LoginUiState(
    val username: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val error: String? = null
)

class LoginViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun onUsernameChange(value: String) {
        _uiState.value = _uiState.value.copy(username = value, error = null)
    }

    fun onPasswordChange(value: String) {
        _uiState.value = _uiState.value.copy(password = value, error = null)
    }

    fun login() {
        val current = _uiState.value
        if (current.username.isBlank()) {
            _uiState.value = current.copy(error = "Nama tidak boleh kosong")
            return
        }
        if (current.password.length < 4) {
            _uiState.value = current.copy(error = "Password minimal 4 karakter")
            return
        }

        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)

            delay(900)
            val success = current.password.contains("123")
            if (success) {
                _uiState.value = _uiState.value.copy(isLoading = false, error = null)
            } else {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = "Login gagal: kombinasi belum cocok (demo)"
                )
            }
        }
    }

    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }
}

