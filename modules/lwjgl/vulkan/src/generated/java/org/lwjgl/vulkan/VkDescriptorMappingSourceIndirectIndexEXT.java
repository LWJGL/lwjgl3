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
 * struct VkDescriptorMappingSourceIndirectIndexEXT {
 *     uint32_t heapOffset;
 *     uint32_t pushOffset;
 *     uint32_t addressOffset;
 *     uint32_t heapIndexStride;
 *     uint32_t heapArrayStride;
 *     {@link VkSamplerCreateInfo VkSamplerCreateInfo} const * pEmbeddedSampler;
 *     VkBool32 useCombinedImageSamplerIndex;
 *     uint32_t samplerHeapOffset;
 *     uint32_t samplerPushOffset;
 *     uint32_t samplerAddressOffset;
 *     uint32_t samplerHeapIndexStride;
 *     uint32_t samplerHeapArrayStride;
 * }</code></pre>
 */
public class VkDescriptorMappingSourceIndirectIndexEXT extends Struct<VkDescriptorMappingSourceIndirectIndexEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAPOFFSET,
        PUSHOFFSET,
        ADDRESSOFFSET,
        HEAPINDEXSTRIDE,
        HEAPARRAYSTRIDE,
        PEMBEDDEDSAMPLER,
        USECOMBINEDIMAGESAMPLERINDEX,
        SAMPLERHEAPOFFSET,
        SAMPLERPUSHOFFSET,
        SAMPLERADDRESSOFFSET,
        SAMPLERHEAPINDEXSTRIDE,
        SAMPLERHEAPARRAYSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAPOFFSET = layout.offsetof(0);
        PUSHOFFSET = layout.offsetof(1);
        ADDRESSOFFSET = layout.offsetof(2);
        HEAPINDEXSTRIDE = layout.offsetof(3);
        HEAPARRAYSTRIDE = layout.offsetof(4);
        PEMBEDDEDSAMPLER = layout.offsetof(5);
        USECOMBINEDIMAGESAMPLERINDEX = layout.offsetof(6);
        SAMPLERHEAPOFFSET = layout.offsetof(7);
        SAMPLERPUSHOFFSET = layout.offsetof(8);
        SAMPLERADDRESSOFFSET = layout.offsetof(9);
        SAMPLERHEAPINDEXSTRIDE = layout.offsetof(10);
        SAMPLERHEAPARRAYSTRIDE = layout.offsetof(11);
    }

    protected VkDescriptorMappingSourceIndirectIndexEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorMappingSourceIndirectIndexEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorMappingSourceIndirectIndexEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorMappingSourceIndirectIndexEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorMappingSourceIndirectIndexEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code heapOffset} field. */
    @NativeType("uint32_t")
    public int heapOffset() { return nheapOffset(address()); }
    /** @return the value of the {@code pushOffset} field. */
    @NativeType("uint32_t")
    public int pushOffset() { return npushOffset(address()); }
    /** @return the value of the {@code addressOffset} field. */
    @NativeType("uint32_t")
    public int addressOffset() { return naddressOffset(address()); }
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
    /** @return the value of the {@code samplerPushOffset} field. */
    @NativeType("uint32_t")
    public int samplerPushOffset() { return nsamplerPushOffset(address()); }
    /** @return the value of the {@code samplerAddressOffset} field. */
    @NativeType("uint32_t")
    public int samplerAddressOffset() { return nsamplerAddressOffset(address()); }
    /** @return the value of the {@code samplerHeapIndexStride} field. */
    @NativeType("uint32_t")
    public int samplerHeapIndexStride() { return nsamplerHeapIndexStride(address()); }
    /** @return the value of the {@code samplerHeapArrayStride} field. */
    @NativeType("uint32_t")
    public int samplerHeapArrayStride() { return nsamplerHeapArrayStride(address()); }

    /** Sets the specified value to the {@code heapOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT heapOffset(@NativeType("uint32_t") int value) { nheapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code pushOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT pushOffset(@NativeType("uint32_t") int value) { npushOffset(address(), value); return this; }
    /** Sets the specified value to the {@code addressOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT addressOffset(@NativeType("uint32_t") int value) { naddressOffset(address(), value); return this; }
    /** Sets the specified value to the {@code heapIndexStride} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT heapIndexStride(@NativeType("uint32_t") int value) { nheapIndexStride(address(), value); return this; }
    /** Sets the specified value to the {@code heapArrayStride} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT heapArrayStride(@NativeType("uint32_t") int value) { nheapArrayStride(address(), value); return this; }
    /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { npEmbeddedSampler(address(), value); return this; }
    /** Sets the specified value to the {@code useCombinedImageSamplerIndex} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) { nuseCombinedImageSamplerIndex(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code samplerHeapOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT samplerHeapOffset(@NativeType("uint32_t") int value) { nsamplerHeapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerPushOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT samplerPushOffset(@NativeType("uint32_t") int value) { nsamplerPushOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerAddressOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT samplerAddressOffset(@NativeType("uint32_t") int value) { nsamplerAddressOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerHeapIndexStride} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT samplerHeapIndexStride(@NativeType("uint32_t") int value) { nsamplerHeapIndexStride(address(), value); return this; }
    /** Sets the specified value to the {@code samplerHeapArrayStride} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT samplerHeapArrayStride(@NativeType("uint32_t") int value) { nsamplerHeapArrayStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorMappingSourceIndirectIndexEXT set(
        int heapOffset,
        int pushOffset,
        int addressOffset,
        int heapIndexStride,
        int heapArrayStride,
        @Nullable VkSamplerCreateInfo pEmbeddedSampler,
        boolean useCombinedImageSamplerIndex,
        int samplerHeapOffset,
        int samplerPushOffset,
        int samplerAddressOffset,
        int samplerHeapIndexStride,
        int samplerHeapArrayStride
    ) {
        heapOffset(heapOffset);
        pushOffset(pushOffset);
        addressOffset(addressOffset);
        heapIndexStride(heapIndexStride);
        heapArrayStride(heapArrayStride);
        pEmbeddedSampler(pEmbeddedSampler);
        useCombinedImageSamplerIndex(useCombinedImageSamplerIndex);
        samplerHeapOffset(samplerHeapOffset);
        samplerPushOffset(samplerPushOffset);
        samplerAddressOffset(samplerAddressOffset);
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
    public VkDescriptorMappingSourceIndirectIndexEXT set(VkDescriptorMappingSourceIndirectIndexEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorMappingSourceIndirectIndexEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceIndirectIndexEXT malloc() {
        return new VkDescriptorMappingSourceIndirectIndexEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceIndirectIndexEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceIndirectIndexEXT calloc() {
        return new VkDescriptorMappingSourceIndirectIndexEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceIndirectIndexEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorMappingSourceIndirectIndexEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceIndirectIndexEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorMappingSourceIndirectIndexEXT} instance for the specified memory address. */
    public static VkDescriptorMappingSourceIndirectIndexEXT create(long address) {
        return new VkDescriptorMappingSourceIndirectIndexEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorMappingSourceIndirectIndexEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorMappingSourceIndirectIndexEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorMappingSourceIndirectIndexEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorMappingSourceIndirectIndexEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceIndirectIndexEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceIndirectIndexEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectIndexEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceIndirectIndexEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceIndirectIndexEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectIndexEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #heapOffset}. */
    public static int nheapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.HEAPOFFSET); }
    /** Unsafe version of {@link #pushOffset}. */
    public static int npushOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.PUSHOFFSET); }
    /** Unsafe version of {@link #addressOffset}. */
    public static int naddressOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.ADDRESSOFFSET); }
    /** Unsafe version of {@link #heapIndexStride}. */
    public static int nheapIndexStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.HEAPINDEXSTRIDE); }
    /** Unsafe version of {@link #heapArrayStride}. */
    public static int nheapArrayStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.HEAPARRAYSTRIDE); }
    /** Unsafe version of {@link #pEmbeddedSampler}. */
    public static @Nullable VkSamplerCreateInfo npEmbeddedSampler(long struct) { return VkSamplerCreateInfo.createSafe(memGetAddress(struct + VkDescriptorMappingSourceIndirectIndexEXT.PEMBEDDEDSAMPLER)); }
    /** Unsafe version of {@link #useCombinedImageSamplerIndex}. */
    public static int nuseCombinedImageSamplerIndex(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.USECOMBINEDIMAGESAMPLERINDEX); }
    /** Unsafe version of {@link #samplerHeapOffset}. */
    public static int nsamplerHeapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPOFFSET); }
    /** Unsafe version of {@link #samplerPushOffset}. */
    public static int nsamplerPushOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERPUSHOFFSET); }
    /** Unsafe version of {@link #samplerAddressOffset}. */
    public static int nsamplerAddressOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERADDRESSOFFSET); }
    /** Unsafe version of {@link #samplerHeapIndexStride}. */
    public static int nsamplerHeapIndexStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPINDEXSTRIDE); }
    /** Unsafe version of {@link #samplerHeapArrayStride}. */
    public static int nsamplerHeapArrayStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPARRAYSTRIDE); }

    /** Unsafe version of {@link #heapOffset(int) heapOffset}. */
    public static void nheapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.HEAPOFFSET, value); }
    /** Unsafe version of {@link #pushOffset(int) pushOffset}. */
    public static void npushOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.PUSHOFFSET, value); }
    /** Unsafe version of {@link #addressOffset(int) addressOffset}. */
    public static void naddressOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.ADDRESSOFFSET, value); }
    /** Unsafe version of {@link #heapIndexStride(int) heapIndexStride}. */
    public static void nheapIndexStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.HEAPINDEXSTRIDE, value); }
    /** Unsafe version of {@link #heapArrayStride(int) heapArrayStride}. */
    public static void nheapArrayStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.HEAPARRAYSTRIDE, value); }
    /** Unsafe version of {@link #pEmbeddedSampler(VkSamplerCreateInfo) pEmbeddedSampler}. */
    public static void npEmbeddedSampler(long struct, @Nullable VkSamplerCreateInfo value) { memPutAddress(struct + VkDescriptorMappingSourceIndirectIndexEXT.PEMBEDDEDSAMPLER, memAddressSafe(value)); }
    /** Unsafe version of {@link #useCombinedImageSamplerIndex(boolean) useCombinedImageSamplerIndex}. */
    public static void nuseCombinedImageSamplerIndex(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.USECOMBINEDIMAGESAMPLERINDEX, value); }
    /** Unsafe version of {@link #samplerHeapOffset(int) samplerHeapOffset}. */
    public static void nsamplerHeapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPOFFSET, value); }
    /** Unsafe version of {@link #samplerPushOffset(int) samplerPushOffset}. */
    public static void nsamplerPushOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERPUSHOFFSET, value); }
    /** Unsafe version of {@link #samplerAddressOffset(int) samplerAddressOffset}. */
    public static void nsamplerAddressOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERADDRESSOFFSET, value); }
    /** Unsafe version of {@link #samplerHeapIndexStride(int) samplerHeapIndexStride}. */
    public static void nsamplerHeapIndexStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPINDEXSTRIDE, value); }
    /** Unsafe version of {@link #samplerHeapArrayStride(int) samplerHeapArrayStride}. */
    public static void nsamplerHeapArrayStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPARRAYSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorMappingSourceIndirectIndexEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceIndirectIndexEXT, Buffer> implements NativeResource {

        private static final VkDescriptorMappingSourceIndirectIndexEXT ELEMENT_FACTORY = VkDescriptorMappingSourceIndirectIndexEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorMappingSourceIndirectIndexEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorMappingSourceIndirectIndexEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorMappingSourceIndirectIndexEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code heapOffset} field. */
        @NativeType("uint32_t")
        public int heapOffset() { return VkDescriptorMappingSourceIndirectIndexEXT.nheapOffset(address()); }
        /** @return the value of the {@code pushOffset} field. */
        @NativeType("uint32_t")
        public int pushOffset() { return VkDescriptorMappingSourceIndirectIndexEXT.npushOffset(address()); }
        /** @return the value of the {@code addressOffset} field. */
        @NativeType("uint32_t")
        public int addressOffset() { return VkDescriptorMappingSourceIndirectIndexEXT.naddressOffset(address()); }
        /** @return the value of the {@code heapIndexStride} field. */
        @NativeType("uint32_t")
        public int heapIndexStride() { return VkDescriptorMappingSourceIndirectIndexEXT.nheapIndexStride(address()); }
        /** @return the value of the {@code heapArrayStride} field. */
        @NativeType("uint32_t")
        public int heapArrayStride() { return VkDescriptorMappingSourceIndirectIndexEXT.nheapArrayStride(address()); }
        /** @return a {@link VkSamplerCreateInfo} view of the struct pointed to by the {@code pEmbeddedSampler} field. */
        @NativeType("VkSamplerCreateInfo const *")
        public @Nullable VkSamplerCreateInfo pEmbeddedSampler() { return VkDescriptorMappingSourceIndirectIndexEXT.npEmbeddedSampler(address()); }
        /** @return the value of the {@code useCombinedImageSamplerIndex} field. */
        @NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() { return VkDescriptorMappingSourceIndirectIndexEXT.nuseCombinedImageSamplerIndex(address()) != 0; }
        /** @return the value of the {@code samplerHeapOffset} field. */
        @NativeType("uint32_t")
        public int samplerHeapOffset() { return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapOffset(address()); }
        /** @return the value of the {@code samplerPushOffset} field. */
        @NativeType("uint32_t")
        public int samplerPushOffset() { return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerPushOffset(address()); }
        /** @return the value of the {@code samplerAddressOffset} field. */
        @NativeType("uint32_t")
        public int samplerAddressOffset() { return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerAddressOffset(address()); }
        /** @return the value of the {@code samplerHeapIndexStride} field. */
        @NativeType("uint32_t")
        public int samplerHeapIndexStride() { return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapIndexStride(address()); }
        /** @return the value of the {@code samplerHeapArrayStride} field. */
        @NativeType("uint32_t")
        public int samplerHeapArrayStride() { return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapArrayStride(address()); }

        /** Sets the specified value to the {@code heapOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer heapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.nheapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code pushOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer pushOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.npushOffset(address(), value); return this; }
        /** Sets the specified value to the {@code addressOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer addressOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.naddressOffset(address(), value); return this; }
        /** Sets the specified value to the {@code heapIndexStride} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer heapIndexStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.nheapIndexStride(address(), value); return this; }
        /** Sets the specified value to the {@code heapArrayStride} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer heapArrayStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.nheapArrayStride(address(), value); return this; }
        /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { VkDescriptorMappingSourceIndirectIndexEXT.npEmbeddedSampler(address(), value); return this; }
        /** Sets the specified value to the {@code useCombinedImageSamplerIndex} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) { VkDescriptorMappingSourceIndirectIndexEXT.nuseCombinedImageSamplerIndex(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code samplerHeapOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerHeapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerPushOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerPushOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.nsamplerPushOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerAddressOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerAddressOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.nsamplerAddressOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerHeapIndexStride} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerHeapIndexStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapIndexStride(address(), value); return this; }
        /** Sets the specified value to the {@code samplerHeapArrayStride} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerHeapArrayStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapArrayStride(address(), value); return this; }

    }

}