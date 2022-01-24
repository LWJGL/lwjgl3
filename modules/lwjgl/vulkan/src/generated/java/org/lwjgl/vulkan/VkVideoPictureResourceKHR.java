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
 * Structure specifying the picture resources.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code imageViewBinding} <b>must</b> be a valid {@code VkImageView} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link VkOffset2D}, {@link VkVideoDecodeInfoKHR}, {@link VkVideoEncodeInfoKHR}, {@link VkVideoReferenceSlotKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoPictureResourceKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkOffset2D VkOffset2D} {@link #codedOffset};
 *     {@link VkExtent2D VkExtent2D} {@link #codedExtent};
 *     uint32_t {@link #baseArrayLayer};
 *     VkImageView {@link #imageViewBinding};
 * }</code></pre>
 */
public class VkVideoPictureResourceKHR extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkVideoPictureResourceKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoPictureResourceKHR(ByteBuffer container) {
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
    /** the offset to be used for the picture resource. */
    public VkOffset2D codedOffset() { return ncodedOffset(address()); }
    /** the extent to be used for the picture resource. */
    public VkExtent2D codedExtent() { return ncodedExtent(address()); }
    /** the first array layer to be accessed for the Decode or Encode Operations. */
    @NativeType("uint32_t")
    public int baseArrayLayer() { return nbaseArrayLayer(address()); }
    /** a {@code VkImageView} image view representing this picture resource. */
    @NativeType("VkImageView")
    public long imageViewBinding() { return nimageViewBinding(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoPictureResourceKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR} value to the {@link #sType} field. */
    public VkVideoPictureResourceKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoPictureResourceKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkOffset2D} to the {@link #codedOffset} field. */
    public VkVideoPictureResourceKHR codedOffset(VkOffset2D value) { ncodedOffset(address(), value); return this; }
    /** Passes the {@link #codedOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoPictureResourceKHR codedOffset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(codedOffset()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #codedExtent} field. */
    public VkVideoPictureResourceKHR codedExtent(VkExtent2D value) { ncodedExtent(address(), value); return this; }
    /** Passes the {@link #codedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoPictureResourceKHR codedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(codedExtent()); return this; }
    /** Sets the specified value to the {@link #baseArrayLayer} field. */
    public VkVideoPictureResourceKHR baseArrayLayer(@NativeType("uint32_t") int value) { nbaseArrayLayer(address(), value); return this; }
    /** Sets the specified value to the {@link #imageViewBinding} field. */
    public VkVideoPictureResourceKHR imageViewBinding(@NativeType("VkImageView") long value) { nimageViewBinding(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoPictureResourceKHR set(
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
    public VkVideoPictureResourceKHR set(VkVideoPictureResourceKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoPictureResourceKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoPictureResourceKHR malloc() {
        return wrap(VkVideoPictureResourceKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoPictureResourceKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoPictureResourceKHR calloc() {
        return wrap(VkVideoPictureResourceKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoPictureResourceKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoPictureResourceKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoPictureResourceKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoPictureResourceKHR} instance for the specified memory address. */
    public static VkVideoPictureResourceKHR create(long address) {
        return wrap(VkVideoPictureResourceKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoPictureResourceKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoPictureResourceKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoPictureResourceKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoPictureResourceKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoPictureResourceKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoPictureResourceKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoPictureResourceKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoPictureResourceKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoPictureResourceKHR malloc(MemoryStack stack) {
        return wrap(VkVideoPictureResourceKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoPictureResourceKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoPictureResourceKHR calloc(MemoryStack stack) {
        return wrap(VkVideoPictureResourceKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoPictureResourceKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoPictureResourceKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoPictureResourceKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoPictureResourceKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoPictureResourceKHR.PNEXT); }
    /** Unsafe version of {@link #codedOffset}. */
    public static VkOffset2D ncodedOffset(long struct) { return VkOffset2D.create(struct + VkVideoPictureResourceKHR.CODEDOFFSET); }
    /** Unsafe version of {@link #codedExtent}. */
    public static VkExtent2D ncodedExtent(long struct) { return VkExtent2D.create(struct + VkVideoPictureResourceKHR.CODEDEXTENT); }
    /** Unsafe version of {@link #baseArrayLayer}. */
    public static int nbaseArrayLayer(long struct) { return UNSAFE.getInt(null, struct + VkVideoPictureResourceKHR.BASEARRAYLAYER); }
    /** Unsafe version of {@link #imageViewBinding}. */
    public static long nimageViewBinding(long struct) { return UNSAFE.getLong(null, struct + VkVideoPictureResourceKHR.IMAGEVIEWBINDING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoPictureResourceKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoPictureResourceKHR.PNEXT, value); }
    /** Unsafe version of {@link #codedOffset(VkOffset2D) codedOffset}. */
    public static void ncodedOffset(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkVideoPictureResourceKHR.CODEDOFFSET, VkOffset2D.SIZEOF); }
    /** Unsafe version of {@link #codedExtent(VkExtent2D) codedExtent}. */
    public static void ncodedExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoPictureResourceKHR.CODEDEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #baseArrayLayer(int) baseArrayLayer}. */
    public static void nbaseArrayLayer(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoPictureResourceKHR.BASEARRAYLAYER, value); }
    /** Unsafe version of {@link #imageViewBinding(long) imageViewBinding}. */
    public static void nimageViewBinding(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoPictureResourceKHR.IMAGEVIEWBINDING, value); }

    // -----------------------------------

    /** An array of {@link VkVideoPictureResourceKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoPictureResourceKHR, Buffer> implements NativeResource {

        private static final VkVideoPictureResourceKHR ELEMENT_FACTORY = VkVideoPictureResourceKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoPictureResourceKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoPictureResourceKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoPictureResourceKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoPictureResourceKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoPictureResourceKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoPictureResourceKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoPictureResourceKHR.npNext(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkVideoPictureResourceKHR#codedOffset} field. */
        public VkOffset2D codedOffset() { return VkVideoPictureResourceKHR.ncodedOffset(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoPictureResourceKHR#codedExtent} field. */
        public VkExtent2D codedExtent() { return VkVideoPictureResourceKHR.ncodedExtent(address()); }
        /** @return the value of the {@link VkVideoPictureResourceKHR#baseArrayLayer} field. */
        @NativeType("uint32_t")
        public int baseArrayLayer() { return VkVideoPictureResourceKHR.nbaseArrayLayer(address()); }
        /** @return the value of the {@link VkVideoPictureResourceKHR#imageViewBinding} field. */
        @NativeType("VkImageView")
        public long imageViewBinding() { return VkVideoPictureResourceKHR.nimageViewBinding(address()); }

        /** Sets the specified value to the {@link VkVideoPictureResourceKHR#sType} field. */
        public VkVideoPictureResourceKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoPictureResourceKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR} value to the {@link VkVideoPictureResourceKHR#sType} field. */
        public VkVideoPictureResourceKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR); }
        /** Sets the specified value to the {@link VkVideoPictureResourceKHR#pNext} field. */
        public VkVideoPictureResourceKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoPictureResourceKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkOffset2D} to the {@link VkVideoPictureResourceKHR#codedOffset} field. */
        public VkVideoPictureResourceKHR.Buffer codedOffset(VkOffset2D value) { VkVideoPictureResourceKHR.ncodedOffset(address(), value); return this; }
        /** Passes the {@link VkVideoPictureResourceKHR#codedOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoPictureResourceKHR.Buffer codedOffset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(codedOffset()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoPictureResourceKHR#codedExtent} field. */
        public VkVideoPictureResourceKHR.Buffer codedExtent(VkExtent2D value) { VkVideoPictureResourceKHR.ncodedExtent(address(), value); return this; }
        /** Passes the {@link VkVideoPictureResourceKHR#codedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoPictureResourceKHR.Buffer codedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(codedExtent()); return this; }
        /** Sets the specified value to the {@link VkVideoPictureResourceKHR#baseArrayLayer} field. */
        public VkVideoPictureResourceKHR.Buffer baseArrayLayer(@NativeType("uint32_t") int value) { VkVideoPictureResourceKHR.nbaseArrayLayer(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoPictureResourceKHR#imageViewBinding} field. */
        public VkVideoPictureResourceKHR.Buffer imageViewBinding(@NativeType("VkImageView") long value) { VkVideoPictureResourceKHR.nimageViewBinding(address(), value); return this; }

    }

}