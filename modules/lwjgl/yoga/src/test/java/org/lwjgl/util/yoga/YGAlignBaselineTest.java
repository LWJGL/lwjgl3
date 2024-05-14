/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package org.lwjgl.util.yoga;

import org.testng.annotations.*;

import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.AssertJUnit.assertEquals;

public class YGAlignBaselineTest {

    private static YGBaselineFuncI getBaselineFunc() {
        return (node, width, height) -> height / 2;
    }

    @Test
    public void test_align_baseline_parent_using_child_in_column_as_reference() {
        YogaConfig config = YogaConfigFactory.create();

        YogaNode root = createYGNode(config, YogaFlexDirection.ROW, 1000f, 1000f, true);

        YogaNode root_child0 = createYGNode(config, YogaFlexDirection.COLUMN, 500f, 600f, false);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createYGNode(config, YogaFlexDirection.COLUMN, 500f, 800f, false);
        root.addChildAt(root_child1, 1);

        YogaNode root_child1_child0 =
            createYGNode(config, YogaFlexDirection.COLUMN, 500f, 300f, false);
        root_child1.addChildAt(root_child1_child0, 0);

        YogaNode root_child1_child1 =
            createYGNode(config, YogaFlexDirection.COLUMN, 500f, 400f, false);
        root_child1_child1.setBaselineFunction(getBaselineFunc());
        root_child1_child1.setIsReferenceBaseline(true);
        root_child1.addChildAt(root_child1_child1, 1);

        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);

        assertEquals(500f, root_child1.getLayoutX(), 0.0f);
        assertEquals(100f, root_child1.getLayoutY(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);

        assertEquals(0f, root_child1_child1.getLayoutX(), 0.0f);
        assertEquals(300f, root_child1_child1.getLayoutY(), 0.0f);

        root_child1_child1.freeBaselineFunction();
    }

    @Test
    public void test_align_baseline_parent_using_child_in_row_as_reference() {
        YogaConfig config = YogaConfigFactory.create();

        YogaNode root = createYGNode(config, YogaFlexDirection.ROW, 1000f, 1000f, true);

        YogaNode root_child0 = createYGNode(config, YogaFlexDirection.COLUMN, 500f, 600f, false);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createYGNode(config, YogaFlexDirection.ROW, 500f, 800f, true);
        root.addChildAt(root_child1, 1);

        YogaNode root_child1_child0 =
            createYGNode(config, YogaFlexDirection.COLUMN, 500f, 500f, false);
        root_child1.addChildAt(root_child1_child0, 0);

        YogaNode root_child1_child1 =
            createYGNode(config, YogaFlexDirection.COLUMN, 500f, 400f, false);
        root_child1_child1.setBaselineFunction(getBaselineFunc());
        root_child1_child1.setIsReferenceBaseline(true);
        root_child1.addChildAt(root_child1_child1, 1);

        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);

        assertEquals(500f, root_child1.getLayoutX(), 0.0f);
        assertEquals(100f, root_child1.getLayoutY(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);

        assertEquals(500f, root_child1_child1.getLayoutX(), 0.0f);
        assertEquals(300f, root_child1_child1.getLayoutY(), 0.0f);

        root_child1_child1.freeBaselineFunction();
    }

    private static YogaNode createYGNode(
        YogaConfig config,
        YogaFlexDirection flexDirection,
        float width,
        float height,
        boolean alignBaseline
    ) {
        YogaNode node = new YogaNode(config);
        node.setFlexDirection(flexDirection);
        node.setWidth(width);
        node.setHeight(height);
        if (alignBaseline) {
            node.setAlignItems(YogaAlign.BASELINE);
        }
        return node;
    }
}
