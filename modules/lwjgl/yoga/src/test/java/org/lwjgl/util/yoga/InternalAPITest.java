/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import org.testng.annotations.*;

import static org.lwjgl.util.yoga.Yoga.*;
import static org.testng.Assert.*;

@Test
public class InternalAPITest {

    public void testYGStyle() {
        long node = YGNodeNew();

        YGStyle style = YGNode.create(node).style();

        YGNodeStyleSetDirection(node, YGDirectionRTL);
        assertEquals(style.direction(), YGDirectionRTL);
        YGNodeStyleSetDirection(node, YGDirectionLTR);
        assertEquals(style.direction(), YGDirectionLTR);
        YGNodeStyleSetDirection(node, YGDirectionInherit);
        assertEquals(style.direction(), YGDirectionInherit);

        YGNodeStyleSetFlexDirection(node, YGFlexDirectionRowReverse);
        assertEquals(style.flexDirection(), YGFlexDirectionRowReverse);
        YGNodeStyleSetFlexDirection(node, YGFlexDirectionColumnReverse);
        assertEquals(style.flexDirection(), YGFlexDirectionColumnReverse);
        YGNodeStyleSetFlexDirection(node, YGFlexDirectionColumn);
        assertEquals(style.flexDirection(), YGFlexDirectionColumn);

        YGNodeStyleSetJustifyContent(node, YGJustifySpaceEvenly);
        assertEquals(style.justifyContent(), YGJustifySpaceEvenly);
        YGNodeStyleSetJustifyContent(node, YGJustifyCenter);
        assertEquals(style.justifyContent(), YGJustifyCenter);
        YGNodeStyleSetJustifyContent(node, YGJustifyFlexStart);
        assertEquals(style.justifyContent(), YGJustifyFlexStart);

        YGNodeStyleSetAlignContent(node, YGAlignSpaceAround);
        assertEquals(style.alignContent(), YGAlignSpaceAround);
        YGNodeStyleSetAlignContent(node, YGAlignFlexStart);
        assertEquals(style.alignContent(), YGAlignFlexStart);
        YGNodeStyleSetAlignContent(node, YGAlignAuto);
        assertEquals(style.alignContent(), YGAlignAuto);

        YGNodeStyleSetAlignItems(node, YGAlignSpaceAround);
        assertEquals(style.alignItems(), YGAlignSpaceAround);
        YGNodeStyleSetAlignItems(node, YGAlignFlexStart);
        assertEquals(style.alignItems(), YGAlignFlexStart);
        YGNodeStyleSetAlignItems(node, YGAlignAuto);
        assertEquals(style.alignItems(), YGAlignAuto);

        YGNodeStyleSetAlignSelf(node, YGAlignSpaceAround);
        assertEquals(style.alignSelf(), YGAlignSpaceAround);
        YGNodeStyleSetAlignSelf(node, YGAlignFlexStart);
        assertEquals(style.alignSelf(), YGAlignFlexStart);
        YGNodeStyleSetAlignSelf(node, YGAlignAuto);
        assertEquals(style.alignSelf(), YGAlignAuto);

        YGNodeStyleSetPositionType(node, YGPositionTypeAbsolute);
        assertEquals(style.positionType(), YGPositionTypeAbsolute);
        YGNodeStyleSetPositionType(node, YGPositionTypeRelative);
        assertEquals(style.positionType(), YGPositionTypeRelative);

        YGNodeStyleSetFlexWrap(node, YGWrapReverse);
        assertEquals(style.flexWrap(), YGWrapReverse);
        YGNodeStyleSetFlexWrap(node, YGWrapWrap);
        assertEquals(style.flexWrap(), YGWrapWrap);
        YGNodeStyleSetFlexWrap(node, YGWrapNoWrap);
        assertEquals(style.flexWrap(), YGWrapNoWrap);

        YGNodeStyleSetOverflow(node, YGOverflowScroll);
        assertEquals(style.overflow(), YGOverflowScroll);
        YGNodeStyleSetOverflow(node, YGOverflowHidden);
        assertEquals(style.overflow(), YGOverflowHidden);
        YGNodeStyleSetOverflow(node, YGOverflowVisible);
        assertEquals(style.overflow(), YGOverflowVisible);

        YGNodeStyleSetDisplay(node, YGDisplayNone);
        assertEquals(style.display(), YGDisplayNone);
        YGNodeStyleSetDisplay(node, YGDisplayFlex);
        assertEquals(style.display(), YGDisplayFlex);

        float MAGICF = 12345678.9f;

        YGNodeStyleSetFlex(node, MAGICF);
        assertEquals(style.flex().value(), MAGICF);
        YGNodeStyleSetFlex(node, 0.0f);
        assertEquals(style.flex().value(), 0.0f);

        YGNodeStyleSetFlexGrow(node, MAGICF);
        assertEquals(style.flexGrow().value(), MAGICF);
        YGNodeStyleSetFlexGrow(node, 0.0f);
        assertEquals(style.flexGrow().value(), 0.0f);

        YGNodeStyleSetFlexShrink(node, MAGICF);
        assertEquals(style.flexShrink().value(), MAGICF);
        YGNodeStyleSetFlexShrink(node, 0.0f);
        assertEquals(style.flexShrink().value(), 0.0f);

        YGNodeStyleSetFlexBasis(node, MAGICF);
        assertEquals(style.flexBasis().decode(), MAGICF);
        YGNodeStyleSetFlexBasis(node, 0.0f);
        assertEquals(style.flexBasis().decode(), 0.0f);

        for (int i = 0; i <= YGEdgeAll; i++) {
            YGNodeStyleSetMargin(node, i, MAGICF);
            assertEquals(style.margin(i).decode(), MAGICF);
            YGNodeStyleSetMargin(node, i, 0.0f);
            assertEquals(style.margin(i).decode(), 0.0f);

            YGNodeStyleSetPosition(node, i, MAGICF);
            assertEquals(style.positions(i).decode(), MAGICF);
            YGNodeStyleSetPosition(node, i, 0.0f);
            assertEquals(style.positions(i).decode(), 0.0f);

            YGNodeStyleSetPadding(node, i, MAGICF);
            assertEquals(style.padding(i).decode(), MAGICF);
            YGNodeStyleSetPadding(node, i, 0.0f);
            assertEquals(style.padding(i).decode(), 0.0f);

            YGNodeStyleSetBorder(node, i, MAGICF);
            assertEquals(style.border(i).decode(), MAGICF);
            YGNodeStyleSetBorder(node, i, 0.0f);
            assertEquals(style.border(i).decode(), 0.0f);
        }

        YGNodeStyleSetWidth(node, MAGICF);
        YGNodeStyleSetHeight(node, MAGICF);
        assertEquals(style.dimensions(0).decode(), MAGICF);
        assertEquals(style.dimensions(1).decode(), MAGICF);
        YGNodeStyleSetWidth(node, 0.0f);
        YGNodeStyleSetHeight(node, 0.0f);
        assertEquals(style.dimensions(0).decode(), 0.0f);
        assertEquals(style.dimensions(1).decode(), 0.0f);

        YGNodeStyleSetMinWidth(node, MAGICF);
        YGNodeStyleSetMinHeight(node, MAGICF);
        assertEquals(style.minDimensions(0).decode(), MAGICF);
        assertEquals(style.minDimensions(1).decode(), MAGICF);
        YGNodeStyleSetMinWidth(node, 0.0f);
        YGNodeStyleSetMinHeight(node, 0.0f);
        assertEquals(style.minDimensions(0).decode(), 0.0f);
        assertEquals(style.minDimensions(1).decode(), 0.0f);

        YGNodeStyleSetMaxWidth(node, MAGICF);
        YGNodeStyleSetMaxHeight(node, MAGICF);
        assertEquals(style.maxDimensions(0).decode(), MAGICF);
        assertEquals(style.maxDimensions(1).decode(), MAGICF);
        YGNodeStyleSetMaxWidth(node, 0.0f);
        YGNodeStyleSetMaxHeight(node, 0.0f);
        assertEquals(style.maxDimensions(0).decode(), 0.0f);
        assertEquals(style.maxDimensions(1).decode(), 0.0f);

        YGNodeStyleSetAspectRatio(node, MAGICF);
        assertEquals(style.aspectRatio().value(), MAGICF);
        YGNodeStyleSetAspectRatio(node, 0.0f);
        assertEquals(style.aspectRatio().value(), 0.0f);

        YGNodeFree(node);
    }

