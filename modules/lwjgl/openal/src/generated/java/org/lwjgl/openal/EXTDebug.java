/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/EXT_debug.txt">EXT_debug</a> extension.
 * 
 * <p>This extension adds functionality to aid application development and debugging. The new functionality allows an application to receive messages for
 * events related to errors, use of deprecated or undefined behavior, and other pertinent library and device behavior.</p>
 * 
 * <p>The message "stream" can also be annotated with custom messages, as well as group together events that occur within set segments of the application's
 * calls to the AL.</p>
 * 
 * <p>Additionally, an application can label individual objects (sources, buffers, etc) with custom names. This allows an application to textually identify
 * what each object is, as necessary for debugging.</p>
 * 
 * <p>The interface is heavily based on {@code GL_KHR_debug}, so developers familiar with that API should find this very familiar.</p>
 */
public class EXTDebug {

    /** Accepted as an attribute to {@link ALC10#alcCreateContext CreateContext}. */
    public static final int ALC_CONTEXT_FLAGS_EXT = 0x19CF;

    /** Accepted as a bitwise-or'd value for the {@link #AL_CONTEXT_FLAGS_EXT CONTEXT_FLAGS_EXT} context creation attribute value. */
    public static final int ALC_CONTEXT_DEBUG_BIT_EXT = 0x1;

    /** Accepted as the {@code pname} parameter of alGetInteger[v]. */
    public static final int AL_CONTEXT_FLAGS_EXT = 0x19CF;

    /** Returned by {@code alGetInteger[v]} when {@code pname} is {@link #AL_CONTEXT_FLAGS_EXT CONTEXT_FLAGS_EXT}. */
    public static final int AL_CONTEXT_DEBUG_BIT_EXT = 0x1;

    /** Accepted as the {@code target} parameter of {@link AL10#alEnable Enable}, {@link AL10#alDisable Disable}, and {@link AL10#alIsEnabled IsEnabled}. */
    public static final int AL_DEBUG_OUTPUT_EXT = 0x19B2;

    /** Accepted as the {@code pname} parameter of {@link #alGetPointerEXT GetPointerEXT} and {@link #alGetPointervEXT GetPointervEXT}. */
    public static final int
        AL_DEBUG_CALLBACK_FUNCTION_EXT   = 0x19B3,
        AL_DEBUG_CALLBACK_USER_PARAM_EXT = 0x19B4;

    /**
     * Accepted or provided by the {@code source} parameter of {@link #alDebugMessageControlEXT DebugMessageControlEXT}, {@link #alDebugMessageInsertEXT DebugMessageInsertEXT}, and {@code ALDEBUGPROCEXT}, and returned
     * by the {@code sources} parameter of {@link #alGetDebugMessageLogEXT GetDebugMessageLogEXT}.
     */
    public static final int
        AL_DEBUG_SOURCE_API_EXT          = 0x19B5,
        AL_DEBUG_SOURCE_AUDIO_SYSTEM_EXT = 0x19B6,
        AL_DEBUG_SOURCE_THIRD_PARTY_EXT  = 0x19B7,
        AL_DEBUG_SOURCE_APPLICATION_EXT  = 0x19B8,
        AL_DEBUG_SOURCE_OTHER_EXT        = 0x19B9;

    /**
     * Accepted or provided by the {@code type} parameter of {@link #alDebugMessageControlEXT DebugMessageControlEXT}, {@link #alDebugMessageInsertEXT DebugMessageInsertEXT}, and {@code ALDEBUGPROCEXT}, and returned by
     * the {@code types} parameter of {@link #alGetDebugMessageLogEXT GetDebugMessageLogEXT}.
     */
    public static final int
        AL_DEBUG_TYPE_ERROR_EXT               = 0x19BA,
        AL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_EXT = 0x19BB,
        AL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_EXT  = 0x19BC,
        AL_DEBUG_TYPE_PORTABILITY_EXT         = 0x19BD,
        AL_DEBUG_TYPE_PERFORMANCE_EXT         = 0x19BE,
        AL_DEBUG_TYPE_MARKER_EXT              = 0x19BF,
        AL_DEBUG_TYPE_OTHER_EXT               = 0x19C2;

    /**
     * Accepted or provided by the {@code type} parameter of {@link #alDebugMessageControlEXT DebugMessageControlEXT} and {@code ALDEBUGPROCEXT}, and returned by the {@code types} parameter
     * of {@link #alGetDebugMessageLogEXT GetDebugMessageLogEXT}.
     */
    public static final int
        AL_DEBUG_TYPE_PUSH_GROUP_EXT = 0x19C0,
        AL_DEBUG_TYPE_POP_GROUP_EXT  = 0x19C1;

