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
 * struct CXIdxObjCPropertyDeclInfo {
 *     {@link CXIdxDeclInfo CXIdxDeclInfo} const * declInfo;
 *     {@link CXIdxEntityInfo CXIdxEntityInfo} const * getter;
 *     {@link CXIdxEntityInfo CXIdxEntityInfo} const * setter;
 * }</code></pre>
 */
public class CXIdxObjCPropertyDeclInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DECLINFO,
        GETTER,
        SETTER;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DECLINFO = layout.offsetof(0);
        GETTER = layout.offsetof(1);
        SETTER = layout.offsetof(2);
    }

    /**
     * Creates a {@code CXIdxObjCPropertyDeclInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxObjCPropertyDeclInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CXIdxDeclInfo} view of the struct pointed to by the {@code declInfo} field. */
    @NativeType("CXIdxDeclInfo const *")
    public CXIdxDeclInfo declInfo() { return ndeclInfo(address()); }
    /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code getter} field. */
    @NativeType("CXIdxEntityInfo const *")
    public CXIdxEntityInfo getter() { return ngetter(address()); }
    /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code setter} field. */
    @NativeType("CXIdxEntityInfo const *")
    public CXIdxEntityInfo setter() { return nsetter(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxObjCPropertyDeclInfo} instance for the specified memory address. */
    public static CXIdxObjCPropertyDeclInfo create(long address) {
        return wrap(CXIdxObjCPropertyDeclInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCPropertyDeclInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxObjCPropertyDeclInfo.class, address);
    }

    /**
     * Create a {@link CXIdxObjCPropertyDeclInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxObjCPropertyDeclInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCPropertyDeclInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #declInfo}. */
    public static CXIdxDeclInfo ndeclInfo(long struct) { return CXIdxDeclInfo.create(memGetAddress(struct + CXIdxObjCPropertyDeclInfo.DECLINFO)); }
    /** Unsafe version of {@link #getter}. */
    public static CXIdxEntityInfo ngetter(long struct) { return CXIdxEntityInfo.create(memGetAddress(struct + CXIdxObjCPropertyDeclInfo.GETTER)); }
    /** Unsafe version of {@link #setter}. */
    public static CXIdxEntityInfo nsetter(long struct) { return CXIdxEntityInfo.create(memGetAddress(struct + CXIdxObjCPropertyDeclInfo.SETTER)); }

    // -----------------------------------

    /** An array of {@link CXIdxObjCPropertyDeclInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxObjCPropertyDeclInfo, Buffer> {

        private static final CXIdxObjCPropertyDeclInfo ELEMENT_FACTORY = CXIdxObjCPropertyDeclInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxObjCPropertyDeclInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxObjCPropertyDeclInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxObjCPropertyDeclInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXIdxDeclInfo} view of the struct pointed to by the {@code declInfo} field. */
        @NativeType("CXIdxDeclInfo const *")
        public CXIdxDeclInfo declInfo() { return CXIdxObjCPropertyDeclInfo.ndeclInfo(address()); }
        /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code getter} field. */
        @NativeType("CXIdxEntityInfo const *")
        public CXIdxEntityInfo getter() { return CXIdxObjCPropertyDeclInfo.ngetter(address()); }
        /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code setter} field. */
        @NativeType("CXIdxEntityInfo const *")
        public CXIdxEntityInfo setter() { return CXIdxObjCPropertyDeclInfo.nsetter(address()); }

    }

}