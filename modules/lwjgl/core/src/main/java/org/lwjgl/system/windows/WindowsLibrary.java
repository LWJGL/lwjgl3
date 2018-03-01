/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.windows;

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
            HINSTANCE = GetModuleHandle(stack.UTF16(Library.JNI_LIBRARY_NAME));
            if (HINSTANCE == NULL) {
                throw new RuntimeException("Failed to retrieve LWJGL module handle.");
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
            handle = LoadLibrary(stack.UTF16(name));
        }
        if (handle == NULL) {
            throw new UnsatisfiedLinkError("Failed to load library: " + name + " (error code = " + getLastError() + ")");
        }
        return handle;
    }

    @Override
    public long getFunctionAddress(ByteBuffer functionName) {
        return GetProcAddress(address(), functionName);
    }

    @Override
    public void free() {
        if (!FreeLibrary(address())) {
            windowsThrowException("Failed to unload library: " + getName());
        }
    }

}