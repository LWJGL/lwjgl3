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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/INTEL/INTEL_performance_query.txt">INTEL_performance_query</a> extension.
 * 
 * <p>The purpose of this extension is to expose Intel proprietary hardware performance counters to the OpenGL applications. Performance counters may count:</p>
 * 
 * <ul>
 * <li>number of hardware events such as number of spawned vertex shaders. In this case the results represent the number of events.</li>
 * <li>duration of certain activity, like time took by all fragment shader invocations. In that case the result usually represents the number of clocks in
 * which the particular HW unit was busy. In order to use such counter efficiently, it should be normalized to the range of &lt;0,1&gt; by dividing
 * its value by the number of render clocks.</li>
 * <li>used throughput of certain memory types such as texture memory. In that case the result of performance counter usually represents the number of
 * bytes transferred between GPU and memory.</li>
 * </ul>
 * 
 * <p>This extension specifies universal API to manage performance counters on different Intel hardware platforms. Performance counters are grouped together
 * into proprietary, hardware-specific, fixed sets of counters that are measured together by the GPU.</p>
 * 
 * <p>It is assumed that performance counters are started and ended on any arbitrary boundaries during rendering.</p>
 * 
 * <p>A set of performance counters is represented by a unique query type. Each query type is identified by assigned name and ID. Multiple query types (sets
 * of performance counters) are supported by the Intel hardware. However each Intel hardware generation supports different sets of performance counters.
 * Therefore the query types between hardware generations can be different. The definition of query types and their results structures can be learned
 * through the API. It is also documented in a separate document of Intel OGL Performance Counters Specification issued per each new hardware generation.</p>
 * 
 * <p>The API allows to create multiple instances of any query type and to sample different fragments of 3D rendering with such instances. Query instances
 * are identified with handles.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public class INTELPerformanceQuery {

    static { GL.initialize(); }

    /** Returned by the capsMask parameter of GetPerfQueryInfoINTEL. */
    public static final int
        GL_PERFQUERY_SINGLE_CONTEXT_INTEL = 0x0,
        GL_PERFQUERY_GLOBAL_CONTEXT_INTEL = 0x1;

    /** Accepted by the flags parameter of GetPerfQueryDataINTEL. */
    public static final int
        GL_PERFQUERY_WAIT_INTEL        = 0x83FB,
        GL_PERFQUERY_FLUSH_INTEL       = 0x83FA,
        GL_PERFQUERY_DONOT_FLUSH_INTEL = 0x83F9;

    /** Returned by GetPerfCounterInfoINTEL function as counter type enumeration in location pointed by counterTypeEnum. */
    public static final int
        GL_PERFQUERY_COUNTER_EVENT_INTEL         = 0x94F0,
        GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL = 0x94F1,
        GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL  = 0x94F2,
        GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL    = 0x94F3,
        GL_PERFQUERY_COUNTER_RAW_INTEL           = 0x94F4,
        GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL     = 0x94F5;

    /** Returned by glGetPerfCounterInfoINTEL function as counter data type enumeration in location pointed by counterDataTypeEnum. */
    public static final int
        GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL = 0x94F8,
        GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL = 0x94F9,
        GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL  = 0x94FA,
        GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL = 0x94FB,
        GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL = 0x94FC;

    /** Accepted by the {@code pname} parameter of GetIntegerv. */
    public static final int
        GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL   = 0x94FD,
        GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL = 0x94FE,
        GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL = 0x94FF;

    /** Accepted by the {@code pname} parameter of GetBooleanv. */
    public static final int GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL = 0x9500;

    protected INTELPerformanceQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBeginPerfQueryINTEL ] ---

    public static native void glBeginPerfQueryINTEL(@NativeType("GLuint") int queryHandle);

    // --- [ glCreatePerfQueryINTEL ] ---

    public static native void nglCreatePerfQueryINTEL(int queryId, long queryHandle);

    public static void glCreatePerfQueryINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint *") IntBuffer queryHandle) {
        if (CHECKS) {
            check(queryHandle, 1);
        }
        nglCreatePerfQueryINTEL(queryId, memAddress(queryHandle));
    }

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

    public static native void glDeletePerfQueryINTEL(@NativeType("GLuint") int queryHandle);

    // --- [ glEndPerfQueryINTEL ] ---

    public static native void glEndPerfQueryINTEL(@NativeType("GLuint") int queryHandle);

    // --- [ glGetFirstPerfQueryIdINTEL ] ---

    public static native void nglGetFirstPerfQueryIdINTEL(long queryId);

    public static void glGetFirstPerfQueryIdINTEL(@NativeType("GLuint *") IntBuffer queryId) {
        if (CHECKS) {
            check(queryId, 1);
        }
        nglGetFirstPerfQueryIdINTEL(memAddress(queryId));
    }

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

    public static native void nglGetNextPerfQueryIdINTEL(int queryId, long nextQueryId);

    public static void glGetNextPerfQueryIdINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint *") IntBuffer nextQueryId) {
        if (CHECKS) {
            check(nextQueryId, 1);
        }
        nglGetNextPerfQueryIdINTEL(queryId, memAddress(nextQueryId));
    }

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

    public static native void nglGetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, long counterName, int counterDescLength, long counterDesc, long counterOffset, long counterDataSize, long counterTypeEnum, long counterDataTypeEnum, long rawCounterMaxValue);

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

    public static native void nglGetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, long data, long bytesWritten);

    public static void glGetPerfQueryDataINTEL(@NativeType("GLuint") int queryHandle, @NativeType("GLuint") int flags, @NativeType("void *") ByteBuffer data, @NativeType("GLuint *") IntBuffer bytesWritten) {
        if (CHECKS) {
            check(bytesWritten, 1);
        }
        nglGetPerfQueryDataINTEL(queryHandle, flags, data.remaining(), memAddress(data), memAddress(bytesWritten));
    }

    // --- [ glGetPerfQueryIdByNameINTEL ] ---

    public static native void nglGetPerfQueryIdByNameINTEL(long queryName, long queryId);

    public static void glGetPerfQueryIdByNameINTEL(@NativeType("GLchar *") ByteBuffer queryName, @NativeType("GLuint *") IntBuffer queryId) {
        if (CHECKS) {
            checkNT1(queryName);
            check(queryId, 1);
        }
        nglGetPerfQueryIdByNameINTEL(memAddress(queryName), memAddress(queryId));
    }

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

    public static native void nglGetPerfQueryInfoINTEL(int queryId, int queryNameLength, long queryName, long dataSize, long noCounters, long noInstances, long capsMask);

    public static void glGetPerfQueryInfoINTEL(@NativeType("GLuint") int queryId, @NativeType("GLchar *") ByteBuffer queryName, @NativeType("GLuint *") IntBuffer dataSize, @NativeType("GLuint *") IntBuffer noCounters, @NativeType("GLuint *") IntBuffer noInstances, @NativeType("GLuint *") IntBuffer capsMask) {
        if (CHECKS) {
            check(dataSize, 1);
            check(noCounters, 1);
            check(noInstances, 1);
            check(capsMask, 1);
        }
        nglGetPerfQueryInfoINTEL(queryId, queryName.remaining(), memAddress(queryName), memAddress(dataSize), memAddress(noCounters), memAddress(noInstances), memAddress(capsMask));
    }

    /** Array version of: {@link #glCreatePerfQueryINTEL CreatePerfQueryINTEL} */
    public static void glCreatePerfQueryINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint *") int[] queryHandle) {
        long __functionAddress = GL.getICD().glCreatePerfQueryINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(queryHandle, 1);
        }
        callPV(queryId, queryHandle, __functionAddress);
    }

    /** Array version of: {@link #glGetFirstPerfQueryIdINTEL GetFirstPerfQueryIdINTEL} */
    public static void glGetFirstPerfQueryIdINTEL(@NativeType("GLuint *") int[] queryId) {
        long __functionAddress = GL.getICD().glGetFirstPerfQueryIdINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(queryId, 1);
        }
        callPV(queryId, __functionAddress);
    }

    /** Array version of: {@link #glGetNextPerfQueryIdINTEL GetNextPerfQueryIdINTEL} */
    public static void glGetNextPerfQueryIdINTEL(@NativeType("GLuint") int queryId, @NativeType("GLuint *") int[] nextQueryId) {
        long __functionAddress = GL.getICD().glGetNextPerfQueryIdINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(nextQueryId, 1);
        }
        callPV(queryId, nextQueryId, __functionAddress);
    }

    /** Array version of: {@link #glGetPerfCounterInfoINTEL GetPerfCounterInfoINTEL} */
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

    /** Array version of: {@link #glGetPerfQueryDataINTEL GetPerfQueryDataINTEL} */
    public static void glGetPerfQueryDataINTEL(@NativeType("GLuint") int queryHandle, @NativeType("GLuint") int flags, @NativeType("void *") ByteBuffer data, @NativeType("GLuint *") int[] bytesWritten) {
        long __functionAddress = GL.getICD().glGetPerfQueryDataINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(bytesWritten, 1);
        }
        callPPV(queryHandle, flags, data.remaining(), memAddress(data), bytesWritten, __functionAddress);
    }

    /** Array version of: {@link #glGetPerfQueryIdByNameINTEL GetPerfQueryIdByNameINTEL} */
    public static void glGetPerfQueryIdByNameINTEL(@NativeType("GLchar *") ByteBuffer queryName, @NativeType("GLuint *") int[] queryId) {
        long __functionAddress = GL.getICD().glGetPerfQueryIdByNameINTEL;
        if (CHECKS) {
            check(__functionAddress);
            checkNT1(queryName);
            check(queryId, 1);
        }
        callPPV(memAddress(queryName), queryId, __functionAddress);
    }

    /** Array version of: {@link #glGetPerfQueryIdByNameINTEL GetPerfQueryIdByNameINTEL} */
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

    /** Array version of: {@link #glGetPerfQueryInfoINTEL GetPerfQueryInfoINTEL} */
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