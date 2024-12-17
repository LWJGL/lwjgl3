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
 * struct VkReleaseCapturedPipelineDataInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPipeline pipeline;
 * }}</pre>
 */
public class VkReleaseCapturedPipelineDataInfoKHR extends Struct<VkReleaseCapturedPipelineDataInfoKHR> implements NativeResource {

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

    protected VkReleaseCapturedPipelineDataInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkReleaseCapturedPipelineDataInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkReleaseCapturedPipelineDataInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkReleaseCapturedPipelineDataInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkReleaseCapturedPipelineDataInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code pipeline} field. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkReleaseCapturedPipelineDataInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR} value to the {@code sType} field. */
    public VkReleaseCapturedPipelineDataInfoKHR sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkReleaseCapturedPipelineDataInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipeline} field. */
    public VkReleaseCapturedPipelineDataInfoKHR pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkReleaseCapturedPipelineDataInfoKHR set(
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
    public VkReleaseCapturedPipelineDataInfoKHR set(VkReleaseCapturedPipelineDataInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkReleaseCapturedPipelineDataInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkReleaseCapturedPipelineDataInfoKHR malloc() {
        return new VkReleaseCapturedPipelineDataInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkReleaseCapturedPipelineDataInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkReleaseCapturedPipelineDataInfoKHR calloc() {
        return new VkReleaseCapturedPipelineDataInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkReleaseCapturedPipelineDataInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkReleaseCapturedPipelineDataInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkReleaseCapturedPipelineDataInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkReleaseCapturedPipelineDataInfoKHR} instance for the specified memory address. */
    public static VkReleaseCapturedPipelineDataInfoKHR create(long address) {
        return new VkReleaseCapturedPipelineDataInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkReleaseCapturedPipelineDataInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkReleaseCapturedPipelineDataInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkReleaseCapturedPipelineDataInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseCapturedPipelineDataInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkReleaseCapturedPipelineDataInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseCapturedPipelineDataInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkReleaseCapturedPipelineDataInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseCapturedPipelineDataInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkReleaseCapturedPipelineDataInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkReleaseCapturedPipelineDataInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkReleaseCapturedPipelineDataInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkReleaseCapturedPipelineDataInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkReleaseCapturedPipelineDataInfoKHR malloc(MemoryStack stack) {
        return new VkReleaseCapturedPipelineDataInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkReleaseCapturedPipelineDataInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkReleaseCapturedPipelineDataInfoKHR calloc(MemoryStack stack) {
        return new VkReleaseCapturedPipelineDataInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkReleaseCapturedPipelineDataInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkReleaseCapturedPipelineDataInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkReleaseCapturedPipelineDataInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkReleaseCapturedPipelineDataInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkReleaseCapturedPipelineDataInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkReleaseCapturedPipelineDataInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return memGetLong(struct + VkReleaseCapturedPipelineDataInfoKHR.PIPELINE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkReleaseCapturedPipelineDataInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkReleaseCapturedPipelineDataInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { memPutLong(struct + VkReleaseCapturedPipelineDataInfoKHR.PIPELINE, value); }

    // -----------------------------------

    /** An array of {@link VkReleaseCapturedPipelineDataInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkReleaseCapturedPipelineDataInfoKHR, Buffer> implements NativeResource {

        private static final VkReleaseCapturedPipelineDataInfoKHR ELEMENT_FACTORY = VkReleaseCapturedPipelineDataInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkReleaseCapturedPipelineDataInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkReleaseCapturedPipelineDataInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkReleaseCapturedPipelineDataInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkReleaseCapturedPipelineDataInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkReleaseCapturedPipelineDataInfoKHR.npNext(address()); }
        /** @return the value of the {@code pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkReleaseCapturedPipelineDataInfoKHR.npipeline(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkReleaseCapturedPipelineDataInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkReleaseCapturedPipelineDataInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR} value to the {@code sType} field. */
        public VkReleaseCapturedPipelineDataInfoKHR.Buffer sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkReleaseCapturedPipelineDataInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkReleaseCapturedPipelineDataInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipeline} field. */
        public VkReleaseCapturedPipelineDataInfoKHR.Buffer pipeline(@NativeType("VkPipeline") long value) { VkReleaseCapturedPipelineDataInfoKHR.npipeline(address(), value); return this; }

    }

}