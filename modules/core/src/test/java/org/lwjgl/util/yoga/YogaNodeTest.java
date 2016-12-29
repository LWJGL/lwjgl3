/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.MemoryStack;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCStdio.*;
import static org.lwjgl.util.yoga.Yoga.*;
import static org.testng.Assert.*;

/* LWJGL port of the corresponding Yoga test. */
public class YogaNodeTest {

	@Test
	public void testInit() {
		int refCount = YGNodeGetInstanceCount();
		long node = YGNodeNew();
		assertEquals(refCount + 1, YGNodeGetInstanceCount());
		YGNodeFree(node);
	}

	@Test
	public void testMeasure() {
		long node = YGNodeNew();
		YGNodeSetMeasureFunc(node, (n, width, widthMode, height, heightMode) -> {
			try ( MemoryStack stack = stackPush() ) {
				return YGMeasureFunc.toLong(
					YGSize.mallocStack(stack)
						.width(100)
						.height(100)
				);
			}
		});
		YGNodeCalculateLayout(node, YGUndefined, YGUndefined, YGNodeStyleGetDirection(node));
		assertEquals(100, (int)YGNodeLayoutGetWidth(node));
		assertEquals(100, (int)YGNodeLayoutGetHeight(node));

		YGNodeGetMeasureFunc(node).free();
		YGNodeFree(node);
	}

	private int    mLogLevel;
	private String mLogMessage;

	private YGLogger getTestLogger() {
		return YGLogger.create((level, format, args) -> {
			try ( MemoryStack stack = stackPush() ) {
				ByteBuffer buffer = stack.malloc(256);
				int result = nvsnprintf(memAddress(buffer), buffer.remaining(), format, args);

				mLogLevel = level;
				mLogMessage = memUTF8(buffer, Math.min(result, buffer.remaining()), 0);

				return result;
			}
		});
	}

	@Test
	public void testLogger() {
		try ( YGLogger logger = getTestLogger() ) {
			YGSetLogger(logger);

			YGLog(YGLogLevelDebug, "Hello");

			assertEquals(YGLogLevelDebug, mLogLevel);
			assertEquals("Hello", mLogMessage);
		}
	}

	@Test
	public void testUpdateLogger() {
		try (
			YGLogger logger0 = YGLogger.create((level, format, args) -> 0);
			YGLogger logger = getTestLogger()
		) {

			YGSetLogger(logger0);
			YGSetLogger(logger);

			YGLog(YGLogLevelVerbose, "Flexbox");

			assertEquals(YGLogLevelVerbose, mLogLevel);
			assertEquals("Flexbox", mLogMessage);
		}
	}

	@Test
	public void testCopyStyle() {
		long node0 = YGNodeNew();
		assertTrue(YGValueIsUndefined(YGNodeStyleGetMaxHeight(node0)));

		long node1 = YGNodeNew();
		YGNodeStyleSetMaxHeight(node1, 100);

		YGNodeCopyStyle(node0, node1);
		assertEquals(100, (int)YGNodeStyleGetMaxHeight(node0));

		YGNodeFree(node1);
		YGNodeFree(node0);
	}

}