/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class INTELPerformanceQuery {

    static { GL.initialize(); }

    public static final int
        GL_PERFQUERY_SINGLE_CONTEXT_INTEL = 0x0,
        GL_PERFQUERY_GLOBAL_CONTEXT_INTEL = 0x1;

    public static final int
        GL_PERFQUERY_WAIT_INTEL        = 0x83FB,
        GL_PERFQUERY_FLUSH_INTEL       = 0x83FA,
        GL_PERFQUERY_DONOT_FLUSH_INTEL = 0x83F9;

    public static final int
        GL_PERFQUERY_COUNTER_EVENT_INTEL         = 0x94F0,
        GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL = 0x94F1,
        GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL  = 0x94F2,
        GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL    = 0x94F3,
        GL_PERFQUERY_COUNTER_RAW_INTEL           = 0x94F4,
        GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL     = 0x94F5;

    public static final int
        GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL = 0x94F8,
        GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL = 0x94F9,
        GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL  = 0x94FA,
        GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL = 0x94FB,
        GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL = 0x94FC;

    public static final int
        GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL   = 0x94FD,
        GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL = 0x94FE,
        GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL = 0x94FF;

    public static final int GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL = 0x9500;

    protected INTELPerformanceQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBeginPerfQueryINTEL ] ---

    /** {@code void glBeginPerfQueryINTEL(GLuint queryHandle)} */
    public static native void glBeginPerfQueryINTEL(@NativeType("GLuint") int queryHandle);

    // --- [ glCreatePerfQueryINTEL ] ---

    /** {@code void glCreatePerfQueryINTEL(GLuint queryId, GLuint * queryHandle)} */
    public static native void nglCreatePerfQueryINTEL(int queryId, long queryHandle);

    /** {@code void glCreatePerfQueryINTEL(GLuint queryId, GLuint * queryHandle)} */
    public static void glCreatePerfQueryINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint *") IntBuffer queryHandle) {
        if (CHECKS) {
            check(queryHandle, 1);
        }
        nglCreatePerfQueryINTEL(queryId, memAddress(queryHandle));
    }

    /** {@code void glCreatePerfQueryINTEL(GLuint queryId, GLuint * queryHandle)} */
    @NativeType("void")
    public static int glCreatePerfQueryINTEL(@NativeType("GLuint") int queryId) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer queryHandle = stack.callocInt(1);
            nglCreatePerfQueryINTEL(queryId, memAddress(queryHandle));
            return queryHandle.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeletePerfQueryINTEL ] ---

    /** {@code void glDeletePerfQueryINTEL(GLuint queryHandle)} */
    public static native void glDeletePerfQueryINTEL(@NativeType("GLuint") int queryHandle);

    // --- [ glEndPerfQueryINTEL ] ---

    /** {@code void glEndPerfQueryINTEL(GLuint queryHandle)} */
    public static native void glEndPerfQueryINTEL(@NativeType("GLuint") int queryHandle);

    // --- [ glGetFirstPerfQueryIdINTEL ] ---

    /** {@code void glGetFirstPerfQueryIdINTEL(GLuint * queryId)} */
    public static native void nglGetFirstPerfQueryIdINTEL(long queryId);

    /** {@code void glGetFirstPerfQueryIdINTEL(GLuint * queryId)} */
    public static void glGetFirstPerfQueryIdINTEL(@NativeType("GLuint *") IntBuffer queryId) {
        if (CHECKS) {
            check(queryId, 1);
        }
        nglGetFirstPerfQueryIdINTEL(memAddress(queryId));
    }

    /** {@code void glGetFirstPerfQueryIdINTEL(GLuint * queryId)} */
    @NativeType("void")
    public static int glGetFirstPerfQueryIdINTEL() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer queryId = stack.callocInt(1);
            nglGetFirstPerfQueryIdINTEL(memAddress(queryId));
            return queryId.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNextPerfQueryIdINTEL ] ---

    /** {@code void glGetNextPerfQueryIdINTEL(GLuint queryId, GLuint * nextQueryId)} */
    public static native void nglGetNextPerfQueryIdINTEL(int queryId, long nextQueryId);

    /** {@code void glGetNextPerfQueryIdINTEL(GLuint queryId, GLuint * nextQueryId)} */
    public static void glGetNextPerfQueryIdINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint *") IntBuffer nextQueryId) {
        if (CHECKS) {
            check(nextQueryId, 1);
        }
        nglGetNextPerfQueryIdINTEL(queryId, memAddress(nextQueryId));
    }

    /** {@code void glGetNextPerfQueryIdINTEL(GLuint queryId, GLuint * nextQueryId)} */
    @NativeType("void")
    public static int glGetNextPerfQueryIdINTEL(@NativeType("GLuint") int queryId) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer nextQueryId = stack.callocInt(1);
            nglGetNextPerfQueryIdINTEL(queryId, memAddress(nextQueryId));
            return nextQueryId.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPerfCounterInfoINTEL ] ---

    /** {@code void glGetPerfCounterInfoINTEL(GLuint queryId, GLuint counterId, GLuint counterNameLength, GLchar * counterName, GLuint counterDescLength, GLchar * counterDesc, GLuint * counterOffset, GLuint * counterDataSize, GLuint * counterTypeEnum, GLuint * counterDataTypeEnum, GLuint64 * rawCounterMaxValue)} */
    public static native void nglGetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, long counterName, int counterDescLength, long counterDesc, long counterOffset, long counterDataSize, long counterTypeEnum, long counterDataTypeEnum, long rawCounterMaxValue);

    /** {@code void glGetPerfCounterInfoINTEL(GLuint queryId, GLuint counterId, GLuint counterNameLength, GLchar * counterName, GLuint counterDescLength, GLchar * counterDesc, GLuint * counterOffset, GLuint * counterDataSize, GLuint * counterTypeEnum, GLuint * counterDataTypeEnum, GLuint64 * rawCounterMaxValue)} */
    public static void glGetPerfCounterInfoINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint") int counterId, @NativeType("GLchar *") ByteBuffer counterName, @NativeType("GLchar *") ByteBuffer counterDesc, @NativeType("GLuint *") IntBuffer counterOffset, @NativeType("GLuint *") IntBuffer counterDataSize, @NativeType("GLuint *") IntBuffer counterTypeEnum, @NativeType("GLuint *") IntBuffer counterDataTypeEnum, @NativeType("GLuint64 *") LongBuffer rawCounterMaxValue) {
        if (CHECKS) {
            check(counterOffset, 1);
            check(counterDataSize, 1);
            check(counterTypeEnum, 1);
            check(counterDataTypeEnum, 1);
            check(rawCounterMaxValue, 1);
        }
        nglGetPerfCounterInfoINTEL(queryId, counterId, counterName.remaining(), memAddress(counterName), counterDesc.remaining(), memAddress(counterDesc), memAddress(counterOffset), memAddress(counterDataSize), memAddress(counterTypeEnum), memAddress(counterDataTypeEnum), memAddress(rawCounterMaxValue));
    }

    // --- [ glGetPerfQueryDataINTEL ] ---

    /** {@code void glGetPerfQueryDataINTEL(GLuint queryHandle, GLuint flags, GLsizei dataSize, void * data, GLuint * bytesWritten)} */
    public static native void nglGetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, long data, long bytesWritten);

    /** {@code void glGetPerfQueryDataINTEL(GLuint queryHandle, GLuint flags, GLsizei dataSize, void * data, GLuint * bytesWritten)} */
    public static void glGetPerfQueryDataINTEL(@NativeType("GLuint") int queryHandle, @NativeType("GLuint") int flags, @NativeType("void *") ByteBuffer data, @NativeType("GLuint *") IntBuffer bytesWritten) {
        if (CHECKS) {
            check(bytesWritten, 1);
        }
        nglGetPerfQueryDataINTEL(queryHandle, flags, data.remaining(), memAddress(data), memAddress(bytesWritten));
    }

    // --- [ glGetPerfQueryIdByNameINTEL ] ---

    /** {@code void glGetPerfQueryIdByNameINTEL(GLchar * queryName, GLuint * queryId)} */
    public static native void nglGetPerfQueryIdByNameINTEL(long queryName, long queryId);

    /** {@code void glGetPerfQueryIdByNameINTEL(GLchar * queryName, GLuint * queryId)} */
    public static void glGetPerfQueryIdByNameINTEL(@NativeType("GLchar *") ByteBuffer queryName, @NativeType("GLuint *") IntBuffer queryId) {
        if (CHECKS) {
            checkNT1(queryName);
            check(queryId, 1);
        }
        nglGetPerfQueryIdByNameINTEL(memAddress(queryName), memAddress(queryId));
    }

    /** {@code void glGetPerfQueryIdByNameINTEL(GLchar * queryName, GLuint * queryId)} */
    public static void glGetPerfQueryIdByNameINTEL(@NativeType("GLchar *") CharSequence queryName, @NativeType("GLuint *") IntBuffer queryId) {
        if (CHECKS) {
            check(queryId, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(queryName, true);
            long queryNameEncoded = stack.getPointerAddress();
            nglGetPerfQueryIdByNameINTEL(queryNameEncoded, memAddress(queryId));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetPerfQueryIdByNameINTEL(GLchar * queryName, GLuint * queryId)} */
    @NativeType("void")
    public static int glGetPerfQueryIdByNameINTEL(@NativeType("GLchar *") CharSequence queryName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(queryName, true);
            long queryNameEncoded = stack.getPointerAddress();
            IntBuffer queryId = stack.callocInt(1);
            nglGetPerfQueryIdByNameINTEL(queryNameEncoded, memAddress(queryId));
            return queryId.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPerfQueryInfoINTEL ] ---

    /** {@code void glGetPerfQueryInfoINTEL(GLuint queryId, GLuint queryNameLength, GLchar * queryName, GLuint * dataSize, GLuint * noCounters, GLuint * noInstances, GLuint * capsMask)} */
    public static native void nglGetPerfQueryInfoINTEL(int queryId, int queryNameLength, long queryName, long dataSize, long noCounters, long noInstances, long capsMask);

    /** {@code void glGetPerfQueryInfoINTEL(GLuint queryId, GLuint queryNameLength, GLchar * queryName, GLuint * dataSize, GLuint * noCounters, GLuint * noInstances, GLuint * capsMask)} */
    public static void glGetPerfQueryInfoINTEL(@NativeType("GLuint") int queryId, @NativeType("GLchar *") ByteBuffer queryName, @NativeType("GLuint *") IntBuffer dataSize, @NativeType("GLuint *") IntBuffer noCounters, @NativeType("GLuint *") IntBuffer noInstances, @NativeType("GLuint *") IntBuffer capsMask) {
        if (CHECKS) {
            check(dataSize, 1);
            check(noCounters, 1);
            check(noInstances, 1);
            check(capsMask, 1);
        }
        nglGetPerfQueryInfoINTEL(queryId, queryName.remaining(), memAddress(queryName), memAddress(dataSize), memAddress(noCounters), memAddress(noInstances), memAddress(capsMask));
    }

    /** {@code void glCreatePerfQueryINTEL(GLuint queryId, GLuint * queryHandle)} */
    public static void glCreatePerfQueryINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint *") int[] queryHandle) {
        long __functionAddress = GL.getICD().glCreatePerfQueryINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(queryHandle, 1);
        }
        callPV(queryId, queryHandle, __functionAddress);
    }

    /** {@code void glGetFirstPerfQueryIdINTEL(GLuint * queryId)} */
    public static void glGetFirstPerfQueryIdINTEL(@NativeType("GLuint *") int[] queryId) {
        long __functionAddress = GL.getICD().glGetFirstPerfQueryIdINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(queryId, 1);
        }
        callPV(queryId, __functionAddress);
    }

    /** {@code void glGetNextPerfQueryIdINTEL(GLuint queryId, GLuint * nextQueryId)} */
    public static void glGetNextPerfQueryIdINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint *") int[] nextQueryId) {
        long __functionAddress = GL.getICD().glGetNextPerfQueryIdINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(nextQueryId, 1);
        }
        callPV(queryId, nextQueryId, __functionAddress);
    }

    /** {@code void glGetPerfCounterInfoINTEL(GLuint queryId, GLuint counterId, GLuint counterNameLength, GLchar * counterName, GLuint counterDescLength, GLchar * counterDesc, GLuint * counterOffset, GLuint * counterDataSize, GLuint * counterTypeEnum, GLuint * counterDataTypeEnum, GLuint64 * rawCounterMaxValue)} */
    public static void glGetPerfCounterInfoINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint") int counterId, @NativeType("GLchar *") ByteBuffer counterName, @NativeType("GLchar *") ByteBuffer counterDesc, @NativeType("GLuint *") int[] counterOffset, @NativeType("GLuint *") int[] counterDataSize, @NativeType("GLuint *") int[] counterTypeEnum, @NativeType("GLuint *") int[] counterDataTypeEnum, @NativeType("GLuint64 *") long[] rawCounterMaxValue) {
        long __functionAddress = GL.getICD().glGetPerfCounterInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(counterOffset, 1);
            check(counterDataSize, 1);
            check(counterTypeEnum, 1);
            check(counterDataTypeEnum, 1);
            check(rawCounterMaxValue, 1);
        }
        callPPPPPPPV(queryId, counterId, counterName.remaining(), memAddress(counterName), counterDesc.remaining(), memAddress(counterDesc), counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue, __functionAddress);
    }

    /** {@code void glGetPerfQueryDataINTEL(GLuint queryHandle, GLuint flags, GLsizei dataSize, void * data, GLuint * bytesWritten)} */
    public static void glGetPerfQueryDataINTEL(@NativeType("GLuint") int queryHandle, @NativeType("GLuint") int flags, @NativeType("void *") ByteBuffer data, @NativeType("GLuint *") int[] bytesWritten) {
        long __functionAddress = GL.getICD().glGetPerfQueryDataINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(bytesWritten, 1);
        }
        callPPV(queryHandle, flags, data.remaining(), memAddress(data), bytesWritten, __functionAddress);
    }

    /** {@code void glGetPerfQueryIdByNameINTEL(GLchar * queryName, GLuint * queryId)} */
    public static void glGetPerfQueryIdByNameINTEL(@NativeType("GLchar *") ByteBuffer queryName, @NativeType("GLuint *") int[] queryId) {
        long __functionAddress = GL.getICD().glGetPerfQueryIdByNameINTEL;
        if (CHECKS) {
            check(__functionAddress);
            checkNT1(queryName);
            check(queryId, 1);
        }
        callPPV(memAddress(queryName), queryId, __functionAddress);
    }

    /** {@code void glGetPerfQueryIdByNameINTEL(GLchar * queryName, GLuint * queryId)} */
    public static void glGetPerfQueryIdByNameINTEL(@NativeType("GLchar *") CharSequence queryName, @NativeType("GLuint *") int[] queryId) {
        long __functionAddress = GL.getICD().glGetPerfQueryIdByNameINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(queryId, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(queryName, true);
            long queryNameEncoded = stack.getPointerAddress();
            callPPV(queryNameEncoded, queryId, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetPerfQueryInfoINTEL(GLuint queryId, GLuint queryNameLength, GLchar * queryName, GLuint * dataSize, GLuint * noCounters, GLuint * noInstances, GLuint * capsMask)} */
    public static void glGetPerfQueryInfoINTEL(@NativeType("GLuint") int queryId, @NativeType("GLchar *") ByteBuffer queryName, @NativeType("GLuint *") int[] dataSize, @NativeType("GLuint *") int[] noCounters, @NativeType("GLuint *") int[] noInstances, @NativeType("GLuint *") int[] capsMask) {
        long __functionAddress = GL.getICD().glGetPerfQueryInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(dataSize, 1);
            check(noCounters, 1);
            check(noInstances, 1);
            check(capsMask, 1);
        }
        callPPPPPV(queryId, queryName.remaining(), memAddress(queryName), dataSize, noCounters, noInstances, capsMask, __functionAddress);
    }

}