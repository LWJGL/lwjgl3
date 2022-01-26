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
 * Structure specifying fragment shading rate attachment information.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure can be included in the {@code pNext} chain of {@link VkRenderingInfo} to define a fragment density map. If this structure is not included in the {@code pNext} chain, {@code imageView} is treated as {@link VK10#VK_NULL_HANDLE NULL_HANDLE}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} or {@link EXTFragmentDensityMap#VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have been created with {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> not have been created with {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT}</li>
 * <li>{@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderingFragmentDensityMapAttachmentInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageView {@link #imageView};
 *     VkImageLayout {@link #imageLayout};
 * }</code></pre>
 */
public class VkRenderingFragmentDensityMapAttachmentInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEVIEW,
        IMAGELAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEVIEW = layout.offsetof(2);
        IMAGELAYOUT = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT(ByteBuffer container) {
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
    /** the image view that will be used as a fragment shading rate attachment. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }
    /** the layout that {@code imageView} will be in during rendering. */
    @NativeType("VkImageLayout")
    public int imageLayout() { return nimageLayout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT} value to the {@link #sType} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #imageView} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }
    /** Sets the specified value to the {@link #imageLayout} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageLayout(@NativeType("VkImageLayout") int value) { nimageLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT set(
        int sType,
        long pNext,
        long imageView,
        int imageLayout
    ) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        imageLayout(imageLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT set(VkRenderingFragmentDensityMapAttachmentInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT malloc() {
        return wrap(VkRenderingFragmentDensityMapAttachmentInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT calloc() {
        return wrap(VkRenderingFragmentDensityMapAttachmentInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderingFragmentDensityMapAttachmentInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance for the specified memory address. */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT create(long address) {
        return wrap(VkRenderingFragmentDensityMapAttachmentInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderingFragmentDensityMapAttachmentInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT malloc(MemoryStack stack) {
        return wrap(VkRenderingFragmentDensityMapAttachmentInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT calloc(MemoryStack stack) {
        return wrap(VkRenderingFragmentDensityMapAttachmentInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.PNEXT); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return UNSAFE.getLong(null, struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.IMAGEVIEW); }
    /** Unsafe version of {@link #imageLayout}. */
    public static int nimageLayout(long struct) { return UNSAFE.getInt(null, struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.IMAGELAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { UNSAFE.putLong(null, struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.IMAGEVIEW, value); }
    /** Unsafe version of {@link #imageLayout(int) imageLayout}. */
    public static void nimageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.IMAGELAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderingFragmentDensityMapAttachmentInfoEXT, Buffer> implements NativeResource {

        private static final VkRenderingFragmentDensityMapAttachmentInfoEXT ELEMENT_FACTORY = VkRenderingFragmentDensityMapAttachmentInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderingFragmentDensityMapAttachmentInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingFragmentDensityMapAttachmentInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingFragmentDensityMapAttachmentInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkRenderingFragmentDensityMapAttachmentInfoEXT.nimageView(address()); }
        /** @return the value of the {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#imageLayout} field. */
        @NativeType("VkImageLayout")
        public int imageLayout() { return VkRenderingFragmentDensityMapAttachmentInfoEXT.nimageLayout(address()); }

        /** Sets the specified value to the {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#sType} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingFragmentDensityMapAttachmentInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT} value to the {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#sType} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT); }
        /** Sets the specified value to the {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#pNext} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkRenderingFragmentDensityMapAttachmentInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#imageView} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer imageView(@NativeType("VkImageView") long value) { VkRenderingFragmentDensityMapAttachmentInfoEXT.nimageView(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#imageLayout} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer imageLayout(@NativeType("VkImageLayout") int value) { VkRenderingFragmentDensityMapAttachmentInfoEXT.nimageLayout(address(), value); return this; }

    }

}