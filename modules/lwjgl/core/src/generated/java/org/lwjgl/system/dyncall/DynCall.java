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
 * Native bindings to \"dyncall.h\".
 * 
 * <p>The dyncall library encapsulates architecture-, OS- and compiler-specific function call semantics in a virtual "bind argument parameters from left to
 * right and then call" interface allowing programmers to call C functions in a completely dynamic manner.</p>
 * 
 * <p>In other words, instead of calling a function directly, the dyncall library provides a mechanism to push the function parameters manually and to issue
 * the call afterwards.</p>
 * 
 * <p>Since the idea behind this concept is similar to call dispatching mechanisms of virtual machines, the object that can be dynamically loaded with
 * arguments, and then used to actually invoke the call, is called {@code CallVM}. It is possible to change the calling convention used by the
 * {@code CallVM} at run-time. Due to the fact that nearly every platform comes with one or more distinct calling conventions, the dyncall library project
 * intends to be a portable and open-source approach to the variety of compiler-specific binary interfaces, platform specific subtleties, and so on...</p>
 */
public class DynCall {

    /** Supported calling convention modes. */
    public static final int
        DC_CALL_C_DEFAULT            = 0,
        DC_CALL_C_ELLIPSIS           = 100,
        DC_CALL_C_ELLIPSIS_VARARGS   = 101,
        DC_CALL_C_X86_CDECL          = 1,
        DC_CALL_C_X86_WIN32_STD      = 2,
        DC_CALL_C_X86_WIN32_FAST_MS  = 3,
        DC_CALL_C_X86_WIN32_FAST_GNU = 4,
        DC_CALL_C_X86_WIN32_THIS_MS  = 5,
        DC_CALL_C_X86_WIN32_THIS_GNU = 6,
        DC_CALL_C_X64_WIN64          = 7,
        DC_CALL_C_X64_SYSV           = 8,
        DC_CALL_C_PPC32_DARWIN       = 9,
        DC_CALL_C_PPC32_OSX          = DC_CALL_C_PPC32_DARWIN,
        DC_CALL_C_ARM_ARM_EABI       = 10,
        DC_CALL_C_ARM_THUMB_EABI     = 11,
        DC_CALL_C_ARM_ARMHF          = 30,
        DC_CALL_C_MIPS32_EABI        = 12,
        DC_CALL_C_PPC32_SYSV         = 13,
        DC_CALL_C_PPC32_LINUX        = DC_CALL_C_PPC32_SYSV,
        DC_CALL_C_ARM_ARM            = 14,
        DC_CALL_C_ARM_THUMB          = 15,
        DC_CALL_C_MIPS32_O32         = 16,
        DC_CALL_C_MIPS64_N32         = 17,
        DC_CALL_C_MIPS64_N64         = 18,
        DC_CALL_C_X86_PLAN9          = 19,
        DC_CALL_C_SPARC32            = 20,
        DC_CALL_C_SPARC64            = 21,
        DC_CALL_C_ARM64              = 22,
        DC_CALL_C_PPC64              = 23,
        DC_CALL_C_PPC64_LINUX        = DC_CALL_C_PPC64,
        DC_CALL_SYS_DEFAULT          = 200,
        DC_CALL_SYS_X86_INT80H_LINUX = 201,
        DC_CALL_SYS_X86_INT80H_BSD   = 202,
        DC_CALL_SYS_PPC32            = 210,
        DC_CALL_SYS_PPC64            = 211;

    /** Error codes. */
    public static final int
        DC_ERROR_NONE             = 0,
        DC_ERROR_UNSUPPORTED_MODE = -1;

    /** Boolean values. */
    public static final int
        DC_TRUE  = 1,
        DC_FALSE = 0;

    /** Signatures. */
    public static final char
        DC_SIGCHAR_VOID      = 'v',
        DC_SIGCHAR_BOOL      = 'B',
        DC_SIGCHAR_CHAR      = 'c',
        DC_SIGCHAR_UCHAR     = 'C',
        DC_SIGCHAR_SHORT     = 's',
        DC_SIGCHAR_USHORT    = 'S',
        DC_SIGCHAR_INT       = 'i',
        DC_SIGCHAR_UINT      = 'I',
        DC_SIGCHAR_LONG      = 'j',
        DC_SIGCHAR_ULONG     = 'J',
        DC_SIGCHAR_LONGLONG  = 'l',
        DC_SIGCHAR_ULONGLONG = 'L',
        DC_SIGCHAR_FLOAT     = 'f',
        DC_SIGCHAR_DOUBLE    = 'd',
        DC_SIGCHAR_POINTER   = 'p',
        DC_SIGCHAR_STRING    = 'Z',
        DC_SIGCHAR_STRUCT    = 'T',
        DC_SIGCHAR_ENDARG    = ')';

