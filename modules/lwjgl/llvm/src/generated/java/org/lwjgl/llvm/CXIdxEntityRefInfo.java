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
 * Data for {@link IndexerCallbacks#indexEntityReference}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXIdxEntityRefInfo {
 *     CXIdxEntityRefKind kind;
 *     {@link CXCursor CXCursor} {@link #cursor};
 *     {@link CXIdxLoc CXIdxLoc} loc;
 *     {@link CXIdxEntityInfo CXIdxEntityInfo} const * {@link #referencedEntity};
 *     {@link CXIdxEntityInfo CXIdxEntityInfo} const * {@link #parentEntity};
 *     {@link CXIdxContainerInfo CXIdxContainerInfo} const * {@link #container};
 *     CXSymbolRole {@link #role};
 * }</code></pre>
 */
public class CXIdxEntityRefInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KIND,
        CURSOR,
        LOC,
        REFERENCEDENTITY,
        PARENTENTITY,
        CONTAINER,
        ROLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CXCursor.SIZEOF, CXCursor.ALIGNOF),
            __member(CXIdxLoc.SIZEOF, CXIdxLoc.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KIND = layout.offsetof(0);
        CURSOR = layout.offsetof(1);
        LOC = layout.offsetof(2);
        REFERENCEDENTITY = layout.offsetof(3);
        PARENTENTITY = layout.offsetof(4);
        CONTAINER = layout.offsetof(5);
        ROLE = layout.offsetof(6);
    }

    /**
     * Creates a {@code CXIdxEntityRefInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxEntityRefInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code kind} field. */
    @NativeType("CXIdxEntityRefKind")
    public int kind() { return nkind(address()); }
    /** reference cursor */
    public CXCursor cursor() { return ncursor(address()); }
    /** @return a {@link CXIdxLoc} view of the {@code loc} field. */
    public CXIdxLoc loc() { return nloc(address()); }
    /** the entity that gets referenced */
    @NativeType("CXIdxEntityInfo const *")
    public CXIdxEntityInfo referencedEntity() { return nreferencedEntity(address()); }
    /**
     * Immediate "parent" of the reference. For example:
     * 
     * <pre><code>
     * Foo *var;</code></pre>
     * 
     * <p>The parent of reference of type {@code Foo} is the variable {@code var}. For references inside statement bodies of functions/methods, the
     * {@code parentEntity} will be the function/method.</p>
     */
    @NativeType("CXIdxEntityInfo const *")
    public CXIdxEntityInfo parentEntity() { return nparentEntity(address()); }
    /** lexical container context of the reference */
    @NativeType("CXIdxContainerInfo const *")
    public CXIdxContainerInfo container() { return ncontainer(address()); }
    /** sets of symbol roles of the reference */
    @NativeType("CXSymbolRole")
    public int role() { return nrole(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxEntityRefInfo} instance for the specified memory address. */
    public static CXIdxEntityRefInfo create(long address) {
        return wrap(CXIdxEntityRefInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxEntityRefInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxEntityRefInfo.class, address);
    }

    /**
     * Create a {@link CXIdxEntityRefInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxEntityRefInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxEntityRefInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #kind}. */
    public static int nkind(long struct) { return UNSAFE.getInt(null, struct + CXIdxEntityRefInfo.KIND); }
    /** Unsafe version of {@link #cursor}. */
    public static CXCursor ncursor(long struct) { return CXCursor.create(struct + CXIdxEntityRefInfo.CURSOR); }
    /** Unsafe version of {@link #loc}. */
    public static CXIdxLoc nloc(long struct) { return CXIdxLoc.create(struct + CXIdxEntityRefInfo.LOC); }
    /** Unsafe version of {@link #referencedEntity}. */
    public static CXIdxEntityInfo nreferencedEntity(long struct) { return CXIdxEntityInfo.create(memGetAddress(struct + CXIdxEntityRefInfo.REFERENCEDENTITY)); }
    /** Unsafe version of {@link #parentEntity}. */
    public static CXIdxEntityInfo nparentEntity(long struct) { return CXIdxEntityInfo.create(memGetAddress(struct + CXIdxEntityRefInfo.PARENTENTITY)); }
    /** Unsafe version of {@link #container}. */
    public static CXIdxContainerInfo ncontainer(long struct) { return CXIdxContainerInfo.create(memGetAddress(struct + CXIdxEntityRefInfo.CONTAINER)); }
    /** Unsafe version of {@link #role}. */
    public static int nrole(long struct) { return UNSAFE.getInt(null, struct + CXIdxEntityRefInfo.ROLE); }

    // -----------------------------------

    /** An array of {@link CXIdxEntityRefInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxEntityRefInfo, Buffer> {

        private static final CXIdxEntityRefInfo ELEMENT_FACTORY = CXIdxEntityRefInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxEntityRefInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxEntityRefInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxEntityRefInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code kind} field. */
        @NativeType("CXIdxEntityRefKind")
        public int kind() { return CXIdxEntityRefInfo.nkind(address()); }
        /** @return a {@link CXCursor} view of the {@link CXIdxEntityRefInfo#cursor} field. */
        public CXCursor cursor() { return CXIdxEntityRefInfo.ncursor(address()); }
        /** @return a {@link CXIdxLoc} view of the {@code loc} field. */
        public CXIdxLoc loc() { return CXIdxEntityRefInfo.nloc(address()); }
        /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@link CXIdxEntityRefInfo#referencedEntity} field. */
        @NativeType("CXIdxEntityInfo const *")
        public CXIdxEntityInfo referencedEntity() { return CXIdxEntityRefInfo.nreferencedEntity(address()); }
        /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@link CXIdxEntityRefInfo#parentEntity} field. */
        @NativeType("CXIdxEntityInfo const *")
        public CXIdxEntityInfo parentEntity() { return CXIdxEntityRefInfo.nparentEntity(address()); }
        /** @return a {@link CXIdxContainerInfo} view of the struct pointed to by the {@link CXIdxEntityRefInfo#container} field. */
        @NativeType("CXIdxContainerInfo const *")
        public CXIdxContainerInfo container() { return CXIdxEntityRefInfo.ncontainer(address()); }
        /** @return the value of the {@link CXIdxEntityRefInfo#role} field. */
        @NativeType("CXSymbolRole")
        public int role() { return CXIdxEntityRefInfo.nrole(address()); }

    }

}