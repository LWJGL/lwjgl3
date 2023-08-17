/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing the scratch space required to dispatch an execution graph.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link AMDXShaderEnqueue#vkGetExecutionGraphPipelineScratchSizeAMDX GetExecutionGraphPipelineScratchSizeAMDX}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExecutionGraphPipelineScratchSizeAMDX {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkExecutionGraphPipelineScratchSizeAMDX extends Struct<VkExecutionGraphPipelineScratchSizeAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkExecutionGraphPipelineScratchSizeAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExecutionGraphPipelineScratchSizeAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(address, container);
    }

    /**
     * Creates a {@code VkExecutionGraphPipelineScratchSizeAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExecutionGraphPipelineScratchSizeAMDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates the scratch space required for dispatch the queried execution graph. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX} value to the {@link #sType} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExecutionGraphPipelineScratchSizeAMDX set(
        int sType,
        long pNext,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExecutionGraphPipelineScratchSizeAMDX set(VkExecutionGraphPipelineScratchSizeAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExecutionGraphPipelineScratchSizeAMDX malloc() {
        return new VkExecutionGraphPipelineScratchSizeAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExecutionGraphPipelineScratchSizeAMDX calloc() {
        return new VkExecutionGraphPipelineScratchSizeAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated with {@link BufferUtils}. */
    public static VkExecutionGraphPipelineScratchSizeAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExecutionGraphPipelineScratchSizeAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance for the specified memory address. */
    public static VkExecutionGraphPipelineScratchSizeAMDX create(long address) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExecutionGraphPipelineScratchSizeAMDX createSafe(long address) {
        return address == NULL ? null : new VkExecutionGraphPipelineScratchSizeAMDX(address, null);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX malloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX calloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExecutionGraphPipelineScratchSizeAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExecutionGraphPipelineScratchSizeAMDX.PNEXT); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkExecutionGraphPipelineScratchSizeAMDX.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExecutionGraphPipelineScratchSizeAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExecutionGraphPipelineScratchSizeAMDX.PNEXT, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkExecutionGraphPipelineScratchSizeAMDX.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkExecutionGraphPipelineScratchSizeAMDX} structs. */
    public static class Buffer extends StructBuffer<VkExecutionGraphPipelineScratchSizeAMDX, Buffer> implements NativeResource {

        private static final VkExecutionGraphPipelineScratchSizeAMDX ELEMENT_FACTORY = VkExecutionGraphPipelineScratchSizeAMDX.create(-1L);

        /**
         * Creates a new {@code VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExecutionGraphPipelineScratchSizeAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExecutionGraphPipelineScratchSizeAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExecutionGraphPipelineScratchSizeAMDX#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExecutionGraphPipelineScratchSizeAMDX.nsType(address()); }
        /** @return the value of the {@link VkExecutionGraphPipelineScratchSizeAMDX#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExecutionGraphPipelineScratchSizeAMDX.npNext(address()); }
        /** @return the value of the {@link VkExecutionGraphPipelineScratchSizeAMDX#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkExecutionGraphPipelineScratchSizeAMDX.nsize(address()); }

        /** Sets the specified value to the {@link VkExecutionGraphPipelineScratchSizeAMDX#sType} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkExecutionGraphPipelineScratchSizeAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX} value to the {@link VkExecutionGraphPipelineScratchSizeAMDX#sType} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX); }
        /** Sets the specified value to the {@link VkExecutionGraphPipelineScratchSizeAMDX#pNext} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer pNext(@NativeType("void *") long value) { VkExecutionGraphPipelineScratchSizeAMDX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExecutionGraphPipelineScratchSizeAMDX#size} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer size(@NativeType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.nsize(address(), value); return this; }

    }

}