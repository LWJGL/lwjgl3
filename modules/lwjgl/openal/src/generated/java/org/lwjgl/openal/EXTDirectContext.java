/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the {@code ALC_EXT_direct_context} extension.
 * 
 * <p>This extension adds functions to use the AL via an explicitly-passed context, rather than the globally set current context that standard AL functions
 * utilize.</p>
 * 
 * <p>The OpenAL API is purposely designed to resemble OpenGL. Among the design decisions was to utilize a "current context" that AL functions implicitly
 * access. While this makes sense when making something similar to OpenGL, it presents some problems. For one, OpenGL benefited from the current context
 * being thread-local, and disallowed the same context being current on multiple threads at once, along with being more strict about not allowing a
 * context to be deleted when it's current. This allowed for efficient lookup as most systems will hold a pointer to thread-local storage in a CPU
 * register, where the current GL context can be retrieved by offsetting the register value, while also being assured a given GL call won't have its
 * context messed with by another thread during execution. The current context of one thread can't be changed or accessed by another thread.</p>
 * 
 * <p>In contrast, OpenAL defined its current context as global state. This means whenever an AL function needs to access and use the current context, there
 * needs to be protection from other threads having adverse effects on the current context (in regard to both changing which context is current, and
 * making state changes that would affect what the initial call was trying to do). This largely negates the benefits an implicit context model provides.</p>
 * 
 * <p>Additionally, having AL functions act on an implied current context inherits other problems that OpenGL has when driving multiple outputs. As a thread
 * can only have one context current at a time, it requires swapping the current context when managing different targets, adding potentially significant
 * overhead. For OpenAL, this issue is even worse since the context is global, requiring multi-threaded synchronization if two or more separate threads
 * are trying to use different contexts, which may not be possible with more modular components that are unaware of each other using OpenAL.</p>
 * 
 * <p>Given these issues, many apps can benefit from contexts being explicitly passed to AL functions. Since OpenAL already needs to work safely in
 * multi-threaded scenarios, there's little benefit to having to set a context as current for future AL calls to implicitly use, compared to simply
 * passing in which context to use when calling AL functions. The purpose of this extension is to provide such functions.</p>
 */
public class EXTDirectContext {

    protected EXTDirectContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcGetProcAddress2 ] ---

    /** Unsafe version of: {@link #alcGetProcAddress2 GetProcAddress2} */
    public static long nalcGetProcAddress2(long device, long funcName) {
		long __functionAddress = ALC.getICD().alcGetProcAddress2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPP(device, funcName, __functionAddress);
    }

    /** {@link AL10#alGetProcAddress GetProcAddress} with a different name, for bootstrapping with router DLLs that wrap the {@code ALCcontext} handle. */
    @NativeType("ALCvoid *")
    public static long alcGetProcAddress2(@NativeType("ALCdevice *") long device, @NativeType("ALchar const *") ByteBuffer funcName) {
        if (CHECKS) {
            checkNT1(funcName);
        }
        return nalcGetProcAddress2(device, memAddress(funcName));
    }

    /** {@link AL10#alGetProcAddress GetProcAddress} with a different name, for bootstrapping with router DLLs that wrap the {@code ALCcontext} handle. */
    @NativeType("ALCvoid *")
    public static long alcGetProcAddress2(@NativeType("ALCdevice *") long device, @NativeType("ALchar const *") CharSequence funcName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(funcName, true);
            long funcNameEncoded = stack.getPointerAddress();
            return nalcGetProcAddress2(device, funcNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}