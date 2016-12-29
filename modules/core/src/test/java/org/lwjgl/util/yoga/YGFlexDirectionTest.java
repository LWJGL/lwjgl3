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
public class YGFlexDirectionTest {
	@Test
	public void test_flex_direction_column_no_height() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetHeight(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetHeight(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_flex_direction_row_no_width() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(20f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(20f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_flex_direction_column() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetHeight(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetHeight(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_flex_direction_row() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(20f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(90f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(80f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(70f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_flex_direction_column_reverse() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionColumnReverse);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetHeight(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetHeight(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(90f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(70f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(90f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(70f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_flex_direction_row_reverse() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRowReverse);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(90f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(80f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(70f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(20f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

}