    /**
     * Accepted or provided by the {@code severity} parameter of {@link #alDebugMessageControlEXT DebugMessageControlEXT}, {@link #alDebugMessageInsertEXT DebugMessageInsertEXT}, and {@code ALDEBUGPROCEXT}, and returned
     * by the {@code severities} parameter of {@link #alGetDebugMessageLogEXT GetDebugMessageLogEXT}.
     */
    public static final int
        AL_DEBUG_SEVERITY_HIGH_EXT         = 0x19C3,
        AL_DEBUG_SEVERITY_MEDIUM_EXT       = 0x19C4,
        AL_DEBUG_SEVERITY_LOW_EXT          = 0x19C5,
        AL_DEBUG_SEVERITY_NOTIFICATION_EXT = 0x19C6;

    /** Accepted as the {@code source}, {@code type}, and {@code severity} parameters of {@link #alDebugMessageControlEXT DebugMessageControlEXT}. */
    public static final int AL_DONT_CARE_EXT = 0x2;

    /** Accepted as the {@code pname} parameter of {@code alGetBoolean[v]}, {@code alGetInteger[v]}, {@code alGetFloat[v]}, and {@code alGetDouble[v]}. */
    public static final int
        AL_DEBUG_LOGGED_MESSAGES_EXT            = 0x19C7,
        AL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_EXT = 0x19C8,
        AL_MAX_DEBUG_MESSAGE_LENGTH_EXT         = 0x19C9,
        AL_MAX_DEBUG_LOGGED_MESSAGES_EXT        = 0x19CA,
        AL_MAX_DEBUG_GROUP_STACK_DEPTH_EXT      = 0x19CB,
        AL_MAX_LABEL_LENGTH_EXT                 = 0x19CC;

    /** Returned by {@link AL10#alGetError GetError}. */
    public static final int
        AL_STACK_OVERFLOW_EXT  = 0x19CD,
        AL_STACK_UNDERFLOW_EXT = 0x19CE;

    /** Accepted by the {@code identifier} parameter of {@link #alObjectLabelEXT ObjectLabelEXT} and {@link #alGetObjectLabelEXT GetObjectLabelEXT}. */
    public static final int
        AL_BUFFER_EXT = 0x1009,
        AL_SOURCE_EXT = 0x19D0;

    /** Accepted by the {@code identifier} parameter of {@link #alObjectLabelEXT ObjectLabelEXT} and {@link #alGetObjectLabelEXT GetObjectLabelEXT} if {@code ALC_EXT_EFX} is also supported. */
    public static final int
        AL_FILTER_EXT                = 0x19D1,
        AL_EFFECT_EXT                = 0x19D2,
        AL_AUXILIARY_EFFECT_SLOT_EXT = 0x19D3;

    protected EXTDebug() {
        throw new UnsupportedOperationException();
    }

    // --- [ alDebugMessageCallbackEXT ] ---

