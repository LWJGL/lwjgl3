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
public class SpatialAnchorPose extends Struct implements NativeResource {

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

    SpatialAnchorPose(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link SpatialAnchorPose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpatialAnchorPose(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdMatrix34} view of the {@code mAnchorToAbsoluteTracking} field. */
    @NativeType("HmdMatrix34_t")
    public HmdMatrix34 mAnchorToAbsoluteTracking() { return nmAnchorToAbsoluteTracking(address()); }
    /** Passes the {@code mAnchorToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SpatialAnchorPose mAnchorToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mAnchorToAbsoluteTracking()); return this; }

    // -----------------------------------

    /** Returns a new {@link SpatialAnchorPose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpatialAnchorPose malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link SpatialAnchorPose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpatialAnchorPose calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link SpatialAnchorPose} instance allocated with {@link BufferUtils}. */
    public static SpatialAnchorPose create() {
        return new SpatialAnchorPose(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link SpatialAnchorPose} instance for the specified memory address. */
    public static SpatialAnchorPose create(long address) {
        return new SpatialAnchorPose(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpatialAnchorPose createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link SpatialAnchorPose} instance allocated on the thread-local {@link MemoryStack}. */
    public static SpatialAnchorPose mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link SpatialAnchorPose} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static SpatialAnchorPose callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link SpatialAnchorPose} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpatialAnchorPose mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link SpatialAnchorPose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpatialAnchorPose callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpatialAnchorPose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpatialAnchorPose.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mAnchorToAbsoluteTracking}. */
    public static HmdMatrix34 nmAnchorToAbsoluteTracking(long struct) { return HmdMatrix34.create(struct + SpatialAnchorPose.MANCHORTOABSOLUTETRACKING); }

    // -----------------------------------

    /** An array of {@link SpatialAnchorPose} structs. */
    public static class Buffer extends StructBuffer<SpatialAnchorPose, Buffer> implements NativeResource {

        /**
         * Creates a new {@link SpatialAnchorPose.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpatialAnchorPose#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected SpatialAnchorPose newInstance(long address) {
            return new SpatialAnchorPose(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdMatrix34} view of the {@code mAnchorToAbsoluteTracking} field. */
        @NativeType("HmdMatrix34_t")
        public HmdMatrix34 mAnchorToAbsoluteTracking() { return SpatialAnchorPose.nmAnchorToAbsoluteTracking(address()); }
        /** Passes the {@code mAnchorToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SpatialAnchorPose.Buffer mAnchorToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mAnchorToAbsoluteTracking()); return this; }

    }

}