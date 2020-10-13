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

import org.cesiumjs.cs.scene.options.SunLightOptions;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

/**
 * A directional light source that originates from the Sun.
 */
@JsType(isNative = true, namespace = "Cesium", name = "SunLight")
public class SunLight extends Light {
  /**
   * A directional light source that originates from the Sun.
   */
  @JsConstructor
  public SunLight() {
  }

  /**
   * A directional light source that originates from the Sun.
   * 
   * @param options Options {@link SunLightOptions}
   */
  @JsConstructor
  public SunLight(SunLightOptions options) {
  }
}