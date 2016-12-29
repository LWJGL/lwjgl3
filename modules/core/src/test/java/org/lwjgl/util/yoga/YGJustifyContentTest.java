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
public class YGJustifyContentTest {
	@Test
	public void test_justify_content_row_flex_start() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

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
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(20f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(92f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(82f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(72f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_justify_content_row_flex_end() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetJustifyContent(root, YGJustifyFlexEnd);
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

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
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(72f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(82f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(92f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(20f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_justify_content_row_center() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetJustifyContent(root, YGJustifyCenter);
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

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
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(36f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(46f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(56f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(56f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(46f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(36f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_justify_content_row_space_between() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetJustifyContent(root, YGJustifySpaceBetween);
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

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
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(46f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(92f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(92f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(46f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_justify_content_row_space_around() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetJustifyContent(root, YGJustifySpaceAround);
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

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
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(12f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(46f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(80f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(80f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(46f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(12f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_justify_content_column_flex_start() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetHeight(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_justify_content_column_flex_end() {
		long root = YGNodeNew();
		YGNodeStyleSetJustifyContent(root, YGJustifyFlexEnd);
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

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
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(72f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(82f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(92f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(72f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(82f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(92f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_justify_content_column_center() {
		long root = YGNodeNew();
		YGNodeStyleSetJustifyContent(root, YGJustifyCenter);
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

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
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(36f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(46f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(56f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(36f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(46f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(56f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_justify_content_column_space_between() {
		long root = YGNodeNew();
		YGNodeStyleSetJustifyContent(root, YGJustifySpaceBetween);
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

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
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(46f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(92f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(46f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(92f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_justify_content_column_space_around() {
		long root = YGNodeNew();
		YGNodeStyleSetJustifyContent(root, YGJustifySpaceAround);
		YGNodeStyleSetWidth(root, 102f);
		YGNodeStyleSetHeight(root, 102f);

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
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(12f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(46f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(102f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(12f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(46f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(102f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

}
