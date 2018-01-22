/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.DynamicLinkLoader.*;

/** Implements a {@link SharedLibrary} on the MacOS X using dlopen. */
public class MacOSXLibraryDL extends MacOSXLibrary {

    public MacOSXLibraryDL(String name) {
        super(loadLibrary(name), name);

        if (address() == NULL) {
            throw new UnsatisfiedLinkError("Failed to dynamically load library: " + name + "(error = " + dlerror() + ")");
        }
    }

    private static long loadLibrary(String name) {
        try (MemoryStack stack = stackPush()) {
            return dlopen(stack.ASCII(name), RTLD_LAZY | RTLD_GLOBAL);
        }
    }

    @Override
    public long getFunctionAddress(ByteBuffer functionName) {
        return dlsym(address(), functionName);
    }

    @Override
    public void free() {
        dlclose(address());
    }

}