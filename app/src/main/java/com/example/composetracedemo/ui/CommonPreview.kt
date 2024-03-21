/**
 * @file CommonPreview.kt
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
package com.example.composetracedemo.ui

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    heightDp = 600,
    widthDp = 1600,
    showBackground = true
)
annotation class ScreenPreviews

@Preview(
    heightDp = 600,
    widthDp = 1600,
    showBackground = true,
    uiMode = UI_MODE_NIGHT_NO
)
@Preview(
    heightDp = 600,
    widthDp = 1600,
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES
)
annotation class ScreenDarkLightPreviews

@Preview(
    showBackground = true,
)
annotation class ComponentPreviews

@Preview(
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true,
)
@Preview(
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true,
)
annotation class ComponentDarkLightPreviews
