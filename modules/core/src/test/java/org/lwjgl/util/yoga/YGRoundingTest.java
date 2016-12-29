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
public class YGRoundingTest {
	@Test
	public void test_rounding_flex_basis_flex_grow_row_width_of_100() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child1, 1f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child2, 1f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(33f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(33f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(34f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(67f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(33f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(67f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(33f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(33f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(34f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(33f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

	@Test
	public void test_rounding_flex_basis_flex_grow_row_prime_number_width() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetWidth(root, 113f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 1f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child1, 1f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child2, 1f);
		YGNodeInsertChild(root, root_child2, 2);

		long root_child3 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child3, 1f);
		YGNodeInsertChild(root, root_child3, 3);

		long root_child4 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child4, 1f);
		YGNodeInsertChild(root, root_child4, 4);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(23f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(23f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(22f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(45f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(23f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(68f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(22f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(90f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(23f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child4), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(90f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(23f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(68f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(22f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(45f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(23f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		assertEquals(23f, YGNodeLayoutGetLeft(root_child3), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child3), 0.0f);
		assertEquals(22f, YGNodeLayoutGetWidth(root_child3), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child3), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child4), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child4), 0.0f);
		assertEquals(23f, YGNodeLayoutGetWidth(root_child4), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child4), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

	@Test
	public void test_rounding_flex_basis_flex_shrink_row() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetFlexDirection(root, YGFlexDirectionRow);
		YGNodeStyleSetWidth(root, 101f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexShrink(root_child0, 1f);
		YGNodeStyleSetFlexBasis(root_child0, 100f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexBasis(root_child1, 25f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetFlexBasis(root_child2, 25f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(101f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(51f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(51f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(76f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(25f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(101f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(50f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(51f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(25f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(25f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

	@Test
	public void test_rounding_flex_basis_overrides_main_size() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 113f);

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
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(64f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(64f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(64f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(64f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

	@Test
	public void test_rounding_total_fractial() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 87.4f);
		YGNodeStyleSetHeight(root, 113.4f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 0.7f);
		YGNodeStyleSetFlexBasis(root_child0, 50.3f);
		YGNodeStyleSetHeight(root_child0, 20.3f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child1, 1.6f);
		YGNodeStyleSetHeight(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child2, 1.1f);
		YGNodeStyleSetHeight(root_child2, 10.7f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(59f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(59f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(59f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(59f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

	@Test
	public void test_rounding_total_fractial_nested() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 87.4f);
		YGNodeStyleSetHeight(root, 113.4f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0, 0.7f);
		YGNodeStyleSetFlexBasis(root_child0, 50.3f);
		YGNodeStyleSetHeight(root_child0, 20.3f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child0_child0 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0_child0, 1f);
		YGNodeStyleSetFlexBasis(root_child0_child0, 0.3f);
		YGNodeStyleSetPosition(root_child0_child0, YGEdgeBottom, 13.3f);
		YGNodeStyleSetHeight(root_child0_child0, 9.9f);
		YGNodeInsertChild(root_child0, root_child0_child0, 0);

		long root_child0_child1 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child0_child1, 4f);
		YGNodeStyleSetFlexBasis(root_child0_child1, 0.3f);
		YGNodeStyleSetPosition(root_child0_child1, YGEdgeTop, 13.3f);
		YGNodeStyleSetHeight(root_child0_child1, 1.1f);
		YGNodeInsertChild(root_child0, root_child0_child1, 1);

		long root_child1 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child1, 1.6f);
		YGNodeStyleSetHeight(root_child1, 10f);
		YGNodeInsertChild(root, root_child1, 1);

		long root_child2 = YGNodeNew();
		YGNodeStyleSetFlexGrow(root_child2, 1.1f);
		YGNodeStyleSetHeight(root_child2, 10.7f);
		YGNodeInsertChild(root, root_child2, 2);
		YGNodeStyleSetDirection(root, YGDirectionLTR);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(59f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(-13f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(12f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetTop(root_child0_child1), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child0_child1), 0.0f);
		assertEquals(47f, YGNodeLayoutGetHeight(root_child0_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(59f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(59f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(-13f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(12f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetTop(root_child0_child1), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child0_child1), 0.0f);
		assertEquals(47f, YGNodeLayoutGetHeight(root_child0_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(59f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(30f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(87f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

	@Test
	public void test_rounding_fractial_input_1() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 113.4f);

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
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(64f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(64f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(64f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(64f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

	@Test
	public void test_rounding_fractial_input_2() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 113.6f);

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
		assertEquals(114f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(65f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(65f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(114f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(65f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(65f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

	@Test
	public void test_rounding_fractial_input_3() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetPosition(root, YGEdgeTop, 0.3f);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 113.4f);

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
		assertEquals(114f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(64f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(64f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(114f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(64f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(64f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

	@Test
	public void test_rounding_fractial_input_4() {
		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, true);

		long root = YGNodeNew();
		YGNodeStyleSetPosition(root, YGEdgeTop, 0.7f);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 113.4f);

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
		assertEquals(1f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(64f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(64f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(1f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(113f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(64f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child1), 0.0f);
		assertEquals(64f, YGNodeLayoutGetTop(root_child1), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child1), 0.0f);
		assertEquals(25f, YGNodeLayoutGetHeight(root_child1), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child2), 0.0f);
		assertEquals(89f, YGNodeLayoutGetTop(root_child2), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child2), 0.0f);
		assertEquals(24f, YGNodeLayoutGetHeight(root_child2), 0.0f);

		YGSetExperimentalFeatureEnabled(YGExperimentalFeatureRounding, false);
	}

}
