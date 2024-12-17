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

public class EXTDebugMarker {

    static { GL.initialize(); }

    protected EXTDebugMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ glInsertEventMarkerEXT ] ---

    /** {@code void glInsertEventMarkerEXT(GLsizei length, GLchar const * marker)} */
    public static native void nglInsertEventMarkerEXT(int length, long marker);

    /** {@code void glInsertEventMarkerEXT(GLsizei length, GLchar const * marker)} */
    public static void glInsertEventMarkerEXT(@NativeType("GLchar const *") ByteBuffer marker) {
        nglInsertEventMarkerEXT(marker.remaining(), memAddress(marker));
    }

    /** {@code void glInsertEventMarkerEXT(GLsizei length, GLchar const * marker)} */
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

    /** {@code void glPushGroupMarkerEXT(GLsizei length, GLchar const * marker)} */
    public static native void nglPushGroupMarkerEXT(int length, long marker);

    /** {@code void glPushGroupMarkerEXT(GLsizei length, GLchar const * marker)} */
    public static void glPushGroupMarkerEXT(@NativeType("GLchar const *") ByteBuffer marker) {
        nglPushGroupMarkerEXT(marker.remaining(), memAddress(marker));
    }

    /** {@code void glPushGroupMarkerEXT(GLsizei length, GLchar const * marker)} */
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

    /** {@code void glPopGroupMarkerEXT(void)} */
    public static native void glPopGroupMarkerEXT();

}