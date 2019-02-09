/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Defines a property attribute.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code name} &ndash; the name of the attribute</li>
 * <li>{@code value} &ndash; the value of the attribute (usually empty)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct objc_property_attribute_t {
 *     char * name;
 *     char * value;
 * }</code></pre>
 */
@NativeType("struct objc_property_attribute_t")
public class ObjCPropertyAttribute extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        VALUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        VALUE = layout.offsetof(1);
    }

    /**
     * Creates a {@code ObjCPropertyAttribute} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ObjCPropertyAttribute(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public String nameString() { return nnameString(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code value} field. */
    @NativeType("char *")
    public ByteBuffer value() { return nvalue(address()); }
    /** Decodes the null-terminated string pointed to by the {@code value} field. */
    @NativeType("char *")
    public String valueString() { return nvalueString(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public ObjCPropertyAttribute name(@NativeType("char *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code value} field. */
    public ObjCPropertyAttribute value(@NativeType("char *") ByteBuffer value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ObjCPropertyAttribute set(
        ByteBuffer name,
        ByteBuffer value
    ) {
        name(name);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ObjCPropertyAttribute set(ObjCPropertyAttribute src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ObjCPropertyAttribute} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ObjCPropertyAttribute malloc() {
        return wrap(ObjCPropertyAttribute.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ObjCPropertyAttribute} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ObjCPropertyAttribute calloc() {
        return wrap(ObjCPropertyAttribute.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ObjCPropertyAttribute} instance allocated with {@link BufferUtils}. */
    public static ObjCPropertyAttribute create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ObjCPropertyAttribute.class, memAddress(container), container);
    }

    /** Returns a new {@code ObjCPropertyAttribute} instance for the specified memory address. */
    public static ObjCPropertyAttribute create(long address) {
        return wrap(ObjCPropertyAttribute.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ObjCPropertyAttribute createSafe(long address) {
        return address == NULL ? null : wrap(ObjCPropertyAttribute.class, address);
    }

    /**
     * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCPropertyAttribute.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCPropertyAttribute.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCPropertyAttribute.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ObjCPropertyAttribute.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ObjCPropertyAttribute.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ObjCPropertyAttribute.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ObjCPropertyAttribute} instance allocated on the thread-local {@link MemoryStack}. */
    public static ObjCPropertyAttribute mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ObjCPropertyAttribute} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ObjCPropertyAttribute callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ObjCPropertyAttribute} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ObjCPropertyAttribute mallocStack(MemoryStack stack) {
        return wrap(ObjCPropertyAttribute.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ObjCPropertyAttribute} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ObjCPropertyAttribute callocStack(MemoryStack stack) {
        return wrap(ObjCPropertyAttribute.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCPropertyAttribute.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCPropertyAttribute.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ObjCPropertyAttribute.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ObjCPropertyAttribute.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ObjCPropertyAttribute.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + ObjCPropertyAttribute.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + ObjCPropertyAttribute.NAME)); }
    /** Unsafe version of {@link #value}. */
    public static ByteBuffer nvalue(long struct) { return memByteBufferNT1(memGetAddress(struct + ObjCPropertyAttribute.VALUE)); }
    /** Unsafe version of {@link #valueString}. */
    public static String nvalueString(long struct) { return memUTF8(memGetAddress(struct + ObjCPropertyAttribute.VALUE)); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + ObjCPropertyAttribute.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #value(ByteBuffer) value}. */
    public static void nvalue(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + ObjCPropertyAttribute.VALUE, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ObjCPropertyAttribute.NAME));
        check(memGetAddress(struct + ObjCPropertyAttribute.VALUE));
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

    /** An array of {@link ObjCPropertyAttribute} structs. */
    public static class Buffer extends StructBuffer<ObjCPropertyAttribute, Buffer> implements NativeResource {

        private static final ObjCPropertyAttribute ELEMENT_FACTORY = ObjCPropertyAttribute.create(-1L);

        /**
         * Creates a new {@code ObjCPropertyAttribute.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ObjCPropertyAttribute#SIZEOF}, and its mark will be undefined.
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
        protected ObjCPropertyAttribute getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public ByteBuffer name() { return ObjCPropertyAttribute.nname(address()); }
        /** Decodes the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public String nameString() { return ObjCPropertyAttribute.nnameString(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code value} field. */
        @NativeType("char *")
        public ByteBuffer value() { return ObjCPropertyAttribute.nvalue(address()); }
        /** Decodes the null-terminated string pointed to by the {@code value} field. */
        @NativeType("char *")
        public String valueString() { return ObjCPropertyAttribute.nvalueString(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public ObjCPropertyAttribute.Buffer name(@NativeType("char *") ByteBuffer value) { ObjCPropertyAttribute.nname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code value} field. */
        public ObjCPropertyAttribute.Buffer value(@NativeType("char *") ByteBuffer value) { ObjCPropertyAttribute.nvalue(address(), value); return this; }

    }

}