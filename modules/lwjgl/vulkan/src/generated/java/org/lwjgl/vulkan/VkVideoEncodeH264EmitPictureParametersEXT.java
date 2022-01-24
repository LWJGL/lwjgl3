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
 * Structure specifies H.264 encode SPS NALU insertion parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_EMIT_PICTURE_PARAMETERS_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_EMIT_PICTURE_PARAMETERS_EXT}</li>
 * <li>{@code ppsIdEntries} <b>must</b> be a valid pointer to an array of {@code ppsIdEntryCount} {@code uint8_t} values</li>
 * <li>{@code ppsIdEntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264EmitPictureParametersEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint8_t {@link #spsId};
 *     VkBool32 {@link #emitSpsEnable};
 *     uint32_t {@link #ppsIdEntryCount};
 *     uint8_t const * {@link #ppsIdEntries};
 * }</code></pre>
 */
public class VkVideoEncodeH264EmitPictureParametersEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SPSID,
        EMITSPSENABLE,
        PPSIDENTRYCOUNT,
        PPSIDENTRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(1),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SPSID = layout.offsetof(2);
        EMITSPSENABLE = layout.offsetof(3);
        PPSIDENTRYCOUNT = layout.offsetof(4);
        PPSIDENTRIES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkVideoEncodeH264EmitPictureParametersEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264EmitPictureParametersEXT(ByteBuffer container) {
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
    /** the H.264 SPS ID for the H.264 SPS to insert in the bitstream. The SPS ID <b>must</b> match the SPS provided in {@code spsStd} of {@link VkVideoEncodeH264SessionParametersCreateInfoEXT}. This is retrieved from the {@code VkVideoSessionParametersKHR} object provided in {@link VkVideoBeginCodingInfoKHR}. */
    @NativeType("uint8_t")
    public byte spsId() { return nspsId(address()); }
    /** enables the emitting of the SPS structure with id of {@code spsId}. */
    @NativeType("VkBool32")
    public boolean emitSpsEnable() { return nemitSpsEnable(address()) != 0; }
    /** the number of entries in the {@code ppsIdEntries}. If this parameter is 0 then no pps entries are going to be emitted in the bitstream. */
    @NativeType("uint32_t")
    public int ppsIdEntryCount() { return nppsIdEntryCount(address()); }
    /** a pointer to an array of H.264 PPS IDs for the H.264 PPS to insert in the bitstream. The PPS IDs <b>must</b> match one of the IDs of the PPS(s) provided in {@code pPpsStd} of {@link VkVideoEncodeH264SessionParametersCreateInfoEXT} to identify the PPS parameter set to insert in the bitstream. This is retrieved from the {@code VkVideoSessionParametersKHR} object provided in {@link VkVideoBeginCodingInfoKHR}. */
    @NativeType("uint8_t const *")
    public ByteBuffer ppsIdEntries() { return nppsIdEntries(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264EmitPictureParametersEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_EMIT_PICTURE_PARAMETERS_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_EMIT_PICTURE_PARAMETERS_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264EmitPictureParametersEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_EMIT_PICTURE_PARAMETERS_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264EmitPictureParametersEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #spsId} field. */
    public VkVideoEncodeH264EmitPictureParametersEXT spsId(@NativeType("uint8_t") byte value) { nspsId(address(), value); return this; }
    /** Sets the specified value to the {@link #emitSpsEnable} field. */
    public VkVideoEncodeH264EmitPictureParametersEXT emitSpsEnable(@NativeType("VkBool32") boolean value) { nemitSpsEnable(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #ppsIdEntries} field. */
    public VkVideoEncodeH264EmitPictureParametersEXT ppsIdEntries(@NativeType("uint8_t const *") ByteBuffer value) { nppsIdEntries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264EmitPictureParametersEXT set(
        int sType,
        long pNext,
        byte spsId,
        boolean emitSpsEnable,
        ByteBuffer ppsIdEntries
    ) {
        sType(sType);
        pNext(pNext);
        spsId(spsId);
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
    public VkVideoEncodeH264EmitPictureParametersEXT set(VkVideoEncodeH264EmitPictureParametersEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264EmitPictureParametersEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264EmitPictureParametersEXT malloc() {
        return wrap(VkVideoEncodeH264EmitPictureParametersEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264EmitPictureParametersEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264EmitPictureParametersEXT calloc() {
        return wrap(VkVideoEncodeH264EmitPictureParametersEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264EmitPictureParametersEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264EmitPictureParametersEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264EmitPictureParametersEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264EmitPictureParametersEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264EmitPictureParametersEXT create(long address) {
        return wrap(VkVideoEncodeH264EmitPictureParametersEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264EmitPictureParametersEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264EmitPictureParametersEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264EmitPictureParametersEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264EmitPictureParametersEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264EmitPictureParametersEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264EmitPictureParametersEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264EmitPictureParametersEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264EmitPictureParametersEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264EmitPictureParametersEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264EmitPictureParametersEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264EmitPictureParametersEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264EmitPictureParametersEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264EmitPictureParametersEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264EmitPictureParametersEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264EmitPictureParametersEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264EmitPictureParametersEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264EmitPictureParametersEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264EmitPictureParametersEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264EmitPictureParametersEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264EmitPictureParametersEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264EmitPictureParametersEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264EmitPictureParametersEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264EmitPictureParametersEXT.PNEXT); }
    /** Unsafe version of {@link #spsId}. */
    public static byte nspsId(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264EmitPictureParametersEXT.SPSID); }
    /** Unsafe version of {@link #emitSpsEnable}. */
    public static int nemitSpsEnable(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264EmitPictureParametersEXT.EMITSPSENABLE); }
    /** Unsafe version of {@link #ppsIdEntryCount}. */
    public static int nppsIdEntryCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264EmitPictureParametersEXT.PPSIDENTRYCOUNT); }
    /** Unsafe version of {@link #ppsIdEntries() ppsIdEntries}. */
    public static ByteBuffer nppsIdEntries(long struct) { return memByteBuffer(memGetAddress(struct + VkVideoEncodeH264EmitPictureParametersEXT.PPSIDENTRIES), nppsIdEntryCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264EmitPictureParametersEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264EmitPictureParametersEXT.PNEXT, value); }
    /** Unsafe version of {@link #spsId(byte) spsId}. */
    public static void nspsId(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264EmitPictureParametersEXT.SPSID, value); }
    /** Unsafe version of {@link #emitSpsEnable(boolean) emitSpsEnable}. */
    public static void nemitSpsEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264EmitPictureParametersEXT.EMITSPSENABLE, value); }
    /** Sets the specified value to the {@code ppsIdEntryCount} field of the specified {@code struct}. */
    public static void nppsIdEntryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264EmitPictureParametersEXT.PPSIDENTRYCOUNT, value); }
    /** Unsafe version of {@link #ppsIdEntries(ByteBuffer) ppsIdEntries}. */
    public static void nppsIdEntries(long struct, ByteBuffer value) { memPutAddress(struct + VkVideoEncodeH264EmitPictureParametersEXT.PPSIDENTRIES, memAddress(value)); nppsIdEntryCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoEncodeH264EmitPictureParametersEXT.PPSIDENTRIES));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264EmitPictureParametersEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264EmitPictureParametersEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264EmitPictureParametersEXT ELEMENT_FACTORY = VkVideoEncodeH264EmitPictureParametersEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264EmitPictureParametersEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264EmitPictureParametersEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH264EmitPictureParametersEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264EmitPictureParametersEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264EmitPictureParametersEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264EmitPictureParametersEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264EmitPictureParametersEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264EmitPictureParametersEXT#spsId} field. */
        @NativeType("uint8_t")
        public byte spsId() { return VkVideoEncodeH264EmitPictureParametersEXT.nspsId(address()); }
        /** @return the value of the {@link VkVideoEncodeH264EmitPictureParametersEXT#emitSpsEnable} field. */
        @NativeType("VkBool32")
        public boolean emitSpsEnable() { return VkVideoEncodeH264EmitPictureParametersEXT.nemitSpsEnable(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH264EmitPictureParametersEXT#ppsIdEntryCount} field. */
        @NativeType("uint32_t")
        public int ppsIdEntryCount() { return VkVideoEncodeH264EmitPictureParametersEXT.nppsIdEntryCount(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkVideoEncodeH264EmitPictureParametersEXT#ppsIdEntries} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer ppsIdEntries() { return VkVideoEncodeH264EmitPictureParametersEXT.nppsIdEntries(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264EmitPictureParametersEXT#sType} field. */
        public VkVideoEncodeH264EmitPictureParametersEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264EmitPictureParametersEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_EMIT_PICTURE_PARAMETERS_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_EMIT_PICTURE_PARAMETERS_EXT} value to the {@link VkVideoEncodeH264EmitPictureParametersEXT#sType} field. */
        public VkVideoEncodeH264EmitPictureParametersEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_EMIT_PICTURE_PARAMETERS_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264EmitPictureParametersEXT#pNext} field. */
        public VkVideoEncodeH264EmitPictureParametersEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264EmitPictureParametersEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264EmitPictureParametersEXT#spsId} field. */
        public VkVideoEncodeH264EmitPictureParametersEXT.Buffer spsId(@NativeType("uint8_t") byte value) { VkVideoEncodeH264EmitPictureParametersEXT.nspsId(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264EmitPictureParametersEXT#emitSpsEnable} field. */
        public VkVideoEncodeH264EmitPictureParametersEXT.Buffer emitSpsEnable(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264EmitPictureParametersEXT.nemitSpsEnable(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkVideoEncodeH264EmitPictureParametersEXT#ppsIdEntries} field. */
        public VkVideoEncodeH264EmitPictureParametersEXT.Buffer ppsIdEntries(@NativeType("uint8_t const *") ByteBuffer value) { VkVideoEncodeH264EmitPictureParametersEXT.nppsIdEntries(address(), value); return this; }

    }

}