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
 * struct CXIdxDeclInfo {
 *     {@link CXIdxEntityInfo CXIdxEntityInfo} const * entityInfo;
 *     {@link CXCursor CXCursor} cursor;
 *     {@link CXIdxLoc CXIdxLoc} loc;
 *     {@link CXIdxContainerInfo CXIdxContainerInfo} const * semanticContainer;
 *     {@link CXIdxContainerInfo CXIdxContainerInfo} const * {@link #lexicalContainer};
 *     int isRedeclaration;
 *     int isDefinition;
 *     int isContainer;
 *     {@link CXIdxContainerInfo CXIdxContainerInfo} const * declAsContainer;
 *     int {@link #isImplicit};
 *     {@link CXIdxAttrInfo CXIdxAttrInfo} const * const * attributes;
 *     unsigned numAttributes;
 *     unsigned flags;
 * }</code></pre>
 */
public class CXIdxDeclInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ENTITYINFO,
        CURSOR,
        LOC,
        SEMANTICCONTAINER,
        LEXICALCONTAINER,
        ISREDECLARATION,
        ISDEFINITION,
        ISCONTAINER,
        DECLASCONTAINER,
        ISIMPLICIT,
        ATTRIBUTES,
        NUMATTRIBUTES,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CXCursor.SIZEOF, CXCursor.ALIGNOF),
            __member(CXIdxLoc.SIZEOF, CXIdxLoc.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ENTITYINFO = layout.offsetof(0);
        CURSOR = layout.offsetof(1);
        LOC = layout.offsetof(2);
        SEMANTICCONTAINER = layout.offsetof(3);
        LEXICALCONTAINER = layout.offsetof(4);
        ISREDECLARATION = layout.offsetof(5);
        ISDEFINITION = layout.offsetof(6);
        ISCONTAINER = layout.offsetof(7);
        DECLASCONTAINER = layout.offsetof(8);
        ISIMPLICIT = layout.offsetof(9);
        ATTRIBUTES = layout.offsetof(10);
        NUMATTRIBUTES = layout.offsetof(11);
        FLAGS = layout.offsetof(12);
    }

    /**
     * Creates a {@code CXIdxDeclInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxDeclInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code entityInfo} field. */
    @NativeType("CXIdxEntityInfo const *")
    public CXIdxEntityInfo entityInfo() { return nentityInfo(address()); }
    /** @return a {@link CXCursor} view of the {@code cursor} field. */
    public CXCursor cursor() { return ncursor(address()); }
    /** @return a {@link CXIdxLoc} view of the {@code loc} field. */
    public CXIdxLoc loc() { return nloc(address()); }
    /** @return a {@link CXIdxContainerInfo} view of the struct pointed to by the {@code semanticContainer} field. */
    @NativeType("CXIdxContainerInfo const *")
    public CXIdxContainerInfo semanticContainer() { return nsemanticContainer(address()); }
    /** generally same as {@code semanticContainer} but can be different in cases like out-of-line C++ member functions */
    @NativeType("CXIdxContainerInfo const *")
    public CXIdxContainerInfo lexicalContainer() { return nlexicalContainer(address()); }
    /** @return the value of the {@code isRedeclaration} field. */
    @NativeType("int")
    public boolean isRedeclaration() { return nisRedeclaration(address()) != 0; }
    /** @return the value of the {@code isDefinition} field. */
    @NativeType("int")
    public boolean isDefinition() { return nisDefinition(address()) != 0; }
    /** @return the value of the {@code isContainer} field. */
    @NativeType("int")
    public boolean isContainer() { return nisContainer(address()) != 0; }
    /** @return a {@link CXIdxContainerInfo} view of the struct pointed to by the {@code declAsContainer} field. */
    @NativeType("CXIdxContainerInfo const *")
    public CXIdxContainerInfo declAsContainer() { return ndeclAsContainer(address()); }
    /** whether the declaration exists in code or was created implicitly by the compiler, e.g. implicit Objective-C methods for properties */
    @NativeType("int")
    public boolean isImplicit() { return nisImplicit(address()) != 0; }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code attributes} field. */
    @NativeType("CXIdxAttrInfo const * const *")
    public PointerBuffer attributes() { return nattributes(address()); }
    /** @return the value of the {@code numAttributes} field. */
    @NativeType("unsigned")
    public int numAttributes() { return nnumAttributes(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("unsigned")
    public int flags() { return nflags(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxDeclInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXIdxDeclInfo malloc() {
        return wrap(CXIdxDeclInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CXIdxDeclInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXIdxDeclInfo calloc() {
        return wrap(CXIdxDeclInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CXIdxDeclInfo} instance allocated with {@link BufferUtils}. */
    public static CXIdxDeclInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CXIdxDeclInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code CXIdxDeclInfo} instance for the specified memory address. */
    public static CXIdxDeclInfo create(long address) {
        return wrap(CXIdxDeclInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxDeclInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxDeclInfo.class, address);
    }

    /**
     * Returns a new {@link CXIdxDeclInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXIdxDeclInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXIdxDeclInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXIdxDeclInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXIdxDeclInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXIdxDeclInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CXIdxDeclInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxDeclInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxDeclInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxDeclInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxDeclInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxDeclInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxDeclInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxDeclInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxDeclInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxDeclInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxDeclInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXIdxDeclInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXIdxDeclInfo malloc(MemoryStack stack) {
        return wrap(CXIdxDeclInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CXIdxDeclInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXIdxDeclInfo calloc(MemoryStack stack) {
        return wrap(CXIdxDeclInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CXIdxDeclInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXIdxDeclInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXIdxDeclInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXIdxDeclInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #entityInfo}. */
    public static CXIdxEntityInfo nentityInfo(long struct) { return CXIdxEntityInfo.create(memGetAddress(struct + CXIdxDeclInfo.ENTITYINFO)); }
    /** Unsafe version of {@link #cursor}. */
    public static CXCursor ncursor(long struct) { return CXCursor.create(struct + CXIdxDeclInfo.CURSOR); }
    /** Unsafe version of {@link #loc}. */
    public static CXIdxLoc nloc(long struct) { return CXIdxLoc.create(struct + CXIdxDeclInfo.LOC); }
    /** Unsafe version of {@link #semanticContainer}. */
    public static CXIdxContainerInfo nsemanticContainer(long struct) { return CXIdxContainerInfo.create(memGetAddress(struct + CXIdxDeclInfo.SEMANTICCONTAINER)); }
    /** Unsafe version of {@link #lexicalContainer}. */
    public static CXIdxContainerInfo nlexicalContainer(long struct) { return CXIdxContainerInfo.create(memGetAddress(struct + CXIdxDeclInfo.LEXICALCONTAINER)); }
    /** Unsafe version of {@link #isRedeclaration}. */
    public static int nisRedeclaration(long struct) { return UNSAFE.getInt(null, struct + CXIdxDeclInfo.ISREDECLARATION); }
    /** Unsafe version of {@link #isDefinition}. */
    public static int nisDefinition(long struct) { return UNSAFE.getInt(null, struct + CXIdxDeclInfo.ISDEFINITION); }
    /** Unsafe version of {@link #isContainer}. */
    public static int nisContainer(long struct) { return UNSAFE.getInt(null, struct + CXIdxDeclInfo.ISCONTAINER); }
    /** Unsafe version of {@link #declAsContainer}. */
    public static CXIdxContainerInfo ndeclAsContainer(long struct) { return CXIdxContainerInfo.create(memGetAddress(struct + CXIdxDeclInfo.DECLASCONTAINER)); }
    /** Unsafe version of {@link #isImplicit}. */
    public static int nisImplicit(long struct) { return UNSAFE.getInt(null, struct + CXIdxDeclInfo.ISIMPLICIT); }
    /** Unsafe version of {@link #attributes() attributes}. */
    public static PointerBuffer nattributes(long struct) { return memPointerBuffer(memGetAddress(struct + CXIdxDeclInfo.ATTRIBUTES), nnumAttributes(struct)); }
    /** Unsafe version of {@link #numAttributes}. */
    public static int nnumAttributes(long struct) { return UNSAFE.getInt(null, struct + CXIdxDeclInfo.NUMATTRIBUTES); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + CXIdxDeclInfo.FLAGS); }

    // -----------------------------------

    /** An array of {@link CXIdxDeclInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxDeclInfo, Buffer> implements NativeResource {

        private static final CXIdxDeclInfo ELEMENT_FACTORY = CXIdxDeclInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxDeclInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxDeclInfo#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxDeclInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code entityInfo} field. */
        @NativeType("CXIdxEntityInfo const *")
        public CXIdxEntityInfo entityInfo() { return CXIdxDeclInfo.nentityInfo(address()); }
        /** @return a {@link CXCursor} view of the {@code cursor} field. */
        public CXCursor cursor() { return CXIdxDeclInfo.ncursor(address()); }
        /** @return a {@link CXIdxLoc} view of the {@code loc} field. */
        public CXIdxLoc loc() { return CXIdxDeclInfo.nloc(address()); }
        /** @return a {@link CXIdxContainerInfo} view of the struct pointed to by the {@code semanticContainer} field. */
        @NativeType("CXIdxContainerInfo const *")
        public CXIdxContainerInfo semanticContainer() { return CXIdxDeclInfo.nsemanticContainer(address()); }
        /** @return a {@link CXIdxContainerInfo} view of the struct pointed to by the {@link CXIdxDeclInfo#lexicalContainer} field. */
        @NativeType("CXIdxContainerInfo const *")
        public CXIdxContainerInfo lexicalContainer() { return CXIdxDeclInfo.nlexicalContainer(address()); }
        /** @return the value of the {@code isRedeclaration} field. */
        @NativeType("int")
        public boolean isRedeclaration() { return CXIdxDeclInfo.nisRedeclaration(address()) != 0; }
        /** @return the value of the {@code isDefinition} field. */
        @NativeType("int")
        public boolean isDefinition() { return CXIdxDeclInfo.nisDefinition(address()) != 0; }
        /** @return the value of the {@code isContainer} field. */
        @NativeType("int")
        public boolean isContainer() { return CXIdxDeclInfo.nisContainer(address()) != 0; }
        /** @return a {@link CXIdxContainerInfo} view of the struct pointed to by the {@code declAsContainer} field. */
        @NativeType("CXIdxContainerInfo const *")
        public CXIdxContainerInfo declAsContainer() { return CXIdxDeclInfo.ndeclAsContainer(address()); }
        /** @return the value of the {@link CXIdxDeclInfo#isImplicit} field. */
        @NativeType("int")
        public boolean isImplicit() { return CXIdxDeclInfo.nisImplicit(address()) != 0; }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code attributes} field. */
        @NativeType("CXIdxAttrInfo const * const *")
        public PointerBuffer attributes() { return CXIdxDeclInfo.nattributes(address()); }
        /** @return the value of the {@code numAttributes} field. */
        @NativeType("unsigned")
        public int numAttributes() { return CXIdxDeclInfo.nnumAttributes(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("unsigned")
        public int flags() { return CXIdxDeclInfo.nflags(address()); }

    }

}