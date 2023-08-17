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
 * Structure specifying the parameters of a video picture resource.
 * 
 * <h5>Description</h5>
 * 
 * <p>The image subresource referred to by such a structure is defined as the image array layer index specified in {@code baseArrayLayer} relative to the image subresource range the image view specified in {@code imageViewBinding} was created with.</p>
 * 
 * <p>The meaning of the {@code codedOffset} and {@code codedExtent} depends on the command and context the video picture resource is used in, as well as on the used <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profiles">video profile</a> and corresponding codec-specific semantics, as described later.</p>
 * 
 * <p>A video picture resource is uniquely defined by the image subresource referred to by an instance of this structure, together with the {@code codedOffset} and {@code codedExtent} members that identify the image subregion within the image subresource referenced corresponding to the video picture resource according to the particular codec-specific semantics.</p>
 * 
 * <p>Accesses to image data within a video picture resource happen at the granularity indicated by {@link VkVideoCapabilitiesKHR}{@code ::pictureAccessGranularity}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profiles">video profile</a>. As a result, given an effective image subregion corresponding to a video picture resource, the actual image subregion accessed <b>may</b> be larger than that as it <b>may</b> include additional padding texels due to the picture access granularity. Any writes performed by video coding operations to such padding texels will result in undefined texel values.</p>
 * 
 * <p>Two video picture resources match if they refer to the same image subresource and they specify identical {@code codedOffset} and {@code codedExtent} values.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code baseArrayLayer} <b>must</b> be less than the {@link VkImageViewCreateInfo}{@code ::subresourceRange.layerCount} specified when the image view {@code imageViewBinding} was created</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code imageViewBinding} <b>must</b> be a valid {@code VkImageView} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link VkOffset2D}, {@link VkVideoDecodeInfoKHR}, {@link VkVideoEncodeInfoKHR}, {@link VkVideoReferenceSlotInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoPictureResourceInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkOffset2D VkOffset2D} {@link #codedOffset};
 *     {@link VkExtent2D VkExtent2D} {@link #codedExtent};
 *     uint32_t {@link #baseArrayLayer};
 *     VkImageView {@link #imageViewBinding};
 * }</code></pre>
 */
public class VkVideoPictureResourceInfoKHR extends Struct<VkVideoPictureResourceInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CODEDOFFSET,
        CODEDEXTENT,
        BASEARRAYLAYER,
        IMAGEVIEWBINDING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CODEDOFFSET = layout.offsetof(2);
        CODEDEXTENT = layout.offsetof(3);
        BASEARRAYLAYER = layout.offsetof(4);
        IMAGEVIEWBINDING = layout.offsetof(5);
    }

    protected VkVideoPictureResourceInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoPictureResourceInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoPictureResourceInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoPictureResourceInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoPictureResourceInfoKHR(ByteBuffer container) {
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
    /** the offset in texels of the image subregion to use. */
    public VkOffset2D codedOffset() { return ncodedOffset(address()); }
    /** the size in pixels of the coded image data. */
    public VkExtent2D codedExtent() { return ncodedExtent(address()); }
    /** the array layer of the image view specified in {@code imageViewBinding} to use as the video picture resource. */
    @NativeType("uint32_t")
    public int baseArrayLayer() { return nbaseArrayLayer(address()); }
    /** an image view representing the video picture resource. */
    @NativeType("VkImageView")
    public long imageViewBinding() { return nimageViewBinding(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoPictureResourceInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoPictureResourceInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoPictureResourceInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkOffset2D} to the {@link #codedOffset} field. */
    public VkVideoPictureResourceInfoKHR codedOffset(VkOffset2D value) { ncodedOffset(address(), value); return this; }
    /** Passes the {@link #codedOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoPictureResourceInfoKHR codedOffset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(codedOffset()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #codedExtent} field. */
    public VkVideoPictureResourceInfoKHR codedExtent(VkExtent2D value) { ncodedExtent(address(), value); return this; }
    /** Passes the {@link #codedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoPictureResourceInfoKHR codedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(codedExtent()); return this; }
    /** Sets the specified value to the {@link #baseArrayLayer} field. */
    public VkVideoPictureResourceInfoKHR baseArrayLayer(@NativeType("uint32_t") int value) { nbaseArrayLayer(address(), value); return this; }
    /** Sets the specified value to the {@link #imageViewBinding} field. */
    public VkVideoPictureResourceInfoKHR imageViewBinding(@NativeType("VkImageView") long value) { nimageViewBinding(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoPictureResourceInfoKHR set(
        int sType,
        long pNext,
        VkOffset2D codedOffset,
        VkExtent2D codedExtent,
        int baseArrayLayer,
        long imageViewBinding
    ) {
        sType(sType);
        pNext(pNext);
        codedOffset(codedOffset);
        codedExtent(codedExtent);
        baseArrayLayer(baseArrayLayer);
        imageViewBinding(imageViewBinding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoPictureResourceInfoKHR set(VkVideoPictureResourceInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoPictureResourceInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoPictureResourceInfoKHR malloc() {
        return new VkVideoPictureResourceInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoPictureResourceInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoPictureResourceInfoKHR calloc() {
        return new VkVideoPictureResourceInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoPictureResourceInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoPictureResourceInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoPictureResourceInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoPictureResourceInfoKHR} instance for the specified memory address. */
    public static VkVideoPictureResourceInfoKHR create(long address) {
        return new VkVideoPictureResourceInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoPictureResourceInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoPictureResourceInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoPictureResourceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoPictureResourceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoPictureResourceInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoPictureResourceInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoPictureResourceInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoPictureResourceInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoPictureResourceInfoKHR malloc(MemoryStack stack) {
        return new VkVideoPictureResourceInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoPictureResourceInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoPictureResourceInfoKHR calloc(MemoryStack stack) {
        return new VkVideoPictureResourceInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoPictureResourceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoPictureResourceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoPictureResourceInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoPictureResourceInfoKHR.PNEXT); }
    /** Unsafe version of {@link #codedOffset}. */
    public static VkOffset2D ncodedOffset(long struct) { return VkOffset2D.create(struct + VkVideoPictureResourceInfoKHR.CODEDOFFSET); }
    /** Unsafe version of {@link #codedExtent}. */
    public static VkExtent2D ncodedExtent(long struct) { return VkExtent2D.create(struct + VkVideoPictureResourceInfoKHR.CODEDEXTENT); }
    /** Unsafe version of {@link #baseArrayLayer}. */
    public static int nbaseArrayLayer(long struct) { return UNSAFE.getInt(null, struct + VkVideoPictureResourceInfoKHR.BASEARRAYLAYER); }
    /** Unsafe version of {@link #imageViewBinding}. */
    public static long nimageViewBinding(long struct) { return UNSAFE.getLong(null, struct + VkVideoPictureResourceInfoKHR.IMAGEVIEWBINDING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoPictureResourceInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoPictureResourceInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #codedOffset(VkOffset2D) codedOffset}. */
    public static void ncodedOffset(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkVideoPictureResourceInfoKHR.CODEDOFFSET, VkOffset2D.SIZEOF); }
    /** Unsafe version of {@link #codedExtent(VkExtent2D) codedExtent}. */
    public static void ncodedExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoPictureResourceInfoKHR.CODEDEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #baseArrayLayer(int) baseArrayLayer}. */
    public static void nbaseArrayLayer(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoPictureResourceInfoKHR.BASEARRAYLAYER, value); }
    /** Unsafe version of {@link #imageViewBinding(long) imageViewBinding}. */
    public static void nimageViewBinding(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoPictureResourceInfoKHR.IMAGEVIEWBINDING, value); }

    // -----------------------------------

    /** An array of {@link VkVideoPictureResourceInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoPictureResourceInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoPictureResourceInfoKHR ELEMENT_FACTORY = VkVideoPictureResourceInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoPictureResourceInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoPictureResourceInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoPictureResourceInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoPictureResourceInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoPictureResourceInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoPictureResourceInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoPictureResourceInfoKHR.npNext(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkVideoPictureResourceInfoKHR#codedOffset} field. */
        public VkOffset2D codedOffset() { return VkVideoPictureResourceInfoKHR.ncodedOffset(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoPictureResourceInfoKHR#codedExtent} field. */
        public VkExtent2D codedExtent() { return VkVideoPictureResourceInfoKHR.ncodedExtent(address()); }
        /** @return the value of the {@link VkVideoPictureResourceInfoKHR#baseArrayLayer} field. */
        @NativeType("uint32_t")
        public int baseArrayLayer() { return VkVideoPictureResourceInfoKHR.nbaseArrayLayer(address()); }
        /** @return the value of the {@link VkVideoPictureResourceInfoKHR#imageViewBinding} field. */
        @NativeType("VkImageView")
        public long imageViewBinding() { return VkVideoPictureResourceInfoKHR.nimageViewBinding(address()); }

        /** Sets the specified value to the {@link VkVideoPictureResourceInfoKHR#sType} field. */
        public VkVideoPictureResourceInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoPictureResourceInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR} value to the {@link VkVideoPictureResourceInfoKHR#sType} field. */
        public VkVideoPictureResourceInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoPictureResourceInfoKHR#pNext} field. */
        public VkVideoPictureResourceInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoPictureResourceInfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkOffset2D} to the {@link VkVideoPictureResourceInfoKHR#codedOffset} field. */
        public VkVideoPictureResourceInfoKHR.Buffer codedOffset(VkOffset2D value) { VkVideoPictureResourceInfoKHR.ncodedOffset(address(), value); return this; }
        /** Passes the {@link VkVideoPictureResourceInfoKHR#codedOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoPictureResourceInfoKHR.Buffer codedOffset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(codedOffset()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoPictureResourceInfoKHR#codedExtent} field. */
        public VkVideoPictureResourceInfoKHR.Buffer codedExtent(VkExtent2D value) { VkVideoPictureResourceInfoKHR.ncodedExtent(address(), value); return this; }
        /** Passes the {@link VkVideoPictureResourceInfoKHR#codedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoPictureResourceInfoKHR.Buffer codedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(codedExtent()); return this; }
        /** Sets the specified value to the {@link VkVideoPictureResourceInfoKHR#baseArrayLayer} field. */
        public VkVideoPictureResourceInfoKHR.Buffer baseArrayLayer(@NativeType("uint32_t") int value) { VkVideoPictureResourceInfoKHR.nbaseArrayLayer(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoPictureResourceInfoKHR#imageViewBinding} field. */
        public VkVideoPictureResourceInfoKHR.Buffer imageViewBinding(@NativeType("VkImageView") long value) { VkVideoPictureResourceInfoKHR.nimageViewBinding(address(), value); return this; }

    }

}