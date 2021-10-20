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
 * (None).
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code image} was created with a <em>multi-planar</em> format and the {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT} flag, there <b>must</b> be a {@link VkImagePlaneMemoryRequirementsInfo} included in the {@code pNext} chain of the {@link VkImageMemoryRequirementsInfo2} structure</li>
 * <li>If {@code image} was created with {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT} and with {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then there <b>must</b> be a {@link VkImagePlaneMemoryRequirementsInfo} included in the {@code pNext} chain of the {@link VkImageMemoryRequirementsInfo2} structure</li>
 * <li>If {@code image} was not created with the {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT} flag, there <b>must</b> not be a {@link VkImagePlaneMemoryRequirementsInfo} included in the {@code pNext} chain of the {@link VkImageMemoryRequirementsInfo2} structure</li>
 * <li>If {@code image} was created with a single-plane format and with any {@code tiling} other than {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then there <b>must</b> not be a {@link VkImagePlaneMemoryRequirementsInfo} included in the {@code pNext} chain of the {@link VkImageMemoryRequirementsInfo2} structure</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkImagePlaneMemoryRequirementsInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkGetImageMemoryRequirements2 GetImageMemoryRequirements2}, {@link KHRGetMemoryRequirements2#vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageMemoryRequirementsInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #image};
 * }</code></pre>
 */
public class VkImageMemoryRequirementsInfo2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkImageMemoryRequirementsInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageMemoryRequirementsInfo2(ByteBuffer container) {
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
    /** the image to query. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageMemoryRequirementsInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2} value to the {@link #sType} field. */
    public VkImageMemoryRequirementsInfo2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageMemoryRequirementsInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkImagePlaneMemoryRequirementsInfo} value to the {@code pNext} chain. */
    public VkImageMemoryRequirementsInfo2 pNext(VkImagePlaneMemoryRequirementsInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImagePlaneMemoryRequirementsInfoKHR} value to the {@code pNext} chain. */
    public VkImageMemoryRequirementsInfo2 pNext(VkImagePlaneMemoryRequirementsInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #image} field. */
    public VkImageMemoryRequirementsInfo2 image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageMemoryRequirementsInfo2 set(
        int sType,
        long pNext,
        long image
    ) {
        sType(sType);
        pNext(pNext);
        image(image);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageMemoryRequirementsInfo2 set(VkImageMemoryRequirementsInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageMemoryRequirementsInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageMemoryRequirementsInfo2 malloc() {
        return wrap(VkImageMemoryRequirementsInfo2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryRequirementsInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageMemoryRequirementsInfo2 calloc() {
        return wrap(VkImageMemoryRequirementsInfo2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryRequirementsInfo2} instance allocated with {@link BufferUtils}. */
    public static VkImageMemoryRequirementsInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageMemoryRequirementsInfo2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageMemoryRequirementsInfo2} instance for the specified memory address. */
    public static VkImageMemoryRequirementsInfo2 create(long address) {
        return wrap(VkImageMemoryRequirementsInfo2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryRequirementsInfo2 createSafe(long address) {
        return address == NULL ? null : wrap(VkImageMemoryRequirementsInfo2.class, address);
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageMemoryRequirementsInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryRequirementsInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageMemoryRequirementsInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryRequirementsInfo2 malloc(MemoryStack stack) {
        return wrap(VkImageMemoryRequirementsInfo2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageMemoryRequirementsInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryRequirementsInfo2 calloc(MemoryStack stack) {
        return wrap(VkImageMemoryRequirementsInfo2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryRequirementsInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageMemoryRequirementsInfo2.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkImageMemoryRequirementsInfo2.IMAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryRequirementsInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageMemoryRequirementsInfo2.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkImageMemoryRequirementsInfo2.IMAGE, value); }

    // -----------------------------------

    /** An array of {@link VkImageMemoryRequirementsInfo2} structs. */
    public static class Buffer extends StructBuffer<VkImageMemoryRequirementsInfo2, Buffer> implements NativeResource {

        private static final VkImageMemoryRequirementsInfo2 ELEMENT_FACTORY = VkImageMemoryRequirementsInfo2.create(-1L);

        /**
         * Creates a new {@code VkImageMemoryRequirementsInfo2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageMemoryRequirementsInfo2#SIZEOF}, and its mark will be undefined.
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
        protected VkImageMemoryRequirementsInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageMemoryRequirementsInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageMemoryRequirementsInfo2.nsType(address()); }
        /** @return the value of the {@link VkImageMemoryRequirementsInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageMemoryRequirementsInfo2.npNext(address()); }
        /** @return the value of the {@link VkImageMemoryRequirementsInfo2#image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageMemoryRequirementsInfo2.nimage(address()); }

        /** Sets the specified value to the {@link VkImageMemoryRequirementsInfo2#sType} field. */
        public VkImageMemoryRequirementsInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkImageMemoryRequirementsInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2} value to the {@link VkImageMemoryRequirementsInfo2#sType} field. */
        public VkImageMemoryRequirementsInfo2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2); }
        /** Sets the specified value to the {@link VkImageMemoryRequirementsInfo2#pNext} field. */
        public VkImageMemoryRequirementsInfo2.Buffer pNext(@NativeType("void const *") long value) { VkImageMemoryRequirementsInfo2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkImagePlaneMemoryRequirementsInfo} value to the {@code pNext} chain. */
        public VkImageMemoryRequirementsInfo2.Buffer pNext(VkImagePlaneMemoryRequirementsInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImagePlaneMemoryRequirementsInfoKHR} value to the {@code pNext} chain. */
        public VkImageMemoryRequirementsInfo2.Buffer pNext(VkImagePlaneMemoryRequirementsInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkImageMemoryRequirementsInfo2#image} field. */
        public VkImageMemoryRequirementsInfo2.Buffer image(@NativeType("VkImage") long value) { VkImageMemoryRequirementsInfo2.nimage(address(), value); return this; }

    }

}