    public void testYGLayout() {
        long root = YGNodeNew();

        YGNodeStyleSetWidth(root, 1024.0f);
        YGNodeStyleSetHeight(root, 1024.0f);
        YGNodeStyleSetDirection(root, YGDirectionLTR);

        long node = YGNodeNew();

        YGNodeStyleSetPositionType(node, YGPositionTypeAbsolute);
        YGNodeStyleSetPosition(node, YGEdgeStart, 11.11f);
        YGNodeStyleSetPosition(node, YGEdgeTop, 22.22f);
        YGNodeStyleSetWidth(node, 123.45f);
        YGNodeStyleSetHeight(node, 567.89f);

        for (int i = 0; i <= YGEdgeAll; i++) {
            YGNodeStyleSetMargin(node, i, 4.4f * i);
            YGNodeStyleSetBorder(node, i, 3.3f * i);
            YGNodeStyleSetPadding(node, i, 2.2f * i);
        }

        YGNodeInsertChild(root, node, 0);
        YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGDirectionLTR);

        YGLayout layout = YGNode.create(node).layout();

        assertEquals(layout.positions(0), YGNodeLayoutGetLeft(node));
        assertEquals(layout.positions(1), YGNodeLayoutGetTop(node));
        assertEquals(layout.positions(2), YGNodeLayoutGetRight(node));
        assertEquals(layout.positions(3), YGNodeLayoutGetBottom(node));

