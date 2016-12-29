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
public class YGFlexTest {
	@Test
	public void test_flex_basis_flex_grow_column() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeStyleSetFlexBasis(root_child0, 50f);
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
		assertEquals(75f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(75f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(75f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(75f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);
	}

	@Test
	public void test_flex_basis_flex_grow_row() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeStyleSetFlexBasis(root_child0, 50f);
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
		assertEquals(75f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(75f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(25f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(75f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);
	}

	@Test
	public void test_flex_basis_flex_shrink_column() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexShrink(root_child0, 1f);
		YGNodeStyleSetFlexBasis(root_child0, 100f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexBasis(root_child1, 50f);
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

	@Test
	public void test_flex_basis_flex_shrink_row() {
		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexShrink(root_child0, 1f);
		YGNodeStyleSetFlexBasis(root_child0, 100f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexBasis(root_child1, 50f);
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
	public void test_flex_shrink_to_zero() {
		long root = YGNodeNew();
		YGNodeStyleSetHeight(root, 75f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 50f);
		YGNodeStyleSetHeight(root_child0, 50f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexShrink(root_child1, 1f);
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
		assertEquals(75f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(75f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(50f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_flex_basis_overrides_main_size() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeStyleSetFlexBasis(root_child0, 50f);
		YGNodeStyleSetHeight(root_child0, 20f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child1, 1f);
		YGNodeStyleSetHeight(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child2, 1f);
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
		assertEquals(60f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(60f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(60f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(60f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(80f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(20f, YGNodeLayoutGetHeight(root_child2), 0.0f);
	}

	@Test
	public void test_flex_grow_shrink_at_most() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeInsertChild(root, root_child0, 0);

		long root_child0_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0_child0, 1f);
		YGNodeStyleSetFlexShrink(root_child0_child0, 1f);
		YGNodeInsertChild(root_child0, root_child0_child0, 0);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);
	}

}
