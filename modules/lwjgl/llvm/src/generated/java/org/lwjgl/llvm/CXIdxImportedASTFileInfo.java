/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Data for IndexerCallbacks#importedASTFile.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXIdxImportedASTFileInfo {
 *     CXFile {@link #file};
 *     CXModule {@link #module};
 *     {@link CXIdxLoc CXIdxLoc} {@link #loc};
 *     int {@link #isImplicit};
 * }</code></pre>
 */
public class CXIdxImportedASTFileInfo extends Struct {

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

    /** top level AST file containing the imported PCH, module or submodule */
    @NativeType("CXFile")
    public long file() { return nfile(address()); }
    /** the imported module or {@code NULL} if the AST file is a PCH */
    @NativeType("CXModule")
    public long module() { return nmodule(address()); }
    /** location where the file is imported. Applicable only for modules */
    public CXIdxLoc loc() { return nloc(address()); }
    /** non-zero if an inclusion directive was automatically turned into a module import. Applicable only for modules */
    @NativeType("int")
    public boolean isImplicit() { return nisImplicit(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@code CXIdxImportedASTFileInfo} instance for the specified memory address. */
    public static CXIdxImportedASTFileInfo create(long address) {
        return wrap(CXIdxImportedASTFileInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxImportedASTFileInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxImportedASTFileInfo.class, address);
    }

    /**
     * Create a {@link CXIdxImportedASTFileInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxImportedASTFileInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxImportedASTFileInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #file}. */
    public static long nfile(long struct) { return memGetAddress(struct + CXIdxImportedASTFileInfo.FILE); }
    /** Unsafe version of {@link #module}. */
    public static long nmodule(long struct) { return memGetAddress(struct + CXIdxImportedASTFileInfo.MODULE); }
    /** Unsafe version of {@link #loc}. */
    public static CXIdxLoc nloc(long struct) { return CXIdxLoc.create(struct + CXIdxImportedASTFileInfo.LOC); }
    /** Unsafe version of {@link #isImplicit}. */
    public static int nisImplicit(long struct) { return UNSAFE.getInt(null, struct + CXIdxImportedASTFileInfo.ISIMPLICIT); }

    // -----------------------------------

    /** An array of {@link CXIdxImportedASTFileInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxImportedASTFileInfo, Buffer> {

        private static final CXIdxImportedASTFileInfo ELEMENT_FACTORY = CXIdxImportedASTFileInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxImportedASTFileInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxImportedASTFileInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxImportedASTFileInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CXIdxImportedASTFileInfo#file} field. */
        @NativeType("CXFile")
        public long file() { return CXIdxImportedASTFileInfo.nfile(address()); }
        /** @return the value of the {@link CXIdxImportedASTFileInfo#module} field. */
        @NativeType("CXModule")
        public long module() { return CXIdxImportedASTFileInfo.nmodule(address()); }
        /** @return a {@link CXIdxLoc} view of the {@link CXIdxImportedASTFileInfo#loc} field. */
        public CXIdxLoc loc() { return CXIdxImportedASTFileInfo.nloc(address()); }
        /** @return the value of the {@link CXIdxImportedASTFileInfo#isImplicit} field. */
        @NativeType("int")
        public boolean isImplicit() { return CXIdxImportedASTFileInfo.nisImplicit(address()) != 0; }

    }

}