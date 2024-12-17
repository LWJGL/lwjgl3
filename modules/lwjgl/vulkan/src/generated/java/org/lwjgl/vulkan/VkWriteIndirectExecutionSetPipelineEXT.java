/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkWriteIndirectExecutionSetPipelineEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t index;
 *     VkPipeline pipeline;
 * }}</pre>
 */
public class VkWriteIndirectExecutionSetPipelineEXT extends Struct<VkWriteIndirectExecutionSetPipelineEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INDEX,
        PIPELINE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDEX = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
    }

    protected VkWriteIndirectExecutionSetPipelineEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkWriteIndirectExecutionSetPipelineEXT create(long address, @Nullable ByteBuffer container) {
        return new VkWriteIndirectExecutionSetPipelineEXT(address, container);
    }

    /**
     * Creates a {@code VkWriteIndirectExecutionSetPipelineEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteIndirectExecutionSetPipelineEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code index} field. */
    @NativeType("uint32_t")
    public int index() { return nindex(address()); }
    /** @return the value of the {@code pipeline} field. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWriteIndirectExecutionSetPipelineEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT} value to the {@code sType} field. */
    public VkWriteIndirectExecutionSetPipelineEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWriteIndirectExecutionSetPipelineEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code index} field. */
    public VkWriteIndirectExecutionSetPipelineEXT index(@NativeType("uint32_t") int value) { nindex(address(), value); return this; }
    /** Sets the specified value to the {@code pipeline} field. */
    public VkWriteIndirectExecutionSetPipelineEXT pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteIndirectExecutionSetPipelineEXT set(
        int sType,
        long pNext,
        int index,
        long pipeline
    ) {
        sType(sType);
        pNext(pNext);
        index(index);
        pipeline(pipeline);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWriteIndirectExecutionSetPipelineEXT set(VkWriteIndirectExecutionSetPipelineEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteIndirectExecutionSetPipelineEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteIndirectExecutionSetPipelineEXT malloc() {
        return new VkWriteIndirectExecutionSetPipelineEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkWriteIndirectExecutionSetPipelineEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteIndirectExecutionSetPipelineEXT calloc() {
        return new VkWriteIndirectExecutionSetPipelineEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkWriteIndirectExecutionSetPipelineEXT} instance allocated with {@link BufferUtils}. */
    public static VkWriteIndirectExecutionSetPipelineEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteIndirectExecutionSetPipelineEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkWriteIndirectExecutionSetPipelineEXT} instance for the specified memory address. */
    public static VkWriteIndirectExecutionSetPipelineEXT create(long address) {
        return new VkWriteIndirectExecutionSetPipelineEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkWriteIndirectExecutionSetPipelineEXT createSafe(long address) {
        return address == NULL ? null : new VkWriteIndirectExecutionSetPipelineEXT(address, null);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetPipelineEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetPipelineEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetPipelineEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetPipelineEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetPipelineEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetPipelineEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkWriteIndirectExecutionSetPipelineEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetPipelineEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkWriteIndirectExecutionSetPipelineEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkWriteIndirectExecutionSetPipelineEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteIndirectExecutionSetPipelineEXT malloc(MemoryStack stack) {
        return new VkWriteIndirectExecutionSetPipelineEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkWriteIndirectExecutionSetPipelineEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteIndirectExecutionSetPipelineEXT calloc(MemoryStack stack) {
        return new VkWriteIndirectExecutionSetPipelineEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetPipelineEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetPipelineEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetPipelineEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetPipelineEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkWriteIndirectExecutionSetPipelineEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteIndirectExecutionSetPipelineEXT.PNEXT); }
    /** Unsafe version of {@link #index}. */
    public static int nindex(long struct) { return memGetInt(struct + VkWriteIndirectExecutionSetPipelineEXT.INDEX); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return memGetLong(struct + VkWriteIndirectExecutionSetPipelineEXT.PIPELINE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkWriteIndirectExecutionSetPipelineEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteIndirectExecutionSetPipelineEXT.PNEXT, value); }
    /** Unsafe version of {@link #index(int) index}. */
    public static void nindex(long struct, int value) { memPutInt(struct + VkWriteIndirectExecutionSetPipelineEXT.INDEX, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { memPutLong(struct + VkWriteIndirectExecutionSetPipelineEXT.PIPELINE, value); }

    // -----------------------------------

    /** An array of {@link VkWriteIndirectExecutionSetPipelineEXT} structs. */
    public static class Buffer extends StructBuffer<VkWriteIndirectExecutionSetPipelineEXT, Buffer> implements NativeResource {

        private static final VkWriteIndirectExecutionSetPipelineEXT ELEMENT_FACTORY = VkWriteIndirectExecutionSetPipelineEXT.create(-1L);

        /**
         * Creates a new {@code VkWriteIndirectExecutionSetPipelineEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteIndirectExecutionSetPipelineEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkWriteIndirectExecutionSetPipelineEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteIndirectExecutionSetPipelineEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWriteIndirectExecutionSetPipelineEXT.npNext(address()); }
        /** @return the value of the {@code index} field. */
        @NativeType("uint32_t")
        public int index() { return VkWriteIndirectExecutionSetPipelineEXT.nindex(address()); }
        /** @return the value of the {@code pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkWriteIndirectExecutionSetPipelineEXT.npipeline(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWriteIndirectExecutionSetPipelineEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteIndirectExecutionSetPipelineEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT} value to the {@code sType} field. */
        public VkWriteIndirectExecutionSetPipelineEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWriteIndirectExecutionSetPipelineEXT.Buffer pNext(@NativeType("void const *") long value) { VkWriteIndirectExecutionSetPipelineEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code index} field. */
        public VkWriteIndirectExecutionSetPipelineEXT.Buffer index(@NativeType("uint32_t") int value) { VkWriteIndirectExecutionSetPipelineEXT.nindex(address(), value); return this; }
        /** Sets the specified value to the {@code pipeline} field. */
        public VkWriteIndirectExecutionSetPipelineEXT.Buffer pipeline(@NativeType("VkPipeline") long value) { VkWriteIndirectExecutionSetPipelineEXT.npipeline(address(), value); return this; }

    }

}