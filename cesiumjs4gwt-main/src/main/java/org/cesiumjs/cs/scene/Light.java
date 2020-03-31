/*
 * Copyright 2020 iSerge.
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

package org.cesiumjs.cs.scene;

import org.cesiumjs.cs.core.Color;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A light source. This type describes an interface and is not intended to be instantiated directly.
 */
@JsType(isNative = true, namespace = "Cesium", name = "Light")
 public class Light {
     /**
      * The color of the light.
      */
     @JsProperty
     public Color color;
     /**
      * The intensity of the light.
      */
     @JsProperty
     public Number intensity;

     /**
      * A light source. This type describes an interface and is not intended to be instantiated directly.
      */
     @JsConstructor
     public Light() {}
 }