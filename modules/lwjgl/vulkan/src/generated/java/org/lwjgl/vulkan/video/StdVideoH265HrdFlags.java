/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265HrdFlags {
 *     uint32_t nal_hrd_parameters_present_flag : 1;
 *     uint32_t vcl_hrd_parameters_present_flag : 1;
 *     uint32_t sub_pic_hrd_params_present_flag : 1;
 *     uint32_t sub_pic_cpb_params_in_pic_timing_sei_flag : 1;
 *     uint32_t {@link #fixed_pic_rate_general_flag} : 8;
 *     uint32_t {@link #fixed_pic_rate_within_cvs_flag} : 8;
 *     uint32_t {@link #low_delay_hrd_flag} : 8;
 * }</code></pre>
 */
public class StdVideoH265HrdFlags extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0,
        BITFIELD1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    /**
     * Creates a {@code StdVideoH265HrdFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265HrdFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code nal_hrd_parameters_present_flag} field. */
    @NativeType("uint32_t")
    public boolean nal_hrd_parameters_present_flag() { return nnal_hrd_parameters_present_flag(address()) != 0; }
    /** @return the value of the {@code vcl_hrd_parameters_present_flag} field. */
    @NativeType("uint32_t")
    public boolean vcl_hrd_parameters_present_flag() { return nvcl_hrd_parameters_present_flag(address()) != 0; }
    /** @return the value of the {@code sub_pic_hrd_params_present_flag} field. */
    @NativeType("uint32_t")
    public boolean sub_pic_hrd_params_present_flag() { return nsub_pic_hrd_params_present_flag(address()) != 0; }
    /** @return the value of the {@code sub_pic_cpb_params_in_pic_timing_sei_flag} field. */
    @NativeType("uint32_t")
    public boolean sub_pic_cpb_params_in_pic_timing_sei_flag() { return nsub_pic_cpb_params_in_pic_timing_sei_flag(address()) != 0; }
    /** each bit represents a sublayer, bit 0 - vps_max_sub_layers_minus1 */
    @NativeType("uint32_t")
    public int fixed_pic_rate_general_flag() { return nfixed_pic_rate_general_flag(address()); }
    /** each bit represents a sublayer, bit 0 - vps_max_sub_layers_minus1 */
    @NativeType("uint32_t")
    public int fixed_pic_rate_within_cvs_flag() { return nfixed_pic_rate_within_cvs_flag(address()); }
    /** each bit represents a sublayer, bit 0 - vps_max_sub_layers_minus1 */
    @NativeType("uint32_t")
    public int low_delay_hrd_flag() { return nlow_delay_hrd_flag(address()); }

    /** Sets the specified value to the {@code nal_hrd_parameters_present_flag} field. */
    public StdVideoH265HrdFlags nal_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { nnal_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vcl_hrd_parameters_present_flag} field. */
    public StdVideoH265HrdFlags vcl_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { nvcl_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sub_pic_hrd_params_present_flag} field. */
    public StdVideoH265HrdFlags sub_pic_hrd_params_present_flag(@NativeType("uint32_t") boolean value) { nsub_pic_hrd_params_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sub_pic_cpb_params_in_pic_timing_sei_flag} field. */
    public StdVideoH265HrdFlags sub_pic_cpb_params_in_pic_timing_sei_flag(@NativeType("uint32_t") boolean value) { nsub_pic_cpb_params_in_pic_timing_sei_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #fixed_pic_rate_general_flag} field. */
    public StdVideoH265HrdFlags fixed_pic_rate_general_flag(@NativeType("uint32_t") int value) { nfixed_pic_rate_general_flag(address(), value); return this; }
    /** Sets the specified value to the {@link #fixed_pic_rate_within_cvs_flag} field. */
    public StdVideoH265HrdFlags fixed_pic_rate_within_cvs_flag(@NativeType("uint32_t") int value) { nfixed_pic_rate_within_cvs_flag(address(), value); return this; }
    /** Sets the specified value to the {@link #low_delay_hrd_flag} field. */
    public StdVideoH265HrdFlags low_delay_hrd_flag(@NativeType("uint32_t") int value) { nlow_delay_hrd_flag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265HrdFlags set(
        boolean nal_hrd_parameters_present_flag,
        boolean vcl_hrd_parameters_present_flag,
        boolean sub_pic_hrd_params_present_flag,
        boolean sub_pic_cpb_params_in_pic_timing_sei_flag,
        int fixed_pic_rate_general_flag,
        int fixed_pic_rate_within_cvs_flag,
        int low_delay_hrd_flag
    ) {
        nal_hrd_parameters_present_flag(nal_hrd_parameters_present_flag);
        vcl_hrd_parameters_present_flag(vcl_hrd_parameters_present_flag);
        sub_pic_hrd_params_present_flag(sub_pic_hrd_params_present_flag);
        sub_pic_cpb_params_in_pic_timing_sei_flag(sub_pic_cpb_params_in_pic_timing_sei_flag);
        fixed_pic_rate_general_flag(fixed_pic_rate_general_flag);
        fixed_pic_rate_within_cvs_flag(fixed_pic_rate_within_cvs_flag);
        low_delay_hrd_flag(low_delay_hrd_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265HrdFlags set(StdVideoH265HrdFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265HrdFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265HrdFlags malloc() {
        return wrap(StdVideoH265HrdFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265HrdFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265HrdFlags calloc() {
        return wrap(StdVideoH265HrdFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265HrdFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265HrdFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265HrdFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265HrdFlags} instance for the specified memory address. */
    public static StdVideoH265HrdFlags create(long address) {
        return wrap(StdVideoH265HrdFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265HrdFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265HrdFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265HrdFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265HrdFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265HrdFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265HrdFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265HrdFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265HrdFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265HrdFlags malloc(MemoryStack stack) {
        return wrap(StdVideoH265HrdFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265HrdFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265HrdFlags calloc(MemoryStack stack) {
        return wrap(StdVideoH265HrdFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265HrdFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265HrdFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265HrdFlags.BITFIELD0); }
    /** Unsafe version of {@link #nal_hrd_parameters_present_flag}. */
    public static int nnal_hrd_parameters_present_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #vcl_hrd_parameters_present_flag}. */
    public static int nvcl_hrd_parameters_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #sub_pic_hrd_params_present_flag}. */
    public static int nsub_pic_hrd_params_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #sub_pic_cpb_params_in_pic_timing_sei_flag}. */
    public static int nsub_pic_cpb_params_in_pic_timing_sei_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    public static int nbitfield1(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265HrdFlags.BITFIELD1); }
    /** Unsafe version of {@link #fixed_pic_rate_general_flag}. */
    public static int nfixed_pic_rate_general_flag(long struct) { return nbitfield1(struct) & 0x00_00_00_FF; }
    /** Unsafe version of {@link #fixed_pic_rate_within_cvs_flag}. */
    public static int nfixed_pic_rate_within_cvs_flag(long struct) { return (nbitfield1(struct) & 0x00_00_FF_00) >>> 8; }
    /** Unsafe version of {@link #low_delay_hrd_flag}. */
    public static int nlow_delay_hrd_flag(long struct) { return (nbitfield1(struct) & 0x00_FF_00_00) >>> 16; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265HrdFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #nal_hrd_parameters_present_flag(boolean) nal_hrd_parameters_present_flag}. */
    public static void nnal_hrd_parameters_present_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #vcl_hrd_parameters_present_flag(boolean) vcl_hrd_parameters_present_flag}. */
    public static void nvcl_hrd_parameters_present_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #sub_pic_hrd_params_present_flag(boolean) sub_pic_hrd_params_present_flag}. */
    public static void nsub_pic_hrd_params_present_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #sub_pic_cpb_params_in_pic_timing_sei_flag(boolean) sub_pic_cpb_params_in_pic_timing_sei_flag}. */
    public static void nsub_pic_cpb_params_in_pic_timing_sei_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    public static void nbitfield1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265HrdFlags.BITFIELD1, value); }
    /** Unsafe version of {@link #fixed_pic_rate_general_flag(int) fixed_pic_rate_general_flag}. */
    public static void nfixed_pic_rate_general_flag(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xFF_FF_FF_00) | (value & 0x00_00_00_FF)); }
    /** Unsafe version of {@link #fixed_pic_rate_within_cvs_flag(int) fixed_pic_rate_within_cvs_flag}. */
    public static void nfixed_pic_rate_within_cvs_flag(long struct, int value) { nbitfield1(struct, ((value << 8) & 0x00_00_FF_00) | (nbitfield1(struct) & 0xFF_FF_00_FF)); }
    /** Unsafe version of {@link #low_delay_hrd_flag(int) low_delay_hrd_flag}. */
    public static void nlow_delay_hrd_flag(long struct, int value) { nbitfield1(struct, ((value << 16) & 0x00_FF_00_00) | (nbitfield1(struct) & 0xFF_00_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoH265HrdFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265HrdFlags, Buffer> implements NativeResource {

        private static final StdVideoH265HrdFlags ELEMENT_FACTORY = StdVideoH265HrdFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH265HrdFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265HrdFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265HrdFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code nal_hrd_parameters_present_flag} field. */
        @NativeType("uint32_t")
        public boolean nal_hrd_parameters_present_flag() { return StdVideoH265HrdFlags.nnal_hrd_parameters_present_flag(address()) != 0; }
        /** @return the value of the {@code vcl_hrd_parameters_present_flag} field. */
        @NativeType("uint32_t")
        public boolean vcl_hrd_parameters_present_flag() { return StdVideoH265HrdFlags.nvcl_hrd_parameters_present_flag(address()) != 0; }
        /** @return the value of the {@code sub_pic_hrd_params_present_flag} field. */
        @NativeType("uint32_t")
        public boolean sub_pic_hrd_params_present_flag() { return StdVideoH265HrdFlags.nsub_pic_hrd_params_present_flag(address()) != 0; }
        /** @return the value of the {@code sub_pic_cpb_params_in_pic_timing_sei_flag} field. */
        @NativeType("uint32_t")
        public boolean sub_pic_cpb_params_in_pic_timing_sei_flag() { return StdVideoH265HrdFlags.nsub_pic_cpb_params_in_pic_timing_sei_flag(address()) != 0; }
        /** @return the value of the {@link StdVideoH265HrdFlags#fixed_pic_rate_general_flag} field. */
        @NativeType("uint32_t")
        public int fixed_pic_rate_general_flag() { return StdVideoH265HrdFlags.nfixed_pic_rate_general_flag(address()); }
        /** @return the value of the {@link StdVideoH265HrdFlags#fixed_pic_rate_within_cvs_flag} field. */
        @NativeType("uint32_t")
        public int fixed_pic_rate_within_cvs_flag() { return StdVideoH265HrdFlags.nfixed_pic_rate_within_cvs_flag(address()); }
        /** @return the value of the {@link StdVideoH265HrdFlags#low_delay_hrd_flag} field. */
        @NativeType("uint32_t")
        public int low_delay_hrd_flag() { return StdVideoH265HrdFlags.nlow_delay_hrd_flag(address()); }

        /** Sets the specified value to the {@code nal_hrd_parameters_present_flag} field. */
        public StdVideoH265HrdFlags.Buffer nal_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265HrdFlags.nnal_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vcl_hrd_parameters_present_flag} field. */
        public StdVideoH265HrdFlags.Buffer vcl_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265HrdFlags.nvcl_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sub_pic_hrd_params_present_flag} field. */
        public StdVideoH265HrdFlags.Buffer sub_pic_hrd_params_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265HrdFlags.nsub_pic_hrd_params_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sub_pic_cpb_params_in_pic_timing_sei_flag} field. */
        public StdVideoH265HrdFlags.Buffer sub_pic_cpb_params_in_pic_timing_sei_flag(@NativeType("uint32_t") boolean value) { StdVideoH265HrdFlags.nsub_pic_cpb_params_in_pic_timing_sei_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoH265HrdFlags#fixed_pic_rate_general_flag} field. */
        public StdVideoH265HrdFlags.Buffer fixed_pic_rate_general_flag(@NativeType("uint32_t") int value) { StdVideoH265HrdFlags.nfixed_pic_rate_general_flag(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoH265HrdFlags#fixed_pic_rate_within_cvs_flag} field. */
        public StdVideoH265HrdFlags.Buffer fixed_pic_rate_within_cvs_flag(@NativeType("uint32_t") int value) { StdVideoH265HrdFlags.nfixed_pic_rate_within_cvs_flag(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoH265HrdFlags#low_delay_hrd_flag} field. */
        public StdVideoH265HrdFlags.Buffer low_delay_hrd_flag(@NativeType("uint32_t") int value) { StdVideoH265HrdFlags.nlow_delay_hrd_flag(address(), value); return this; }

    }

}