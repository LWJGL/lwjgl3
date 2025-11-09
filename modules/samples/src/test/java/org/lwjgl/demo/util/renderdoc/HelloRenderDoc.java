/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package org.lwjgl.demo.util.renderdoc;

import org.lwjgl.system.*;
import org.lwjgl.util.renderdoc.*;

import java.nio.*;

import static org.lwjgl.util.renderdoc.RenderDoc.*;

public class HelloRenderDoc {
    private HelloRenderDoc() { }

    public static void main(String[] args) {
        RenderDoc.create();

        try (MemoryStack stack = MemoryStack.stackPush()) {
            IntBuffer major = stack.mallocInt(1);
            IntBuffer minor = stack.mallocInt(1);
            IntBuffer patch = stack.mallocInt(1);

            RENDERDOC_GetAPIVersion(major, minor, patch);

            System.err.printf("API Version: %d.%d.%d%n", major.get(0), minor.get(0), patch.get(0));
        }
    }
}
