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
 * Specify the subset of 3D slices of an image view.
 * 
 * <h5>Description</h5>
 * 
 * <p>When this structure is chained to {@link VkImageViewCreateInfo} the {@code sliceOffset} field is treated as a Z-offset for the sliced view and {@code sliceCount} specifies the range. Shader accesses using a Z coordinate of 0 will access the depth slice corresponding to {@code sliceOffset} in the image, and in a shader, the maximum in-bounds Z coordinate for the view is <code>sliceCount - 1</code>.</p>
 * 
 * <p>A sliced 3D view <b>must</b> only be used with a single mip level. The slice coordinates are integer coordinates within the {@code subresourceRange.baseMipLevel} used to create the image view.</p>
 * 
 * <p>The effective view depth is equal to {@code extent.depth} used to create the {@code image} for this view adjusted by {@code subresourceRange.baseMipLevel} as specified in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-mip-level-sizing">Image Mip Level Sizing</a>.</p>
 * 
 * <p>Shader access to this image view is only affected by {@link VkImageViewSlicedCreateInfoEXT} if it uses a descriptor of type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}. For access using any other descriptor type, the contents of {@link VkImageViewSlicedCreateInfoEXT} are ignored; instead, {@code sliceOffset} is treated as being equal to 0, and {@code sliceCount} is treated as being equal to {@link EXTImageSlicedViewOf3d#VK_REMAINING_3D_SLICES_EXT REMAINING_3D_SLICES_EXT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sliceOffset} <b>must</b> be less than the effective view depth as specified in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-mip-level-sizing">Image Mip Level Sizing</a></li>
 * <li>If {@code sliceCount} is not {@link EXTImageSlicedViewOf3d#VK_REMAINING_3D_SLICES_EXT REMAINING_3D_SLICES_EXT}, it <b>must</b> be be non-zero and <code>sliceOffset + sliceCount</code> <b>must</b> be less than or equal to the effective view depth as specified in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-mip-level-sizing">Image Mip Level Sizing</a></li>
 * <li>{@code image} <b>must</b> have been created with {@code imageType} equal to {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</li>
 * <li>{@code viewType} <b>must</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}</li>
 * <li>The image view <b>must</b> reference exactly 1 mip level</li>
 * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-imageSlicedViewOf3D">imageSlicedViewOf3D</a> feature <b>must</b> be enabled on the device</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageSlicedViewOf3d#VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageViewSlicedCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #sliceOffset};
 *     uint32_t {@link #sliceCount};
 * }</code></pre>
 */
public class VkImageViewSlicedCreateInfoEXT extends Struct<VkImageViewSlicedCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SLICEOFFSET,
        SLICECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SLICEOFFSET = layout.offsetof(2);
        SLICECOUNT = layout.offsetof(3);
    }

    protected VkImageViewSlicedCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageViewSlicedCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageViewSlicedCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImageViewSlicedCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewSlicedCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the Z-offset for the first 3D slice accessible to the image view. */
    @NativeType("uint32_t")
    public int sliceOffset() { return nsliceOffset(address()); }
    /** the number of 3D slices accessible to the image view. */
    @NativeType("uint32_t")
    public int sliceCount() { return nsliceCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageViewSlicedCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageSlicedViewOf3d#VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkImageViewSlicedCreateInfoEXT sType$Default() { return sType(EXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageViewSlicedCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #sliceOffset} field. */
    public VkImageViewSlicedCreateInfoEXT sliceOffset(@NativeType("uint32_t") int value) { nsliceOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #sliceCount} field. */
    public VkImageViewSlicedCreateInfoEXT sliceCount(@NativeType("uint32_t") int value) { nsliceCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewSlicedCreateInfoEXT set(
        int sType,
        long pNext,
        int sliceOffset,
        int sliceCount
    ) {
        sType(sType);
        pNext(pNext);
        sliceOffset(sliceOffset);
        sliceCount(sliceCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageViewSlicedCreateInfoEXT set(VkImageViewSlicedCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewSlicedCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewSlicedCreateInfoEXT malloc() {
        return new VkImageViewSlicedCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewSlicedCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewSlicedCreateInfoEXT calloc() {
        return new VkImageViewSlicedCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewSlicedCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageViewSlicedCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewSlicedCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewSlicedCreateInfoEXT} instance for the specified memory address. */
    public static VkImageViewSlicedCreateInfoEXT create(long address) {
        return new VkImageViewSlicedCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewSlicedCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImageViewSlicedCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImageViewSlicedCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewSlicedCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewSlicedCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewSlicedCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewSlicedCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewSlicedCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageViewSlicedCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewSlicedCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewSlicedCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageViewSlicedCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewSlicedCreateInfoEXT malloc(MemoryStack stack) {
        return new VkImageViewSlicedCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageViewSlicedCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewSlicedCreateInfoEXT calloc(MemoryStack stack) {
        return new VkImageViewSlicedCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageViewSlicedCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewSlicedCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewSlicedCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewSlicedCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewSlicedCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewSlicedCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #sliceOffset}. */
    public static int nsliceOffset(long struct) { return UNSAFE.getInt(null, struct + VkImageViewSlicedCreateInfoEXT.SLICEOFFSET); }
    /** Unsafe version of {@link #sliceCount}. */
    public static int nsliceCount(long struct) { return UNSAFE.getInt(null, struct + VkImageViewSlicedCreateInfoEXT.SLICECOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewSlicedCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewSlicedCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #sliceOffset(int) sliceOffset}. */
    public static void nsliceOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewSlicedCreateInfoEXT.SLICEOFFSET, value); }
    /** Unsafe version of {@link #sliceCount(int) sliceCount}. */
    public static void nsliceCount(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewSlicedCreateInfoEXT.SLICECOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewSlicedCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageViewSlicedCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkImageViewSlicedCreateInfoEXT ELEMENT_FACTORY = VkImageViewSlicedCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageViewSlicedCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewSlicedCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageViewSlicedCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageViewSlicedCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewSlicedCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkImageViewSlicedCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewSlicedCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkImageViewSlicedCreateInfoEXT#sliceOffset} field. */
        @NativeType("uint32_t")
        public int sliceOffset() { return VkImageViewSlicedCreateInfoEXT.nsliceOffset(address()); }
        /** @return the value of the {@link VkImageViewSlicedCreateInfoEXT#sliceCount} field. */
        @NativeType("uint32_t")
        public int sliceCount() { return VkImageViewSlicedCreateInfoEXT.nsliceCount(address()); }

        /** Sets the specified value to the {@link VkImageViewSlicedCreateInfoEXT#sType} field. */
        public VkImageViewSlicedCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewSlicedCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageSlicedViewOf3d#VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT} value to the {@link VkImageViewSlicedCreateInfoEXT#sType} field. */
        public VkImageViewSlicedCreateInfoEXT.Buffer sType$Default() { return sType(EXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkImageViewSlicedCreateInfoEXT#pNext} field. */
        public VkImageViewSlicedCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageViewSlicedCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageViewSlicedCreateInfoEXT#sliceOffset} field. */
        public VkImageViewSlicedCreateInfoEXT.Buffer sliceOffset(@NativeType("uint32_t") int value) { VkImageViewSlicedCreateInfoEXT.nsliceOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageViewSlicedCreateInfoEXT#sliceCount} field. */
        public VkImageViewSlicedCreateInfoEXT.Buffer sliceCount(@NativeType("uint32_t") int value) { VkImageViewSlicedCreateInfoEXT.nsliceCount(address(), value); return this; }

    }

}