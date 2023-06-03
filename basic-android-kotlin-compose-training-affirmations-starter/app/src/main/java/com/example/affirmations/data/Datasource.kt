/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Captions

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadCaptions(): List<Captions> {
        return listOf<Captions>(
            Captions(R.string.schnauzer1, R.drawable.image_1),
            Captions(R.string.schnauzer2, R.drawable.image_2),
            Captions(R.string.schnauzer3, R.drawable.image_3),
            Captions(R.string.schnauzer4, R.drawable.image_4),
            Captions(R.string.schnauzer5, R.drawable.image_5),
            Captions(R.string.schnauzer6, R.drawable.image_6),
            Captions(R.string.schnauzer7, R.drawable.image_7),
            Captions(R.string.schnauzer8, R.drawable.image_8),
            Captions(R.string.schnauzer9, R.drawable.image_9),
            Captions(R.string.schnauzer10, R.drawable.image_10),
            Captions(R.string.schnauzer11, R.drawable.image_11),
            Captions(R.string.schnauzer12, R.drawable.image_12),
            Captions(R.string.schnauzer13, R.drawable.image_13))
    }
}
