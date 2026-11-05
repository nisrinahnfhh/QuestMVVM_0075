package com.example.p8.uicontroller

enum class Navigasi {
    Formulir,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaApp(
    //edit 1 : parameter viewModel
    modifier: Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navController : NavHostController = rememberNavController()
) {
    Scaffold { isiRuang->
        //edit 2 : tambahkan variabel uiState
        val uiState = viewModel.statusUI.collectAsState()
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,

            modifier = Modifier.padding(isiRuang)){
            composable(route = Navigasi.Formulir.name)