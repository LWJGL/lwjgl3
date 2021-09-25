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
 * Structure specifying sparse image format inputs.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code samples} <b>must</b> be a bit value that is set in {@link VkImageFormatProperties}{@code ::sampleCounts} returned by {@code vkGetPhysicalDeviceImageFormatProperties} with {@code format}, {@code type}, {@code tiling}, and {@code usage} equal to those in this command and {@code flags} equal to the value that is set in {@link VkImageCreateInfo}{@code ::flags} when the image is created</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkGetPhysicalDeviceSparseImageFormatProperties2 GetPhysicalDeviceSparseImageFormatProperties2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceSparseImageFormatProperties2KHR GetPhysicalDeviceSparseImageFormatProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSparseImageFormatInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFormat {@link #format};
 *     VkImageType {@link #type};
 *     VkSampleCountFlagBits {@link #samples};
 *     VkImageUsageFlags {@link #usage};
 *     VkImageTiling {@link #tiling};
 * }</code></pre>
 */
public class VkPhysicalDeviceSparseImageFormatInfo2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        TYPE,
        SAMPLES,
        USAGE,
        TILING;

    static {
        Layout layout = __struct(
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

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        TYPE = layout.offsetof(3);
        SAMPLES = layout.offsetof(4);
        USAGE = layout.offsetof(5);
        TILING = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSparseImageFormatInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSparseImageFormatInfo2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the image format. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** the dimensionality of image. */
    @NativeType("VkImageType")
    public int type() { return ntype(address()); }
    /** a {@code VkSampleCountFlagBits} value specifying the number of samples per texel. */
    @NativeType("VkSampleCountFlagBits")
    public int samples() { return nsamples(address()); }
    /** a bitmask describing the intended usage of the image. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** the tiling arrangement of the texel blocks in memory. */
    @NativeType("VkImageTiling")
    public int tiling() { return ntiling(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2} value to the {@link #sType} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2 format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2 type(@NativeType("VkImageType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #samples} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2 samples(@NativeType("VkSampleCountFlagBits") int value) { nsamples(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2 usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@link #tiling} field. */
    public VkPhysicalDeviceSparseImageFormatInfo2 tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSparseImageFormatInfo2 set(
        int sType,
        long pNext,
        int format,
        int type,
        int samples,
        int usage,
        int tiling
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        samples(samples);
        usage(usage);
        tiling(tiling);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSparseImageFormatInfo2 set(VkPhysicalDeviceSparseImageFormatInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSparseImageFormatInfo2 malloc() {
        return wrap(VkPhysicalDeviceSparseImageFormatInfo2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSparseImageFormatInfo2 calloc() {
        return wrap(VkPhysicalDeviceSparseImageFormatInfo2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSparseImageFormatInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSparseImageFormatInfo2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2} instance for the specified memory address. */
    public static VkPhysicalDeviceSparseImageFormatInfo2 create(long address) {
        return wrap(VkPhysicalDeviceSparseImageFormatInfo2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSparseImageFormatInfo2 createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSparseImageFormatInfo2.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSparseImageFormatInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2 malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSparseImageFormatInfo2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2 calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSparseImageFormatInfo2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSparseImageFormatInfo2.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.FORMAT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.TYPE); }
    /** Unsafe version of {@link #samples}. */
    public static int nsamples(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.SAMPLES); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.USAGE); }
    /** Unsafe version of {@link #tiling}. */
    public static int ntiling(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.TILING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSparseImageFormatInfo2.PNEXT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.FORMAT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.TYPE, value); }
    /** Unsafe version of {@link #samples(int) samples}. */
    public static void nsamples(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.SAMPLES, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.USAGE, value); }
    /** Unsafe version of {@link #tiling(int) tiling}. */
    public static void ntiling(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSparseImageFormatInfo2.TILING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSparseImageFormatInfo2} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSparseImageFormatInfo2, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSparseImageFormatInfo2 ELEMENT_FACTORY = VkPhysicalDeviceSparseImageFormatInfo2.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSparseImageFormatInfo2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSparseImageFormatInfo2#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSparseImageFormatInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSparseImageFormatInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSparseImageFormatInfo2.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSparseImageFormatInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceSparseImageFormatInfo2.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSparseImageFormatInfo2#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkPhysicalDeviceSparseImageFormatInfo2.nformat(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSparseImageFormatInfo2#type} field. */
        @NativeType("VkImageType")
        public int type() { return VkPhysicalDeviceSparseImageFormatInfo2.ntype(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSparseImageFormatInfo2#samples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int samples() { return VkPhysicalDeviceSparseImageFormatInfo2.nsamples(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSparseImageFormatInfo2#usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkPhysicalDeviceSparseImageFormatInfo2.nusage(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSparseImageFormatInfo2#tiling} field. */
        @NativeType("VkImageTiling")
        public int tiling() { return VkPhysicalDeviceSparseImageFormatInfo2.ntiling(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceSparseImageFormatInfo2#sType} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSparseImageFormatInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2} value to the {@link VkPhysicalDeviceSparseImageFormatInfo2#sType} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSparseImageFormatInfo2#pNext} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceSparseImageFormatInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceSparseImageFormatInfo2#format} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2.Buffer format(@NativeType("VkFormat") int value) { VkPhysicalDeviceSparseImageFormatInfo2.nformat(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceSparseImageFormatInfo2#type} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2.Buffer type(@NativeType("VkImageType") int value) { VkPhysicalDeviceSparseImageFormatInfo2.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceSparseImageFormatInfo2#samples} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2.Buffer samples(@NativeType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceSparseImageFormatInfo2.nsamples(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceSparseImageFormatInfo2#usage} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkPhysicalDeviceSparseImageFormatInfo2.nusage(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceSparseImageFormatInfo2#tiling} field. */
        public VkPhysicalDeviceSparseImageFormatInfo2.Buffer tiling(@NativeType("VkImageTiling") int value) { VkPhysicalDeviceSparseImageFormatInfo2.ntiling(address(), value); return this; }

    }

}