        assertEquals(layout.dimensions(0), YGNodeLayoutGetWidth(node));
        assertEquals(layout.dimensions(1), YGNodeLayoutGetHeight(node));

        assertEquals(layout.margin(YGEdgeLeft), YGNodeLayoutGetMargin(node, YGEdgeLeft));
        assertEquals(layout.margin(YGEdgeTop), YGNodeLayoutGetMargin(node, YGEdgeTop));
        assertEquals(layout.margin(YGEdgeRight), YGNodeLayoutGetMargin(node, YGEdgeRight));
        assertEquals(layout.margin(YGEdgeBottom), YGNodeLayoutGetMargin(node, YGEdgeBottom));

        assertEquals(layout.border(YGEdgeLeft), YGNodeLayoutGetBorder(node, YGEdgeLeft));
        assertEquals(layout.border(YGEdgeTop), YGNodeLayoutGetBorder(node, YGEdgeTop));
        assertEquals(layout.border(YGEdgeRight), YGNodeLayoutGetBorder(node, YGEdgeRight));
        assertEquals(layout.border(YGEdgeBottom), YGNodeLayoutGetBorder(node, YGEdgeBottom));

        assertEquals(layout.padding(YGEdgeLeft), YGNodeLayoutGetPadding(node, YGEdgeLeft));
        assertEquals(layout.padding(YGEdgeTop), YGNodeLayoutGetPadding(node, YGEdgeTop));
        assertEquals(layout.padding(YGEdgeRight), YGNodeLayoutGetPadding(node, YGEdgeRight));
        assertEquals(layout.padding(YGEdgeBottom), YGNodeLayoutGetPadding(node, YGEdgeBottom));

        YGNodeFree(node);
        YGNodeFree(root);
    }

}
