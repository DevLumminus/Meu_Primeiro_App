package com.example.meuprimeiroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meuprimeiroapp.ui.theme.MeuPrimeiroAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuPrimeiroAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        mensagem = "Meu primeiro App", //Texto do parametro "mensagem"
                        from = "By André", //Texto do parametro "from"
                        modifier = Modifier.padding(8.dp) //Coloca um espaço para a borda
                    ) //Puxa o componente
                }
            }
        }
    }
}

@Composable //Etiqueta para o componente
fun GreetingText(mensagem: String, from: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center, //Centraliza no meio
        modifier = modifier) {
        Text(
            text = mensagem,
            fontSize = 90.sp, //Tamanho da letra
            lineHeight = 116.sp, //Largura da janela de texto
            textAlign = TextAlign.Center //Alinha o texto
        )
        Text(
            text = from,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MeuprimeiroappPreview() { //Visualização previa
    MeuPrimeiroAppTheme {
        GreetingText(mensagem = "Este é o meu primeiro app",
            from = "by André")
    }
}