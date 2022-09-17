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
 * Structure specifies H.265 encode VPS NALU insertion parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_INFO_EXT}</li>
 * <li>If {@code ppsIdEntryCount} is not 0, {@code ppsIdEntries} <b>must</b> be a valid pointer to an array of {@code ppsIdEntryCount} {@code uint8_t} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265EmitPictureParametersInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint8_t {@link #vpsId};
 *     uint8_t {@link #spsId};
 *     VkBool32 {@link #emitVpsEnable};
 *     VkBool32 {@link #emitSpsEnable};
 *     uint32_t {@link #ppsIdEntryCount};
 *     uint8_t const * {@link #ppsIdEntries};
 * }</code></pre>
 */
public class VkVideoEncodeH265EmitPictureParametersInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VPSID,
        SPSID,
        EMITVPSENABLE,
        EMITSPSENABLE,
        PPSIDENTRYCOUNT,
        PPSIDENTRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VPSID = layout.offsetof(2);
        SPSID = layout.offsetof(3);
        EMITVPSENABLE = layout.offsetof(4);
        EMITSPSENABLE = layout.offsetof(5);
        PPSIDENTRYCOUNT = layout.offsetof(6);
        PPSIDENTRIES = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkVideoEncodeH265EmitPictureParametersInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT(ByteBuffer container) {
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
    /** the H.265 VPS ID for the H.265 VPS to insert in the bitstream. The VPS ID <b>must</b> match the VPS provided in {@code vpsStd} of {@link VkVideoEncodeH265SessionParametersCreateInfoEXT}. This is retrieved from the {@code VkVideoSessionParametersKHR} object provided in {@link VkVideoBeginCodingInfoKHR}. */
    @NativeType("uint8_t")
    public byte vpsId() { return nvpsId(address()); }
    /** the H.265 SPS ID for the H.265 SPS to insert in the bitstream. The SPS ID <b>must</b> match one of the IDs of the SPS(s) provided in {@code pSpsStd} of {@link VkVideoEncodeH265SessionParametersCreateInfoEXT} to identify the SPS parameter set to insert in the bitstream. This is retrieved from the {@code VkVideoSessionParametersKHR} object provided in {@link VkVideoBeginCodingInfoKHR}. */
    @NativeType("uint8_t")
    public byte spsId() { return nspsId(address()); }
    /** enables the emitting of the VPS structure with id of {@code vpsId}. */
    @NativeType("VkBool32")
    public boolean emitVpsEnable() { return nemitVpsEnable(address()) != 0; }
    /** enables the emitting of the SPS structure with id of {@code spsId}. */
    @NativeType("VkBool32")
    public boolean emitSpsEnable() { return nemitSpsEnable(address()) != 0; }
    /** the number of entries in the {@code ppsIdEntries}. If this parameter is 0 then no pps entries are going to be emitted in the bitstream. */
    @NativeType("uint32_t")
    public int ppsIdEntryCount() { return nppsIdEntryCount(address()); }
    /** the H.265 PPS IDs for the H.265 PPS to insert in the bitstream. The PPS IDs <b>must</b> match one of the IDs of the PPS(s) provided in {@code pPpsStd} of {@link VkVideoEncodeH265SessionParametersCreateInfoEXT} to identify the PPS parameter set to insert in the bitstream. This is retrieved from the {@code VkVideoSessionParametersKHR} object provided in {@link VkVideoBeginCodingInfoKHR}. */
    @Nullable
    @NativeType("uint8_t const *")
    public ByteBuffer ppsIdEntries() { return nppsIdEntries(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #vpsId} field. */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT vpsId(@NativeType("uint8_t") byte value) { nvpsId(address(), value); return this; }
    /** Sets the specified value to the {@link #spsId} field. */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT spsId(@NativeType("uint8_t") byte value) { nspsId(address(), value); return this; }
    /** Sets the specified value to the {@link #emitVpsEnable} field. */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT emitVpsEnable(@NativeType("VkBool32") boolean value) { nemitVpsEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #emitSpsEnable} field. */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT emitSpsEnable(@NativeType("VkBool32") boolean value) { nemitSpsEnable(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #ppsIdEntries} field. */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT ppsIdEntries(@Nullable @NativeType("uint8_t const *") ByteBuffer value) { nppsIdEntries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT set(
        int sType,
        long pNext,
        byte vpsId,
        byte spsId,
        boolean emitVpsEnable,
        boolean emitSpsEnable,
        @Nullable ByteBuffer ppsIdEntries
    ) {
        sType(sType);
        pNext(pNext);
        vpsId(vpsId);
        spsId(spsId);
        emitVpsEnable(emitVpsEnable);
        emitSpsEnable(emitSpsEnable);
        ppsIdEntries(ppsIdEntries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265EmitPictureParametersInfoEXT set(VkVideoEncodeH265EmitPictureParametersInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265EmitPictureParametersInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT malloc() {
        return wrap(VkVideoEncodeH265EmitPictureParametersInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265EmitPictureParametersInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT calloc() {
        return wrap(VkVideoEncodeH265EmitPictureParametersInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265EmitPictureParametersInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265EmitPictureParametersInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265EmitPictureParametersInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT create(long address) {
        return wrap(VkVideoEncodeH265EmitPictureParametersInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265EmitPictureParametersInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265EmitPictureParametersInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265EmitPictureParametersInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265EmitPictureParametersInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265EmitPictureParametersInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.PNEXT); }
    /** Unsafe version of {@link #vpsId}. */
    public static byte nvpsId(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.VPSID); }
    /** Unsafe version of {@link #spsId}. */
    public static byte nspsId(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.SPSID); }
    /** Unsafe version of {@link #emitVpsEnable}. */
    public static int nemitVpsEnable(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.EMITVPSENABLE); }
    /** Unsafe version of {@link #emitSpsEnable}. */
    public static int nemitSpsEnable(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.EMITSPSENABLE); }
    /** Unsafe version of {@link #ppsIdEntryCount}. */
    public static int nppsIdEntryCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.PPSIDENTRYCOUNT); }
    /** Unsafe version of {@link #ppsIdEntries() ppsIdEntries}. */
    @Nullable public static ByteBuffer nppsIdEntries(long struct) { return memByteBufferSafe(memGetAddress(struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.PPSIDENTRIES), nppsIdEntryCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #vpsId(byte) vpsId}. */
    public static void nvpsId(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.VPSID, value); }
    /** Unsafe version of {@link #spsId(byte) spsId}. */
    public static void nspsId(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.SPSID, value); }
    /** Unsafe version of {@link #emitVpsEnable(boolean) emitVpsEnable}. */
    public static void nemitVpsEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.EMITVPSENABLE, value); }
    /** Unsafe version of {@link #emitSpsEnable(boolean) emitSpsEnable}. */
    public static void nemitSpsEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.EMITSPSENABLE, value); }
    /** Sets the specified value to the {@code ppsIdEntryCount} field of the specified {@code struct}. */
    public static void nppsIdEntryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.PPSIDENTRYCOUNT, value); }
    /** Unsafe version of {@link #ppsIdEntries(ByteBuffer) ppsIdEntries}. */
    public static void nppsIdEntries(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.PPSIDENTRIES, memAddressSafe(value)); nppsIdEntryCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nppsIdEntryCount(struct) != 0) {
            check(memGetAddress(struct + VkVideoEncodeH265EmitPictureParametersInfoEXT.PPSIDENTRIES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265EmitPictureParametersInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265EmitPictureParametersInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265EmitPictureParametersInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265EmitPictureParametersInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH265EmitPictureParametersInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265EmitPictureParametersInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265EmitPictureParametersInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#vpsId} field. */
        @NativeType("uint8_t")
        public byte vpsId() { return VkVideoEncodeH265EmitPictureParametersInfoEXT.nvpsId(address()); }
        /** @return the value of the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#spsId} field. */
        @NativeType("uint8_t")
        public byte spsId() { return VkVideoEncodeH265EmitPictureParametersInfoEXT.nspsId(address()); }
        /** @return the value of the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#emitVpsEnable} field. */
        @NativeType("VkBool32")
        public boolean emitVpsEnable() { return VkVideoEncodeH265EmitPictureParametersInfoEXT.nemitVpsEnable(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#emitSpsEnable} field. */
        @NativeType("VkBool32")
        public boolean emitSpsEnable() { return VkVideoEncodeH265EmitPictureParametersInfoEXT.nemitSpsEnable(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#ppsIdEntryCount} field. */
        @NativeType("uint32_t")
        public int ppsIdEntryCount() { return VkVideoEncodeH265EmitPictureParametersInfoEXT.nppsIdEntryCount(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#ppsIdEntries} field. */
        @Nullable
        @NativeType("uint8_t const *")
        public ByteBuffer ppsIdEntries() { return VkVideoEncodeH265EmitPictureParametersInfoEXT.nppsIdEntries(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#sType} field. */
        public VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265EmitPictureParametersInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_INFO_EXT} value to the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#sType} field. */
        public VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#pNext} field. */
        public VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265EmitPictureParametersInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#vpsId} field. */
        public VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer vpsId(@NativeType("uint8_t") byte value) { VkVideoEncodeH265EmitPictureParametersInfoEXT.nvpsId(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#spsId} field. */
        public VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer spsId(@NativeType("uint8_t") byte value) { VkVideoEncodeH265EmitPictureParametersInfoEXT.nspsId(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#emitVpsEnable} field. */
        public VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer emitVpsEnable(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265EmitPictureParametersInfoEXT.nemitVpsEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#emitSpsEnable} field. */
        public VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer emitSpsEnable(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265EmitPictureParametersInfoEXT.nemitSpsEnable(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkVideoEncodeH265EmitPictureParametersInfoEXT#ppsIdEntries} field. */
        public VkVideoEncodeH265EmitPictureParametersInfoEXT.Buffer ppsIdEntries(@Nullable @NativeType("uint8_t const *") ByteBuffer value) { VkVideoEncodeH265EmitPictureParametersInfoEXT.nppsIdEntries(address(), value); return this; }

    }

}