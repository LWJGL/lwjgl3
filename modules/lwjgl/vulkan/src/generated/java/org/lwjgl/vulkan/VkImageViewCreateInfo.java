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
 * struct VkImageViewCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageViewCreateFlags flags;
 *     VkImage image;
 *     VkImageViewType viewType;
 *     VkFormat format;
 *     {@link VkComponentMapping VkComponentMapping} components;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }</code></pre>
 */
public class VkImageViewCreateInfo extends Struct<VkImageViewCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        IMAGE,
        VIEWTYPE,
        FORMAT,
        COMPONENTS,
        SUBRESOURCERANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF),
            __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        IMAGE = layout.offsetof(3);
        VIEWTYPE = layout.offsetof(4);
        FORMAT = layout.offsetof(5);
        COMPONENTS = layout.offsetof(6);
        SUBRESOURCERANGE = layout.offsetof(7);
    }

    protected VkImageViewCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageViewCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkImageViewCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkImageViewCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkImageViewCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** @return the value of the {@code viewType} field. */
    @NativeType("VkImageViewType")
    public int viewType() { return nviewType(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return a {@link VkComponentMapping} view of the {@code components} field. */
    public VkComponentMapping components() { return ncomponents(address()); }
    /** @return a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageViewCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO} value to the {@code sType} field. */
    public VkImageViewCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageViewCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageViewASTCDecodeModeEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewASTCDecodeModeEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageViewMinLodCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewMinLodCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageViewSampleWeightCreateInfoQCOM} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewSampleWeightCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageViewSlicedCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewSlicedCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageViewUsageCreateInfo} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageViewUsageCreateInfoKHR} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewUsageCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionInfo} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkSamplerYcbcrConversionInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionInfoKHR} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkSamplerYcbcrConversionInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkImageViewCreateInfo flags(@NativeType("VkImageViewCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkImageViewCreateInfo image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code viewType} field. */
    public VkImageViewCreateInfo viewType(@NativeType("VkImageViewType") int value) { nviewType(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkImageViewCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
    public VkImageViewCreateInfo components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageViewCreateInfo components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
    public VkImageViewCreateInfo subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageViewCreateInfo subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewCreateInfo set(
        int sType,
        long pNext,
        int flags,
        long image,
        int viewType,
        int format,
        VkComponentMapping components,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        image(image);
        viewType(viewType);
        format(format);
        components(components);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageViewCreateInfo set(VkImageViewCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewCreateInfo malloc() {
        return new VkImageViewCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewCreateInfo calloc() {
        return new VkImageViewCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkImageViewCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewCreateInfo} instance for the specified memory address. */
    public static VkImageViewCreateInfo create(long address) {
        return new VkImageViewCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageViewCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkImageViewCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageViewCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageViewCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCreateInfo malloc(MemoryStack stack) {
        return new VkImageViewCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCreateInfo calloc(MemoryStack stack) {
        return new VkImageViewCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageViewCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkImageViewCreateInfo.FLAGS); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkImageViewCreateInfo.IMAGE); }
    /** Unsafe version of {@link #viewType}. */
    public static int nviewType(long struct) { return memGetInt(struct + VkImageViewCreateInfo.VIEWTYPE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkImageViewCreateInfo.FORMAT); }
    /** Unsafe version of {@link #components}. */
    public static VkComponentMapping ncomponents(long struct) { return VkComponentMapping.create(struct + VkImageViewCreateInfo.COMPONENTS); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageViewCreateInfo.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkImageViewCreateInfo.IMAGE, value); }
    /** Unsafe version of {@link #viewType(int) viewType}. */
    public static void nviewType(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.VIEWTYPE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #components(VkComponentMapping) components}. */
    public static void ncomponents(long struct, VkComponentMapping value) { memCopy(value.address(), struct + VkImageViewCreateInfo.COMPONENTS, VkComponentMapping.SIZEOF); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageViewCreateInfo.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageViewCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageViewCreateInfo, Buffer> implements NativeResource {

        private static final VkImageViewCreateInfo ELEMENT_FACTORY = VkImageViewCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkImageViewCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageViewCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkImageViewCreateFlags")
        public int flags() { return VkImageViewCreateInfo.nflags(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageViewCreateInfo.nimage(address()); }
        /** @return the value of the {@code viewType} field. */
        @NativeType("VkImageViewType")
        public int viewType() { return VkImageViewCreateInfo.nviewType(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkImageViewCreateInfo.nformat(address()); }
        /** @return a {@link VkComponentMapping} view of the {@code components} field. */
        public VkComponentMapping components() { return VkImageViewCreateInfo.ncomponents(address()); }
        /** @return a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkImageViewCreateInfo.nsubresourceRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageViewCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO} value to the {@code sType} field. */
        public VkImageViewCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageViewCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageViewCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageViewASTCDecodeModeEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewASTCDecodeModeEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageViewMinLodCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewMinLodCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageViewSampleWeightCreateInfoQCOM} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewSampleWeightCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageViewSlicedCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewSlicedCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageViewUsageCreateInfo} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageViewUsageCreateInfoKHR} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewUsageCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionInfo} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkSamplerYcbcrConversionInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionInfoKHR} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkSamplerYcbcrConversionInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkImageViewCreateInfo.Buffer flags(@NativeType("VkImageViewCreateFlags") int value) { VkImageViewCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkImageViewCreateInfo.Buffer image(@NativeType("VkImage") long value) { VkImageViewCreateInfo.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code viewType} field. */
        public VkImageViewCreateInfo.Buffer viewType(@NativeType("VkImageViewType") int value) { VkImageViewCreateInfo.nviewType(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkImageViewCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkImageViewCreateInfo.nformat(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
        public VkImageViewCreateInfo.Buffer components(VkComponentMapping value) { VkImageViewCreateInfo.ncomponents(address(), value); return this; }
        /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageViewCreateInfo.Buffer components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
        public VkImageViewCreateInfo.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageViewCreateInfo.nsubresourceRange(address(), value); return this; }
        /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageViewCreateInfo.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}