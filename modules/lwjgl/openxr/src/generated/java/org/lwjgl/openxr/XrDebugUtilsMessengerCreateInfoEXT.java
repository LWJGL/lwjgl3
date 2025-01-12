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
 * struct XrDebugUtilsMessengerCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrDebugUtilsMessageSeverityFlagsEXT messageSeverities;
 *     XrDebugUtilsMessageTypeFlagsEXT messageTypes;
 *     {@link XrDebugUtilsMessengerCallbackEXTI PFN_xrDebugUtilsMessengerCallbackEXT} userCallback;
 *     void * userData;
 * }}</pre>
 */
public class XrDebugUtilsMessengerCreateInfoEXT extends Struct<XrDebugUtilsMessengerCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MESSAGESEVERITIES,
        MESSAGETYPES,
        USERCALLBACK,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MESSAGESEVERITIES = layout.offsetof(2);
        MESSAGETYPES = layout.offsetof(3);
        USERCALLBACK = layout.offsetof(4);
        USERDATA = layout.offsetof(5);
    }

    protected XrDebugUtilsMessengerCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrDebugUtilsMessengerCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrDebugUtilsMessengerCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrDebugUtilsMessengerCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDebugUtilsMessengerCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code messageSeverities} field. */
    @NativeType("XrDebugUtilsMessageSeverityFlagsEXT")
    public long messageSeverities() { return nmessageSeverities(address()); }
    /** @return the value of the {@code messageTypes} field. */
    @NativeType("XrDebugUtilsMessageTypeFlagsEXT")
    public long messageTypes() { return nmessageTypes(address()); }
    /** @return the value of the {@code userCallback} field. */
    @NativeType("PFN_xrDebugUtilsMessengerCallbackEXT")
    public XrDebugUtilsMessengerCallbackEXT userCallback() { return nuserCallback(address()); }
    /** @return the value of the {@code userData} field. */
    @NativeType("void *")
    public long userData() { return nuserData(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrDebugUtilsMessengerCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrDebugUtilsMessengerCreateInfoEXT type$Default() { return type(EXTDebugUtils.XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrDebugUtilsMessengerCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code messageSeverities} field. */
    public XrDebugUtilsMessengerCreateInfoEXT messageSeverities(@NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long value) { nmessageSeverities(address(), value); return this; }
    /** Sets the specified value to the {@code messageTypes} field. */
    public XrDebugUtilsMessengerCreateInfoEXT messageTypes(@NativeType("XrDebugUtilsMessageTypeFlagsEXT") long value) { nmessageTypes(address(), value); return this; }
    /** Sets the specified value to the {@code userCallback} field. */
    public XrDebugUtilsMessengerCreateInfoEXT userCallback(@NativeType("PFN_xrDebugUtilsMessengerCallbackEXT") XrDebugUtilsMessengerCallbackEXTI value) { nuserCallback(address(), value); return this; }
    /** Sets the specified value to the {@code userData} field. */
    public XrDebugUtilsMessengerCreateInfoEXT userData(@NativeType("void *") long value) { nuserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDebugUtilsMessengerCreateInfoEXT set(
        int type,
        long next,
        long messageSeverities,
        long messageTypes,
        XrDebugUtilsMessengerCallbackEXTI userCallback,
        long userData
    ) {
        type(type);
        next(next);
        messageSeverities(messageSeverities);
        messageTypes(messageTypes);
        userCallback(userCallback);
        userData(userData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDebugUtilsMessengerCreateInfoEXT set(XrDebugUtilsMessengerCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsMessengerCreateInfoEXT malloc() {
        return new XrDebugUtilsMessengerCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsMessengerCreateInfoEXT calloc() {
        return new XrDebugUtilsMessengerCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrDebugUtilsMessengerCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrDebugUtilsMessengerCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance for the specified memory address. */
    public static XrDebugUtilsMessengerCreateInfoEXT create(long address) {
        return new XrDebugUtilsMessengerCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrDebugUtilsMessengerCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrDebugUtilsMessengerCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrDebugUtilsMessengerCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCreateInfoEXT malloc(MemoryStack stack) {
        return new XrDebugUtilsMessengerCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrDebugUtilsMessengerCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsMessengerCreateInfoEXT calloc(MemoryStack stack) {
        return new XrDebugUtilsMessengerCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsMessengerCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrDebugUtilsMessengerCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #messageSeverities}. */
    public static long nmessageSeverities(long struct) { return memGetLong(struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITIES); }
    /** Unsafe version of {@link #messageTypes}. */
    public static long nmessageTypes(long struct) { return memGetLong(struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGETYPES); }
    /** Unsafe version of {@link #userCallback}. */
    public static XrDebugUtilsMessengerCallbackEXT nuserCallback(long struct) { return XrDebugUtilsMessengerCallbackEXT.create(memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERCALLBACK)); }
    /** Unsafe version of {@link #userData}. */
    public static long nuserData(long struct) { return memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERDATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrDebugUtilsMessengerCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #messageSeverities(long) messageSeverities}. */
    public static void nmessageSeverities(long struct, long value) { memPutLong(struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGESEVERITIES, value); }
    /** Unsafe version of {@link #messageTypes(long) messageTypes}. */
    public static void nmessageTypes(long struct, long value) { memPutLong(struct + XrDebugUtilsMessengerCreateInfoEXT.MESSAGETYPES, value); }
    /** Unsafe version of {@link #userCallback(XrDebugUtilsMessengerCallbackEXTI) userCallback}. */
    public static void nuserCallback(long struct, XrDebugUtilsMessengerCallbackEXTI value) { memPutAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERCALLBACK, value.address()); }
    /** Unsafe version of {@link #userData(long) userData}. */
    public static void nuserData(long struct, long value) { memPutAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrDebugUtilsMessengerCreateInfoEXT.USERCALLBACK));
    }

    // -----------------------------------

    /** An array of {@link XrDebugUtilsMessengerCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrDebugUtilsMessengerCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrDebugUtilsMessengerCreateInfoEXT ELEMENT_FACTORY = XrDebugUtilsMessengerCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrDebugUtilsMessengerCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDebugUtilsMessengerCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrDebugUtilsMessengerCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDebugUtilsMessengerCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrDebugUtilsMessengerCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@code messageSeverities} field. */
        @NativeType("XrDebugUtilsMessageSeverityFlagsEXT")
        public long messageSeverities() { return XrDebugUtilsMessengerCreateInfoEXT.nmessageSeverities(address()); }
        /** @return the value of the {@code messageTypes} field. */
        @NativeType("XrDebugUtilsMessageTypeFlagsEXT")
        public long messageTypes() { return XrDebugUtilsMessengerCreateInfoEXT.nmessageTypes(address()); }
        /** @return the value of the {@code userCallback} field. */
        @NativeType("PFN_xrDebugUtilsMessengerCallbackEXT")
        public XrDebugUtilsMessengerCallbackEXT userCallback() { return XrDebugUtilsMessengerCreateInfoEXT.nuserCallback(address()); }
        /** @return the value of the {@code userData} field. */
        @NativeType("void *")
        public long userData() { return XrDebugUtilsMessengerCreateInfoEXT.nuserData(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrDebugUtilsMessengerCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer type$Default() { return type(EXTDebugUtils.XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrDebugUtilsMessengerCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code messageSeverities} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer messageSeverities(@NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long value) { XrDebugUtilsMessengerCreateInfoEXT.nmessageSeverities(address(), value); return this; }
        /** Sets the specified value to the {@code messageTypes} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer messageTypes(@NativeType("XrDebugUtilsMessageTypeFlagsEXT") long value) { XrDebugUtilsMessengerCreateInfoEXT.nmessageTypes(address(), value); return this; }
        /** Sets the specified value to the {@code userCallback} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer userCallback(@NativeType("PFN_xrDebugUtilsMessengerCallbackEXT") XrDebugUtilsMessengerCallbackEXTI value) { XrDebugUtilsMessengerCreateInfoEXT.nuserCallback(address(), value); return this; }
        /** Sets the specified value to the {@code userData} field. */
        public XrDebugUtilsMessengerCreateInfoEXT.Buffer userData(@NativeType("void *") long value) { XrDebugUtilsMessengerCreateInfoEXT.nuserData(address(), value); return this; }

    }

}