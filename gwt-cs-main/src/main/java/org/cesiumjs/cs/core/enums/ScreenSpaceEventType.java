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

package org.cesiumjs.cs.core.enums;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "Cesium", name = "ScreenSpaceEventType")
public class ScreenSpaceEventType {
    /**
     * Represents a mouse left click event.
     */
    @JsProperty(name = "LEFT_CLICK")
    public static native Integer LEFT_CLICK();
    /**
     * Represents a mouse left double click event.
     */
    @JsProperty(name = "LEFT_DOUBLE_CLICK")
    public static native Integer LEFT_DOUBLE_CLICK();
    /**
     * Represents a mouse left button down event.
     */
    @JsProperty(name = "LEFT_DOWN")
    public static native Integer LEFT_DOWN();
    /**
     * Represents a mouse left button up event.
     */
    @JsProperty(name = "LEFT_UP")
    public static native Integer LEFT_UP();
    /**
     * Represents a mouse middle click event.
     */
    @JsProperty(name = "MIDDLE_CLICK")
    public static native Integer MIDDLE_CLICK();
    /**
     * Represents a mouse middle double click event.
     */
    @JsProperty(name = "MIDDLE_DOUBLE_CLICK")
    public static native Integer MIDDLE_DOUBLE_CLICK();
    /**
     * Represents a mouse middle button down event.
     */
    @JsProperty(name = "MIDDLE_DOWN")
    public static native Integer MIDDLE_DOWN();
    /**
     * Represents a mouse middle button up event.
     */
    @JsProperty(name = "MIDDLE_UP")
    public static native Integer MIDDLE_UP();
    /**
     * Represents a mouse move event.
     */
    @JsProperty(name = "MOUSE_MOVE")
    public static native Integer MOUSE_MOVE();
    /**
     * Represents the end of a two-finger event on a touch surface.
     */
    @JsProperty(name = "PINCH_END")
    public static native Integer PINCH_END();
    /**
     * Represents a change of a two-finger event on a touch surface.
     */
    @JsProperty(name = "PINCH_MOVE")
    public static native Integer PINCH_MOVE();
    /**
     * Represents the start of a two-finger event on a touch surface.
     */
    @JsProperty(name = "PINCH_START")
    public static native Integer PINCH_START();
    /**
     * Represents a mouse right click event.
     */
    @JsProperty(name = "RIGHT_CLICK")
    public static native Integer RIGHT_CLICK();
    /**
     * Represents a mouse right double click event.
     */
    @JsProperty(name = "RIGHT_DOUBLE_CLICK")
    public static native Integer RIGHT_DOUBLE_CLICK();
    /**
     * Represents a mouse left button down event.
     */
    @JsProperty(name = "RIGHT_DOWN")
    public static native Integer RIGHT_DOWN();
    /**
     * Represents a mouse right button up event.
     */
    @JsProperty(name = "RIGHT_UP")
    public static native Integer RIGHT_UP();
    /**
     * Represents a mouse wheel event.
     */
    @JsProperty(name = "WHEEL")
    public static native Integer WHEEL();

    /**
     * This enumerated type is for classifying mouse events: down, up, click, double click, move and move while a button is held down.
     */
    @JsConstructor
    private ScreenSpaceEventType() {}
}