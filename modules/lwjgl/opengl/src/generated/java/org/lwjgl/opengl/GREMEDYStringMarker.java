/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/GREMEDY/GREMEDY_string_marker.txt">GREMEDY_string_marker</a> extension.
 * 
 * <p>This extension defines a mechanism to insert textual markers into the OpenGL stream.</p>
 * 
 * <p>When debugging or profiling an OpenGL application some of the most important tools are stream loggers, which just output a list of the called OpenGL
 * commands, and profilers, which show at which points the pipeline is bottlenecked for a given part of the frame. The problem in using these is that
 * there is a definite loss of information between the application and the used debugger/profiler. The application generally has a pretty good idea what
 * is rendered when (e.g. rendering background, landscape, building, players, particle effects, bullets etc.), but the debugger/profiler only sees the
 * OpenGL stream. To analyze the stream developers have to guess what is done when by following the program code and the log output in parallel, which can
 * get difficult for systems that restructure their internal pipeline or do lazy changes.</p>
 * 
 * <p>This extension is really only useful for these debuggers and profilers, and not for actual drivers. In fact, it is not expected that any standard
 * driver would ever implement this extension. The main point of having this extension is to allow applications to have a clean way of accessing this
 * functionality only when they are run under the control of a debugger/profiler, without having to recompile or change the application source code.</p>
 */
public class GREMEDYStringMarker {

    static { GL.initialize(); }

    protected GREMEDYStringMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ glStringMarkerGREMEDY ] ---

    /**
     * Unsafe version of: {@link #glStringMarkerGREMEDY StringMarkerGREMEDY}
     *
     * @param len the length of the array. If {@code string} is null-terminated, {@code len} should not include the terminator. If {@code len} is 0, then the string
     *            is assumed to be null-terminated.
     */
    public static native void nglStringMarkerGREMEDY(int len, long string);

    /**
     * Can be used to insert arbitrary marker strings into the command stream that can be recorded by appropriate debugging tools / profiling tools / drivers.
     * They have no influence on the rendered image or the OpenGL state.
     *
     * @param string a pointer to the array of bytes representing the marker being inserted, which need not be null-terminated
     */
    public static void glStringMarkerGREMEDY(@NativeType("GLchar const *") ByteBuffer string) {
        nglStringMarkerGREMEDY(string.remaining(), memAddress(string));
    }

    /**
     * Can be used to insert arbitrary marker strings into the command stream that can be recorded by appropriate debugging tools / profiling tools / drivers.
     * They have no influence on the rendered image or the OpenGL state.
     *
     * @param string a pointer to the array of bytes representing the marker being inserted, which need not be null-terminated
     */
    public static void glStringMarkerGREMEDY(@NativeType("GLchar const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nglStringMarkerGREMEDY(stringEncodedLength, stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}