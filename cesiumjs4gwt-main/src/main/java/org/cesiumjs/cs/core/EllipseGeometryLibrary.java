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

package org.cesiumjs.cs.core;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.cesiumjs.cs.core.options.EllipsePositionsOptions;
import org.cesiumjs.cs.js.JsObject;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "Cesium", name = "EllipseGeometryLibrary")
public class EllipseGeometryLibrary {
    @JsConstructor
    private EllipseGeometryLibrary() {}

    /**
     * Returns an array of positions that make up the ellipse.
     * @param options {@link EllipsePositionsOptions} instance.
     * @param addFillPositions
     * @param addEdgePositions
     * @return array of positions that make up the ellipse.
     */
    @JsMethod
    public static native JsObject computeEllipsePositions(EllipsePositionsOptions options, boolean addFillPositions, boolean addEdgePositions);
}
