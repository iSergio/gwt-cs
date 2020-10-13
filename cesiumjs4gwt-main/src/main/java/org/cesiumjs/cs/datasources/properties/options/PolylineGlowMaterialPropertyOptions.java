/*
 * Copyright 2018 iserge.
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

package org.cesiumjs.cs.datasources.properties.options;

import org.cesiumjs.cs.core.Color;
import org.cesiumjs.cs.datasources.properties.Property;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Serge Silaev aka iSergio
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PolylineGlowMaterialPropertyOptions {
    /**
     * A Property specifying the Color of the line.
     * Default: {@link Color#WHITE()}
     */
    @JsProperty
    public Property color;
    /**
     * A numeric Property specifying the strength of the glow, as a percentage of the total line width.
     * Default: 0.25
     */
    @JsProperty
    public Property glowPower;
    /**
     * A numeric Property specifying the strength of the tapering effect, as a percentage of the total line length.
     * If 1.0 or higher, no taper effect is used.
     * Default: 1.0
     */
    @JsProperty
    public Property taperPower;
    /**
     * Options for {@link org.cesiumjs.cs.datasources.properties.PolylineGlowMaterialProperty}
     */
    @JsConstructor
    public PolylineGlowMaterialPropertyOptions() {}
}
