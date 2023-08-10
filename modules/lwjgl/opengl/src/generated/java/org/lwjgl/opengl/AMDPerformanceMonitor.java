/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_performance_monitor.txt">AMD_performance_monitor</a> extension.
 * 
 * <p>This extension enables the capture and reporting of performance monitors. Performance monitors contain groups of counters which hold arbitrary counted
 * data. Typically, the counters hold information on performance-related counters in the underlying hardware. The extension is general enough to allow the
 * implementation to choose which counters to expose and pick the data type and range of the counters. The extension also allows counting to start and end
 * on arbitrary boundaries during rendering.</p>
 */
public class AMDPerformanceMonitor {

    static { GL.initialize(); }

    /** Accepted by the {@code pame} parameter of GetPerfMonitorCounterInfoAMD. */
    public static final int
        GL_COUNTER_TYPE_AMD  = 0x8BC0,
        GL_COUNTER_RANGE_AMD = 0x8BC1;

    /** Returned as a valid value in {@code data} parameter of GetPerfMonitorCounterInfoAMD if {@code pname} = COUNTER_TYPE_AMD. */
    public static final int
        GL_UNSIGNED_INT64_AMD = 0x8BC2,
        GL_PERCENTAGE_AMD     = 0x8BC3;

    /** Accepted by the {@code pname} parameter of GetPerfMonitorCounterDataAMD. */
    public static final int
        GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4,
        GL_PERFMON_RESULT_SIZE_AMD      = 0x8BC5,
        GL_PERFMON_RESULT_AMD           = 0x8BC6;

