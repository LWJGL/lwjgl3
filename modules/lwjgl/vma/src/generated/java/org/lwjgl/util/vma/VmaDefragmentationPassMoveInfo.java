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
 * struct VmaDefragmentationPassMoveInfo {
 *     uint32_t {@link #moveCount};
 *     {@link VmaDefragmentationMove VmaDefragmentationMove} * {@link #pMoves};
 * }</code></pre>
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

    /** number of elements in the {@code pMoves} array. */
    @NativeType("uint32_t")
    public int moveCount() { return nmoveCount(address()); }
    /**
     * array of moves to be performed by the user in the current defragmentation pass.
     * 
     * <p>Pointer to an array of {@code moveCount} elements, owned by VMA, created in {@link Vma#vmaBeginDefragmentationPass BeginDefragmentationPass}, destroyed in {@link Vma#vmaEndDefragmentationPass EndDefragmentationPass}.</p>
     * 
     * <p>For each element, you should:</p>
     * 
     * <ol>
     * <li>Create a new buffer/image in the place pointed by {@link VmaDefragmentationMove}{@code ::dstMemory} + {@code VmaDefragmentationMove::dstOffset}.</li>
     * <li>Copy data from the {@code VmaDefragmentationMove::srcAllocation} e.g. using {@code vkCmdCopyBuffer}, {@code vkCmdCopyImage}.</li>
     * <li>Make sure these commands finished executing on the GPU.</li>
     * <li>Destroy the old buffer/image.</li>
     * </ol>
     * 
     * <p>Only then you can finish defragmentation pass by calling {@code vmaEndDefragmentationPass()}. After this call, the allocation will point to the new
     * place in memory.</p>
     * 
     * <p>Alternatively, if you cannot move specific allocation, you can set {@code VmaDefragmentationMove::operation} to
     * {@link Vma#VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE DEFRAGMENTATION_MOVE_OPERATION_IGNORE}.</p>
     * 
     * <p>Alternatively, if you decide you want to completely remove the allocation:</p>
     * 
     * <ol>
     * <li>Destroy its buffer/image.</li>
     * <li>Set {@code VmaDefragmentationMove::operation} to {@link Vma#VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY DEFRAGMENTATION_MOVE_OPERATION_DESTROY}.</li>
     * </ol>
     * 
     * <p>Then, after {@code vmaEndDefragmentationPass()} the allocation will be freed.</p>
     */
    @Nullable
    @NativeType("VmaDefragmentationMove *")
    public VmaDefragmentationMove.Buffer pMoves() { return npMoves(address()); }

    /** Sets the specified value to the {@link #moveCount} field. */
    public VmaDefragmentationPassMoveInfo moveCount(@NativeType("uint32_t") int value) { nmoveCount(address(), value); return this; }
    /** Sets the address of the specified {@link VmaDefragmentationMove.Buffer} to the {@link #pMoves} field. */
    public VmaDefragmentationPassMoveInfo pMoves(@Nullable @NativeType("VmaDefragmentationMove *") VmaDefragmentationMove.Buffer value) { npMoves(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaDefragmentationPassMoveInfo set(
        int moveCount,
        @Nullable VmaDefragmentationMove.Buffer pMoves
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
    @Nullable
    public static VmaDefragmentationPassMoveInfo createSafe(long address) {
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
    @Nullable
    public static VmaDefragmentationPassMoveInfo.Buffer createSafe(long address, int capacity) {
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
    public static int nmoveCount(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationPassMoveInfo.MOVECOUNT); }
    /** Unsafe version of {@link #pMoves}. */
    @Nullable public static VmaDefragmentationMove.Buffer npMoves(long struct) { return VmaDefragmentationMove.createSafe(memGetAddress(struct + VmaDefragmentationPassMoveInfo.PMOVES), nmoveCount(struct)); }

    /** Sets the specified value to the {@code moveCount} field of the specified {@code struct}. */
    public static void nmoveCount(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationPassMoveInfo.MOVECOUNT, value); }
    /** Unsafe version of {@link #pMoves(VmaDefragmentationMove.Buffer) pMoves}. */
    public static void npMoves(long struct, @Nullable VmaDefragmentationMove.Buffer value) { memPutAddress(struct + VmaDefragmentationPassMoveInfo.PMOVES, memAddressSafe(value)); nmoveCount(struct, value == null ? 0 : value.remaining()); }

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
        protected VmaDefragmentationPassMoveInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaDefragmentationPassMoveInfo#moveCount} field. */
        @NativeType("uint32_t")
        public int moveCount() { return VmaDefragmentationPassMoveInfo.nmoveCount(address()); }
        /** @return a {@link VmaDefragmentationMove.Buffer} view of the struct array pointed to by the {@link VmaDefragmentationPassMoveInfo#pMoves} field. */
        @Nullable
        @NativeType("VmaDefragmentationMove *")
        public VmaDefragmentationMove.Buffer pMoves() { return VmaDefragmentationPassMoveInfo.npMoves(address()); }

        /** Sets the specified value to the {@link VmaDefragmentationPassMoveInfo#moveCount} field. */
        public VmaDefragmentationPassMoveInfo.Buffer moveCount(@NativeType("uint32_t") int value) { VmaDefragmentationPassMoveInfo.nmoveCount(address(), value); return this; }
        /** Sets the address of the specified {@link VmaDefragmentationMove.Buffer} to the {@link VmaDefragmentationPassMoveInfo#pMoves} field. */
        public VmaDefragmentationPassMoveInfo.Buffer pMoves(@Nullable @NativeType("VmaDefragmentationMove *") VmaDefragmentationMove.Buffer value) { VmaDefragmentationPassMoveInfo.npMoves(address(), value); return this; }

    }

}