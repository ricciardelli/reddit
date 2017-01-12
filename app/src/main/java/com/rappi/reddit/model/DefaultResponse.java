/*
 * Copyright (C) 2017 Richard Ricciardelli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rappi.reddit.model;

import java.io.Serializable;

/**
 * Base class used to define the default response.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public abstract class DefaultResponse<T> implements Serializable {

    private String kind;
    private T data;

    public DefaultResponse() {
    }

    public DefaultResponse(String kind, T data) {
        this.kind = kind;
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DefaultResponse{" +
                "kind='" + kind + '\'' +
                ", data=" + data +
                '}';
    }
}
