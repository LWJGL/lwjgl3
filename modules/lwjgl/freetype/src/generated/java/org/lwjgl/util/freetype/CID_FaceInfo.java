/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure used to represent CID Face information.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CID_FaceInfoRec {
 *     FT_String * cid_font_name;
 *     FT_Fixed cid_version;
 *     FT_Int cid_font_type;
 *     FT_String * registry;
 *     FT_String * ordering;
 *     FT_Int supplement;
 *     {@link PS_FontInfo PS_FontInfoRec} font_info;
 *     {@link FT_BBox FT_BBox} font_bbox;
 *     FT_ULong uid_base;
 *     FT_Int num_xuid;
 *     FT_ULong xuid[16];
 *     FT_ULong cidmap_offset;
 *     FT_UInt fd_bytes;
 *     FT_UInt gd_bytes;
 *     FT_ULong cid_count;
 *     FT_UInt num_dicts;
 *     {@link CID_FaceDict CID_FaceDict} font_dicts;
 *     FT_ULong data_offset;
 * }</code></pre>
 */
@NativeType("struct CID_FaceInfoRec")
public class CID_FaceInfo extends Struct<CID_FaceInfo> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CID_FONT_NAME,
        CID_VERSION,
        CID_FONT_TYPE,
        REGISTRY,
        ORDERING,
        SUPPLEMENT,
        FONT_INFO,
        FONT_BBOX,
        UID_BASE,
        NUM_XUID,
        XUID,
        CIDMAP_OFFSET,
        FD_BYTES,
        GD_BYTES,
        CID_COUNT,
        NUM_DICTS,
        FONT_DICTS,
        DATA_OFFSET;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(PS_FontInfo.SIZEOF, PS_FontInfo.ALIGNOF),
            __member(FT_BBox.SIZEOF, FT_BBox.ALIGNOF),
            __member(CLONG_SIZE),
            __member(4),
            __array(CLONG_SIZE, 16),
            __member(CLONG_SIZE),
            __member(4),
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CID_FONT_NAME = layout.offsetof(0);
        CID_VERSION = layout.offsetof(1);
        CID_FONT_TYPE = layout.offsetof(2);
        REGISTRY = layout.offsetof(3);
        ORDERING = layout.offsetof(4);
        SUPPLEMENT = layout.offsetof(5);
        FONT_INFO = layout.offsetof(6);
        FONT_BBOX = layout.offsetof(7);
        UID_BASE = layout.offsetof(8);
        NUM_XUID = layout.offsetof(9);
        XUID = layout.offsetof(10);
        CIDMAP_OFFSET = layout.offsetof(11);
        FD_BYTES = layout.offsetof(12);
        GD_BYTES = layout.offsetof(13);
        CID_COUNT = layout.offsetof(14);
        NUM_DICTS = layout.offsetof(15);
        FONT_DICTS = layout.offsetof(16);
        DATA_OFFSET = layout.offsetof(17);
    }

    protected CID_FaceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CID_FaceInfo create(long address, @Nullable ByteBuffer container) {
        return new CID_FaceInfo(address, container);
    }

    /**
     * Creates a {@code CID_FaceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CID_FaceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code cid_font_name} field. */
    @NativeType("FT_String *")
    public ByteBuffer cid_font_name() { return ncid_font_name(address()); }
    /** @return the null-terminated string pointed to by the {@code cid_font_name} field. */
    @NativeType("FT_String *")
    public String cid_font_nameString() { return ncid_font_nameString(address()); }
    /** @return the value of the {@code cid_version} field. */
    @NativeType("FT_Fixed")
    public long cid_version() { return ncid_version(address()); }
    /** @return the value of the {@code cid_font_type} field. */
    @NativeType("FT_Int")
    public int cid_font_type() { return ncid_font_type(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code registry} field. */
    @NativeType("FT_String *")
    public ByteBuffer registry() { return nregistry(address()); }
    /** @return the null-terminated string pointed to by the {@code registry} field. */
    @NativeType("FT_String *")
    public String registryString() { return nregistryString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code ordering} field. */
    @NativeType("FT_String *")
    public ByteBuffer ordering() { return nordering(address()); }
    /** @return the null-terminated string pointed to by the {@code ordering} field. */
    @NativeType("FT_String *")
    public String orderingString() { return norderingString(address()); }
    /** @return the value of the {@code supplement} field. */
    @NativeType("FT_Int")
    public int supplement() { return nsupplement(address()); }
    /** @return a {@link PS_FontInfo} view of the {@code font_info} field. */
    @NativeType("PS_FontInfoRec")
    public PS_FontInfo font_info() { return nfont_info(address()); }
    /** @return a {@link FT_BBox} view of the {@code font_bbox} field. */
    public FT_BBox font_bbox() { return nfont_bbox(address()); }
    /** @return the value of the {@code uid_base} field. */
    @NativeType("FT_ULong")
    public long uid_base() { return nuid_base(address()); }
    /** @return the value of the {@code num_xuid} field. */
    @NativeType("FT_Int")
    public int num_xuid() { return nnum_xuid(address()); }
    /** @return a {@link CLongBuffer} view of the {@code xuid} field. */
    @NativeType("FT_ULong[16]")
    public CLongBuffer xuid() { return nxuid(address()); }
    /** @return the value at the specified index of the {@code xuid} field. */
    @NativeType("FT_ULong")
    public long xuid(int index) { return nxuid(address(), index); }
    /** @return the value of the {@code cidmap_offset} field. */
    @NativeType("FT_ULong")
    public long cidmap_offset() { return ncidmap_offset(address()); }
    /** @return the value of the {@code fd_bytes} field. */
    @NativeType("FT_UInt")
    public int fd_bytes() { return nfd_bytes(address()); }
    /** @return the value of the {@code gd_bytes} field. */
    @NativeType("FT_UInt")
    public int gd_bytes() { return ngd_bytes(address()); }
    /** @return the value of the {@code cid_count} field. */
    @NativeType("FT_ULong")
    public long cid_count() { return ncid_count(address()); }
    /** @return the value of the {@code num_dicts} field. */
    @NativeType("FT_UInt")
    public int num_dicts() { return nnum_dicts(address()); }
    /** @return a {@link CID_FaceDict} view of the struct pointed to by the {@code font_dicts} field. */
    public CID_FaceDict font_dicts() { return nfont_dicts(address()); }
    /** @return the value of the {@code data_offset} field. */
    @NativeType("FT_ULong")
    public long data_offset() { return ndata_offset(address()); }

    // -----------------------------------

    /** Returns a new {@code CID_FaceInfo} instance for the specified memory address. */
    public static CID_FaceInfo create(long address) {
        return new CID_FaceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CID_FaceInfo createSafe(long address) {
        return address == NULL ? null : new CID_FaceInfo(address, null);
    }

    /**
     * Create a {@link CID_FaceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CID_FaceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CID_FaceInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cid_font_name}. */
    public static ByteBuffer ncid_font_name(long struct) { return memByteBufferNT1(memGetAddress(struct + CID_FaceInfo.CID_FONT_NAME)); }
    /** Unsafe version of {@link #cid_font_nameString}. */
    public static String ncid_font_nameString(long struct) { return memUTF8(memGetAddress(struct + CID_FaceInfo.CID_FONT_NAME)); }
    /** Unsafe version of {@link #cid_version}. */
    public static long ncid_version(long struct) { return memGetCLong(struct + CID_FaceInfo.CID_VERSION); }
    /** Unsafe version of {@link #cid_font_type}. */
    public static int ncid_font_type(long struct) { return UNSAFE.getInt(null, struct + CID_FaceInfo.CID_FONT_TYPE); }
    /** Unsafe version of {@link #registry}. */
    public static ByteBuffer nregistry(long struct) { return memByteBufferNT1(memGetAddress(struct + CID_FaceInfo.REGISTRY)); }
    /** Unsafe version of {@link #registryString}. */
    public static String nregistryString(long struct) { return memUTF8(memGetAddress(struct + CID_FaceInfo.REGISTRY)); }
    /** Unsafe version of {@link #ordering}. */
    public static ByteBuffer nordering(long struct) { return memByteBufferNT1(memGetAddress(struct + CID_FaceInfo.ORDERING)); }
    /** Unsafe version of {@link #orderingString}. */
    public static String norderingString(long struct) { return memUTF8(memGetAddress(struct + CID_FaceInfo.ORDERING)); }
    /** Unsafe version of {@link #supplement}. */
    public static int nsupplement(long struct) { return UNSAFE.getInt(null, struct + CID_FaceInfo.SUPPLEMENT); }
    /** Unsafe version of {@link #font_info}. */
    public static PS_FontInfo nfont_info(long struct) { return PS_FontInfo.create(struct + CID_FaceInfo.FONT_INFO); }
    /** Unsafe version of {@link #font_bbox}. */
    public static FT_BBox nfont_bbox(long struct) { return FT_BBox.create(struct + CID_FaceInfo.FONT_BBOX); }
    /** Unsafe version of {@link #uid_base}. */
    public static long nuid_base(long struct) { return memGetCLong(struct + CID_FaceInfo.UID_BASE); }
    /** Unsafe version of {@link #num_xuid}. */
    public static int nnum_xuid(long struct) { return UNSAFE.getInt(null, struct + CID_FaceInfo.NUM_XUID); }
    /** Unsafe version of {@link #xuid}. */
    public static CLongBuffer nxuid(long struct) { return memCLongBuffer(struct + CID_FaceInfo.XUID, 16); }
    /** Unsafe version of {@link #xuid(int) xuid}. */
    public static long nxuid(long struct, int index) {
        return memGetCLong(struct + CID_FaceInfo.XUID + check(index, 16) * CLONG_SIZE);
    }
    /** Unsafe version of {@link #cidmap_offset}. */
    public static long ncidmap_offset(long struct) { return memGetCLong(struct + CID_FaceInfo.CIDMAP_OFFSET); }
    /** Unsafe version of {@link #fd_bytes}. */
    public static int nfd_bytes(long struct) { return UNSAFE.getInt(null, struct + CID_FaceInfo.FD_BYTES); }
    /** Unsafe version of {@link #gd_bytes}. */
    public static int ngd_bytes(long struct) { return UNSAFE.getInt(null, struct + CID_FaceInfo.GD_BYTES); }
    /** Unsafe version of {@link #cid_count}. */
    public static long ncid_count(long struct) { return memGetCLong(struct + CID_FaceInfo.CID_COUNT); }
    /** Unsafe version of {@link #num_dicts}. */
    public static int nnum_dicts(long struct) { return UNSAFE.getInt(null, struct + CID_FaceInfo.NUM_DICTS); }
    /** Unsafe version of {@link #font_dicts}. */
    public static CID_FaceDict nfont_dicts(long struct) { return CID_FaceDict.create(memGetAddress(struct + CID_FaceInfo.FONT_DICTS)); }
    /** Unsafe version of {@link #data_offset}. */
    public static long ndata_offset(long struct) { return memGetCLong(struct + CID_FaceInfo.DATA_OFFSET); }

    // -----------------------------------

    /** An array of {@link CID_FaceInfo} structs. */
    public static class Buffer extends StructBuffer<CID_FaceInfo, Buffer> {

        private static final CID_FaceInfo ELEMENT_FACTORY = CID_FaceInfo.create(-1L);

        /**
         * Creates a new {@code CID_FaceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CID_FaceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected CID_FaceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code cid_font_name} field. */
        @NativeType("FT_String *")
        public ByteBuffer cid_font_name() { return CID_FaceInfo.ncid_font_name(address()); }
        /** @return the null-terminated string pointed to by the {@code cid_font_name} field. */
        @NativeType("FT_String *")
        public String cid_font_nameString() { return CID_FaceInfo.ncid_font_nameString(address()); }
        /** @return the value of the {@code cid_version} field. */
        @NativeType("FT_Fixed")
        public long cid_version() { return CID_FaceInfo.ncid_version(address()); }
        /** @return the value of the {@code cid_font_type} field. */
        @NativeType("FT_Int")
        public int cid_font_type() { return CID_FaceInfo.ncid_font_type(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code registry} field. */
        @NativeType("FT_String *")
        public ByteBuffer registry() { return CID_FaceInfo.nregistry(address()); }
        /** @return the null-terminated string pointed to by the {@code registry} field. */
        @NativeType("FT_String *")
        public String registryString() { return CID_FaceInfo.nregistryString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code ordering} field. */
        @NativeType("FT_String *")
        public ByteBuffer ordering() { return CID_FaceInfo.nordering(address()); }
        /** @return the null-terminated string pointed to by the {@code ordering} field. */
        @NativeType("FT_String *")
        public String orderingString() { return CID_FaceInfo.norderingString(address()); }
        /** @return the value of the {@code supplement} field. */
        @NativeType("FT_Int")
        public int supplement() { return CID_FaceInfo.nsupplement(address()); }
        /** @return a {@link PS_FontInfo} view of the {@code font_info} field. */
        @NativeType("PS_FontInfoRec")
        public PS_FontInfo font_info() { return CID_FaceInfo.nfont_info(address()); }
        /** @return a {@link FT_BBox} view of the {@code font_bbox} field. */
        public FT_BBox font_bbox() { return CID_FaceInfo.nfont_bbox(address()); }
        /** @return the value of the {@code uid_base} field. */
        @NativeType("FT_ULong")
        public long uid_base() { return CID_FaceInfo.nuid_base(address()); }
        /** @return the value of the {@code num_xuid} field. */
        @NativeType("FT_Int")
        public int num_xuid() { return CID_FaceInfo.nnum_xuid(address()); }
        /** @return a {@link CLongBuffer} view of the {@code xuid} field. */
        @NativeType("FT_ULong[16]")
        public CLongBuffer xuid() { return CID_FaceInfo.nxuid(address()); }
        /** @return the value at the specified index of the {@code xuid} field. */
        @NativeType("FT_ULong")
        public long xuid(int index) { return CID_FaceInfo.nxuid(address(), index); }
        /** @return the value of the {@code cidmap_offset} field. */
        @NativeType("FT_ULong")
        public long cidmap_offset() { return CID_FaceInfo.ncidmap_offset(address()); }
        /** @return the value of the {@code fd_bytes} field. */
        @NativeType("FT_UInt")
        public int fd_bytes() { return CID_FaceInfo.nfd_bytes(address()); }
        /** @return the value of the {@code gd_bytes} field. */
        @NativeType("FT_UInt")
        public int gd_bytes() { return CID_FaceInfo.ngd_bytes(address()); }
        /** @return the value of the {@code cid_count} field. */
        @NativeType("FT_ULong")
        public long cid_count() { return CID_FaceInfo.ncid_count(address()); }
        /** @return the value of the {@code num_dicts} field. */
        @NativeType("FT_UInt")
        public int num_dicts() { return CID_FaceInfo.nnum_dicts(address()); }
        /** @return a {@link CID_FaceDict} view of the struct pointed to by the {@code font_dicts} field. */
        public CID_FaceDict font_dicts() { return CID_FaceInfo.nfont_dicts(address()); }
        /** @return the value of the {@code data_offset} field. */
        @NativeType("FT_ULong")
        public long data_offset() { return CID_FaceInfo.ndata_offset(address()); }

    }

}