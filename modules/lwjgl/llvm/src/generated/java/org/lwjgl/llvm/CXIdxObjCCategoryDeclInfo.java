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
 * struct CXIdxObjCCategoryDeclInfo {
 *     {@link CXIdxObjCContainerDeclInfo CXIdxObjCContainerDeclInfo} const * containerInfo;
 *     {@link CXIdxEntityInfo CXIdxEntityInfo} const * objcClass;
 *     {@link CXCursor CXCursor} classCursor;
 *     {@link CXIdxLoc CXIdxLoc} classLoc;
 *     {@link CXIdxObjCProtocolRefListInfo CXIdxObjCProtocolRefListInfo} const * protocols;
 * }</code></pre>
 */
public class CXIdxObjCCategoryDeclInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTAINERINFO,
        OBJCCLASS,
        CLASSCURSOR,
        CLASSLOC,
        PROTOCOLS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(CXCursor.SIZEOF, CXCursor.ALIGNOF),
            __member(CXIdxLoc.SIZEOF, CXIdxLoc.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONTAINERINFO = layout.offsetof(0);
        OBJCCLASS = layout.offsetof(1);
        CLASSCURSOR = layout.offsetof(2);
        CLASSLOC = layout.offsetof(3);
        PROTOCOLS = layout.offsetof(4);
    }

    /**
     * Creates a {@code CXIdxObjCCategoryDeclInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxObjCCategoryDeclInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CXIdxObjCContainerDeclInfo} view of the struct pointed to by the {@code containerInfo} field. */
    @NativeType("CXIdxObjCContainerDeclInfo const *")
    public CXIdxObjCContainerDeclInfo containerInfo() { return ncontainerInfo(address()); }
    /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code objcClass} field. */
    @NativeType("CXIdxEntityInfo const *")
    public CXIdxEntityInfo objcClass() { return nobjcClass(address()); }
    /** @return a {@link CXCursor} view of the {@code classCursor} field. */
    public CXCursor classCursor() { return nclassCursor(address()); }
    /** @return a {@link CXIdxLoc} view of the {@code classLoc} field. */
    public CXIdxLoc classLoc() { return nclassLoc(address()); }
    /** @return a {@link CXIdxObjCProtocolRefListInfo} view of the struct pointed to by the {@code protocols} field. */
    @NativeType("CXIdxObjCProtocolRefListInfo const *")
    public CXIdxObjCProtocolRefListInfo protocols() { return nprotocols(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxObjCCategoryDeclInfo} instance for the specified memory address. */
    public static CXIdxObjCCategoryDeclInfo create(long address) {
        return wrap(CXIdxObjCCategoryDeclInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCCategoryDeclInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxObjCCategoryDeclInfo.class, address);
    }

    /**
     * Create a {@link CXIdxObjCCategoryDeclInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxObjCCategoryDeclInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCCategoryDeclInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #containerInfo}. */
    public static CXIdxObjCContainerDeclInfo ncontainerInfo(long struct) { return CXIdxObjCContainerDeclInfo.create(memGetAddress(struct + CXIdxObjCCategoryDeclInfo.CONTAINERINFO)); }
    /** Unsafe version of {@link #objcClass}. */
    public static CXIdxEntityInfo nobjcClass(long struct) { return CXIdxEntityInfo.create(memGetAddress(struct + CXIdxObjCCategoryDeclInfo.OBJCCLASS)); }
    /** Unsafe version of {@link #classCursor}. */
    public static CXCursor nclassCursor(long struct) { return CXCursor.create(struct + CXIdxObjCCategoryDeclInfo.CLASSCURSOR); }
    /** Unsafe version of {@link #classLoc}. */
    public static CXIdxLoc nclassLoc(long struct) { return CXIdxLoc.create(struct + CXIdxObjCCategoryDeclInfo.CLASSLOC); }
    /** Unsafe version of {@link #protocols}. */
    public static CXIdxObjCProtocolRefListInfo nprotocols(long struct) { return CXIdxObjCProtocolRefListInfo.create(memGetAddress(struct + CXIdxObjCCategoryDeclInfo.PROTOCOLS)); }

    // -----------------------------------

    /** An array of {@link CXIdxObjCCategoryDeclInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxObjCCategoryDeclInfo, Buffer> {

        private static final CXIdxObjCCategoryDeclInfo ELEMENT_FACTORY = CXIdxObjCCategoryDeclInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxObjCCategoryDeclInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxObjCCategoryDeclInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxObjCCategoryDeclInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXIdxObjCContainerDeclInfo} view of the struct pointed to by the {@code containerInfo} field. */
        @NativeType("CXIdxObjCContainerDeclInfo const *")
        public CXIdxObjCContainerDeclInfo containerInfo() { return CXIdxObjCCategoryDeclInfo.ncontainerInfo(address()); }
        /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code objcClass} field. */
        @NativeType("CXIdxEntityInfo const *")
        public CXIdxEntityInfo objcClass() { return CXIdxObjCCategoryDeclInfo.nobjcClass(address()); }
        /** @return a {@link CXCursor} view of the {@code classCursor} field. */
        public CXCursor classCursor() { return CXIdxObjCCategoryDeclInfo.nclassCursor(address()); }
        /** @return a {@link CXIdxLoc} view of the {@code classLoc} field. */
        public CXIdxLoc classLoc() { return CXIdxObjCCategoryDeclInfo.nclassLoc(address()); }
        /** @return a {@link CXIdxObjCProtocolRefListInfo} view of the struct pointed to by the {@code protocols} field. */
        @NativeType("CXIdxObjCProtocolRefListInfo const *")
        public CXIdxObjCProtocolRefListInfo protocols() { return CXIdxObjCCategoryDeclInfo.nprotocols(address()); }

    }

}