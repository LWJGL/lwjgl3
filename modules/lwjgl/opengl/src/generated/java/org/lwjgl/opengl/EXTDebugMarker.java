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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_debug_marker.txt">EXT_debug_marker</a> extension.
 * 
 * <p>This extension defines a mechanism for OpenGL and OpenGL ES applications to annotate their command stream with markers for discrete events and groups
 * of commands using descriptive text markers.</p>
 * 
 * <p>When profiling or debugging such an application within a debugger or profiler it is difficult to relate the commands within the command stream to the
 * elements of the scene or parts of the program code to which they correspond. Markers help obviate this by allowing applications to specify this link.</p>
 * 
 * <p>The intended purpose of this is purely to improve the user experience within OpenGL and OpenGL ES development tools.</p>
 */
public class EXTDebugMarker {

    static { GL.initialize(); }

    protected EXTDebugMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ glInsertEventMarkerEXT ] ---

    public static native void nglInsertEventMarkerEXT(int length, long marker);

    public static void glInsertEventMarkerEXT(@NativeType("GLchar const *") ByteBuffer marker) {
        nglInsertEventMarkerEXT(marker.remaining(), memAddress(marker));
    }

    public static void glInsertEventMarkerEXT(@NativeType("GLchar const *") CharSequence marker) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int markerEncodedLength = stack.nUTF8(marker, false);
            long markerEncoded = stack.getPointerAddress();
            nglInsertEventMarkerEXT(markerEncodedLength, markerEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glPushGroupMarkerEXT ] ---

    public static native void nglPushGroupMarkerEXT(int length, long marker);

    public static void glPushGroupMarkerEXT(@NativeType("GLchar const *") ByteBuffer marker) {
        nglPushGroupMarkerEXT(marker.remaining(), memAddress(marker));
    }

    public static void glPushGroupMarkerEXT(@NativeType("GLchar const *") CharSequence marker) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int markerEncodedLength = stack.nUTF8(marker, false);
            long markerEncoded = stack.getPointerAddress();
            nglPushGroupMarkerEXT(markerEncodedLength, markerEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glPopGroupMarkerEXT ] ---

    public static native void glPopGroupMarkerEXT();

}