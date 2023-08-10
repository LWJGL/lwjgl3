/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_buffer_sub_data.txt">SOFT_buffer_sub_data</a> extension.
 * 
 * <p>This extension allows an application to modify a section of buffered sample data while the buffer is in use.</p>
 */
public class SOFTBufferSubData {

    /** Accepted by the {@code paramName} parameter of {@link AL10#alGetSourceiv GetSourceiv} and {@link AL10#alGetSourcefv GetSourcefv}. */
    public static final int
        AL_BYTE_RW_OFFSETS_SOFT   = 0x1031,
        AL_SAMPLE_RW_OFFSETS_SOFT = 0x1032;

    protected SOFTBufferSubData() {
        throw new UnsupportedOperationException();
    }

    // --- [ alBufferSubDataSOFT ] ---

    public static void nalBufferSubDataSOFT(int buffer, int format, long data, int offset, int length) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, offset, length, __functionAddress);
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ByteBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining());
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ShortBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining() << 1);
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") IntBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining() << 2);
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") FloatBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining() << 2);
    }

    /** Array version of: {@link #alBufferSubDataSOFT BufferSubDataSOFT} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") short[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, offset, data.length << 1, __functionAddress);
    }

    /** Array version of: {@link #alBufferSubDataSOFT BufferSubDataSOFT} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") int[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, offset, data.length << 2, __functionAddress);
    }

    /** Array version of: {@link #alBufferSubDataSOFT BufferSubDataSOFT} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") float[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, offset, data.length << 2, __functionAddress);
    }

}