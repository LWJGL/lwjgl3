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
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXIdxEntityInfo {
 *     CXIdxEntityKind kind;
 *     CXIdxEntityCXXTemplateKind templateKind;
 *     CXIdxEntityLanguage lang;
 *     char const * name;
 *     char const * USR;
 *     {@link CXCursor CXCursor} cursor;
 *     {@link CXIdxAttrInfo CXIdxAttrInfo} const * const * attributes;
 *     unsigned numAttributes;
 * }</code></pre>
 */
public class CXIdxEntityInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KIND,
        TEMPLATEKIND,
        LANG,
        NAME,
        USR,
        CURSOR,
        ATTRIBUTES,
        NUMATTRIBUTES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(CXCursor.SIZEOF, CXCursor.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KIND = layout.offsetof(0);
        TEMPLATEKIND = layout.offsetof(1);
        LANG = layout.offsetof(2);
        NAME = layout.offsetof(3);
        USR = layout.offsetof(4);
        CURSOR = layout.offsetof(5);
        ATTRIBUTES = layout.offsetof(6);
        NUMATTRIBUTES = layout.offsetof(7);
    }

    /**
     * Creates a {@code CXIdxEntityInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxEntityInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code kind} field. */
    @NativeType("CXIdxEntityKind")
    public int kind() { return nkind(address()); }
    /** @return the value of the {@code templateKind} field. */
    @NativeType("CXIdxEntityCXXTemplateKind")
    public int templateKind() { return ntemplateKind(address()); }
    /** @return the value of the {@code lang} field. */
    @NativeType("CXIdxEntityLanguage")
    public int lang() { return nlang(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code USR} field. */
    @NativeType("char const *")
    public ByteBuffer USR() { return nUSR(address()); }
    /** @return the null-terminated string pointed to by the {@code USR} field. */
    @NativeType("char const *")
    public String USRString() { return nUSRString(address()); }
    /** @return a {@link CXCursor} view of the {@code cursor} field. */
    public CXCursor cursor() { return ncursor(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code attributes} field. */
    @NativeType("CXIdxAttrInfo const * const *")
    public PointerBuffer attributes() { return nattributes(address()); }
    /** @return the value of the {@code numAttributes} field. */
    @NativeType("unsigned")
    public int numAttributes() { return nnumAttributes(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxEntityInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXIdxEntityInfo malloc() {
        return wrap(CXIdxEntityInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CXIdxEntityInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXIdxEntityInfo calloc() {
        return wrap(CXIdxEntityInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CXIdxEntityInfo} instance allocated with {@link BufferUtils}. */
    public static CXIdxEntityInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CXIdxEntityInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code CXIdxEntityInfo} instance for the specified memory address. */
    public static CXIdxEntityInfo create(long address) {
        return wrap(CXIdxEntityInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxEntityInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxEntityInfo.class, address);
    }

    /**
     * Returns a new {@link CXIdxEntityInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXIdxEntityInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXIdxEntityInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXIdxEntityInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXIdxEntityInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXIdxEntityInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CXIdxEntityInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxEntityInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxEntityInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxEntityInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxEntityInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxEntityInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxEntityInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxEntityInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxEntityInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxEntityInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxEntityInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXIdxEntityInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXIdxEntityInfo malloc(MemoryStack stack) {
        return wrap(CXIdxEntityInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CXIdxEntityInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXIdxEntityInfo calloc(MemoryStack stack) {
        return wrap(CXIdxEntityInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CXIdxEntityInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXIdxEntityInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXIdxEntityInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXIdxEntityInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #kind}. */
    public static int nkind(long struct) { return UNSAFE.getInt(null, struct + CXIdxEntityInfo.KIND); }
    /** Unsafe version of {@link #templateKind}. */
    public static int ntemplateKind(long struct) { return UNSAFE.getInt(null, struct + CXIdxEntityInfo.TEMPLATEKIND); }
    /** Unsafe version of {@link #lang}. */
    public static int nlang(long struct) { return UNSAFE.getInt(null, struct + CXIdxEntityInfo.LANG); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + CXIdxEntityInfo.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + CXIdxEntityInfo.NAME)); }
    /** Unsafe version of {@link #USR}. */
    public static ByteBuffer nUSR(long struct) { return memByteBufferNT1(memGetAddress(struct + CXIdxEntityInfo.USR)); }
    /** Unsafe version of {@link #USRString}. */
    public static String nUSRString(long struct) { return memUTF8(memGetAddress(struct + CXIdxEntityInfo.USR)); }
    /** Unsafe version of {@link #cursor}. */
    public static CXCursor ncursor(long struct) { return CXCursor.create(struct + CXIdxEntityInfo.CURSOR); }
    /** Unsafe version of {@link #attributes() attributes}. */
    public static PointerBuffer nattributes(long struct) { return memPointerBuffer(memGetAddress(struct + CXIdxEntityInfo.ATTRIBUTES), nnumAttributes(struct)); }
    /** Unsafe version of {@link #numAttributes}. */
    public static int nnumAttributes(long struct) { return UNSAFE.getInt(null, struct + CXIdxEntityInfo.NUMATTRIBUTES); }

    // -----------------------------------

    /** An array of {@link CXIdxEntityInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxEntityInfo, Buffer> implements NativeResource {

        private static final CXIdxEntityInfo ELEMENT_FACTORY = CXIdxEntityInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxEntityInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxEntityInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxEntityInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code kind} field. */
        @NativeType("CXIdxEntityKind")
        public int kind() { return CXIdxEntityInfo.nkind(address()); }
        /** @return the value of the {@code templateKind} field. */
        @NativeType("CXIdxEntityCXXTemplateKind")
        public int templateKind() { return CXIdxEntityInfo.ntemplateKind(address()); }
        /** @return the value of the {@code lang} field. */
        @NativeType("CXIdxEntityLanguage")
        public int lang() { return CXIdxEntityInfo.nlang(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return CXIdxEntityInfo.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return CXIdxEntityInfo.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code USR} field. */
        @NativeType("char const *")
        public ByteBuffer USR() { return CXIdxEntityInfo.nUSR(address()); }
        /** @return the null-terminated string pointed to by the {@code USR} field. */
        @NativeType("char const *")
        public String USRString() { return CXIdxEntityInfo.nUSRString(address()); }
        /** @return a {@link CXCursor} view of the {@code cursor} field. */
        public CXCursor cursor() { return CXIdxEntityInfo.ncursor(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code attributes} field. */
        @NativeType("CXIdxAttrInfo const * const *")
        public PointerBuffer attributes() { return CXIdxEntityInfo.nattributes(address()); }
        /** @return the value of the {@code numAttributes} field. */
        @NativeType("unsigned")
        public int numAttributes() { return CXIdxEntityInfo.nnumAttributes(address()); }

    }

}