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

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies H.264 encode DPB picture information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264PictureInfo} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264NaluSliceEXT}, {@link VkVideoEncodeH264VclFrameInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264DpbSlotInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     int8_t slotIndex;
 *     {@link StdVideoEncodeH264PictureInfo StdVideoEncodeH264PictureInfo} const * pStdPictureInfo;
 * }</code></pre>
 */
public class VkVideoEncodeH264DpbSlotInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SLOTINDEX,
        PSTDPICTUREINFO;

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
        PSTDPICTUREINFO = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkVideoEncodeH264DpbSlotInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264DpbSlotInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code slotIndex} field. */
    @NativeType("int8_t")
    public byte slotIndex() { return nslotIndex(address()); }
    /** @return a {@link StdVideoEncodeH264PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
    @NativeType("StdVideoEncodeH264PictureInfo const *")
    public StdVideoEncodeH264PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264DpbSlotInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264DpbSlotInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code slotIndex} field. */
    public VkVideoEncodeH264DpbSlotInfoEXT slotIndex(@NativeType("int8_t") byte value) { nslotIndex(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@code pStdPictureInfo} field. */
    public VkVideoEncodeH264DpbSlotInfoEXT pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { npStdPictureInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264DpbSlotInfoEXT set(
        int sType,
        long pNext,
        byte slotIndex,
        StdVideoEncodeH264PictureInfo pStdPictureInfo
    ) {
        sType(sType);
        pNext(pNext);
        slotIndex(slotIndex);
        pStdPictureInfo(pStdPictureInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264DpbSlotInfoEXT set(VkVideoEncodeH264DpbSlotInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264DpbSlotInfoEXT malloc() {
        return wrap(VkVideoEncodeH264DpbSlotInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264DpbSlotInfoEXT calloc() {
        return wrap(VkVideoEncodeH264DpbSlotInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264DpbSlotInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264DpbSlotInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264DpbSlotInfoEXT create(long address) {
        return wrap(VkVideoEncodeH264DpbSlotInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264DpbSlotInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264DpbSlotInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264DpbSlotInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264DpbSlotInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264DpbSlotInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PNEXT); }
    /** Unsafe version of {@link #slotIndex}. */
    public static byte nslotIndex(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264DpbSlotInfoEXT.SLOTINDEX); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeH264PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeH264PictureInfo.create(memGetAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PSTDPICTUREINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264DpbSlotInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #slotIndex(byte) slotIndex}. */
    public static void nslotIndex(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264DpbSlotInfoEXT.SLOTINDEX, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeH264PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeH264PictureInfo value) { memPutAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PSTDPICTUREINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PSTDPICTUREINFO));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264DpbSlotInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264DpbSlotInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264DpbSlotInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264DpbSlotInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264DpbSlotInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH264DpbSlotInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264DpbSlotInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264DpbSlotInfoEXT.npNext(address()); }
        /** @return the value of the {@code slotIndex} field. */
        @NativeType("int8_t")
        public byte slotIndex() { return VkVideoEncodeH264DpbSlotInfoEXT.nslotIndex(address()); }
        /** @return a {@link StdVideoEncodeH264PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeH264PictureInfo const *")
        public StdVideoEncodeH264PictureInfo pStdPictureInfo() { return VkVideoEncodeH264DpbSlotInfoEXT.npStdPictureInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264DpbSlotInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264DpbSlotInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code slotIndex} field. */
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer slotIndex(@NativeType("int8_t") byte value) { VkVideoEncodeH264DpbSlotInfoEXT.nslotIndex(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@code pStdPictureInfo} field. */
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { VkVideoEncodeH264DpbSlotInfoEXT.npStdPictureInfo(address(), value); return this; }

    }

}