    protected AMDPerformanceMonitor() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetPerfMonitorGroupsAMD ] ---

    public static native void nglGetPerfMonitorGroupsAMD(long numGroups, int groupsSize, long groups);

    public static void glGetPerfMonitorGroupsAMD(@Nullable @NativeType("GLint *") IntBuffer numGroups, @Nullable @NativeType("GLuint *") IntBuffer groups) {
        if (CHECKS) {
            checkSafe(numGroups, 1);
        }
        nglGetPerfMonitorGroupsAMD(memAddressSafe(numGroups), remainingSafe(groups), memAddressSafe(groups));
    }

    // --- [ glGetPerfMonitorCountersAMD ] ---

    public static native void nglGetPerfMonitorCountersAMD(int group, long numCounters, long maxActiveCounters, int counterSize, long counters);

    public static void glGetPerfMonitorCountersAMD(@NativeType("GLuint") int group, @NativeType("GLint *") IntBuffer numCounters, @NativeType("GLint *") IntBuffer maxActiveCounters, @NativeType("GLuint *") IntBuffer counters) {
        if (CHECKS) {
            check(numCounters, 1);
            check(maxActiveCounters, 1);
        }
        nglGetPerfMonitorCountersAMD(group, memAddress(numCounters), memAddress(maxActiveCounters), counters.remaining(), memAddress(counters));
    }

    // --- [ glGetPerfMonitorGroupStringAMD ] ---

    public static native void nglGetPerfMonitorGroupStringAMD(int group, int bufSize, long length, long groupString);

    public static void glGetPerfMonitorGroupStringAMD(@NativeType("GLuint") int group, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer groupString) {
        if (CHECKS) {
            check(length, 1);
        }
        nglGetPerfMonitorGroupStringAMD(group, groupString.remaining(), memAddress(length), memAddress(groupString));
    }

    // --- [ glGetPerfMonitorCounterStringAMD ] ---

    public static native void nglGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, long length, long counterString);

    public static void glGetPerfMonitorCounterStringAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @Nullable @NativeType("GLsizei *") IntBuffer length, @Nullable @NativeType("GLchar *") ByteBuffer counterString) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetPerfMonitorCounterStringAMD(group, counter, remainingSafe(counterString), memAddressSafe(length), memAddressSafe(counterString));
    }

    // --- [ glGetPerfMonitorCounterInfoAMD ] ---

    public static native void nglGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, long data);

    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 4);
        }
        nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
    }

    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") IntBuffer data) {
        if (CHECKS) {
            check(data, 4 >> 2);
        }
        nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
    }

    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 4 >> 2);
        }
        nglGetPerfMonitorCounterInfoAMD(group, counter, pname, memAddress(data));
    }

    // --- [ glGenPerfMonitorsAMD ] ---

    public static native void nglGenPerfMonitorsAMD(int n, long monitors);

    public static void glGenPerfMonitorsAMD(@NativeType("GLuint *") IntBuffer monitors) {
        nglGenPerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
    }

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

    public static native void nglDeletePerfMonitorsAMD(int n, long monitors);

    public static void glDeletePerfMonitorsAMD(@NativeType("GLuint *") IntBuffer monitors) {
        nglDeletePerfMonitorsAMD(monitors.remaining(), memAddress(monitors));
    }

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

    public static native void nglSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, long counterList);

    public static void glSelectPerfMonitorCountersAMD(@NativeType("GLuint") int monitor, @NativeType("GLboolean") boolean enable, @NativeType("GLuint") int group, @NativeType("GLuint *") IntBuffer counterList) {
        nglSelectPerfMonitorCountersAMD(monitor, enable, group, counterList.remaining(), memAddress(counterList));
    }

    // --- [ glBeginPerfMonitorAMD ] ---

    public static native void glBeginPerfMonitorAMD(@NativeType("GLuint") int monitor);

    // --- [ glEndPerfMonitorAMD ] ---

    public static native void glEndPerfMonitorAMD(@NativeType("GLuint") int monitor);

    // --- [ glGetPerfMonitorCounterDataAMD ] ---

    public static native void nglGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, long data, long bytesWritten);

    public static void glGetPerfMonitorCounterDataAMD(@NativeType("GLuint") int monitor, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer data, @Nullable @NativeType("GLint *") IntBuffer bytesWritten) {
        if (CHECKS) {
            checkSafe(bytesWritten, 1);
        }
        nglGetPerfMonitorCounterDataAMD(monitor, pname, data.remaining(), memAddress(data), memAddressSafe(bytesWritten));
    }

    /** Array version of: {@link #glGetPerfMonitorGroupsAMD GetPerfMonitorGroupsAMD} */
    public static void glGetPerfMonitorGroupsAMD(@Nullable @NativeType("GLint *") int[] numGroups, @Nullable @NativeType("GLuint *") int[] groups) {
        long __functionAddress = GL.getICD().glGetPerfMonitorGroupsAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numGroups, 1);
        }
        callPPV(numGroups, lengthSafe(groups), groups, __functionAddress);
    }

    /** Array version of: {@link #glGetPerfMonitorCountersAMD GetPerfMonitorCountersAMD} */
    public static void glGetPerfMonitorCountersAMD(@NativeType("GLuint") int group, @NativeType("GLint *") int[] numCounters, @NativeType("GLint *") int[] maxActiveCounters, @NativeType("GLuint *") int[] counters) {
        long __functionAddress = GL.getICD().glGetPerfMonitorCountersAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(numCounters, 1);
            check(maxActiveCounters, 1);
        }
        callPPPV(group, numCounters, maxActiveCounters, counters.length, counters, __functionAddress);
    }

    /** Array version of: {@link #glGetPerfMonitorGroupStringAMD GetPerfMonitorGroupStringAMD} */
    public static void glGetPerfMonitorGroupStringAMD(@NativeType("GLuint") int group, @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer groupString) {
        long __functionAddress = GL.getICD().glGetPerfMonitorGroupStringAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(length, 1);
        }
        callPPV(group, groupString.remaining(), length, memAddress(groupString), __functionAddress);
    }

    /** Array version of: {@link #glGetPerfMonitorCounterStringAMD GetPerfMonitorCounterStringAMD} */
    public static void glGetPerfMonitorCounterStringAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @Nullable @NativeType("GLsizei *") int[] length, @Nullable @NativeType("GLchar *") ByteBuffer counterString) {
        long __functionAddress = GL.getICD().glGetPerfMonitorCounterStringAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(group, counter, remainingSafe(counterString), length, memAddressSafe(counterString), __functionAddress);
    }

    /** Array version of: {@link #glGetPerfMonitorCounterInfoAMD GetPerfMonitorCounterInfoAMD} */
    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glGetPerfMonitorCounterInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4 >> 2);
        }
        callPV(group, counter, pname, data, __functionAddress);
    }

    /** Array version of: {@link #glGetPerfMonitorCounterInfoAMD GetPerfMonitorCounterInfoAMD} */
    public static void glGetPerfMonitorCounterInfoAMD(@NativeType("GLuint") int group, @NativeType("GLuint") int counter, @NativeType("GLenum") int pname, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glGetPerfMonitorCounterInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4 >> 2);
        }
        callPV(group, counter, pname, data, __functionAddress);
    }

    /** Array version of: {@link #glGenPerfMonitorsAMD GenPerfMonitorsAMD} */
    public static void glGenPerfMonitorsAMD(@NativeType("GLuint *") int[] monitors) {
        long __functionAddress = GL.getICD().glGenPerfMonitorsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(monitors.length, monitors, __functionAddress);
    }

    /** Array version of: {@link #glDeletePerfMonitorsAMD DeletePerfMonitorsAMD} */
    public static void glDeletePerfMonitorsAMD(@NativeType("GLuint *") int[] monitors) {
        long __functionAddress = GL.getICD().glDeletePerfMonitorsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(monitors.length, monitors, __functionAddress);
    }

    /** Array version of: {@link #glSelectPerfMonitorCountersAMD SelectPerfMonitorCountersAMD} */
    public static void glSelectPerfMonitorCountersAMD(@NativeType("GLuint") int monitor, @NativeType("GLboolean") boolean enable, @NativeType("GLuint") int group, @NativeType("GLuint *") int[] counterList) {
        long __functionAddress = GL.getICD().glSelectPerfMonitorCountersAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(monitor, enable, group, counterList.length, counterList, __functionAddress);
    }

    /** Array version of: {@link #glGetPerfMonitorCounterDataAMD GetPerfMonitorCounterDataAMD} */
    public static void glGetPerfMonitorCounterDataAMD(@NativeType("GLuint") int monitor, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] data, @Nullable @NativeType("GLint *") int[] bytesWritten) {
        long __functionAddress = GL.getICD().glGetPerfMonitorCounterDataAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(bytesWritten, 1);
        }
        callPPV(monitor, pname, data.length, data, bytesWritten, __functionAddress);
    }

}