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
 * Structure defining properties of resolves using an external format.
 * 
 * <h5>Description</h5>
 * 
 * <p>Any Android hardware buffer created with the {@code GRALLOC_USAGE_HW_RENDER} flag <b>must</b> be renderable in some way in Vulkan, either:</p>
 * 
 * <ul>
 * <li>{@link VkAndroidHardwareBufferFormatPropertiesANDROID}{@code ::format} <b>must</b> be a format that supports {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} or {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT} in {@link VkFormatProperties}{@code ::optimalTilingFeatures}; or</li>
 * <li>{@code colorAttachmentFormat} <b>must</b> be a format that supports {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} in {@link VkFormatProperties}{@code ::optimalTilingFeatures}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ANDROIDExternalFormatResolve#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAndroidHardwareBufferFormatResolvePropertiesANDROID {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkFormat {@link #colorAttachmentFormat};
 * }</code></pre>
 */
public class VkAndroidHardwareBufferFormatResolvePropertiesANDROID extends Struct<VkAndroidHardwareBufferFormatResolvePropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COLORATTACHMENTFORMAT;

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
        COLORATTACHMENTFORMAT = layout.offsetof(2);
    }

    protected VkAndroidHardwareBufferFormatResolvePropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAndroidHardwareBufferFormatResolvePropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code VkAndroidHardwareBufferFormatResolvePropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID(ByteBuffer container) {
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
    /** a {@code VkFormat} specifying the format of color attachment images that <b>must</b> be used for color attachments when resolving to the specified external format. If the implementation supports external format resolves for the specified external format, this value will be a color format supporting the {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} in {@link VkFormatProperties}{@code ::optimalTilingFeatures} as returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with {@code format} equal to {@code colorAttachmentFormat} If external format resolves are not supported, this value will be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}. */
    @NativeType("VkFormat")
    public int colorAttachmentFormat() { return ncolorAttachmentFormat(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalFormatResolve#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID} value to the {@link #sType} field. */
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID sType$Default() { return sType(ANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID set(
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
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID set(VkAndroidHardwareBufferFormatResolvePropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAndroidHardwareBufferFormatResolvePropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID malloc() {
        return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferFormatResolvePropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID calloc() {
        return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferFormatResolvePropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code VkAndroidHardwareBufferFormatResolvePropertiesANDROID} instance for the specified memory address. */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID create(long address) {
        return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAndroidHardwareBufferFormatResolvePropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferFormatResolvePropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID malloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferFormatResolvePropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID calloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatResolvePropertiesANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAndroidHardwareBufferFormatResolvePropertiesANDROID.PNEXT); }
    /** Unsafe version of {@link #colorAttachmentFormat}. */
    public static int ncolorAttachmentFormat(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatResolvePropertiesANDROID.COLORATTACHMENTFORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAndroidHardwareBufferFormatResolvePropertiesANDROID.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAndroidHardwareBufferFormatResolvePropertiesANDROID.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<VkAndroidHardwareBufferFormatResolvePropertiesANDROID, Buffer> implements NativeResource {

        private static final VkAndroidHardwareBufferFormatResolvePropertiesANDROID ELEMENT_FACTORY = VkAndroidHardwareBufferFormatResolvePropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAndroidHardwareBufferFormatResolvePropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.nsType(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.npNext(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID#colorAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int colorAttachmentFormat() { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.ncolorAttachmentFormat(address()); }

        /** Sets the specified value to the {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID#sType} field. */
        public VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalFormatResolve#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID} value to the {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID#sType} field. */
        public VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer sType$Default() { return sType(ANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID#pNext} field. */
        public VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer pNext(@NativeType("void *") long value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.npNext(address(), value); return this; }

    }

}