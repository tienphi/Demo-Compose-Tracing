/**
 * @file DemoScreen.kt
 * @author Nguyen Dac Tien/대리/메가존_MZ HMI
 *
 * © 2024 Hyundai Motor Company. All Rights Reserved.
 *
 * This software is copyright protected and proprietary to Hyundai Motor Company.
 * Do not copy without prior permission. Any copy of this software or of any
 * derivative work must include the above copyright notice, this paragraph and
 * the one after it.
 *
 * This software is made available on an "AS IS" condition, and Hyundai Motor Company
 * disclaims all warranties of any kind, whether express or implied, statutory or
 * otherwise, including without limitation any warranties of merchantability or
 * fitness for a particular purpose, absence of errors, accuracy, completeness of
 * results or the validity, scope, or non-infringement of any intellectual property.
 */
package com.example.composetracedemo.ui.demo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.trace
import com.example.composetracedemo.ui.ComponentPreviews
import com.example.composetracedemo.ui.demo.components.Counter
import com.example.composetracedemo.ui.theme.MyApplicationTheme

@Composable
fun DemoScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var counter by remember { mutableIntStateOf(0) }

        // Counter One
        Counter(
            modifier = Modifier.padding(8.dp),
            name = "One",
            value = counter
        )

        // Derives from counter, increase only when counter is even
        val counterEven by remember(counter) {
            derivedStateOf {
                BigObject()
                if (counter.rem(2) == 0) {
                    counter / 2
                } else {
                    (counter - 1) / 2
                }
            }
        }

        // Counter Two, which increase only when counter is even
        Counter(
            modifier = Modifier.padding(8.dp),
            name = "Two",
            value = counterEven
        )

        Button(
            modifier = Modifier.padding(8.dp),
            onClick = { counter++ }
        ) {
            Text(
                text = "Increase",
                style = MaterialTheme.typography.titleMedium,
                fontSize = 40.sp
            )
        }
    }
}

class BigObject {
    init {
        trace("BigObject") {
            List(250000) { it }
        }
    }
}

@ComponentPreviews
@Composable
fun DemoScreenPreview() {
    MyApplicationTheme {
        DemoScreen(
            modifier = Modifier.padding(16.dp)
        )
    }
}
