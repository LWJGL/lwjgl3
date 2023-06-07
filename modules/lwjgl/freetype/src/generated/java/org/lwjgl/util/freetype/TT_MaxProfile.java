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
 * The maximum profile ({@code maxp}) table contains many max values, which can be used to pre-allocate arrays for speeding up glyph loading and hinting.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct TT_MaxProfile {
 *     FT_Fixed version;
 *     FT_UShort numGlyphs;
 *     FT_UShort maxPoints;
 *     FT_UShort maxContours;
 *     FT_UShort maxCompositePoints;
 *     FT_UShort maxCompositeContours;
 *     FT_UShort maxZones;
 *     FT_UShort maxTwilightPoints;
 *     FT_UShort maxStorage;
 *     FT_UShort maxFunctionDefs;
 *     FT_UShort maxInstructionDefs;
 *     FT_UShort maxStackElements;
 *     FT_UShort maxSizeOfInstructions;
 *     FT_UShort maxComponentElements;
 *     FT_UShort maxComponentDepth;
 * }</code></pre>
 */
public class TT_MaxProfile extends Struct<TT_MaxProfile> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        NUMGLYPHS,
        MAXPOINTS,
        MAXCONTOURS,
        MAXCOMPOSITEPOINTS,
        MAXCOMPOSITECONTOURS,
        MAXZONES,
        MAXTWILIGHTPOINTS,
        MAXSTORAGE,
        MAXFUNCTIONDEFS,
        MAXINSTRUCTIONDEFS,
        MAXSTACKELEMENTS,
        MAXSIZEOFINSTRUCTIONS,
        MAXCOMPONENTELEMENTS,
        MAXCOMPONENTDEPTH;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        NUMGLYPHS = layout.offsetof(1);
        MAXPOINTS = layout.offsetof(2);
        MAXCONTOURS = layout.offsetof(3);
        MAXCOMPOSITEPOINTS = layout.offsetof(4);
        MAXCOMPOSITECONTOURS = layout.offsetof(5);
        MAXZONES = layout.offsetof(6);
        MAXTWILIGHTPOINTS = layout.offsetof(7);
        MAXSTORAGE = layout.offsetof(8);
        MAXFUNCTIONDEFS = layout.offsetof(9);
        MAXINSTRUCTIONDEFS = layout.offsetof(10);
        MAXSTACKELEMENTS = layout.offsetof(11);
        MAXSIZEOFINSTRUCTIONS = layout.offsetof(12);
        MAXCOMPONENTELEMENTS = layout.offsetof(13);
        MAXCOMPONENTDEPTH = layout.offsetof(14);
    }

    protected TT_MaxProfile(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected TT_MaxProfile create(long address, @Nullable ByteBuffer container) {
        return new TT_MaxProfile(address, container);
    }

    /**
     * Creates a {@code TT_MaxProfile} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TT_MaxProfile(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code version} field. */
    @NativeType("FT_Fixed")
    public long version() { return nversion(address()); }
    /** @return the value of the {@code numGlyphs} field. */
    @NativeType("FT_UShort")
    public short numGlyphs() { return nnumGlyphs(address()); }
    /** @return the value of the {@code maxPoints} field. */
    @NativeType("FT_UShort")
    public short maxPoints() { return nmaxPoints(address()); }
    /** @return the value of the {@code maxContours} field. */
    @NativeType("FT_UShort")
    public short maxContours() { return nmaxContours(address()); }
    /** @return the value of the {@code maxCompositePoints} field. */
    @NativeType("FT_UShort")
    public short maxCompositePoints() { return nmaxCompositePoints(address()); }
    /** @return the value of the {@code maxCompositeContours} field. */
    @NativeType("FT_UShort")
    public short maxCompositeContours() { return nmaxCompositeContours(address()); }
    /** @return the value of the {@code maxZones} field. */
    @NativeType("FT_UShort")
    public short maxZones() { return nmaxZones(address()); }
    /** @return the value of the {@code maxTwilightPoints} field. */
    @NativeType("FT_UShort")
    public short maxTwilightPoints() { return nmaxTwilightPoints(address()); }
    /** @return the value of the {@code maxStorage} field. */
    @NativeType("FT_UShort")
    public short maxStorage() { return nmaxStorage(address()); }
    /** @return the value of the {@code maxFunctionDefs} field. */
    @NativeType("FT_UShort")
    public short maxFunctionDefs() { return nmaxFunctionDefs(address()); }
    /** @return the value of the {@code maxInstructionDefs} field. */
    @NativeType("FT_UShort")
    public short maxInstructionDefs() { return nmaxInstructionDefs(address()); }
    /** @return the value of the {@code maxStackElements} field. */
    @NativeType("FT_UShort")
    public short maxStackElements() { return nmaxStackElements(address()); }
    /** @return the value of the {@code maxSizeOfInstructions} field. */
    @NativeType("FT_UShort")
    public short maxSizeOfInstructions() { return nmaxSizeOfInstructions(address()); }
    /** @return the value of the {@code maxComponentElements} field. */
    @NativeType("FT_UShort")
    public short maxComponentElements() { return nmaxComponentElements(address()); }
    /** @return the value of the {@code maxComponentDepth} field. */
    @NativeType("FT_UShort")
    public short maxComponentDepth() { return nmaxComponentDepth(address()); }

    // -----------------------------------

    /** Returns a new {@code TT_MaxProfile} instance for the specified memory address. */
    public static TT_MaxProfile create(long address) {
        return new TT_MaxProfile(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_MaxProfile createSafe(long address) {
        return address == NULL ? null : new TT_MaxProfile(address, null);
    }

    /**
     * Create a {@link TT_MaxProfile.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TT_MaxProfile.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_MaxProfile.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static long nversion(long struct) { return memGetCLong(struct + TT_MaxProfile.VERSION); }
    /** Unsafe version of {@link #numGlyphs}. */
    public static short nnumGlyphs(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.NUMGLYPHS); }
    /** Unsafe version of {@link #maxPoints}. */
    public static short nmaxPoints(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXPOINTS); }
    /** Unsafe version of {@link #maxContours}. */
    public static short nmaxContours(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXCONTOURS); }
    /** Unsafe version of {@link #maxCompositePoints}. */
    public static short nmaxCompositePoints(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXCOMPOSITEPOINTS); }
    /** Unsafe version of {@link #maxCompositeContours}. */
    public static short nmaxCompositeContours(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXCOMPOSITECONTOURS); }
    /** Unsafe version of {@link #maxZones}. */
    public static short nmaxZones(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXZONES); }
    /** Unsafe version of {@link #maxTwilightPoints}. */
    public static short nmaxTwilightPoints(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXTWILIGHTPOINTS); }
    /** Unsafe version of {@link #maxStorage}. */
    public static short nmaxStorage(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXSTORAGE); }
    /** Unsafe version of {@link #maxFunctionDefs}. */
    public static short nmaxFunctionDefs(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXFUNCTIONDEFS); }
    /** Unsafe version of {@link #maxInstructionDefs}. */
    public static short nmaxInstructionDefs(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXINSTRUCTIONDEFS); }
    /** Unsafe version of {@link #maxStackElements}. */
    public static short nmaxStackElements(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXSTACKELEMENTS); }
    /** Unsafe version of {@link #maxSizeOfInstructions}. */
    public static short nmaxSizeOfInstructions(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXSIZEOFINSTRUCTIONS); }
    /** Unsafe version of {@link #maxComponentElements}. */
    public static short nmaxComponentElements(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXCOMPONENTELEMENTS); }
    /** Unsafe version of {@link #maxComponentDepth}. */
    public static short nmaxComponentDepth(long struct) { return UNSAFE.getShort(null, struct + TT_MaxProfile.MAXCOMPONENTDEPTH); }

    // -----------------------------------

    /** An array of {@link TT_MaxProfile} structs. */
    public static class Buffer extends StructBuffer<TT_MaxProfile, Buffer> {

        private static final TT_MaxProfile ELEMENT_FACTORY = TT_MaxProfile.create(-1L);

        /**
         * Creates a new {@code TT_MaxProfile.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TT_MaxProfile#SIZEOF}, and its mark will be undefined.</p>
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
        protected TT_MaxProfile getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code version} field. */
        @NativeType("FT_Fixed")
        public long version() { return TT_MaxProfile.nversion(address()); }
        /** @return the value of the {@code numGlyphs} field. */
        @NativeType("FT_UShort")
        public short numGlyphs() { return TT_MaxProfile.nnumGlyphs(address()); }
        /** @return the value of the {@code maxPoints} field. */
        @NativeType("FT_UShort")
        public short maxPoints() { return TT_MaxProfile.nmaxPoints(address()); }
        /** @return the value of the {@code maxContours} field. */
        @NativeType("FT_UShort")
        public short maxContours() { return TT_MaxProfile.nmaxContours(address()); }
        /** @return the value of the {@code maxCompositePoints} field. */
        @NativeType("FT_UShort")
        public short maxCompositePoints() { return TT_MaxProfile.nmaxCompositePoints(address()); }
        /** @return the value of the {@code maxCompositeContours} field. */
        @NativeType("FT_UShort")
        public short maxCompositeContours() { return TT_MaxProfile.nmaxCompositeContours(address()); }
        /** @return the value of the {@code maxZones} field. */
        @NativeType("FT_UShort")
        public short maxZones() { return TT_MaxProfile.nmaxZones(address()); }
        /** @return the value of the {@code maxTwilightPoints} field. */
        @NativeType("FT_UShort")
        public short maxTwilightPoints() { return TT_MaxProfile.nmaxTwilightPoints(address()); }
        /** @return the value of the {@code maxStorage} field. */
        @NativeType("FT_UShort")
        public short maxStorage() { return TT_MaxProfile.nmaxStorage(address()); }
        /** @return the value of the {@code maxFunctionDefs} field. */
        @NativeType("FT_UShort")
        public short maxFunctionDefs() { return TT_MaxProfile.nmaxFunctionDefs(address()); }
        /** @return the value of the {@code maxInstructionDefs} field. */
        @NativeType("FT_UShort")
        public short maxInstructionDefs() { return TT_MaxProfile.nmaxInstructionDefs(address()); }
        /** @return the value of the {@code maxStackElements} field. */
        @NativeType("FT_UShort")
        public short maxStackElements() { return TT_MaxProfile.nmaxStackElements(address()); }
        /** @return the value of the {@code maxSizeOfInstructions} field. */
        @NativeType("FT_UShort")
        public short maxSizeOfInstructions() { return TT_MaxProfile.nmaxSizeOfInstructions(address()); }
        /** @return the value of the {@code maxComponentElements} field. */
        @NativeType("FT_UShort")
        public short maxComponentElements() { return TT_MaxProfile.nmaxComponentElements(address()); }
        /** @return the value of the {@code maxComponentDepth} field. */
        @NativeType("FT_UShort")
        public short maxComponentDepth() { return TT_MaxProfile.nmaxComponentDepth(address()); }

    }

}