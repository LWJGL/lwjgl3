/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class AMDPerformanceMonitor {

    static { GLES.initialize(); }

    public static final int
        GL_COUNTER_TYPE_AMD  = 0x8BC0,
        GL_COUNTER_RANGE_AMD = 0x8BC1;

    public static final int
        GL_UNSIGNED_INT64_AMD = 0x8BC2,
        GL_PERCENTAGE_AMD     = 0x8BC3;

    public static final int
        GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4,
        GL_PERFMON_RESULT_SIZE_AMD      = 0x8BC5,
        GL_PERFMON_RESULT_AMD           = 0x8BC6;

    protected AMDPerformanceMonitor() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetPerfMonitorGroupsAMD ] ---

    /** {@code void glGetPerfMonitorGroupsAMD(GLint * numGroups, GLsizei groupsSize, GLuint * groups)} */
    public static native void nglGetPerfMonitorGroupsAMD(long numGroups, int groupsSize, long groups);

    /** {@code void glGetPerfMonitorGroupsAMD(GLint * numGroups, GLsizei groupsSize, GLuint * groups)} */
    public static void glGetPerfMonitorGroupsAMD(@NativeType("GLint *") @Nullable IntBuffer numGroups, @NativeType("GLuint *") @Nullable IntBuffer groups) {
        if (CHECKS) {
            checkSafe(numGroups, 1);
        }
        nglGetPerfMonitorGroupsAMD(memAddressSafe(numGroups), remainingSafe(groups), memAddressSafe(groups));
    }

    // --- [ glGetPerfMonitorCountersAMD ] ---

    /** {@code void glGetPerfMonitorCountersAMD(GLuint group, GLint * numCounters, GLint * maxActiveCounters, GLsizei counterSize, GLuint * counters)} */
    public static native void nglGetPerfMonitorCountersAMD(int group, long numCounters, long maxActiveCounters, int counterSize, long counters);

    /** {@code void glGetPerfMonitorCountersAMD(GLuint group, GLint * numCounters, GLint * maxActiveCounters, GLsizei counterSize, GLuint * counters)} */
    public static void glGetPerfMonitorCountersAMD(@NativeType("GLuint") int group, @NativeType("GLint *") IntBuffer numCounters, @NativeType("GLint *") IntBuffer maxActiveCounters, @NativeType("GLuint *") IntBuffer counters) {
        if (CHECKS) {
            check(numCounters, 1);
            check(maxActiveCounters, 1);
        }
        nglGetPerfMonitorCountersAMD(group, memAddress(numCounters), memAddress(maxActiveCounters), counters.remaining(), memAddress(counters));
    }

    // --- [ glGetPerfMonitorGroupStringAMD ] ---

    /** {@code void glGetPerfMonitorGroupStringAMD(GLuint group, GLsizei bufSize, GLsizei * length, GLchar * groupString)} */
    public static native void nglGetPerfMonitorGroupStringAMD(int group, int bufSize, long length, long groupString);

    /** {@code void glGetPerfMonitorGroupStringAMD(GLuint group, GLsizei bufSize, GLsizei * length, GLchar * groupString)} */
    public static void glGetPerfMonitorGroupStringAMD(@NativeType("GLuint") int group, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer groupString) {
        if (CHECKS) {
            check(length, 1);
        }
        nglGetPerfMonitorGroupStringAMD(group, groupString.remaining(), memAddress(length), memAddress(groupString));
    }

    // --- [ glGetPerfMonitorCounterStringAMD ] ---

    /** {@code void glGetPerfMonitorCounterStringAMD(GLuint group, GLuint counter, GLsizei bufSize, GLsizei * length, GLchar * counterString)} */
    public static native void nglGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, long length, long counterString);

    /** {@code void glGetPerfMonitorCounterStringAMD(GLuint group, GLuint counter, GLsizei bufSize, GLsizei * length, GLchar * counterString)} */
    public static void glGetPerfMonitorCounterStringAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") @Nullable ByteBuffer counterString) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetPerfMonitorCounterStringAMD(group, counter, remainingSafe(counterString), memAddressSafe(length), memAddressSafe(counterString));
    }

    // --- [ glGetPerfMonitorCounterInfoAMD ] ---

    /** {@code void glGetPerfMonitorCounterInfoAMD(GLuint group, GLuint counter, GLenum pname, void * data)} */
    public static native void nglGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, long data);

    /** {@code void glGetPerfMonitorCounterInfoAMD(GLuint group, GLuint counter, GLenum pname, void * data)} */
    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 4);
        }
        nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
    }

    /** {@code void glGetPerfMonitorCounterInfoAMD(GLuint group, GLuint counter, GLenum pname, void * data)} */
    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") IntBuffer data) {
        if (CHECKS) {
            check(data, 4 >> 2);
        }
        nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
    }

    /** {@code void glGetPerfMonitorCounterInfoAMD(GLuint group, GLuint counter, GLenum pname, void * data)} */
    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 4 >> 2);
        }
        nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
    }

    // --- [ glGenPerfMonitorsAMD ] ---

    /** {@code void glGenPerfMonitorsAMD(GLsizei n, GLuint * monitors)} */
    public static native void nglGenPerfMonitorsAMD(int n, long monitors);

    /** {@code void glGenPerfMonitorsAMD(GLsizei n, GLuint * monitors)} */
    public static void glGenPerfMonitorsAMD(@NativeType("GLuint *") IntBuffer monitors) {
        nglGenPerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
    }

    /** {@code void glGenPerfMonitorsAMD(GLsizei n, GLuint * monitors)} */
    @NativeType("void")
    public static int glGenPerfMonitorsAMD() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer monitors = stack.callocInt(1);
            nglGenPerfMonitorsAMD(1, memAddress(monitors));
            return monitors.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeletePerfMonitorsAMD ] ---

    /** {@code void glDeletePerfMonitorsAMD(GLsizei n, GLuint * monitors)} */
    public static native void nglDeletePerfMonitorsAMD(int n, long monitors);

    /** {@code void glDeletePerfMonitorsAMD(GLsizei n, GLuint * monitors)} */
    public static void glDeletePerfMonitorsAMD(@NativeType("GLuint *") IntBuffer monitors) {
        nglDeletePerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
    }

    /** {@code void glDeletePerfMonitorsAMD(GLsizei n, GLuint * monitors)} */
    public static void glDeletePerfMonitorsAMD(@NativeType("GLuint *") int monitor) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer monitors = stack.ints(monitor);
            nglDeletePerfMonitorsAMD(1, memAddress(monitors));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSelectPerfMonitorCountersAMD ] ---

    /** {@code void glSelectPerfMonitorCountersAMD(GLuint monitor, GLboolean enable, GLuint group, GLint numCounters, GLuint * counterList)} */
    public static native void nglSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, long counterList);

    /** {@code void glSelectPerfMonitorCountersAMD(GLuint monitor, GLboolean enable, GLuint group, GLint numCounters, GLuint * counterList)} */
    public static void glSelectPerfMonitorCountersAMD(@NativeType("GLuint") int monitor, @NativeType("GLboolean") boolean enable, @NativeType("GLuint") int group, @NativeType("GLuint *") IntBuffer counterList) {
        nglSelectPerfMonitorCountersAMD(monitor, enable, group, counterList.remaining(), memAddress(counterList));
    }

    // --- [ glBeginPerfMonitorAMD ] ---

    /** {@code void glBeginPerfMonitorAMD(GLuint monitor)} */
    public static native void glBeginPerfMonitorAMD(@NativeType("GLuint") int monitor);

    // --- [ glEndPerfMonitorAMD ] ---

    /** {@code void glEndPerfMonitorAMD(GLuint monitor)} */
    public static native void glEndPerfMonitorAMD(@NativeType("GLuint") int monitor);

    // --- [ glGetPerfMonitorCounterDataAMD ] ---

    /** {@code void glGetPerfMonitorCounterDataAMD(GLuint monitor, GLenum pname, GLsizei dataSize, GLuint * data, GLint * bytesWritten)} */
    public static native void nglGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, long data, long bytesWritten);

    /** {@code void glGetPerfMonitorCounterDataAMD(GLuint monitor, GLenum pname, GLsizei dataSize, GLuint * data, GLint * bytesWritten)} */
    public static void glGetPerfMonitorCounterDataAMD(@NativeType("GLuint") int monitor, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer data, @NativeType("GLint *") @Nullable IntBuffer bytesWritten) {
        if (CHECKS) {
            checkSafe(bytesWritten, 1);
        }
        nglGetPerfMonitorCounterDataAMD(monitor, pname, data.remaining(), memAddress(data), memAddressSafe(bytesWritten));
    }

    /** {@code void glGetPerfMonitorGroupsAMD(GLint * numGroups, GLsizei groupsSize, GLuint * groups)} */
    public static void glGetPerfMonitorGroupsAMD(@NativeType("GLint *") int @Nullable [] numGroups, @NativeType("GLuint *") int @Nullable [] groups) {
        long __functionAddress = GLES.getICD().glGetPerfMonitorGroupsAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numGroups, 1);
        }
        callPPV(numGroups, lengthSafe(groups), groups, __functionAddress);
    }

    /** {@code void glGetPerfMonitorCountersAMD(GLuint group, GLint * numCounters, GLint * maxActiveCounters, GLsizei counterSize, GLuint * counters)} */
    public static void glGetPerfMonitorCountersAMD(@NativeType("GLuint") int group, @NativeType("GLint *") int[] numCounters, @NativeType("GLint *") int[] maxActiveCounters, @NativeType("GLuint *") int[] counters) {
        long __functionAddress = GLES.getICD().glGetPerfMonitorCountersAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(numCounters, 1);
            check(maxActiveCounters, 1);
        }
        callPPPV(group, numCounters, maxActiveCounters, counters.length, counters, __functionAddress);
    }

    /** {@code void glGetPerfMonitorGroupStringAMD(GLuint group, GLsizei bufSize, GLsizei * length, GLchar * groupString)} */
    public static void glGetPerfMonitorGroupStringAMD(@NativeType("GLuint") int group, @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer groupString) {
        long __functionAddress = GLES.getICD().glGetPerfMonitorGroupStringAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(length, 1);
        }
        callPPV(group, groupString.remaining(), length, memAddress(groupString), __functionAddress);
    }

    /** {@code void glGetPerfMonitorCounterStringAMD(GLuint group, GLuint counter, GLsizei bufSize, GLsizei * length, GLchar * counterString)} */
    public static void glGetPerfMonitorCounterStringAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") @Nullable ByteBuffer counterString) {
        long __functionAddress = GLES.getICD().glGetPerfMonitorCounterStringAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(group, counter, remainingSafe(counterString), length, memAddressSafe(counterString), __functionAddress);
    }

    /** {@code void glGetPerfMonitorCounterInfoAMD(GLuint group, GLuint counter, GLenum pname, void * data)} */
    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") int[] data) {
        long __functionAddress = GLES.getICD().glGetPerfMonitorCounterInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4 >> 2);
        }
        callPV(group, counter, pname, data, __functionAddress);
    }

    /** {@code void glGetPerfMonitorCounterInfoAMD(GLuint group, GLuint counter, GLenum pname, void * data)} */
    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") float[] data) {
        long __functionAddress = GLES.getICD().glGetPerfMonitorCounterInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4 >> 2);
        }
        callPV(group, counter, pname, data, __functionAddress);
    }

    /** {@code void glGenPerfMonitorsAMD(GLsizei n, GLuint * monitors)} */
    public static void glGenPerfMonitorsAMD(@NativeType("GLuint *") int[] monitors) {
        long __functionAddress = GLES.getICD().glGenPerfMonitorsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(monitors.length, monitors, __functionAddress);
    }

    /** {@code void glDeletePerfMonitorsAMD(GLsizei n, GLuint * monitors)} */
    public static void glDeletePerfMonitorsAMD(@NativeType("GLuint *") int[] monitors) {
        long __functionAddress = GLES.getICD().glDeletePerfMonitorsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(monitors.length, monitors, __functionAddress);
    }

    /** {@code void glSelectPerfMonitorCountersAMD(GLuint monitor, GLboolean enable, GLuint group, GLint numCounters, GLuint * counterList)} */
    public static void glSelectPerfMonitorCountersAMD(@NativeType("GLuint") int monitor, @NativeType("GLboolean") boolean enable, @NativeType("GLuint") int group, @NativeType("GLuint *") int[] counterList) {
        long __functionAddress = GLES.getICD().glSelectPerfMonitorCountersAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(monitor, enable, group, counterList.length, counterList, __functionAddress);
    }

    /** {@code void glGetPerfMonitorCounterDataAMD(GLuint monitor, GLenum pname, GLsizei dataSize, GLuint * data, GLint * bytesWritten)} */
    public static void glGetPerfMonitorCounterDataAMD(@NativeType("GLuint") int monitor, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] data, @NativeType("GLint *") int @Nullable [] bytesWritten) {
        long __functionAddress = GLES.getICD().glGetPerfMonitorCounterDataAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(bytesWritten, 1);
        }
        callPPV(monitor, pname, data.length, data, bytesWritten, __functionAddress);
    }

}