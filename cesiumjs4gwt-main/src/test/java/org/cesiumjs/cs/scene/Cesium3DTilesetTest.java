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

import org.cesiumjs.cs.BaseTestCase;
import org.cesiumjs.cs.core.IonResource;

/**
 * @author Serge Silaev aka iSergio
 */
public class Cesium3DTilesetTest extends BaseTestCase {

    public void testCreateResource() {
        delayTestFinish(10_000);

        super.beginTest(() -> IonResource.fromAssetId(3883)
                .then(resource -> Cesium3DTileset.create(resource).readyPromise()
                        .then(tileSet -> {
                                assertNotNull(tileSet);
                                finishTest();
                                }, value -> fail()))
        );
    }

    public void testCreatePromise() {
        delayTestFinish(10_000);

        super.beginTest(() -> IonResource.fromAssetId(3883)
                .then(resource -> Cesium3DTileset.create(resource).readyPromise()
                        .then(tileSet -> {
                            assertNotNull(tileSet);
                            finishTest();
                            }, value -> fail()))
        );
    }
}