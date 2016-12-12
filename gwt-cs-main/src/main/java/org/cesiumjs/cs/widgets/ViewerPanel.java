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

package org.cesiumjs.cs.widgets;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.LinkElement;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import org.cesiumjs.cs.Cesium;
import org.cesiumjs.cs.js.JsObject;
import org.cesiumjs.cs.widgets.options.ViewerOptions;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ViewerPanel extends SimplePanel {
    private Viewer _viewer;

    public ViewerPanel() {
        this((ViewerOptions) JsObject.undefined());
    }

    public ViewerPanel(ViewerOptions options) {
        super();
        Element element = getElement();
        RootPanel.getBodyElement().appendChild(element);
        _viewer = new Viewer(element, options);
        if (Cesium.path() != null && !Cesium.path().isEmpty()) {
            LinkElement linkElement = Document.get().createLinkElement();
            linkElement.setRel("stylesheet");
            linkElement.setHref(Cesium.path() + "Cesium/Widgets/widgets.css");
            element.getOwnerDocument().getElementsByTagName("head").getItem(0).appendChild(linkElement);
        }
    }

    public Viewer getViewer() {
        return _viewer;
    }
}
