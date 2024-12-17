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
 * struct XrSystemKeyboardTrackingPropertiesFB {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsKeyboardTracking;
 * }}</pre>
 */
public class XrSystemKeyboardTrackingPropertiesFB extends Struct<XrSystemKeyboardTrackingPropertiesFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSKEYBOARDTRACKING;

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
        SUPPORTSKEYBOARDTRACKING = layout.offsetof(2);
    }

    protected XrSystemKeyboardTrackingPropertiesFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemKeyboardTrackingPropertiesFB create(long address, @Nullable ByteBuffer container) {
        return new XrSystemKeyboardTrackingPropertiesFB(address, container);
    }

    /**
     * Creates a {@code XrSystemKeyboardTrackingPropertiesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemKeyboardTrackingPropertiesFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code supportsKeyboardTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsKeyboardTracking() { return nsupportsKeyboardTracking(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemKeyboardTrackingPropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBKeyboardTracking#XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB} value to the {@code type} field. */
    public XrSystemKeyboardTrackingPropertiesFB type$Default() { return type(FBKeyboardTracking.XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemKeyboardTrackingPropertiesFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemKeyboardTrackingPropertiesFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemKeyboardTrackingPropertiesFB set(XrSystemKeyboardTrackingPropertiesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemKeyboardTrackingPropertiesFB malloc() {
        return new XrSystemKeyboardTrackingPropertiesFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemKeyboardTrackingPropertiesFB calloc() {
        return new XrSystemKeyboardTrackingPropertiesFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrSystemKeyboardTrackingPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemKeyboardTrackingPropertiesFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance for the specified memory address. */
    public static XrSystemKeyboardTrackingPropertiesFB create(long address) {
        return new XrSystemKeyboardTrackingPropertiesFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemKeyboardTrackingPropertiesFB createSafe(long address) {
        return address == NULL ? null : new XrSystemKeyboardTrackingPropertiesFB(address, null);
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemKeyboardTrackingPropertiesFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemKeyboardTrackingPropertiesFB malloc(MemoryStack stack) {
        return new XrSystemKeyboardTrackingPropertiesFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemKeyboardTrackingPropertiesFB calloc(MemoryStack stack) {
        return new XrSystemKeyboardTrackingPropertiesFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemKeyboardTrackingPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemKeyboardTrackingPropertiesFB.NEXT); }
    /** Unsafe version of {@link #supportsKeyboardTracking}. */
    public static int nsupportsKeyboardTracking(long struct) { return memGetInt(struct + XrSystemKeyboardTrackingPropertiesFB.SUPPORTSKEYBOARDTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemKeyboardTrackingPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemKeyboardTrackingPropertiesFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemKeyboardTrackingPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrSystemKeyboardTrackingPropertiesFB, Buffer> implements NativeResource {

        private static final XrSystemKeyboardTrackingPropertiesFB ELEMENT_FACTORY = XrSystemKeyboardTrackingPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrSystemKeyboardTrackingPropertiesFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemKeyboardTrackingPropertiesFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemKeyboardTrackingPropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemKeyboardTrackingPropertiesFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemKeyboardTrackingPropertiesFB.nnext(address()); }
        /** @return the value of the {@code supportsKeyboardTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsKeyboardTracking() { return XrSystemKeyboardTrackingPropertiesFB.nsupportsKeyboardTracking(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemKeyboardTrackingPropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemKeyboardTrackingPropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBKeyboardTracking#XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB} value to the {@code type} field. */
        public XrSystemKeyboardTrackingPropertiesFB.Buffer type$Default() { return type(FBKeyboardTracking.XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemKeyboardTrackingPropertiesFB.Buffer next(@NativeType("void *") long value) { XrSystemKeyboardTrackingPropertiesFB.nnext(address(), value); return this; }

    }

}