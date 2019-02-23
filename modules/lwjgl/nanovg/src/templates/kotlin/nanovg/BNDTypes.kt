/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val BNDcornerFlags = "BNDcornerFlags".enumType
val BNDicon = "BNDicon".enumType
val BNDtextAlignment = "BNDtextAlignment".enumType
val BNDwidgetState = "BNDwidgetState".enumType

val BNDwidgetTheme = struct(Module.NANOVG, "BNDwidgetTheme") {
    documentation =
        """
        Describes the theme used to draw a single widget or widget box; these values correspond to the same values that can be retrieved from the Theme panel
        in the Blender preferences.
        """

    NVGcolor("outlineColor", "color of widget box outline")
    NVGcolor("itemColor", "color of widget item (meaning changes depending on class)")
    NVGcolor("innerColor", "fill color of widget box")
    NVGcolor("innerSelectedColor", "fill color of widget box when active")
    NVGcolor("textColor", "color of text label")
    NVGcolor("textSelectedColor", "color of text label when active")
    int("shadeTop", "delta modifier for upper part of gradient (-100 to 100)")
    int("shadeDown", "delta modifier for lower part of gradient (-100 to 100)")
}

val BNDnodeTheme = struct(Module.NANOVG, "BNDnodeTheme") {
    documentation = "Describes the theme used to draw nodes."

    NVGcolor("nodeSelectedColor", "inner color of selected node (and downarrow)")
    NVGcolor("wiresColor", "outline of wires")
    NVGcolor("textSelectedColor", "color of text label when active")
    NVGcolor("activeNodeColor", "inner color of active node (and dragged wire)")
    NVGcolor("wireSelectColor", "color of selected wire")
    NVGcolor("nodeBackdropColor", "color of background of node")
    int("noodleCurving", "how much a noodle curves (0 to 10)")
}

val BNDtheme = struct(Module.NANOVG, "BNDtheme") {
    documentation = "Describes the theme used to draw widgets."

    NVGcolor("backgroundColor", "the background color of panels and windows")
    BNDwidgetTheme("regularTheme", "theme for labels")
    BNDwidgetTheme("toolTheme", "theme for tool buttons")
    BNDwidgetTheme("radioTheme", "theme for radio buttons")
    BNDwidgetTheme("textFieldTheme", "theme for text fields")
    BNDwidgetTheme("optionTheme", "theme for option buttons (checkboxes)")
    BNDwidgetTheme("choiceTheme", "theme for choice buttons (comboboxes) Blender calls them \"menu buttons\"")
    BNDwidgetTheme("numberFieldTheme", "theme for number fields")
    BNDwidgetTheme("sliderTheme", "theme for slider controls")
    BNDwidgetTheme("scrollBarTheme", "theme for scrollbars")
    BNDwidgetTheme("tooltipTheme", "theme for tooltips")
    BNDwidgetTheme("menuTheme", "theme for menu backgrounds")
    BNDwidgetTheme("menuItemTheme", "theme for menu items")
    BNDnodeTheme("nodeTheme", "theme for nodes")
}
