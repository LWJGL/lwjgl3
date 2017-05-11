/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.util.yoga.Yoga.*;
import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.Assert.*;

public class YogaNodeTest {

    @Test
    public void testInit() {
        int refCount = YGNodeGetInstanceCount();
        new YogaNode();
        assertEquals(refCount + 1, YGNodeGetInstanceCount());
    }

    @Test
    public void testBaseline() {
        YogaNode root = new YogaNode();
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setAlignItems(YogaAlign.BASELINE);
        root.setWidth(100);
        root.setHeight(100);

        YogaNode child1 = new YogaNode();
        child1.setWidth(40);
        child1.setHeight(40);
        root.addChildAt(child1, 0);

        YogaNode child2 = new YogaNode();
        child2.setWidth(40);
        child2.setHeight(40);
        YGNodeSetBaselineFunc(child2.node, (node, width, height) -> 0);
        root.addChildAt(child2, 1);

        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0, (int)child1.getLayoutY());
        assertEquals(40, (int)child2.getLayoutY());

        YGNodeGetBaselineFunc(child2.node).free();
    }

    private static YGMeasureFunc getTestMeasureFunc(float testWidth, float testHeight) {
        return YGMeasureFunc.create((node, width, widthMode, height, heightMode) -> {
            try (MemoryStack stack = stackPush()) {
                return YGMeasureFunc.toLong(
                    YGSize.mallocStack(stack)
                        .width(testWidth)
                        .height(testHeight)
                );
            }
        });
    }

    @Test
    public void testMeasure() {
        YogaNode node = new YogaNode();

        try (YGMeasureFunc measureFunc = getTestMeasureFunc(200, 100)) {
            YGNodeSetMeasureFunc(node.node, measureFunc);
            node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
            assertEquals(200, (int)node.getLayoutWidth());
            assertEquals(100, (int)node.getLayoutHeight());
        }
    }

    @Test
    public void testMeasureFloat() {
        YogaNode node = new YogaNode();

        try (YGMeasureFunc measureFunc = getTestMeasureFunc(200.5f, 100.5f)) {
            YGNodeSetMeasureFunc(node.node, measureFunc);
            node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
            assertEquals(201.0f, node.getLayoutWidth(), 0.01f);
            assertEquals(101.0f, node.getLayoutHeight(), 0.01f);
        }
    }

    @Test
    public void testMeasureFloatMin() {
        YogaNode node = new YogaNode();
        try (YGMeasureFunc measureFunc = getTestMeasureFunc(Float.MIN_VALUE, Float.MIN_VALUE)) {
            YGNodeSetMeasureFunc(node.node, measureFunc);
            node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
            assertEquals(Float.MIN_VALUE, node.getLayoutWidth(), 0.01f);
            assertEquals(Float.MIN_VALUE, node.getLayoutHeight(), 0.01f);
        }
    }

    @Test
    public void testMeasureFloatMax() {
        YogaNode node = new YogaNode();

        try (YGMeasureFunc measureFunc = getTestMeasureFunc(Float.MAX_VALUE, Float.MAX_VALUE)) {
            YGNodeSetMeasureFunc(node.node, measureFunc);
            node.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);
            assertEquals(Float.MAX_VALUE, node.getLayoutWidth(), 0.0f);
            assertEquals(Float.MAX_VALUE, node.getLayoutHeight(), 0.0f);
        }
    }

    @Test
    public void testCopyStyle() {
        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.mallocStack(stack);

            YogaNode node0 = new YogaNode();
            assertTrue(YogaConstants.isUndefined(node0.getMaxHeight(v)));

            YogaNode node1 = new YogaNode();
            node1.setMaxHeight(100);

            node0.copyStyle(node1);
            assertEquals(100, (int)node0.getMaxHeight(v).value());
        }
    }

    @Test
    public void testLayoutMargin() {
        YogaNode node = new YogaNode();
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
        YogaNode node = new YogaNode();
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
        YogaNode node = new YogaNode();
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
    public void testPercentPaddingOnRoot() {
        YogaNode node = new YogaNode();
        node.setPaddingPercent(YogaEdge.ALL, 10);
        node.calculateLayout(50, 50);

        assertEquals(5, (int)node.getLayoutPadding(YogaEdge.LEFT));
        assertEquals(5, (int)node.getLayoutPadding(YogaEdge.RIGHT));
        assertEquals(5, (int)node.getLayoutPadding(YogaEdge.TOP));
        assertEquals(5, (int)node.getLayoutPadding(YogaEdge.BOTTOM));
    }

    @Test
    public void testDefaultEdgeValues() {
        YogaNode node = new YogaNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.mallocStack(stack);

            for (YogaEdge edge : YogaEdge.values()) {
                assertEquals(YogaUnit.UNDEFINED, node.getMargin(edge, v).unit());
                assertEquals(YogaUnit.UNDEFINED, node.getPadding(edge, v).unit());
                assertEquals(YogaUnit.UNDEFINED, node.getPosition(edge, v).unit());
                assertTrue(YogaConstants.isUndefined(node.getBorder(edge)));
            }
        }
    }
}
