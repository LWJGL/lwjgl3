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
 * struct XrDebugUtilsLabelEXT {
 *     XrStructureType type;
 *     void const * next;
 *     char const * labelName;
 * }</code></pre>
 */
public class XrDebugUtilsLabelEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LABELNAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LABELNAME = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrDebugUtilsLabelEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDebugUtilsLabelEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code labelName} field. */
    @NativeType("char const *")
    public ByteBuffer labelName() { return nlabelName(address()); }
    /** Decodes the null-terminated string pointed to by the {@code labelName} field. */
    @NativeType("char const *")
    public String labelNameString() { return nlabelNameString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrDebugUtilsLabelEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrDebugUtilsLabelEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code labelName} field. */
    public XrDebugUtilsLabelEXT labelName(@NativeType("char const *") ByteBuffer value) { nlabelName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDebugUtilsLabelEXT set(
        int type,
        long next,
        ByteBuffer labelName
    ) {
        type(type);
        next(next);
        labelName(labelName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDebugUtilsLabelEXT set(XrDebugUtilsLabelEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDebugUtilsLabelEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsLabelEXT malloc() {
        return wrap(XrDebugUtilsLabelEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsLabelEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDebugUtilsLabelEXT calloc() {
        return wrap(XrDebugUtilsLabelEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrDebugUtilsLabelEXT} instance allocated with {@link BufferUtils}. */
    public static XrDebugUtilsLabelEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrDebugUtilsLabelEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrDebugUtilsLabelEXT} instance for the specified memory address. */
    public static XrDebugUtilsLabelEXT create(long address) {
        return wrap(XrDebugUtilsLabelEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsLabelEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrDebugUtilsLabelEXT.class, address);
    }

    /**
     * Returns a new {@link XrDebugUtilsLabelEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsLabelEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsLabelEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsLabelEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsLabelEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsLabelEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrDebugUtilsLabelEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsLabelEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsLabelEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrDebugUtilsLabelEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrDebugUtilsLabelEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrDebugUtilsLabelEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrDebugUtilsLabelEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrDebugUtilsLabelEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsLabelEXT mallocStack(MemoryStack stack) {
        return wrap(XrDebugUtilsLabelEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrDebugUtilsLabelEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDebugUtilsLabelEXT callocStack(MemoryStack stack) {
        return wrap(XrDebugUtilsLabelEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrDebugUtilsLabelEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsLabelEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrDebugUtilsLabelEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsLabelEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrDebugUtilsLabelEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsLabelEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDebugUtilsLabelEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDebugUtilsLabelEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrDebugUtilsLabelEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDebugUtilsLabelEXT.NEXT); }
    /** Unsafe version of {@link #labelName}. */
    public static ByteBuffer nlabelName(long struct) { return memByteBufferNT1(memGetAddress(struct + XrDebugUtilsLabelEXT.LABELNAME)); }
    /** Unsafe version of {@link #labelNameString}. */
    public static String nlabelNameString(long struct) { return memUTF8(memGetAddress(struct + XrDebugUtilsLabelEXT.LABELNAME)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrDebugUtilsLabelEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDebugUtilsLabelEXT.NEXT, check(value)); }
    /** Unsafe version of {@link #labelName(ByteBuffer) labelName}. */
    public static void nlabelName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrDebugUtilsLabelEXT.LABELNAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrDebugUtilsLabelEXT.NEXT));
        check(memGetAddress(struct + XrDebugUtilsLabelEXT.LABELNAME));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrDebugUtilsLabelEXT} structs. */
    public static class Buffer extends StructBuffer<XrDebugUtilsLabelEXT, Buffer> implements NativeResource {

        private static final XrDebugUtilsLabelEXT ELEMENT_FACTORY = XrDebugUtilsLabelEXT.create(-1L);

        /**
         * Creates a new {@code XrDebugUtilsLabelEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDebugUtilsLabelEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrDebugUtilsLabelEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDebugUtilsLabelEXT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrDebugUtilsLabelEXT.nnext(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code labelName} field. */
        @NativeType("char const *")
        public ByteBuffer labelName() { return XrDebugUtilsLabelEXT.nlabelName(address()); }
        /** Decodes the null-terminated string pointed to by the {@code labelName} field. */
        @NativeType("char const *")
        public String labelNameString() { return XrDebugUtilsLabelEXT.nlabelNameString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrDebugUtilsLabelEXT.Buffer type(@NativeType("XrStructureType") int value) { XrDebugUtilsLabelEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrDebugUtilsLabelEXT.Buffer next(@NativeType("void const *") long value) { XrDebugUtilsLabelEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code labelName} field. */
        public XrDebugUtilsLabelEXT.Buffer labelName(@NativeType("char const *") ByteBuffer value) { XrDebugUtilsLabelEXT.nlabelName(address(), value); return this; }

    }

}