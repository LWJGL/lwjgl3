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
 * Structure specifying how to bind an image plane to memory.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the image&#8217;s tiling is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} or {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, then {@code planeAspect} <b>must</b> be a single valid <em>format plane</em> for the image. (That is, {@code planeAspect} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT} or {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT} for “{@code _2PLANE}” formats and {@code planeAspect} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT} for “{@code _3PLANE}” formats.)</li>
 * <li>If the image&#8217;s tiling is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then {@code planeAspect} <b>must</b> be a single valid <em>memory plane</em> for the image. (That is, {@code aspectMask} <b>must</b> specify a plane index that is less than the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkDrmFormatModifierPropertiesEXT">{@code drmFormatModifierPlaneCount}</a> associated with the image&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkImageCreateInfo">{@code format}</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkImageDrmFormatModifierPropertiesEXT">{@code drmFormatModifier}</a>.)</li>
 * <li>A single call to {@link VK11#vkBindImageMemory2 BindImageMemory2} <b>must</b> bind all or none of the planes of an image (i.e. bindings to all planes of an image <b>must</b> be made in a single {@link VK11#vkBindImageMemory2 BindImageMemory2} call), as separate bindings</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO}</li>
 * <li>{@code planeAspect} <b>must</b> be a valid {@code VkImageAspectFlagBits} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code planeAspect} &ndash; the aspect of the disjoint image plane to bind.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindImagePlaneMemoryInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageAspectFlagBits planeAspect;
 * }</code></pre>
 */
public class VkBindImagePlaneMemoryInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PLANEASPECT;

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
        PLANEASPECT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkBindImagePlaneMemoryInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindImagePlaneMemoryInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code planeAspect} field. */
    @NativeType("VkImageAspectFlagBits")
    public int planeAspect() { return nplaneAspect(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindImagePlaneMemoryInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindImagePlaneMemoryInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code planeAspect} field. */
    public VkBindImagePlaneMemoryInfo planeAspect(@NativeType("VkImageAspectFlagBits") int value) { nplaneAspect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindImagePlaneMemoryInfo set(
        int sType,
        long pNext,
        int planeAspect
    ) {
        sType(sType);
        pNext(pNext);
        planeAspect(planeAspect);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindImagePlaneMemoryInfo set(VkBindImagePlaneMemoryInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImagePlaneMemoryInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindImagePlaneMemoryInfo malloc() {
        return wrap(VkBindImagePlaneMemoryInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindImagePlaneMemoryInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImagePlaneMemoryInfo calloc() {
        return wrap(VkBindImagePlaneMemoryInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindImagePlaneMemoryInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindImagePlaneMemoryInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindImagePlaneMemoryInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindImagePlaneMemoryInfo} instance for the specified memory address. */
    public static VkBindImagePlaneMemoryInfo create(long address) {
        return wrap(VkBindImagePlaneMemoryInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImagePlaneMemoryInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkBindImagePlaneMemoryInfo.class, address);
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindImagePlaneMemoryInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImagePlaneMemoryInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImagePlaneMemoryInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindImagePlaneMemoryInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkBindImagePlaneMemoryInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindImagePlaneMemoryInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkBindImagePlaneMemoryInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImagePlaneMemoryInfo mallocStack(MemoryStack stack) {
        return wrap(VkBindImagePlaneMemoryInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindImagePlaneMemoryInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImagePlaneMemoryInfo callocStack(MemoryStack stack) {
        return wrap(VkBindImagePlaneMemoryInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindImagePlaneMemoryInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindImagePlaneMemoryInfo.PNEXT); }
    /** Unsafe version of {@link #planeAspect}. */
    public static int nplaneAspect(long struct) { return UNSAFE.getInt(null, struct + VkBindImagePlaneMemoryInfo.PLANEASPECT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindImagePlaneMemoryInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindImagePlaneMemoryInfo.PNEXT, value); }
    /** Unsafe version of {@link #planeAspect(int) planeAspect}. */
    public static void nplaneAspect(long struct, int value) { UNSAFE.putInt(null, struct + VkBindImagePlaneMemoryInfo.PLANEASPECT, value); }

    // -----------------------------------

    /** An array of {@link VkBindImagePlaneMemoryInfo} structs. */
    public static class Buffer extends StructBuffer<VkBindImagePlaneMemoryInfo, Buffer> implements NativeResource {

        private static final VkBindImagePlaneMemoryInfo ELEMENT_FACTORY = VkBindImagePlaneMemoryInfo.create(-1L);

        /**
         * Creates a new {@code VkBindImagePlaneMemoryInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImagePlaneMemoryInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkBindImagePlaneMemoryInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindImagePlaneMemoryInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindImagePlaneMemoryInfo.npNext(address()); }
        /** Returns the value of the {@code planeAspect} field. */
        @NativeType("VkImageAspectFlagBits")
        public int planeAspect() { return VkBindImagePlaneMemoryInfo.nplaneAspect(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindImagePlaneMemoryInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImagePlaneMemoryInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindImagePlaneMemoryInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindImagePlaneMemoryInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code planeAspect} field. */
        public VkBindImagePlaneMemoryInfo.Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) { VkBindImagePlaneMemoryInfo.nplaneAspect(address(), value); return this; }

    }

}