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
 * Data for {@code ppIncludedFile} callback.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXIdxIncludedFileInfo {
 *     {@link CXIdxLoc CXIdxLoc} {@link #hashLoc};
 *     char const * {@link #filename};
 *     CXFile {@link #file};
 *     int isImport;
 *     int isAngled;
 *     int {@link #isModuleImport};
 * }</code></pre>
 */
public class CXIdxIncludedFileInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HASHLOC,
        FILENAME,
        FILE,
        ISIMPORT,
        ISANGLED,
        ISMODULEIMPORT;

    static {
        Layout layout = __struct(
            __member(CXIdxLoc.SIZEOF, CXIdxLoc.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HASHLOC = layout.offsetof(0);
        FILENAME = layout.offsetof(1);
        FILE = layout.offsetof(2);
        ISIMPORT = layout.offsetof(3);
        ISANGLED = layout.offsetof(4);
        ISMODULEIMPORT = layout.offsetof(5);
    }

    /**
     * Creates a {@code CXIdxIncludedFileInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxIncludedFileInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** location of '\#' in the {@code #include/#import} directive */
    public CXIdxLoc hashLoc() { return nhashLoc(address()); }
    /** filename as written in the {@code #include/#import} directive */
    @NativeType("char const *")
    public ByteBuffer filename() { return nfilename(address()); }
    /** filename as written in the {@code #include/#import} directive */
    @NativeType("char const *")
    public String filenameString() { return nfilenameString(address()); }
    /** the actual file that the {@code #include/#import} directive resolved to */
    @NativeType("CXFile")
    public long file() { return nfile(address()); }
    /** @return the value of the {@code isImport} field. */
    @NativeType("int")
    public boolean isImport() { return nisImport(address()) != 0; }
    /** @return the value of the {@code isAngled} field. */
    @NativeType("int")
    public boolean isAngled() { return nisAngled(address()) != 0; }
    /** non-zero if the directive was automatically turned into a module import */
    @NativeType("int")
    public boolean isModuleImport() { return nisModuleImport(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@code CXIdxIncludedFileInfo} instance for the specified memory address. */
    public static CXIdxIncludedFileInfo create(long address) {
        return wrap(CXIdxIncludedFileInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxIncludedFileInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxIncludedFileInfo.class, address);
    }

    /**
     * Create a {@link CXIdxIncludedFileInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxIncludedFileInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxIncludedFileInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hashLoc}. */
    public static CXIdxLoc nhashLoc(long struct) { return CXIdxLoc.create(struct + CXIdxIncludedFileInfo.HASHLOC); }
    /** Unsafe version of {@link #filename}. */
    public static ByteBuffer nfilename(long struct) { return memByteBufferNT1(memGetAddress(struct + CXIdxIncludedFileInfo.FILENAME)); }
    /** Unsafe version of {@link #filenameString}. */
    public static String nfilenameString(long struct) { return memASCII(memGetAddress(struct + CXIdxIncludedFileInfo.FILENAME)); }
    /** Unsafe version of {@link #file}. */
    public static long nfile(long struct) { return memGetAddress(struct + CXIdxIncludedFileInfo.FILE); }
    /** Unsafe version of {@link #isImport}. */
    public static int nisImport(long struct) { return UNSAFE.getInt(null, struct + CXIdxIncludedFileInfo.ISIMPORT); }
    /** Unsafe version of {@link #isAngled}. */
    public static int nisAngled(long struct) { return UNSAFE.getInt(null, struct + CXIdxIncludedFileInfo.ISANGLED); }
    /** Unsafe version of {@link #isModuleImport}. */
    public static int nisModuleImport(long struct) { return UNSAFE.getInt(null, struct + CXIdxIncludedFileInfo.ISMODULEIMPORT); }

    // -----------------------------------

    /** An array of {@link CXIdxIncludedFileInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxIncludedFileInfo, Buffer> {

        private static final CXIdxIncludedFileInfo ELEMENT_FACTORY = CXIdxIncludedFileInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxIncludedFileInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxIncludedFileInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxIncludedFileInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXIdxLoc} view of the {@link CXIdxIncludedFileInfo#hashLoc} field. */
        public CXIdxLoc hashLoc() { return CXIdxIncludedFileInfo.nhashLoc(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link CXIdxIncludedFileInfo#filename} field. */
        @NativeType("char const *")
        public ByteBuffer filename() { return CXIdxIncludedFileInfo.nfilename(address()); }
        /** @return the null-terminated string pointed to by the {@link CXIdxIncludedFileInfo#filename} field. */
        @NativeType("char const *")
        public String filenameString() { return CXIdxIncludedFileInfo.nfilenameString(address()); }
        /** @return the value of the {@link CXIdxIncludedFileInfo#file} field. */
        @NativeType("CXFile")
        public long file() { return CXIdxIncludedFileInfo.nfile(address()); }
        /** @return the value of the {@code isImport} field. */
        @NativeType("int")
        public boolean isImport() { return CXIdxIncludedFileInfo.nisImport(address()) != 0; }
        /** @return the value of the {@code isAngled} field. */
        @NativeType("int")
        public boolean isAngled() { return CXIdxIncludedFileInfo.nisAngled(address()) != 0; }
        /** @return the value of the {@link CXIdxIncludedFileInfo#isModuleImport} field. */
        @NativeType("int")
        public boolean isModuleImport() { return CXIdxIncludedFileInfo.nisModuleImport(address()) != 0; }

    }

}