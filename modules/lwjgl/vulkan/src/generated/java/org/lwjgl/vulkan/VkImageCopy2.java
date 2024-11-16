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
 * Structure specifying an image copy operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion} extension is not enabled, and {@link VkPhysicalDeviceProperties}{@code ::apiVersion} is less than Vulkan 1.1, the {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
 * <li>If the {@link KHRMaintenance1 VK_KHR_maintenance1} extension is not enabled, and {@link VkPhysicalDeviceProperties}{@code ::apiVersion} is less than Vulkan 1.1, the {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
 * <li>{@code extent.width} <b>must</b> not be 0</li>
 * <li>{@code extent.height} <b>must</b> not be 0</li>
 * <li>{@code extent.depth} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_IMAGE_COPY_2 STRUCTURE_TYPE_IMAGE_COPY_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * <li>{@code dstSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCopyImageInfo2}, {@link VkCopyImageToImageInfoEXT}, {@link VkExtent3D}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageCopy2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #srcSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #srcOffset};
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #dstSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #dstOffset};
 *     {@link VkExtent3D VkExtent3D} {@link #extent};
 * }</code></pre>
 */
public class VkImageCopy2 extends Struct<VkImageCopy2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSUBRESOURCE,
        SRCOFFSET,
        DSTSUBRESOURCE,
        DSTOFFSET,
        EXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBRESOURCE = layout.offsetof(2);
        SRCOFFSET = layout.offsetof(3);
        DSTSUBRESOURCE = layout.offsetof(4);
        DSTOFFSET = layout.offsetof(5);
        EXTENT = layout.offsetof(6);
    }

    protected VkImageCopy2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageCopy2 create(long address, @Nullable ByteBuffer container) {
        return new VkImageCopy2(address, container);
    }

    /**
     * Creates a {@code VkImageCopy2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageCopy2(ByteBuffer container) {
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
    /** {@code srcSubresource} and {@code dstSubresource} are {@link VkImageSubresourceLayers} structures specifying the image subresources of the images used for the source and destination image data, respectively. */
    public VkImageSubresourceLayers srcSubresource() { return nsrcSubresource(address()); }
    /** {@code srcOffset} and {@code dstOffset} select the initial {@code x}, {@code y}, and {@code z} offsets in texels of the sub-regions of the source and destination image data. */
    public VkOffset3D srcOffset() { return nsrcOffset(address()); }
    /** see {@code srcSubresource} */
    public VkImageSubresourceLayers dstSubresource() { return ndstSubresource(address()); }
    /** see {@code srcOffset} */
    public VkOffset3D dstOffset() { return ndstOffset(address()); }
    /** the size in texels of the image to copy in {@code width}, {@code height} and {@code depth}. */
    public VkExtent3D extent() { return nextent(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageCopy2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_COPY_2 STRUCTURE_TYPE_IMAGE_COPY_2} value to the {@link #sType} field. */
    public VkImageCopy2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_COPY_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageCopy2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #srcSubresource} field. */
    public VkImageCopy2 srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
    /** Passes the {@link #srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy2 srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@link #srcOffset} field. */
    public VkImageCopy2 srcOffset(VkOffset3D value) { nsrcOffset(address(), value); return this; }
    /** Passes the {@link #srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy2 srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #dstSubresource} field. */
    public VkImageCopy2 dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
    /** Passes the {@link #dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy2 dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@link #dstOffset} field. */
    public VkImageCopy2 dstOffset(VkOffset3D value) { ndstOffset(address(), value); return this; }
    /** Passes the {@link #dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy2 dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@link #extent} field. */
    public VkImageCopy2 extent(VkExtent3D value) { nextent(address(), value); return this; }
    /** Passes the {@link #extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy2 extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageCopy2 set(
        int sType,
        long pNext,
        VkImageSubresourceLayers srcSubresource,
        VkOffset3D srcOffset,
        VkImageSubresourceLayers dstSubresource,
        VkOffset3D dstOffset,
        VkExtent3D extent
    ) {
        sType(sType);
        pNext(pNext);
        srcSubresource(srcSubresource);
        srcOffset(srcOffset);
        dstSubresource(dstSubresource);
        dstOffset(dstOffset);
        extent(extent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageCopy2 set(VkImageCopy2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageCopy2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageCopy2 malloc() {
        return new VkImageCopy2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageCopy2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageCopy2 calloc() {
        return new VkImageCopy2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageCopy2} instance allocated with {@link BufferUtils}. */
    public static VkImageCopy2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCopy2(memAddress(container), container);
    }

    /** Returns a new {@code VkImageCopy2} instance for the specified memory address. */
    public static VkImageCopy2 create(long address) {
        return new VkImageCopy2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageCopy2 createSafe(long address) {
        return address == NULL ? null : new VkImageCopy2(address, null);
    }

    /**
     * Returns a new {@link VkImageCopy2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCopy2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageCopy2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCopy2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCopy2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCopy2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageCopy2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageCopy2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageCopy2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageCopy2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCopy2 malloc(MemoryStack stack) {
        return new VkImageCopy2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageCopy2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCopy2 calloc(MemoryStack stack) {
        return new VkImageCopy2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageCopy2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCopy2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCopy2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCopy2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageCopy2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageCopy2.PNEXT); }
    /** Unsafe version of {@link #srcSubresource}. */
    public static VkImageSubresourceLayers nsrcSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageCopy2.SRCSUBRESOURCE); }
    /** Unsafe version of {@link #srcOffset}. */
    public static VkOffset3D nsrcOffset(long struct) { return VkOffset3D.create(struct + VkImageCopy2.SRCOFFSET); }
    /** Unsafe version of {@link #dstSubresource}. */
    public static VkImageSubresourceLayers ndstSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageCopy2.DSTSUBRESOURCE); }
    /** Unsafe version of {@link #dstOffset}. */
    public static VkOffset3D ndstOffset(long struct) { return VkOffset3D.create(struct + VkImageCopy2.DSTOFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkImageCopy2.EXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageCopy2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageCopy2.PNEXT, value); }
    /** Unsafe version of {@link #srcSubresource(VkImageSubresourceLayers) srcSubresource}. */
    public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageCopy2.SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #srcOffset(VkOffset3D) srcOffset}. */
    public static void nsrcOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageCopy2.SRCOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #dstSubresource(VkImageSubresourceLayers) dstSubresource}. */
    public static void ndstSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageCopy2.DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #dstOffset(VkOffset3D) dstOffset}. */
    public static void ndstOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageCopy2.DSTOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #extent(VkExtent3D) extent}. */
    public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageCopy2.EXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageCopy2} structs. */
    public static class Buffer extends StructBuffer<VkImageCopy2, Buffer> implements NativeResource {

        private static final VkImageCopy2 ELEMENT_FACTORY = VkImageCopy2.create(-1L);

        /**
         * Creates a new {@code VkImageCopy2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageCopy2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageCopy2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageCopy2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageCopy2.nsType(address()); }
        /** @return the value of the {@link VkImageCopy2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageCopy2.npNext(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkImageCopy2#srcSubresource} field. */
        public VkImageSubresourceLayers srcSubresource() { return VkImageCopy2.nsrcSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@link VkImageCopy2#srcOffset} field. */
        public VkOffset3D srcOffset() { return VkImageCopy2.nsrcOffset(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkImageCopy2#dstSubresource} field. */
        public VkImageSubresourceLayers dstSubresource() { return VkImageCopy2.ndstSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@link VkImageCopy2#dstOffset} field. */
        public VkOffset3D dstOffset() { return VkImageCopy2.ndstOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@link VkImageCopy2#extent} field. */
        public VkExtent3D extent() { return VkImageCopy2.nextent(address()); }

        /** Sets the specified value to the {@link VkImageCopy2#sType} field. */
        public VkImageCopy2.Buffer sType(@NativeType("VkStructureType") int value) { VkImageCopy2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_COPY_2 STRUCTURE_TYPE_IMAGE_COPY_2} value to the {@link VkImageCopy2#sType} field. */
        public VkImageCopy2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_COPY_2); }
        /** Sets the specified value to the {@link VkImageCopy2#pNext} field. */
        public VkImageCopy2.Buffer pNext(@NativeType("void const *") long value) { VkImageCopy2.npNext(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkImageCopy2#srcSubresource} field. */
        public VkImageCopy2.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageCopy2.nsrcSubresource(address(), value); return this; }
        /** Passes the {@link VkImageCopy2#srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy2.Buffer srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@link VkImageCopy2#srcOffset} field. */
        public VkImageCopy2.Buffer srcOffset(VkOffset3D value) { VkImageCopy2.nsrcOffset(address(), value); return this; }
        /** Passes the {@link VkImageCopy2#srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy2.Buffer srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkImageCopy2#dstSubresource} field. */
        public VkImageCopy2.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageCopy2.ndstSubresource(address(), value); return this; }
        /** Passes the {@link VkImageCopy2#dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy2.Buffer dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@link VkImageCopy2#dstOffset} field. */
        public VkImageCopy2.Buffer dstOffset(VkOffset3D value) { VkImageCopy2.ndstOffset(address(), value); return this; }
        /** Passes the {@link VkImageCopy2#dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy2.Buffer dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@link VkImageCopy2#extent} field. */
        public VkImageCopy2.Buffer extent(VkExtent3D value) { VkImageCopy2.nextent(address(), value); return this; }
        /** Passes the {@link VkImageCopy2#extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy2.Buffer extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    }

}