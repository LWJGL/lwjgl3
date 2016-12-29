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
public class YGAlignItemsTest {
	@Test
	public void test_align_items_stretch() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
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
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

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
	}

	@Test
	public void test_align_items_center() {
		long root = YGNodeNew();
		YGNodeStyleSetAlignItems(root, YGAlignCenter);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(45f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(45f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_align_items_flex_start() {
		long root = YGNodeNew();
		YGNodeStyleSetAlignItems(root, YGAlignFlexStart);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 10f);
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
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(90f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_align_items_flex_end() {
		long root = YGNodeNew();
		YGNodeStyleSetAlignItems(root, YGAlignFlexEnd);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(90f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

}
