/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/EXT_thread_local_context.txt">EXT_thread_local_context</a> extension.
 * 
 * <p>This extension introduces the concept of a current thread-local context, with each thread able to have its own current context. The current context is
 * what the al- functions work on, effectively allowing multiple threads to independently drive separate OpenAL playback contexts.</p>
 */
public class EXTThreadLocalContext {

    protected EXTThreadLocalContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcSetThreadContext ] ---

    /**
     * Makes a context current with respect to OpenAL operation on the current thread. The context parameter can be {@code NULL} or a valid context pointer. Using
     * {@code NULL} results in no thread-specific context being current in the calling thread, which is useful when shutting OpenAL down.
     *
     * @param context the context to make current
     */
    @NativeType("ALCboolean")
    public static boolean alcSetThreadContext(@NativeType("ALCcontext *") long context) {
		long __functionAddress = ALC.getICD().alcSetThreadContext;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ alcGetThreadContext ] ---

    /** Retrieves a handle to the thread-specific context of the calling thread. This function will return {@code NULL} if no thread-specific context is set. */
    @NativeType("ALCcontext *")
    public static long alcGetThreadContext() {
		long __functionAddress = ALC.getICD().alcGetThreadContext;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

}