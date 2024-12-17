/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTThreadLocalContext {

    protected EXTThreadLocalContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcSetThreadContext ] ---

    /** {@code ALCboolean alcSetThreadContext(ALCcontext * context)} */
    @NativeType("ALCboolean")
    public static boolean alcSetThreadContext(@NativeType("ALCcontext *") long context) {
		long __functionAddress = ALC.getICD().alcSetThreadContext;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ alcGetThreadContext ] ---

    /** {@code ALCcontext * alcGetThreadContext(void)} */
    @NativeType("ALCcontext *")
    public static long alcGetThreadContext() {
		long __functionAddress = ALC.getICD().alcGetThreadContext;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

}