    static { Library.initialize(); }

    protected DynCall() {
        throw new UnsupportedOperationException();
    }

    // --- [ dcNewCallVM ] ---

    /**
     * Creates a new {@code CallVM} object.
     * 
     * <p>Use {@link #dcFree Free} to destroy the {@code CallVM} object.</p>
     *
     * @param size the max size of the internal stack that will be allocated and used to bind arguments to
     */
    @NativeType("DCCallVM *")
    public static native long dcNewCallVM(@NativeType("DCsize") long size);

    // --- [ dcFree ] ---

    /** Unsafe version of: {@link #dcFree Free} */
    public static native void ndcFree(long vm);

    /**
     * Frees a {@code CallVM} object.
     *
     * @param vm a {@code CallVM} instance
     */
    public static void dcFree(@NativeType("DCCallVM *") long vm) {
        if (CHECKS) {
            check(vm);
        }
        ndcFree(vm);
    }

    // --- [ dcReset ] ---

    /** Unsafe version of: {@link #dcReset Reset} */
    public static native void ndcReset(long vm);

    /**
     * Resets the internal stack of arguments and prepares it for a new call. This function should be called after setting the call mode (using {@link #dcMode Mode}), but
     * prior to binding arguments to the {@code CallVM}. Use it also when reusing a {@code CallVM}, as arguments don’t get flushed automatically after a
     * function call invocation.
     * 
     * <p>Note: you should also call this function after initial creation of the a {@code CallVM} object, as {@link #dcNewCallVM NewCallVM} doesn’t do this, implicitly.</p>
     *
     * @param vm a {@code CallVM} instance
     */
    public static void dcReset(@NativeType("DCCallVM *") long vm) {
        if (CHECKS) {
            check(vm);
        }
        ndcReset(vm);
    }

    // --- [ dcMode ] ---

    /** Unsafe version of: {@link #dcMode Mode} */
    public static native void ndcMode(long vm, int mode);

