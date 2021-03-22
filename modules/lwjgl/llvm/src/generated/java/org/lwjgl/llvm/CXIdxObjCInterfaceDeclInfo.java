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
 * struct CXIdxObjCInterfaceDeclInfo {
 *     {@link CXIdxObjCContainerDeclInfo CXIdxObjCContainerDeclInfo} const * containerInfo;
 *     {@link CXIdxBaseClassInfo CXIdxBaseClassInfo} const * superInfo;
 *     {@link CXIdxObjCProtocolRefListInfo CXIdxObjCProtocolRefListInfo} const * protocols;
 * }</code></pre>
 */
public class CXIdxObjCInterfaceDeclInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTAINERINFO,
        SUPERINFO,
        PROTOCOLS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONTAINERINFO = layout.offsetof(0);
        SUPERINFO = layout.offsetof(1);
        PROTOCOLS = layout.offsetof(2);
    }

    /**
     * Creates a {@code CXIdxObjCInterfaceDeclInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxObjCInterfaceDeclInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CXIdxObjCContainerDeclInfo} view of the struct pointed to by the {@code containerInfo} field. */
    @NativeType("CXIdxObjCContainerDeclInfo const *")
    public CXIdxObjCContainerDeclInfo containerInfo() { return ncontainerInfo(address()); }
    /** @return a {@link CXIdxBaseClassInfo} view of the struct pointed to by the {@code superInfo} field. */
    @NativeType("CXIdxBaseClassInfo const *")
    public CXIdxBaseClassInfo superInfo() { return nsuperInfo(address()); }
    /** @return a {@link CXIdxObjCProtocolRefListInfo} view of the struct pointed to by the {@code protocols} field. */
    @NativeType("CXIdxObjCProtocolRefListInfo const *")
    public CXIdxObjCProtocolRefListInfo protocols() { return nprotocols(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxObjCInterfaceDeclInfo} instance for the specified memory address. */
    public static CXIdxObjCInterfaceDeclInfo create(long address) {
        return wrap(CXIdxObjCInterfaceDeclInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCInterfaceDeclInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxObjCInterfaceDeclInfo.class, address);
    }

    /**
     * Create a {@link CXIdxObjCInterfaceDeclInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxObjCInterfaceDeclInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCInterfaceDeclInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #containerInfo}. */
    public static CXIdxObjCContainerDeclInfo ncontainerInfo(long struct) { return CXIdxObjCContainerDeclInfo.create(memGetAddress(struct + CXIdxObjCInterfaceDeclInfo.CONTAINERINFO)); }
    /** Unsafe version of {@link #superInfo}. */
    public static CXIdxBaseClassInfo nsuperInfo(long struct) { return CXIdxBaseClassInfo.create(memGetAddress(struct + CXIdxObjCInterfaceDeclInfo.SUPERINFO)); }
    /** Unsafe version of {@link #protocols}. */
    public static CXIdxObjCProtocolRefListInfo nprotocols(long struct) { return CXIdxObjCProtocolRefListInfo.create(memGetAddress(struct + CXIdxObjCInterfaceDeclInfo.PROTOCOLS)); }

    // -----------------------------------

    /** An array of {@link CXIdxObjCInterfaceDeclInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxObjCInterfaceDeclInfo, Buffer> {

        private static final CXIdxObjCInterfaceDeclInfo ELEMENT_FACTORY = CXIdxObjCInterfaceDeclInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxObjCInterfaceDeclInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxObjCInterfaceDeclInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxObjCInterfaceDeclInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXIdxObjCContainerDeclInfo} view of the struct pointed to by the {@code containerInfo} field. */
        @NativeType("CXIdxObjCContainerDeclInfo const *")
        public CXIdxObjCContainerDeclInfo containerInfo() { return CXIdxObjCInterfaceDeclInfo.ncontainerInfo(address()); }
        /** @return a {@link CXIdxBaseClassInfo} view of the struct pointed to by the {@code superInfo} field. */
        @NativeType("CXIdxBaseClassInfo const *")
        public CXIdxBaseClassInfo superInfo() { return CXIdxObjCInterfaceDeclInfo.nsuperInfo(address()); }
        /** @return a {@link CXIdxObjCProtocolRefListInfo} view of the struct pointed to by the {@code protocols} field. */
        @NativeType("CXIdxObjCProtocolRefListInfo const *")
        public CXIdxObjCProtocolRefListInfo protocols() { return CXIdxObjCInterfaceDeclInfo.nprotocols(address()); }

    }

}