/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure specifying combined image sampler descriptor count for multi-planar images.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code combinedImageSamplerDescriptorCount} &ndash; the number of combined image sampler descriptors that the implementation uses to access the format.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSamplerYcbcrConversionImageFormatProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t combinedImageSamplerDescriptorCount;
 * }</pre></code>
 */
public class VkSamplerYcbcrConversionImageFormatProperties extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMBINEDIMAGESAMPLERDESCRIPTORCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMBINEDIMAGESAMPLERDESCRIPTORCOUNT = layout.offsetof(2);
    }

    VkSamplerYcbcrConversionImageFormatProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSamplerYcbcrConversionImageFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionImageFormatProperties(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code combinedImageSamplerDescriptorCount} field. */
    @NativeType("uint32_t")
    public int combinedImageSamplerDescriptorCount() { return ncombinedImageSamplerDescriptorCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerYcbcrConversionImageFormatProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerYcbcrConversionImageFormatProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerYcbcrConversionImageFormatProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerYcbcrConversionImageFormatProperties set(VkSamplerYcbcrConversionImageFormatProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSamplerYcbcrConversionImageFormatProperties} instance for the specified memory address. */
    public static VkSamplerYcbcrConversionImageFormatProperties create(long address) {
        return new VkSamplerYcbcrConversionImageFormatProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionImageFormatProperties createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionImageFormatProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionImageFormatProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionImageFormatProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionImageFormatProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerYcbcrConversionImageFormatProperties.PNEXT); }
    /** Unsafe version of {@link #combinedImageSamplerDescriptorCount}. */
    public static int ncombinedImageSamplerDescriptorCount(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionImageFormatProperties.COMBINEDIMAGESAMPLERDESCRIPTORCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionImageFormatProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerYcbcrConversionImageFormatProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionImageFormatProperties} structs. */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionImageFormatProperties, Buffer> {

        /**
         * Creates a new {@link VkSamplerYcbcrConversionImageFormatProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionImageFormatProperties#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkSamplerYcbcrConversionImageFormatProperties newInstance(long address) {
            return new VkSamplerYcbcrConversionImageFormatProperties(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerYcbcrConversionImageFormatProperties.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSamplerYcbcrConversionImageFormatProperties.npNext(address()); }
        /** Returns the value of the {@code combinedImageSamplerDescriptorCount} field. */
        @NativeType("uint32_t")
        public int combinedImageSamplerDescriptorCount() { return VkSamplerYcbcrConversionImageFormatProperties.ncombinedImageSamplerDescriptorCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerYcbcrConversionImageFormatProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionImageFormatProperties.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerYcbcrConversionImageFormatProperties.Buffer pNext(@NativeType("void *") long value) { VkSamplerYcbcrConversionImageFormatProperties.npNext(address(), value); return this; }

    }

}