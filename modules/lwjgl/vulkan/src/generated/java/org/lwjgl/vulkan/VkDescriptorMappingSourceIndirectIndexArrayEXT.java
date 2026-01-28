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
 * struct VkDescriptorMappingSourceIndirectIndexArrayEXT {
 *     uint32_t heapOffset;
 *     uint32_t pushOffset;
 *     uint32_t addressOffset;
 *     uint32_t heapIndexStride;
 *     {@link VkSamplerCreateInfo VkSamplerCreateInfo} const * pEmbeddedSampler;
 *     VkBool32 useCombinedImageSamplerIndex;
 *     uint32_t samplerHeapOffset;
 *     uint32_t samplerPushOffset;
 *     uint32_t samplerAddressOffset;
 *     uint32_t samplerHeapIndexStride;
 * }</code></pre>
 */
public class VkDescriptorMappingSourceIndirectIndexArrayEXT extends Struct<VkDescriptorMappingSourceIndirectIndexArrayEXT> implements NativeResource {

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
        PEMBEDDEDSAMPLER,
        USECOMBINEDIMAGESAMPLERINDEX,
        SAMPLERHEAPOFFSET,
        SAMPLERPUSHOFFSET,
        SAMPLERADDRESSOFFSET,
        SAMPLERHEAPINDEXSTRIDE;

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
        PUSHOFFSET = layout.offsetof(1);
        ADDRESSOFFSET = layout.offsetof(2);
        HEAPINDEXSTRIDE = layout.offsetof(3);
        PEMBEDDEDSAMPLER = layout.offsetof(4);
        USECOMBINEDIMAGESAMPLERINDEX = layout.offsetof(5);
        SAMPLERHEAPOFFSET = layout.offsetof(6);
        SAMPLERPUSHOFFSET = layout.offsetof(7);
        SAMPLERADDRESSOFFSET = layout.offsetof(8);
        SAMPLERHEAPINDEXSTRIDE = layout.offsetof(9);
    }

    protected VkDescriptorMappingSourceIndirectIndexArrayEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorMappingSourceIndirectIndexArrayEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorMappingSourceIndirectIndexArrayEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT(ByteBuffer container) {
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

    /** Sets the specified value to the {@code heapOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT heapOffset(@NativeType("uint32_t") int value) { nheapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code pushOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT pushOffset(@NativeType("uint32_t") int value) { npushOffset(address(), value); return this; }
    /** Sets the specified value to the {@code addressOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT addressOffset(@NativeType("uint32_t") int value) { naddressOffset(address(), value); return this; }
    /** Sets the specified value to the {@code heapIndexStride} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT heapIndexStride(@NativeType("uint32_t") int value) { nheapIndexStride(address(), value); return this; }
    /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { npEmbeddedSampler(address(), value); return this; }
    /** Sets the specified value to the {@code useCombinedImageSamplerIndex} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) { nuseCombinedImageSamplerIndex(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code samplerHeapOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT samplerHeapOffset(@NativeType("uint32_t") int value) { nsamplerHeapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerPushOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT samplerPushOffset(@NativeType("uint32_t") int value) { nsamplerPushOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerAddressOffset} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT samplerAddressOffset(@NativeType("uint32_t") int value) { nsamplerAddressOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerHeapIndexStride} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT samplerHeapIndexStride(@NativeType("uint32_t") int value) { nsamplerHeapIndexStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT set(
        int heapOffset,
        int pushOffset,
        int addressOffset,
        int heapIndexStride,
        @Nullable VkSamplerCreateInfo pEmbeddedSampler,
        boolean useCombinedImageSamplerIndex,
        int samplerHeapOffset,
        int samplerPushOffset,
        int samplerAddressOffset,
        int samplerHeapIndexStride
    ) {
        heapOffset(heapOffset);
        pushOffset(pushOffset);
        addressOffset(addressOffset);
        heapIndexStride(heapIndexStride);
        pEmbeddedSampler(pEmbeddedSampler);
        useCombinedImageSamplerIndex(useCombinedImageSamplerIndex);
        samplerHeapOffset(samplerHeapOffset);
        samplerPushOffset(samplerPushOffset);
        samplerAddressOffset(samplerAddressOffset);
        samplerHeapIndexStride(samplerHeapIndexStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT set(VkDescriptorMappingSourceIndirectIndexArrayEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorMappingSourceIndirectIndexArrayEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT malloc() {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceIndirectIndexArrayEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT calloc() {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceIndirectIndexArrayEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorMappingSourceIndirectIndexArrayEXT} instance for the specified memory address. */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT create(long address) {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorMappingSourceIndirectIndexArrayEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorMappingSourceIndirectIndexArrayEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceIndirectIndexArrayEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceIndirectIndexArrayEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #heapOffset}. */
    public static int nheapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.HEAPOFFSET); }
    /** Unsafe version of {@link #pushOffset}. */
    public static int npushOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.PUSHOFFSET); }
    /** Unsafe version of {@link #addressOffset}. */
    public static int naddressOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.ADDRESSOFFSET); }
    /** Unsafe version of {@link #heapIndexStride}. */
    public static int nheapIndexStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.HEAPINDEXSTRIDE); }
    /** Unsafe version of {@link #pEmbeddedSampler}. */
    public static @Nullable VkSamplerCreateInfo npEmbeddedSampler(long struct) { return VkSamplerCreateInfo.createSafe(memGetAddress(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.PEMBEDDEDSAMPLER)); }
    /** Unsafe version of {@link #useCombinedImageSamplerIndex}. */
    public static int nuseCombinedImageSamplerIndex(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.USECOMBINEDIMAGESAMPLERINDEX); }
    /** Unsafe version of {@link #samplerHeapOffset}. */
    public static int nsamplerHeapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.SAMPLERHEAPOFFSET); }
    /** Unsafe version of {@link #samplerPushOffset}. */
    public static int nsamplerPushOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.SAMPLERPUSHOFFSET); }
    /** Unsafe version of {@link #samplerAddressOffset}. */
    public static int nsamplerAddressOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.SAMPLERADDRESSOFFSET); }
    /** Unsafe version of {@link #samplerHeapIndexStride}. */
    public static int nsamplerHeapIndexStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.SAMPLERHEAPINDEXSTRIDE); }

    /** Unsafe version of {@link #heapOffset(int) heapOffset}. */
    public static void nheapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.HEAPOFFSET, value); }
    /** Unsafe version of {@link #pushOffset(int) pushOffset}. */
    public static void npushOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.PUSHOFFSET, value); }
    /** Unsafe version of {@link #addressOffset(int) addressOffset}. */
    public static void naddressOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.ADDRESSOFFSET, value); }
    /** Unsafe version of {@link #heapIndexStride(int) heapIndexStride}. */
    public static void nheapIndexStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.HEAPINDEXSTRIDE, value); }
    /** Unsafe version of {@link #pEmbeddedSampler(VkSamplerCreateInfo) pEmbeddedSampler}. */
    public static void npEmbeddedSampler(long struct, @Nullable VkSamplerCreateInfo value) { memPutAddress(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.PEMBEDDEDSAMPLER, memAddressSafe(value)); }
    /** Unsafe version of {@link #useCombinedImageSamplerIndex(boolean) useCombinedImageSamplerIndex}. */
    public static void nuseCombinedImageSamplerIndex(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.USECOMBINEDIMAGESAMPLERINDEX, value); }
    /** Unsafe version of {@link #samplerHeapOffset(int) samplerHeapOffset}. */
    public static void nsamplerHeapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.SAMPLERHEAPOFFSET, value); }
    /** Unsafe version of {@link #samplerPushOffset(int) samplerPushOffset}. */
    public static void nsamplerPushOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.SAMPLERPUSHOFFSET, value); }
    /** Unsafe version of {@link #samplerAddressOffset(int) samplerAddressOffset}. */
    public static void nsamplerAddressOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.SAMPLERADDRESSOFFSET, value); }
    /** Unsafe version of {@link #samplerHeapIndexStride(int) samplerHeapIndexStride}. */
    public static void nsamplerHeapIndexStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectIndexArrayEXT.SAMPLERHEAPINDEXSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorMappingSourceIndirectIndexArrayEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceIndirectIndexArrayEXT, Buffer> implements NativeResource {

        private static final VkDescriptorMappingSourceIndirectIndexArrayEXT ELEMENT_FACTORY = VkDescriptorMappingSourceIndirectIndexArrayEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorMappingSourceIndirectIndexArrayEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorMappingSourceIndirectIndexArrayEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code heapOffset} field. */
        @NativeType("uint32_t")
        public int heapOffset() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.nheapOffset(address()); }
        /** @return the value of the {@code pushOffset} field. */
        @NativeType("uint32_t")
        public int pushOffset() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.npushOffset(address()); }
        /** @return the value of the {@code addressOffset} field. */
        @NativeType("uint32_t")
        public int addressOffset() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.naddressOffset(address()); }
        /** @return the value of the {@code heapIndexStride} field. */
        @NativeType("uint32_t")
        public int heapIndexStride() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.nheapIndexStride(address()); }
        /** @return a {@link VkSamplerCreateInfo} view of the struct pointed to by the {@code pEmbeddedSampler} field. */
        @NativeType("VkSamplerCreateInfo const *")
        public @Nullable VkSamplerCreateInfo pEmbeddedSampler() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.npEmbeddedSampler(address()); }
        /** @return the value of the {@code useCombinedImageSamplerIndex} field. */
        @NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.nuseCombinedImageSamplerIndex(address()) != 0; }
        /** @return the value of the {@code samplerHeapOffset} field. */
        @NativeType("uint32_t")
        public int samplerHeapOffset() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerHeapOffset(address()); }
        /** @return the value of the {@code samplerPushOffset} field. */
        @NativeType("uint32_t")
        public int samplerPushOffset() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerPushOffset(address()); }
        /** @return the value of the {@code samplerAddressOffset} field. */
        @NativeType("uint32_t")
        public int samplerAddressOffset() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerAddressOffset(address()); }
        /** @return the value of the {@code samplerHeapIndexStride} field. */
        @NativeType("uint32_t")
        public int samplerHeapIndexStride() { return VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerHeapIndexStride(address()); }

        /** Sets the specified value to the {@code heapOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer heapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.nheapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code pushOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer pushOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.npushOffset(address(), value); return this; }
        /** Sets the specified value to the {@code addressOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer addressOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.naddressOffset(address(), value); return this; }
        /** Sets the specified value to the {@code heapIndexStride} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer heapIndexStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.nheapIndexStride(address(), value); return this; }
        /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.npEmbeddedSampler(address(), value); return this; }
        /** Sets the specified value to the {@code useCombinedImageSamplerIndex} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.nuseCombinedImageSamplerIndex(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code samplerHeapOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer samplerHeapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerHeapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerPushOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer samplerPushOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerPushOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerAddressOffset} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer samplerAddressOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerAddressOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerHeapIndexStride} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT.Buffer samplerHeapIndexStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerHeapIndexStride(address(), value); return this; }

    }

}