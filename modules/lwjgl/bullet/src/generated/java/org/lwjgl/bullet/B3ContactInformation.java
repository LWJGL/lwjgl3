/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

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
 * struct b3ContactInformation {
 *     int m_numContactPoints;
 *     {@link B3ContactPointData struct b3ContactPointData} * m_contactPointData;
 * }</code></pre>
 */
@NativeType("struct b3ContactInformation")
public class B3ContactInformation extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NUMCONTACTPOINTS,
        M_CONTACTPOINTDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NUMCONTACTPOINTS = layout.offsetof(0);
        M_CONTACTPOINTDATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code B3ContactInformation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3ContactInformation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_numContactPoints} field. */
    public int m_numContactPoints() { return nm_numContactPoints(address()); }
    /** Returns a {@link B3ContactPointData.Buffer} view of the struct array pointed to by the {@code m_contactPointData} field. */
    @NativeType("struct b3ContactPointData *")
    public B3ContactPointData.Buffer m_contactPointData() { return nm_contactPointData(address()); }

    /** Sets the address of the specified {@link B3ContactPointData.Buffer} to the {@code m_contactPointData} field. */
    public B3ContactInformation m_contactPointData(@NativeType("struct b3ContactPointData *") B3ContactPointData.Buffer value) { nm_contactPointData(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3ContactInformation set(B3ContactInformation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3ContactInformation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3ContactInformation malloc() {
        return wrap(B3ContactInformation.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3ContactInformation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3ContactInformation calloc() {
        return wrap(B3ContactInformation.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3ContactInformation} instance allocated with {@link BufferUtils}. */
    public static B3ContactInformation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3ContactInformation.class, memAddress(container), container);
    }

    /** Returns a new {@code B3ContactInformation} instance for the specified memory address. */
    public static B3ContactInformation create(long address) {
        return wrap(B3ContactInformation.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3ContactInformation createSafe(long address) {
        return address == NULL ? null : wrap(B3ContactInformation.class, address);
    }

    /**
     * Returns a new {@link B3ContactInformation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactInformation.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3ContactInformation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactInformation.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3ContactInformation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactInformation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3ContactInformation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3ContactInformation.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3ContactInformation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3ContactInformation} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3ContactInformation mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3ContactInformation} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3ContactInformation callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3ContactInformation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3ContactInformation mallocStack(MemoryStack stack) {
        return wrap(B3ContactInformation.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3ContactInformation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3ContactInformation callocStack(MemoryStack stack) {
        return wrap(B3ContactInformation.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3ContactInformation.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactInformation.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3ContactInformation.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactInformation.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3ContactInformation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3ContactInformation.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3ContactInformation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3ContactInformation.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_numContactPoints}. */
    public static int nm_numContactPoints(long struct) { return UNSAFE.getInt(null, struct + B3ContactInformation.M_NUMCONTACTPOINTS); }
    /** Unsafe version of {@link #m_contactPointData}. */
    public static B3ContactPointData.Buffer nm_contactPointData(long struct) { return B3ContactPointData.create(memGetAddress(struct + B3ContactInformation.M_CONTACTPOINTDATA), nm_numContactPoints(struct)); }

    /** Sets the specified value to the {@code m_numContactPoints} field of the specified {@code struct}. */
    public static void nm_numContactPoints(long struct, int value) { UNSAFE.putInt(null, struct + B3ContactInformation.M_NUMCONTACTPOINTS, value); }
    /** Unsafe version of {@link #m_contactPointData(B3ContactPointData.Buffer) m_contactPointData}. */
    public static void nm_contactPointData(long struct, B3ContactPointData.Buffer value) { memPutAddress(struct + B3ContactInformation.M_CONTACTPOINTDATA, value.address()); nm_numContactPoints(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + B3ContactInformation.M_CONTACTPOINTDATA));
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

    /** An array of {@link B3ContactInformation} structs. */
    public static class Buffer extends StructBuffer<B3ContactInformation, Buffer> implements NativeResource {

        private static final B3ContactInformation ELEMENT_FACTORY = B3ContactInformation.create(-1L);

        /**
         * Creates a new {@code B3ContactInformation.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3ContactInformation#SIZEOF}, and its mark will be undefined.
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
        protected B3ContactInformation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_numContactPoints} field. */
        public int m_numContactPoints() { return B3ContactInformation.nm_numContactPoints(address()); }
        /** Returns a {@link B3ContactPointData.Buffer} view of the struct array pointed to by the {@code m_contactPointData} field. */
        @NativeType("struct b3ContactPointData *")
        public B3ContactPointData.Buffer m_contactPointData() { return B3ContactInformation.nm_contactPointData(address()); }

        /** Sets the address of the specified {@link B3ContactPointData.Buffer} to the {@code m_contactPointData} field. */
        public B3ContactInformation.Buffer m_contactPointData(@NativeType("struct b3ContactPointData *") B3ContactPointData.Buffer value) { B3ContactInformation.nm_contactPointData(address(), value); return this; }

    }

}