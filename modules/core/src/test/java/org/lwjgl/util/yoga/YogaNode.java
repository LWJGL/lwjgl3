/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import static org.lwjgl.util.yoga.Yoga.*;

class YogaNode {

    final long node;

    YogaNode() {
        node = YGNodeNew();
    }

    YogaNode(YogaConfig config) {
        node = YGNodeNewWithConfig(config.handle);
    }

    @Override
    protected void finalize() throws Throwable {
        YGNodeFree(node);
    }

    void setAlignContent(YogaAlign alignContent) {
        YGNodeStyleSetAlignContent(node, alignContent.value);
    }

    void setAlignItems(YogaAlign alignItems) {
        YGNodeStyleSetAlignItems(node, alignItems.value);
    }

    void setAlignSelf(YogaAlign alignSelf) {
        YGNodeStyleSetAlignSelf(node, alignSelf.value);
    }

    void setBorder(YogaEdge edge, float border) {
        YGNodeStyleSetBorder(node, edge.value, border);
    }

    void setDirection(YogaDirection direction) {
        YGNodeStyleSetDirection(node, direction.value);
    }

    void setDisplay(YogaDisplay display) {
        YGNodeStyleSetDisplay(node, display.value);
    }

    void setFlexBasis(float flexBasis) {
        YGNodeStyleSetFlexBasis(node, flexBasis);
    }

    void setFlexBasisPercent(float flexBasis) {
        YGNodeStyleSetFlexBasisPercent(node, flexBasis);
    }

    void setFlexGrow(float flexGrow) {
        YGNodeStyleSetFlexGrow(node, flexGrow);
    }

    void setFlexShrink(float flexShrink) {
        YGNodeStyleSetFlexShrink(node, flexShrink);
    }

    void setJustifyContent(YogaJustify justifyContent) {
        YGNodeStyleSetJustifyContent(node, justifyContent.value);
    }

    void setWidth(float width) {
        YGNodeStyleSetWidth(node, width);
    }

    void setWidthPercent(float width) {
        YGNodeStyleSetWidthPercent(node, width);
    }

    void setMinWidth(float minWidth) {
        YGNodeStyleSetMinWidth(node, minWidth);
    }

    void setMaxWidth(float maxWidth) {
        YGNodeStyleSetMaxWidth(node, maxWidth);
    }

    void setMinWidthPercent(float minWidth) {
        YGNodeStyleSetMinWidthPercent(node, minWidth);
    }

    void setMaxWidthPercent(float maxWidth) {
        YGNodeStyleSetMaxWidthPercent(node, maxWidth);
    }

    void setHeight(float height) {
        YGNodeStyleSetHeight(node, height);
    }

    void setHeightPercent(float height) {
        YGNodeStyleSetHeightPercent(node, height);
    }

    void setMinHeight(float minHeight) {
        YGNodeStyleSetMinHeight(node, minHeight);
    }

    void setMaxHeight(float maxHeight) {
        YGNodeStyleSetMaxHeight(node, maxHeight);
    }

    void setMinHeightPercent(float minHeight) {
        YGNodeStyleSetMinHeightPercent(node, minHeight);
    }

    void setMaxHeightPercent(float maxHeight) {
        YGNodeStyleSetMaxHeightPercent(node, maxHeight);
    }

    void setPositionType(YogaPositionType type) {
        YGNodeStyleSetPositionType(node, type.value);
    }

    void setPosition(YogaEdge edge, float position) {
        YGNodeStyleSetPosition(node, edge.value, position);
    }

    void setPositionPercent(YogaEdge edge, float position) {
        YGNodeStyleSetPositionPercent(node, edge.value, position);
    }

    void addChildAt(YogaNode child, int index) {
        YGNodeInsertChild(node, child.node, index);
    }

    void setFlexDirection(YogaFlexDirection direction) {
        YGNodeStyleSetFlexDirection(node, direction.value);
    }

    void setMargin(YogaEdge edge, float margin) {
        YGNodeStyleSetMargin(node, edge.value, margin);
    }

    void setMarginPercent(YogaEdge edge, float margin) {
        YGNodeStyleSetMarginPercent(node, edge.value, margin);
    }

    void setMarginAuto(YogaEdge edge) {
        YGNodeStyleSetMarginAuto(node, edge.value);
    }

    void setOverflow(YogaOverflow overflow) {
        YGNodeStyleSetOverflow(node, overflow.value);
    }

    void setPadding(YogaEdge edge, float padding) {
        YGNodeStyleSetPadding(node, edge.value, padding);
    }

    void setPaddingPercent(YogaEdge edge, float padding) {
        YGNodeStyleSetPaddingPercent(node, edge.value, padding);
    }

    void setWrap(YogaWrap flexWrap) {
        YGNodeStyleSetFlexWrap(node, flexWrap.value);
    }

    void calculateLayout(float width, float height) {
        YGNodeCalculateLayout(node, width, height, YGNodeStyleGetDirection(node));
    }

    float getLayoutX() {
        return YGNodeLayoutGetLeft(node);
    }

