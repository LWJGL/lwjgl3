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

public class EXTDebug {

    public static final int ALC_CONTEXT_FLAGS_EXT = 0x19CF;

    public static final int ALC_CONTEXT_DEBUG_BIT_EXT = 0x1;

    public static final int AL_CONTEXT_FLAGS_EXT = 0x19CF;

    public static final int AL_CONTEXT_DEBUG_BIT_EXT = 0x1;

    public static final int AL_DEBUG_OUTPUT_EXT = 0x19B2;

    public static final int
        AL_DEBUG_CALLBACK_FUNCTION_EXT   = 0x19B3,
        AL_DEBUG_CALLBACK_USER_PARAM_EXT = 0x19B4;

    public static final int
        AL_DEBUG_SOURCE_API_EXT          = 0x19B5,
        AL_DEBUG_SOURCE_AUDIO_SYSTEM_EXT = 0x19B6,
        AL_DEBUG_SOURCE_THIRD_PARTY_EXT  = 0x19B7,
        AL_DEBUG_SOURCE_APPLICATION_EXT  = 0x19B8,
        AL_DEBUG_SOURCE_OTHER_EXT        = 0x19B9;

    public static final int
        AL_DEBUG_TYPE_ERROR_EXT               = 0x19BA,
        AL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_EXT = 0x19BB,
        AL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_EXT  = 0x19BC,
        AL_DEBUG_TYPE_PORTABILITY_EXT         = 0x19BD,
        AL_DEBUG_TYPE_PERFORMANCE_EXT         = 0x19BE,
        AL_DEBUG_TYPE_MARKER_EXT              = 0x19BF,
        AL_DEBUG_TYPE_OTHER_EXT               = 0x19C2;

    public static final int
        AL_DEBUG_TYPE_PUSH_GROUP_EXT = 0x19C0,
        AL_DEBUG_TYPE_POP_GROUP_EXT  = 0x19C1;

    public static final int
        AL_DEBUG_SEVERITY_HIGH_EXT         = 0x19C3,
        AL_DEBUG_SEVERITY_MEDIUM_EXT       = 0x19C4,
        AL_DEBUG_SEVERITY_LOW_EXT          = 0x19C5,
        AL_DEBUG_SEVERITY_NOTIFICATION_EXT = 0x19C6;

    public static final int AL_DONT_CARE_EXT = 0x2;

    public static final int
        AL_DEBUG_LOGGED_MESSAGES_EXT            = 0x19C7,
        AL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_EXT = 0x19C8,
        AL_MAX_DEBUG_MESSAGE_LENGTH_EXT         = 0x19C9,
        AL_MAX_DEBUG_LOGGED_MESSAGES_EXT        = 0x19CA,
        AL_MAX_DEBUG_GROUP_STACK_DEPTH_EXT      = 0x19CB,
        AL_MAX_LABEL_LENGTH_EXT                 = 0x19CC;

    public static final int
        AL_STACK_OVERFLOW_EXT  = 0x19CD,
        AL_STACK_UNDERFLOW_EXT = 0x19CE;

    public static final int
        AL_BUFFER_EXT = 0x1009,
        AL_SOURCE_EXT = 0x19D0;

    public static final int
        AL_FILTER_EXT                = 0x19D1,
        AL_EFFECT_EXT                = 0x19D2,
        AL_AUXILIARY_EFFECT_SLOT_EXT = 0x19D3;

    protected EXTDebug() {
        throw new UnsupportedOperationException();
    }

    // --- [ alDebugMessageCallbackEXT ] ---

