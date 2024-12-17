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
 * struct VkPhysicalDeviceImageFormatInfo2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFormat format;
 *     VkImageType type;
 *     VkImageTiling tiling;
 *     VkImageUsageFlags usage;
 *     VkImageCreateFlags flags;
 * }}</pre>
 */
public class VkPhysicalDeviceImageFormatInfo2 extends Struct<VkPhysicalDeviceImageFormatInfo2> implements NativeResource {

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
        TILING,
        USAGE,
        FLAGS;

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
        TILING = layout.offsetof(4);
        USAGE = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
    }

    protected VkPhysicalDeviceImageFormatInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageFormatInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageFormatInfo2(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageFormatInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageFormatInfo2(ByteBuffer container) {
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
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("VkImageType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code tiling} field. */
    @NativeType("VkImageTiling")
    public int tiling() { return ntiling(address()); }
    /** @return the value of the {@code usage} field. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkImageCreateFlags")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageFormatInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2} value to the {@code sType} field. */
    public VkPhysicalDeviceImageFormatInfo2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkImageCompressionControlEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageCompressionControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageStencilUsageCreateInfo} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageStencilUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageStencilUsageCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageStencilUsageCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkOpticalFlowImageFormatInfoNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkOpticalFlowImageFormatInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalImageFormatInfo} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceExternalImageFormatInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalImageFormatInfoKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceExternalImageFormatInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceImageDrmFormatModifierInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageViewImageFormatInfoEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceImageViewImageFormatInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfileListInfoKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkVideoProfileListInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code format} field. */
    public VkPhysicalDeviceImageFormatInfo2 format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkPhysicalDeviceImageFormatInfo2 type(@NativeType("VkImageType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code tiling} field. */
    public VkPhysicalDeviceImageFormatInfo2 tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkPhysicalDeviceImageFormatInfo2 usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPhysicalDeviceImageFormatInfo2 flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageFormatInfo2 set(
        int sType,
        long pNext,
        int format,
        int type,
        int tiling,
        int usage,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        tiling(tiling);
        usage(usage);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageFormatInfo2 set(VkPhysicalDeviceImageFormatInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageFormatInfo2 malloc() {
        return new VkPhysicalDeviceImageFormatInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageFormatInfo2 calloc() {
        return new VkPhysicalDeviceImageFormatInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageFormatInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageFormatInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance for the specified memory address. */
    public static VkPhysicalDeviceImageFormatInfo2 create(long address) {
        return new VkPhysicalDeviceImageFormatInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageFormatInfo2 createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageFormatInfo2(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageFormatInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageFormatInfo2 malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageFormatInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageFormatInfo2 calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageFormatInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageFormatInfo2.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2.FORMAT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2.TYPE); }
    /** Unsafe version of {@link #tiling}. */
    public static int ntiling(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2.TILING); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2.USAGE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPhysicalDeviceImageFormatInfo2.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageFormatInfo2.PNEXT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2.FORMAT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2.TYPE, value); }
    /** Unsafe version of {@link #tiling(int) tiling}. */
    public static void ntiling(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2.TILING, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2.USAGE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageFormatInfo2.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageFormatInfo2} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageFormatInfo2, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageFormatInfo2 ELEMENT_FACTORY = VkPhysicalDeviceImageFormatInfo2.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageFormatInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageFormatInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageFormatInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageFormatInfo2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceImageFormatInfo2.npNext(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkPhysicalDeviceImageFormatInfo2.nformat(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkImageType")
        public int type() { return VkPhysicalDeviceImageFormatInfo2.ntype(address()); }
        /** @return the value of the {@code tiling} field. */
        @NativeType("VkImageTiling")
        public int tiling() { return VkPhysicalDeviceImageFormatInfo2.ntiling(address()); }
        /** @return the value of the {@code usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkPhysicalDeviceImageFormatInfo2.nusage(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkImageCreateFlags")
        public int flags() { return VkPhysicalDeviceImageFormatInfo2.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageFormatInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2} value to the {@code sType} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceImageFormatInfo2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkImageCompressionControlEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkImageCompressionControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageStencilUsageCreateInfo} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkImageStencilUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageStencilUsageCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkImageStencilUsageCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkOpticalFlowImageFormatInfoNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkOpticalFlowImageFormatInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalImageFormatInfo} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkPhysicalDeviceExternalImageFormatInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalImageFormatInfoKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkPhysicalDeviceExternalImageFormatInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkPhysicalDeviceImageDrmFormatModifierInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageViewImageFormatInfoEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkPhysicalDeviceImageViewImageFormatInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfileListInfoKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkVideoProfileListInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code format} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer format(@NativeType("VkFormat") int value) { VkPhysicalDeviceImageFormatInfo2.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer type(@NativeType("VkImageType") int value) { VkPhysicalDeviceImageFormatInfo2.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code tiling} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer tiling(@NativeType("VkImageTiling") int value) { VkPhysicalDeviceImageFormatInfo2.ntiling(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkPhysicalDeviceImageFormatInfo2.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkPhysicalDeviceImageFormatInfo2.nflags(address(), value); return this; }

    }

}