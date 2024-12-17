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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSystemNotificationsSetInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 suppressNotifications;
 * }}</pre>
 */
public class XrSystemNotificationsSetInfoML extends Struct<XrSystemNotificationsSetInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPRESSNOTIFICATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPRESSNOTIFICATIONS = layout.offsetof(2);
    }

    protected XrSystemNotificationsSetInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemNotificationsSetInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrSystemNotificationsSetInfoML(address, container);
    }

    /**
     * Creates a {@code XrSystemNotificationsSetInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemNotificationsSetInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code suppressNotifications} field. */
    @NativeType("XrBool32")
    public boolean suppressNotifications() { return nsuppressNotifications(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemNotificationsSetInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSystemNotifications#XR_TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML} value to the {@code type} field. */
    public XrSystemNotificationsSetInfoML type$Default() { return type(MLSystemNotifications.XR_TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemNotificationsSetInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code suppressNotifications} field. */
    public XrSystemNotificationsSetInfoML suppressNotifications(@NativeType("XrBool32") boolean value) { nsuppressNotifications(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemNotificationsSetInfoML set(
        int type,
        long next,
        boolean suppressNotifications
    ) {
        type(type);
        next(next);
        suppressNotifications(suppressNotifications);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemNotificationsSetInfoML set(XrSystemNotificationsSetInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemNotificationsSetInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemNotificationsSetInfoML malloc() {
        return new XrSystemNotificationsSetInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemNotificationsSetInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemNotificationsSetInfoML calloc() {
        return new XrSystemNotificationsSetInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemNotificationsSetInfoML} instance allocated with {@link BufferUtils}. */
    public static XrSystemNotificationsSetInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemNotificationsSetInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemNotificationsSetInfoML} instance for the specified memory address. */
    public static XrSystemNotificationsSetInfoML create(long address) {
        return new XrSystemNotificationsSetInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemNotificationsSetInfoML createSafe(long address) {
        return address == NULL ? null : new XrSystemNotificationsSetInfoML(address, null);
    }

    /**
     * Returns a new {@link XrSystemNotificationsSetInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemNotificationsSetInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemNotificationsSetInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemNotificationsSetInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemNotificationsSetInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemNotificationsSetInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemNotificationsSetInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemNotificationsSetInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemNotificationsSetInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemNotificationsSetInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemNotificationsSetInfoML malloc(MemoryStack stack) {
        return new XrSystemNotificationsSetInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemNotificationsSetInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemNotificationsSetInfoML calloc(MemoryStack stack) {
        return new XrSystemNotificationsSetInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemNotificationsSetInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemNotificationsSetInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemNotificationsSetInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemNotificationsSetInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemNotificationsSetInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemNotificationsSetInfoML.NEXT); }
    /** Unsafe version of {@link #suppressNotifications}. */
    public static int nsuppressNotifications(long struct) { return memGetInt(struct + XrSystemNotificationsSetInfoML.SUPPRESSNOTIFICATIONS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemNotificationsSetInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemNotificationsSetInfoML.NEXT, value); }
    /** Unsafe version of {@link #suppressNotifications(boolean) suppressNotifications}. */
    public static void nsuppressNotifications(long struct, int value) { memPutInt(struct + XrSystemNotificationsSetInfoML.SUPPRESSNOTIFICATIONS, value); }

    // -----------------------------------

    /** An array of {@link XrSystemNotificationsSetInfoML} structs. */
    public static class Buffer extends StructBuffer<XrSystemNotificationsSetInfoML, Buffer> implements NativeResource {

        private static final XrSystemNotificationsSetInfoML ELEMENT_FACTORY = XrSystemNotificationsSetInfoML.create(-1L);

        /**
         * Creates a new {@code XrSystemNotificationsSetInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemNotificationsSetInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemNotificationsSetInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemNotificationsSetInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSystemNotificationsSetInfoML.nnext(address()); }
        /** @return the value of the {@code suppressNotifications} field. */
        @NativeType("XrBool32")
        public boolean suppressNotifications() { return XrSystemNotificationsSetInfoML.nsuppressNotifications(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemNotificationsSetInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrSystemNotificationsSetInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLSystemNotifications#XR_TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML} value to the {@code type} field. */
        public XrSystemNotificationsSetInfoML.Buffer type$Default() { return type(MLSystemNotifications.XR_TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemNotificationsSetInfoML.Buffer next(@NativeType("void const *") long value) { XrSystemNotificationsSetInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code suppressNotifications} field. */
        public XrSystemNotificationsSetInfoML.Buffer suppressNotifications(@NativeType("XrBool32") boolean value) { XrSystemNotificationsSetInfoML.nsuppressNotifications(address(), value ? 1 : 0); return this; }

    }

}