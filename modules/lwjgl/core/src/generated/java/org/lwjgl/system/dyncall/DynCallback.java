/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.dyncall;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to \"dyncall_callback.h\".
 * 
 * <p>The dyncallback dyncall library has an interface to create callback  objects, that can be passed to functions as callback arguments. In other words, a
 * pointer to the callback object can be "called", directly. The callback handler then allows iterating dynamically over the arguments once called back.</p>
 */
public class DynCallback {

    /** Callback signatures. */
    public static final char
        DCB_SIGCHAR_CC_PREFIX       = '_',
        DCB_SIGCHAR_CC_ELLIPSIS     = 'e',
        DCB_SIGCHAR_CC_STDCALL      = 's',
        DCB_SIGCHAR_CC_FASTCALL_GNU = 'f',
        DCB_SIGCHAR_CC_FASTCALL_MS  = 'F',
        DCB_SIGCHAR_CC_THISCALL_MS  = '+';

    static { Library.initialize(); }

    protected DynCallback() {
        throw new UnsupportedOperationException();
    }

    // --- [ dcbNewCallback ] ---

    /** Unsafe version of: {@link #dcbNewCallback NewCallback} */
    public static native long ndcbNewCallback(long signature, long funcptr, long userdata);

    /**
     * Creates and initializes a new {@code Callback} object.
     * 
     * <p>Use {@link #dcbFreeCallback FreeCallback} to destroy the {@code Callback} object.</p>
     *
     * @param signature the function signature of the function to mimic
     * @param funcptr   a pointer to a callback handler
     * @param userdata  a pointer to custom data that might be useful in the handler
     */
    @NativeType("DCCallback *")
    public static long dcbNewCallback(@NativeType("char const *") ByteBuffer signature, @NativeType("DCCallbackHandler *") long funcptr, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(signature);
            check(funcptr);
            check(userdata);
        }
        return ndcbNewCallback(memAddress(signature), funcptr, userdata);
    }

    /**
     * Creates and initializes a new {@code Callback} object.
     * 
     * <p>Use {@link #dcbFreeCallback FreeCallback} to destroy the {@code Callback} object.</p>
     *
     * @param signature the function signature of the function to mimic
     * @param funcptr   a pointer to a callback handler
     * @param userdata  a pointer to custom data that might be useful in the handler
     */
    @NativeType("DCCallback *")
    public static long dcbNewCallback(@NativeType("char const *") CharSequence signature, @NativeType("DCCallbackHandler *") long funcptr, @NativeType("void *") long userdata) {
        if (CHECKS) {
            check(funcptr);
            check(userdata);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(signature, true);
            long signatureEncoded = stack.getPointerAddress();
            return ndcbNewCallback(signatureEncoded, funcptr, userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ dcbInitCallback ] ---

    /** Unsafe version of: {@link #dcbInitCallback InitCallback} */
    public static native void ndcbInitCallback(long pcb, long signature, long handler, long userdata);

    /**
     * (Re)initializes a callback object.
     *
     * @param pcb       the callback object
     * @param signature the function signature of the function to mimic
     * @param handler   a pointer to a callback handler
     * @param userdata  a pointer to custom data that might be useful in the handler
     */
    public static void dcbInitCallback(@NativeType("DCCallback *") long pcb, @NativeType("char const *") ByteBuffer signature, @NativeType("DCCallbackHandler *") long handler, @NativeType("void *") long userdata) {
        if (CHECKS) {
            check(pcb);
            checkNT1(signature);
            check(handler);
            check(userdata);
        }
        ndcbInitCallback(pcb, memAddress(signature), handler, userdata);
    }

    /**
     * (Re)initializes a callback object.
     *
     * @param pcb       the callback object
     * @param signature the function signature of the function to mimic
     * @param handler   a pointer to a callback handler
     * @param userdata  a pointer to custom data that might be useful in the handler
     */
    public static void dcbInitCallback(@NativeType("DCCallback *") long pcb, @NativeType("char const *") CharSequence signature, @NativeType("DCCallbackHandler *") long handler, @NativeType("void *") long userdata) {
        if (CHECKS) {
            check(pcb);
            check(handler);
            check(userdata);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(signature, true);
            long signatureEncoded = stack.getPointerAddress();
            ndcbInitCallback(pcb, signatureEncoded, handler, userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ dcbFreeCallback ] ---

    /** Unsafe version of: {@link #dcbFreeCallback FreeCallback} */
    public static native void ndcbFreeCallback(long pcb);

    /**
     * Destroys and frees the callback object.
     *
     * @param pcb the callback object
     */
    public static void dcbFreeCallback(@NativeType("DCCallback *") long pcb) {
        if (CHECKS) {
            check(pcb);
        }
        ndcbFreeCallback(pcb);
    }

    // --- [ dcbGetUserData ] ---

    /** Unsafe version of: {@link #dcbGetUserData GetUserData} */
    public static native long ndcbGetUserData(long pcb);

    /**
     * Returns a pointer to the {@code userdata} passed to the callback object on creation or initialization.
     *
     * @param pcb the callback object
     */
    @NativeType("void *")
    public static long dcbGetUserData(@NativeType("DCCallback *") long pcb) {
        if (CHECKS) {
            check(pcb);
        }
        return ndcbGetUserData(pcb);
    }

    // --- [ dcbArgBool ] ---

    /** Unsafe version of: {@link #dcbArgBool ArgBool} */
    public static native int ndcbArgBool(long args);

    /**
     * Returns the next {@code bool} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCbool")
    public static boolean dcbArgBool(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgBool(args) != 0;
    }

    // --- [ dcbArgChar ] ---

    /** Unsafe version of: {@link #dcbArgChar ArgChar} */
    public static native byte ndcbArgChar(long args);

    /**
     * Returns the next {@code char} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCchar")
    public static byte dcbArgChar(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgChar(args);
    }

    // --- [ dcbArgShort ] ---

    /** Unsafe version of: {@link #dcbArgShort ArgShort} */
    public static native short ndcbArgShort(long args);

    /**
     * Returns the next {@code short} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCshort")
    public static short dcbArgShort(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgShort(args);
    }

    // --- [ dcbArgInt ] ---

    /** Unsafe version of: {@link #dcbArgInt ArgInt} */
    public static native int ndcbArgInt(long args);

    /**
     * Returns the next {@code int} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCint")
    public static int dcbArgInt(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgInt(args);
    }

    // --- [ dcbArgLong ] ---

    /** Unsafe version of: {@link #dcbArgLong ArgLong} */
    public static native long ndcbArgLong(long args);

    /**
     * Returns the next {@code long} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DClong")
    public static long dcbArgLong(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgLong(args);
    }

    // --- [ dcbArgLongLong ] ---

    /** Unsafe version of: {@link #dcbArgLongLong ArgLongLong} */
    public static native long ndcbArgLongLong(long args);

    /**
     * Returns the next {@code long long} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DClonglong")
    public static long dcbArgLongLong(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgLongLong(args);
    }

    // --- [ dcbArgUChar ] ---

    /** Unsafe version of: {@link #dcbArgUChar ArgUChar} */
    public static native byte ndcbArgUChar(long args);

    /**
     * Returns the next {@code unsigned char} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCchar")
    public static byte dcbArgUChar(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgUChar(args);
    }

    // --- [ dcbArgUShort ] ---

    /** Unsafe version of: {@link #dcbArgUShort ArgUShort} */
    public static native short ndcbArgUShort(long args);

    /**
     * Returns the next {@code unsigned short} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCshort")
    public static short dcbArgUShort(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgUShort(args);
    }

    // --- [ dcbArgUInt ] ---

    /** Unsafe version of: {@link #dcbArgUInt ArgUInt} */
    public static native int ndcbArgUInt(long args);

    /**
     * Returns the next {@code unsigned int} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCint")
    public static int dcbArgUInt(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgUInt(args);
    }

    // --- [ dcbArgULong ] ---

    /** Unsafe version of: {@link #dcbArgULong ArgULong} */
    public static native long ndcbArgULong(long args);

    /**
     * Returns the next {@code unsigned long} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DClong")
    public static long dcbArgULong(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgULong(args);
    }

    // --- [ dcbArgULongLong ] ---

    /** Unsafe version of: {@link #dcbArgULongLong ArgULongLong} */
    public static native long ndcbArgULongLong(long args);

    /**
     * Returns the next {@code unsigned long long} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DClonglong")
    public static long dcbArgULongLong(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgULongLong(args);
    }

    // --- [ dcbArgFloat ] ---

    /** Unsafe version of: {@link #dcbArgFloat ArgFloat} */
    public static native float ndcbArgFloat(long args);

    /**
     * Returns the next {@code float} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCfloat")
    public static float dcbArgFloat(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgFloat(args);
    }

    // --- [ dcbArgDouble ] ---

    /** Unsafe version of: {@link #dcbArgDouble ArgDouble} */
    public static native double ndcbArgDouble(long args);

    /**
     * Returns the next {@code double} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCdouble")
    public static double dcbArgDouble(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgDouble(args);
    }

    // --- [ dcbArgPointer ] ---

    /** Unsafe version of: {@link #dcbArgPointer ArgPointer} */
    public static native long ndcbArgPointer(long args);

    /**
     * Returns the next {@code pointer} argument.
     *
     * @param args the function arguments
     */
    @NativeType("DCpointer")
    public static long dcbArgPointer(@NativeType("DCArgs *") long args) {
        if (CHECKS) {
            check(args);
        }
        return ndcbArgPointer(args);
    }

}