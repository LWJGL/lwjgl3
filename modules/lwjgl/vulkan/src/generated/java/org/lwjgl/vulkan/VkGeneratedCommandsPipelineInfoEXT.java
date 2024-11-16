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
 * Structure specifying a pipeline for use with indirect command preprocessing.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT}</li>
 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeneratedCommandsPipelineInfoEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkPipeline {@link #pipeline};
 * }</code></pre>
 */
public class VkGeneratedCommandsPipelineInfoEXT extends Struct<VkGeneratedCommandsPipelineInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINE;

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
        PIPELINE = layout.offsetof(2);
    }

    protected VkGeneratedCommandsPipelineInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeneratedCommandsPipelineInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkGeneratedCommandsPipelineInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkGeneratedCommandsPipelineInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeneratedCommandsPipelineInfoEXT(ByteBuffer container) {
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
    /** a valid pipeline object. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkGeneratedCommandsPipelineInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT} value to the {@link #sType} field. */
    public VkGeneratedCommandsPipelineInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkGeneratedCommandsPipelineInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipeline} field. */
    public VkGeneratedCommandsPipelineInfoEXT pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeneratedCommandsPipelineInfoEXT set(
        int sType,
        long pNext,
        long pipeline
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkGeneratedCommandsPipelineInfoEXT set(VkGeneratedCommandsPipelineInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsPipelineInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsPipelineInfoEXT malloc() {
        return new VkGeneratedCommandsPipelineInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsPipelineInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsPipelineInfoEXT calloc() {
        return new VkGeneratedCommandsPipelineInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsPipelineInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkGeneratedCommandsPipelineInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsPipelineInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkGeneratedCommandsPipelineInfoEXT} instance for the specified memory address. */
    public static VkGeneratedCommandsPipelineInfoEXT create(long address) {
        return new VkGeneratedCommandsPipelineInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeneratedCommandsPipelineInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkGeneratedCommandsPipelineInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsPipelineInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsPipelineInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsPipelineInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsPipelineInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsPipelineInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsPipelineInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeneratedCommandsPipelineInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsPipelineInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeneratedCommandsPipelineInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsPipelineInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsPipelineInfoEXT malloc(MemoryStack stack) {
        return new VkGeneratedCommandsPipelineInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsPipelineInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsPipelineInfoEXT calloc(MemoryStack stack) {
        return new VkGeneratedCommandsPipelineInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsPipelineInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsPipelineInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsPipelineInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsPipelineInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeneratedCommandsPipelineInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeneratedCommandsPipelineInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return memGetLong(struct + VkGeneratedCommandsPipelineInfoEXT.PIPELINE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeneratedCommandsPipelineInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeneratedCommandsPipelineInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { memPutLong(struct + VkGeneratedCommandsPipelineInfoEXT.PIPELINE, value); }

    // -----------------------------------

    /** An array of {@link VkGeneratedCommandsPipelineInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsPipelineInfoEXT, Buffer> implements NativeResource {

        private static final VkGeneratedCommandsPipelineInfoEXT ELEMENT_FACTORY = VkGeneratedCommandsPipelineInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkGeneratedCommandsPipelineInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeneratedCommandsPipelineInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeneratedCommandsPipelineInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkGeneratedCommandsPipelineInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeneratedCommandsPipelineInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkGeneratedCommandsPipelineInfoEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkGeneratedCommandsPipelineInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkGeneratedCommandsPipelineInfoEXT#pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkGeneratedCommandsPipelineInfoEXT.npipeline(address()); }

        /** Sets the specified value to the {@link VkGeneratedCommandsPipelineInfoEXT#sType} field. */
        public VkGeneratedCommandsPipelineInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkGeneratedCommandsPipelineInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT} value to the {@link VkGeneratedCommandsPipelineInfoEXT#sType} field. */
        public VkGeneratedCommandsPipelineInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT); }
        /** Sets the specified value to the {@link VkGeneratedCommandsPipelineInfoEXT#pNext} field. */
        public VkGeneratedCommandsPipelineInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkGeneratedCommandsPipelineInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsPipelineInfoEXT#pipeline} field. */
        public VkGeneratedCommandsPipelineInfoEXT.Buffer pipeline(@NativeType("VkPipeline") long value) { VkGeneratedCommandsPipelineInfoEXT.npipeline(address(), value); return this; }

    }

}