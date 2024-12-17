/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Remotery {

    static { LibRemotery.initialize(); }

    public static final int RMT_TRUE = 1;

    public static final int RMT_FALSE = 0;

    public static final int
        RMT_SampleType_CPU    = 0,
        RMT_SampleType_CUDA   = 1,
        RMT_SampleType_D3D11  = 2,
        RMT_SampleType_D3D12  = 3,
        RMT_SampleType_OpenGL = 4,
        RMT_SampleType_Metal  = 5,
        RMT_SampleType_Vulkan = 6,
        RMT_SampleType_Count  = 7;

    public static final int
        RMT_ERROR_NONE                            = 0,
        RMT_ERROR_RECURSIVE_SAMPLE                = 1,
        RMT_ERROR_UNKNOWN                         = 2,
        RMT_ERROR_INVALID_INPUT                   = 3,
        RMT_ERROR_RESOURCE_CREATE_FAIL            = 4,
        RMT_ERROR_RESOURCE_ACCESS_FAIL            = 5,
        RMT_ERROR_TIMEOUT                         = 6,
        RMT_ERROR_MALLOC_FAIL                     = 7,
        RMT_ERROR_TLS_ALLOC_FAIL                  = 8,
        RMT_ERROR_VIRTUAL_MEMORY_BUFFER_FAIL      = 9,
        RMT_ERROR_CREATE_THREAD_FAIL              = 10,
        RMT_ERROR_OPEN_THREAD_HANDLE_FAIL         = 11,
        RMT_ERROR_SOCKET_INVALID_POLL             = 12,
        RMT_ERROR_SOCKET_SELECT_FAIL              = 13,
        RMT_ERROR_SOCKET_POLL_ERRORS              = 14,
        RMT_ERROR_SOCKET_SEND_FAIL                = 15,
        RMT_ERROR_SOCKET_RECV_NO_DATA             = 16,
        RMT_ERROR_SOCKET_RECV_TIMEOUT             = 17,
        RMT_ERROR_SOCKET_RECV_FAILED              = 18,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NOT_GET     = 19,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_VERSION  = 20,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_VERSION = 21,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_HOST     = 22,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_HOST    = 23,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_NO_KEY      = 24,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_BAD_KEY     = 25,
        RMT_ERROR_WEBSOCKET_HANDSHAKE_STRING_FAIL = 26,
        RMT_ERROR_WEBSOCKET_DISCONNECTED          = 27,
        RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER      = 28,
        RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER_SIZE = 29,
        RMT_ERROR_WEBSOCKET_BAD_FRAME_HEADER_MASK = 30,
        RMT_ERROR_WEBSOCKET_RECEIVE_TIMEOUT       = 31,
        RMT_ERROR_REMOTERY_NOT_CREATED            = 32,
        RMT_ERROR_SEND_ON_INCOMPLETE_PROFILE      = 33,
        RMT_ERROR_CUDA_DEINITIALIZED              = 34,
        RMT_ERROR_CUDA_NOT_INITIALIZED            = 35,
        RMT_ERROR_CUDA_INVALID_CONTEXT            = 36,
        RMT_ERROR_CUDA_INVALID_VALUE              = 37,
        RMT_ERROR_CUDA_INVALID_HANDLE             = 38,
        RMT_ERROR_CUDA_OUT_OF_MEMORY              = 39,
        RMT_ERROR_ERROR_NOT_READY                 = 40,
        RMT_ERROR_D3D11_FAILED_TO_CREATE_QUERY    = 41,
        RMT_ERROR_OPENGL_ERROR                    = 42,
        RMT_ERROR_CUDA_UNKNOWN                    = 43;

    public static final int
        RMT_PropertyFlags_NoFlags    = 0,
        RMT_PropertyFlags_FrameReset = 1;

    public static final int
        RMT_PropertyType_rmtGroup = 0,
        RMT_PropertyType_rmtBool  = 1,
        RMT_PropertyType_rmtS32   = 2,
        RMT_PropertyType_rmtU32   = 3,
        RMT_PropertyType_rmtF32   = 4,
        RMT_PropertyType_rmtS64   = 5,
        RMT_PropertyType_rmtU64   = 6,
        RMT_PropertyType_rmtF64   = 7;

    public static final int
        RMTSF_None        = 0,
        RMTSF_Aggregate   = 1,
        RMTSF_Recursive   = 2,
        RMTSF_Root        = 4,
        RMTSF_SendOnClose = 8;

    protected Remotery() {
        throw new UnsupportedOperationException();
    }

    // --- [ rmt_GetLastErrorMessage ] ---

    /** {@code rmtPStr rmt_GetLastErrorMessage(void)} */
    public static native long nrmt_GetLastErrorMessage();

    /** {@code rmtPStr rmt_GetLastErrorMessage(void)} */
    @NativeType("rmtPStr")
    public static @Nullable String rmt_GetLastErrorMessage() {
        long __result = nrmt_GetLastErrorMessage();
        return memUTF8Safe(__result);
    }

    // --- [ rmt_Settings ] ---

    /** {@code rmtSettings * rmt_Settings(void)} */
    public static native long nrmt_Settings();

    /** {@code rmtSettings * rmt_Settings(void)} */
    @NativeType("rmtSettings *")
    public static @Nullable RMTSettings rmt_Settings() {
        long __result = nrmt_Settings();
        return RMTSettings.createSafe(__result);
    }

    // --- [ rmt_CreateGlobalInstance ] ---

    /** {@code rmtError rmt_CreateGlobalInstance(Remotery ** remotery)} */
    public static native int nrmt_CreateGlobalInstance(long remotery);

    /** {@code rmtError rmt_CreateGlobalInstance(Remotery ** remotery)} */
    @NativeType("rmtError")
    public static int rmt_CreateGlobalInstance(@NativeType("Remotery **") PointerBuffer remotery) {
        if (CHECKS) {
            check(remotery, 1);
        }
        return nrmt_CreateGlobalInstance(memAddress(remotery));
    }

    // --- [ rmt_DestroyGlobalInstance ] ---

    /** {@code void rmt_DestroyGlobalInstance(Remotery * remotery)} */
    public static native void nrmt_DestroyGlobalInstance(long remotery);

    /** {@code void rmt_DestroyGlobalInstance(Remotery * remotery)} */
    public static void rmt_DestroyGlobalInstance(@NativeType("Remotery *") long remotery) {
        if (CHECKS) {
            check(remotery);
        }
        nrmt_DestroyGlobalInstance(remotery);
    }

    // --- [ rmt_SetGlobalInstance ] ---

    /** {@code void rmt_SetGlobalInstance(Remotery * remotery)} */
    public static native void nrmt_SetGlobalInstance(long remotery);

    /** {@code void rmt_SetGlobalInstance(Remotery * remotery)} */
    public static void rmt_SetGlobalInstance(@NativeType("Remotery *") long remotery) {
        if (CHECKS) {
            check(remotery);
        }
        nrmt_SetGlobalInstance(remotery);
    }

    // --- [ rmt_GetGlobalInstance ] ---

    /** {@code Remotery * rmt_GetGlobalInstance(void)} */
    @NativeType("Remotery *")
    public static native long rmt_GetGlobalInstance();

    // --- [ rmt_SetCurrentThreadName ] ---

    /** {@code void rmt_SetCurrentThreadName(rmtPStr thread_name)} */
    public static native void nrmt_SetCurrentThreadName(long thread_name);

    /** {@code void rmt_SetCurrentThreadName(rmtPStr thread_name)} */
    public static void rmt_SetCurrentThreadName(@NativeType("rmtPStr") ByteBuffer thread_name) {
        if (CHECKS) {
            checkNT1(thread_name);
        }
        nrmt_SetCurrentThreadName(memAddress(thread_name));
    }

    /** {@code void rmt_SetCurrentThreadName(rmtPStr thread_name)} */
    public static void rmt_SetCurrentThreadName(@NativeType("rmtPStr") CharSequence thread_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(thread_name, true);
            long thread_nameEncoded = stack.getPointerAddress();
            nrmt_SetCurrentThreadName(thread_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_LogText ] ---

    /** {@code void rmt_LogText(rmtPStr text)} */
    public static native void nrmt_LogText(long text);

    /** {@code void rmt_LogText(rmtPStr text)} */
    public static void rmt_LogText(@NativeType("rmtPStr") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nrmt_LogText(memAddress(text));
    }

    /** {@code void rmt_LogText(rmtPStr text)} */
    public static void rmt_LogText(@NativeType("rmtPStr") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nrmt_LogText(textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_BeginCPUSample ] ---

    /** {@code void rmt_BeginCPUSample(rmtPStr name, rmtU32 flags, rmtU32 * hash_cache)} */
    public static native void nrmt_BeginCPUSample(long name, int flags, long hash_cache);

    /** {@code void rmt_BeginCPUSample(rmtPStr name, rmtU32 flags, rmtU32 * hash_cache)} */
    public static void rmt_BeginCPUSample(@NativeType("rmtPStr") ByteBuffer name, @NativeType("rmtU32") int flags, @NativeType("rmtU32 *") @Nullable IntBuffer hash_cache) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(hash_cache, 1);
        }
        nrmt_BeginCPUSample(memAddress(name), flags, memAddressSafe(hash_cache));
    }

    /** {@code void rmt_BeginCPUSample(rmtPStr name, rmtU32 flags, rmtU32 * hash_cache)} */
    public static void rmt_BeginCPUSample(@NativeType("rmtPStr") CharSequence name, @NativeType("rmtU32") int flags, @NativeType("rmtU32 *") @Nullable IntBuffer hash_cache) {
        if (CHECKS) {
            checkSafe(hash_cache, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nrmt_BeginCPUSample(nameEncoded, flags, memAddressSafe(hash_cache));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_EndCPUSample ] ---

    /** {@code void rmt_EndCPUSample(void)} */
    public static native void rmt_EndCPUSample();

    // --- [ rmt_MarkFrame ] ---

    /** {@code rmtError rmt_MarkFrame(void)} */
    @NativeType("rmtError")
    public static native int rmt_MarkFrame();

    // --- [ rmt_PropertySnapshotAll ] ---

    /** {@code rmtError rmt_PropertySnapshotAll(void)} */
    @NativeType("rmtError")
    public static native int rmt_PropertySnapshotAll();

    // --- [ rmt_PropertyFrameResetAll ] ---

    /** {@code void rmt_PropertyFrameResetAll(void)} */
    public static native void rmt_PropertyFrameResetAll();

    // --- [ rmt_IterateChildren ] ---

    /** {@code void rmt_IterateChildren(rmtSampleIterator * iter, rmtSample * sample)} */
    public static native void nrmt_IterateChildren(long iter, long sample);

    /** {@code void rmt_IterateChildren(rmtSampleIterator * iter, rmtSample * sample)} */
    public static void rmt_IterateChildren(@NativeType("rmtSampleIterator *") RMTSampleIterator iter, @NativeType("rmtSample *") long sample) {
        nrmt_IterateChildren(iter.address(), sample);
    }

    // --- [ rmt_IterateNext ] ---

    /** {@code rmtBool rmt_IterateNext(rmtSampleIterator * iter)} */
    public static native int nrmt_IterateNext(long iter);

    /** {@code rmtBool rmt_IterateNext(rmtSampleIterator * iter)} */
    @NativeType("rmtBool")
    public static boolean rmt_IterateNext(@NativeType("rmtSampleIterator *") RMTSampleIterator iter) {
        return nrmt_IterateNext(iter.address()) != 0;
    }

    // --- [ rmt_SampleTreeGetThreadName ] ---

    /** {@code char const * rmt_SampleTreeGetThreadName(rmtSampleTree * sample_tree)} */
    public static native long nrmt_SampleTreeGetThreadName(long sample_tree);

    /** {@code char const * rmt_SampleTreeGetThreadName(rmtSampleTree * sample_tree)} */
    @NativeType("char const *")
    public static @Nullable String rmt_SampleTreeGetThreadName(@NativeType("rmtSampleTree *") long sample_tree) {
        if (CHECKS) {
            check(sample_tree);
        }
        long __result = nrmt_SampleTreeGetThreadName(sample_tree);
        return memUTF8Safe(__result);
    }

    // --- [ rmt_SampleTreeGetRootSample ] ---

    /** {@code rmtSample * rmt_SampleTreeGetRootSample(rmtSampleTree * sample_tree)} */
    public static native long nrmt_SampleTreeGetRootSample(long sample_tree);

    /** {@code rmtSample * rmt_SampleTreeGetRootSample(rmtSampleTree * sample_tree)} */
    @NativeType("rmtSample *")
    public static long rmt_SampleTreeGetRootSample(@NativeType("rmtSampleTree *") long sample_tree) {
        if (CHECKS) {
            check(sample_tree);
        }
        return nrmt_SampleTreeGetRootSample(sample_tree);
    }

    // --- [ rmt_SampleGetName ] ---

    /** {@code char const * rmt_SampleGetName(rmtSample * sample)} */
    public static native long nrmt_SampleGetName(long sample);

    /** {@code char const * rmt_SampleGetName(rmtSample * sample)} */
    @NativeType("char const *")
    public static @Nullable String rmt_SampleGetName(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        long __result = nrmt_SampleGetName(sample);
        return memUTF8Safe(__result);
    }

    // --- [ rmt_SampleGetNameHash ] ---

    /** {@code rmtU32 rmt_SampleGetNameHash(rmtSample * sample)} */
    public static native int nrmt_SampleGetNameHash(long sample);

    /** {@code rmtU32 rmt_SampleGetNameHash(rmtSample * sample)} */
    @NativeType("rmtU32")
    public static int rmt_SampleGetNameHash(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetNameHash(sample);
    }

    // --- [ rmt_SampleGetCallCount ] ---

    /** {@code rmtU32 rmt_SampleGetCallCount(rmtSample * sample)} */
    public static native int nrmt_SampleGetCallCount(long sample);

    /** {@code rmtU32 rmt_SampleGetCallCount(rmtSample * sample)} */
    @NativeType("rmtU32")
    public static int rmt_SampleGetCallCount(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetCallCount(sample);
    }

    // --- [ rmt_SampleGetStart ] ---

    /** {@code rmtU64 rmt_SampleGetStart(rmtSample * sample)} */
    public static native long nrmt_SampleGetStart(long sample);

    /** {@code rmtU64 rmt_SampleGetStart(rmtSample * sample)} */
    @NativeType("rmtU64")
    public static long rmt_SampleGetStart(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetStart(sample);
    }

    // --- [ rmt_SampleGetTime ] ---

    /** {@code rmtU64 rmt_SampleGetTime(rmtSample * sample)} */
    public static native long nrmt_SampleGetTime(long sample);

    /** {@code rmtU64 rmt_SampleGetTime(rmtSample * sample)} */
    @NativeType("rmtU64")
    public static long rmt_SampleGetTime(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetTime(sample);
    }

    // --- [ rmt_SampleGetSelfTime ] ---

    /** {@code rmtU64 rmt_SampleGetSelfTime(rmtSample * sample)} */
    public static native long nrmt_SampleGetSelfTime(long sample);

    /** {@code rmtU64 rmt_SampleGetSelfTime(rmtSample * sample)} */
    @NativeType("rmtU64")
    public static long rmt_SampleGetSelfTime(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetSelfTime(sample);
    }

    // --- [ rmt_SampleGetColour ] ---

    /** {@code void rmt_SampleGetColour(rmtSample * sample, rmtU8 * r, rmtU8 * g, rmtU8 * b)} */
    public static native void nrmt_SampleGetColour(long sample, long r, long g, long b);

    /** {@code void rmt_SampleGetColour(rmtSample * sample, rmtU8 * r, rmtU8 * g, rmtU8 * b)} */
    public static void rmt_SampleGetColour(@NativeType("rmtSample *") long sample, @NativeType("rmtU8 *") ByteBuffer r, @NativeType("rmtU8 *") ByteBuffer g, @NativeType("rmtU8 *") ByteBuffer b) {
        if (CHECKS) {
            check(sample);
            check(r, 1);
            check(g, 1);
            check(b, 1);
        }
        nrmt_SampleGetColour(sample, memAddress(r), memAddress(g), memAddress(b));
    }

    // --- [ rmt_SampleGetType ] ---

    /** {@code rmtSampleType rmt_SampleGetType(rmtSample * sample)} */
    public static native int nrmt_SampleGetType(long sample);

    /** {@code rmtSampleType rmt_SampleGetType(rmtSample * sample)} */
    @NativeType("rmtSampleType")
    public static int rmt_SampleGetType(@NativeType("rmtSample *") long sample) {
        if (CHECKS) {
            check(sample);
        }
        return nrmt_SampleGetType(sample);
    }

    // --- [ rmt_PropertyIterateChildren ] ---

    /** {@code void rmt_PropertyIterateChildren(rmtPropertyIterator * iter, rmtProperty * sample)} */
    public static native void nrmt_PropertyIterateChildren(long iter, long sample);

    /** {@code void rmt_PropertyIterateChildren(rmtPropertyIterator * iter, rmtProperty * sample)} */
    public static void rmt_PropertyIterateChildren(@NativeType("rmtPropertyIterator *") RMTPropertyIterator iter, @NativeType("rmtProperty *") @Nullable RMTProperty sample) {
        nrmt_PropertyIterateChildren(iter.address(), memAddressSafe(sample));
    }

    // --- [ rmt_PropertyIterateNext ] ---

    /** {@code rmtBool rmt_PropertyIterateNext(rmtPropertyIterator * iter)} */
    public static native int nrmt_PropertyIterateNext(long iter);

    /** {@code rmtBool rmt_PropertyIterateNext(rmtPropertyIterator * iter)} */
    @NativeType("rmtBool")
    public static boolean rmt_PropertyIterateNext(@NativeType("rmtPropertyIterator *") RMTPropertyIterator iter) {
        return nrmt_PropertyIterateNext(iter.address()) != 0;
    }

    // --- [ rmt_PropertyGetType ] ---

    /** {@code rmtPropertyType rmt_PropertyGetType(rmtProperty * property)} */
    public static native int nrmt_PropertyGetType(long property);

    /** {@code rmtPropertyType rmt_PropertyGetType(rmtProperty * property)} */
    @NativeType("rmtPropertyType")
    public static int rmt_PropertyGetType(@NativeType("rmtProperty *") RMTProperty property) {
        return nrmt_PropertyGetType(property.address());
    }

    // --- [ rmt_PropertyGetName ] ---

    /** {@code char const * rmt_PropertyGetName(rmtProperty * property)} */
    public static native long nrmt_PropertyGetName(long property);

    /** {@code char const * rmt_PropertyGetName(rmtProperty * property)} */
    @NativeType("char const *")
    public static @Nullable String rmt_PropertyGetName(@NativeType("rmtProperty *") RMTProperty property) {
        long __result = nrmt_PropertyGetName(property.address());
        return memUTF8Safe(__result);
    }

    // --- [ rmt_PropertyGetDescription ] ---

    /** {@code char const * rmt_PropertyGetDescription(rmtProperty * property)} */
    public static native long nrmt_PropertyGetDescription(long property);

    /** {@code char const * rmt_PropertyGetDescription(rmtProperty * property)} */
    @NativeType("char const *")
    public static @Nullable String rmt_PropertyGetDescription(@NativeType("rmtProperty *") RMTProperty property) {
        long __result = nrmt_PropertyGetDescription(property.address());
        return memUTF8Safe(__result);
    }

    // --- [ rmt_PropertyGetValue ] ---

    /** {@code rmtPropertyValue rmt_PropertyGetValue(rmtProperty * property)} */
    public static native void nrmt_PropertyGetValue(long property, long __result);

    /** {@code rmtPropertyValue rmt_PropertyGetValue(rmtProperty * property)} */
    @NativeType("rmtPropertyValue")
    public static RMTPropertyValue rmt_PropertyGetValue(@NativeType("rmtProperty *") RMTProperty property, @NativeType("rmtPropertyValue") RMTPropertyValue __result) {
        nrmt_PropertyGetValue(property.address(), __result.address());
        return __result;
    }

    // --- [ _rmt_PropertySetValue ] ---

    /** {@code void _rmt_PropertySetValue(rmtProperty * property)} */
    public static native void n_rmt_PropertySetValue(long property);

    /** {@code void _rmt_PropertySetValue(rmtProperty * property)} */
    public static void _rmt_PropertySetValue(@NativeType("rmtProperty *") RMTProperty property) {
        n_rmt_PropertySetValue(property.address());
    }

    // --- [ _rmt_PropertyAddValue ] ---

    /** {@code void _rmt_PropertyAddValue(rmtProperty * property, rmtPropertyValue add_value)} */
    public static native void n_rmt_PropertyAddValue(long property, long add_value);

    /** {@code void _rmt_PropertyAddValue(rmtProperty * property, rmtPropertyValue add_value)} */
    public static void _rmt_PropertyAddValue(@NativeType("rmtProperty *") RMTProperty property, @NativeType("rmtPropertyValue") RMTPropertyValue add_value) {
        n_rmt_PropertyAddValue(property.address(), add_value.address());
    }

    // --- [ _rmt_HashString32 ] ---

    /** {@code rmtU32 _rmt_HashString32(char const * s, int len, rmtU32 seed)} */
    public static native int n_rmt_HashString32(long s, int len, int seed);

    /** {@code rmtU32 _rmt_HashString32(char const * s, int len, rmtU32 seed)} */
    @NativeType("rmtU32")
    public static int _rmt_HashString32(@NativeType("char const *") ByteBuffer s, int len, @NativeType("rmtU32") int seed) {
        if (CHECKS) {
            checkNT1(s);
        }
        return n_rmt_HashString32(memAddress(s), len, seed);
    }

    /** {@code rmtU32 _rmt_HashString32(char const * s, int len, rmtU32 seed)} */
    @NativeType("rmtU32")
    public static int _rmt_HashString32(@NativeType("char const *") CharSequence s, int len, @NativeType("rmtU32") int seed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(s, true);
            long sEncoded = stack.getPointerAddress();
            return n_rmt_HashString32(sEncoded, len, seed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Initializes the {@code __result} {@code RMTProperty} with the specified values.
     *
     * <p>This method does not allocate any memory.</p>
     *
     * @return the initialized property
     */
    public static RMTProperty rmt_PropertyDefine(int type, int flags, RMTPropertyValue default_value, ByteBuffer name, ByteBuffer desc, @Nullable RMTProperty parent, RMTProperty __result) {
        return __result
            .initialised(false)
            .type(type)
            .flags(flags)
            .value(default_value)
            .lastFrameValue(default_value)
            .prevValue(default_value)
            .prevValueFrame(0)
            .name(name)
            .description(desc)
            .defaultValue(default_value)
            .parent(parent)
            .firstChild(null)
            .lastChild(null)
            .nextSibling(null)
            .nameHash(0)
            .uniqueID(0);
    }

    /**
     * Uses the specified {@code MemoryStack} frame to encode the {@code name} and {@code desc} strings and allocate memory for a new {@code RMTProperty}, then
     * initializes the property with the specified values.
     *
     * @return the new property
     */
    public static RMTProperty rmt_PropertyDefine(int type, int flags, RMTPropertyValue default_value, String name, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        return RMTProperty.malloc(frame)
            .initialised(false)
            .type(type)
            .flags(flags)
            .value(default_value)
            .lastFrameValue(default_value)
            .prevValue(default_value)
            .prevValueFrame(0)
            .name(frame.UTF8(name))
            .description(frame.UTF8(desc))
            .defaultValue(default_value)
            .parent(parent)
            .firstChild(null)
            .lastChild(null)
            .nextSibling(null)
            .nameHash(0)
            .uniqueID(0);
    }

    private static final RMTPropertyValue NULL_VALUE = RMTPropertyValue.create();

    /**
     * Allocates a new group property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new group property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_Group(String name, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        return rmt_PropertyDefine(RMT_PropertyType_rmtGroup, RMT_PropertyFlags_NoFlags, NULL_VALUE, name, desc, parent, frame);
    }

    private static final RMTPropertyValue FALSE = RMTPropertyValue.create().Bool(false);
    private static final RMTPropertyValue TRUE  = RMTPropertyValue.create().Bool(true);

    /**
     * Allocates a new boolean property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new boolean property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_Bool(String name, boolean default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        return rmt_PropertyDefine(RMT_PropertyType_rmtBool, flags, default_value ? TRUE : FALSE, name, desc, parent, frame);
    }

    /**
     * Allocates a new S32 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new S32 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_S32(String name, int default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtS32,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .S32(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new U32 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new U32 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_U32(String name, int default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtU32,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .U32(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new F32 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new F32 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_F32(String name, float default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtF32,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .F32(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new S64 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new S64 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_S64(String name, long default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtS64,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .S64(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new U64 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new U64 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_U64(String name, long default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtU64,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .U64(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    /**
     * Allocates a new F64 property on the specified {@code MemoryStack} frame and initializes it.
     *
     * @return the new F64 property
     *
     * @see #rmt_PropertyDefine(int, int, RMTPropertyValue, String, String, RMTProperty, MemoryStack) rmt_PropertyDefine
     */
    public static RMTProperty rmt_PropertyDefine_F64(String name, double default_value, int flags, String desc, @Nullable RMTProperty parent, MemoryStack frame) {
        RMTProperty __result = RMTProperty.malloc(frame);
        ByteBuffer nameBuffer = frame.UTF8(name);
        ByteBuffer descBuffer = frame.UTF8(desc);
        try (MemoryStack tmp = frame.push()) {
            return rmt_PropertyDefine(
                RMT_PropertyType_rmtF64,
                flags,
                RMTPropertyValue.malloc(tmp)
                    .F64(default_value),
                nameBuffer,
                descBuffer,
                parent,
                __result
            );
        }
    }

    public static void rmt_PropertySet_Bool(RMTProperty property, boolean value) {
        property.value().Bool(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_S32(RMTProperty property, int value) {
        property.value().S32(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_U32(RMTProperty property, int value) {
        property.value().U32(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_F32(RMTProperty property, float value) {
        property.value().F32(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_S64(RMTProperty property, long value) {
        property.value().S64(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_U64(RMTProperty property, long value) {
        property.value().U64(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertySet_F64(RMTProperty property, double value) {
        property.value().F64(value);
        _rmt_PropertySetValue(property);
    }

    public static void rmt_PropertyAdd_S32(RMTProperty property, int add_value, MemoryStack frame) {
        rmt_PropertyAdd_S32(property, RMTPropertyValue.malloc(frame).S32(add_value));
    }
    public static void rmt_PropertyAdd_S32(RMTProperty property, RMTPropertyValue add_value) {
        property.value().S32(property.value().S32() + add_value.S32());
        _rmt_PropertyAddValue(property, add_value);
    }
    
    public static void rmt_PropertyAdd_U32(RMTProperty property, int add_value, MemoryStack frame) {
        rmt_PropertyAdd_U32(property, RMTPropertyValue.malloc(frame).U32(add_value));
    }
    public static void rmt_PropertyAdd_U32(RMTProperty property, RMTPropertyValue add_value) {
        property.value().U32(property.value().U32() + add_value.U32());
        _rmt_PropertyAddValue(property, add_value);
    }

    public static void rmt_PropertyAdd_F32(RMTProperty property, float add_value, MemoryStack frame) {
        rmt_PropertyAdd_F32(property, RMTPropertyValue.malloc(frame).F32(add_value));
    }
    public static void rmt_PropertyAdd_F32(RMTProperty property, RMTPropertyValue add_value) {
        property.value().F32(property.value().F32() + add_value.F32());
        _rmt_PropertyAddValue(property, add_value);
    }

    public static void rmt_PropertyAdd_S64(RMTProperty property, long add_value, MemoryStack frame) {
        rmt_PropertyAdd_S64(property, RMTPropertyValue.malloc(frame).S64(add_value));
    }
    public static void rmt_PropertyAdd_S64(RMTProperty property, RMTPropertyValue add_value) {
        property.value().S64(property.value().S64() + add_value.S64());
        _rmt_PropertyAddValue(property, add_value);
    }

    public static void rmt_PropertyAdd_U64(RMTProperty property, long add_value, MemoryStack frame) {
        rmt_PropertyAdd_U64(property, RMTPropertyValue.malloc(frame).U64(add_value));
    }
    public static void rmt_PropertyAdd_U64(RMTProperty property, RMTPropertyValue add_value) {
        property.value().U64(property.value().U64() + add_value.U64());
        _rmt_PropertyAddValue(property, add_value);
    }

    public static void rmt_PropertyAdd_F64(RMTProperty property, double add_value, MemoryStack frame) {
        rmt_PropertyAdd_F64(property, RMTPropertyValue.malloc(frame).F64(add_value));
    }
    public static void rmt_PropertyAdd_F64(RMTProperty property, RMTPropertyValue add_value) {
        property.value().F64(property.value().F64() + add_value.F64());
        _rmt_PropertyAddValue(property, add_value);
    }

}