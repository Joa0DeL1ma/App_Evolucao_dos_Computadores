package com.example.evolucaodoscomputadores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.evolucaodoscomputadores.ui.theme.EvolucaoDosComputadoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvolucaoDosComputadoresTheme {
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
    var tela by remember { mutableIntStateOf(1) }

        Box (modifier = Modifier.fillMaxSize()) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center),
                text = "A evolução dos Computadores",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Column(verticalArrangement = Arrangement.Center) {
            when (tela) {

                1 -> {
                    EvolucaoLayout(
                        imagemId = R.drawable.c1951,
                        anoId = R.string.ano1,
                        nomeId = R.string.nome1,
                        textoId = R.string.desc_univac1,
                        cliqueProximo = {
                            tela = 2
                        },
                        cliqueAnterior = {
                            tela = 1
                        }
                    )
                }

                2 -> {
                    EvolucaoLayout(
                        imagemId = R.drawable.c1965,
                        anoId = R.string.ano2,
                        nomeId = R.string.nome2,
                        textoId = R.string.desc_programma_101,
                        cliqueProximo = {
                            tela = 3
                        },
                        cliqueAnterior = {
                            tela = 1
                        }
                    )
                }

                3 -> {
                    EvolucaoLayout(
                        imagemId = R.drawable.c1975,
                        anoId = R.string.ano3,
                        nomeId = R.string.nome3,
                        textoId = R.string.desc_ibm_5100,
                        cliqueProximo = {
                            tela = 4
                        },
                        cliqueAnterior = {
                            tela = 2
                        }
                    )
                }

                4 -> {
                    EvolucaoLayout(
                        imagemId = R.drawable.c1985,
                        anoId = R.string.ano4,
                        nomeId = R.string.nome4,
                        textoId = R.string.desc_ibm_pc_xt,
                        cliqueProximo = {
                            tela = 5
                        },
                        cliqueAnterior = {
                            tela = 3
                        }
                    )
                }

                5 -> {
                    EvolucaoLayout(
                        imagemId = R.drawable.c1995,
                        anoId = R.string.ano5,
                        nomeId = R.string.nome5,
                        textoId = R.string.desc_computadores_pessoais,
                        cliqueProximo = {
                            tela = 6
                        },
                        cliqueAnterior = {
                            tela = 4
                        }
                    )
                }

                6 -> {
                    EvolucaoLayout(
                        imagemId = R.drawable.c2015,
                        anoId = R.string.ano6,
                        nomeId = R.string.nome6,
                        textoId = R.string.desc_potentes,
                        cliqueProximo = {
                            tela = 7
                        },
                        cliqueAnterior = {
                            tela = 5
                        }
                    )
                }

                7 -> {
                    EvolucaoLayout(
                        imagemId = R.drawable.presente,
                        anoId = R.string.ano7,
                        nomeId = R.string.nome7,
                        textoId = R.string.desc_atuais,
                        cliqueProximo = {
                            tela = 1
                        },
                        cliqueAnterior = {
                            tela = 6
                        }
                    )
                }
            }
        }
    }
}


@Composable
fun EvolucaoLayout(
    imagemId: Int,
    anoId: Int,
    nomeId: Int,
    textoId: Int,
    cliqueProximo: () -> Unit,
    cliqueAnterior: () -> Unit
) {
    val textoModifier = Modifier.padding(top = 8.dp)


        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
        {
            Image(
                painter = painterResource(id = imagemId),
                contentDescription = stringResource(id = nomeId),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp)
            )
            Text(
                modifier = textoModifier
                    .padding(top = 8.dp),
                text = stringResource(id = anoId)
            )
            Text(
                modifier = textoModifier,
                fontWeight = FontWeight.Bold,
                text = stringResource(id = nomeId)
            )
            Text(
                modifier = Modifier
                    .padding(top = 16.dp, start = 32.dp, end = 32.dp),
                textAlign = TextAlign.Justify,
                text = stringResource(id = textoId)
            )
            Row(
                modifier = Modifier
                    .padding(top = 24.dp),
                verticalAlignment = Alignment.Bottom
            ) {
                Button(modifier = Modifier.padding(end = 32.dp),
                    onClick = cliqueAnterior ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Previous Arrow"
                    )
                }
                Button(
                    onClick = cliqueProximo ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "Next Arrow"
                    )
                }
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




