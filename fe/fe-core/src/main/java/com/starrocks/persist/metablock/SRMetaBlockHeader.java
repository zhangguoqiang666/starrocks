// Copyright 2021-present StarRocks, Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.starrocks.persist.metablock;

import com.google.gson.annotations.SerializedName;

public class SRMetaBlockHeader {
    @SerializedName(value = "n")
    private String name;
    @SerializedName(value = "i")
    private SRMetaBlockID id;
    @SerializedName(value = "nj")
    private int numJson;

    public SRMetaBlockHeader(SRMetaBlockID id, int numJson) {
        this.id = id;
        this.numJson = numJson;
    }

    public SRMetaBlockHeader(String name, int numJson) {
        this.name = name;
        this.numJson = numJson;
    }

    public int getNumJson() {
        return numJson;
    }

    public SRMetaBlockID getId() {
        if (id == null) {
            return SRMetaBlockID.INVALID;
        } else {
            return id;
        }
    }
}