package com.example.belajarjetpackcompose.formlogin

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MyLoginScreenWithViewModel(
    viewModel: LoginViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LoginForm(
        username = uiState.username,
        password = uiState.password,
        isLoading = uiState.isLoading,
        error = uiState.error,
        onUsernameChange = viewModel::onUsernameChange,
        onPasswordChange = viewModel::onPasswordChange,
        onSubmit = viewModel::login
    )
}
