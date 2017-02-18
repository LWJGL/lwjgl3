/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package org.lwjgl.util.yoga;

import org.testng.annotations.Test;

import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.Assert.*;

public class YGFlexDirectionTest {
	@Test
	public void test_flex_direction_column_no_height() {
		YogaNode root = new YogaNode();
		root.setWidth(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setHeight(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode();
		root_child2.setHeight(10f);
		root.addChildAt(root_child2, 2);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(30f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(10f, root_child1.getLayoutY(), 0.0f);
		assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child2.getLayoutY(), 0.0f);
		assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(30f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(10f, root_child1.getLayoutY(), 0.0f);
		assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child2.getLayoutY(), 0.0f);
		assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_flex_direction_row_no_width() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode();
		root_child2.setWidth(10f);
		root.addChildAt(root_child2, 2);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(30f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(10f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(20f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(30f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(20f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(10f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_flex_direction_column() {
		YogaNode root = new YogaNode();
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setHeight(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode();
		root_child2.setHeight(10f);
		root.addChildAt(root_child2, 2);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(10f, root_child1.getLayoutY(), 0.0f);
		assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child2.getLayoutY(), 0.0f);
		assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(10f, root_child1.getLayoutY(), 0.0f);
		assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child2.getLayoutY(), 0.0f);
		assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_flex_direction_row() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode();
		root_child2.setWidth(10f);
		root.addChildAt(root_child2, 2);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(10f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(20f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(90f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(80f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(70f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_flex_direction_column_reverse() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.COLUMN_REVERSE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setHeight(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode();
		root_child2.setHeight(10f);
		root.addChildAt(root_child2, 2);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(90f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(80f, root_child1.getLayoutY(), 0.0f);
		assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(70f, root_child2.getLayoutY(), 0.0f);
		assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(90f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(80f, root_child1.getLayoutY(), 0.0f);
		assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(70f, root_child2.getLayoutY(), 0.0f);
		assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_flex_direction_row_reverse() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW_REVERSE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode();
		root_child2.setWidth(10f);
		root.addChildAt(root_child2, 2);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(90f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(80f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(70f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(10f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(20f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);
	}

}
