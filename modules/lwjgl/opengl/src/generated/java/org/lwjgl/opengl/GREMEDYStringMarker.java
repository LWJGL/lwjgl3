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

public class GREMEDYStringMarker {

    static { GL.initialize(); }

    protected GREMEDYStringMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ glStringMarkerGREMEDY ] ---

    /** {@code void glStringMarkerGREMEDY(GLsizei len, GLchar const * string)} */
    public static native void nglStringMarkerGREMEDY(int len, long string);

    /** {@code void glStringMarkerGREMEDY(GLsizei len, GLchar const * string)} */
    public static void glStringMarkerGREMEDY(@NativeType("GLchar const *") ByteBuffer string) {
        nglStringMarkerGREMEDY(string.remaining(), memAddress(string));
    }

    /** {@code void glStringMarkerGREMEDY(GLsizei len, GLchar const * string)} */
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