    public static void nalDebugMessageCallbackEXT(long callback, long userParam) {
        long __functionAddress = AL.getICD().alDebugMessageCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userParam, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDebugMessageCallbackEXT(@NativeType("ALDEBUGPROCEXT") @Nullable EXTDebugProcI callback, @NativeType("ALvoid *") long userParam) {
        nalDebugMessageCallbackEXT(memAddressSafe(callback), userParam);
    }

    // --- [ alDebugMessageCallbackDirectEXT ] ---

    public static void nalDebugMessageCallbackDirectEXT(long context, long callback, long userParam) {
        long __functionAddress = AL.getICD().alDebugMessageCallbackDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPV(context, callback, userParam, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDebugMessageCallbackDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALDEBUGPROCEXT") @Nullable EXTDebugProcI callback, @NativeType("ALvoid *") long userParam) {
        nalDebugMessageCallbackDirectEXT(context, memAddressSafe(callback), userParam);
    }

    // --- [ alDebugMessageInsertEXT ] ---

    public static void nalDebugMessageInsertEXT(int source, int type, int id, int severity, int length, long message) {
        long __functionAddress = AL.getICD().alDebugMessageInsertEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, type, id, severity, length, message, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDebugMessageInsertEXT(@NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALuint") int id, @NativeType("ALenum") int severity, @NativeType("ALchar const *") ByteBuffer message) {
        nalDebugMessageInsertEXT(source, type, id, severity, message.remaining(), memAddress(message));
    }

    @NativeType("ALvoid")
    public static void alDebugMessageInsertEXT(@NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALuint") int id, @NativeType("ALenum") int severity, @NativeType("ALchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nalDebugMessageInsertEXT(source, type, id, severity, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDebugMessageInsertDirectEXT ] ---

    public static void nalDebugMessageInsertDirectEXT(long context, int source, int type, int id, int severity, int length, long message) {
        long __functionAddress = AL.getICD().alDebugMessageInsertDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, type, id, severity, length, message, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDebugMessageInsertDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALuint") int id, @NativeType("ALenum") int severity, @NativeType("ALchar const *") ByteBuffer message) {
        nalDebugMessageInsertDirectEXT(context, source, type, id, severity, message.remaining(), memAddress(message));
    }

    @NativeType("ALvoid")
    public static void alDebugMessageInsertDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALuint") int id, @NativeType("ALenum") int severity, @NativeType("ALchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nalDebugMessageInsertDirectEXT(context, source, type, id, severity, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDebugMessageControlEXT ] ---

    public static void nalDebugMessageControlEXT(int source, int type, int severity, int count, long ids, boolean enable) {
        long __functionAddress = AL.getICD().alDebugMessageControlEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, type, severity, count, ids, enable, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDebugMessageControlEXT(@NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALenum") int severity, @NativeType("ALuint const *") @Nullable IntBuffer ids, @NativeType("ALboolean") boolean enable) {
        nalDebugMessageControlEXT(source, type, severity, remainingSafe(ids), memAddressSafe(ids), enable);
    }

    // --- [ alDebugMessageControlDirectEXT ] ---

    public static void nalDebugMessageControlDirectEXT(long context, int source, int type, int severity, int count, long ids, boolean enable) {
        long __functionAddress = AL.getICD().alDebugMessageControlDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, type, severity, count, ids, enable, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDebugMessageControlDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALenum") int severity, @NativeType("ALuint const *") @Nullable IntBuffer ids, @NativeType("ALboolean") boolean enable) {
        nalDebugMessageControlDirectEXT(context, source, type, severity, remainingSafe(ids), memAddressSafe(ids), enable);
    }

    // --- [ alPushDebugGroupEXT ] ---

    public static void nalPushDebugGroupEXT(int source, int id, int length, long message) {
        long __functionAddress = AL.getICD().alPushDebugGroupEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, id, length, message, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alPushDebugGroupEXT(@NativeType("ALenum") int source, @NativeType("ALuint") int id, @NativeType("ALchar const *") ByteBuffer message) {
        nalPushDebugGroupEXT(source, id, message.remaining(), memAddress(message));
    }

    @NativeType("ALvoid")
    public static void alPushDebugGroupEXT(@NativeType("ALenum") int source, @NativeType("ALuint") int id, @NativeType("ALchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nalPushDebugGroupEXT(source, id, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alPushDebugGroupDirectEXT ] ---

    public static void nalPushDebugGroupDirectEXT(long context, int source, int id, int length, long message) {
        long __functionAddress = AL.getICD().alPushDebugGroupDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, id, length, message, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alPushDebugGroupDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALuint") int id, @NativeType("ALchar const *") ByteBuffer message) {
        nalPushDebugGroupDirectEXT(context, source, id, message.remaining(), memAddress(message));
    }

    @NativeType("ALvoid")
    public static void alPushDebugGroupDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALuint") int id, @NativeType("ALchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nalPushDebugGroupDirectEXT(context, source, id, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alPopDebugGroupEXT ] ---

    @NativeType("ALvoid")
    public static void alPopDebugGroupEXT() {
        long __functionAddress = AL.getICD().alPopDebugGroupEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ alPopDebugGroupDirectEXT ] ---

    @NativeType("ALvoid")
    public static void alPopDebugGroupDirectEXT(@NativeType("ALCcontext *") long context) {
        long __functionAddress = AL.getICD().alPopDebugGroupDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ alGetDebugMessageLogEXT ] ---

    public static int nalGetDebugMessageLogEXT(int count, int logBufSize, long sources, long types, long ids, long severities, long lengths, long logBuf) {
        long __functionAddress = AL.getICD().alGetDebugMessageLogEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPPPPPI(count, logBufSize, sources, types, ids, severities, lengths, logBuf, __functionAddress);
    }

    @NativeType("ALuint")
    public static int alGetDebugMessageLogEXT(@NativeType("ALenum *") @Nullable IntBuffer sources, @NativeType("ALenum *") @Nullable IntBuffer types, @NativeType("ALuint *") @Nullable IntBuffer ids, @NativeType("ALenum *") @Nullable IntBuffer severities, @NativeType("ALsizei *") @Nullable IntBuffer lengths, @NativeType("ALchar *") @Nullable ByteBuffer logBuf) {
        if (CHECKS) {
            checkSafe(types, remainingSafe(sources));
            checkSafe(ids, remainingSafe(sources));
            checkSafe(severities, remainingSafe(sources));
            checkSafe(lengths, remainingSafe(sources));
        }
        return nalGetDebugMessageLogEXT(remainingSafe(sources), remainingSafe(logBuf), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(logBuf));
    }

    // --- [ alGetDebugMessageLogDirectEXT ] ---

    public static int nalGetDebugMessageLogDirectEXT(long context, int count, int logBufSize, long sources, long types, long ids, long severities, long lengths, long logBuf) {
        long __functionAddress = AL.getICD().alGetDebugMessageLogDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePPPPPPPI(context, count, logBufSize, sources, types, ids, severities, lengths, logBuf, __functionAddress);
    }

    @NativeType("ALuint")
    public static int alGetDebugMessageLogDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum *") @Nullable IntBuffer sources, @NativeType("ALenum *") @Nullable IntBuffer types, @NativeType("ALuint *") @Nullable IntBuffer ids, @NativeType("ALenum *") @Nullable IntBuffer severities, @NativeType("ALsizei *") @Nullable IntBuffer lengths, @NativeType("ALchar *") @Nullable ByteBuffer logBuf) {
        if (CHECKS) {
            checkSafe(types, remainingSafe(sources));
            checkSafe(ids, remainingSafe(sources));
            checkSafe(severities, remainingSafe(sources));
            checkSafe(lengths, remainingSafe(sources));
        }
        return nalGetDebugMessageLogDirectEXT(context, remainingSafe(sources), remainingSafe(logBuf), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(logBuf));
    }

    // --- [ alObjectLabelEXT ] ---

    public static void nalObjectLabelEXT(int identifier, int name, int length, long label) {
        long __functionAddress = AL.getICD().alObjectLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(identifier, name, length, label, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alObjectLabelEXT(@NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALchar const *") ByteBuffer label) {
        nalObjectLabelEXT(identifier, name, label.remaining(), memAddress(label));
    }

    @NativeType("ALvoid")
    public static void alObjectLabelEXT(@NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALchar const *") CharSequence label) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nalObjectLabelEXT(identifier, name, labelEncodedLength, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alObjectLabelDirectEXT ] ---

    public static void nalObjectLabelDirectEXT(long context, int identifier, int name, int length, long label) {
        long __functionAddress = AL.getICD().alObjectLabelDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, identifier, name, length, label, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alObjectLabelDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALchar const *") ByteBuffer label) {
        nalObjectLabelDirectEXT(context, identifier, name, label.remaining(), memAddress(label));
    }

    @NativeType("ALvoid")
    public static void alObjectLabelDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALchar const *") CharSequence label) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nalObjectLabelDirectEXT(context, identifier, name, labelEncodedLength, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetObjectLabelEXT ] ---

    public static void nalGetObjectLabelEXT(int identifier, int name, int bufSize, long length, long label) {
        long __functionAddress = AL.getICD().alGetObjectLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(identifier, name, bufSize, length, label, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetObjectLabelEXT(@NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALsizei *") IntBuffer length, @NativeType("ALchar *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(length, 1);
        }
        nalGetObjectLabelEXT(identifier, name, remainingSafe(label), memAddress(length), memAddressSafe(label));
    }

    // --- [ alGetObjectLabelDirectEXT ] ---

    public static void nalGetObjectLabelDirectEXT(long context, int identifier, int name, int bufSize, long length, long label) {
        long __functionAddress = AL.getICD().alGetObjectLabelDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPV(context, identifier, name, bufSize, length, label, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetObjectLabelDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALsizei *") IntBuffer length, @NativeType("ALchar *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(length, 1);
        }
        nalGetObjectLabelDirectEXT(context, identifier, name, remainingSafe(label), memAddress(length), memAddressSafe(label));
    }

    // --- [ alGetPointerEXT ] ---

    @NativeType("ALvoid *")
    public static long alGetPointerEXT(@NativeType("ALenum") int pname) {
        long __functionAddress = AL.getICD().alGetPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(pname, __functionAddress);
    }

    // --- [ alGetPointerDirectEXT ] ---

    @NativeType("ALvoid *")
    public static long alGetPointerDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int pname) {
        long __functionAddress = AL.getICD().alGetPointerDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePP(context, pname, __functionAddress);
    }

    // --- [ alGetPointervEXT ] ---

    public static void nalGetPointervEXT(int pname, long values) {
        long __functionAddress = AL.getICD().alGetPointervEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(pname, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetPointervEXT(@NativeType("ALenum") int pname, @NativeType("ALvoid **") PointerBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetPointervEXT(pname, memAddress(values));
    }

    // --- [ alGetPointervDirectEXT ] ---

    public static void nalGetPointervDirectEXT(long context, int pname, long values) {
        long __functionAddress = AL.getICD().alGetPointervDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, pname, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetPointervDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int pname, @NativeType("ALvoid **") PointerBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetPointervDirectEXT(context, pname, memAddress(values));
    }

    /** Array version of: {@link #alDebugMessageControlEXT DebugMessageControlEXT} */
    @NativeType("ALvoid")
    public static void alDebugMessageControlEXT(@NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALenum") int severity, @NativeType("ALuint const *") int @Nullable [] ids, @NativeType("ALboolean") boolean enable) {
        long __functionAddress = AL.getICD().alDebugMessageControlEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, type, severity, lengthSafe(ids), ids, enable, __functionAddress);
    }

    /** Array version of: {@link #alDebugMessageControlDirectEXT} */
    @NativeType("ALvoid")
    public static void alDebugMessageControlDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALenum") int severity, @NativeType("ALuint const *") int @Nullable [] ids, @NativeType("ALboolean") boolean enable) {
        long __functionAddress = AL.getICD().alDebugMessageControlDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, type, severity, lengthSafe(ids), ids, enable, __functionAddress);
    }

    /** Array version of: {@link #alGetDebugMessageLogEXT GetDebugMessageLogEXT} */
    @NativeType("ALuint")
    public static int alGetDebugMessageLogEXT(@NativeType("ALenum *") int @Nullable [] sources, @NativeType("ALenum *") int @Nullable [] types, @NativeType("ALuint *") int @Nullable [] ids, @NativeType("ALenum *") int @Nullable [] severities, @NativeType("ALsizei *") int @Nullable [] lengths, @NativeType("ALchar *") @Nullable ByteBuffer logBuf) {
        long __functionAddress = AL.getICD().alGetDebugMessageLogEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(types, lengthSafe(sources));
            checkSafe(ids, lengthSafe(sources));
            checkSafe(severities, lengthSafe(sources));
            checkSafe(lengths, lengthSafe(sources));
        }
        return invokePPPPPPI(lengthSafe(sources), remainingSafe(logBuf), sources, types, ids, severities, lengths, memAddressSafe(logBuf), __functionAddress);
    }

    /** Array version of: {@link #alGetDebugMessageLogDirectEXT} */
    @NativeType("ALuint")
    public static int alGetDebugMessageLogDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum *") int @Nullable [] sources, @NativeType("ALenum *") int @Nullable [] types, @NativeType("ALuint *") int @Nullable [] ids, @NativeType("ALenum *") int @Nullable [] severities, @NativeType("ALsizei *") int @Nullable [] lengths, @NativeType("ALchar *") @Nullable ByteBuffer logBuf) {
        long __functionAddress = AL.getICD().alGetDebugMessageLogDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(types, lengthSafe(sources));
            checkSafe(ids, lengthSafe(sources));
            checkSafe(severities, lengthSafe(sources));
            checkSafe(lengths, lengthSafe(sources));
        }
        return invokePPPPPPPI(context, lengthSafe(sources), remainingSafe(logBuf), sources, types, ids, severities, lengths, memAddressSafe(logBuf), __functionAddress);
    }

    /** Array version of: {@link #alGetObjectLabelEXT GetObjectLabelEXT} */
    @NativeType("ALvoid")
    public static void alGetObjectLabelEXT(@NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALsizei *") int[] length, @NativeType("ALchar *") @Nullable ByteBuffer label) {
        long __functionAddress = AL.getICD().alGetObjectLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(length, 1);
        }
        invokePPV(identifier, name, remainingSafe(label), length, memAddressSafe(label), __functionAddress);
    }

    /** Array version of: {@link #alGetObjectLabelDirectEXT} */
    @NativeType("ALvoid")
    public static void alGetObjectLabelDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALsizei *") int[] length, @NativeType("ALchar *") @Nullable ByteBuffer label) {
        long __functionAddress = AL.getICD().alGetObjectLabelDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(length, 1);
        }
        invokePPPV(context, identifier, name, remainingSafe(label), length, memAddressSafe(label), __functionAddress);
    }

}