/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure used to model a Type~1 or Type~2 private dictionary. Note that for Multiple Master fonts, each instance has its own Private dictionary.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct PS_PrivateRec {
 *     FT_Int unique_id;
 *     FT_Int lenIV;
 *     FT_Byte num_blue_values;
 *     FT_Byte num_other_blues;
 *     FT_Byte num_family_blues;
 *     FT_Byte num_family_other_blues;
 *     FT_Short blue_values[14];
 *     FT_Short other_blues[10];
 *     FT_Short family_blues[14];
 *     FT_Short family_other_blues[10];
 *     FT_Fixed blue_scale;
 *     FT_Int blue_shift;
 *     FT_Int blue_fuzz;
 *     FT_UShort standard_width[1];
 *     FT_UShort standard_height[1];
 *     FT_Byte num_snap_widths;
 *     FT_Byte num_snap_heights;
 *     FT_Bool force_bold;
 *     FT_Bool round_stem_up;
 *     FT_Short {@link #snap_widths}[13];
 *     FT_Short {@link #snap_heights}[13];
 *     FT_Fixed expansion_factor;
 *     FT_Long language_group;
 *     FT_Long password;
 *     FT_Short min_feature[2];
 * }</code></pre>
 */
@NativeType("struct PS_PrivateRec")
public class PS_Private extends Struct<PS_Private> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UNIQUE_ID,
        LENIV,
        NUM_BLUE_VALUES,
        NUM_OTHER_BLUES,
        NUM_FAMILY_BLUES,
        NUM_FAMILY_OTHER_BLUES,
        BLUE_VALUES,
        OTHER_BLUES,
        FAMILY_BLUES,
        FAMILY_OTHER_BLUES,
        BLUE_SCALE,
        BLUE_SHIFT,
        BLUE_FUZZ,
        STANDARD_WIDTH,
        STANDARD_HEIGHT,
        NUM_SNAP_WIDTHS,
        NUM_SNAP_HEIGHTS,
        FORCE_BOLD,
        ROUND_STEM_UP,
        SNAP_WIDTHS,
        SNAP_HEIGHTS,
        EXPANSION_FACTOR,
        LANGUAGE_GROUP,
        PASSWORD,
        MIN_FEATURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(2, 14),
            __array(2, 10),
            __array(2, 14),
            __array(2, 10),
            __member(CLONG_SIZE),
            __member(4),
            __member(4),
            __array(2, 1),
            __array(2, 1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(2, 13),
            __array(2, 13),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __array(2, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UNIQUE_ID = layout.offsetof(0);
        LENIV = layout.offsetof(1);
        NUM_BLUE_VALUES = layout.offsetof(2);
        NUM_OTHER_BLUES = layout.offsetof(3);
        NUM_FAMILY_BLUES = layout.offsetof(4);
        NUM_FAMILY_OTHER_BLUES = layout.offsetof(5);
        BLUE_VALUES = layout.offsetof(6);
        OTHER_BLUES = layout.offsetof(7);
        FAMILY_BLUES = layout.offsetof(8);
        FAMILY_OTHER_BLUES = layout.offsetof(9);
        BLUE_SCALE = layout.offsetof(10);
        BLUE_SHIFT = layout.offsetof(11);
        BLUE_FUZZ = layout.offsetof(12);
        STANDARD_WIDTH = layout.offsetof(13);
        STANDARD_HEIGHT = layout.offsetof(14);
        NUM_SNAP_WIDTHS = layout.offsetof(15);
        NUM_SNAP_HEIGHTS = layout.offsetof(16);
        FORCE_BOLD = layout.offsetof(17);
        ROUND_STEM_UP = layout.offsetof(18);
        SNAP_WIDTHS = layout.offsetof(19);
        SNAP_HEIGHTS = layout.offsetof(20);
        EXPANSION_FACTOR = layout.offsetof(21);
        LANGUAGE_GROUP = layout.offsetof(22);
        PASSWORD = layout.offsetof(23);
        MIN_FEATURE = layout.offsetof(24);
    }

    protected PS_Private(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected PS_Private create(long address, @Nullable ByteBuffer container) {
        return new PS_Private(address, container);
    }

    /**
     * Creates a {@code PS_Private} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public PS_Private(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code unique_id} field. */
    @NativeType("FT_Int")
    public int unique_id() { return nunique_id(address()); }
    /** @return the value of the {@code lenIV} field. */
    @NativeType("FT_Int")
    public int lenIV() { return nlenIV(address()); }
    /** @return the value of the {@code num_blue_values} field. */
    @NativeType("FT_Byte")
    public byte num_blue_values() { return nnum_blue_values(address()); }
    /** @return the value of the {@code num_other_blues} field. */
    @NativeType("FT_Byte")
    public byte num_other_blues() { return nnum_other_blues(address()); }
    /** @return the value of the {@code num_family_blues} field. */
    @NativeType("FT_Byte")
    public byte num_family_blues() { return nnum_family_blues(address()); }
    /** @return the value of the {@code num_family_other_blues} field. */
    @NativeType("FT_Byte")
    public byte num_family_other_blues() { return nnum_family_other_blues(address()); }
    /** @return a {@link ShortBuffer} view of the {@code blue_values} field. */
    @NativeType("FT_Short[14]")
    public ShortBuffer blue_values() { return nblue_values(address()); }
    /** @return the value at the specified index of the {@code blue_values} field. */
    @NativeType("FT_Short")
    public short blue_values(int index) { return nblue_values(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code other_blues} field. */
    @NativeType("FT_Short[10]")
    public ShortBuffer other_blues() { return nother_blues(address()); }
    /** @return the value at the specified index of the {@code other_blues} field. */
    @NativeType("FT_Short")
    public short other_blues(int index) { return nother_blues(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code family_blues} field. */
    @NativeType("FT_Short[14]")
    public ShortBuffer family_blues() { return nfamily_blues(address()); }
    /** @return the value at the specified index of the {@code family_blues} field. */
    @NativeType("FT_Short")
    public short family_blues(int index) { return nfamily_blues(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code family_other_blues} field. */
    @NativeType("FT_Short[10]")
    public ShortBuffer family_other_blues() { return nfamily_other_blues(address()); }
    /** @return the value at the specified index of the {@code family_other_blues} field. */
    @NativeType("FT_Short")
    public short family_other_blues(int index) { return nfamily_other_blues(address(), index); }
    /** @return the value of the {@code blue_scale} field. */
    @NativeType("FT_Fixed")
    public long blue_scale() { return nblue_scale(address()); }
    /** @return the value of the {@code blue_shift} field. */
    @NativeType("FT_Int")
    public int blue_shift() { return nblue_shift(address()); }
    /** @return the value of the {@code blue_fuzz} field. */
    @NativeType("FT_Int")
    public int blue_fuzz() { return nblue_fuzz(address()); }
    /** @return a {@link ShortBuffer} view of the {@code standard_width} field. */
    @NativeType("FT_UShort[1]")
    public ShortBuffer standard_width() { return nstandard_width(address()); }
    /** @return the value at the specified index of the {@code standard_width} field. */
    @NativeType("FT_UShort")
    public short standard_width(int index) { return nstandard_width(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code standard_height} field. */
    @NativeType("FT_UShort[1]")
    public ShortBuffer standard_height() { return nstandard_height(address()); }
    /** @return the value at the specified index of the {@code standard_height} field. */
    @NativeType("FT_UShort")
    public short standard_height(int index) { return nstandard_height(address(), index); }
    /** @return the value of the {@code num_snap_widths} field. */
    @NativeType("FT_Byte")
    public byte num_snap_widths() { return nnum_snap_widths(address()); }
    /** @return the value of the {@code num_snap_heights} field. */
    @NativeType("FT_Byte")
    public byte num_snap_heights() { return nnum_snap_heights(address()); }
    /** @return the value of the {@code force_bold} field. */
    @NativeType("FT_Bool")
    public boolean force_bold() { return nforce_bold(address()); }
    /** @return the value of the {@code round_stem_up} field. */
    @NativeType("FT_Bool")
    public boolean round_stem_up() { return nround_stem_up(address()); }
    /** including std width */
    @NativeType("FT_Short[13]")
    public ShortBuffer snap_widths() { return nsnap_widths(address()); }
    /** including std width */
    @NativeType("FT_Short")
    public short snap_widths(int index) { return nsnap_widths(address(), index); }
    /** including std height */
    @NativeType("FT_Short[13]")
    public ShortBuffer snap_heights() { return nsnap_heights(address()); }
    /** including std height */
    @NativeType("FT_Short")
    public short snap_heights(int index) { return nsnap_heights(address(), index); }
    /** @return the value of the {@code expansion_factor} field. */
    @NativeType("FT_Fixed")
    public long expansion_factor() { return nexpansion_factor(address()); }
    /** @return the value of the {@code language_group} field. */
    @NativeType("FT_Long")
    public long language_group() { return nlanguage_group(address()); }
    /** @return the value of the {@code password} field. */
    @NativeType("FT_Long")
    public long password() { return npassword(address()); }
    /** @return a {@link ShortBuffer} view of the {@code min_feature} field. */
    @NativeType("FT_Short[2]")
    public ShortBuffer min_feature() { return nmin_feature(address()); }
    /** @return the value at the specified index of the {@code min_feature} field. */
    @NativeType("FT_Short")
    public short min_feature(int index) { return nmin_feature(address(), index); }

    // -----------------------------------

    /** Returns a new {@code PS_Private} instance for the specified memory address. */
    public static PS_Private create(long address) {
        return new PS_Private(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PS_Private createSafe(long address) {
        return address == NULL ? null : new PS_Private(address, null);
    }

    /**
     * Create a {@link PS_Private.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static PS_Private.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PS_Private.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #unique_id}. */
    public static int nunique_id(long struct) { return UNSAFE.getInt(null, struct + PS_Private.UNIQUE_ID); }
    /** Unsafe version of {@link #lenIV}. */
    public static int nlenIV(long struct) { return UNSAFE.getInt(null, struct + PS_Private.LENIV); }
    /** Unsafe version of {@link #num_blue_values}. */
    public static byte nnum_blue_values(long struct) { return UNSAFE.getByte(null, struct + PS_Private.NUM_BLUE_VALUES); }
    /** Unsafe version of {@link #num_other_blues}. */
    public static byte nnum_other_blues(long struct) { return UNSAFE.getByte(null, struct + PS_Private.NUM_OTHER_BLUES); }
    /** Unsafe version of {@link #num_family_blues}. */
    public static byte nnum_family_blues(long struct) { return UNSAFE.getByte(null, struct + PS_Private.NUM_FAMILY_BLUES); }
    /** Unsafe version of {@link #num_family_other_blues}. */
    public static byte nnum_family_other_blues(long struct) { return UNSAFE.getByte(null, struct + PS_Private.NUM_FAMILY_OTHER_BLUES); }
    /** Unsafe version of {@link #blue_values}. */
    public static ShortBuffer nblue_values(long struct) { return memShortBuffer(struct + PS_Private.BLUE_VALUES, 14); }
    /** Unsafe version of {@link #blue_values(int) blue_values}. */
    public static short nblue_values(long struct, int index) {
        return UNSAFE.getShort(null, struct + PS_Private.BLUE_VALUES + check(index, 14) * 2);
    }
    /** Unsafe version of {@link #other_blues}. */
    public static ShortBuffer nother_blues(long struct) { return memShortBuffer(struct + PS_Private.OTHER_BLUES, 10); }
    /** Unsafe version of {@link #other_blues(int) other_blues}. */
    public static short nother_blues(long struct, int index) {
        return UNSAFE.getShort(null, struct + PS_Private.OTHER_BLUES + check(index, 10) * 2);
    }
    /** Unsafe version of {@link #family_blues}. */
    public static ShortBuffer nfamily_blues(long struct) { return memShortBuffer(struct + PS_Private.FAMILY_BLUES, 14); }
    /** Unsafe version of {@link #family_blues(int) family_blues}. */
    public static short nfamily_blues(long struct, int index) {
        return UNSAFE.getShort(null, struct + PS_Private.FAMILY_BLUES + check(index, 14) * 2);
    }
    /** Unsafe version of {@link #family_other_blues}. */
    public static ShortBuffer nfamily_other_blues(long struct) { return memShortBuffer(struct + PS_Private.FAMILY_OTHER_BLUES, 10); }
    /** Unsafe version of {@link #family_other_blues(int) family_other_blues}. */
    public static short nfamily_other_blues(long struct, int index) {
        return UNSAFE.getShort(null, struct + PS_Private.FAMILY_OTHER_BLUES + check(index, 10) * 2);
    }
    /** Unsafe version of {@link #blue_scale}. */
    public static long nblue_scale(long struct) { return memGetCLong(struct + PS_Private.BLUE_SCALE); }
    /** Unsafe version of {@link #blue_shift}. */
    public static int nblue_shift(long struct) { return UNSAFE.getInt(null, struct + PS_Private.BLUE_SHIFT); }
    /** Unsafe version of {@link #blue_fuzz}. */
    public static int nblue_fuzz(long struct) { return UNSAFE.getInt(null, struct + PS_Private.BLUE_FUZZ); }
    /** Unsafe version of {@link #standard_width}. */
    public static ShortBuffer nstandard_width(long struct) { return memShortBuffer(struct + PS_Private.STANDARD_WIDTH, 1); }
    /** Unsafe version of {@link #standard_width(int) standard_width}. */
    public static short nstandard_width(long struct, int index) {
        return UNSAFE.getShort(null, struct + PS_Private.STANDARD_WIDTH + check(index, 1) * 2);
    }
    /** Unsafe version of {@link #standard_height}. */
    public static ShortBuffer nstandard_height(long struct) { return memShortBuffer(struct + PS_Private.STANDARD_HEIGHT, 1); }
    /** Unsafe version of {@link #standard_height(int) standard_height}. */
    public static short nstandard_height(long struct, int index) {
        return UNSAFE.getShort(null, struct + PS_Private.STANDARD_HEIGHT + check(index, 1) * 2);
    }
    /** Unsafe version of {@link #num_snap_widths}. */
    public static byte nnum_snap_widths(long struct) { return UNSAFE.getByte(null, struct + PS_Private.NUM_SNAP_WIDTHS); }
    /** Unsafe version of {@link #num_snap_heights}. */
    public static byte nnum_snap_heights(long struct) { return UNSAFE.getByte(null, struct + PS_Private.NUM_SNAP_HEIGHTS); }
    /** Unsafe version of {@link #force_bold}. */
    public static boolean nforce_bold(long struct) { return UNSAFE.getByte(null, struct + PS_Private.FORCE_BOLD) != 0; }
    /** Unsafe version of {@link #round_stem_up}. */
    public static boolean nround_stem_up(long struct) { return UNSAFE.getByte(null, struct + PS_Private.ROUND_STEM_UP) != 0; }
    /** Unsafe version of {@link #snap_widths}. */
    public static ShortBuffer nsnap_widths(long struct) { return memShortBuffer(struct + PS_Private.SNAP_WIDTHS, 13); }
    /** Unsafe version of {@link #snap_widths(int) snap_widths}. */
    public static short nsnap_widths(long struct, int index) {
        return UNSAFE.getShort(null, struct + PS_Private.SNAP_WIDTHS + check(index, 13) * 2);
    }
    /** Unsafe version of {@link #snap_heights}. */
    public static ShortBuffer nsnap_heights(long struct) { return memShortBuffer(struct + PS_Private.SNAP_HEIGHTS, 13); }
    /** Unsafe version of {@link #snap_heights(int) snap_heights}. */
    public static short nsnap_heights(long struct, int index) {
        return UNSAFE.getShort(null, struct + PS_Private.SNAP_HEIGHTS + check(index, 13) * 2);
    }
    /** Unsafe version of {@link #expansion_factor}. */
    public static long nexpansion_factor(long struct) { return memGetCLong(struct + PS_Private.EXPANSION_FACTOR); }
    /** Unsafe version of {@link #language_group}. */
    public static long nlanguage_group(long struct) { return memGetCLong(struct + PS_Private.LANGUAGE_GROUP); }
    /** Unsafe version of {@link #password}. */
    public static long npassword(long struct) { return memGetCLong(struct + PS_Private.PASSWORD); }
    /** Unsafe version of {@link #min_feature}. */
    public static ShortBuffer nmin_feature(long struct) { return memShortBuffer(struct + PS_Private.MIN_FEATURE, 2); }
    /** Unsafe version of {@link #min_feature(int) min_feature}. */
    public static short nmin_feature(long struct, int index) {
        return UNSAFE.getShort(null, struct + PS_Private.MIN_FEATURE + check(index, 2) * 2);
    }

    // -----------------------------------

    /** An array of {@link PS_Private} structs. */
    public static class Buffer extends StructBuffer<PS_Private, Buffer> {

        private static final PS_Private ELEMENT_FACTORY = PS_Private.create(-1L);

        /**
         * Creates a new {@code PS_Private.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link PS_Private#SIZEOF}, and its mark will be undefined.</p>
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
        protected PS_Private getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code unique_id} field. */
        @NativeType("FT_Int")
        public int unique_id() { return PS_Private.nunique_id(address()); }
        /** @return the value of the {@code lenIV} field. */
        @NativeType("FT_Int")
        public int lenIV() { return PS_Private.nlenIV(address()); }
        /** @return the value of the {@code num_blue_values} field. */
        @NativeType("FT_Byte")
        public byte num_blue_values() { return PS_Private.nnum_blue_values(address()); }
        /** @return the value of the {@code num_other_blues} field. */
        @NativeType("FT_Byte")
        public byte num_other_blues() { return PS_Private.nnum_other_blues(address()); }
        /** @return the value of the {@code num_family_blues} field. */
        @NativeType("FT_Byte")
        public byte num_family_blues() { return PS_Private.nnum_family_blues(address()); }
        /** @return the value of the {@code num_family_other_blues} field. */
        @NativeType("FT_Byte")
        public byte num_family_other_blues() { return PS_Private.nnum_family_other_blues(address()); }
        /** @return a {@link ShortBuffer} view of the {@code blue_values} field. */
        @NativeType("FT_Short[14]")
        public ShortBuffer blue_values() { return PS_Private.nblue_values(address()); }
        /** @return the value at the specified index of the {@code blue_values} field. */
        @NativeType("FT_Short")
        public short blue_values(int index) { return PS_Private.nblue_values(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code other_blues} field. */
        @NativeType("FT_Short[10]")
        public ShortBuffer other_blues() { return PS_Private.nother_blues(address()); }
        /** @return the value at the specified index of the {@code other_blues} field. */
        @NativeType("FT_Short")
        public short other_blues(int index) { return PS_Private.nother_blues(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code family_blues} field. */
        @NativeType("FT_Short[14]")
        public ShortBuffer family_blues() { return PS_Private.nfamily_blues(address()); }
        /** @return the value at the specified index of the {@code family_blues} field. */
        @NativeType("FT_Short")
        public short family_blues(int index) { return PS_Private.nfamily_blues(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code family_other_blues} field. */
        @NativeType("FT_Short[10]")
        public ShortBuffer family_other_blues() { return PS_Private.nfamily_other_blues(address()); }
        /** @return the value at the specified index of the {@code family_other_blues} field. */
        @NativeType("FT_Short")
        public short family_other_blues(int index) { return PS_Private.nfamily_other_blues(address(), index); }
        /** @return the value of the {@code blue_scale} field. */
        @NativeType("FT_Fixed")
        public long blue_scale() { return PS_Private.nblue_scale(address()); }
        /** @return the value of the {@code blue_shift} field. */
        @NativeType("FT_Int")
        public int blue_shift() { return PS_Private.nblue_shift(address()); }
        /** @return the value of the {@code blue_fuzz} field. */
        @NativeType("FT_Int")
        public int blue_fuzz() { return PS_Private.nblue_fuzz(address()); }
        /** @return a {@link ShortBuffer} view of the {@code standard_width} field. */
        @NativeType("FT_UShort[1]")
        public ShortBuffer standard_width() { return PS_Private.nstandard_width(address()); }
        /** @return the value at the specified index of the {@code standard_width} field. */
        @NativeType("FT_UShort")
        public short standard_width(int index) { return PS_Private.nstandard_width(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code standard_height} field. */
        @NativeType("FT_UShort[1]")
        public ShortBuffer standard_height() { return PS_Private.nstandard_height(address()); }
        /** @return the value at the specified index of the {@code standard_height} field. */
        @NativeType("FT_UShort")
        public short standard_height(int index) { return PS_Private.nstandard_height(address(), index); }
        /** @return the value of the {@code num_snap_widths} field. */
        @NativeType("FT_Byte")
        public byte num_snap_widths() { return PS_Private.nnum_snap_widths(address()); }
        /** @return the value of the {@code num_snap_heights} field. */
        @NativeType("FT_Byte")
        public byte num_snap_heights() { return PS_Private.nnum_snap_heights(address()); }
        /** @return the value of the {@code force_bold} field. */
        @NativeType("FT_Bool")
        public boolean force_bold() { return PS_Private.nforce_bold(address()); }
        /** @return the value of the {@code round_stem_up} field. */
        @NativeType("FT_Bool")
        public boolean round_stem_up() { return PS_Private.nround_stem_up(address()); }
        /** @return a {@link ShortBuffer} view of the {@link PS_Private#snap_widths} field. */
        @NativeType("FT_Short[13]")
        public ShortBuffer snap_widths() { return PS_Private.nsnap_widths(address()); }
        /** @return the value at the specified index of the {@link PS_Private#snap_widths} field. */
        @NativeType("FT_Short")
        public short snap_widths(int index) { return PS_Private.nsnap_widths(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@link PS_Private#snap_heights} field. */
        @NativeType("FT_Short[13]")
        public ShortBuffer snap_heights() { return PS_Private.nsnap_heights(address()); }
        /** @return the value at the specified index of the {@link PS_Private#snap_heights} field. */
        @NativeType("FT_Short")
        public short snap_heights(int index) { return PS_Private.nsnap_heights(address(), index); }
        /** @return the value of the {@code expansion_factor} field. */
        @NativeType("FT_Fixed")
        public long expansion_factor() { return PS_Private.nexpansion_factor(address()); }
        /** @return the value of the {@code language_group} field. */
        @NativeType("FT_Long")
        public long language_group() { return PS_Private.nlanguage_group(address()); }
        /** @return the value of the {@code password} field. */
        @NativeType("FT_Long")
        public long password() { return PS_Private.npassword(address()); }
        /** @return a {@link ShortBuffer} view of the {@code min_feature} field. */
        @NativeType("FT_Short[2]")
        public ShortBuffer min_feature() { return PS_Private.nmin_feature(address()); }
        /** @return the value at the specified index of the {@code min_feature} field. */
        @NativeType("FT_Short")
        public short min_feature(int index) { return PS_Private.nmin_feature(address(), index); }

    }

}