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

package org.cesiumjs.cs.core;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.cesiumjs.cs.core.options.ClockOptions;

/**
 * A simple clock for keeping track of simulated time.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "Cesium", name = "Clock")
public class Clock {
    /**
     * Indicates whether Clock#tick can advance time. This could be false if data is being buffered, for example.
     * The clock will only advance time when both Clock#canAnimate and Clock#shouldAnimate are true.
     * Default Value:  true.
     */
    @JsProperty
    public boolean canAnimate;
    /**
     * Determines how the clock should behave when Clock#startTime or Clock#stopTime is reached.
     * Default Value:  ClockRange.UNBOUNDED
     */
    @JsProperty
    public int clockRange;
    /**
     * Determines if calls to Clock#tick are frame dependent or system clock dependent.
     * Changing this property to ClockStep.SYSTEM_CLOCK will set Clock#multiplier to 1.0,
     * Clock#shouldAnimate to true, and Clock#currentTime to the current system clock time.
     * Default Value:  ClockStep.SYSTEM_CLOCK_MULTIPLIER
     */
    @JsProperty
    public int clockStep;
    /**
     * The current time. Changing this property will change Clock#clockStep from ClockStep.SYSTEM_CLOCK to ClockStep.SYSTEM_CLOCK_MULTIPLIER.
     */
    @JsProperty
    public JulianDate currentTime;
    /**
     * Gets or sets how much time advances when Clock#tick is called. Negative values allow for advancing backwards.
     * If Clock#clockStep is set to ClockStep.TICK_DEPENDENT, this is the number of seconds to advance.
     * If Clock#clockStep is set to ClockStep.SYSTEM_CLOCK_MULTIPLIER, this value is multiplied by the elapsed system
     * time since the last call to Clock#tick. Changing this property will change Clock#clockStep from ClockStep.SYSTEM_CLOCK to
     * ClockStep.SYSTEM_CLOCK_MULTIPLIER.
     * Default Value:  1.0.
     */
    public double multiplier;
    /**
     * Indicates whether Clock#tick should attempt to advance time. The clock will only advance time when both
     * Clock#canAnimate and Clock#shouldAnimate are true. Changing this property will change Clock#clockStep from
     * ClockStep.SYSTEM_CLOCK to ClockStep.SYSTEM_CLOCK_MULTIPLIER.
     * Default Value:  true.
     */
    @JsProperty
    public boolean shouldAnimate;
    /**
     * The start time of the clock.
     */
    @JsProperty
    public JulianDate startTime;
    /**
     * The stop time of the clock.
     */
    @JsProperty
    public JulianDate stopTime;
    /**
     * An Event that is fired whenever Clock#tick is called.
     */
    @JsProperty
    public Event onTick;

    /**
     * A simple clock for keeping track of simulated time.
     */
    @JsConstructor
    public Clock() {}

    /**
     * A simple clock for keeping track of simulated time.
     * <pre>
     *     Example:
     *     {@code
     *      ClockOptions options = new ClockOptions();
     *      options.startTime = JulianDate.fromIso8601("2013-12-25");
     *      options.currentTime = JulianDate.fromIso8601("2013-12-25");
     *      options.stopTime = JulianDate.fromIso8601("2013-12-26");
     *      options.clockRange = ClockRange.LOOP_STOP();
     *      options.clockStep = ClockStep.SYSTEM_CLOCK_MULTIPLIER();
     *      Clock clock = new Clock(options);
     *     }
     * </pre>
     * @param options
     * @see ClockStep
     * @see ClockRange
     * @see JulianDate
     */
    @JsConstructor
    public Clock(ClockOptions options) {}

    /**
     * Advances the clock from the current time based on the current configuration options. tick should be called every
     * frame, regardless of whether animation is taking place or not. To control animation, use the Clock#shouldAnimate property.
     * @return The new value of the Clock#currentTime property.
     */
    @JsMethod
    public native JulianDate tick();
}