    float getLayoutY() {
        return YGNodeLayoutGetTop(node);
    }

    float getLayoutWidth() {
        return YGNodeLayoutGetWidth(node);
    }

    float getLayoutHeight() {
        return YGNodeLayoutGetHeight(node);
    }

    YGValue getMaxHeight(YGValue __result) {
        return YGNodeStyleGetMaxHeight(node, __result);
    }

    void copyStyle(YogaNode src) {
        YGNodeCopyStyle(this.node, src.node);
    }

    float getLayoutBorder(YogaEdge edge) {
        return YGNodeLayoutGetBorder(node, edge.value);
    }

    float getLayoutMargin(YogaEdge edge) {
        return YGNodeLayoutGetMargin(node, edge.value);
    }

    float getLayoutPadding(YogaEdge edge) {
        return YGNodeLayoutGetPadding(node, edge.value);
    }

    float getBorder(YogaEdge edge) {
        return YGNodeStyleGetBorder(node, edge.value);
    }

    YGValue getMargin(YogaEdge edge, YGValue __result) {
        return YGNodeStyleGetMargin(node, edge.value, __result);
    }

    YGValue getPadding(YogaEdge edge, YGValue __result) {
        return YGNodeStyleGetPadding(node, edge.value, __result);
    }

    YGValue getPosition(YogaEdge edge, YGValue __result) {
        return YGNodeStyleGetPosition(node, edge.value, __result);
    }

    static final class YogaConstants {
        static final float UNDEFINED = YGUndefined;

        private YogaConstants() {
        }

        static boolean isUndefined(YGValue value) {
            return isUndefined(value.value());
        }

        static boolean isUndefined(float value) {
            return YGFloatIsUndefined(value);
        }
    }

    static final class YogaUnit {
        static final int UNDEFINED = YGUnitUndefined;

        private YogaUnit() {
        }
    }

    enum YogaAlign {
        AUTO(YGAlignAuto),
        FLEX_START(YGAlignFlexStart),
        CENTER(YGAlignCenter),
        FLEX_END(YGAlignFlexEnd),
        STRETCH(YGAlignStretch),
        BASELINE(YGAlignBaseline),
        SPACE_BETWEEN(YGAlignSpaceBetween),
        SPACE_AROUND(YGAlignSpaceAround);

        final int value;

        YogaAlign(int value) {
            this.value = value;
        }
    }

    enum YogaDirection {
        INHERIT(YGDirectionInherit),
        LTR(YGDirectionLTR),
        RTL(YGDirectionRTL);

        final int value;

        YogaDirection(int value) {
            this.value = value;
        }
    }

    enum YogaDisplay {
        FLEX(YGDisplayFlex),
        NONE(YGDisplayNone);

        final int value;

        YogaDisplay(int value) {
            this.value = value;
        }
    }

    enum YogaEdge {
        LEFT(YGEdgeLeft),
        TOP(YGEdgeTop),
        RIGHT(YGEdgeRight),
        BOTTOM(YGEdgeBottom),
        START(YGEdgeStart),
        END(YGEdgeEnd),
        HORIZONTAL(YGEdgeHorizontal),
        VERTICAL(YGEdgeVertical),
        ALL(YGEdgeAll);

        final int value;

        YogaEdge(int value) {
            this.value = value;
        }
    }

    enum YogaExperimentalFeature {
        WEB_FLEX_BASIS(YGExperimentalFeatureWebFlexBasis);

        final int value;

        YogaExperimentalFeature(int value) {
            this.value = value;
        }
    }

    enum YogaFlexDirection {
        COLUMN(YGFlexDirectionColumn),
        COLUMN_REVERSE(YGFlexDirectionColumnReverse),
        ROW(YGFlexDirectionRow),
        ROW_REVERSE(YGFlexDirectionRowReverse);

        final int value;

        YogaFlexDirection(int value) {
            this.value = value;
        }
    }

    enum YogaJustify {
        FLEX_START(YGJustifyFlexStart),
        CENTER(YGJustifyCenter),
        FLEX_END(YGJustifyFlexEnd),
        SPACE_BETWEEN(YGJustifySpaceBetween),
        SPACE_AROUND(YGJustifySpaceAround);

        final int value;

        YogaJustify(int value) {
            this.value = value;
        }
    }

    enum YogaOverflow {
        VISIBLE(YGOverflowVisible),
        HIDDEN(YGOverflowHidden),
        SCROLL(YGOverflowScroll);

        final int value;

        YogaOverflow(int value) {
            this.value = value;
        }
    }

    enum YogaPositionType {
        ABSOLUTE(YGPositionTypeAbsolute),
        RELATIVE(YGPositionTypeRelative);

        final int value;

        YogaPositionType(int value) {
            this.value = value;
        }
    }

    enum YogaWrap {
        NO_WRAP(YGWrapNoWrap),
        WRAP(YGWrapWrap),
        WRAP_REVERSE(YGWrapReverse);

        final int value;

        YogaWrap(int value) {
            this.value = value;
        }
    }

}