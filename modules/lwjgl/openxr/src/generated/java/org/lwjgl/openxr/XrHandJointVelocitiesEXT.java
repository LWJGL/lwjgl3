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
 * struct XrHandJointVelocitiesEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t jointCount;
 *     {@link XrHandJointVelocityEXT XrHandJointVelocityEXT} * jointVelocities;
 * }</code></pre>
 */
public class XrHandJointVelocitiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        JOINTCOUNT,
        JOINTVELOCITIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        JOINTCOUNT = layout.offsetof(2);
        JOINTVELOCITIES = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHandJointVelocitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointVelocitiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code jointCount} field. */
    @NativeType("uint32_t")
    public int jointCount() { return njointCount(address()); }
    /** Returns a {@link XrHandJointVelocityEXT.Buffer} view of the struct array pointed to by the {@code jointVelocities} field. */
    @NativeType("XrHandJointVelocityEXT *")
    public XrHandJointVelocityEXT.Buffer jointVelocities() { return njointVelocities(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandJointVelocitiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrHandJointVelocitiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrHandJointVelocityEXT.Buffer} to the {@code jointVelocities} field. */
    public XrHandJointVelocitiesEXT jointVelocities(@NativeType("XrHandJointVelocityEXT *") XrHandJointVelocityEXT.Buffer value) { njointVelocities(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointVelocitiesEXT set(
        int type,
        long next,
        XrHandJointVelocityEXT.Buffer jointVelocities
    ) {
        type(type);
        next(next);
        jointVelocities(jointVelocities);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandJointVelocitiesEXT set(XrHandJointVelocitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointVelocitiesEXT malloc() {
        return wrap(XrHandJointVelocitiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointVelocitiesEXT calloc() {
        return wrap(XrHandJointVelocitiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointVelocitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandJointVelocitiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance for the specified memory address. */
    public static XrHandJointVelocitiesEXT create(long address) {
        return wrap(XrHandJointVelocitiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointVelocitiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandJointVelocitiesEXT.class, address);
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandJointVelocitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointVelocitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrHandJointVelocitiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrHandJointVelocitiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrHandJointVelocitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointVelocitiesEXT mallocStack(MemoryStack stack) {
        return wrap(XrHandJointVelocitiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandJointVelocitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointVelocitiesEXT callocStack(MemoryStack stack) {
        return wrap(XrHandJointVelocitiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandJointVelocitiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandJointVelocitiesEXT.NEXT); }
    /** Unsafe version of {@link #jointCount}. */
    public static int njointCount(long struct) { return UNSAFE.getInt(null, struct + XrHandJointVelocitiesEXT.JOINTCOUNT); }
    /** Unsafe version of {@link #jointVelocities}. */
    public static XrHandJointVelocityEXT.Buffer njointVelocities(long struct) { return XrHandJointVelocityEXT.create(memGetAddress(struct + XrHandJointVelocitiesEXT.JOINTVELOCITIES), njointCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointVelocitiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandJointVelocitiesEXT.NEXT, check(value)); }
    /** Sets the specified value to the {@code jointCount} field of the specified {@code struct}. */
    public static void njointCount(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointVelocitiesEXT.JOINTCOUNT, value); }
    /** Unsafe version of {@link #jointVelocities(XrHandJointVelocityEXT.Buffer) jointVelocities}. */
    public static void njointVelocities(long struct, XrHandJointVelocityEXT.Buffer value) { memPutAddress(struct + XrHandJointVelocitiesEXT.JOINTVELOCITIES, value.address()); njointCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandJointVelocitiesEXT.NEXT));
        check(memGetAddress(struct + XrHandJointVelocitiesEXT.JOINTVELOCITIES));
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

    /** An array of {@link XrHandJointVelocitiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointVelocitiesEXT, Buffer> implements NativeResource {

        private static final XrHandJointVelocitiesEXT ELEMENT_FACTORY = XrHandJointVelocitiesEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointVelocitiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointVelocitiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandJointVelocitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandJointVelocitiesEXT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrHandJointVelocitiesEXT.nnext(address()); }
        /** Returns the value of the {@code jointCount} field. */
        @NativeType("uint32_t")
        public int jointCount() { return XrHandJointVelocitiesEXT.njointCount(address()); }
        /** Returns a {@link XrHandJointVelocityEXT.Buffer} view of the struct array pointed to by the {@code jointVelocities} field. */
        @NativeType("XrHandJointVelocityEXT *")
        public XrHandJointVelocityEXT.Buffer jointVelocities() { return XrHandJointVelocitiesEXT.njointVelocities(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHandJointVelocitiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandJointVelocitiesEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrHandJointVelocitiesEXT.Buffer next(@NativeType("void *") long value) { XrHandJointVelocitiesEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrHandJointVelocityEXT.Buffer} to the {@code jointVelocities} field. */
        public XrHandJointVelocitiesEXT.Buffer jointVelocities(@NativeType("XrHandJointVelocityEXT *") XrHandJointVelocityEXT.Buffer value) { XrHandJointVelocitiesEXT.njointVelocities(address(), value); return this; }

    }

}