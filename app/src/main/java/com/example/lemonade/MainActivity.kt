package com.example.lemonade

import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                LemonApp()
            }
        }
    }
}


@Composable
fun LemonApp(modifier: Modifier= Modifier) {
    var currentStep by remember { mutableStateOf(1) }
    when (currentStep) {
        1 -> Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(painter = painterResource(R.drawable.lemon_tree),
                contentDescription = stringResource(R.string.Lemon_tree_Content_Description),
                modifier = Modifier
                    .wrapContentSize()
                    .clickable {
                        currentStep = 2
                    }
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = stringResource(R.string.lemon_tree), fontSize = 18.sp)


        }

        2 -> Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(painter = painterResource(R.drawable.lemon_squeeze),
                contentDescription = stringResource(R.string.Lemon_Content_Description),
                modifier = Modifier
                    .wrapContentSize()
                    .clickable {
                        currentStep = 3
                    }
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = stringResource(R.string.squeez), fontSize = 18.sp)
        }
        3 -> Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(painter = painterResource(R.drawable.lemon_drink),
                contentDescription = stringResource(R.string.Glass_of_lemonade_Content_Description),
                modifier = Modifier
                    .wrapContentSize()
                    .clickable {
                        currentStep = 1
                    }
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = stringResource(R.string.lemonade_to_drink), fontSize = 18.sp)
        }
        4 -> Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(painter = painterResource(R.drawable.lemon_restart),
                contentDescription = stringResource(R.string.Empty_Glass_Content_Description),
                modifier = Modifier
                    .wrapContentSize()
                    .clickable {
                        currentStep = 1
                    }
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = stringResource(R.string.Empty_Glass_Content_Description), fontSize = 18.sp)
        }
    }
}

@Composable
fun LemonTextAndImage()

@Preview
@Composable
fun LemonadeApp(){
    LemonadeTheme() {
        LemonApp()
    }
}


