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
public class YGMinMaxDimensionTest {
	@Test
	public void test_max_width() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetMaxWidth(root_child0, 50f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_max_height() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeStyleSetMaxHeight(root_child0, 50f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(90f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_min_height() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeStyleSetMinHeight(root_child0, 60f);

		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child1, 1f);
		YGNodeInsertChild(root, root_child1, 1);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child1), 0.0f);
	}

	@Test
	public void test_min_width() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeStyleSetMinWidth(root_child0, 60f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child1, 1f);
		YGNodeInsertChild(root, root_child1, 1);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(80f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(20f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);
	}

	@Test
	public void test_justify_content_min_max() {
		long root = YGNodeNew();
		YGNodeStyleSetJustifyContent(root, YGJustifyCenter);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetMinHeight(root, 100f);
		YGNodeStyleSetMaxHeight(root, 200f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 60f);
		YGNodeStyleSetHeight(root_child0, 60f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(60f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(40f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(60f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_align_items_min_max() {
		long root = YGNodeNew();
		YGNodeStyleSetAlignItems(root, YGAlignCenter);
		YGNodeStyleSetMinWidth(root, 100f);
		YGNodeStyleSetMaxWidth(root, 200f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 60f);
		YGNodeStyleSetHeight(root_child0, 60f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(20f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(60f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(20f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(60f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_justify_content_overflow_min_max() {
		long root = YGNodeNew();
		YGNodeStyleSetJustifyContent(root, YGJustifyCenter);
		YGNodeStyleSetMinHeight(root, 100f);
		YGNodeStyleSetMaxHeight(root, 110f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 50f);
		YGNodeStyleSetHeight(root_child0, 50f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 50f);
		YGNodeStyleSetHeight(root_child1, 50f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 50f);
		YGNodeStyleSetHeight(root_child2, 50f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(110f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(-20f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(110f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(-20f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_flex_grow_within_max_width() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 200f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexDirection(root_child0, YGFlexDirectionRow);
		YGNodeStyleSetMaxWidth(root_child0, 100f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child0_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0_child0, 1f);
		YGNodeStyleSetHeight(root_child0_child0, 20f);
		YGNodeInsertChild(root_child0, root_child0_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(100f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);
	}

	@Test
	public void test_flex_grow_within_constrained_max_width() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 200f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexDirection(root_child0, YGFlexDirectionRow);
		YGNodeStyleSetMaxWidth(root, 300f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child0_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0_child0, 1f);
		YGNodeStyleSetHeight(root_child0_child0, 20f);
		YGNodeInsertChild(root_child0, root_child0_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);
	}

	@Test
	public void test_flex_grow_within_constrained_min_row() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetMinWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 50f);
		YGNodeInsertChild(root, root_child1, 1);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);
	}

	@Test
	public void test_flex_grow_within_constrained_min_column() {
		long root = YGNodeNew();
		YGNodeStyleSetMinHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetHeight(root_child1, 50f);
		YGNodeInsertChild(root, root_child1, 1);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);
	}

	@Test
	public void test_flex_grow_within_constrained_max_row() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 200f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexDirection(root_child0, YGFlexDirectionRow);
		YGNodeStyleSetMaxWidth(root_child0, 100f);
		YGNodeStyleSetHeight(root_child0, 100f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child0_child0 = YGNodeNew();
		YGNodeStyleSetFlexShrink(root_child0_child0, 1f);
		YGNodeStyleSetFlexBasis(root_child0_child0, 100f);
		YGNodeInsertChild(root_child0, root_child0_child0, 0);

		long root_child0_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0_child1, 50f);
		YGNodeInsertChild(root_child0, root_child0_child1, 1);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child0_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(100f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0_child1), 0.0f);
	}

	@Test
	public void test_flex_grow_within_constrained_max_column() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetMaxHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexShrink(root_child0, 1f);
		YGNodeStyleSetFlexBasis(root_child0, 100f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
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
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child1), 0.0f);
	}

}
