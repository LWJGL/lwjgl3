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
 * Structure describing whether rendering to VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 formats can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTRgba10x6Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #formatRgba10x6WithoutYCbCrSampler};
 * }</code></pre>
 */
public class VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMATRGBA10X6WITHOUTYCBCRSAMPLER;

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
        FORMATRGBA10X6WITHOUTYCBCRSAMPLER = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that {@link VK11#VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16} <b>can</b> be used with a {@code VkImageView} with {@code subresourceRange.aspectMask} equal to {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT} without a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> enabled. */
    @NativeType("VkBool32")
    public boolean formatRgba10x6WithoutYCbCrSampler() { return nformatRgba10x6WithoutYCbCrSampler(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTRgba10x6Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sType$Default() { return sType(EXTRgba10x6Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #formatRgba10x6WithoutYCbCrSampler} field. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT formatRgba10x6WithoutYCbCrSampler(@NativeType("VkBool32") boolean value) { nformatRgba10x6WithoutYCbCrSampler(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT set(
        int sType,
        long pNext,
        boolean formatRgba10x6WithoutYCbCrSampler
    ) {
        sType(sType);
        pNext(pNext);
        formatRgba10x6WithoutYCbCrSampler(formatRgba10x6WithoutYCbCrSampler);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT set(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #formatRgba10x6WithoutYCbCrSampler}. */
    public static int nformatRgba10x6WithoutYCbCrSampler(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.FORMATRGBA10X6WITHOUTYCBCRSAMPLER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #formatRgba10x6WithoutYCbCrSampler(boolean) formatRgba10x6WithoutYCbCrSampler}. */
    public static void nformatRgba10x6WithoutYCbCrSampler(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.FORMATRGBA10X6WITHOUTYCBCRSAMPLER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT#formatRgba10x6WithoutYCbCrSampler} field. */
        @NativeType("VkBool32")
        public boolean formatRgba10x6WithoutYCbCrSampler() { return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nformatRgba10x6WithoutYCbCrSampler(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT#sType} field. */
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTRgba10x6Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT} value to the {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT#sType} field. */
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer sType$Default() { return sType(EXTRgba10x6Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT#formatRgba10x6WithoutYCbCrSampler} field. */
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer formatRgba10x6WithoutYCbCrSampler(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nformatRgba10x6WithoutYCbCrSampler(address(), value ? 1 : 0); return this; }

    }

}