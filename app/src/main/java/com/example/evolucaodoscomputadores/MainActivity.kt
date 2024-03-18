package com.example.evolucaodoscomputadores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.evolucaodoscomputadores.ui.theme.EvolucaoDosComputadoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvolucaoDosComputadoresTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EvolucaoApp()
                }
            }
        }
    }
}

@Composable
fun EvolucaoApp() {
    EvolucaoLayout()
}

@Composable
fun EvolucaoLayout() {
val textoModifier = Modifier.padding(top = 8.dp)

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(
            painter = painterResource(id = R.drawable.c1951),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp)
            )
            Text(modifier = textoModifier
                .padding(top = 8.dp),
                text = "1951")
            Text(modifier = textoModifier,
                fontWeight = FontWeight.Bold,
                text = "UNIVAC 1")
            Text(modifier = Modifier
                .padding(top = 16.dp, start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                text = stringResource(R.string.desc_univac1))
            
        }

    }

}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    EvolucaoDosComputadoresTheme {
        EvolucaoApp()
    }
}