    /**
     * Sets the calling convention to use.
     * 
     * <p>{@link #DC_CALL_C_DEFAULT CALL_C_DEFAULT} is the default standard C call on the target platform. It uses the standard C calling convention. {@link #DC_CALL_C_ELLIPSIS CALL_C_ELLIPSIS} is used for C
     * ellipsis calls which allow to build up a variable argument list. On many platforms, there is only one C calling convention. The X86 platform provides a
     * rich family of different calling conventions.</p>
     *
     * @param vm   a {@code CallVM} instance
     * @param mode the calling convention. One of:<br><table><tr><td>{@link #DC_CALL_C_DEFAULT CALL_C_DEFAULT}</td><td>{@link #DC_CALL_C_ELLIPSIS CALL_C_ELLIPSIS}</td><td>{@link #DC_CALL_C_ELLIPSIS_VARARGS CALL_C_ELLIPSIS_VARARGS}</td><td>{@link #DC_CALL_C_X86_CDECL CALL_C_X86_CDECL}</td></tr><tr><td>{@link #DC_CALL_C_X86_WIN32_STD CALL_C_X86_WIN32_STD}</td><td>{@link #DC_CALL_C_X86_WIN32_FAST_MS CALL_C_X86_WIN32_FAST_MS}</td><td>{@link #DC_CALL_C_X86_WIN32_FAST_GNU CALL_C_X86_WIN32_FAST_GNU}</td><td>{@link #DC_CALL_C_X86_WIN32_THIS_MS CALL_C_X86_WIN32_THIS_MS}</td></tr><tr><td>{@link #DC_CALL_C_X86_WIN32_THIS_GNU CALL_C_X86_WIN32_THIS_GNU}</td><td>{@link #DC_CALL_C_X64_WIN64 CALL_C_X64_WIN64}</td><td>{@link #DC_CALL_C_X64_SYSV CALL_C_X64_SYSV}</td><td>{@link #DC_CALL_C_PPC32_DARWIN CALL_C_PPC32_DARWIN}</td></tr><tr><td>{@link #DC_CALL_C_PPC32_OSX CALL_C_PPC32_OSX}</td><td>{@link #DC_CALL_C_ARM_ARM_EABI CALL_C_ARM_ARM_EABI}</td><td>{@link #DC_CALL_C_ARM_THUMB_EABI CALL_C_ARM_THUMB_EABI}</td><td>{@link #DC_CALL_C_ARM_ARMHF CALL_C_ARM_ARMHF}</td></tr><tr><td>{@link #DC_CALL_C_MIPS32_EABI CALL_C_MIPS32_EABI}</td><td>{@link #DC_CALL_C_PPC32_SYSV CALL_C_PPC32_SYSV}</td><td>{@link #DC_CALL_C_PPC32_LINUX CALL_C_PPC32_LINUX}</td><td>{@link #DC_CALL_C_ARM_ARM CALL_C_ARM_ARM}</td></tr><tr><td>{@link #DC_CALL_C_ARM_THUMB CALL_C_ARM_THUMB}</td><td>{@link #DC_CALL_C_MIPS32_O32 CALL_C_MIPS32_O32}</td><td>{@link #DC_CALL_C_MIPS64_N32 CALL_C_MIPS64_N32}</td><td>{@link #DC_CALL_C_MIPS64_N64 CALL_C_MIPS64_N64}</td></tr><tr><td>{@link #DC_CALL_C_X86_PLAN9 CALL_C_X86_PLAN9}</td><td>{@link #DC_CALL_C_SPARC32 CALL_C_SPARC32}</td><td>{@link #DC_CALL_C_SPARC64 CALL_C_SPARC64}</td><td>{@link #DC_CALL_C_ARM64 CALL_C_ARM64}</td></tr><tr><td>{@link #DC_CALL_C_PPC64 CALL_C_PPC64}</td><td>{@link #DC_CALL_C_PPC64_LINUX CALL_C_PPC64_LINUX}</td><td>{@link #DC_CALL_SYS_DEFAULT CALL_SYS_DEFAULT}</td><td>{@link #DC_CALL_SYS_X86_INT80H_LINUX CALL_SYS_X86_INT80H_LINUX}</td></tr><tr><td>{@link #DC_CALL_SYS_X86_INT80H_BSD CALL_SYS_X86_INT80H_BSD}</td><td>{@link #DC_CALL_SYS_PPC32 CALL_SYS_PPC32}</td><td>{@link #DC_CALL_SYS_PPC64 CALL_SYS_PPC64}</td></tr></table>
     */
    public static void dcMode(@NativeType("DCCallVM *") long vm, @NativeType("DCint") int mode) {
        if (CHECKS) {
            check(vm);
        }
        ndcMode(vm, mode);
    }

    // --- [ dcArgBool ] ---

    /** Unsafe version of: {@link #dcArgBool ArgBool} */
    public static native void ndcArgBool(long vm, int value);

    /**
     * Binds a {@code bool} argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgBool(@NativeType("DCCallVM *") long vm, @NativeType("DCbool") boolean value) {
        if (CHECKS) {
            check(vm);
        }
        ndcArgBool(vm, value ? 1 : 0);
    }

    // --- [ dcArgChar ] ---

    /** Unsafe version of: {@link #dcArgChar ArgChar} */
    public static native void ndcArgChar(long vm, byte value);

    /**
     * Binds a {@code char} argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgChar(@NativeType("DCCallVM *") long vm, @NativeType("DCchar") byte value) {
        if (CHECKS) {
            check(vm);
        }
        ndcArgChar(vm, value);
    }

    // --- [ dcArgShort ] ---

    /** Unsafe version of: {@link #dcArgShort ArgShort} */
    public static native void ndcArgShort(long vm, short value);

    /**
     * Binds a {@code short} argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgShort(@NativeType("DCCallVM *") long vm, @NativeType("DCshort") short value) {
        if (CHECKS) {
            check(vm);
        }
        ndcArgShort(vm, value);
    }

    // --- [ dcArgInt ] ---

    /** Unsafe version of: {@link #dcArgInt ArgInt} */
    public static native void ndcArgInt(long vm, int value);

