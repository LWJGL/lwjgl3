/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct CXIdxImportedASTFileInfo {
 *     CXFile file;
 *     CXModule module;
 *     {@link CXIdxLoc CXIdxLoc} loc;
 *     int isImplicit;
 * }}</pre>
 */
public class CXIdxImportedASTFileInfo extends Struct<CXIdxImportedASTFileInfo> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FILE,
        MODULE,
        LOC,
        ISIMPLICIT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(CXIdxLoc.SIZEOF, CXIdxLoc.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FILE = layout.offsetof(0);
        MODULE = layout.offsetof(1);
        LOC = layout.offsetof(2);
        ISIMPLICIT = layout.offsetof(3);
    }

    protected CXIdxImportedASTFileInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CXIdxImportedASTFileInfo create(long address, @Nullable ByteBuffer container) {
        return new CXIdxImportedASTFileInfo(address, container);
    }

    /**
     * Creates a {@code CXIdxImportedASTFileInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxImportedASTFileInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code file} field. */
    @NativeType("CXFile")
    public long file() { return nfile(address()); }
    /** @return the value of the {@code module} field. */
    @NativeType("CXModule")
    public long module() { return nmodule(address()); }
    /** @return a {@link CXIdxLoc} view of the {@code loc} field. */
    public CXIdxLoc loc() { return nloc(address()); }
    /** @return the value of the {@code isImplicit} field. */
    @NativeType("int")
    public boolean isImplicit() { return nisImplicit(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@code CXIdxImportedASTFileInfo} instance for the specified memory address. */
    public static CXIdxImportedASTFileInfo create(long address) {
        return new CXIdxImportedASTFileInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CXIdxImportedASTFileInfo createSafe(long address) {
        return address == NULL ? null : new CXIdxImportedASTFileInfo(address, null);
    }

    /**
     * Create a {@link CXIdxImportedASTFileInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxImportedASTFileInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CXIdxImportedASTFileInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #file}. */
    public static long nfile(long struct) { return memGetAddress(struct + CXIdxImportedASTFileInfo.FILE); }
    /** Unsafe version of {@link #module}. */
    public static long nmodule(long struct) { return memGetAddress(struct + CXIdxImportedASTFileInfo.MODULE); }
    /** Unsafe version of {@link #loc}. */
    public static CXIdxLoc nloc(long struct) { return CXIdxLoc.create(struct + CXIdxImportedASTFileInfo.LOC); }
    /** Unsafe version of {@link #isImplicit}. */
    public static int nisImplicit(long struct) { return memGetInt(struct + CXIdxImportedASTFileInfo.ISIMPLICIT); }

    // -----------------------------------

    /** An array of {@link CXIdxImportedASTFileInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxImportedASTFileInfo, Buffer> {

        private static final CXIdxImportedASTFileInfo ELEMENT_FACTORY = CXIdxImportedASTFileInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxImportedASTFileInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxImportedASTFileInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected CXIdxImportedASTFileInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code file} field. */
        @NativeType("CXFile")
        public long file() { return CXIdxImportedASTFileInfo.nfile(address()); }
        /** @return the value of the {@code module} field. */
        @NativeType("CXModule")
        public long module() { return CXIdxImportedASTFileInfo.nmodule(address()); }
        /** @return a {@link CXIdxLoc} view of the {@code loc} field. */
        public CXIdxLoc loc() { return CXIdxImportedASTFileInfo.nloc(address()); }
        /** @return the value of the {@code isImplicit} field. */
        @NativeType("int")
        public boolean isImplicit() { return CXIdxImportedASTFileInfo.nisImplicit(address()) != 0; }

    }

}