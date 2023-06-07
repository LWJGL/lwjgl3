/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure used to model a Type~1 or Type~2 FontInfo dictionary. Note that for Multiple Master fonts, each instance has its own FontInfo dictionary.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct PS_FontInfoRec {
 *     FT_String * version;
 *     FT_String * notice;
 *     FT_String * full_name;
 *     FT_String * family_name;
 *     FT_String * weight;
 *     FT_Long italic_angle;
 *     FT_Bool is_fixed_pitch;
 *     FT_Short underline_position;
 *     FT_UShort underline_thickness;
 * }</code></pre>
 */
@NativeType("struct PS_FontInfoRec")
public class PS_FontInfo extends Struct<PS_FontInfo> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        NOTICE,
        FULL_NAME,
        FAMILY_NAME,
        WEIGHT,
        ITALIC_ANGLE,
        IS_FIXED_PITCH,
        UNDERLINE_POSITION,
        UNDERLINE_THICKNESS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(1),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        NOTICE = layout.offsetof(1);
        FULL_NAME = layout.offsetof(2);
        FAMILY_NAME = layout.offsetof(3);
        WEIGHT = layout.offsetof(4);
        ITALIC_ANGLE = layout.offsetof(5);
        IS_FIXED_PITCH = layout.offsetof(6);
        UNDERLINE_POSITION = layout.offsetof(7);
        UNDERLINE_THICKNESS = layout.offsetof(8);
    }

    protected PS_FontInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected PS_FontInfo create(long address, @Nullable ByteBuffer container) {
        return new PS_FontInfo(address, container);
    }

    /**
     * Creates a {@code PS_FontInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public PS_FontInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code version} field. */
    @NativeType("FT_String *")
    public ByteBuffer version() { return nversion(address()); }
    /** @return the null-terminated string pointed to by the {@code version} field. */
    @NativeType("FT_String *")
    public String versionString() { return nversionString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code notice} field. */
    @NativeType("FT_String *")
    public ByteBuffer notice() { return nnotice(address()); }
    /** @return the null-terminated string pointed to by the {@code notice} field. */
    @NativeType("FT_String *")
    public String noticeString() { return nnoticeString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code full_name} field. */
    @NativeType("FT_String *")
    public ByteBuffer full_name() { return nfull_name(address()); }
    /** @return the null-terminated string pointed to by the {@code full_name} field. */
    @NativeType("FT_String *")
    public String full_nameString() { return nfull_nameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code family_name} field. */
    @NativeType("FT_String *")
    public ByteBuffer family_name() { return nfamily_name(address()); }
    /** @return the null-terminated string pointed to by the {@code family_name} field. */
    @NativeType("FT_String *")
    public String family_nameString() { return nfamily_nameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code weight} field. */
    @NativeType("FT_String *")
    public ByteBuffer weight() { return nweight(address()); }
    /** @return the null-terminated string pointed to by the {@code weight} field. */
    @NativeType("FT_String *")
    public String weightString() { return nweightString(address()); }
    /** @return the value of the {@code italic_angle} field. */
    @NativeType("FT_Long")
    public long italic_angle() { return nitalic_angle(address()); }
    /** @return the value of the {@code is_fixed_pitch} field. */
    @NativeType("FT_Bool")
    public boolean is_fixed_pitch() { return nis_fixed_pitch(address()); }
    /** @return the value of the {@code underline_position} field. */
    @NativeType("FT_Short")
    public short underline_position() { return nunderline_position(address()); }
    /** @return the value of the {@code underline_thickness} field. */
    @NativeType("FT_UShort")
    public short underline_thickness() { return nunderline_thickness(address()); }

    // -----------------------------------

    /** Returns a new {@code PS_FontInfo} instance for the specified memory address. */
    public static PS_FontInfo create(long address) {
        return new PS_FontInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PS_FontInfo createSafe(long address) {
        return address == NULL ? null : new PS_FontInfo(address, null);
    }

    /**
     * Create a {@link PS_FontInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static PS_FontInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PS_FontInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static ByteBuffer nversion(long struct) { return memByteBufferNT1(memGetAddress(struct + PS_FontInfo.VERSION)); }
    /** Unsafe version of {@link #versionString}. */
    public static String nversionString(long struct) { return memUTF8(memGetAddress(struct + PS_FontInfo.VERSION)); }
    /** Unsafe version of {@link #notice}. */
    public static ByteBuffer nnotice(long struct) { return memByteBufferNT1(memGetAddress(struct + PS_FontInfo.NOTICE)); }
    /** Unsafe version of {@link #noticeString}. */
    public static String nnoticeString(long struct) { return memUTF8(memGetAddress(struct + PS_FontInfo.NOTICE)); }
    /** Unsafe version of {@link #full_name}. */
    public static ByteBuffer nfull_name(long struct) { return memByteBufferNT1(memGetAddress(struct + PS_FontInfo.FULL_NAME)); }
    /** Unsafe version of {@link #full_nameString}. */
    public static String nfull_nameString(long struct) { return memUTF8(memGetAddress(struct + PS_FontInfo.FULL_NAME)); }
    /** Unsafe version of {@link #family_name}. */
    public static ByteBuffer nfamily_name(long struct) { return memByteBufferNT1(memGetAddress(struct + PS_FontInfo.FAMILY_NAME)); }
    /** Unsafe version of {@link #family_nameString}. */
    public static String nfamily_nameString(long struct) { return memUTF8(memGetAddress(struct + PS_FontInfo.FAMILY_NAME)); }
    /** Unsafe version of {@link #weight}. */
    public static ByteBuffer nweight(long struct) { return memByteBufferNT1(memGetAddress(struct + PS_FontInfo.WEIGHT)); }
    /** Unsafe version of {@link #weightString}. */
    public static String nweightString(long struct) { return memUTF8(memGetAddress(struct + PS_FontInfo.WEIGHT)); }
    /** Unsafe version of {@link #italic_angle}. */
    public static long nitalic_angle(long struct) { return memGetCLong(struct + PS_FontInfo.ITALIC_ANGLE); }
    /** Unsafe version of {@link #is_fixed_pitch}. */
    public static boolean nis_fixed_pitch(long struct) { return UNSAFE.getByte(null, struct + PS_FontInfo.IS_FIXED_PITCH) != 0; }
    /** Unsafe version of {@link #underline_position}. */
    public static short nunderline_position(long struct) { return UNSAFE.getShort(null, struct + PS_FontInfo.UNDERLINE_POSITION); }
    /** Unsafe version of {@link #underline_thickness}. */
    public static short nunderline_thickness(long struct) { return UNSAFE.getShort(null, struct + PS_FontInfo.UNDERLINE_THICKNESS); }

    // -----------------------------------

    /** An array of {@link PS_FontInfo} structs. */
    public static class Buffer extends StructBuffer<PS_FontInfo, Buffer> {

        private static final PS_FontInfo ELEMENT_FACTORY = PS_FontInfo.create(-1L);

        /**
         * Creates a new {@code PS_FontInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link PS_FontInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected PS_FontInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code version} field. */
        @NativeType("FT_String *")
        public ByteBuffer version() { return PS_FontInfo.nversion(address()); }
        /** @return the null-terminated string pointed to by the {@code version} field. */
        @NativeType("FT_String *")
        public String versionString() { return PS_FontInfo.nversionString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code notice} field. */
        @NativeType("FT_String *")
        public ByteBuffer notice() { return PS_FontInfo.nnotice(address()); }
        /** @return the null-terminated string pointed to by the {@code notice} field. */
        @NativeType("FT_String *")
        public String noticeString() { return PS_FontInfo.nnoticeString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code full_name} field. */
        @NativeType("FT_String *")
        public ByteBuffer full_name() { return PS_FontInfo.nfull_name(address()); }
        /** @return the null-terminated string pointed to by the {@code full_name} field. */
        @NativeType("FT_String *")
        public String full_nameString() { return PS_FontInfo.nfull_nameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code family_name} field. */
        @NativeType("FT_String *")
        public ByteBuffer family_name() { return PS_FontInfo.nfamily_name(address()); }
        /** @return the null-terminated string pointed to by the {@code family_name} field. */
        @NativeType("FT_String *")
        public String family_nameString() { return PS_FontInfo.nfamily_nameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code weight} field. */
        @NativeType("FT_String *")
        public ByteBuffer weight() { return PS_FontInfo.nweight(address()); }
        /** @return the null-terminated string pointed to by the {@code weight} field. */
        @NativeType("FT_String *")
        public String weightString() { return PS_FontInfo.nweightString(address()); }
        /** @return the value of the {@code italic_angle} field. */
        @NativeType("FT_Long")
        public long italic_angle() { return PS_FontInfo.nitalic_angle(address()); }
        /** @return the value of the {@code is_fixed_pitch} field. */
        @NativeType("FT_Bool")
        public boolean is_fixed_pitch() { return PS_FontInfo.nis_fixed_pitch(address()); }
        /** @return the value of the {@code underline_position} field. */
        @NativeType("FT_Short")
        public short underline_position() { return PS_FontInfo.nunderline_position(address()); }
        /** @return the value of the {@code underline_thickness} field. */
        @NativeType("FT_UShort")
        public short underline_thickness() { return PS_FontInfo.nunderline_thickness(address()); }

    }

}