    /** {@code ALvoid alDebugMessageCallbackEXT(ALDEBUGPROCEXT callback, ALvoid * userParam)} */
    public static void nalDebugMessageCallbackEXT(long callback, long userParam) {
        long __functionAddress = AL.getICD().alDebugMessageCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userParam, __functionAddress);
    }

    /** {@code ALvoid alDebugMessageCallbackEXT(ALDEBUGPROCEXT callback, ALvoid * userParam)} */
    @NativeType("ALvoid")
    public static void alDebugMessageCallbackEXT(@NativeType("ALDEBUGPROCEXT") @Nullable EXTDebugProcI callback, @NativeType("ALvoid *") long userParam) {
        nalDebugMessageCallbackEXT(memAddressSafe(callback), userParam);
    }

    // --- [ alDebugMessageCallbackDirectEXT ] ---

    /** {@code ALvoid alDebugMessageCallbackDirectEXT(ALCcontext * context, ALDEBUGPROCEXT callback, ALvoid * userParam)} */
    public static void nalDebugMessageCallbackDirectEXT(long context, long callback, long userParam) {
        long __functionAddress = AL.getICD().alDebugMessageCallbackDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPV(context, callback, userParam, __functionAddress);
    }

    /** {@code ALvoid alDebugMessageCallbackDirectEXT(ALCcontext * context, ALDEBUGPROCEXT callback, ALvoid * userParam)} */
    @NativeType("ALvoid")
    public static void alDebugMessageCallbackDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALDEBUGPROCEXT") @Nullable EXTDebugProcI callback, @NativeType("ALvoid *") long userParam) {
        nalDebugMessageCallbackDirectEXT(context, memAddressSafe(callback), userParam);
    }

    // --- [ alDebugMessageInsertEXT ] ---

    /** {@code ALvoid alDebugMessageInsertEXT(ALenum source, ALenum type, ALuint id, ALenum severity, ALsizei length, ALchar const * message)} */
    public static void nalDebugMessageInsertEXT(int source, int type, int id, int severity, int length, long message) {
        long __functionAddress = AL.getICD().alDebugMessageInsertEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, type, id, severity, length, message, __functionAddress);
    }

    /** {@code ALvoid alDebugMessageInsertEXT(ALenum source, ALenum type, ALuint id, ALenum severity, ALsizei length, ALchar const * message)} */
    @NativeType("ALvoid")
    public static void alDebugMessageInsertEXT(@NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALuint") int id, @NativeType("ALenum") int severity, @NativeType("ALchar const *") ByteBuffer message) {
        nalDebugMessageInsertEXT(source, type, id, severity, message.remaining(), memAddress(message));
    }

    /** {@code ALvoid alDebugMessageInsertEXT(ALenum source, ALenum type, ALuint id, ALenum severity, ALsizei length, ALchar const * message)} */
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

    /** {@code ALvoid alDebugMessageInsertDirectEXT(ALCcontext * context, ALenum source, ALenum type, ALuint id, ALenum severity, ALsizei length, ALchar const * message)} */
    public static void nalDebugMessageInsertDirectEXT(long context, int source, int type, int id, int severity, int length, long message) {
        long __functionAddress = AL.getICD().alDebugMessageInsertDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, type, id, severity, length, message, __functionAddress);
    }

    /** {@code ALvoid alDebugMessageInsertDirectEXT(ALCcontext * context, ALenum source, ALenum type, ALuint id, ALenum severity, ALsizei length, ALchar const * message)} */
    @NativeType("ALvoid")
    public static void alDebugMessageInsertDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALuint") int id, @NativeType("ALenum") int severity, @NativeType("ALchar const *") ByteBuffer message) {
        nalDebugMessageInsertDirectEXT(context, source, type, id, severity, message.remaining(), memAddress(message));
    }

    /** {@code ALvoid alDebugMessageInsertDirectEXT(ALCcontext * context, ALenum source, ALenum type, ALuint id, ALenum severity, ALsizei length, ALchar const * message)} */
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

    /** {@code ALvoid alDebugMessageControlEXT(ALenum source, ALenum type, ALenum severity, ALsizei count, ALuint const * ids, ALboolean enable)} */
    public static void nalDebugMessageControlEXT(int source, int type, int severity, int count, long ids, boolean enable) {
        long __functionAddress = AL.getICD().alDebugMessageControlEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, type, severity, count, ids, enable, __functionAddress);
    }

    /** {@code ALvoid alDebugMessageControlEXT(ALenum source, ALenum type, ALenum severity, ALsizei count, ALuint const * ids, ALboolean enable)} */
    @NativeType("ALvoid")
    public static void alDebugMessageControlEXT(@NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALenum") int severity, @NativeType("ALuint const *") @Nullable IntBuffer ids, @NativeType("ALboolean") boolean enable) {
        nalDebugMessageControlEXT(source, type, severity, remainingSafe(ids), memAddressSafe(ids), enable);
    }

    // --- [ alDebugMessageControlDirectEXT ] ---

    /** {@code ALvoid alDebugMessageControlDirectEXT(ALCcontext * context, ALenum source, ALenum type, ALenum severity, ALsizei count, ALuint const * ids, ALboolean enable)} */
    public static void nalDebugMessageControlDirectEXT(long context, int source, int type, int severity, int count, long ids, boolean enable) {
        long __functionAddress = AL.getICD().alDebugMessageControlDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, type, severity, count, ids, enable, __functionAddress);
    }

    /** {@code ALvoid alDebugMessageControlDirectEXT(ALCcontext * context, ALenum source, ALenum type, ALenum severity, ALsizei count, ALuint const * ids, ALboolean enable)} */
    @NativeType("ALvoid")
    public static void alDebugMessageControlDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALenum") int severity, @NativeType("ALuint const *") @Nullable IntBuffer ids, @NativeType("ALboolean") boolean enable) {
        nalDebugMessageControlDirectEXT(context, source, type, severity, remainingSafe(ids), memAddressSafe(ids), enable);
    }

    // --- [ alPushDebugGroupEXT ] ---

    /** {@code ALvoid alPushDebugGroupEXT(ALenum source, ALuint id, ALsizei length, ALchar const * message)} */
    public static void nalPushDebugGroupEXT(int source, int id, int length, long message) {
        long __functionAddress = AL.getICD().alPushDebugGroupEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, id, length, message, __functionAddress);
    }

    /** {@code ALvoid alPushDebugGroupEXT(ALenum source, ALuint id, ALsizei length, ALchar const * message)} */
    @NativeType("ALvoid")
    public static void alPushDebugGroupEXT(@NativeType("ALenum") int source, @NativeType("ALuint") int id, @NativeType("ALchar const *") ByteBuffer message) {
        nalPushDebugGroupEXT(source, id, message.remaining(), memAddress(message));
    }

    /** {@code ALvoid alPushDebugGroupEXT(ALenum source, ALuint id, ALsizei length, ALchar const * message)} */
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

    /** {@code ALvoid alPushDebugGroupDirectEXT(ALCcontext * context, ALenum source, ALuint id, ALsizei length, ALchar const * message)} */
    public static void nalPushDebugGroupDirectEXT(long context, int source, int id, int length, long message) {
        long __functionAddress = AL.getICD().alPushDebugGroupDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, id, length, message, __functionAddress);
    }

    /** {@code ALvoid alPushDebugGroupDirectEXT(ALCcontext * context, ALenum source, ALuint id, ALsizei length, ALchar const * message)} */
    @NativeType("ALvoid")
    public static void alPushDebugGroupDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALuint") int id, @NativeType("ALchar const *") ByteBuffer message) {
        nalPushDebugGroupDirectEXT(context, source, id, message.remaining(), memAddress(message));
    }

    /** {@code ALvoid alPushDebugGroupDirectEXT(ALCcontext * context, ALenum source, ALuint id, ALsizei length, ALchar const * message)} */
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

    /** {@code ALvoid alPopDebugGroupEXT(void)} */
    @NativeType("ALvoid")
    public static void alPopDebugGroupEXT() {
        long __functionAddress = AL.getICD().alPopDebugGroupEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ alPopDebugGroupDirectEXT ] ---

    /** {@code ALvoid alPopDebugGroupDirectEXT(ALCcontext * context)} */
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

    /** {@code ALuint alGetDebugMessageLogEXT(ALuint count, ALsizei logBufSize, ALenum * sources, ALenum * types, ALuint * ids, ALenum * severities, ALsizei * lengths, ALchar * logBuf)} */
    public static int nalGetDebugMessageLogEXT(int count, int logBufSize, long sources, long types, long ids, long severities, long lengths, long logBuf) {
        long __functionAddress = AL.getICD().alGetDebugMessageLogEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPPPPPI(count, logBufSize, sources, types, ids, severities, lengths, logBuf, __functionAddress);
    }

    /** {@code ALuint alGetDebugMessageLogEXT(ALuint count, ALsizei logBufSize, ALenum * sources, ALenum * types, ALuint * ids, ALenum * severities, ALsizei * lengths, ALchar * logBuf)} */
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

    /** {@code ALuint alGetDebugMessageLogDirectEXT(ALCcontext * context, ALuint count, ALsizei logBufSize, ALenum * sources, ALenum * types, ALuint * ids, ALenum * severities, ALsizei * lengths, ALchar * logBuf)} */
    public static int nalGetDebugMessageLogDirectEXT(long context, int count, int logBufSize, long sources, long types, long ids, long severities, long lengths, long logBuf) {
        long __functionAddress = AL.getICD().alGetDebugMessageLogDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePPPPPPPI(context, count, logBufSize, sources, types, ids, severities, lengths, logBuf, __functionAddress);
    }

    /** {@code ALuint alGetDebugMessageLogDirectEXT(ALCcontext * context, ALuint count, ALsizei logBufSize, ALenum * sources, ALenum * types, ALuint * ids, ALenum * severities, ALsizei * lengths, ALchar * logBuf)} */
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

    /** {@code ALvoid alObjectLabelEXT(ALenum identifier, ALuint name, ALsizei length, ALchar const * label)} */
    public static void nalObjectLabelEXT(int identifier, int name, int length, long label) {
        long __functionAddress = AL.getICD().alObjectLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(identifier, name, length, label, __functionAddress);
    }

    /** {@code ALvoid alObjectLabelEXT(ALenum identifier, ALuint name, ALsizei length, ALchar const * label)} */
    @NativeType("ALvoid")
    public static void alObjectLabelEXT(@NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALchar const *") ByteBuffer label) {
        nalObjectLabelEXT(identifier, name, label.remaining(), memAddress(label));
    }

    /** {@code ALvoid alObjectLabelEXT(ALenum identifier, ALuint name, ALsizei length, ALchar const * label)} */
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

    /** {@code ALvoid alObjectLabelDirectEXT(ALCcontext * context, ALenum identifier, ALuint name, ALsizei length, ALchar const * label)} */
    public static void nalObjectLabelDirectEXT(long context, int identifier, int name, int length, long label) {
        long __functionAddress = AL.getICD().alObjectLabelDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, identifier, name, length, label, __functionAddress);
    }

    /** {@code ALvoid alObjectLabelDirectEXT(ALCcontext * context, ALenum identifier, ALuint name, ALsizei length, ALchar const * label)} */
    @NativeType("ALvoid")
    public static void alObjectLabelDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALchar const *") ByteBuffer label) {
        nalObjectLabelDirectEXT(context, identifier, name, label.remaining(), memAddress(label));
    }

    /** {@code ALvoid alObjectLabelDirectEXT(ALCcontext * context, ALenum identifier, ALuint name, ALsizei length, ALchar const * label)} */
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

    /** {@code ALvoid alGetObjectLabelEXT(ALenum identifier, ALuint name, ALsizei bufSize, ALsizei * length, ALchar * label)} */
    public static void nalGetObjectLabelEXT(int identifier, int name, int bufSize, long length, long label) {
        long __functionAddress = AL.getICD().alGetObjectLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(identifier, name, bufSize, length, label, __functionAddress);
    }

    /** {@code ALvoid alGetObjectLabelEXT(ALenum identifier, ALuint name, ALsizei bufSize, ALsizei * length, ALchar * label)} */
    @NativeType("ALvoid")
    public static void alGetObjectLabelEXT(@NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALsizei *") IntBuffer length, @NativeType("ALchar *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(length, 1);
        }
        nalGetObjectLabelEXT(identifier, name, remainingSafe(label), memAddress(length), memAddressSafe(label));
    }

    // --- [ alGetObjectLabelDirectEXT ] ---

    /** {@code ALvoid alGetObjectLabelDirectEXT(ALCcontext * context, ALenum identifier, ALuint name, ALsizei bufSize, ALsizei * length, ALchar * label)} */
    public static void nalGetObjectLabelDirectEXT(long context, int identifier, int name, int bufSize, long length, long label) {
        long __functionAddress = AL.getICD().alGetObjectLabelDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPV(context, identifier, name, bufSize, length, label, __functionAddress);
    }

    /** {@code ALvoid alGetObjectLabelDirectEXT(ALCcontext * context, ALenum identifier, ALuint name, ALsizei bufSize, ALsizei * length, ALchar * label)} */
    @NativeType("ALvoid")
    public static void alGetObjectLabelDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALsizei *") IntBuffer length, @NativeType("ALchar *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(length, 1);
        }
        nalGetObjectLabelDirectEXT(context, identifier, name, remainingSafe(label), memAddress(length), memAddressSafe(label));
    }

    // --- [ alGetPointerEXT ] ---

    /** {@code ALvoid * alGetPointerEXT(ALenum pname)} */
    @NativeType("ALvoid *")
    public static long alGetPointerEXT(@NativeType("ALenum") int pname) {
        long __functionAddress = AL.getICD().alGetPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(pname, __functionAddress);
    }

    // --- [ alGetPointerDirectEXT ] ---

    /** {@code ALvoid * alGetPointerDirectEXT(ALCcontext * context, ALenum pname)} */
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

    /** {@code ALvoid alGetPointervEXT(ALenum pname, ALvoid ** values)} */
    public static void nalGetPointervEXT(int pname, long values) {
        long __functionAddress = AL.getICD().alGetPointervEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(pname, values, __functionAddress);
    }

    /** {@code ALvoid alGetPointervEXT(ALenum pname, ALvoid ** values)} */
    @NativeType("ALvoid")
    public static void alGetPointervEXT(@NativeType("ALenum") int pname, @NativeType("ALvoid **") PointerBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetPointervEXT(pname, memAddress(values));
    }

    // --- [ alGetPointervDirectEXT ] ---

    /** {@code ALvoid alGetPointervDirectEXT(ALCcontext * context, ALenum pname, ALvoid ** values)} */
    public static void nalGetPointervDirectEXT(long context, int pname, long values) {
        long __functionAddress = AL.getICD().alGetPointervDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, pname, values, __functionAddress);
    }

    /** {@code ALvoid alGetPointervDirectEXT(ALCcontext * context, ALenum pname, ALvoid ** values)} */
    @NativeType("ALvoid")
    public static void alGetPointervDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int pname, @NativeType("ALvoid **") PointerBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetPointervDirectEXT(context, pname, memAddress(values));
    }

    /** {@code ALvoid alDebugMessageControlEXT(ALenum source, ALenum type, ALenum severity, ALsizei count, ALuint const * ids, ALboolean enable)} */
    @NativeType("ALvoid")
    public static void alDebugMessageControlEXT(@NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALenum") int severity, @NativeType("ALuint const *") int @Nullable [] ids, @NativeType("ALboolean") boolean enable) {
        long __functionAddress = AL.getICD().alDebugMessageControlEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, type, severity, lengthSafe(ids), ids, enable, __functionAddress);
    }

    /** {@code ALvoid alDebugMessageControlDirectEXT(ALCcontext * context, ALenum source, ALenum type, ALenum severity, ALsizei count, ALuint const * ids, ALboolean enable)} */
    @NativeType("ALvoid")
    public static void alDebugMessageControlDirectEXT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALenum") int severity, @NativeType("ALuint const *") int @Nullable [] ids, @NativeType("ALboolean") boolean enable) {
        long __functionAddress = AL.getICD().alDebugMessageControlDirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, type, severity, lengthSafe(ids), ids, enable, __functionAddress);
    }

    /** {@code ALuint alGetDebugMessageLogEXT(ALuint count, ALsizei logBufSize, ALenum * sources, ALenum * types, ALuint * ids, ALenum * severities, ALsizei * lengths, ALchar * logBuf)} */
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

    /** {@code ALuint alGetDebugMessageLogDirectEXT(ALCcontext * context, ALuint count, ALsizei logBufSize, ALenum * sources, ALenum * types, ALuint * ids, ALenum * severities, ALsizei * lengths, ALchar * logBuf)} */
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

    /** {@code ALvoid alGetObjectLabelEXT(ALenum identifier, ALuint name, ALsizei bufSize, ALsizei * length, ALchar * label)} */
    @NativeType("ALvoid")
    public static void alGetObjectLabelEXT(@NativeType("ALenum") int identifier, @NativeType("ALuint") int name, @NativeType("ALsizei *") int[] length, @NativeType("ALchar *") @Nullable ByteBuffer label) {
        long __functionAddress = AL.getICD().alGetObjectLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(length, 1);
        }
        invokePPV(identifier, name, remainingSafe(label), length, memAddressSafe(label), __functionAddress);
    }

    /** {@code ALvoid alGetObjectLabelDirectEXT(ALCcontext * context, ALenum identifier, ALuint name, ALsizei bufSize, ALsizei * length, ALchar * label)} */
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