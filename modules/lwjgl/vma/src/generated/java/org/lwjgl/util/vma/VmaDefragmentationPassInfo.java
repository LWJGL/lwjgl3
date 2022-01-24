/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Parameters for incremental defragmentation steps.
 * 
 * <p>To be used with function {@link Vma#vmaBeginDefragmentationPass BeginDefragmentationPass}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaDefragmentationPassInfo {
 *     uint32_t moveCount;
 *     {@link VmaDefragmentationPassMoveInfo VmaDefragmentationPassMoveInfo} * pMoves;
 * }</code></pre>
 */
public class VmaDefragmentationPassInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MOVECOUNT,
        PMOVES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MOVECOUNT = layout.offsetof(0);
        PMOVES = layout.offsetof(1);
    }

    /**
     * Creates a {@code VmaDefragmentationPassInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDefragmentationPassInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code moveCount} field. */
    @NativeType("uint32_t")
    public int moveCount() { return nmoveCount(address()); }
    /** @return a {@link VmaDefragmentationPassMoveInfo.Buffer} view of the struct array pointed to by the {@code pMoves} field. */
    @NativeType("VmaDefragmentationPassMoveInfo *")
    public VmaDefragmentationPassMoveInfo.Buffer pMoves() { return npMoves(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaDefragmentationPassInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationPassInfo malloc() {
        return wrap(VmaDefragmentationPassInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationPassInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationPassInfo calloc() {
        return wrap(VmaDefragmentationPassInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationPassInfo} instance allocated with {@link BufferUtils}. */
    public static VmaDefragmentationPassInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaDefragmentationPassInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaDefragmentationPassInfo} instance for the specified memory address. */
    public static VmaDefragmentationPassInfo create(long address) {
        return wrap(VmaDefragmentationPassInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationPassInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaDefragmentationPassInfo.class, address);
    }

    /**
     * Returns a new {@link VmaDefragmentationPassInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationPassInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationPassInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaDefragmentationPassInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationPassInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VmaDefragmentationPassInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationPassInfo malloc(MemoryStack stack) {
        return wrap(VmaDefragmentationPassInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaDefragmentationPassInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationPassInfo calloc(MemoryStack stack) {
        return wrap(VmaDefragmentationPassInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaDefragmentationPassInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationPassInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #moveCount}. */
    public static int nmoveCount(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationPassInfo.MOVECOUNT); }
    /** Unsafe version of {@link #pMoves}. */
    public static VmaDefragmentationPassMoveInfo.Buffer npMoves(long struct) { return VmaDefragmentationPassMoveInfo.create(memGetAddress(struct + VmaDefragmentationPassInfo.PMOVES), nmoveCount(struct)); }

    // -----------------------------------

    /** An array of {@link VmaDefragmentationPassInfo} structs. */
    public static class Buffer extends StructBuffer<VmaDefragmentationPassInfo, Buffer> implements NativeResource {

        private static final VmaDefragmentationPassInfo ELEMENT_FACTORY = VmaDefragmentationPassInfo.create(-1L);

        /**
         * Creates a new {@code VmaDefragmentationPassInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDefragmentationPassInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaDefragmentationPassInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code moveCount} field. */
        @NativeType("uint32_t")
        public int moveCount() { return VmaDefragmentationPassInfo.nmoveCount(address()); }
        /** @return a {@link VmaDefragmentationPassMoveInfo.Buffer} view of the struct array pointed to by the {@code pMoves} field. */
        @NativeType("VmaDefragmentationPassMoveInfo *")
        public VmaDefragmentationPassMoveInfo.Buffer pMoves() { return VmaDefragmentationPassInfo.npMoves(address()); }

    }

}