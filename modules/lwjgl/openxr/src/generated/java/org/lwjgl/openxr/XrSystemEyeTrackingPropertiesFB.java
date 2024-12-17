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
 * struct XrSystemEyeTrackingPropertiesFB {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsEyeTracking;
 * }}</pre>
 */
public class XrSystemEyeTrackingPropertiesFB extends Struct<XrSystemEyeTrackingPropertiesFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSEYETRACKING;

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
        SUPPORTSEYETRACKING = layout.offsetof(2);
    }

    protected XrSystemEyeTrackingPropertiesFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemEyeTrackingPropertiesFB create(long address, @Nullable ByteBuffer container) {
        return new XrSystemEyeTrackingPropertiesFB(address, container);
    }

    /**
     * Creates a {@code XrSystemEyeTrackingPropertiesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemEyeTrackingPropertiesFB(ByteBuffer container) {
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
    /** @return the value of the {@code supportsEyeTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsEyeTracking() { return nsupportsEyeTracking(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemEyeTrackingPropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBEyeTrackingSocial#XR_TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB} value to the {@code type} field. */
    public XrSystemEyeTrackingPropertiesFB type$Default() { return type(FBEyeTrackingSocial.XR_TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemEyeTrackingPropertiesFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemEyeTrackingPropertiesFB set(
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
    public XrSystemEyeTrackingPropertiesFB set(XrSystemEyeTrackingPropertiesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemEyeTrackingPropertiesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemEyeTrackingPropertiesFB malloc() {
        return new XrSystemEyeTrackingPropertiesFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemEyeTrackingPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemEyeTrackingPropertiesFB calloc() {
        return new XrSystemEyeTrackingPropertiesFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemEyeTrackingPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrSystemEyeTrackingPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemEyeTrackingPropertiesFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemEyeTrackingPropertiesFB} instance for the specified memory address. */
    public static XrSystemEyeTrackingPropertiesFB create(long address) {
        return new XrSystemEyeTrackingPropertiesFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemEyeTrackingPropertiesFB createSafe(long address) {
        return address == NULL ? null : new XrSystemEyeTrackingPropertiesFB(address, null);
    }

    /**
     * Returns a new {@link XrSystemEyeTrackingPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeTrackingPropertiesFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemEyeTrackingPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeTrackingPropertiesFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemEyeTrackingPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeTrackingPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemEyeTrackingPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeTrackingPropertiesFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemEyeTrackingPropertiesFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemEyeTrackingPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemEyeTrackingPropertiesFB malloc(MemoryStack stack) {
        return new XrSystemEyeTrackingPropertiesFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemEyeTrackingPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemEyeTrackingPropertiesFB calloc(MemoryStack stack) {
        return new XrSystemEyeTrackingPropertiesFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemEyeTrackingPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeTrackingPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemEyeTrackingPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeTrackingPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemEyeTrackingPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemEyeTrackingPropertiesFB.NEXT); }
    /** Unsafe version of {@link #supportsEyeTracking}. */
    public static int nsupportsEyeTracking(long struct) { return memGetInt(struct + XrSystemEyeTrackingPropertiesFB.SUPPORTSEYETRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemEyeTrackingPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemEyeTrackingPropertiesFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemEyeTrackingPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrSystemEyeTrackingPropertiesFB, Buffer> implements NativeResource {

        private static final XrSystemEyeTrackingPropertiesFB ELEMENT_FACTORY = XrSystemEyeTrackingPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrSystemEyeTrackingPropertiesFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemEyeTrackingPropertiesFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemEyeTrackingPropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemEyeTrackingPropertiesFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemEyeTrackingPropertiesFB.nnext(address()); }
        /** @return the value of the {@code supportsEyeTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsEyeTracking() { return XrSystemEyeTrackingPropertiesFB.nsupportsEyeTracking(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemEyeTrackingPropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemEyeTrackingPropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBEyeTrackingSocial#XR_TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB} value to the {@code type} field. */
        public XrSystemEyeTrackingPropertiesFB.Buffer type$Default() { return type(FBEyeTrackingSocial.XR_TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemEyeTrackingPropertiesFB.Buffer next(@NativeType("void *") long value) { XrSystemEyeTrackingPropertiesFB.nnext(address(), value); return this; }

    }

}