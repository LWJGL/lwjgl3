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
 * Structure specifies H.265 encode decoded pic info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pStdReferenceInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH265ReferenceInfo} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265ReferenceListsEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265DpbSlotInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     int8_t {@link #slotIndex};
 *     {@link StdVideoEncodeH265ReferenceInfo StdVideoEncodeH265ReferenceInfo} const * {@link #pStdReferenceInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH265DpbSlotInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SLOTINDEX,
        PSTDREFERENCEINFO;

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
        PSTDREFERENCEINFO = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkVideoEncodeH265DpbSlotInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265DpbSlotInfoEXT(ByteBuffer container) {
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
    /** the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB Slot</a> index for this picture. */
    @NativeType("int8_t")
    public byte slotIndex() { return nslotIndex(address()); }
    /** a pointer to a {@code StdVideoEncodeH265ReferenceInfo} structure specifying the syntax and other codec-specific information from the H.265 specification, associated with this reference picture. */
    @NativeType("StdVideoEncodeH265ReferenceInfo const *")
    public StdVideoEncodeH265ReferenceInfo pStdReferenceInfo() { return npStdReferenceInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265DpbSlotInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265DpbSlotInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265DpbSlotInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #slotIndex} field. */
    public VkVideoEncodeH265DpbSlotInfoEXT slotIndex(@NativeType("int8_t") byte value) { nslotIndex(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceInfo} to the {@link #pStdReferenceInfo} field. */
    public VkVideoEncodeH265DpbSlotInfoEXT pStdReferenceInfo(@NativeType("StdVideoEncodeH265ReferenceInfo const *") StdVideoEncodeH265ReferenceInfo value) { npStdReferenceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265DpbSlotInfoEXT set(
        int sType,
        long pNext,
        byte slotIndex,
        StdVideoEncodeH265ReferenceInfo pStdReferenceInfo
    ) {
        sType(sType);
        pNext(pNext);
        slotIndex(slotIndex);
        pStdReferenceInfo(pStdReferenceInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265DpbSlotInfoEXT set(VkVideoEncodeH265DpbSlotInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265DpbSlotInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265DpbSlotInfoEXT malloc() {
        return wrap(VkVideoEncodeH265DpbSlotInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265DpbSlotInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265DpbSlotInfoEXT calloc() {
        return wrap(VkVideoEncodeH265DpbSlotInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265DpbSlotInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265DpbSlotInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265DpbSlotInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265DpbSlotInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265DpbSlotInfoEXT create(long address) {
        return wrap(VkVideoEncodeH265DpbSlotInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265DpbSlotInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265DpbSlotInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265DpbSlotInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265DpbSlotInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265DpbSlotInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265DpbSlotInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265DpbSlotInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265DpbSlotInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265DpbSlotInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265DpbSlotInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265DpbSlotInfoEXT.PNEXT); }
    /** Unsafe version of {@link #slotIndex}. */
    public static byte nslotIndex(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265DpbSlotInfoEXT.SLOTINDEX); }
    /** Unsafe version of {@link #pStdReferenceInfo}. */
    public static StdVideoEncodeH265ReferenceInfo npStdReferenceInfo(long struct) { return StdVideoEncodeH265ReferenceInfo.create(memGetAddress(struct + VkVideoEncodeH265DpbSlotInfoEXT.PSTDREFERENCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265DpbSlotInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265DpbSlotInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #slotIndex(byte) slotIndex}. */
    public static void nslotIndex(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265DpbSlotInfoEXT.SLOTINDEX, value); }
    /** Unsafe version of {@link #pStdReferenceInfo(StdVideoEncodeH265ReferenceInfo) pStdReferenceInfo}. */
    public static void npStdReferenceInfo(long struct, StdVideoEncodeH265ReferenceInfo value) { memPutAddress(struct + VkVideoEncodeH265DpbSlotInfoEXT.PSTDREFERENCEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoEncodeH265DpbSlotInfoEXT.PSTDREFERENCEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265DpbSlotInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265DpbSlotInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265DpbSlotInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265DpbSlotInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265DpbSlotInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265DpbSlotInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH265DpbSlotInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265DpbSlotInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265DpbSlotInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265DpbSlotInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265DpbSlotInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265DpbSlotInfoEXT#slotIndex} field. */
        @NativeType("int8_t")
        public byte slotIndex() { return VkVideoEncodeH265DpbSlotInfoEXT.nslotIndex(address()); }
        /** @return a {@link StdVideoEncodeH265ReferenceInfo} view of the struct pointed to by the {@link VkVideoEncodeH265DpbSlotInfoEXT#pStdReferenceInfo} field. */
        @NativeType("StdVideoEncodeH265ReferenceInfo const *")
        public StdVideoEncodeH265ReferenceInfo pStdReferenceInfo() { return VkVideoEncodeH265DpbSlotInfoEXT.npStdReferenceInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265DpbSlotInfoEXT#sType} field. */
        public VkVideoEncodeH265DpbSlotInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265DpbSlotInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT} value to the {@link VkVideoEncodeH265DpbSlotInfoEXT#sType} field. */
        public VkVideoEncodeH265DpbSlotInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265DpbSlotInfoEXT#pNext} field. */
        public VkVideoEncodeH265DpbSlotInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265DpbSlotInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265DpbSlotInfoEXT#slotIndex} field. */
        public VkVideoEncodeH265DpbSlotInfoEXT.Buffer slotIndex(@NativeType("int8_t") byte value) { VkVideoEncodeH265DpbSlotInfoEXT.nslotIndex(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceInfo} to the {@link VkVideoEncodeH265DpbSlotInfoEXT#pStdReferenceInfo} field. */
        public VkVideoEncodeH265DpbSlotInfoEXT.Buffer pStdReferenceInfo(@NativeType("StdVideoEncodeH265ReferenceInfo const *") StdVideoEncodeH265ReferenceInfo value) { VkVideoEncodeH265DpbSlotInfoEXT.npStdReferenceInfo(address(), value); return this; }

    }

}