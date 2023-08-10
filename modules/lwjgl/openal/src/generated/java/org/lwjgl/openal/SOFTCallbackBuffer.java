/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_callback_buffer.txt">SOFT_callback_buffer</a> extension.
 * 
 * <p>This extension provides a mechanism for applications to provide sample data to the audio device in real-time.</p>
 * 
 * <p>Standard OpenAL sources can read samples from a pre-loaded static buffer, or from a queue of prepared buffers that can be fed in over time. In both
 * cases, an application needs to prepare all or some of the audio samples ahead of time to ensure proper continuous playback. A callback mechanism allows
 * applications to generate audio as needed, without having to prepare samples ahead of time, and to implement their own streaming interface instead of
 * having to fill, queue, and manage multiple OpenAL buffers per stream.</p>
 */
public class SOFTCallbackBuffer {

    /** Accepted as the {@code param} parameter of {@link #alGetBufferPtrSOFT GetBufferPtrSOFT} and {@link #alGetBufferPtrvSOFT GetBufferPtrvSOFT}. */
    public static final int
        AL_BUFFER_CALLBACK_FUNCTION_SOFT   = 0x19A0,
        AL_BUFFER_CALLBACK_USER_PARAM_SOFT = 0x19A1;

    protected SOFTCallbackBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ alBufferCallbackSOFT ] ---

    /** Unsafe version of: {@link #alBufferCallbackSOFT BufferCallbackSOFT} */
    public static void nalBufferCallbackSOFT(int buffer, int format, int freq, long callback, long userptr) {
        long __functionAddress = AL.getICD().alBufferCallbackSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(userptr);
        }
        invokePPV(buffer, format, freq, callback, userptr, __functionAddress);
    }

    /**
     * Instead of storing sample data, a buffer may be given a callback function which will be invoked when the source it's attached to needs more samples to
     * mix. To specify a callback for a buffer, use {@code alBufferCallbackSOFT}.
     * 
     * <p>After a successful call, any sample data that was stored in the buffer is removed.</p>
     * 
     * <p>A buffer with a callback cannot be queued onto a streaming source, and it can only be set on one static source at a time. Attempting to queue such a
     * buffer on a source, or attempting to set it on a source while it's already on one, will generate an {@link AL10#AL_INVALID_OPERATION INVALID_OPERATION} error.</p>
     * 
     * <p>A subsequent successful call to {@link AL10#alBufferData BufferData} will remove the callback from the buffer, and make it a normal non-callback buffer.</p>
     *
     * @param format  the sample format that will be expected from the callback
     * @param freq    the base sample rate the samples will play at
     * @param userptr stored with the {@code callback} pointer. Any data it references is not copied
     */
    @NativeType("ALvoid")
    public static void alBufferCallbackSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALsizei") int freq, @NativeType("ALBUFFERCALLBACKTYPESOFT") SOFTCallbackBufferTypeI callback, @NativeType("ALvoid *") long userptr) {
        nalBufferCallbackSOFT(buffer, format, freq, callback.address(), userptr);
    }

    // --- [ alGetBufferPtrSOFT ] ---

    public static void nalGetBufferPtrSOFT(int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, param, ptr, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferPtrSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (CHECKS) {
            check(ptr, 1);
        }
        nalGetBufferPtrSOFT(buffer, param, memAddress(ptr));
    }

    @NativeType("ALvoid")
    public static long alGetBufferPtrSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer ptr = stack.callocPointer(1);
            nalGetBufferPtrSOFT(buffer, param, memAddress(ptr));
            return ptr.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetBuffer3PtrSOFT ] ---

    public static void nalGetBuffer3PtrSOFT(int buffer, int param, long ptr0, long ptr1, long ptr2) {
        long __functionAddress = AL.getICD().alGetBuffer3PtrSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(buffer, param, ptr0, ptr1, ptr2, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3PtrSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr0, @NativeType("ALvoid **") PointerBuffer ptr1, @NativeType("ALvoid **") PointerBuffer ptr2) {
        if (CHECKS) {
            check(ptr0, 1);
            check(ptr1, 1);
            check(ptr2, 1);
        }
        nalGetBuffer3PtrSOFT(buffer, param, memAddress(ptr0), memAddress(ptr1), memAddress(ptr2));
    }

    // --- [ alGetBufferPtrvSOFT ] ---

    public static void nalGetBufferPtrvSOFT(int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrvSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, param, ptr, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferPtrvSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (CHECKS) {
            check(ptr, 1);
        }
        nalGetBufferPtrvSOFT(buffer, param, memAddress(ptr));
    }

}