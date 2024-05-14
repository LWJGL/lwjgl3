/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package org.lwjgl.util.yoga;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.util.yoga.YogaConfig.*;
import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.*;

public class YogaNodeTest {
    @Test
    public void testBaseline() {
        YogaNode root = createNode();
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setAlignItems(YogaAlign.BASELINE);
        root.setWidth(100);
        root.setHeight(100);

        YogaNode child1 = createNode();
        child1.setWidth(40);
        child1.setHeight(40);
        root.addChildAt(child1, 0);

        YogaNode child2 = createNode();
        child2.setWidth(40);
        child2.setHeight(40);
        child2.setBaselineFunction((node, width, height) -> 0);
        root.addChildAt(child2, 1);

        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0, (int)child1.getLayoutY());
        assertEquals(40, (int)child2.getLayoutY());

        child2.freeBaselineFunction();
    }

    @Test
    public void testMeasure() {
        YogaNode node = createNode();
        node.setMeasureFunction((it, width, widthMode, height, heightMode, __result) -> __result
            .width(200)
            .height(100));
        node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
        assertEquals(200, (int)node.getLayoutWidth());
        assertEquals(100, (int)node.getLayoutHeight());

        node.freeMeasureFunction();
    }

    @Test
    public void testMeasureFloat() {
        YogaNode node = createNode();
        node.setMeasureFunction((it, width, widthMode, height, heightMode, __result) -> __result
            .width(200.5f)
            .height(100.5f));
        node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
        assertEquals(201f, node.getLayoutWidth(), 0.01f);
        assertEquals(101f, node.getLayoutHeight(), 0.01f);

        node.freeMeasureFunction();
    }

    @Test
    public void testMeasureFloatMin() {
        YogaNode node = createNode();
        node.setMeasureFunction((it, width, widthMode, height, heightMode, __result) -> __result
            .width(Float.MIN_VALUE)
            .height(Float.MIN_VALUE));
        node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
        assertEquals(Float.MIN_VALUE, node.getLayoutWidth(), 0.01f);
        assertEquals(Float.MIN_VALUE, node.getLayoutHeight(), 0.01f);

        node.freeMeasureFunction();
    }

    @Test
    public void testMeasureFloatBigNumber() {
        YogaNode    node      = createNode();
        final float bigNumber = (float)10E5;
        node.setMeasureFunction((it, width, widthMode, height, heightMode, __result) -> __result
            .width(bigNumber)
            .height(bigNumber));
        node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
        assertEquals(bigNumber, node.getLayoutWidth(), 0.01f);
        assertEquals(bigNumber, node.getLayoutHeight(), 0.01f);

        node.freeMeasureFunction();
    }

    @Test
    public void testCopyStyle() {
        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);

            YogaNode node0 = createNode();
            assertTrue(YogaConstants.isUndefined(node0.getMaxHeight(v)));

            YogaNode node1 = createNode();
            node1.setMaxHeight(100);

            node0.copyStyle(node1);
            assertEquals(100, (int)node0.getMaxHeight(v).value());
        }
    }

    @Test
    public void testLayoutMargin() {
        YogaNode node = createNode();
        node.setWidth(100);
        node.setHeight(100);
        node.setMargin(YogaEdge.START, 1);
        node.setMargin(YogaEdge.END, 2);
        node.setMargin(YogaEdge.TOP, 3);
        node.setMargin(YogaEdge.BOTTOM, 4);
        node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(1, (int)node.getLayoutMargin(YogaEdge.LEFT));
        assertEquals(2, (int)node.getLayoutMargin(YogaEdge.RIGHT));
        assertEquals(3, (int)node.getLayoutMargin(YogaEdge.TOP));
        assertEquals(4, (int)node.getLayoutMargin(YogaEdge.BOTTOM));
    }

    @Test
    public void testLayoutPadding() {
        YogaNode node = createNode();
        node.setWidth(100);
        node.setHeight(100);
        node.setPadding(YogaEdge.START, 1);
        node.setPadding(YogaEdge.END, 2);
        node.setPadding(YogaEdge.TOP, 3);
        node.setPadding(YogaEdge.BOTTOM, 4);
        node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(1, (int)node.getLayoutPadding(YogaEdge.LEFT));
        assertEquals(2, (int)node.getLayoutPadding(YogaEdge.RIGHT));
        assertEquals(3, (int)node.getLayoutPadding(YogaEdge.TOP));
        assertEquals(4, (int)node.getLayoutPadding(YogaEdge.BOTTOM));
    }

    @Test
    public void testLayoutBorder() {
        YogaNode node = createNode();
        node.setWidth(100);
        node.setHeight(100);
        node.setBorder(YogaEdge.START, 1);
        node.setBorder(YogaEdge.END, 2);
        node.setBorder(YogaEdge.TOP, 3);
        node.setBorder(YogaEdge.BOTTOM, 4);
        node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(1, (int)node.getLayoutBorder(YogaEdge.LEFT));
        assertEquals(2, (int)node.getLayoutBorder(YogaEdge.RIGHT));
        assertEquals(3, (int)node.getLayoutBorder(YogaEdge.TOP));
        assertEquals(4, (int)node.getLayoutBorder(YogaEdge.BOTTOM));
    }

    @Test
    public void testUseWebDefaults() {
        YogaConfig config = YogaConfigFactory.create();
        config.setUseWebDefaults(true);
        YogaNode node = createNode(config);
        assertEquals(YogaFlexDirection.ROW.getValue(), node.getFlexDirection());
    }

    @Test
    public void testPercentPaddingOnRoot() {
        YogaNode node = createNode();
        node.setPaddingPercent(YogaEdge.ALL, 10);
        node.calculateLayout(50, 50);

        assertEquals(5, (int)node.getLayoutPadding(YogaEdge.LEFT));
        assertEquals(5, (int)node.getLayoutPadding(YogaEdge.RIGHT));
        assertEquals(5, (int)node.getLayoutPadding(YogaEdge.TOP));
        assertEquals(5, (int)node.getLayoutPadding(YogaEdge.BOTTOM));
    }

    @Test
    public void testDefaultEdgeValues() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YogaValue v = YogaValue.malloc(stack);

            for (YogaEdge edge : YogaEdge.values()) {
                assertEquals(YogaUnit.UNDEFINED, node.getMargin(edge, v).unit());
                assertEquals(YogaUnit.UNDEFINED, node.getPadding(edge, v).unit());
                assertEquals(YogaUnit.UNDEFINED, node.getPosition(edge, v).unit());
                assertTrue(YogaConstants.isUndefined(node.getBorder(edge)));
            }
        }
    }

    @Test
    public void initiallyHasNewLayout() {
        YogaNode root = createNode();
        assertTrue(root.hasNewLayout());
    }

    @Test
    public void initialLayoutCanBeMarkedSeen() {
        YogaNode root = createNode();
        root.markLayoutSeen();
        assertFalse(root.hasNewLayout());
    }

    @Test
    public void calculatingLayoutMarksLayoutAsUnseen() {
        YogaNode root = createNode();
        root.markLayoutSeen();
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
        assertTrue(root.hasNewLayout());
    }

    @Test
    public void calculatedLayoutCanBeMarkedSeen() {
        YogaNode root = createNode();
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
        root.markLayoutSeen();
        assertFalse(root.hasNewLayout());
    }

    @Test
    public void recalculatingLayoutDoesMarkAsUnseen() {
        YogaNode root = createNode();
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
        root.markLayoutSeen();
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
        assertTrue(root.hasNewLayout());
    }

    @Test
    public void resetAlsoResetsLayoutSeen() {
        YogaNode root = createNode();
        root.markLayoutSeen();
        root.reset();
        assertTrue(root.hasNewLayout());
    }

    @Test
    public void directionIsPassedThrough() {
        YogaNode root = createNode();

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(root.getLayoutDirection(), YogaDirection.RTL);
    }

    @Test
    public void testResetApiShouldResetAllLayoutOutputs() {
        YogaConfig config = YogaConfigFactory.create();
        config.setErrata(YogaErrata.STRETCH_FLEX_BASIS);
        YogaNode node = createNode(config);
        node.setWidth(100);
        node.setHeight(100);
        node.setMargin(YogaEdge.START, 1);
        node.setMargin(YogaEdge.END, 2);
        node.setMargin(YogaEdge.TOP, 3);
        node.setMargin(YogaEdge.BOTTOM, 4);
        node.setPadding(YogaEdge.START, 1);
        node.setPadding(YogaEdge.END, 2);
        node.setPadding(YogaEdge.TOP, 3);
        node.setPadding(YogaEdge.BOTTOM, 4);
        node.setBorder(YogaEdge.START, 1);
        node.setBorder(YogaEdge.END, 2);
        node.setBorder(YogaEdge.TOP, 3);
        node.setBorder(YogaEdge.BOTTOM, 4);
        node.setDirection(YogaDirection.RTL);
        node.markLayoutSeen();
        node.setMeasureFunction((it, width, widthMode, height, heightMode, __result) -> __result
            .width(100)
            .height(100));
        node.setBaselineFunction((node1, width, height) -> height);

        node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        node.reset();

        assertEquals(0, (int)node.getLayoutHeight());
        assertEquals(0, (int)node.getLayoutWidth());
        assertEquals(0, (int)node.getLayoutMargin(YogaEdge.LEFT));
        assertEquals(0, (int)node.getLayoutMargin(YogaEdge.RIGHT));
        assertEquals(0, (int)node.getLayoutMargin(YogaEdge.TOP));
        assertEquals(0, (int)node.getLayoutMargin(YogaEdge.BOTTOM));
        assertEquals(0, (int)node.getLayoutPadding(YogaEdge.LEFT));
        assertEquals(0, (int)node.getLayoutPadding(YogaEdge.RIGHT));
        assertEquals(0, (int)node.getLayoutPadding(YogaEdge.TOP));
        assertEquals(0, (int)node.getLayoutPadding(YogaEdge.BOTTOM));
        assertEquals(0, (int)node.getLayoutBorder(YogaEdge.LEFT));
        assertEquals(0, (int)node.getLayoutBorder(YogaEdge.RIGHT));
        assertEquals(0, (int)node.getLayoutBorder(YogaEdge.TOP));
        assertEquals(0, (int)node.getLayoutBorder(YogaEdge.BOTTOM));
        assertEquals(node.getLayoutDirection(), YogaDirection.INHERIT);
        assertTrue(node.hasNewLayout());
        assertFalse(node.isMeasureDefined());
        assertFalse(node.isBaselineDefined());
    }
}
