/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrDebugUtilsObjectNameInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrObjectType objectType;
 *     uint64_t objectHandle;
 *     char const * objectName;
 * }</code></pre>
 */
public class XrDebugUtilsObjectNameInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        OBJECTTYPE,
        OBJECTHANDLE,
        OBJECTNAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        OBJECTTYPE = layout.offsetof(2);
        OBJECTHANDLE = layout.offsetof(3);
        OBJECTNAME = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrDebugUtilsObjectNameInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDebugUtilsObjectNameInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code objectType} field. */
    @NativeType("XrObjectType")
    public int objectType() { return nobjectType(address()); }
    /** @return the value of the {@code objectHandle} field. */
    @NativeType("uint64_t")
    public long objectHandle() { return nobjectHandle(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code objectName} field. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer objectName() { return nobjectName(address()); }
    /** @return the null-terminated string pointed to by the {@code objectName} field. */
    @Nullable
    @NativeType("char const *")
    public String objectNameString() { return nobjectNameString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrDebugUtilsObjectNameInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrDebugUtilsObjectNameInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code objectType} field. */
    public XrDebugUtilsObjectNameInfoEXT objectType(@NativeType("XrObjectType") int value) { nobjectType(address(), value); return this; }
    /** Sets the specified value to the {@code objectHandle} field. */
    public XrDebugUtilsObjectNameInfoEXT objectHandle(@NativeType("uint64_t") long value) { nobjectHandle(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code objectName} field. */
    public XrDebugUtilsObjectNameInfoEXT objectName(@Nullable @NativeType("char const *") ByteBuffer value) { nobjectName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDebugUtilsObjectNameInfoEXT set(
        int type,
        long next,
        int objectType,
        long objectHandle,
        @Nullable ByteBuffer objectName
    ) {
        type(type);
        next(next);
        objectType(objectType);
        objectHandle(objectHandle);
        objectName(objectName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDebugUtilsObjectNameInfoEXT set(XrDebugUtilsObjectNameInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDebugUtilsObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsObjectNameInfoEXT malloc() {
        return wrap(XrDebugUtilsObjectNameInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsObjectNameInfoEXT calloc() {
        return wrap(XrDebugUtilsObjectNameInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsObjectNameInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrDebugUtilsObjectNameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrDebugUtilsObjectNameInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrDebugUtilsObjectNameInfoEXT} instance for the specified memory address. */
    public static XrDebugUtilsObjectNameInfoEXT create(long address) {
        return wrap(XrDebugUtilsObjectNameInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsObjectNameInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrDebugUtilsObjectNameInfoEXT.class, address);
    }

    /**
     * Returns a new {@link XrDebugUtilsObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsObjectNameInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsObjectNameInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsObjectNameInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsObjectNameInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrDebugUtilsObjectNameInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsObjectNameInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsObjectNameInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrDebugUtilsObjectNameInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrDebugUtilsObjectNameInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrDebugUtilsObjectNameInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrDebugUtilsObjectNameInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrDebugUtilsObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsObjectNameInfoEXT mallocStack(MemoryStack stack) {
        return wrap(XrDebugUtilsObjectNameInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrDebugUtilsObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsObjectNameInfoEXT callocStack(MemoryStack stack) {
        return wrap(XrDebugUtilsObjectNameInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsObjectNameInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsObjectNameInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsObjectNameInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsObjectNameInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrDebugUtilsObjectNameInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDebugUtilsObjectNameInfoEXT.NEXT); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return UNSAFE.getInt(null, struct + XrDebugUtilsObjectNameInfoEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #objectHandle}. */
    public static long nobjectHandle(long struct) { return UNSAFE.getLong(null, struct + XrDebugUtilsObjectNameInfoEXT.OBJECTHANDLE); }
    /** Unsafe version of {@link #objectName}. */
    @Nullable public static ByteBuffer nobjectName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + XrDebugUtilsObjectNameInfoEXT.OBJECTNAME)); }
    /** Unsafe version of {@link #objectNameString}. */
    @Nullable public static String nobjectNameString(long struct) { return memUTF8Safe(memGetAddress(struct + XrDebugUtilsObjectNameInfoEXT.OBJECTNAME)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrDebugUtilsObjectNameInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDebugUtilsObjectNameInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { UNSAFE.putInt(null, struct + XrDebugUtilsObjectNameInfoEXT.OBJECTTYPE, value); }
    /** Unsafe version of {@link #objectHandle(long) objectHandle}. */
    public static void nobjectHandle(long struct, long value) { UNSAFE.putLong(null, struct + XrDebugUtilsObjectNameInfoEXT.OBJECTHANDLE, value); }
    /** Unsafe version of {@link #objectName(ByteBuffer) objectName}. */
    public static void nobjectName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + XrDebugUtilsObjectNameInfoEXT.OBJECTNAME, memAddressSafe(value));
    }

    // -----------------------------------

    /** An array of {@link XrDebugUtilsObjectNameInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrDebugUtilsObjectNameInfoEXT, Buffer> implements NativeResource {

        private static final XrDebugUtilsObjectNameInfoEXT ELEMENT_FACTORY = XrDebugUtilsObjectNameInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrDebugUtilsObjectNameInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDebugUtilsObjectNameInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrDebugUtilsObjectNameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDebugUtilsObjectNameInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrDebugUtilsObjectNameInfoEXT.nnext(address()); }
        /** @return the value of the {@code objectType} field. */
        @NativeType("XrObjectType")
        public int objectType() { return XrDebugUtilsObjectNameInfoEXT.nobjectType(address()); }
        /** @return the value of the {@code objectHandle} field. */
        @NativeType("uint64_t")
        public long objectHandle() { return XrDebugUtilsObjectNameInfoEXT.nobjectHandle(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code objectName} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer objectName() { return XrDebugUtilsObjectNameInfoEXT.nobjectName(address()); }
        /** @return the null-terminated string pointed to by the {@code objectName} field. */
        @Nullable
        @NativeType("char const *")
        public String objectNameString() { return XrDebugUtilsObjectNameInfoEXT.nobjectNameString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrDebugUtilsObjectNameInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrDebugUtilsObjectNameInfoEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrDebugUtilsObjectNameInfoEXT.Buffer next(@NativeType("void const *") long value) { XrDebugUtilsObjectNameInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code objectType} field. */
        public XrDebugUtilsObjectNameInfoEXT.Buffer objectType(@NativeType("XrObjectType") int value) { XrDebugUtilsObjectNameInfoEXT.nobjectType(address(), value); return this; }
        /** Sets the specified value to the {@code objectHandle} field. */
        public XrDebugUtilsObjectNameInfoEXT.Buffer objectHandle(@NativeType("uint64_t") long value) { XrDebugUtilsObjectNameInfoEXT.nobjectHandle(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code objectName} field. */
        public XrDebugUtilsObjectNameInfoEXT.Buffer objectName(@Nullable @NativeType("char const *") ByteBuffer value) { XrDebugUtilsObjectNameInfoEXT.nobjectName(address(), value); return this; }

    }

}