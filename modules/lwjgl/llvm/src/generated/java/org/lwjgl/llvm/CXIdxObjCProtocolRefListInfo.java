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
 * struct CXIdxObjCProtocolRefListInfo {
 *     {@link CXIdxObjCProtocolRefInfo CXIdxObjCProtocolRefInfo} const * const * protocols;
 *     unsigned numProtocols;
 * }</code></pre>
 */
public class CXIdxObjCProtocolRefListInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROTOCOLS,
        NUMPROTOCOLS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROTOCOLS = layout.offsetof(0);
        NUMPROTOCOLS = layout.offsetof(1);
    }

    /**
     * Creates a {@code CXIdxObjCProtocolRefListInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxObjCProtocolRefListInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code protocols} field. */
    @NativeType("CXIdxObjCProtocolRefInfo const * const *")
    public PointerBuffer protocols() { return nprotocols(address()); }
    /** @return the value of the {@code numProtocols} field. */
    @NativeType("unsigned")
    public int numProtocols() { return nnumProtocols(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxObjCProtocolRefListInfo} instance for the specified memory address. */
    public static CXIdxObjCProtocolRefListInfo create(long address) {
        return wrap(CXIdxObjCProtocolRefListInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCProtocolRefListInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxObjCProtocolRefListInfo.class, address);
    }

    /**
     * Create a {@link CXIdxObjCProtocolRefListInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxObjCProtocolRefListInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxObjCProtocolRefListInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #protocols() protocols}. */
    public static PointerBuffer nprotocols(long struct) { return memPointerBuffer(memGetAddress(struct + CXIdxObjCProtocolRefListInfo.PROTOCOLS), nnumProtocols(struct)); }
    /** Unsafe version of {@link #numProtocols}. */
    public static int nnumProtocols(long struct) { return UNSAFE.getInt(null, struct + CXIdxObjCProtocolRefListInfo.NUMPROTOCOLS); }

    // -----------------------------------

    /** An array of {@link CXIdxObjCProtocolRefListInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxObjCProtocolRefListInfo, Buffer> {

        private static final CXIdxObjCProtocolRefListInfo ELEMENT_FACTORY = CXIdxObjCProtocolRefListInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxObjCProtocolRefListInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxObjCProtocolRefListInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxObjCProtocolRefListInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code protocols} field. */
        @NativeType("CXIdxObjCProtocolRefInfo const * const *")
        public PointerBuffer protocols() { return CXIdxObjCProtocolRefListInfo.nprotocols(address()); }
        /** @return the value of the {@code numProtocols} field. */
        @NativeType("unsigned")
        public int numProtocols() { return CXIdxObjCProtocolRefListInfo.nnumProtocols(address()); }

    }

}