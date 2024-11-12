/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.windows;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WindowsUtil.*;

/** Implements a {@link SharedLibrary} on the Windows OS. */
public class WindowsLibrary extends SharedLibrary.Default {

    /** The LWJGL dll handle. */
    public static final long HINSTANCE;

    static {
        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);
            HINSTANCE = GetModuleHandle(pi, stack.UTF16(Library.JNI_LIBRARY_NAME));
            if (HINSTANCE == NULL) {
                windowsThrowException("Failed to retrieve LWJGL module handle.", pi);
            }
        }
    }

    public WindowsLibrary(String name) {
        this(name, loadLibrary(name));
    }

    public WindowsLibrary(String name, long handle) {
        super(name, handle);
    }

    private static long loadLibrary(String name) {
        long handle;
        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);
            handle = LoadLibrary(pi, stack.UTF16(name));
            if (handle == NULL) {
                throw new UnsatisfiedLinkError("Failed to load library: " + name + " (error code = " + pi.get(0) + ")");
            }
        }
        return handle;
    }

    @Override
    public @Nullable String getPath() {
        int maxLen = 256;

        ByteBuffer buffer = memAlloc(maxLen);
        try{
            while (true) {
                int len, err;
                try (MemoryStack stack = stackPush()) {
                    IntBuffer pi = stack.mallocInt(1);
                    len = GetModuleFileName(pi, address(), buffer);
                    err = pi.get(0);
                }
                if (err == 0) {
                    return len == 0 ? null : memUTF16(buffer, len);
                }
                if (err != 0x7A/*ERROR_INSUFFICIENT_BUFFER*/) {
                    return null;
                }
                buffer = memRealloc(buffer, maxLen = maxLen * 3 / 2);
            }
        } finally {
            memFree(buffer);
        }
    }

    @Override
    public long getFunctionAddress(ByteBuffer functionName) {
        return GetProcAddress(null, address(), functionName);
    }

    @Override
    public void free() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);
            if (!FreeLibrary(pi, address())) {
                windowsThrowException("Failed to unload library: " + getName(), pi);
            }
        }
    }

}