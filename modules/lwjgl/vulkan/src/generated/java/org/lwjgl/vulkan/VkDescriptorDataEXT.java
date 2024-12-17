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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * union VkDescriptorDataEXT {
 *     VkSampler const * pSampler;
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * pCombinedImageSampler;
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * pInputAttachmentImage;
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * pSampledImage;
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * pStorageImage;
 *     {@link VkDescriptorAddressInfoEXT VkDescriptorAddressInfoEXT} const * pUniformTexelBuffer;
 *     {@link VkDescriptorAddressInfoEXT VkDescriptorAddressInfoEXT} const * pStorageTexelBuffer;
 *     {@link VkDescriptorAddressInfoEXT VkDescriptorAddressInfoEXT} const * pUniformBuffer;
 *     {@link VkDescriptorAddressInfoEXT VkDescriptorAddressInfoEXT} const * pStorageBuffer;
 *     VkDeviceAddress accelerationStructure;
 * }}</pre>
 */
public class VkDescriptorDataEXT extends Struct<VkDescriptorDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PSAMPLER,
        PCOMBINEDIMAGESAMPLER,
        PINPUTATTACHMENTIMAGE,
        PSAMPLEDIMAGE,
        PSTORAGEIMAGE,
        PUNIFORMTEXELBUFFER,
        PSTORAGETEXELBUFFER,
        PUNIFORMBUFFER,
        PSTORAGEBUFFER,
        ACCELERATIONSTRUCTURE;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PSAMPLER = layout.offsetof(0);
        PCOMBINEDIMAGESAMPLER = layout.offsetof(1);
        PINPUTATTACHMENTIMAGE = layout.offsetof(2);
        PSAMPLEDIMAGE = layout.offsetof(3);
        PSTORAGEIMAGE = layout.offsetof(4);
        PUNIFORMTEXELBUFFER = layout.offsetof(5);
        PSTORAGETEXELBUFFER = layout.offsetof(6);
        PUNIFORMBUFFER = layout.offsetof(7);
        PSTORAGEBUFFER = layout.offsetof(8);
        ACCELERATIONSTRUCTURE = layout.offsetof(9);
    }

    protected VkDescriptorDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorDataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorDataEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSampler} field. */
    @NativeType("VkSampler const *")
    public LongBuffer pSampler(int capacity) { return npSampler(address(), capacity); }
    /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pCombinedImageSampler} field. */
    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pCombinedImageSampler() { return npCombinedImageSampler(address()); }
    /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pInputAttachmentImage} field. */
    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pInputAttachmentImage() { return npInputAttachmentImage(address()); }
    /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pSampledImage} field. */
    @NativeType("VkDescriptorImageInfo const *")
    public @Nullable VkDescriptorImageInfo pSampledImage() { return npSampledImage(address()); }
    /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pStorageImage} field. */
    @NativeType("VkDescriptorImageInfo const *")
    public @Nullable VkDescriptorImageInfo pStorageImage() { return npStorageImage(address()); }
    /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@code pUniformTexelBuffer} field. */
    @NativeType("VkDescriptorAddressInfoEXT const *")
    public @Nullable VkDescriptorAddressInfoEXT pUniformTexelBuffer() { return npUniformTexelBuffer(address()); }
    /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@code pStorageTexelBuffer} field. */
    @NativeType("VkDescriptorAddressInfoEXT const *")
    public @Nullable VkDescriptorAddressInfoEXT pStorageTexelBuffer() { return npStorageTexelBuffer(address()); }
    /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@code pUniformBuffer} field. */
    @NativeType("VkDescriptorAddressInfoEXT const *")
    public @Nullable VkDescriptorAddressInfoEXT pUniformBuffer() { return npUniformBuffer(address()); }
    /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@code pStorageBuffer} field. */
    @NativeType("VkDescriptorAddressInfoEXT const *")
    public @Nullable VkDescriptorAddressInfoEXT pStorageBuffer() { return npStorageBuffer(address()); }
    /** @return the value of the {@code accelerationStructure} field. */
    @NativeType("VkDeviceAddress")
    public long accelerationStructure() { return naccelerationStructure(address()); }

    /** Sets the address of the specified {@link LongBuffer} to the {@code pSampler} field. */
    public VkDescriptorDataEXT pSampler(@NativeType("VkSampler const *") LongBuffer value) { npSampler(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pCombinedImageSampler} field. */
    public VkDescriptorDataEXT pCombinedImageSampler(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { npCombinedImageSampler(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pInputAttachmentImage} field. */
    public VkDescriptorDataEXT pInputAttachmentImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { npInputAttachmentImage(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pSampledImage} field. */
    public VkDescriptorDataEXT pSampledImage(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { npSampledImage(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pStorageImage} field. */
    public VkDescriptorDataEXT pStorageImage(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { npStorageImage(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@code pUniformTexelBuffer} field. */
    public VkDescriptorDataEXT pUniformTexelBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { npUniformTexelBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@code pStorageTexelBuffer} field. */
    public VkDescriptorDataEXT pStorageTexelBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { npStorageTexelBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@code pUniformBuffer} field. */
    public VkDescriptorDataEXT pUniformBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { npUniformBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@code pStorageBuffer} field. */
    public VkDescriptorDataEXT pStorageBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { npStorageBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructure} field. */
    public VkDescriptorDataEXT accelerationStructure(@NativeType("VkDeviceAddress") long value) { naccelerationStructure(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorDataEXT set(VkDescriptorDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorDataEXT malloc() {
        return new VkDescriptorDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorDataEXT calloc() {
        return new VkDescriptorDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorDataEXT} instance for the specified memory address. */
    public static VkDescriptorDataEXT create(long address) {
        return new VkDescriptorDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorDataEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorDataEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorDataEXT malloc(MemoryStack stack) {
        return new VkDescriptorDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorDataEXT calloc(MemoryStack stack) {
        return new VkDescriptorDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pSampler(int) pSampler}. */
    public static LongBuffer npSampler(long struct, int capacity) { return memLongBuffer(memGetAddress(struct + VkDescriptorDataEXT.PSAMPLER), capacity); }
    /** Unsafe version of {@link #pCombinedImageSampler}. */
    public static VkDescriptorImageInfo npCombinedImageSampler(long struct) { return VkDescriptorImageInfo.create(memGetAddress(struct + VkDescriptorDataEXT.PCOMBINEDIMAGESAMPLER)); }
    /** Unsafe version of {@link #pInputAttachmentImage}. */
    public static VkDescriptorImageInfo npInputAttachmentImage(long struct) { return VkDescriptorImageInfo.create(memGetAddress(struct + VkDescriptorDataEXT.PINPUTATTACHMENTIMAGE)); }
    /** Unsafe version of {@link #pSampledImage}. */
    public static @Nullable VkDescriptorImageInfo npSampledImage(long struct) { return VkDescriptorImageInfo.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PSAMPLEDIMAGE)); }
    /** Unsafe version of {@link #pStorageImage}. */
    public static @Nullable VkDescriptorImageInfo npStorageImage(long struct) { return VkDescriptorImageInfo.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PSTORAGEIMAGE)); }
    /** Unsafe version of {@link #pUniformTexelBuffer}. */
    public static @Nullable VkDescriptorAddressInfoEXT npUniformTexelBuffer(long struct) { return VkDescriptorAddressInfoEXT.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PUNIFORMTEXELBUFFER)); }
    /** Unsafe version of {@link #pStorageTexelBuffer}. */
    public static @Nullable VkDescriptorAddressInfoEXT npStorageTexelBuffer(long struct) { return VkDescriptorAddressInfoEXT.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PSTORAGETEXELBUFFER)); }
    /** Unsafe version of {@link #pUniformBuffer}. */
    public static @Nullable VkDescriptorAddressInfoEXT npUniformBuffer(long struct) { return VkDescriptorAddressInfoEXT.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PUNIFORMBUFFER)); }
    /** Unsafe version of {@link #pStorageBuffer}. */
    public static @Nullable VkDescriptorAddressInfoEXT npStorageBuffer(long struct) { return VkDescriptorAddressInfoEXT.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PSTORAGEBUFFER)); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return memGetLong(struct + VkDescriptorDataEXT.ACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #pSampler(LongBuffer) pSampler}. */
    public static void npSampler(long struct, LongBuffer value) { memPutAddress(struct + VkDescriptorDataEXT.PSAMPLER, memAddress(value)); }
    /** Unsafe version of {@link #pCombinedImageSampler(VkDescriptorImageInfo) pCombinedImageSampler}. */
    public static void npCombinedImageSampler(long struct, VkDescriptorImageInfo value) { memPutAddress(struct + VkDescriptorDataEXT.PCOMBINEDIMAGESAMPLER, value.address()); }
    /** Unsafe version of {@link #pInputAttachmentImage(VkDescriptorImageInfo) pInputAttachmentImage}. */
    public static void npInputAttachmentImage(long struct, VkDescriptorImageInfo value) { memPutAddress(struct + VkDescriptorDataEXT.PINPUTATTACHMENTIMAGE, value.address()); }
    /** Unsafe version of {@link #pSampledImage(VkDescriptorImageInfo) pSampledImage}. */
    public static void npSampledImage(long struct, @Nullable VkDescriptorImageInfo value) { memPutAddress(struct + VkDescriptorDataEXT.PSAMPLEDIMAGE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStorageImage(VkDescriptorImageInfo) pStorageImage}. */
    public static void npStorageImage(long struct, @Nullable VkDescriptorImageInfo value) { memPutAddress(struct + VkDescriptorDataEXT.PSTORAGEIMAGE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pUniformTexelBuffer(VkDescriptorAddressInfoEXT) pUniformTexelBuffer}. */
    public static void npUniformTexelBuffer(long struct, @Nullable VkDescriptorAddressInfoEXT value) { memPutAddress(struct + VkDescriptorDataEXT.PUNIFORMTEXELBUFFER, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStorageTexelBuffer(VkDescriptorAddressInfoEXT) pStorageTexelBuffer}. */
    public static void npStorageTexelBuffer(long struct, @Nullable VkDescriptorAddressInfoEXT value) { memPutAddress(struct + VkDescriptorDataEXT.PSTORAGETEXELBUFFER, memAddressSafe(value)); }
    /** Unsafe version of {@link #pUniformBuffer(VkDescriptorAddressInfoEXT) pUniformBuffer}. */
    public static void npUniformBuffer(long struct, @Nullable VkDescriptorAddressInfoEXT value) { memPutAddress(struct + VkDescriptorDataEXT.PUNIFORMBUFFER, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStorageBuffer(VkDescriptorAddressInfoEXT) pStorageBuffer}. */
    public static void npStorageBuffer(long struct, @Nullable VkDescriptorAddressInfoEXT value) { memPutAddress(struct + VkDescriptorDataEXT.PSTORAGEBUFFER, memAddressSafe(value)); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { memPutLong(struct + VkDescriptorDataEXT.ACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorDataEXT, Buffer> implements NativeResource {

        private static final VkDescriptorDataEXT ELEMENT_FACTORY = VkDescriptorDataEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSampler} field. */
        @NativeType("VkSampler const *")
        public LongBuffer pSampler(int capacity) { return VkDescriptorDataEXT.npSampler(address(), capacity); }
        /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pCombinedImageSampler} field. */
        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pCombinedImageSampler() { return VkDescriptorDataEXT.npCombinedImageSampler(address()); }
        /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pInputAttachmentImage} field. */
        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pInputAttachmentImage() { return VkDescriptorDataEXT.npInputAttachmentImage(address()); }
        /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pSampledImage} field. */
        @NativeType("VkDescriptorImageInfo const *")
        public @Nullable VkDescriptorImageInfo pSampledImage() { return VkDescriptorDataEXT.npSampledImage(address()); }
        /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@code pStorageImage} field. */
        @NativeType("VkDescriptorImageInfo const *")
        public @Nullable VkDescriptorImageInfo pStorageImage() { return VkDescriptorDataEXT.npStorageImage(address()); }
        /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@code pUniformTexelBuffer} field. */
        @NativeType("VkDescriptorAddressInfoEXT const *")
        public @Nullable VkDescriptorAddressInfoEXT pUniformTexelBuffer() { return VkDescriptorDataEXT.npUniformTexelBuffer(address()); }
        /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@code pStorageTexelBuffer} field. */
        @NativeType("VkDescriptorAddressInfoEXT const *")
        public @Nullable VkDescriptorAddressInfoEXT pStorageTexelBuffer() { return VkDescriptorDataEXT.npStorageTexelBuffer(address()); }
        /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@code pUniformBuffer} field. */
        @NativeType("VkDescriptorAddressInfoEXT const *")
        public @Nullable VkDescriptorAddressInfoEXT pUniformBuffer() { return VkDescriptorDataEXT.npUniformBuffer(address()); }
        /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@code pStorageBuffer} field. */
        @NativeType("VkDescriptorAddressInfoEXT const *")
        public @Nullable VkDescriptorAddressInfoEXT pStorageBuffer() { return VkDescriptorDataEXT.npStorageBuffer(address()); }
        /** @return the value of the {@code accelerationStructure} field. */
        @NativeType("VkDeviceAddress")
        public long accelerationStructure() { return VkDescriptorDataEXT.naccelerationStructure(address()); }

        /** Sets the address of the specified {@link LongBuffer} to the {@code pSampler} field. */
        public VkDescriptorDataEXT.Buffer pSampler(@NativeType("VkSampler const *") LongBuffer value) { VkDescriptorDataEXT.npSampler(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pCombinedImageSampler} field. */
        public VkDescriptorDataEXT.Buffer pCombinedImageSampler(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { VkDescriptorDataEXT.npCombinedImageSampler(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pInputAttachmentImage} field. */
        public VkDescriptorDataEXT.Buffer pInputAttachmentImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { VkDescriptorDataEXT.npInputAttachmentImage(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pSampledImage} field. */
        public VkDescriptorDataEXT.Buffer pSampledImage(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { VkDescriptorDataEXT.npSampledImage(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@code pStorageImage} field. */
        public VkDescriptorDataEXT.Buffer pStorageImage(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { VkDescriptorDataEXT.npStorageImage(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@code pUniformTexelBuffer} field. */
        public VkDescriptorDataEXT.Buffer pUniformTexelBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { VkDescriptorDataEXT.npUniformTexelBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@code pStorageTexelBuffer} field. */
        public VkDescriptorDataEXT.Buffer pStorageTexelBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { VkDescriptorDataEXT.npStorageTexelBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@code pUniformBuffer} field. */
        public VkDescriptorDataEXT.Buffer pUniformBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { VkDescriptorDataEXT.npUniformBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@code pStorageBuffer} field. */
        public VkDescriptorDataEXT.Buffer pStorageBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { VkDescriptorDataEXT.npStorageBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructure} field. */
        public VkDescriptorDataEXT.Buffer accelerationStructure(@NativeType("VkDeviceAddress") long value) { VkDescriptorDataEXT.naccelerationStructure(address(), value); return this; }

    }

}