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
public class YGFlexWrapTest {
	@Test
	public void test_wrap_column() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexWrap(root, YGWrapWrap);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 30f);
		YGNodeStyleSetHeight(root_child0, 30f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 30f);
		YGNodeStyleSetHeight(root_child1, 30f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 30f);
		YGNodeStyleSetHeight(root_child2, 30f);
		YGNodeInsertChild(root, root_child2, 2);

		long root_child3 = YGNodeNew();
		YGNodeStyleSetWidth(root_child3, 30f);
		YGNodeStyleSetHeight(root_child3, 30f);
		YGNodeInsertChild(root, root_child3, 3);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(60f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(60f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(30f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(60f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(30f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(30f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(30f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(60f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child3), 0.0f);
	}

	@Test
	public void test_wrap_row() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetFlexWrap(root, YGWrapWrap);
		YGNodeStyleSetWidth(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 30f);
		YGNodeStyleSetHeight(root_child0, 30f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 30f);
		YGNodeStyleSetHeight(root_child1, 30f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 30f);
		YGNodeStyleSetHeight(root_child2, 30f);
		YGNodeInsertChild(root, root_child2, 2);

		long root_child3 = YGNodeNew();
		YGNodeStyleSetWidth(root_child3, 30f);
		YGNodeStyleSetHeight(root_child3, 30f);
		YGNodeInsertChild(root, root_child3, 3);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(30f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(60f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(70f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(40f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(70f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child3), 0.0f);
	}

	@Test
	public void test_wrap_row_align_items_flex_end() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetAlignItems(root, YGAlignFlexEnd);
		YGNodeStyleSetFlexWrap(root, YGWrapWrap);
		YGNodeStyleSetWidth(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 30f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 30f);
		YGNodeStyleSetHeight(root_child1, 20f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 30f);
		YGNodeStyleSetHeight(root_child2, 30f);
		YGNodeInsertChild(root, root_child2, 2);

		long root_child3 = YGNodeNew();
		YGNodeStyleSetWidth(root_child3, 30f);
		YGNodeStyleSetHeight(root_child3, 30f);
		YGNodeInsertChild(root, root_child3, 3);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(30f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(60f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(70f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(40f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(70f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child3), 0.0f);
	}

	@Test
	public void test_wrap_row_align_items_center() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetAlignItems(root, YGAlignCenter);
		YGNodeStyleSetFlexWrap(root, YGWrapWrap);
		YGNodeStyleSetWidth(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 30f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 30f);
		YGNodeStyleSetHeight(root_child1, 20f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 30f);
		YGNodeStyleSetHeight(root_child2, 30f);
		YGNodeInsertChild(root, root_child2, 2);

		long root_child3 = YGNodeNew();
		YGNodeStyleSetWidth(root_child3, 30f);
		YGNodeStyleSetHeight(root_child3, 30f);
		YGNodeInsertChild(root, root_child3, 3);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(30f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(5f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(60f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(70f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(40f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(5f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(70f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child3), 0.0f);
	}

	@Test
	public void test_flex_wrap_children_with_min_main_overriding_flex_basis() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetFlexWrap(root, YGWrapWrap);
		YGNodeStyleSetWidth(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexBasis(root_child0, 50f);
		YGNodeStyleSetMinWidth(root_child0, 55f);
		YGNodeStyleSetHeight(root_child0, 50f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexBasis(root_child1, 50f);
		YGNodeStyleSetMinWidth(root_child1, 55f);
		YGNodeStyleSetHeight(root_child1, 50f);
		YGNodeInsertChild(root, root_child1, 1);

		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(55f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(55f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(45f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(55f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(45f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(55f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);
	}

}
