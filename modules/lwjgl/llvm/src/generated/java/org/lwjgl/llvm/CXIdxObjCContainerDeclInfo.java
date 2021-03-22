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
 * struct CXIdxObjCContainerDeclInfo {
 *     {@link CXIdxDeclInfo CXIdxDeclInfo} const * declInfo;
 *     CXIdxObjCContainerKind kind;
 * }</code></pre>
 */
public class CXIdxObjCContainerDeclInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DECLINFO,
        KIND;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DECLINFO = layout.offsetof(0);
        KIND = layout.offsetof(1);
    }

    /**
     * Creates a {@code CXIdxObjCContainerDeclInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxObjCContainerDeclInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CXIdxDeclInfo} view of the struct pointed to by the {@code declInfo} field. */
    @NativeType("CXIdxDeclInfo const *")
    public CXIdxDeclInfo declInfo() { return ndeclInfo(address()); }
    /** @return the value of the {@code kind} field. */
    @NativeType("CXIdxObjCContainerKind")
    public int kind() { return nkind(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxObjCContainerDeclInfo} instance for the specified memory address. */
    public static CXIdxObjCContainerDeclInfo create(long address) {
        return wrap(CXIdxObjCContainerDeclInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCContainerDeclInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxObjCContainerDeclInfo.class, address);
    }

    /**
     * Create a {@link CXIdxObjCContainerDeclInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxObjCContainerDeclInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCContainerDeclInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #declInfo}. */
    public static CXIdxDeclInfo ndeclInfo(long struct) { return CXIdxDeclInfo.create(memGetAddress(struct + CXIdxObjCContainerDeclInfo.DECLINFO)); }
    /** Unsafe version of {@link #kind}. */
    public static int nkind(long struct) { return UNSAFE.getInt(null, struct + CXIdxObjCContainerDeclInfo.KIND); }

    // -----------------------------------

    /** An array of {@link CXIdxObjCContainerDeclInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxObjCContainerDeclInfo, Buffer> {

        private static final CXIdxObjCContainerDeclInfo ELEMENT_FACTORY = CXIdxObjCContainerDeclInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxObjCContainerDeclInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxObjCContainerDeclInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxObjCContainerDeclInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXIdxDeclInfo} view of the struct pointed to by the {@code declInfo} field. */
        @NativeType("CXIdxDeclInfo const *")
        public CXIdxDeclInfo declInfo() { return CXIdxObjCContainerDeclInfo.ndeclInfo(address()); }
        /** @return the value of the {@code kind} field. */
        @NativeType("CXIdxObjCContainerKind")
        public int kind() { return CXIdxObjCContainerDeclInfo.nkind(address()); }

    }

}