/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VmaDefragmentationPassMoveInfo {
 *     uint32_t moveCount;
 *     {@link VmaDefragmentationMove VmaDefragmentationMove} * pMoves;
 * }}</pre>
 */
public class VmaDefragmentationPassMoveInfo extends Struct<VmaDefragmentationPassMoveInfo> implements NativeResource {

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

    protected VmaDefragmentationPassMoveInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaDefragmentationPassMoveInfo create(long address, @Nullable ByteBuffer container) {
        return new VmaDefragmentationPassMoveInfo(address, container);
    }

    /**
     * Creates a {@code VmaDefragmentationPassMoveInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDefragmentationPassMoveInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code moveCount} field. */
    @NativeType("uint32_t")
    public int moveCount() { return nmoveCount(address()); }
    /** @return a {@link VmaDefragmentationMove.Buffer} view of the struct array pointed to by the {@code pMoves} field. */
    @NativeType("VmaDefragmentationMove *")
    public VmaDefragmentationMove.@Nullable Buffer pMoves() { return npMoves(address()); }

    /** Sets the specified value to the {@code moveCount} field. */
    public VmaDefragmentationPassMoveInfo moveCount(@NativeType("uint32_t") int value) { nmoveCount(address(), value); return this; }
    /** Sets the address of the specified {@link VmaDefragmentationMove.Buffer} to the {@code pMoves} field. */
    public VmaDefragmentationPassMoveInfo pMoves(@NativeType("VmaDefragmentationMove *") VmaDefragmentationMove.@Nullable Buffer value) { npMoves(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaDefragmentationPassMoveInfo set(
        int moveCount,
        VmaDefragmentationMove.@Nullable Buffer pMoves
    ) {
        moveCount(moveCount);
        pMoves(pMoves);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaDefragmentationPassMoveInfo set(VmaDefragmentationPassMoveInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaDefragmentationPassMoveInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationPassMoveInfo malloc() {
        return new VmaDefragmentationPassMoveInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaDefragmentationPassMoveInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationPassMoveInfo calloc() {
        return new VmaDefragmentationPassMoveInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaDefragmentationPassMoveInfo} instance allocated with {@link BufferUtils}. */
    public static VmaDefragmentationPassMoveInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaDefragmentationPassMoveInfo(memAddress(container), container);
    }

    /** Returns a new {@code VmaDefragmentationPassMoveInfo} instance for the specified memory address. */
    public static VmaDefragmentationPassMoveInfo create(long address) {
        return new VmaDefragmentationPassMoveInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VmaDefragmentationPassMoveInfo createSafe(long address) {
        return address == NULL ? null : new VmaDefragmentationPassMoveInfo(address, null);
    }

    /**
     * Returns a new {@link VmaDefragmentationPassMoveInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassMoveInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationPassMoveInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassMoveInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationPassMoveInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassMoveInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaDefragmentationPassMoveInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassMoveInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VmaDefragmentationPassMoveInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VmaDefragmentationPassMoveInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationPassMoveInfo malloc(MemoryStack stack) {
        return new VmaDefragmentationPassMoveInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaDefragmentationPassMoveInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationPassMoveInfo calloc(MemoryStack stack) {
        return new VmaDefragmentationPassMoveInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaDefragmentationPassMoveInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassMoveInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationPassMoveInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassMoveInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #moveCount}. */
    public static int nmoveCount(long struct) { return memGetInt(struct + VmaDefragmentationPassMoveInfo.MOVECOUNT); }
    /** Unsafe version of {@link #pMoves}. */
    public static VmaDefragmentationMove.@Nullable Buffer npMoves(long struct) { return VmaDefragmentationMove.createSafe(memGetAddress(struct + VmaDefragmentationPassMoveInfo.PMOVES), nmoveCount(struct)); }

    /** Sets the specified value to the {@code moveCount} field of the specified {@code struct}. */
    public static void nmoveCount(long struct, int value) { memPutInt(struct + VmaDefragmentationPassMoveInfo.MOVECOUNT, value); }
    /** Unsafe version of {@link #pMoves(VmaDefragmentationMove.Buffer) pMoves}. */
    public static void npMoves(long struct, VmaDefragmentationMove.@Nullable Buffer value) { memPutAddress(struct + VmaDefragmentationPassMoveInfo.PMOVES, memAddressSafe(value)); nmoveCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int moveCount = nmoveCount(struct);
        long pMoves = memGetAddress(struct + VmaDefragmentationPassMoveInfo.PMOVES);
        if (pMoves != NULL) {
            validate(pMoves, moveCount, VmaDefragmentationMove.SIZEOF, VmaDefragmentationMove::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VmaDefragmentationPassMoveInfo} structs. */
    public static class Buffer extends StructBuffer<VmaDefragmentationPassMoveInfo, Buffer> implements NativeResource {

        private static final VmaDefragmentationPassMoveInfo ELEMENT_FACTORY = VmaDefragmentationPassMoveInfo.create(-1L);

        /**
         * Creates a new {@code VmaDefragmentationPassMoveInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDefragmentationPassMoveInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VmaDefragmentationPassMoveInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code moveCount} field. */
        @NativeType("uint32_t")
        public int moveCount() { return VmaDefragmentationPassMoveInfo.nmoveCount(address()); }
        /** @return a {@link VmaDefragmentationMove.Buffer} view of the struct array pointed to by the {@code pMoves} field. */
        @NativeType("VmaDefragmentationMove *")
        public VmaDefragmentationMove.@Nullable Buffer pMoves() { return VmaDefragmentationPassMoveInfo.npMoves(address()); }

        /** Sets the specified value to the {@code moveCount} field. */
        public VmaDefragmentationPassMoveInfo.Buffer moveCount(@NativeType("uint32_t") int value) { VmaDefragmentationPassMoveInfo.nmoveCount(address(), value); return this; }
        /** Sets the address of the specified {@link VmaDefragmentationMove.Buffer} to the {@code pMoves} field. */
        public VmaDefragmentationPassMoveInfo.Buffer pMoves(@NativeType("VmaDefragmentationMove *") VmaDefragmentationMove.@Nullable Buffer value) { VmaDefragmentationPassMoveInfo.npMoves(address(), value); return this; }

    }

}