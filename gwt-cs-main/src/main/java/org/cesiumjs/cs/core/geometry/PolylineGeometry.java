/*
 * Copyright 2017 iserge.
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

package org.cesiumjs.cs.core.geometry;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.cesiumjs.cs.core.geometry.options.PolylineGeometryOptions;

/**
 * A description of a polyline modeled as a line strip; the first two positions define a line segment,
 * and each additional position defines a line segment from the previous position. The polyline is capable
 * of displaying with a material.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
// TODO: Examples
@JsType(isNative = true, namespace = "Cesium", name = "PolylineGeometry")
public class PolylineGeometry {
    /**
     * The number of elements used to pack the object into an array.
     */
    @JsProperty
    public int packedLength;

    @JsConstructor
    public PolylineGeometry(PolylineGeometryOptions options) {}

    /**
     * Computes the geometric representation of a polyline, including its vertices, indices, and a bounding sphere.
     * @param polylineGeometry A description of the polyline.
     * @return The computed vertices and indices.
     */
    @JsMethod
    public static native Geometry createGeometry(PolylineGeometry polylineGeometry);

    /**
     * Stores the provided instance into the provided array.
     * @param value The value to pack.
     * @param array The array to pack into.
     * @return The array that was packed into
     */
    @JsMethod
    public static native double[] pack(PolylineGeometry value, double[] array);

    /**
     * Stores the provided instance into the provided array.
     * @param value The value to pack.
     * @param array The array to pack into.
     * @param startingIndex The index into the array at which to start packing the elements.
     * @return The array that was packed into
     */
    @JsMethod
    public static native double[] pack(PolylineGeometry value, double[] array, int startingIndex);

    /**
     * Retrieves an instance from a packed array.
     * @param array The packed array.
     * @return The modified result parameter or a new PolylineGeometry instance if one was not provided.
     */
    @JsMethod
    public static native PolylineGeometry unpack(double[] array);

    /**
     * Retrieves an instance from a packed array.
     * @param array The packed array.
     * @param startingIndex The starting index of the element to be unpacked.
     * @return The modified result parameter or a new PolylineGeometry instance if one was not provided.
     */
    @JsMethod
    public static native PolylineGeometry unpack(double[] array, int startingIndex);

    /**
     * Retrieves an instance from a packed array.
     * @param array The packed array.
     * @param startingIndex The starting index of the element to be unpacked.
     * @param result The object into which to store the result.
     * @return The modified result parameter or a new PolylineGeometry instance if one was not provided.
     */
    @JsMethod
    public static native PolylineGeometry unpack(double[] array, int startingIndex, PolylineGeometry result);
}