    /**
     * Binds an {@code int} argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgInt(@NativeType("DCCallVM *") long vm, @NativeType("DCint") int value) {
        if (CHECKS) {
            check(vm);
        }
        ndcArgInt(vm, value);
    }

    // --- [ dcArgLong ] ---

    /** Unsafe version of: {@link #dcArgLong ArgLong} */
    public static native void ndcArgLong(long vm, long value);

    /**
     * Binds a {@code long} argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgLong(@NativeType("DCCallVM *") long vm, @NativeType("DClong") long value) {
        if (CHECKS) {
            check(vm);
        }
        ndcArgLong(vm, value);
    }

    // --- [ dcArgLongLong ] ---

    /** Unsafe version of: {@link #dcArgLongLong ArgLongLong} */
    public static native void ndcArgLongLong(long vm, long value);

    /**
     * Binds a {@code long long} argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgLongLong(@NativeType("DCCallVM *") long vm, @NativeType("DClonglong") long value) {
        if (CHECKS) {
            check(vm);
        }
        ndcArgLongLong(vm, value);
    }

    // --- [ dcArgFloat ] ---

    /** Unsafe version of: {@link #dcArgFloat ArgFloat} */
    public static native void ndcArgFloat(long vm, float value);

    /**
     * Binds a {@code float} argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgFloat(@NativeType("DCCallVM *") long vm, @NativeType("DCfloat") float value) {
        if (CHECKS) {
            check(vm);
        }
        ndcArgFloat(vm, value);
    }

    // --- [ dcArgDouble ] ---

    /** Unsafe version of: {@link #dcArgDouble ArgDouble} */
    public static native void ndcArgDouble(long vm, double value);

    /**
     * Binds a {@code double} argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgDouble(@NativeType("DCCallVM *") long vm, @NativeType("DCdouble") double value) {
        if (CHECKS) {
            check(vm);
        }
        ndcArgDouble(vm, value);
    }

    // --- [ dcArgPointer ] ---

    /** Unsafe version of: {@link #dcArgPointer ArgPointer} */
    public static native void ndcArgPointer(long vm, long value);

    /**
     * Binds a pointer argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgPointer(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long value) {
        if (CHECKS) {
            check(vm);
        }
        ndcArgPointer(vm, value);
    }

    // --- [ dcArgStruct ] ---

    /** Unsafe version of: {@link #dcArgStruct ArgStruct} */
    public static native void ndcArgStruct(long vm, long s, long value);

    /**
     * Binds a struct argument.
     *
     * @param vm    a {@code CallVM} instance
     * @param value the argument value
     */
    public static void dcArgStruct(@NativeType("DCCallVM *") long vm, @NativeType("DCstruct *") long s, @NativeType("DCpointer") long value) {
        if (CHECKS) {
            check(vm);
            check(s);
            check(value);
        }
        ndcArgStruct(vm, s, value);
    }

    // --- [ dcCallVoid ] ---

