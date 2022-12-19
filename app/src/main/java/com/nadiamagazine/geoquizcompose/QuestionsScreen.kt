package com.nadiamagazine.geoquizcompose

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun QuestionScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            text = stringResource(id = R.string.question_text)
        )
        Row() {
            Button(
                modifier = Modifier
                    .padding(5.dp),
                onClick = { /*TODO*/ }
            ) {
                Text(stringResource(id = R.string.false_button))
            }
            Button(
                modifier = Modifier
                    .padding(5.dp),
                onClick = { /*TODO*/ }) {
                Text(stringResource(id = R.string.true_button))
            }
        }
    }
}

@Preview
@Composable
fun QuestionScreenPreview() {
    QuestionScreen()
}

