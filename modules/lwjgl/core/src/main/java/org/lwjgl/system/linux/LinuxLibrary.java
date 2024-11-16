/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.linux;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.linux.DynamicLinkLoader.*;

/** Implements a {@link SharedLibrary} on the Linux OS. */
public class LinuxLibrary extends SharedLibrary.Default {

    public LinuxLibrary(String name) {
        this(name, loadLibrary(name));
    }

    public LinuxLibrary(String name, long handle) {
        super(name, handle);
    }

    private static long loadLibrary(String name) {
        long handle;
        try (MemoryStack stack = stackPush()) {
            handle = dlopen(stack.UTF8(name), RTLD_LAZY | RTLD_LOCAL);
        }
        if (handle == NULL) {
            throw new UnsatisfiedLinkError("Failed to dynamically load library: " + name + "(error = " + dlerror() + ")");
        }
        return handle;
    }

    @Override
    public @Nullable String getPath() {
        return SharedLibraryUtil.getLibraryPath(address());
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