    /** Unsafe version of: {@link #dcCallVoid CallVoid} */
    public static native void ndcCallVoid(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DCvoid")
    public static void dcCallVoid(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        ndcCallVoid(vm, funcptr);
    }

    // --- [ dcCallBool ] ---

    /** Unsafe version of: {@link #dcCallBool CallBool} */
    public static native int ndcCallBool(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DCbool")
    public static boolean dcCallBool(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        return ndcCallBool(vm, funcptr) != 0;
    }

    // --- [ dcCallChar ] ---

    /** Unsafe version of: {@link #dcCallChar CallChar} */
    public static native byte ndcCallChar(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DCchar")
    public static byte dcCallChar(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        return ndcCallChar(vm, funcptr);
    }

    // --- [ dcCallShort ] ---

    /** Unsafe version of: {@link #dcCallShort CallShort} */
    public static native short ndcCallShort(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DCshort")
    public static short dcCallShort(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        return ndcCallShort(vm, funcptr);
    }

    // --- [ dcCallInt ] ---

    /** Unsafe version of: {@link #dcCallInt CallInt} */
    public static native int ndcCallInt(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DCint")
    public static int dcCallInt(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        return ndcCallInt(vm, funcptr);
    }

    // --- [ dcCallLong ] ---

    /** Unsafe version of: {@link #dcCallLong CallLong} */
    public static native long ndcCallLong(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DClong")
    public static long dcCallLong(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        return ndcCallLong(vm, funcptr);
    }

    // --- [ dcCallLongLong ] ---

    /** Unsafe version of: {@link #dcCallLongLong CallLongLong} */
    public static native long ndcCallLongLong(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DClonglong")
    public static long dcCallLongLong(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        return ndcCallLongLong(vm, funcptr);
    }

    // --- [ dcCallFloat ] ---

    /** Unsafe version of: {@link #dcCallFloat CallFloat} */
    public static native float ndcCallFloat(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DCfloat")
    public static float dcCallFloat(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        return ndcCallFloat(vm, funcptr);
    }

    // --- [ dcCallDouble ] ---

    /** Unsafe version of: {@link #dcCallDouble CallDouble} */
    public static native double ndcCallDouble(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DCdouble")
    public static double dcCallDouble(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        return ndcCallDouble(vm, funcptr);
    }

    // --- [ dcCallPointer ] ---

    /** Unsafe version of: {@link #dcCallPointer CallPointer} */
    public static native long ndcCallPointer(long vm, long funcptr);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    @NativeType("DCpointer")
    public static long dcCallPointer(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
        }
        return ndcCallPointer(vm, funcptr);
    }

    // --- [ dcCallStruct ] ---

    /** Unsafe version of: {@link #dcCallStruct CallStruct} */
    public static native void ndcCallStruct(long vm, long funcptr, long s, long returnValue);

    /**
     * Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.
     * 
     * <p>After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
     * need to clear the argument bindings, you have to reset the {@code CallVM}.</p>
     *
     * @param vm      a {@code CallVM} instance
     * @param funcptr the function pointer
     */
    public static void dcCallStruct(@NativeType("DCCallVM *") long vm, @NativeType("DCpointer") long funcptr, @NativeType("DCstruct *") long s, @NativeType("DCpointer") long returnValue) {
        if (CHECKS) {
            check(vm);
            check(funcptr);
            check(s);
            check(returnValue);
        }
        ndcCallStruct(vm, funcptr, s, returnValue);
    }

    // --- [ dcGetError ] ---

    /** Unsafe version of: {@link #dcGetError GetError} */
    public static native int ndcGetError(long vm);

    /**
     * Returns the most recent error state code.
     *
     * @param vm a {@code CallVM} instance
     */
    @NativeType("DCint")
    public static int dcGetError(@NativeType("DCCallVM *") long vm) {
        if (CHECKS) {
            check(vm);
        }
        return ndcGetError(vm);
    }

    // --- [ dcNewStruct ] ---

    /**
     * Creates a new struct type.
     *
     * @param fieldCount the number of fields
     * @param alignment  a custom struct alignment, or 0 to calculate automatically
     */
    @NativeType("DCstruct *")
    public static native long dcNewStruct(@NativeType("DCsize") long fieldCount, @NativeType("DCint") int alignment);

    // --- [ dcStructField ] ---

    /** Unsafe version of: {@link #dcStructField StructField} */
    public static native void ndcStructField(long s, int type, int alignment, long arrayLength);

    /**
     * Adds a field to the specified struct.
     *
     * @param s           the struct
     * @param type        the field type. One of:<br><table><tr><td>{@link #DC_SIGCHAR_VOID SIGCHAR_VOID}</td><td>{@link #DC_SIGCHAR_BOOL SIGCHAR_BOOL}</td><td>{@link #DC_SIGCHAR_CHAR SIGCHAR_CHAR}</td><td>{@link #DC_SIGCHAR_UCHAR SIGCHAR_UCHAR}</td><td>{@link #DC_SIGCHAR_SHORT SIGCHAR_SHORT}</td><td>{@link #DC_SIGCHAR_USHORT SIGCHAR_USHORT}</td></tr><tr><td>{@link #DC_SIGCHAR_INT SIGCHAR_INT}</td><td>{@link #DC_SIGCHAR_UINT SIGCHAR_UINT}</td><td>{@link #DC_SIGCHAR_LONG SIGCHAR_LONG}</td><td>{@link #DC_SIGCHAR_ULONG SIGCHAR_ULONG}</td><td>{@link #DC_SIGCHAR_LONGLONG SIGCHAR_LONGLONG}</td><td>{@link #DC_SIGCHAR_ULONGLONG SIGCHAR_ULONGLONG}</td></tr><tr><td>{@link #DC_SIGCHAR_FLOAT SIGCHAR_FLOAT}</td><td>{@link #DC_SIGCHAR_DOUBLE SIGCHAR_DOUBLE}</td><td>{@link #DC_SIGCHAR_POINTER SIGCHAR_POINTER}</td><td>{@link #DC_SIGCHAR_STRING SIGCHAR_STRING}</td><td>{@link #DC_SIGCHAR_STRUCT SIGCHAR_STRUCT}</td><td>{@link #DC_SIGCHAR_ENDARG SIGCHAR_ENDARG}</td></tr></table>
     * @param alignment   a custom field alignment, or 0 to calculate automatically
     * @param arrayLength 1 or a higher value if the field is an array
     */
    public static void dcStructField(@NativeType("DCstruct *") long s, @NativeType("DCint") int type, @NativeType("DCint") int alignment, @NativeType("DCsize") long arrayLength) {
        if (CHECKS) {
            check(s);
        }
        ndcStructField(s, type, alignment, arrayLength);
    }

    // --- [ dcSubStruct ] ---

    /** Unsafe version of: {@link #dcSubStruct SubStruct} */
    public static native void ndcSubStruct(long s, long fieldCount, int alignment, long arrayLength);

    /**
     * Adds a nested struct to the specified struct
     *
     * @param s           the struct
     * @param fieldCount  the number of fields in the nested struct
     * @param alignment   a custom nested struct alignment, or 0 to calculate automatically
     * @param arrayLength 1 or a higher value if the nested struct is an array
     */
    public static void dcSubStruct(@NativeType("DCstruct *") long s, @NativeType("DCsize") long fieldCount, @NativeType("DCint") int alignment, @NativeType("DCsize") long arrayLength) {
        if (CHECKS) {
            check(s);
        }
        ndcSubStruct(s, fieldCount, alignment, arrayLength);
    }

    // --- [ dcCloseStruct ] ---

    /** Unsafe version of: {@link #dcCloseStruct CloseStruct} */
    public static native void ndcCloseStruct(long s);

    /**
     * Completes the struct definition.
     *
     * @param s the struct to close
     */
    public static void dcCloseStruct(@NativeType("DCstruct *") long s) {
        if (CHECKS) {
            check(s);
        }
        ndcCloseStruct(s);
    }

    // --- [ dcStructSize ] ---

    /** Unsafe version of: {@link #dcStructSize StructSize} */
    public static native long ndcStructSize(long s);

    /**
     * Returns the size, in bytes, of the specified struct.
     *
     * @param s the struct
     */
    @NativeType("DCsize")
    public static long dcStructSize(@NativeType("DCstruct *") long s) {
        if (CHECKS) {
            check(s);
        }
        return ndcStructSize(s);
    }

    // --- [ dcStructAlignment ] ---

    /** Unsafe version of: {@link #dcStructAlignment StructAlignment} */
    public static native long ndcStructAlignment(long s);

    /**
     * Returns the alignment, in bytes, of the specified struct.
     *
     * @param s the struct
     */
    @NativeType("DCsize")
    public static long dcStructAlignment(@NativeType("DCstruct *") long s) {
        if (CHECKS) {
            check(s);
        }
        return ndcStructAlignment(s);
    }

    // --- [ dcFreeStruct ] ---

    /** Unsafe version of: {@link #dcFreeStruct FreeStruct} */
    public static native void ndcFreeStruct(long s);

    /**
     * Frees the specified struct object.
     *
     * @param s the struct to free
     */
    public static void dcFreeStruct(@NativeType("DCstruct *") long s) {
        if (CHECKS) {
            check(s);
        }
        ndcFreeStruct(s);
    }

    // --- [ dcDefineStruct ] ---

    /** Unsafe version of: {@link #dcDefineStruct DefineStruct} */
    public static native long ndcDefineStruct(long signature);

    /**
     * Creates a new struct type using a signature string.
     *
     * @param signature the struct signature
     */
    @NativeType("DCstruct *")
    public static long dcDefineStruct(@NativeType("char const *") ByteBuffer signature) {
        if (CHECKS) {
            checkNT1(signature);
        }
        return ndcDefineStruct(memAddress(signature));
    }

    /**
     * Creates a new struct type using a signature string.
     *
     * @param signature the struct signature
     */
    @NativeType("DCstruct *")
    public static long dcDefineStruct(@NativeType("char const *") CharSequence signature) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(signature, true);
            long signatureEncoded = stack.getPointerAddress();
            return ndcDefineStruct(signatureEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}