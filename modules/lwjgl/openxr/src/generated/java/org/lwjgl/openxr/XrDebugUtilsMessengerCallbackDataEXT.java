/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Debug utils messenger callback data.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to using {@link XrDebugUtilsMessengerCallbackDataEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code messageId} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>{@code functionName} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>{@code message} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <p>An {@link XrDebugUtilsMessengerCallbackDataEXT} is a messenger object that handles passing along debug messages to a provided debug callback.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This structure should only be considered valid during the lifetime of the triggered callback.</p>
 * </div>
 * 
 * <p>The labels listed inside {@code sessionLabels} are organized in time order, with the most recently generated label appearing first, and the oldest label appearing last.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrDebugUtilsLabelEXT}, {@link XrDebugUtilsObjectNameInfoEXT}, {@link EXTDebugUtils#xrSubmitDebugUtilsMessageEXT SubmitDebugUtilsMessageEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrDebugUtilsMessengerCallbackDataEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     char const * {@link #messageId};
 *     char const * {@link #functionName};
 *     char const * {@link #message};
 *     uint32_t {@link #objectCount};
 *     {@link XrDebugUtilsObjectNameInfoEXT XrDebugUtilsObjectNameInfoEXT} * {@link #objects};
 *     uint32_t {@link #sessionLabelCount};
 *     {@link XrDebugUtilsLabelEXT XrDebugUtilsLabelEXT} * {@link #sessionLabels};
 * }</code></pre>
 */
public class XrDebugUtilsMessengerCallbackDataEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MESSAGEID,
        FUNCTIONNAME,
        MESSAGE,
        OBJECTCOUNT,
        OBJECTS,
        SESSIONLABELCOUNT,
        SESSIONLABELS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MESSAGEID = layout.offsetof(2);
        FUNCTIONNAME = layout.offsetof(3);
        MESSAGE = layout.offsetof(4);
        OBJECTCOUNT = layout.offsetof(5);
        OBJECTS = layout.offsetof(6);
        SESSIONLABELCOUNT = layout.offsetof(7);
        SESSIONLABELS = layout.offsetof(8);
    }

    /**
     * Creates a {@code XrDebugUtilsMessengerCallbackDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDebugUtilsMessengerCallbackDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a {@code NULL} terminated string that identifies the message in a unique way. If the callback is triggered by a validation layer, this string corresponds the Valid Usage ID (VUID) that can be used to jump to the appropriate location in the OpenXR specification. This value <b>may</b> be {@code NULL} if no unique message identifier is associated with the message. */
    @NativeType("char const *")
    public ByteBuffer messageId() { return nmessageId(address()); }
    /** a {@code NULL} terminated string that identifies the message in a unique way. If the callback is triggered by a validation layer, this string corresponds the Valid Usage ID (VUID) that can be used to jump to the appropriate location in the OpenXR specification. This value <b>may</b> be {@code NULL} if no unique message identifier is associated with the message. */
    @NativeType("char const *")
    public String messageIdString() { return nmessageIdString(address()); }
    /** a {@code NULL} terminated string that identifies the OpenXR function that was executing at the time the message callback was triggered. This value <b>may</b> be {@code NULL} in cases where it is difficult to determine the originating OpenXR function. */
    @NativeType("char const *")
    public ByteBuffer functionName() { return nfunctionName(address()); }
    /** a {@code NULL} terminated string that identifies the OpenXR function that was executing at the time the message callback was triggered. This value <b>may</b> be {@code NULL} in cases where it is difficult to determine the originating OpenXR function. */
    @NativeType("char const *")
    public String functionNameString() { return nfunctionNameString(address()); }
    /** a {@code NULL} terminated string detailing the trigger conditions. */
    @NativeType("char const *")
    public ByteBuffer message() { return nmessage(address()); }
    /** a {@code NULL} terminated string detailing the trigger conditions. */
    @NativeType("char const *")
    public String messageString() { return nmessageString(address()); }
    /** a count of items contained in the {@code objects} array. This may be 0. */
    @NativeType("uint32_t")
    public int objectCount() { return nobjectCount(address()); }
    /** a pointer to an array of {@link XrDebugUtilsObjectNameInfoEXT} objects related to the detected issue. The array is roughly in order or importance, but the 0th element is always guaranteed to be the most important object for this message. */
    @Nullable
    @NativeType("XrDebugUtilsObjectNameInfoEXT *")
    public XrDebugUtilsObjectNameInfoEXT.Buffer objects() { return nobjects(address()); }
    /** a count of items contained in the {@code sessionLabels} array. This may be 0. */
    @NativeType("uint32_t")
    public int sessionLabelCount() { return nsessionLabelCount(address()); }
    /**
     * a pointer to an array of {@link XrDebugUtilsLabelEXT} objects related to the detected issue. The array is roughly in order or importance, but the 0th element is always guaranteed to be the most important object for this message.
     * 
     * <p>NULL or a pointer to an array of {@link XrDebugUtilsLabelEXT} active in the current {@code XrSession} at the time the callback was triggered. Refer to <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#session-labels">Session Labels</a> for more information.</p>
     */
    @Nullable
    @NativeType("XrDebugUtilsLabelEXT *")
    public XrDebugUtilsLabelEXT.Buffer sessionLabels() { return nsessionLabels(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrDebugUtilsMessengerCallbackDataEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT} value to the {@link #type} field. */
    public XrDebugUtilsMessengerCallbackDataEXT type$Default() { return type(EXTDebugUtils.XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrDebugUtilsMessengerCallbackDataEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #messageId} field. */
    public XrDebugUtilsMessengerCallbackDataEXT messageId(@NativeType("char const *") ByteBuffer value) { nmessageId(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #functionName} field. */
    public XrDebugUtilsMessengerCallbackDataEXT functionName(@NativeType("char const *") ByteBuffer value) { nfunctionName(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #message} field. */
    public XrDebugUtilsMessengerCallbackDataEXT message(@NativeType("char const *") ByteBuffer value) { nmessage(address(), value); return this; }
    /** Sets the specified value to the {@link #objectCount} field. */
    public XrDebugUtilsMessengerCallbackDataEXT objectCount(@NativeType("uint32_t") int value) { nobjectCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrDebugUtilsObjectNameInfoEXT.Buffer} to the {@link #objects} field. */
    public XrDebugUtilsMessengerCallbackDataEXT objects(@Nullable @NativeType("XrDebugUtilsObjectNameInfoEXT *") XrDebugUtilsObjectNameInfoEXT.Buffer value) { nobjects(address(), value); return this; }
    /** Sets the specified value to the {@link #sessionLabelCount} field. */
    public XrDebugUtilsMessengerCallbackDataEXT sessionLabelCount(@NativeType("uint32_t") int value) { nsessionLabelCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrDebugUtilsLabelEXT.Buffer} to the {@link #sessionLabels} field. */
    public XrDebugUtilsMessengerCallbackDataEXT sessionLabels(@Nullable @NativeType("XrDebugUtilsLabelEXT *") XrDebugUtilsLabelEXT.Buffer value) { nsessionLabels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDebugUtilsMessengerCallbackDataEXT set(
        int type,
        long next,
        ByteBuffer messageId,
        ByteBuffer functionName,
        ByteBuffer message,
        int objectCount,
        @Nullable XrDebugUtilsObjectNameInfoEXT.Buffer objects,
        int sessionLabelCount,
        @Nullable XrDebugUtilsLabelEXT.Buffer sessionLabels
    ) {
        type(type);
        next(next);
        messageId(messageId);
        functionName(functionName);
        message(message);
        objectCount(objectCount);
        objects(objects);
        sessionLabelCount(sessionLabelCount);
        sessionLabels(sessionLabels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDebugUtilsMessengerCallbackDataEXT set(XrDebugUtilsMessengerCallbackDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsMessengerCallbackDataEXT malloc() {
        return wrap(XrDebugUtilsMessengerCallbackDataEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsMessengerCallbackDataEXT calloc() {
        return wrap(XrDebugUtilsMessengerCallbackDataEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link BufferUtils}. */
    public static XrDebugUtilsMessengerCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrDebugUtilsMessengerCallbackDataEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance for the specified memory address. */
    public static XrDebugUtilsMessengerCallbackDataEXT create(long address) {
        return wrap(XrDebugUtilsMessengerCallbackDataEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsMessengerCallbackDataEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrDebugUtilsMessengerCallbackDataEXT.class, address);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCallbackDataEXT malloc(MemoryStack stack) {
        return wrap(XrDebugUtilsMessengerCallbackDataEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCallbackDataEXT calloc(MemoryStack stack) {
        return wrap(XrDebugUtilsMessengerCallbackDataEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrDebugUtilsMessengerCallbackDataEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.NEXT); }
    /** Unsafe version of {@link #messageId}. */
    public static ByteBuffer nmessageId(long struct) { return memByteBufferNT1(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGEID)); }
    /** Unsafe version of {@link #messageIdString}. */
    public static String nmessageIdString(long struct) { return memUTF8(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGEID)); }
    /** Unsafe version of {@link #functionName}. */
    public static ByteBuffer nfunctionName(long struct) { return memByteBufferNT1(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.FUNCTIONNAME)); }
    /** Unsafe version of {@link #functionNameString}. */
    public static String nfunctionNameString(long struct) { return memUTF8(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.FUNCTIONNAME)); }
    /** Unsafe version of {@link #message}. */
    public static ByteBuffer nmessage(long struct) { return memByteBufferNT1(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGE)); }
    /** Unsafe version of {@link #messageString}. */
    public static String nmessageString(long struct) { return memUTF8(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGE)); }
    /** Unsafe version of {@link #objectCount}. */
    public static int nobjectCount(long struct) { return UNSAFE.getInt(null, struct + XrDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT); }
    /** Unsafe version of {@link #objects}. */
    @Nullable public static XrDebugUtilsObjectNameInfoEXT.Buffer nobjects(long struct) { return XrDebugUtilsObjectNameInfoEXT.createSafe(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.OBJECTS), nobjectCount(struct)); }
    /** Unsafe version of {@link #sessionLabelCount}. */
    public static int nsessionLabelCount(long struct) { return UNSAFE.getInt(null, struct + XrDebugUtilsMessengerCallbackDataEXT.SESSIONLABELCOUNT); }
    /** Unsafe version of {@link #sessionLabels}. */
    @Nullable public static XrDebugUtilsLabelEXT.Buffer nsessionLabels(long struct) { return XrDebugUtilsLabelEXT.createSafe(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.SESSIONLABELS), nsessionLabelCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrDebugUtilsMessengerCallbackDataEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.NEXT, value); }
    /** Unsafe version of {@link #messageId(ByteBuffer) messageId}. */
    public static void nmessageId(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGEID, memAddress(value));
    }
    /** Unsafe version of {@link #functionName(ByteBuffer) functionName}. */
    public static void nfunctionName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.FUNCTIONNAME, memAddress(value));
    }
    /** Unsafe version of {@link #message(ByteBuffer) message}. */
    public static void nmessage(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGE, memAddress(value));
    }
    /** Sets the specified value to the {@code objectCount} field of the specified {@code struct}. */
    public static void nobjectCount(long struct, int value) { UNSAFE.putInt(null, struct + XrDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT, value); }
    /** Unsafe version of {@link #objects(XrDebugUtilsObjectNameInfoEXT.Buffer) objects}. */
    public static void nobjects(long struct, @Nullable XrDebugUtilsObjectNameInfoEXT.Buffer value) { memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.OBJECTS, memAddressSafe(value)); if (value != null) { nobjectCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code sessionLabelCount} field of the specified {@code struct}. */
    public static void nsessionLabelCount(long struct, int value) { UNSAFE.putInt(null, struct + XrDebugUtilsMessengerCallbackDataEXT.SESSIONLABELCOUNT, value); }
    /** Unsafe version of {@link #sessionLabels(XrDebugUtilsLabelEXT.Buffer) sessionLabels}. */
    public static void nsessionLabels(long struct, @Nullable XrDebugUtilsLabelEXT.Buffer value) { memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.SESSIONLABELS, memAddressSafe(value)); if (value != null) { nsessionLabelCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGEID));
        check(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.FUNCTIONNAME));
        check(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGE));
    }

    // -----------------------------------

    /** An array of {@link XrDebugUtilsMessengerCallbackDataEXT} structs. */
    public static class Buffer extends StructBuffer<XrDebugUtilsMessengerCallbackDataEXT, Buffer> implements NativeResource {

        private static final XrDebugUtilsMessengerCallbackDataEXT ELEMENT_FACTORY = XrDebugUtilsMessengerCallbackDataEXT.create(-1L);

        /**
         * Creates a new {@code XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDebugUtilsMessengerCallbackDataEXT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrDebugUtilsMessengerCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrDebugUtilsMessengerCallbackDataEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDebugUtilsMessengerCallbackDataEXT.ntype(address()); }
        /** @return the value of the {@link XrDebugUtilsMessengerCallbackDataEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrDebugUtilsMessengerCallbackDataEXT.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link XrDebugUtilsMessengerCallbackDataEXT#messageId} field. */
        @NativeType("char const *")
        public ByteBuffer messageId() { return XrDebugUtilsMessengerCallbackDataEXT.nmessageId(address()); }
        /** @return the null-terminated string pointed to by the {@link XrDebugUtilsMessengerCallbackDataEXT#messageId} field. */
        @NativeType("char const *")
        public String messageIdString() { return XrDebugUtilsMessengerCallbackDataEXT.nmessageIdString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link XrDebugUtilsMessengerCallbackDataEXT#functionName} field. */
        @NativeType("char const *")
        public ByteBuffer functionName() { return XrDebugUtilsMessengerCallbackDataEXT.nfunctionName(address()); }
        /** @return the null-terminated string pointed to by the {@link XrDebugUtilsMessengerCallbackDataEXT#functionName} field. */
        @NativeType("char const *")
        public String functionNameString() { return XrDebugUtilsMessengerCallbackDataEXT.nfunctionNameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link XrDebugUtilsMessengerCallbackDataEXT#message} field. */
        @NativeType("char const *")
        public ByteBuffer message() { return XrDebugUtilsMessengerCallbackDataEXT.nmessage(address()); }
        /** @return the null-terminated string pointed to by the {@link XrDebugUtilsMessengerCallbackDataEXT#message} field. */
        @NativeType("char const *")
        public String messageString() { return XrDebugUtilsMessengerCallbackDataEXT.nmessageString(address()); }
        /** @return the value of the {@link XrDebugUtilsMessengerCallbackDataEXT#objectCount} field. */
        @NativeType("uint32_t")
        public int objectCount() { return XrDebugUtilsMessengerCallbackDataEXT.nobjectCount(address()); }
        /** @return a {@link XrDebugUtilsObjectNameInfoEXT.Buffer} view of the struct array pointed to by the {@link XrDebugUtilsMessengerCallbackDataEXT#objects} field. */
        @Nullable
        @NativeType("XrDebugUtilsObjectNameInfoEXT *")
        public XrDebugUtilsObjectNameInfoEXT.Buffer objects() { return XrDebugUtilsMessengerCallbackDataEXT.nobjects(address()); }
        /** @return the value of the {@link XrDebugUtilsMessengerCallbackDataEXT#sessionLabelCount} field. */
        @NativeType("uint32_t")
        public int sessionLabelCount() { return XrDebugUtilsMessengerCallbackDataEXT.nsessionLabelCount(address()); }
        /** @return a {@link XrDebugUtilsLabelEXT.Buffer} view of the struct array pointed to by the {@link XrDebugUtilsMessengerCallbackDataEXT#sessionLabels} field. */
        @Nullable
        @NativeType("XrDebugUtilsLabelEXT *")
        public XrDebugUtilsLabelEXT.Buffer sessionLabels() { return XrDebugUtilsMessengerCallbackDataEXT.nsessionLabels(address()); }

        /** Sets the specified value to the {@link XrDebugUtilsMessengerCallbackDataEXT#type} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer type(@NativeType("XrStructureType") int value) { XrDebugUtilsMessengerCallbackDataEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT} value to the {@link XrDebugUtilsMessengerCallbackDataEXT#type} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer type$Default() { return type(EXTDebugUtils.XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT); }
        /** Sets the specified value to the {@link XrDebugUtilsMessengerCallbackDataEXT#next} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer next(@NativeType("void const *") long value) { XrDebugUtilsMessengerCallbackDataEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link XrDebugUtilsMessengerCallbackDataEXT#messageId} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer messageId(@NativeType("char const *") ByteBuffer value) { XrDebugUtilsMessengerCallbackDataEXT.nmessageId(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link XrDebugUtilsMessengerCallbackDataEXT#functionName} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer functionName(@NativeType("char const *") ByteBuffer value) { XrDebugUtilsMessengerCallbackDataEXT.nfunctionName(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link XrDebugUtilsMessengerCallbackDataEXT#message} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer message(@NativeType("char const *") ByteBuffer value) { XrDebugUtilsMessengerCallbackDataEXT.nmessage(address(), value); return this; }
        /** Sets the specified value to the {@link XrDebugUtilsMessengerCallbackDataEXT#objectCount} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer objectCount(@NativeType("uint32_t") int value) { XrDebugUtilsMessengerCallbackDataEXT.nobjectCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrDebugUtilsObjectNameInfoEXT.Buffer} to the {@link XrDebugUtilsMessengerCallbackDataEXT#objects} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer objects(@Nullable @NativeType("XrDebugUtilsObjectNameInfoEXT *") XrDebugUtilsObjectNameInfoEXT.Buffer value) { XrDebugUtilsMessengerCallbackDataEXT.nobjects(address(), value); return this; }
        /** Sets the specified value to the {@link XrDebugUtilsMessengerCallbackDataEXT#sessionLabelCount} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer sessionLabelCount(@NativeType("uint32_t") int value) { XrDebugUtilsMessengerCallbackDataEXT.nsessionLabelCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrDebugUtilsLabelEXT.Buffer} to the {@link XrDebugUtilsMessengerCallbackDataEXT#sessionLabels} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer sessionLabels(@Nullable @NativeType("XrDebugUtilsLabelEXT *") XrDebugUtilsLabelEXT.Buffer value) { XrDebugUtilsMessengerCallbackDataEXT.nsessionLabels(address(), value); return this; }

    }

}