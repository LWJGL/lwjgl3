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
public class YGPaddingTest {
	@Test
	public void test_padding_no_size() {
		long root = YGNodeNew();
		YGNodeStyleSetPadding(root, YGEdgeLeft, 10);
		YGNodeStyleSetPadding(root, YGEdgeTop, 10);
		YGNodeStyleSetPadding(root, YGEdgeRight, 10);
		YGNodeStyleSetPadding(root, YGEdgeBottom, 10);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(20f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(20f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root), 0.0f);
	}

	@Test
	public void test_padding_container_match_child() {
		long root = YGNodeNew();
		YGNodeStyleSetPadding(root, YGEdgeLeft, 10);
		YGNodeStyleSetPadding(root, YGEdgeTop, 10);
		YGNodeStyleSetPadding(root, YGEdgeRight, 10);
		YGNodeStyleSetPadding(root, YGEdgeBottom, 10);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 10f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(30f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_padding_flex_child() {
		long root = YGNodeNew();
		YGNodeStyleSetPadding(root, YGEdgeLeft, 10);
		YGNodeStyleSetPadding(root, YGEdgeTop, 10);
		YGNodeStyleSetPadding(root, YGEdgeRight, 10);
		YGNodeStyleSetPadding(root, YGEdgeBottom, 10);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeStyleSetWidth(root_child0, 10f);
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
		assertEquals(80f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(80f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_padding_stretch_child() {
		long root = YGNodeNew();
		YGNodeStyleSetPadding(root, YGEdgeLeft, 10);
		YGNodeStyleSetPadding(root, YGEdgeTop, 10);
		YGNodeStyleSetPadding(root, YGEdgeRight, 10);
		YGNodeStyleSetPadding(root, YGEdgeBottom, 10);
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

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(10f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(80f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_padding_center_child() {
		long root = YGNodeNew();
		YGNodeStyleSetJustifyContent(root, YGJustifyCenter);
		YGNodeStyleSetAlignItems(root, YGAlignCenter);
		YGNodeStyleSetPadding(root, YGEdgeStart, 10);
		YGNodeStyleSetPadding(root, YGEdgeEnd, 20);
		YGNodeStyleSetPadding(root, YGEdgeBottom, 20);
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

		assertEquals(40f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(35f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(35f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

	@Test
	public void test_child_with_padding_align_end() {
		long root = YGNodeNew();
		YGNodeStyleSetJustifyContent(root, YGJustifyFlexEnd);
		YGNodeStyleSetAlignItems(root, YGAlignFlexEnd);
		YGNodeStyleSetWidth(root, 200f);
		YGNodeStyleSetHeight(root, 200f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetPadding(root_child0, YGEdgeLeft, 20);
		YGNodeStyleSetPadding(root_child0, YGEdgeTop, 20);
		YGNodeStyleSetPadding(root_child0, YGEdgeRight, 20);
		YGNodeStyleSetPadding(root_child0, YGEdgeBottom, 20);
		YGNodeStyleSetWidth(root_child0, 100f);
		YGNodeStyleSetHeight(root_child0, 100f);
		YGNodeInsertChild(root, root_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(100f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);
	}

}
