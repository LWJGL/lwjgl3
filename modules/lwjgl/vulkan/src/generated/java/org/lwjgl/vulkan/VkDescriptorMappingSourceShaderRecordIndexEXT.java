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
 * <pre><code>
 * struct VkDescriptorMappingSourceShaderRecordIndexEXT {
 *     uint32_t heapOffset;
 *     uint32_t shaderRecordOffset;
 *     uint32_t heapIndexStride;
 *     uint32_t heapArrayStride;
 *     {@link VkSamplerCreateInfo VkSamplerCreateInfo} const * pEmbeddedSampler;
 *     VkBool32 useCombinedImageSamplerIndex;
 *     uint32_t samplerHeapOffset;
 *     uint32_t samplerShaderRecordOffset;
 *     uint32_t samplerHeapIndexStride;
 *     uint32_t samplerHeapArrayStride;
 * }</code></pre>
 */
public class VkDescriptorMappingSourceShaderRecordIndexEXT extends Struct<VkDescriptorMappingSourceShaderRecordIndexEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAPOFFSET,
        SHADERRECORDOFFSET,
        HEAPINDEXSTRIDE,
        HEAPARRAYSTRIDE,
        PEMBEDDEDSAMPLER,
        USECOMBINEDIMAGESAMPLERINDEX,
        SAMPLERHEAPOFFSET,
        SAMPLERSHADERRECORDOFFSET,
        SAMPLERHEAPINDEXSTRIDE,
        SAMPLERHEAPARRAYSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAPOFFSET = layout.offsetof(0);
        SHADERRECORDOFFSET = layout.offsetof(1);
        HEAPINDEXSTRIDE = layout.offsetof(2);
        HEAPARRAYSTRIDE = layout.offsetof(3);
        PEMBEDDEDSAMPLER = layout.offsetof(4);
        USECOMBINEDIMAGESAMPLERINDEX = layout.offsetof(5);
        SAMPLERHEAPOFFSET = layout.offsetof(6);
        SAMPLERSHADERRECORDOFFSET = layout.offsetof(7);
        SAMPLERHEAPINDEXSTRIDE = layout.offsetof(8);
        SAMPLERHEAPARRAYSTRIDE = layout.offsetof(9);
    }

    protected VkDescriptorMappingSourceShaderRecordIndexEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorMappingSourceShaderRecordIndexEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorMappingSourceShaderRecordIndexEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorMappingSourceShaderRecordIndexEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code heapOffset} field. */
    @NativeType("uint32_t")
    public int heapOffset() { return nheapOffset(address()); }
    /** @return the value of the {@code shaderRecordOffset} field. */
    @NativeType("uint32_t")
    public int shaderRecordOffset() { return nshaderRecordOffset(address()); }
    /** @return the value of the {@code heapIndexStride} field. */
    @NativeType("uint32_t")
    public int heapIndexStride() { return nheapIndexStride(address()); }
    /** @return the value of the {@code heapArrayStride} field. */
    @NativeType("uint32_t")
    public int heapArrayStride() { return nheapArrayStride(address()); }
    /** @return a {@link VkSamplerCreateInfo} view of the struct pointed to by the {@code pEmbeddedSampler} field. */
    @NativeType("VkSamplerCreateInfo const *")
    public @Nullable VkSamplerCreateInfo pEmbeddedSampler() { return npEmbeddedSampler(address()); }
    /** @return the value of the {@code useCombinedImageSamplerIndex} field. */
    @NativeType("VkBool32")
    public boolean useCombinedImageSamplerIndex() { return nuseCombinedImageSamplerIndex(address()) != 0; }
    /** @return the value of the {@code samplerHeapOffset} field. */
    @NativeType("uint32_t")
    public int samplerHeapOffset() { return nsamplerHeapOffset(address()); }
    /** @return the value of the {@code samplerShaderRecordOffset} field. */
    @NativeType("uint32_t")
    public int samplerShaderRecordOffset() { return nsamplerShaderRecordOffset(address()); }
    /** @return the value of the {@code samplerHeapIndexStride} field. */
    @NativeType("uint32_t")
    public int samplerHeapIndexStride() { return nsamplerHeapIndexStride(address()); }
    /** @return the value of the {@code samplerHeapArrayStride} field. */
    @NativeType("uint32_t")
    public int samplerHeapArrayStride() { return nsamplerHeapArrayStride(address()); }

    /** Sets the specified value to the {@code heapOffset} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT heapOffset(@NativeType("uint32_t") int value) { nheapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code shaderRecordOffset} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordOffset(@NativeType("uint32_t") int value) { nshaderRecordOffset(address(), value); return this; }
    /** Sets the specified value to the {@code heapIndexStride} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT heapIndexStride(@NativeType("uint32_t") int value) { nheapIndexStride(address(), value); return this; }
    /** Sets the specified value to the {@code heapArrayStride} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT heapArrayStride(@NativeType("uint32_t") int value) { nheapArrayStride(address(), value); return this; }
    /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { npEmbeddedSampler(address(), value); return this; }
    /** Sets the specified value to the {@code useCombinedImageSamplerIndex} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) { nuseCombinedImageSamplerIndex(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code samplerHeapOffset} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerHeapOffset(@NativeType("uint32_t") int value) { nsamplerHeapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerShaderRecordOffset} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerShaderRecordOffset(@NativeType("uint32_t") int value) { nsamplerShaderRecordOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerHeapIndexStride} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerHeapIndexStride(@NativeType("uint32_t") int value) { nsamplerHeapIndexStride(address(), value); return this; }
    /** Sets the specified value to the {@code samplerHeapArrayStride} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerHeapArrayStride(@NativeType("uint32_t") int value) { nsamplerHeapArrayStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT set(
        int heapOffset,
        int shaderRecordOffset,
        int heapIndexStride,
        int heapArrayStride,
        @Nullable VkSamplerCreateInfo pEmbeddedSampler,
        boolean useCombinedImageSamplerIndex,
        int samplerHeapOffset,
        int samplerShaderRecordOffset,
        int samplerHeapIndexStride,
        int samplerHeapArrayStride
    ) {
        heapOffset(heapOffset);
        shaderRecordOffset(shaderRecordOffset);
        heapIndexStride(heapIndexStride);
        heapArrayStride(heapArrayStride);
        pEmbeddedSampler(pEmbeddedSampler);
        useCombinedImageSamplerIndex(useCombinedImageSamplerIndex);
        samplerHeapOffset(samplerHeapOffset);
        samplerShaderRecordOffset(samplerShaderRecordOffset);
        samplerHeapIndexStride(samplerHeapIndexStride);
        samplerHeapArrayStride(samplerHeapArrayStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorMappingSourceShaderRecordIndexEXT set(VkDescriptorMappingSourceShaderRecordIndexEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorMappingSourceShaderRecordIndexEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT malloc() {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceShaderRecordIndexEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT calloc() {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceShaderRecordIndexEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorMappingSourceShaderRecordIndexEXT} instance for the specified memory address. */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT create(long address) {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorMappingSourceShaderRecordIndexEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorMappingSourceShaderRecordIndexEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceShaderRecordIndexEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceShaderRecordIndexEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #heapOffset}. */
    public static int nheapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.HEAPOFFSET); }
    /** Unsafe version of {@link #shaderRecordOffset}. */
    public static int nshaderRecordOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SHADERRECORDOFFSET); }
    /** Unsafe version of {@link #heapIndexStride}. */
    public static int nheapIndexStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.HEAPINDEXSTRIDE); }
    /** Unsafe version of {@link #heapArrayStride}. */
    public static int nheapArrayStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.HEAPARRAYSTRIDE); }
    /** Unsafe version of {@link #pEmbeddedSampler}. */
    public static @Nullable VkSamplerCreateInfo npEmbeddedSampler(long struct) { return VkSamplerCreateInfo.createSafe(memGetAddress(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.PEMBEDDEDSAMPLER)); }
    /** Unsafe version of {@link #useCombinedImageSamplerIndex}. */
    public static int nuseCombinedImageSamplerIndex(long struct) { return memGetInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.USECOMBINEDIMAGESAMPLERINDEX); }
    /** Unsafe version of {@link #samplerHeapOffset}. */
    public static int nsamplerHeapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SAMPLERHEAPOFFSET); }
    /** Unsafe version of {@link #samplerShaderRecordOffset}. */
    public static int nsamplerShaderRecordOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SAMPLERSHADERRECORDOFFSET); }
    /** Unsafe version of {@link #samplerHeapIndexStride}. */
    public static int nsamplerHeapIndexStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SAMPLERHEAPINDEXSTRIDE); }
    /** Unsafe version of {@link #samplerHeapArrayStride}. */
    public static int nsamplerHeapArrayStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SAMPLERHEAPARRAYSTRIDE); }

    /** Unsafe version of {@link #heapOffset(int) heapOffset}. */
    public static void nheapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.HEAPOFFSET, value); }
    /** Unsafe version of {@link #shaderRecordOffset(int) shaderRecordOffset}. */
    public static void nshaderRecordOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SHADERRECORDOFFSET, value); }
    /** Unsafe version of {@link #heapIndexStride(int) heapIndexStride}. */
    public static void nheapIndexStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.HEAPINDEXSTRIDE, value); }
    /** Unsafe version of {@link #heapArrayStride(int) heapArrayStride}. */
    public static void nheapArrayStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.HEAPARRAYSTRIDE, value); }
    /** Unsafe version of {@link #pEmbeddedSampler(VkSamplerCreateInfo) pEmbeddedSampler}. */
    public static void npEmbeddedSampler(long struct, @Nullable VkSamplerCreateInfo value) { memPutAddress(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.PEMBEDDEDSAMPLER, memAddressSafe(value)); }
    /** Unsafe version of {@link #useCombinedImageSamplerIndex(boolean) useCombinedImageSamplerIndex}. */
    public static void nuseCombinedImageSamplerIndex(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.USECOMBINEDIMAGESAMPLERINDEX, value); }
    /** Unsafe version of {@link #samplerHeapOffset(int) samplerHeapOffset}. */
    public static void nsamplerHeapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SAMPLERHEAPOFFSET, value); }
    /** Unsafe version of {@link #samplerShaderRecordOffset(int) samplerShaderRecordOffset}. */
    public static void nsamplerShaderRecordOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SAMPLERSHADERRECORDOFFSET, value); }
    /** Unsafe version of {@link #samplerHeapIndexStride(int) samplerHeapIndexStride}. */
    public static void nsamplerHeapIndexStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SAMPLERHEAPINDEXSTRIDE, value); }
    /** Unsafe version of {@link #samplerHeapArrayStride(int) samplerHeapArrayStride}. */
    public static void nsamplerHeapArrayStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceShaderRecordIndexEXT.SAMPLERHEAPARRAYSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorMappingSourceShaderRecordIndexEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceShaderRecordIndexEXT, Buffer> implements NativeResource {

        private static final VkDescriptorMappingSourceShaderRecordIndexEXT ELEMENT_FACTORY = VkDescriptorMappingSourceShaderRecordIndexEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorMappingSourceShaderRecordIndexEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorMappingSourceShaderRecordIndexEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code heapOffset} field. */
        @NativeType("uint32_t")
        public int heapOffset() { return VkDescriptorMappingSourceShaderRecordIndexEXT.nheapOffset(address()); }
        /** @return the value of the {@code shaderRecordOffset} field. */
        @NativeType("uint32_t")
        public int shaderRecordOffset() { return VkDescriptorMappingSourceShaderRecordIndexEXT.nshaderRecordOffset(address()); }
        /** @return the value of the {@code heapIndexStride} field. */
        @NativeType("uint32_t")
        public int heapIndexStride() { return VkDescriptorMappingSourceShaderRecordIndexEXT.nheapIndexStride(address()); }
        /** @return the value of the {@code heapArrayStride} field. */
        @NativeType("uint32_t")
        public int heapArrayStride() { return VkDescriptorMappingSourceShaderRecordIndexEXT.nheapArrayStride(address()); }
        /** @return a {@link VkSamplerCreateInfo} view of the struct pointed to by the {@code pEmbeddedSampler} field. */
        @NativeType("VkSamplerCreateInfo const *")
        public @Nullable VkSamplerCreateInfo pEmbeddedSampler() { return VkDescriptorMappingSourceShaderRecordIndexEXT.npEmbeddedSampler(address()); }
        /** @return the value of the {@code useCombinedImageSamplerIndex} field. */
        @NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() { return VkDescriptorMappingSourceShaderRecordIndexEXT.nuseCombinedImageSamplerIndex(address()) != 0; }
        /** @return the value of the {@code samplerHeapOffset} field. */
        @NativeType("uint32_t")
        public int samplerHeapOffset() { return VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapOffset(address()); }
        /** @return the value of the {@code samplerShaderRecordOffset} field. */
        @NativeType("uint32_t")
        public int samplerShaderRecordOffset() { return VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerShaderRecordOffset(address()); }
        /** @return the value of the {@code samplerHeapIndexStride} field. */
        @NativeType("uint32_t")
        public int samplerHeapIndexStride() { return VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapIndexStride(address()); }
        /** @return the value of the {@code samplerHeapArrayStride} field. */
        @NativeType("uint32_t")
        public int samplerHeapArrayStride() { return VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapArrayStride(address()); }

        /** Sets the specified value to the {@code heapOffset} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer heapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceShaderRecordIndexEXT.nheapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code shaderRecordOffset} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer shaderRecordOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceShaderRecordIndexEXT.nshaderRecordOffset(address(), value); return this; }
        /** Sets the specified value to the {@code heapIndexStride} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer heapIndexStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceShaderRecordIndexEXT.nheapIndexStride(address(), value); return this; }
        /** Sets the specified value to the {@code heapArrayStride} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer heapArrayStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceShaderRecordIndexEXT.nheapArrayStride(address(), value); return this; }
        /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { VkDescriptorMappingSourceShaderRecordIndexEXT.npEmbeddedSampler(address(), value); return this; }
        /** Sets the specified value to the {@code useCombinedImageSamplerIndex} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) { VkDescriptorMappingSourceShaderRecordIndexEXT.nuseCombinedImageSamplerIndex(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code samplerHeapOffset} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer samplerHeapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerShaderRecordOffset} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer samplerShaderRecordOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerShaderRecordOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerHeapIndexStride} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer samplerHeapIndexStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapIndexStride(address(), value); return this; }
        /** Sets the specified value to the {@code samplerHeapArrayStride} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT.Buffer samplerHeapArrayStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapArrayStride(address(), value); return this; }

    }

}