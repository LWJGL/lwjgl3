/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct SpatialAnchorPose_t {
 *     {@link HmdMatrix34 HmdMatrix34_t} mAnchorToAbsoluteTracking;
 * }</code></pre>
 */
@NativeType("struct SpatialAnchorPose_t")
public class SpatialAnchorPose extends Struct<SpatialAnchorPose> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MANCHORTOABSOLUTETRACKING;

    static {
        Layout layout = __struct(
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MANCHORTOABSOLUTETRACKING = layout.offsetof(0);
    }

    protected SpatialAnchorPose(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpatialAnchorPose create(long address, @Nullable ByteBuffer container) {
        return new SpatialAnchorPose(address, container);
    }

    /**
     * Creates a {@code SpatialAnchorPose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpatialAnchorPose(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link HmdMatrix34} view of the {@code mAnchorToAbsoluteTracking} field. */
    @NativeType("HmdMatrix34_t")
    public HmdMatrix34 mAnchorToAbsoluteTracking() { return nmAnchorToAbsoluteTracking(address()); }

    // -----------------------------------

    /** Returns a new {@code SpatialAnchorPose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpatialAnchorPose malloc() {
        return new SpatialAnchorPose(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpatialAnchorPose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpatialAnchorPose calloc() {
        return new SpatialAnchorPose(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpatialAnchorPose} instance allocated with {@link BufferUtils}. */
    public static SpatialAnchorPose create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpatialAnchorPose(memAddress(container), container);
    }

    /** Returns a new {@code SpatialAnchorPose} instance for the specified memory address. */
    public static SpatialAnchorPose create(long address) {
        return new SpatialAnchorPose(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpatialAnchorPose createSafe(long address) {
        return address == NULL ? null : new SpatialAnchorPose(address, null);
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpatialAnchorPose.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpatialAnchorPose.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SpatialAnchorPose mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SpatialAnchorPose callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SpatialAnchorPose mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SpatialAnchorPose callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SpatialAnchorPose.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SpatialAnchorPose.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SpatialAnchorPose.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SpatialAnchorPose.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code SpatialAnchorPose} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpatialAnchorPose malloc(MemoryStack stack) {
        return new SpatialAnchorPose(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpatialAnchorPose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpatialAnchorPose calloc(MemoryStack stack) {
        return new SpatialAnchorPose(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mAnchorToAbsoluteTracking}. */
    public static HmdMatrix34 nmAnchorToAbsoluteTracking(long struct) { return HmdMatrix34.create(struct + SpatialAnchorPose.MANCHORTOABSOLUTETRACKING); }

    // -----------------------------------

    /** An array of {@link SpatialAnchorPose} structs. */
    public static class Buffer extends StructBuffer<SpatialAnchorPose, Buffer> implements NativeResource {

        private static final SpatialAnchorPose ELEMENT_FACTORY = SpatialAnchorPose.create(-1L);

        /**
         * Creates a new {@code SpatialAnchorPose.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpatialAnchorPose#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpatialAnchorPose getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link HmdMatrix34} view of the {@code mAnchorToAbsoluteTracking} field. */
        @NativeType("HmdMatrix34_t")
        public HmdMatrix34 mAnchorToAbsoluteTracking() { return SpatialAnchorPose.nmAnchorToAbsoluteTracking(address()); }

    }

}