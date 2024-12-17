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
 * struct XrSystemFaceTrackingProperties2FB {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsVisualFaceTracking;
 *     XrBool32 supportsAudioFaceTracking;
 * }}</pre>
 */
public class XrSystemFaceTrackingProperties2FB extends Struct<XrSystemFaceTrackingProperties2FB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSVISUALFACETRACKING,
        SUPPORTSAUDIOFACETRACKING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSVISUALFACETRACKING = layout.offsetof(2);
        SUPPORTSAUDIOFACETRACKING = layout.offsetof(3);
    }

    protected XrSystemFaceTrackingProperties2FB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemFaceTrackingProperties2FB create(long address, @Nullable ByteBuffer container) {
        return new XrSystemFaceTrackingProperties2FB(address, container);
    }

    /**
     * Creates a {@code XrSystemFaceTrackingProperties2FB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemFaceTrackingProperties2FB(ByteBuffer container) {
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
    /** @return the value of the {@code supportsVisualFaceTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsVisualFaceTracking() { return nsupportsVisualFaceTracking(address()) != 0; }
    /** @return the value of the {@code supportsAudioFaceTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsAudioFaceTracking() { return nsupportsAudioFaceTracking(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemFaceTrackingProperties2FB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFaceTracking2#XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB} value to the {@code type} field. */
    public XrSystemFaceTrackingProperties2FB type$Default() { return type(FBFaceTracking2.XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemFaceTrackingProperties2FB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemFaceTrackingProperties2FB set(
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
    public XrSystemFaceTrackingProperties2FB set(XrSystemFaceTrackingProperties2FB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemFaceTrackingProperties2FB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemFaceTrackingProperties2FB malloc() {
        return new XrSystemFaceTrackingProperties2FB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemFaceTrackingProperties2FB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemFaceTrackingProperties2FB calloc() {
        return new XrSystemFaceTrackingProperties2FB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemFaceTrackingProperties2FB} instance allocated with {@link BufferUtils}. */
    public static XrSystemFaceTrackingProperties2FB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemFaceTrackingProperties2FB(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemFaceTrackingProperties2FB} instance for the specified memory address. */
    public static XrSystemFaceTrackingProperties2FB create(long address) {
        return new XrSystemFaceTrackingProperties2FB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemFaceTrackingProperties2FB createSafe(long address) {
        return address == NULL ? null : new XrSystemFaceTrackingProperties2FB(address, null);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingProperties2FB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingProperties2FB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingProperties2FB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingProperties2FB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingProperties2FB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingProperties2FB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemFaceTrackingProperties2FB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingProperties2FB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemFaceTrackingProperties2FB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemFaceTrackingProperties2FB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFaceTrackingProperties2FB malloc(MemoryStack stack) {
        return new XrSystemFaceTrackingProperties2FB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemFaceTrackingProperties2FB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFaceTrackingProperties2FB calloc(MemoryStack stack) {
        return new XrSystemFaceTrackingProperties2FB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingProperties2FB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingProperties2FB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingProperties2FB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingProperties2FB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemFaceTrackingProperties2FB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemFaceTrackingProperties2FB.NEXT); }
    /** Unsafe version of {@link #supportsVisualFaceTracking}. */
    public static int nsupportsVisualFaceTracking(long struct) { return memGetInt(struct + XrSystemFaceTrackingProperties2FB.SUPPORTSVISUALFACETRACKING); }
    /** Unsafe version of {@link #supportsAudioFaceTracking}. */
    public static int nsupportsAudioFaceTracking(long struct) { return memGetInt(struct + XrSystemFaceTrackingProperties2FB.SUPPORTSAUDIOFACETRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemFaceTrackingProperties2FB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemFaceTrackingProperties2FB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemFaceTrackingProperties2FB} structs. */
    public static class Buffer extends StructBuffer<XrSystemFaceTrackingProperties2FB, Buffer> implements NativeResource {

        private static final XrSystemFaceTrackingProperties2FB ELEMENT_FACTORY = XrSystemFaceTrackingProperties2FB.create(-1L);

        /**
         * Creates a new {@code XrSystemFaceTrackingProperties2FB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemFaceTrackingProperties2FB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemFaceTrackingProperties2FB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemFaceTrackingProperties2FB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemFaceTrackingProperties2FB.nnext(address()); }
        /** @return the value of the {@code supportsVisualFaceTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsVisualFaceTracking() { return XrSystemFaceTrackingProperties2FB.nsupportsVisualFaceTracking(address()) != 0; }
        /** @return the value of the {@code supportsAudioFaceTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsAudioFaceTracking() { return XrSystemFaceTrackingProperties2FB.nsupportsAudioFaceTracking(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemFaceTrackingProperties2FB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemFaceTrackingProperties2FB.ntype(address(), value); return this; }
        /** Sets the {@link FBFaceTracking2#XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB} value to the {@code type} field. */
        public XrSystemFaceTrackingProperties2FB.Buffer type$Default() { return type(FBFaceTracking2.XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemFaceTrackingProperties2FB.Buffer next(@NativeType("void *") long value) { XrSystemFaceTrackingProperties2FB.nnext(address(), value); return this; }

    }

}