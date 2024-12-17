/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrDebugUtilsMessengerCallbackDataEXT {
 *     XrStructureType type;
 *     void const * next;
 *     char const * messageId;
 *     char const * functionName;
 *     char const * message;
 *     uint32_t objectCount;
 *     {@link XrDebugUtilsObjectNameInfoEXT XrDebugUtilsObjectNameInfoEXT} * objects;
 *     uint32_t sessionLabelCount;
 *     {@link XrDebugUtilsLabelEXT XrDebugUtilsLabelEXT} * sessionLabels;
 * }}</pre>
 */
public class XrDebugUtilsMessengerCallbackDataEXT extends Struct<XrDebugUtilsMessengerCallbackDataEXT> implements NativeResource {

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

    protected XrDebugUtilsMessengerCallbackDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrDebugUtilsMessengerCallbackDataEXT create(long address, @Nullable ByteBuffer container) {
        return new XrDebugUtilsMessengerCallbackDataEXT(address, container);
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

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code messageId} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer messageId() { return nmessageId(address()); }
    /** @return the null-terminated string pointed to by the {@code messageId} field. */
    @NativeType("char const *")
    public @Nullable String messageIdString() { return nmessageIdString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code functionName} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer functionName() { return nfunctionName(address()); }
    /** @return the null-terminated string pointed to by the {@code functionName} field. */
    @NativeType("char const *")
    public @Nullable String functionNameString() { return nfunctionNameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code message} field. */
    @NativeType("char const *")
    public ByteBuffer message() { return nmessage(address()); }
    /** @return the null-terminated string pointed to by the {@code message} field. */
    @NativeType("char const *")
    public String messageString() { return nmessageString(address()); }
    /** @return the value of the {@code objectCount} field. */
    @NativeType("uint32_t")
    public int objectCount() { return nobjectCount(address()); }
    /** @return a {@link XrDebugUtilsObjectNameInfoEXT.Buffer} view of the struct array pointed to by the {@code objects} field. */
    @NativeType("XrDebugUtilsObjectNameInfoEXT *")
    public XrDebugUtilsObjectNameInfoEXT.@Nullable Buffer objects() { return nobjects(address()); }
    /** @return the value of the {@code sessionLabelCount} field. */
    @NativeType("uint32_t")
    public int sessionLabelCount() { return nsessionLabelCount(address()); }
    /** @return a {@link XrDebugUtilsLabelEXT.Buffer} view of the struct array pointed to by the {@code sessionLabels} field. */
    @NativeType("XrDebugUtilsLabelEXT *")
    public XrDebugUtilsLabelEXT.@Nullable Buffer sessionLabels() { return nsessionLabels(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrDebugUtilsMessengerCallbackDataEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT} value to the {@code type} field. */
    public XrDebugUtilsMessengerCallbackDataEXT type$Default() { return type(EXTDebugUtils.XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrDebugUtilsMessengerCallbackDataEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code messageId} field. */
    public XrDebugUtilsMessengerCallbackDataEXT messageId(@Nullable @NativeType("char const *") ByteBuffer value) { nmessageId(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code functionName} field. */
    public XrDebugUtilsMessengerCallbackDataEXT functionName(@Nullable @NativeType("char const *") ByteBuffer value) { nfunctionName(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code message} field. */
    public XrDebugUtilsMessengerCallbackDataEXT message(@NativeType("char const *") ByteBuffer value) { nmessage(address(), value); return this; }
    /** Sets the specified value to the {@code objectCount} field. */
    public XrDebugUtilsMessengerCallbackDataEXT objectCount(@NativeType("uint32_t") int value) { nobjectCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrDebugUtilsObjectNameInfoEXT.Buffer} to the {@code objects} field. */
    public XrDebugUtilsMessengerCallbackDataEXT objects(@NativeType("XrDebugUtilsObjectNameInfoEXT *") XrDebugUtilsObjectNameInfoEXT.@Nullable Buffer value) { nobjects(address(), value); return this; }
    /** Sets the specified value to the {@code sessionLabelCount} field. */
    public XrDebugUtilsMessengerCallbackDataEXT sessionLabelCount(@NativeType("uint32_t") int value) { nsessionLabelCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrDebugUtilsLabelEXT.Buffer} to the {@code sessionLabels} field. */
    public XrDebugUtilsMessengerCallbackDataEXT sessionLabels(@NativeType("XrDebugUtilsLabelEXT *") XrDebugUtilsLabelEXT.@Nullable Buffer value) { nsessionLabels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDebugUtilsMessengerCallbackDataEXT set(
        int type,
        long next,
        @Nullable ByteBuffer messageId,
        @Nullable ByteBuffer functionName,
        ByteBuffer message,
        int objectCount,
        XrDebugUtilsObjectNameInfoEXT.@Nullable Buffer objects,
        int sessionLabelCount,
        XrDebugUtilsLabelEXT.@Nullable Buffer sessionLabels
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
        return new XrDebugUtilsMessengerCallbackDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsMessengerCallbackDataEXT calloc() {
        return new XrDebugUtilsMessengerCallbackDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link BufferUtils}. */
    public static XrDebugUtilsMessengerCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrDebugUtilsMessengerCallbackDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance for the specified memory address. */
    public static XrDebugUtilsMessengerCallbackDataEXT create(long address) {
        return new XrDebugUtilsMessengerCallbackDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrDebugUtilsMessengerCallbackDataEXT createSafe(long address) {
        return address == NULL ? null : new XrDebugUtilsMessengerCallbackDataEXT(address, null);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrDebugUtilsMessengerCallbackDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCallbackDataEXT malloc(MemoryStack stack) {
        return new XrDebugUtilsMessengerCallbackDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCallbackDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCallbackDataEXT calloc(MemoryStack stack) {
        return new XrDebugUtilsMessengerCallbackDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrDebugUtilsMessengerCallbackDataEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.NEXT); }
    /** Unsafe version of {@link #messageId}. */
    public static @Nullable ByteBuffer nmessageId(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGEID)); }
    /** Unsafe version of {@link #messageIdString}. */
    public static @Nullable String nmessageIdString(long struct) { return memUTF8Safe(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGEID)); }
    /** Unsafe version of {@link #functionName}. */
    public static @Nullable ByteBuffer nfunctionName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.FUNCTIONNAME)); }
    /** Unsafe version of {@link #functionNameString}. */
    public static @Nullable String nfunctionNameString(long struct) { return memUTF8Safe(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.FUNCTIONNAME)); }
    /** Unsafe version of {@link #message}. */
    public static ByteBuffer nmessage(long struct) { return memByteBufferNT1(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGE)); }
    /** Unsafe version of {@link #messageString}. */
    public static String nmessageString(long struct) { return memUTF8(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGE)); }
    /** Unsafe version of {@link #objectCount}. */
    public static int nobjectCount(long struct) { return memGetInt(struct + XrDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT); }
    /** Unsafe version of {@link #objects}. */
    public static XrDebugUtilsObjectNameInfoEXT.@Nullable Buffer nobjects(long struct) { return XrDebugUtilsObjectNameInfoEXT.createSafe(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.OBJECTS), nobjectCount(struct)); }
    /** Unsafe version of {@link #sessionLabelCount}. */
    public static int nsessionLabelCount(long struct) { return memGetInt(struct + XrDebugUtilsMessengerCallbackDataEXT.SESSIONLABELCOUNT); }
    /** Unsafe version of {@link #sessionLabels}. */
    public static XrDebugUtilsLabelEXT.@Nullable Buffer nsessionLabels(long struct) { return XrDebugUtilsLabelEXT.createSafe(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.SESSIONLABELS), nsessionLabelCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrDebugUtilsMessengerCallbackDataEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.NEXT, value); }
    /** Unsafe version of {@link #messageId(ByteBuffer) messageId}. */
    public static void nmessageId(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGEID, memAddressSafe(value));
    }
    /** Unsafe version of {@link #functionName(ByteBuffer) functionName}. */
    public static void nfunctionName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.FUNCTIONNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #message(ByteBuffer) message}. */
    public static void nmessage(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGE, memAddress(value));
    }
    /** Sets the specified value to the {@code objectCount} field of the specified {@code struct}. */
    public static void nobjectCount(long struct, int value) { memPutInt(struct + XrDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT, value); }
    /** Unsafe version of {@link #objects(XrDebugUtilsObjectNameInfoEXT.Buffer) objects}. */
    public static void nobjects(long struct, XrDebugUtilsObjectNameInfoEXT.@Nullable Buffer value) { memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.OBJECTS, memAddressSafe(value)); if (value != null) { nobjectCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code sessionLabelCount} field of the specified {@code struct}. */
    public static void nsessionLabelCount(long struct, int value) { memPutInt(struct + XrDebugUtilsMessengerCallbackDataEXT.SESSIONLABELCOUNT, value); }
    /** Unsafe version of {@link #sessionLabels(XrDebugUtilsLabelEXT.Buffer) sessionLabels}. */
    public static void nsessionLabels(long struct, XrDebugUtilsLabelEXT.@Nullable Buffer value) { memPutAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.SESSIONLABELS, memAddressSafe(value)); if (value != null) { nsessionLabelCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrDebugUtilsMessengerCallbackDataEXT.MESSAGE));
    }

    // -----------------------------------

    /** An array of {@link XrDebugUtilsMessengerCallbackDataEXT} structs. */
    public static class Buffer extends StructBuffer<XrDebugUtilsMessengerCallbackDataEXT, Buffer> implements NativeResource {

        private static final XrDebugUtilsMessengerCallbackDataEXT ELEMENT_FACTORY = XrDebugUtilsMessengerCallbackDataEXT.create(-1L);

        /**
         * Creates a new {@code XrDebugUtilsMessengerCallbackDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDebugUtilsMessengerCallbackDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrDebugUtilsMessengerCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDebugUtilsMessengerCallbackDataEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrDebugUtilsMessengerCallbackDataEXT.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code messageId} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer messageId() { return XrDebugUtilsMessengerCallbackDataEXT.nmessageId(address()); }
        /** @return the null-terminated string pointed to by the {@code messageId} field. */
        @NativeType("char const *")
        public @Nullable String messageIdString() { return XrDebugUtilsMessengerCallbackDataEXT.nmessageIdString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code functionName} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer functionName() { return XrDebugUtilsMessengerCallbackDataEXT.nfunctionName(address()); }
        /** @return the null-terminated string pointed to by the {@code functionName} field. */
        @NativeType("char const *")
        public @Nullable String functionNameString() { return XrDebugUtilsMessengerCallbackDataEXT.nfunctionNameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code message} field. */
        @NativeType("char const *")
        public ByteBuffer message() { return XrDebugUtilsMessengerCallbackDataEXT.nmessage(address()); }
        /** @return the null-terminated string pointed to by the {@code message} field. */
        @NativeType("char const *")
        public String messageString() { return XrDebugUtilsMessengerCallbackDataEXT.nmessageString(address()); }
        /** @return the value of the {@code objectCount} field. */
        @NativeType("uint32_t")
        public int objectCount() { return XrDebugUtilsMessengerCallbackDataEXT.nobjectCount(address()); }
        /** @return a {@link XrDebugUtilsObjectNameInfoEXT.Buffer} view of the struct array pointed to by the {@code objects} field. */
        @NativeType("XrDebugUtilsObjectNameInfoEXT *")
        public XrDebugUtilsObjectNameInfoEXT.@Nullable Buffer objects() { return XrDebugUtilsMessengerCallbackDataEXT.nobjects(address()); }
        /** @return the value of the {@code sessionLabelCount} field. */
        @NativeType("uint32_t")
        public int sessionLabelCount() { return XrDebugUtilsMessengerCallbackDataEXT.nsessionLabelCount(address()); }
        /** @return a {@link XrDebugUtilsLabelEXT.Buffer} view of the struct array pointed to by the {@code sessionLabels} field. */
        @NativeType("XrDebugUtilsLabelEXT *")
        public XrDebugUtilsLabelEXT.@Nullable Buffer sessionLabels() { return XrDebugUtilsMessengerCallbackDataEXT.nsessionLabels(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer type(@NativeType("XrStructureType") int value) { XrDebugUtilsMessengerCallbackDataEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT} value to the {@code type} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer type$Default() { return type(EXTDebugUtils.XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer next(@NativeType("void const *") long value) { XrDebugUtilsMessengerCallbackDataEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code messageId} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer messageId(@Nullable @NativeType("char const *") ByteBuffer value) { XrDebugUtilsMessengerCallbackDataEXT.nmessageId(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code functionName} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer functionName(@Nullable @NativeType("char const *") ByteBuffer value) { XrDebugUtilsMessengerCallbackDataEXT.nfunctionName(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code message} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer message(@NativeType("char const *") ByteBuffer value) { XrDebugUtilsMessengerCallbackDataEXT.nmessage(address(), value); return this; }
        /** Sets the specified value to the {@code objectCount} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer objectCount(@NativeType("uint32_t") int value) { XrDebugUtilsMessengerCallbackDataEXT.nobjectCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrDebugUtilsObjectNameInfoEXT.Buffer} to the {@code objects} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer objects(@NativeType("XrDebugUtilsObjectNameInfoEXT *") XrDebugUtilsObjectNameInfoEXT.@Nullable Buffer value) { XrDebugUtilsMessengerCallbackDataEXT.nobjects(address(), value); return this; }
        /** Sets the specified value to the {@code sessionLabelCount} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer sessionLabelCount(@NativeType("uint32_t") int value) { XrDebugUtilsMessengerCallbackDataEXT.nsessionLabelCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrDebugUtilsLabelEXT.Buffer} to the {@code sessionLabels} field. */
        public XrDebugUtilsMessengerCallbackDataEXT.Buffer sessionLabels(@NativeType("XrDebugUtilsLabelEXT *") XrDebugUtilsLabelEXT.@Nullable Buffer value) { XrDebugUtilsMessengerCallbackDataEXT.nsessionLabels(address(), value); return this; }

    }

}