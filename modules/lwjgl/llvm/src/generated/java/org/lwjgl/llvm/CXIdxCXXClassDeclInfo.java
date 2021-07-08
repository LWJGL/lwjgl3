/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXIdxCXXClassDeclInfo {
 *     {@link CXIdxDeclInfo CXIdxDeclInfo} const * declInfo;
 *     {@link CXIdxBaseClassInfo CXIdxBaseClassInfo} const * const * bases;
 *     unsigned numBases;
 * }</code></pre>
 */
public class CXIdxCXXClassDeclInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DECLINFO,
        BASES,
        NUMBASES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DECLINFO = layout.offsetof(0);
        BASES = layout.offsetof(1);
        NUMBASES = layout.offsetof(2);
    }

    /**
     * Creates a {@code CXIdxCXXClassDeclInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxCXXClassDeclInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CXIdxDeclInfo} view of the struct pointed to by the {@code declInfo} field. */
    @NativeType("CXIdxDeclInfo const *")
    public CXIdxDeclInfo declInfo() { return ndeclInfo(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code bases} field. */
    @NativeType("CXIdxBaseClassInfo const * const *")
    public PointerBuffer bases() { return nbases(address()); }
    /** @return the value of the {@code numBases} field. */
    @NativeType("unsigned")
    public int numBases() { return nnumBases(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxCXXClassDeclInfo} instance for the specified memory address. */
    public static CXIdxCXXClassDeclInfo create(long address) {
        return wrap(CXIdxCXXClassDeclInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxCXXClassDeclInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxCXXClassDeclInfo.class, address);
    }

    /**
     * Create a {@link CXIdxCXXClassDeclInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxCXXClassDeclInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxCXXClassDeclInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #declInfo}. */
    public static CXIdxDeclInfo ndeclInfo(long struct) { return CXIdxDeclInfo.create(memGetAddress(struct + CXIdxCXXClassDeclInfo.DECLINFO)); }
    /** Unsafe version of {@link #bases() bases}. */
    public static PointerBuffer nbases(long struct) { return memPointerBuffer(memGetAddress(struct + CXIdxCXXClassDeclInfo.BASES), nnumBases(struct)); }
    /** Unsafe version of {@link #numBases}. */
    public static int nnumBases(long struct) { return UNSAFE.getInt(null, struct + CXIdxCXXClassDeclInfo.NUMBASES); }

    // -----------------------------------

    /** An array of {@link CXIdxCXXClassDeclInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxCXXClassDeclInfo, Buffer> {

        private static final CXIdxCXXClassDeclInfo ELEMENT_FACTORY = CXIdxCXXClassDeclInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxCXXClassDeclInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxCXXClassDeclInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxCXXClassDeclInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXIdxDeclInfo} view of the struct pointed to by the {@code declInfo} field. */
        @NativeType("CXIdxDeclInfo const *")
        public CXIdxDeclInfo declInfo() { return CXIdxCXXClassDeclInfo.ndeclInfo(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code bases} field. */
        @NativeType("CXIdxBaseClassInfo const * const *")
        public PointerBuffer bases() { return CXIdxCXXClassDeclInfo.nbases(address()); }
        /** @return the value of the {@code numBases} field. */
        @NativeType("unsigned")
        public int numBases() { return CXIdxCXXClassDeclInfo.nnumBases(address()); }

    }

}