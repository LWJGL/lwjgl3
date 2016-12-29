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
public class YGAlignContentTest {
	@Test
	public void test_align_content_flex_start() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexWrap(root, YGWrapWrap);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 50f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 50f);
		YGNodeStyleSetHeight(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 50f);
		YGNodeStyleSetHeight(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);

		long root_child3 = YGNodeNew();
		YGNodeStyleSetWidth(root_child3, 50f);
		YGNodeStyleSetHeight(root_child3, 10f);
		YGNodeInsertChild(root, root_child3, 3);

		long root_child4 = YGNodeNew();
		YGNodeStyleSetWidth(root_child4, 50f);
		YGNodeStyleSetHeight(root_child4, 10f);
		YGNodeInsertChild(root, root_child4, 4);
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

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(40f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child4), 0.0f);

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

		assertEquals(50f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(40f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child4), 0.0f);
	}

	@Test
	public void test_align_content_flex_end() {
		long root = YGNodeNew();
		YGNodeStyleSetAlignContent(root, YGAlignFlexEnd);
		YGNodeStyleSetFlexWrap(root, YGWrapWrap);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 50f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 50f);
		YGNodeStyleSetHeight(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 50f);
		YGNodeStyleSetHeight(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);

		long root_child3 = YGNodeNew();
		YGNodeStyleSetWidth(root_child3, 50f);
		YGNodeStyleSetHeight(root_child3, 10f);
		YGNodeInsertChild(root, root_child3, 3);

		long root_child4 = YGNodeNew();
		YGNodeStyleSetWidth(root_child4, 50f);
		YGNodeStyleSetHeight(root_child4, 10f);
		YGNodeInsertChild(root, root_child4, 4);
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

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(40f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child4), 0.0f);

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

		assertEquals(50f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(40f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child4), 0.0f);
	}

	@Test
	public void test_align_content_center() {
		long root = YGNodeNew();
		YGNodeStyleSetAlignContent(root, YGAlignCenter);
		YGNodeStyleSetFlexWrap(root, YGWrapWrap);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 50f);
		YGNodeStyleSetHeight(root_child0, 10f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 50f);
		YGNodeStyleSetHeight(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 50f);
		YGNodeStyleSetHeight(root_child2, 10f);
		YGNodeInsertChild(root, root_child2, 2);

		long root_child3 = YGNodeNew();
		YGNodeStyleSetWidth(root_child3, 50f);
		YGNodeStyleSetHeight(root_child3, 10f);
		YGNodeInsertChild(root, root_child3, 3);

		long root_child4 = YGNodeNew();
		YGNodeStyleSetWidth(root_child4, 50f);
		YGNodeStyleSetHeight(root_child4, 10f);
		YGNodeInsertChild(root, root_child4, 4);
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

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(40f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child4), 0.0f);

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

		assertEquals(50f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(30f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(40f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(10f, YGNodeLayoutGetHeight(root_child4), 0.0f);
	}

	@Test
	public void test_align_content_stretch() {
		long root = YGNodeNew();
		YGNodeStyleSetAlignContent(root, YGAlignStretch);
		YGNodeStyleSetFlexWrap(root, YGWrapWrap);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 50f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetWidth(root_child1, 50f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetWidth(root_child2, 50f);
		YGNodeInsertChild(root, root_child2, 2);

		long root_child3 = YGNodeNew();
		YGNodeStyleSetWidth(root_child3, 50f);
		YGNodeInsertChild(root, root_child3, 3);

		long root_child4 = YGNodeNew();
		YGNodeStyleSetWidth(root_child4, 50f);
		YGNodeInsertChild(root, root_child4, 4);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child4), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child4), 0.0f);
	}

}
