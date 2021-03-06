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

package org.cesiumjs.cs.collections.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.cesiumjs.cs.collections.PolylineCollection;
import org.cesiumjs.cs.core.Matrix4;

/**
 * Options for {@link PolylineCollection}.
 *
 * @author Serge Silaev aka iSergio
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PolylineCollectionOptions {
    /**
     * The 4x4 transformation matrix that transforms each polyline from model to
     * world coordinates. Default: {@link org.cesiumjs.cs.core.Matrix4#IDENTITY()}
     */
    @JsProperty
    public Matrix4 modelMatrix;
    /**
     * For debugging only. Determines if this primitive's commands' bounding spheres
     * are shown. Default: false
     */
    @JsProperty
    public boolean debugShowBoundingVolume;
    /**
     * Determines if the polylines in the collection will be shown.
     * Default: true
     */
    @JsProperty
    public boolean show;

    /**
     * Options for {@link PolylineCollection}.
     */
    @JsConstructor
    public PolylineCollectionOptions() {
    }
}
