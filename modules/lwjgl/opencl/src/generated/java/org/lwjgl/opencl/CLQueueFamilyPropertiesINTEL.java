/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_queue_family_properties_intel {
 *     cl_command_queue_properties properties;
 *     cl_command_queue_capabilities_intel capabilities;
 *     cl_uint count;
 *     char name[64];
 * }</code></pre>
 */
@NativeType("struct cl_queue_family_properties_intel")
public class CLQueueFamilyPropertiesINTEL extends Struct<CLQueueFamilyPropertiesINTEL> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROPERTIES,
        CAPABILITIES,
        COUNT,
        NAME;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4),
            __array(1, 64)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROPERTIES = layout.offsetof(0);
        CAPABILITIES = layout.offsetof(1);
        COUNT = layout.offsetof(2);
        NAME = layout.offsetof(3);
    }

    protected CLQueueFamilyPropertiesINTEL(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CLQueueFamilyPropertiesINTEL create(long address, @Nullable ByteBuffer container) {
        return new CLQueueFamilyPropertiesINTEL(address, container);
    }

    /**
     * Creates a {@code CLQueueFamilyPropertiesINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLQueueFamilyPropertiesINTEL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code properties} field. */
    @NativeType("cl_command_queue_properties")
    public long properties() { return nproperties(address()); }
    /** @return the value of the {@code capabilities} field. */
    @NativeType("cl_command_queue_capabilities_intel")
    public long capabilities() { return ncapabilities(address()); }
    /** @return the value of the {@code count} field. */
    @NativeType("cl_uint")
    public int count() { return ncount(address()); }
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[64]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[64]")
    public String nameString() { return nnameString(address()); }

    // -----------------------------------

    /** Returns a new {@code CLQueueFamilyPropertiesINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLQueueFamilyPropertiesINTEL malloc() {
        return new CLQueueFamilyPropertiesINTEL(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CLQueueFamilyPropertiesINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLQueueFamilyPropertiesINTEL calloc() {
        return new CLQueueFamilyPropertiesINTEL(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CLQueueFamilyPropertiesINTEL} instance allocated with {@link BufferUtils}. */
    public static CLQueueFamilyPropertiesINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CLQueueFamilyPropertiesINTEL(memAddress(container), container);
    }

    /** Returns a new {@code CLQueueFamilyPropertiesINTEL} instance for the specified memory address. */
    public static CLQueueFamilyPropertiesINTEL create(long address) {
        return new CLQueueFamilyPropertiesINTEL(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CLQueueFamilyPropertiesINTEL createSafe(long address) {
        return address == NULL ? null : new CLQueueFamilyPropertiesINTEL(address, null);
    }

    /**
     * Returns a new {@link CLQueueFamilyPropertiesINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLQueueFamilyPropertiesINTEL.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLQueueFamilyPropertiesINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLQueueFamilyPropertiesINTEL.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLQueueFamilyPropertiesINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLQueueFamilyPropertiesINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CLQueueFamilyPropertiesINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLQueueFamilyPropertiesINTEL.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CLQueueFamilyPropertiesINTEL.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CLQueueFamilyPropertiesINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLQueueFamilyPropertiesINTEL malloc(MemoryStack stack) {
        return new CLQueueFamilyPropertiesINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CLQueueFamilyPropertiesINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLQueueFamilyPropertiesINTEL calloc(MemoryStack stack) {
        return new CLQueueFamilyPropertiesINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CLQueueFamilyPropertiesINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLQueueFamilyPropertiesINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLQueueFamilyPropertiesINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLQueueFamilyPropertiesINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #properties}. */
    public static long nproperties(long struct) { return memGetLong(struct + CLQueueFamilyPropertiesINTEL.PROPERTIES); }
    /** Unsafe version of {@link #capabilities}. */
    public static long ncapabilities(long struct) { return memGetLong(struct + CLQueueFamilyPropertiesINTEL.CAPABILITIES); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return memGetInt(struct + CLQueueFamilyPropertiesINTEL.COUNT); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + CLQueueFamilyPropertiesINTEL.NAME, 64); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(struct + CLQueueFamilyPropertiesINTEL.NAME); }

    // -----------------------------------

    /** An array of {@link CLQueueFamilyPropertiesINTEL} structs. */
    public static class Buffer extends StructBuffer<CLQueueFamilyPropertiesINTEL, Buffer> implements NativeResource {

        private static final CLQueueFamilyPropertiesINTEL ELEMENT_FACTORY = CLQueueFamilyPropertiesINTEL.create(-1L);

        /**
         * Creates a new {@code CLQueueFamilyPropertiesINTEL.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLQueueFamilyPropertiesINTEL#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected CLQueueFamilyPropertiesINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code properties} field. */
        @NativeType("cl_command_queue_properties")
        public long properties() { return CLQueueFamilyPropertiesINTEL.nproperties(address()); }
        /** @return the value of the {@code capabilities} field. */
        @NativeType("cl_command_queue_capabilities_intel")
        public long capabilities() { return CLQueueFamilyPropertiesINTEL.ncapabilities(address()); }
        /** @return the value of the {@code count} field. */
        @NativeType("cl_uint")
        public int count() { return CLQueueFamilyPropertiesINTEL.ncount(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[64]")
        public ByteBuffer name() { return CLQueueFamilyPropertiesINTEL.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[64]")
        public String nameString() { return CLQueueFamilyPropertiesINTEL.nnameString(address()); }

    }

}