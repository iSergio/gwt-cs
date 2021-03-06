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

package org.cleanlogic.cesiumjs4gwt.showcase.examples;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ListBox;
import org.cesiumjs.cs.Cesium;
import org.cesiumjs.cs.core.Math;
import org.cesiumjs.cs.core.*;
import org.cesiumjs.cs.core.options.ColorRandomOptions;
import org.cesiumjs.cs.core.providers.CesiumTerrainProvider;
import org.cesiumjs.cs.core.providers.EllipsoidTerrainProvider;
import org.cesiumjs.cs.datasources.graphics.PolygonGraphics;
import org.cesiumjs.cs.datasources.graphics.options.PolygonGraphicsOptions;
import org.cesiumjs.cs.datasources.options.EntityOptions;
import org.cesiumjs.cs.datasources.properties.ColorMaterialProperty;
import org.cesiumjs.cs.datasources.properties.ConstantProperty;
import org.cesiumjs.cs.scene.enums.HeightReference;
import org.cesiumjs.cs.widgets.ViewerPanel;
import org.cesiumjs.cs.widgets.options.ViewerOptions;
import org.cleanlogic.cesiumjs4gwt.showcase.basic.AbstractExample;
import org.cleanlogic.cesiumjs4gwt.showcase.components.store.ShowcaseExampleStore;

import javax.inject.Inject;

/**
 * @author Serge Silaev aka iSergio
 */
public class GeometryHeightReference extends AbstractExample {
    double longitude = 6.850615989890521;
    double latitude = 45.89546589994886;
    double delta = 0.001;
    private CesiumTerrainProvider cesiumTerrainProvider;
    private EllipsoidTerrainProvider ellipsoidTerrainProvider;
    private ViewerPanel csVPanel;

    @Inject
    public GeometryHeightReference(ShowcaseExampleStore store) {
        super("Geometry Height Reference",
                "An example for how to use the GeometryHeightProperty to height reference a corridor, ellipse, polygon or rectangle.",
                new String[]{"GeometryHeightProperty", "corridor", "ellipse", "polygon", "rectangle"}, store);
    }

    @Override
    public void buildPanel() {
        cesiumTerrainProvider = Cesium.createWorldTerrain();
        ellipsoidTerrainProvider = new EllipsoidTerrainProvider();

        ViewerOptions viewerOptions = new ViewerOptions();
        viewerOptions.baseLayerPicker = false;
        viewerOptions.terrainProvider = cesiumTerrainProvider;
        csVPanel = new ViewerPanel(viewerOptions);

        csVPanel.getViewer().scene().globe.depthTestAgainstTerrain = true;

        ListBox terrainLBox = new ListBox();
        terrainLBox.addItem("Disabled", "0");
        terrainLBox.addItem("Enabled", "1");
        terrainLBox.addChangeHandler(new ChangeHandler() {
            @Override
            public void onChange(ChangeEvent event) {
                ListBox source = (ListBox) event.getSource();
                if (source.getSelectedValue().equalsIgnoreCase("0")) {
                    csVPanel.getViewer().terrainProvider = ellipsoidTerrainProvider;
                } else if (source.getSelectedValue().equalsIgnoreCase("1")) {
                    csVPanel.getViewer().terrainProvider = cesiumTerrainProvider;
                }
            }
        });
        terrainLBox.setSelectedIndex(1);

        FlexTable flexTable = new FlexTable();
        flexTable.setHTML(1, 0, "<font color=\"white\">Terrain</font>");
        flexTable.setWidget(1, 1, terrainLBox);

        AbsolutePanel aPanel = new AbsolutePanel();
        aPanel.add(csVPanel);
        aPanel.add(flexTable, 20, 20);

        contentPanel.add(new HTML(
                "<p>An example for how to use the GeometryHeightProperty to height reference a corridor, ellipse, polygon or rectangle..</p>"));
        contentPanel.add(aPanel);

        initWidget(contentPanel);

        // create 16 polygons that are side-by-side
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                addEntity(i, j);
            }
        }

        csVPanel.getViewer().camera.lookAt(Cartesian3.fromDegrees(longitude, latitude, 500),
                new HeadingPitchRange(Math.PI(), -Math.PI_OVER_FOUR(), 2000));
        csVPanel.getViewer().camera.lookAtTransform(Matrix4.IDENTITY());// Sandcastle_End
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "GeometryHeightReference.txt";
        return sourceCodeURLs;
    }

    private void addEntity(int i, int j) {
        double west = longitude + delta * i;
        double east = longitude + delta * i + delta;

        double south = latitude + delta * j;
        double north = latitude + delta * j + delta;
        Cartesian3 a = Cartesian3.fromDegrees(west, south);
        Cartesian3 b = Cartesian3.fromDegrees(west, north);
        Cartesian3 c = Cartesian3.fromDegrees(east, north);
        Cartesian3 d = Cartesian3.fromDegrees(east, south);

        Cartesian3[] positions = new Cartesian3[]{a, b, c, d};

        ColorRandomOptions colorRandomOptions = new ColorRandomOptions();
        colorRandomOptions.alpha = 1.0f;

        PolygonGraphicsOptions polygonGraphicsOptions = new PolygonGraphicsOptions();
        polygonGraphicsOptions.hierarchy = new ConstantProperty<>(positions);
        polygonGraphicsOptions.material = new ColorMaterialProperty(Color.fromRandom(colorRandomOptions));
        polygonGraphicsOptions.height = new ConstantProperty<>(40.0);
        polygonGraphicsOptions.heightReference = new ConstantProperty<>(HeightReference.RELATIVE_TO_GROUND());
        polygonGraphicsOptions.extrudedHeight = new ConstantProperty<>(0.0);
        polygonGraphicsOptions.extrudedHeightReference = new ConstantProperty<>(HeightReference.CLAMP_TO_GROUND());

        EntityOptions entityOptions = new EntityOptions();
        entityOptions.polygon = new PolygonGraphics(polygonGraphicsOptions);
        csVPanel.getViewer().entities().add(entityOptions);
    }
}
