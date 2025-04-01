package com.example.BAITAPTUAN4
import com.example.BAITAPTUAN4.ui_scene.Scene1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.BAITAPTUAN4.ui_scene.Scene2
import com.example.BAITAPTUAN4.ui_scene.Scene3


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavigation()
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Scene1") {
        composable("Scene1") { Scene1(navController) }
        composable("Scene2") { Scene2(navController) }
        composable("Scene3") { Scene3(navController) }
    }
}
