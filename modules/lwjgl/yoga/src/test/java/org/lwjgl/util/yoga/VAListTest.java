/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCStdio.*;
import static org.lwjgl.util.yoga.Yoga.*;
import static org.testng.Assert.*;

@Test
public class VAListTest {
    public void test_vsnprintf() {
        // init
        YGLogger logger = YGLogger.create((config, node, level, format, args) -> {
            try (MemoryStack stack = MemoryStack.stackPush()) {
                ByteBuffer buffer = stack.calloc(128);

                int len = nvsnprintf(memAddress(buffer), 128, format, args);

                assertEquals(len, 92);
                assertEquals(memASCII(format), "Measure function returned an invalid dimension to Yoga: [width=%f, height=%f]");
                assertEquals(memASCII(buffer, len), "Measure function returned an invalid dimension to Yoga: [width=-1.000000, height=-10.000000]");
            }
            return 0;
        });

        long config = YGConfigNew();
        YGConfigSetLogger(config, logger);

        YGMeasureFunc measureFunc = YGMeasureFunc.create((it, width, widthMode, height, heightMode, __result) -> __result
            .width(-1.0f)
            .height(-10.0f)
        );

        long node = YGNodeNewWithConfig(config);
        YGNodeSetMeasureFunc(node, measureFunc);

        // test
        YGNodeCalculateLayout(node, YGUndefined, YGUndefined, YGNodeStyleGetDirection(node));

        // cleanup
        YGNodeFree(node);
        measureFunc.free();

        YGConfigFree(config);
        logger.free();
    }
}
