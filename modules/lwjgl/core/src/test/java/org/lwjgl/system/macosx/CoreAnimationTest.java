/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.CoreAnimation.*;
import static org.testng.Assert.*;

@Test
public class CoreAnimationTest {

    public void testLayerBounds() {
        long layer = CAMetalLayerLayer();
        assertNotEquals(layer, NULL);

        try (MemoryStack stack = stackPush()) {
            CGRect bounds = CGRect.mallocStack(stack);

            bounds.origin()
                .x(10.0)
                .y(20.0);
            bounds.size()
                .width(300.0)
                .height(400.0);
            CALayerSetBounds(layer, bounds);

            bounds.clear();
            assertEquals(bounds.origin().x(), 0.0);
            assertEquals(bounds.origin().y(), 0.0);
            assertEquals(bounds.size().width(), 0.0);
            assertEquals(bounds.size().height(), 0.0);

            CALayerGetBounds(layer, bounds);
            assertEquals(bounds.origin().x(), 10.0);
            assertEquals(bounds.origin().y(), 20.0);
            assertEquals(bounds.size().width(), 300.0);
            assertEquals(bounds.size().height(), 400.0);
        }

        long drawable = CAMetalLayerNextDrawable(layer); // returns nil without proper setup
        assertEquals(drawable, NULL);
    }
}
