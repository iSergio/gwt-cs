/*
 * Copyright 2016 iserge.
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

package org.cesiumjs.cs.datasources.graphics.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.cesiumjs.cs.datasources.properties.Property;
import org.cesiumjs.cs.scene.enums.ShadowMode;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ModelGraphicsOptions {
    /**
     * A string Property specifying the URI of the glTF asset.
     */
    @JsProperty
    public Property uri;
    /**
     * A boolean Property specifying the visibility of the model.
     * Default: true
     */
    @JsProperty
    public Property show;
    /**
     * A numeric Property specifying a uniform linear scale.
     * Default: 1.0
     */
    @JsProperty
    public Property scale;
    /**
     * A numeric Property specifying the approximate minimum pixel size of the model regardless of zoom.
     * Default: 0.0
     */
    @JsProperty
    public Property minimumPixelSize;
    /**
     * The maximum scale size of a model. An upper limit for minimumPixelSize.
     */
    @JsProperty
    public Property maximumScale;
    /**
     * Determine if textures may continue to stream in after the model is loaded.
     * Default: true
     */
    @JsProperty
    public Property incrementallyLoadTextures;
    /**
     * A boolean Property specifying if glTF animations specified in the model should be started.
     * Default: true
     */
    @JsProperty
    public Property runAnimations;
    /**
     * An object, where keys are names of nodes, and values are TranslationRotationScale Properties describing the transformation to apply to that node.
     */
    @JsProperty
    public Property nodeTransformations;
    /**
     * An enum Property specifying whether the model casts or receives shadows from each light source.
     * Default: {@link ShadowMode#ENABLED()}
     */
    @JsProperty
    public Property shadows;
    /**
     * A Property specifying what the height is relative to.
     * Default: {@link HeightReference.NONE}
     */
    @JsProperty
    public Property heightReference;
    /**
     * A Property specifying at what distance from the camera that this model will be displayed.
     */
    @JsProperty
    public Property distanceDisplayCondition;

    @JsConstructor
    public ModelGraphicsOptions() {}
}
