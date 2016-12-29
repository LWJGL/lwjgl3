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

import static org.lwjgl.util.yoga.Yoga.*;
import static org.testng.Assert.*;

/* LWJGL port of the corresponding Yoga test. */
public class YGAbsolutePositionTest {

	@Test
	public void test_absolute_layout_width_height_start_top() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100.0f);
		YGNodeStyleSetHeight(root, 100.0f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetPositionType(root_child0, YGPositionTypeAbsolute);
		YGNodeStyleSetPosition(root_child0, YGEdgeStart, 10f);
		YGNodeStyleSetPosition(root_child0, YGEdgeTop, 10f);
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(80f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeFree(root_child0);
		YGNodeFree(root);
	}

	@Test
	public void test_absolute_layout_width_height_end_bottom() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetPositionType(root_child0, YGPositionTypeAbsolute);
		YGNodeStyleSetPosition(root_child0, YGEdgeEnd, 10f);
		YGNodeStyleSetPosition(root_child0, YGEdgeBottom, 10f);
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(80f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_absolute_layout_start_top_end_bottom() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetPositionType(root_child0, YGPositionTypeAbsolute);
		YGNodeStyleSetPosition(root_child0, YGEdgeStart, 10f);
		YGNodeStyleSetPosition(root_child0, YGEdgeTop, 10f);
		YGNodeStyleSetPosition(root_child0, YGEdgeEnd, 10f);
		YGNodeStyleSetPosition(root_child0, YGEdgeBottom, 10f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_absolute_layout_width_height_start_top_end_bottom() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetPositionType(root_child0, YGPositionTypeAbsolute);
		YGNodeStyleSetPosition(root_child0, YGEdgeStart, 10f);
		YGNodeStyleSetPosition(root_child0, YGEdgeTop, 10f);
		YGNodeStyleSetPosition(root_child0, YGEdgeEnd, 10f);
		YGNodeStyleSetPosition(root_child0, YGEdgeBottom, 10f);
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(80f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_do_not_clamp_height_of_absolute_node_to_height_of_its_overflow_hidden_parent() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetOverflow(root, YGOverflowHidden);
		YGNodeStyleSetWidth(root, 50f);
		YGNodeStyleSetHeight(root, 50f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetPositionType(root_child0, YGPositionTypeAbsolute);
		YGNodeStyleSetPosition(root_child0, YGEdgeStart, 0f);
		YGNodeStyleSetPosition(root_child0, YGEdgeTop, 0f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child0_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0_child0, 100f);
		YGNodeStyleSetHeight(root_child0_child0, 100f);
		YGNodeInsertChild(root_child0, root_child0_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(-50f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);
	}

	@Test
	public void test_absolute_layout_within_border() {
		long root = YGNodeNew();
		YGNodeStyleSetMargin(root, YGEdgeLeft, 10f);
		YGNodeStyleSetMargin(root, YGEdgeTop, 10f);
		YGNodeStyleSetMargin(root, YGEdgeRight, 10f);
		YGNodeStyleSetMargin(root, YGEdgeBottom, 10f);
		YGNodeStyleSetPadding(root, YGEdgeLeft, 10);
		YGNodeStyleSetPadding(root, YGEdgeTop, 10);
		YGNodeStyleSetPadding(root, YGEdgeRight, 10);
		YGNodeStyleSetPadding(root, YGEdgeBottom, 10);
		YGNodeStyleSetBorder(root, YGEdgeLeft, 10f);
		YGNodeStyleSetBorder(root, YGEdgeTop, 10f);
		YGNodeStyleSetBorder(root, YGEdgeRight, 10f);
		YGNodeStyleSetBorder(root, YGEdgeBottom, 10f);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetPositionType(root_child0, YGPositionTypeAbsolute);
		YGNodeStyleSetPosition(root_child0, YGEdgeLeft, 0f);
		YGNodeStyleSetPosition(root_child0, YGEdgeTop, 0f);
		YGNodeStyleSetWidth(root_child0, 50f);
		YGNodeStyleSetHeight(root_child0, 50f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetPositionType(root_child1, YGPositionTypeAbsolute);
		YGNodeStyleSetPosition(root_child1, YGEdgeRight, 0f);
		YGNodeStyleSetPosition(root_child1, YGEdgeBottom, 0f);
		YGNodeStyleSetWidth(root_child1, 50f);
		YGNodeStyleSetHeight(root_child1, 50f);
		YGNodeInsertChild(root, root_child1, 1);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(10f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(40f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(40f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(10f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(40f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(40f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);
	}

}