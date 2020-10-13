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

package org.cesiumjs.cs.scene;

import org.cesiumjs.cs.core.Color;
import org.cesiumjs.cs.js.JsObject;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * An expression for a style applied to a {@link Cesium3DTileset}.
 *
 * Evaluates a conditions expression defined using the <a href=
 * "https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/Styling">3D
 * Tiles Styling language</a>.
 *
 * @author Serge Silaev aka iSergio
 */
@JsType(isNative = true, namespace = "Cesium", name = "ConditionsExpression")
public class ConditionsExpression implements StyleExpression {
  /**
   * Gets the conditions expression defined in the 3D Tiles Styling language.
   * Default: undefined
   */
  @JsProperty(name = "conditionsExpression")
  public native JsObject conditionsExpression();

  /**
   * An expression for a style applied to a {@link Cesium3DTileset}.
   */
  @JsConstructor
  public ConditionsExpression() {
  }

  /**
   * An expression for a style applied to a {@link Cesium3DTileset}.
   * 
   * @param conditionsExpression The conditions expression defined using the 3D
   *                             Tiles Styling language.
   */
  @JsConstructor
  public ConditionsExpression(JsObject conditionsExpression) {
  }

  /**
   * An expression for a style applied to a {@link Cesium3DTileset}.
   * 
   * @param conditionsExpression The conditions expression defined using the 3D
   *                             Tiles Styling language.
   * @param defines              Defines in the style.
   */
  @JsConstructor
  public ConditionsExpression(JsObject conditionsExpression, JsObject defines) {
  }

  /**
   * Evaluates the result of an expression, optionally using the provided
   * feature's properties. If the result of the expression in the 3D Tiles Styling
   * language is of type Boolean, Number, or String, the corresponding JavaScript
   * primitive type will be returned. If the result is a RegExp, a Javascript
   * RegExp object will be returned. If the result is a Cartesian2, Cartesian3, or
   * Cartesian4, a Cartesian2, Cartesian3, or Cartesian4 object will be returned.
   * If the result argument is a Color, the Cartesian4 value is converted to a
   * Color and then returned.
   * 
   * @param feature The feature whose properties may be used as variables in the
   *                expression.
   * @return The result of evaluating the expression.
   */
  @JsMethod
  public native Object evaluate(Cesium3DTileFeature feature);

  /**
   * Evaluates the result of an expression, optionally using the provided
   * feature's properties. If the result of the expression in the 3D Tiles Styling
   * language is of type Boolean, Number, or String, the corresponding JavaScript
   * primitive type will be returned. If the result is a RegExp, a Javascript
   * RegExp object will be returned. If the result is a Cartesian2, Cartesian3, or
   * Cartesian4, a Cartesian2, Cartesian3, or Cartesian4 object will be returned.
   * If the result argument is a Color, the Cartesian4 value is converted to a
   * Color and then returned.
   * 
   * @param feature The feature whose properties may be used as variables in the
   *                expression.
   * @param result  The object onto which to store the result.
   * @return The result of evaluating the expression.
   */
  @JsMethod
  public native Object evaluate(Cesium3DTileFeature feature, Object result);

  /**
   * Evaluates the result of a Color expression, optionally using the provided
   * feature's properties. This is equivalent to StyleExpression#evaluate but
   * always returns a Color object.
   * 
   * @param feature The feature whose properties may be used as variables in the
   *                expression.
   * @return The modified result parameter or a new Color instance if one was not
   *         provided.
   */
  @JsMethod
  public native Color evaluateColor(Cesium3DTileFeature feature);

  /**
   * Evaluates the result of a Color expression, optionally using the provided
   * feature's properties. This is equivalent to StyleExpression#evaluate but
   * always returns a Color object.
   * 
   * @param feature The feature whose properties may be used as variables in the
   *                expression.
   * @param result  The object in which to store the result.
   * @return The modified result parameter or a new Color instance if one was not
   *         provided.
   */
  @JsMethod
  public native Color evaluateColor(Cesium3DTileFeature feature, Color result);
}
