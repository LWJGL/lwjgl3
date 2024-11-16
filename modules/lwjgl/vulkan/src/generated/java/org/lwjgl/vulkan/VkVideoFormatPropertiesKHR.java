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
 * Structure enumerating the video image formats.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComponentMapping}, {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoFormatPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkFormat {@link #format};
 *     {@link VkComponentMapping VkComponentMapping} {@link #componentMapping};
 *     VkImageCreateFlags {@link #imageCreateFlags};
 *     VkImageType {@link #imageType};
 *     VkImageTiling {@link #imageTiling};
 *     VkImageUsageFlags {@link #imageUsageFlags};
 * }</code></pre>
 */
public class VkVideoFormatPropertiesKHR extends Struct<VkVideoFormatPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        COMPONENTMAPPING,
        IMAGECREATEFLAGS,
        IMAGETYPE,
        IMAGETILING,
        IMAGEUSAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF),
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
        COMPONENTMAPPING = layout.offsetof(3);
        IMAGECREATEFLAGS = layout.offsetof(4);
        IMAGETYPE = layout.offsetof(5);
        IMAGETILING = layout.offsetof(6);
        IMAGEUSAGEFLAGS = layout.offsetof(7);
    }

    protected VkVideoFormatPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoFormatPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoFormatPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoFormatPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoFormatPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkFormat} that specifies the format that <b>can</b> be used with the specified video profiles and image usages. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** defines the color channel order used for the format. {@code format} along with {@code componentMapping} describe how the color channels are ordered when producing video decoder output or are expected to be ordered in video encoder input, when applicable. If the {@code format} reported does not require component swizzling then all members of {@code componentMapping} will be set to {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}. */
    public VkComponentMapping componentMapping() { return ncomponentMapping(address()); }
    /** a bitmask of {@code VkImageCreateFlagBits} specifying the supported image creation flags for the format. */
    @NativeType("VkImageCreateFlags")
    public int imageCreateFlags() { return nimageCreateFlags(address()); }
    /** a {@code VkImageType} that specifies the image type the format <b>can</b> be used with. */
    @NativeType("VkImageType")
    public int imageType() { return nimageType(address()); }
    /** a {@code VkImageTiling} that specifies the image tiling the format <b>can</b> be used with. */
    @NativeType("VkImageTiling")
    public int imageTiling() { return nimageTiling(address()); }
    /** a bitmask of {@code VkImageUsageFlagBits} specifying the supported image usage flags for the format. */
    @NativeType("VkImageUsageFlags")
    public int imageUsageFlags() { return nimageUsageFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoFormatPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkVideoFormatPropertiesKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoFormatPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoFormatPropertiesKHR set(
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
    public VkVideoFormatPropertiesKHR set(VkVideoFormatPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoFormatPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoFormatPropertiesKHR malloc() {
        return new VkVideoFormatPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoFormatPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoFormatPropertiesKHR calloc() {
        return new VkVideoFormatPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoFormatPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoFormatPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoFormatPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoFormatPropertiesKHR} instance for the specified memory address. */
    public static VkVideoFormatPropertiesKHR create(long address) {
        return new VkVideoFormatPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoFormatPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoFormatPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoFormatPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoFormatPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoFormatPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoFormatPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoFormatPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoFormatPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoFormatPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoFormatPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoFormatPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoFormatPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoFormatPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoFormatPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkVideoFormatPropertiesKHR.FORMAT); }
    /** Unsafe version of {@link #componentMapping}. */
    public static VkComponentMapping ncomponentMapping(long struct) { return VkComponentMapping.create(struct + VkVideoFormatPropertiesKHR.COMPONENTMAPPING); }
    /** Unsafe version of {@link #imageCreateFlags}. */
    public static int nimageCreateFlags(long struct) { return memGetInt(struct + VkVideoFormatPropertiesKHR.IMAGECREATEFLAGS); }
    /** Unsafe version of {@link #imageType}. */
    public static int nimageType(long struct) { return memGetInt(struct + VkVideoFormatPropertiesKHR.IMAGETYPE); }
    /** Unsafe version of {@link #imageTiling}. */
    public static int nimageTiling(long struct) { return memGetInt(struct + VkVideoFormatPropertiesKHR.IMAGETILING); }
    /** Unsafe version of {@link #imageUsageFlags}. */
    public static int nimageUsageFlags(long struct) { return memGetInt(struct + VkVideoFormatPropertiesKHR.IMAGEUSAGEFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoFormatPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoFormatPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoFormatPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoFormatPropertiesKHR, Buffer> implements NativeResource {

        private static final VkVideoFormatPropertiesKHR ELEMENT_FACTORY = VkVideoFormatPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoFormatPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoFormatPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoFormatPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoFormatPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoFormatPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoFormatPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoFormatPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoFormatPropertiesKHR#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkVideoFormatPropertiesKHR.nformat(address()); }
        /** @return a {@link VkComponentMapping} view of the {@link VkVideoFormatPropertiesKHR#componentMapping} field. */
        public VkComponentMapping componentMapping() { return VkVideoFormatPropertiesKHR.ncomponentMapping(address()); }
        /** @return the value of the {@link VkVideoFormatPropertiesKHR#imageCreateFlags} field. */
        @NativeType("VkImageCreateFlags")
        public int imageCreateFlags() { return VkVideoFormatPropertiesKHR.nimageCreateFlags(address()); }
        /** @return the value of the {@link VkVideoFormatPropertiesKHR#imageType} field. */
        @NativeType("VkImageType")
        public int imageType() { return VkVideoFormatPropertiesKHR.nimageType(address()); }
        /** @return the value of the {@link VkVideoFormatPropertiesKHR#imageTiling} field. */
        @NativeType("VkImageTiling")
        public int imageTiling() { return VkVideoFormatPropertiesKHR.nimageTiling(address()); }
        /** @return the value of the {@link VkVideoFormatPropertiesKHR#imageUsageFlags} field. */
        @NativeType("VkImageUsageFlags")
        public int imageUsageFlags() { return VkVideoFormatPropertiesKHR.nimageUsageFlags(address()); }

        /** Sets the specified value to the {@link VkVideoFormatPropertiesKHR#sType} field. */
        public VkVideoFormatPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoFormatPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR} value to the {@link VkVideoFormatPropertiesKHR#sType} field. */
        public VkVideoFormatPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkVideoFormatPropertiesKHR#pNext} field. */
        public VkVideoFormatPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoFormatPropertiesKHR.npNext(address(), value); return this; }

    }

}