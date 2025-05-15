/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.vulkan.khronos;

import org.joml.*;
import org.lwjgl.*;

/** Windowing system abstraction for the hello_triangle samples. */
public interface Window extends AutoCloseable {
    PointerBuffer getRequiredExtensions();
    long create_surface(Demo.Instance instance);
    Vector2i getExtent();
    void mainLoop(Demo app);
    @Override void close();
}
