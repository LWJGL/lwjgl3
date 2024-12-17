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
 * struct VkPipelineBinaryCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkPipelineBinaryKeysAndDataKHR VkPipelineBinaryKeysAndDataKHR} const * pKeysAndDataInfo;
 *     VkPipeline pipeline;
 *     {@link VkPipelineCreateInfoKHR VkPipelineCreateInfoKHR} const * pPipelineCreateInfo;
 * }}</pre>
 */
public class VkPipelineBinaryCreateInfoKHR extends Struct<VkPipelineBinaryCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PKEYSANDDATAINFO,
        PIPELINE,
        PPIPELINECREATEINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PKEYSANDDATAINFO = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
        PPIPELINECREATEINFO = layout.offsetof(4);
    }

    protected VkPipelineBinaryCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineBinaryCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineBinaryCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineBinaryCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineBinaryCreateInfoKHR(ByteBuffer container) {
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
    /** @return a {@link VkPipelineBinaryKeysAndDataKHR} view of the struct pointed to by the {@code pKeysAndDataInfo} field. */
    @NativeType("VkPipelineBinaryKeysAndDataKHR const *")
    public @Nullable VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo() { return npKeysAndDataInfo(address()); }
    /** @return the value of the {@code pipeline} field. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }
    /** @return a {@link VkPipelineCreateInfoKHR} view of the struct pointed to by the {@code pPipelineCreateInfo} field. */
    @NativeType("VkPipelineCreateInfoKHR const *")
    public @Nullable VkPipelineCreateInfoKHR pPipelineCreateInfo() { return npPipelineCreateInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineBinaryCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkPipelineBinaryCreateInfoKHR sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineBinaryCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineBinaryKeysAndDataKHR} to the {@code pKeysAndDataInfo} field. */
    public VkPipelineBinaryCreateInfoKHR pKeysAndDataInfo(@Nullable @NativeType("VkPipelineBinaryKeysAndDataKHR const *") VkPipelineBinaryKeysAndDataKHR value) { npKeysAndDataInfo(address(), value); return this; }
    /** Sets the specified value to the {@code pipeline} field. */
    public VkPipelineBinaryCreateInfoKHR pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineCreateInfoKHR} to the {@code pPipelineCreateInfo} field. */
    public VkPipelineBinaryCreateInfoKHR pPipelineCreateInfo(@Nullable @NativeType("VkPipelineCreateInfoKHR const *") VkPipelineCreateInfoKHR value) { npPipelineCreateInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineBinaryCreateInfoKHR set(
        int sType,
        long pNext,
        @Nullable VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo,
        long pipeline,
        @Nullable VkPipelineCreateInfoKHR pPipelineCreateInfo
    ) {
        sType(sType);
        pNext(pNext);
        pKeysAndDataInfo(pKeysAndDataInfo);
        pipeline(pipeline);
        pPipelineCreateInfo(pPipelineCreateInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineBinaryCreateInfoKHR set(VkPipelineBinaryCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineBinaryCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryCreateInfoKHR malloc() {
        return new VkPipelineBinaryCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryCreateInfoKHR calloc() {
        return new VkPipelineBinaryCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineBinaryCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineBinaryCreateInfoKHR} instance for the specified memory address. */
    public static VkPipelineBinaryCreateInfoKHR create(long address) {
        return new VkPipelineBinaryCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineBinaryCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineBinaryCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineBinaryCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineBinaryCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineBinaryCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineBinaryCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineBinaryCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineBinaryCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pKeysAndDataInfo}. */
    public static @Nullable VkPipelineBinaryKeysAndDataKHR npKeysAndDataInfo(long struct) { return VkPipelineBinaryKeysAndDataKHR.createSafe(memGetAddress(struct + VkPipelineBinaryCreateInfoKHR.PKEYSANDDATAINFO)); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return memGetLong(struct + VkPipelineBinaryCreateInfoKHR.PIPELINE); }
    /** Unsafe version of {@link #pPipelineCreateInfo}. */
    public static @Nullable VkPipelineCreateInfoKHR npPipelineCreateInfo(long struct) { return VkPipelineCreateInfoKHR.createSafe(memGetAddress(struct + VkPipelineBinaryCreateInfoKHR.PPIPELINECREATEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineBinaryCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineBinaryCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pKeysAndDataInfo(VkPipelineBinaryKeysAndDataKHR) pKeysAndDataInfo}. */
    public static void npKeysAndDataInfo(long struct, @Nullable VkPipelineBinaryKeysAndDataKHR value) { memPutAddress(struct + VkPipelineBinaryCreateInfoKHR.PKEYSANDDATAINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { memPutLong(struct + VkPipelineBinaryCreateInfoKHR.PIPELINE, value); }
    /** Unsafe version of {@link #pPipelineCreateInfo(VkPipelineCreateInfoKHR) pPipelineCreateInfo}. */
    public static void npPipelineCreateInfo(long struct, @Nullable VkPipelineCreateInfoKHR value) { memPutAddress(struct + VkPipelineBinaryCreateInfoKHR.PPIPELINECREATEINFO, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pKeysAndDataInfo = memGetAddress(struct + VkPipelineBinaryCreateInfoKHR.PKEYSANDDATAINFO);
        if (pKeysAndDataInfo != NULL) {
            VkPipelineBinaryKeysAndDataKHR.validate(pKeysAndDataInfo);
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineBinaryCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineBinaryCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineBinaryCreateInfoKHR ELEMENT_FACTORY = VkPipelineBinaryCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineBinaryCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineBinaryCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineBinaryCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineBinaryCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineBinaryCreateInfoKHR.npNext(address()); }
        /** @return a {@link VkPipelineBinaryKeysAndDataKHR} view of the struct pointed to by the {@code pKeysAndDataInfo} field. */
        @NativeType("VkPipelineBinaryKeysAndDataKHR const *")
        public @Nullable VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo() { return VkPipelineBinaryCreateInfoKHR.npKeysAndDataInfo(address()); }
        /** @return the value of the {@code pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkPipelineBinaryCreateInfoKHR.npipeline(address()); }
        /** @return a {@link VkPipelineCreateInfoKHR} view of the struct pointed to by the {@code pPipelineCreateInfo} field. */
        @NativeType("VkPipelineCreateInfoKHR const *")
        public @Nullable VkPipelineCreateInfoKHR pPipelineCreateInfo() { return VkPipelineBinaryCreateInfoKHR.npPipelineCreateInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineBinaryCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineBinaryCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkPipelineBinaryCreateInfoKHR.Buffer sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineBinaryCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineBinaryCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineBinaryKeysAndDataKHR} to the {@code pKeysAndDataInfo} field. */
        public VkPipelineBinaryCreateInfoKHR.Buffer pKeysAndDataInfo(@Nullable @NativeType("VkPipelineBinaryKeysAndDataKHR const *") VkPipelineBinaryKeysAndDataKHR value) { VkPipelineBinaryCreateInfoKHR.npKeysAndDataInfo(address(), value); return this; }
        /** Sets the specified value to the {@code pipeline} field. */
        public VkPipelineBinaryCreateInfoKHR.Buffer pipeline(@NativeType("VkPipeline") long value) { VkPipelineBinaryCreateInfoKHR.npipeline(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineCreateInfoKHR} to the {@code pPipelineCreateInfo} field. */
        public VkPipelineBinaryCreateInfoKHR.Buffer pPipelineCreateInfo(@Nullable @NativeType("VkPipelineCreateInfoKHR const *") VkPipelineCreateInfoKHR value) { VkPipelineBinaryCreateInfoKHR.npPipelineCreateInfo(address(), value); return this; }

    }

}