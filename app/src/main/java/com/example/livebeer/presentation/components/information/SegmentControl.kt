package com.example.livebeer.presentation.components.information

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.livebeer.presentation.ui.theme.CardBlackCol
import com.example.livebeer.presentation.ui.theme.SegmentUncheckCol
import com.example.livebeer.presentation.ui.theme.SfUiDisplaySemibold
import com.example.livebeer.presentation.ui.theme.WhiteCol

@Composable
fun SimpleSegmentControl(
    tabs: List<String>,
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    onTabSelected: (Int) -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(32.dp)
            .clip(RoundedCornerShape(9.dp))
            .background(SegmentUncheckCol.copy(alpha = 0.4f))

    ) {
        tabs.forEachIndexed { index, title ->
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(2.dp)
                    .clip(RoundedCornerShape(7.dp))
                    .background(
                        color = if (selectedTabIndex == index) WhiteCol else Color.Transparent,
                    )
                    .clickable { onTabSelected(index) },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = title,
                    fontSize = 14.sp,
                    fontFamily = SfUiDisplaySemibold,
                    fontWeight = FontWeight(600),
                    color = CardBlackCol
                )
            }
        }
    }
}