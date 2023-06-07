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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Single move of an allocation to be done for defragmentation.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaDefragmentationMove {
 *     VmaDefragmentationMoveOperation {@link #operation};
 *     VmaAllocation {@link #srcAllocation};
 *     VmaAllocation {@link #dstTmpAllocation};
 * }</code></pre>
 */
public class VmaDefragmentationMove extends Struct<VmaDefragmentationMove> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPERATION,
        SRCALLOCATION,
        DSTTMPALLOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPERATION = layout.offsetof(0);
        SRCALLOCATION = layout.offsetof(1);
        DSTTMPALLOCATION = layout.offsetof(2);
    }

    protected VmaDefragmentationMove(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaDefragmentationMove create(long address, @Nullable ByteBuffer container) {
        return new VmaDefragmentationMove(address, container);
    }

    /**
     * Creates a {@code VmaDefragmentationMove} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDefragmentationMove(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * operation to be performed on the allocation by {@link Vma#vmaEndDefragmentationPass EndDefragmentationPass}.
     * 
     * <p>Default value is {@link Vma#VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY DEFRAGMENTATION_MOVE_OPERATION_COPY}. You can modify it.</p>
     */
    @NativeType("VmaDefragmentationMoveOperation")
    public int operation() { return noperation(address()); }
    /** allocation that should be moved */
    @NativeType("VmaAllocation")
    public long srcAllocation() { return nsrcAllocation(address()); }
    /**
     * temporary allocation pointing to destination memory that will replace {@code srcAllocation}.
     * 
     * <p>Warning: Do not store this allocation in your data structures! It exists only temporarily, for the duration of the defragmentation pass, to be used for
     * binding new buffer/image to the destination memory using e.g. {@link Vma#vmaBindBufferMemory BindBufferMemory}. {@link Vma#vmaEndDefragmentationPass EndDefragmentationPass} will destroy it and make
     * {@code srcAllocation} point to this memory.</p>
     */
    @NativeType("VmaAllocation")
    public long dstTmpAllocation() { return ndstTmpAllocation(address()); }

    /** Sets the specified value to the {@link #operation} field. */
    public VmaDefragmentationMove operation(@NativeType("VmaDefragmentationMoveOperation") int value) { noperation(address(), value); return this; }
    /** Sets the specified value to the {@link #srcAllocation} field. */
    public VmaDefragmentationMove srcAllocation(@NativeType("VmaAllocation") long value) { nsrcAllocation(address(), value); return this; }
    /** Sets the specified value to the {@link #dstTmpAllocation} field. */
    public VmaDefragmentationMove dstTmpAllocation(@NativeType("VmaAllocation") long value) { ndstTmpAllocation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaDefragmentationMove set(
        int operation,
        long srcAllocation,
        long dstTmpAllocation
    ) {
        operation(operation);
        srcAllocation(srcAllocation);
        dstTmpAllocation(dstTmpAllocation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaDefragmentationMove set(VmaDefragmentationMove src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaDefragmentationMove} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationMove malloc() {
        return new VmaDefragmentationMove(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaDefragmentationMove} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationMove calloc() {
        return new VmaDefragmentationMove(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaDefragmentationMove} instance allocated with {@link BufferUtils}. */
    public static VmaDefragmentationMove create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaDefragmentationMove(memAddress(container), container);
    }

    /** Returns a new {@code VmaDefragmentationMove} instance for the specified memory address. */
    public static VmaDefragmentationMove create(long address) {
        return new VmaDefragmentationMove(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationMove createSafe(long address) {
        return address == NULL ? null : new VmaDefragmentationMove(address, null);
    }

    /**
     * Returns a new {@link VmaDefragmentationMove.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationMove.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationMove.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationMove.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationMove.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationMove.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaDefragmentationMove.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationMove.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationMove.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VmaDefragmentationMove} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationMove malloc(MemoryStack stack) {
        return new VmaDefragmentationMove(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaDefragmentationMove} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationMove calloc(MemoryStack stack) {
        return new VmaDefragmentationMove(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaDefragmentationMove.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationMove.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationMove.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationMove.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #operation}. */
    public static int noperation(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationMove.OPERATION); }
    /** Unsafe version of {@link #srcAllocation}. */
    public static long nsrcAllocation(long struct) { return memGetAddress(struct + VmaDefragmentationMove.SRCALLOCATION); }
    /** Unsafe version of {@link #dstTmpAllocation}. */
    public static long ndstTmpAllocation(long struct) { return memGetAddress(struct + VmaDefragmentationMove.DSTTMPALLOCATION); }

    /** Unsafe version of {@link #operation(int) operation}. */
    public static void noperation(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationMove.OPERATION, value); }
    /** Unsafe version of {@link #srcAllocation(long) srcAllocation}. */
    public static void nsrcAllocation(long struct, long value) { memPutAddress(struct + VmaDefragmentationMove.SRCALLOCATION, check(value)); }
    /** Unsafe version of {@link #dstTmpAllocation(long) dstTmpAllocation}. */
    public static void ndstTmpAllocation(long struct, long value) { memPutAddress(struct + VmaDefragmentationMove.DSTTMPALLOCATION, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VmaDefragmentationMove.SRCALLOCATION));
        check(memGetAddress(struct + VmaDefragmentationMove.DSTTMPALLOCATION));
    }

    // -----------------------------------

    /** An array of {@link VmaDefragmentationMove} structs. */
    public static class Buffer extends StructBuffer<VmaDefragmentationMove, Buffer> implements NativeResource {

        private static final VmaDefragmentationMove ELEMENT_FACTORY = VmaDefragmentationMove.create(-1L);

        /**
         * Creates a new {@code VmaDefragmentationMove.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDefragmentationMove#SIZEOF}, and its mark will be undefined.</p>
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
        protected VmaDefragmentationMove getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaDefragmentationMove#operation} field. */
        @NativeType("VmaDefragmentationMoveOperation")
        public int operation() { return VmaDefragmentationMove.noperation(address()); }
        /** @return the value of the {@link VmaDefragmentationMove#srcAllocation} field. */
        @NativeType("VmaAllocation")
        public long srcAllocation() { return VmaDefragmentationMove.nsrcAllocation(address()); }
        /** @return the value of the {@link VmaDefragmentationMove#dstTmpAllocation} field. */
        @NativeType("VmaAllocation")
        public long dstTmpAllocation() { return VmaDefragmentationMove.ndstTmpAllocation(address()); }

        /** Sets the specified value to the {@link VmaDefragmentationMove#operation} field. */
        public VmaDefragmentationMove.Buffer operation(@NativeType("VmaDefragmentationMoveOperation") int value) { VmaDefragmentationMove.noperation(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationMove#srcAllocation} field. */
        public VmaDefragmentationMove.Buffer srcAllocation(@NativeType("VmaAllocation") long value) { VmaDefragmentationMove.nsrcAllocation(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationMove#dstTmpAllocation} field. */
        public VmaDefragmentationMove.Buffer dstTmpAllocation(@NativeType("VmaAllocation") long value) { VmaDefragmentationMove.ndstTmpAllocation(address(), value); return this; }

    }

}