/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package org.lwjgl.util.yoga;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.lwjgl.util.yoga.Yoga.*;
import static org.testng.Assert.*;

public class YGSizeOverflowTest {
	@Test
	public void test_nested_overflowing_child() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeInsertChild(root, root_child0, 0);

		long root_child0_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0_child0, 200f);
		YGNodeStyleSetHeight(root_child0_child0, 200f);
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
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(-100f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);
	}

	@Test
	public void test_nested_overflowing_child_in_constraint_parent() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 100f);
		YGNodeStyleSetHeight(root_child0, 100f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child0_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0_child0, 200f);
		YGNodeStyleSetHeight(root_child0_child0, 200f);
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
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(-100f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);
	}

	@Test
	public void test_parent_wrap_child_size_overflowing_parent() {
		long root = YGNodeNew();
		YGNodeStyleSetWidth(root, 100f);
		YGNodeStyleSetHeight(root, 100f);

		long root_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0, 100f);
		YGNodeInsertChild(root, root_child0, 0);

		long root_child0_child0 = YGNodeNew();
		YGNodeStyleSetWidth(root_child0_child0, 100f);
		YGNodeStyleSetHeight(root_child0_child0, 200f);
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
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);

		YGNodeStyleSetDirection(root, YGDirectionRTL);
		YGNodeCalculateLayout(root, YGUndefined, YGUndefined, YGNodeLayoutGetDirection(root));

		assertEquals(0f, YGNodeLayoutGetLeft(root), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root), 0.0f);
		assertEquals(100f, YGNodeLayoutGetHeight(root), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0), 0.0f);

		assertEquals(0f, YGNodeLayoutGetLeft(root_child0_child0), 0.0f);
		assertEquals(0f, YGNodeLayoutGetTop(root_child0_child0), 0.0f);
		assertEquals(100f, YGNodeLayoutGetWidth(root_child0_child0), 0.0f);
		assertEquals(200f, YGNodeLayoutGetHeight(root_child0_child0), 0.0f);
	}

}
