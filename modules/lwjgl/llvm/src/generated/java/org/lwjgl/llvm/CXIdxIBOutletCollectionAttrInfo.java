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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXIdxIBOutletCollectionAttrInfo {
 *     {@link CXIdxAttrInfo CXIdxAttrInfo} const * attrInfo;
 *     {@link CXIdxEntityInfo CXIdxEntityInfo} const * objcClass;
 *     {@link CXCursor CXCursor} classCursor;
 *     {@link CXIdxLoc CXIdxLoc} classLoc;
 * }</code></pre>
 */
public class CXIdxIBOutletCollectionAttrInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ATTRINFO,
        OBJCCLASS,
        CLASSCURSOR,
        CLASSLOC;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(CXCursor.SIZEOF, CXCursor.ALIGNOF),
            __member(CXIdxLoc.SIZEOF, CXIdxLoc.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ATTRINFO = layout.offsetof(0);
        OBJCCLASS = layout.offsetof(1);
        CLASSCURSOR = layout.offsetof(2);
        CLASSLOC = layout.offsetof(3);
    }

    /**
     * Creates a {@code CXIdxIBOutletCollectionAttrInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxIBOutletCollectionAttrInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CXIdxAttrInfo} view of the struct pointed to by the {@code attrInfo} field. */
    @NativeType("CXIdxAttrInfo const *")
    public CXIdxAttrInfo attrInfo() { return nattrInfo(address()); }
    /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code objcClass} field. */
    @NativeType("CXIdxEntityInfo const *")
    public CXIdxEntityInfo objcClass() { return nobjcClass(address()); }
    /** @return a {@link CXCursor} view of the {@code classCursor} field. */
    public CXCursor classCursor() { return nclassCursor(address()); }
    /** @return a {@link CXIdxLoc} view of the {@code classLoc} field. */
    public CXIdxLoc classLoc() { return nclassLoc(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxIBOutletCollectionAttrInfo} instance for the specified memory address. */
    public static CXIdxIBOutletCollectionAttrInfo create(long address) {
        return wrap(CXIdxIBOutletCollectionAttrInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxIBOutletCollectionAttrInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxIBOutletCollectionAttrInfo.class, address);
    }

    /**
     * Create a {@link CXIdxIBOutletCollectionAttrInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxIBOutletCollectionAttrInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxIBOutletCollectionAttrInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #attrInfo}. */
    public static CXIdxAttrInfo nattrInfo(long struct) { return CXIdxAttrInfo.create(memGetAddress(struct + CXIdxIBOutletCollectionAttrInfo.ATTRINFO)); }
    /** Unsafe version of {@link #objcClass}. */
    public static CXIdxEntityInfo nobjcClass(long struct) { return CXIdxEntityInfo.create(memGetAddress(struct + CXIdxIBOutletCollectionAttrInfo.OBJCCLASS)); }
    /** Unsafe version of {@link #classCursor}. */
    public static CXCursor nclassCursor(long struct) { return CXCursor.create(struct + CXIdxIBOutletCollectionAttrInfo.CLASSCURSOR); }
    /** Unsafe version of {@link #classLoc}. */
    public static CXIdxLoc nclassLoc(long struct) { return CXIdxLoc.create(struct + CXIdxIBOutletCollectionAttrInfo.CLASSLOC); }

    // -----------------------------------

    /** An array of {@link CXIdxIBOutletCollectionAttrInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxIBOutletCollectionAttrInfo, Buffer> {

        private static final CXIdxIBOutletCollectionAttrInfo ELEMENT_FACTORY = CXIdxIBOutletCollectionAttrInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxIBOutletCollectionAttrInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxIBOutletCollectionAttrInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxIBOutletCollectionAttrInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXIdxAttrInfo} view of the struct pointed to by the {@code attrInfo} field. */
        @NativeType("CXIdxAttrInfo const *")
        public CXIdxAttrInfo attrInfo() { return CXIdxIBOutletCollectionAttrInfo.nattrInfo(address()); }
        /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code objcClass} field. */
        @NativeType("CXIdxEntityInfo const *")
        public CXIdxEntityInfo objcClass() { return CXIdxIBOutletCollectionAttrInfo.nobjcClass(address()); }
        /** @return a {@link CXCursor} view of the {@code classCursor} field. */
        public CXCursor classCursor() { return CXIdxIBOutletCollectionAttrInfo.nclassCursor(address()); }
        /** @return a {@link CXIdxLoc} view of the {@code classLoc} field. */
        public CXIdxLoc classLoc() { return CXIdxIBOutletCollectionAttrInfo.nclassLoc(address()); }

    }

}