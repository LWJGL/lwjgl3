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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the reference picture slot.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeH264DpbSlotInfoEXT} or {@link VkVideoDecodeH265DpbSlotInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code pPictureResource} <b>must</b> be a valid pointer to a valid {@link VkVideoPictureResourceKHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoBeginCodingInfoKHR}, {@link VkVideoDecodeInfoKHR}, {@link VkVideoEncodeInfoKHR}, {@link VkVideoPictureResourceKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoReferenceSlotKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     int8_t {@link #slotIndex};
 *     {@link VkVideoPictureResourceKHR VkVideoPictureResourceKHR} const * {@link #pPictureResource};
 * }</code></pre>
 */
public class VkVideoReferenceSlotKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SLOTINDEX,
        PPICTURERESOURCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SLOTINDEX = layout.offsetof(2);
        PPICTURERESOURCE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkVideoReferenceSlotKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoReferenceSlotKHR(ByteBuffer container) {
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
    /** the unique reference slot index used for the encode or decode operation. */
    @NativeType("int8_t")
    public byte slotIndex() { return nslotIndex(address()); }
    /** a pointer to a {@link VkVideoPictureResourceKHR} structure describing the picture resource bound to this slot index. */
    @NativeType("VkVideoPictureResourceKHR const *")
    public VkVideoPictureResourceKHR pPictureResource() { return npPictureResource(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoReferenceSlotKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR} value to the {@link #sType} field. */
    public VkVideoReferenceSlotKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoReferenceSlotKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264DpbSlotInfoEXT} value to the {@code pNext} chain. */
    public VkVideoReferenceSlotKHR pNext(VkVideoDecodeH264DpbSlotInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265DpbSlotInfoEXT} value to the {@code pNext} chain. */
    public VkVideoReferenceSlotKHR pNext(VkVideoDecodeH265DpbSlotInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #slotIndex} field. */
    public VkVideoReferenceSlotKHR slotIndex(@NativeType("int8_t") byte value) { nslotIndex(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoPictureResourceKHR} to the {@link #pPictureResource} field. */
    public VkVideoReferenceSlotKHR pPictureResource(@NativeType("VkVideoPictureResourceKHR const *") VkVideoPictureResourceKHR value) { npPictureResource(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoReferenceSlotKHR set(
        int sType,
        long pNext,
        byte slotIndex,
        VkVideoPictureResourceKHR pPictureResource
    ) {
        sType(sType);
        pNext(pNext);
        slotIndex(slotIndex);
        pPictureResource(pPictureResource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoReferenceSlotKHR set(VkVideoReferenceSlotKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoReferenceSlotKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoReferenceSlotKHR malloc() {
        return wrap(VkVideoReferenceSlotKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoReferenceSlotKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoReferenceSlotKHR calloc() {
        return wrap(VkVideoReferenceSlotKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoReferenceSlotKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoReferenceSlotKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoReferenceSlotKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoReferenceSlotKHR} instance for the specified memory address. */
    public static VkVideoReferenceSlotKHR create(long address) {
        return wrap(VkVideoReferenceSlotKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoReferenceSlotKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoReferenceSlotKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoReferenceSlotKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoReferenceSlotKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoReferenceSlotKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoReferenceSlotKHR malloc(MemoryStack stack) {
        return wrap(VkVideoReferenceSlotKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoReferenceSlotKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoReferenceSlotKHR calloc(MemoryStack stack) {
        return wrap(VkVideoReferenceSlotKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoReferenceSlotKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceSlotKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoReferenceSlotKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoReferenceSlotKHR.PNEXT); }
    /** Unsafe version of {@link #slotIndex}. */
    public static byte nslotIndex(long struct) { return UNSAFE.getByte(null, struct + VkVideoReferenceSlotKHR.SLOTINDEX); }
    /** Unsafe version of {@link #pPictureResource}. */
    public static VkVideoPictureResourceKHR npPictureResource(long struct) { return VkVideoPictureResourceKHR.create(memGetAddress(struct + VkVideoReferenceSlotKHR.PPICTURERESOURCE)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoReferenceSlotKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoReferenceSlotKHR.PNEXT, value); }
    /** Unsafe version of {@link #slotIndex(byte) slotIndex}. */
    public static void nslotIndex(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoReferenceSlotKHR.SLOTINDEX, value); }
    /** Unsafe version of {@link #pPictureResource(VkVideoPictureResourceKHR) pPictureResource}. */
    public static void npPictureResource(long struct, VkVideoPictureResourceKHR value) { memPutAddress(struct + VkVideoReferenceSlotKHR.PPICTURERESOURCE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoReferenceSlotKHR.PPICTURERESOURCE));
    }

    // -----------------------------------

    /** An array of {@link VkVideoReferenceSlotKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoReferenceSlotKHR, Buffer> implements NativeResource {

        private static final VkVideoReferenceSlotKHR ELEMENT_FACTORY = VkVideoReferenceSlotKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoReferenceSlotKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoReferenceSlotKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoReferenceSlotKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoReferenceSlotKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoReferenceSlotKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoReferenceSlotKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoReferenceSlotKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoReferenceSlotKHR#slotIndex} field. */
        @NativeType("int8_t")
        public byte slotIndex() { return VkVideoReferenceSlotKHR.nslotIndex(address()); }
        /** @return a {@link VkVideoPictureResourceKHR} view of the struct pointed to by the {@link VkVideoReferenceSlotKHR#pPictureResource} field. */
        @NativeType("VkVideoPictureResourceKHR const *")
        public VkVideoPictureResourceKHR pPictureResource() { return VkVideoReferenceSlotKHR.npPictureResource(address()); }

        /** Sets the specified value to the {@link VkVideoReferenceSlotKHR#sType} field. */
        public VkVideoReferenceSlotKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoReferenceSlotKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR} value to the {@link VkVideoReferenceSlotKHR#sType} field. */
        public VkVideoReferenceSlotKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR); }
        /** Sets the specified value to the {@link VkVideoReferenceSlotKHR#pNext} field. */
        public VkVideoReferenceSlotKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoReferenceSlotKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264DpbSlotInfoEXT} value to the {@code pNext} chain. */
        public VkVideoReferenceSlotKHR.Buffer pNext(VkVideoDecodeH264DpbSlotInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265DpbSlotInfoEXT} value to the {@code pNext} chain. */
        public VkVideoReferenceSlotKHR.Buffer pNext(VkVideoDecodeH265DpbSlotInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoReferenceSlotKHR#slotIndex} field. */
        public VkVideoReferenceSlotKHR.Buffer slotIndex(@NativeType("int8_t") byte value) { VkVideoReferenceSlotKHR.nslotIndex(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoPictureResourceKHR} to the {@link VkVideoReferenceSlotKHR#pPictureResource} field. */
        public VkVideoReferenceSlotKHR.Buffer pPictureResource(@NativeType("VkVideoPictureResourceKHR const *") VkVideoPictureResourceKHR value) { VkVideoReferenceSlotKHR.npPictureResource(address(), value); return this; }

    }

}