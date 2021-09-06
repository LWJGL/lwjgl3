/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents a row-major 3x3 matrix.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiMatrix3x3 {
 *     float a1;
 *     float a2;
 *     float a3;
 *     float b1;
 *     float b2;
 *     float b3;
 *     float c1;
 *     float c2;
 *     float c3;
 * }</code></pre>
 */
@NativeType("struct aiMatrix3x3")
public class AIMatrix3x3 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        A1,
        A2,
        A3,
        B1,
        B2,
        B3,
        C1,
        C2,
        C3;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        A1 = layout.offsetof(0);
        A2 = layout.offsetof(1);
        A3 = layout.offsetof(2);
        B1 = layout.offsetof(3);
        B2 = layout.offsetof(4);
        B3 = layout.offsetof(5);
        C1 = layout.offsetof(6);
        C2 = layout.offsetof(7);
        C3 = layout.offsetof(8);
    }

    /**
     * Creates a {@code AIMatrix3x3} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMatrix3x3(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code a1} field. */
    public float a1() { return na1(address()); }
    /** @return the value of the {@code a2} field. */
    public float a2() { return na2(address()); }
    /** @return the value of the {@code a3} field. */
    public float a3() { return na3(address()); }
    /** @return the value of the {@code b1} field. */
    public float b1() { return nb1(address()); }
    /** @return the value of the {@code b2} field. */
    public float b2() { return nb2(address()); }
    /** @return the value of the {@code b3} field. */
    public float b3() { return nb3(address()); }
    /** @return the value of the {@code c1} field. */
    public float c1() { return nc1(address()); }
    /** @return the value of the {@code c2} field. */
    public float c2() { return nc2(address()); }
    /** @return the value of the {@code c3} field. */
    public float c3() { return nc3(address()); }

    /** Sets the specified value to the {@code a1} field. */
    public AIMatrix3x3 a1(float value) { na1(address(), value); return this; }
    /** Sets the specified value to the {@code a2} field. */
    public AIMatrix3x3 a2(float value) { na2(address(), value); return this; }
    /** Sets the specified value to the {@code a3} field. */
    public AIMatrix3x3 a3(float value) { na3(address(), value); return this; }
    /** Sets the specified value to the {@code b1} field. */
    public AIMatrix3x3 b1(float value) { nb1(address(), value); return this; }
    /** Sets the specified value to the {@code b2} field. */
    public AIMatrix3x3 b2(float value) { nb2(address(), value); return this; }
    /** Sets the specified value to the {@code b3} field. */
    public AIMatrix3x3 b3(float value) { nb3(address(), value); return this; }
    /** Sets the specified value to the {@code c1} field. */
    public AIMatrix3x3 c1(float value) { nc1(address(), value); return this; }
    /** Sets the specified value to the {@code c2} field. */
    public AIMatrix3x3 c2(float value) { nc2(address(), value); return this; }
    /** Sets the specified value to the {@code c3} field. */
    public AIMatrix3x3 c3(float value) { nc3(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMatrix3x3 set(
        float a1,
        float a2,
        float a3,
        float b1,
        float b2,
        float b3,
        float c1,
        float c2,
        float c3
    ) {
        a1(a1);
        a2(a2);
        a3(a3);
        b1(b1);
        b2(b2);
        b3(b3);
        c1(c1);
        c2(c2);
        c3(c3);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMatrix3x3 set(AIMatrix3x3 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIMatrix3x3} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMatrix3x3 malloc() {
        return wrap(AIMatrix3x3.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIMatrix3x3} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMatrix3x3 calloc() {
        return wrap(AIMatrix3x3.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIMatrix3x3} instance allocated with {@link BufferUtils}. */
    public static AIMatrix3x3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIMatrix3x3.class, memAddress(container), container);
    }

    /** Returns a new {@code AIMatrix3x3} instance for the specified memory address. */
    public static AIMatrix3x3 create(long address) {
        return wrap(AIMatrix3x3.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMatrix3x3 createSafe(long address) {
        return address == NULL ? null : wrap(AIMatrix3x3.class, address);
    }

    /**
     * Returns a new {@link AIMatrix3x3.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMatrix3x3.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIMatrix3x3.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMatrix3x3.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMatrix3x3.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMatrix3x3.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIMatrix3x3.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMatrix3x3.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMatrix3x3.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMatrix3x3 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMatrix3x3 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMatrix3x3 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMatrix3x3 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMatrix3x3.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMatrix3x3.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMatrix3x3.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMatrix3x3.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIMatrix3x3} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMatrix3x3 malloc(MemoryStack stack) {
        return wrap(AIMatrix3x3.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIMatrix3x3} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMatrix3x3 calloc(MemoryStack stack) {
        return wrap(AIMatrix3x3.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMatrix3x3.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMatrix3x3.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMatrix3x3.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMatrix3x3.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #a1}. */
    public static float na1(long struct) { return UNSAFE.getFloat(null, struct + AIMatrix3x3.A1); }
    /** Unsafe version of {@link #a2}. */
    public static float na2(long struct) { return UNSAFE.getFloat(null, struct + AIMatrix3x3.A2); }
    /** Unsafe version of {@link #a3}. */
    public static float na3(long struct) { return UNSAFE.getFloat(null, struct + AIMatrix3x3.A3); }
    /** Unsafe version of {@link #b1}. */
    public static float nb1(long struct) { return UNSAFE.getFloat(null, struct + AIMatrix3x3.B1); }
    /** Unsafe version of {@link #b2}. */
    public static float nb2(long struct) { return UNSAFE.getFloat(null, struct + AIMatrix3x3.B2); }
    /** Unsafe version of {@link #b3}. */
    public static float nb3(long struct) { return UNSAFE.getFloat(null, struct + AIMatrix3x3.B3); }
    /** Unsafe version of {@link #c1}. */
    public static float nc1(long struct) { return UNSAFE.getFloat(null, struct + AIMatrix3x3.C1); }
    /** Unsafe version of {@link #c2}. */
    public static float nc2(long struct) { return UNSAFE.getFloat(null, struct + AIMatrix3x3.C2); }
    /** Unsafe version of {@link #c3}. */
    public static float nc3(long struct) { return UNSAFE.getFloat(null, struct + AIMatrix3x3.C3); }

    /** Unsafe version of {@link #a1(float) a1}. */
    public static void na1(long struct, float value) { UNSAFE.putFloat(null, struct + AIMatrix3x3.A1, value); }
    /** Unsafe version of {@link #a2(float) a2}. */
    public static void na2(long struct, float value) { UNSAFE.putFloat(null, struct + AIMatrix3x3.A2, value); }
    /** Unsafe version of {@link #a3(float) a3}. */
    public static void na3(long struct, float value) { UNSAFE.putFloat(null, struct + AIMatrix3x3.A3, value); }
    /** Unsafe version of {@link #b1(float) b1}. */
    public static void nb1(long struct, float value) { UNSAFE.putFloat(null, struct + AIMatrix3x3.B1, value); }
    /** Unsafe version of {@link #b2(float) b2}. */
    public static void nb2(long struct, float value) { UNSAFE.putFloat(null, struct + AIMatrix3x3.B2, value); }
    /** Unsafe version of {@link #b3(float) b3}. */
    public static void nb3(long struct, float value) { UNSAFE.putFloat(null, struct + AIMatrix3x3.B3, value); }
    /** Unsafe version of {@link #c1(float) c1}. */
    public static void nc1(long struct, float value) { UNSAFE.putFloat(null, struct + AIMatrix3x3.C1, value); }
    /** Unsafe version of {@link #c2(float) c2}. */
    public static void nc2(long struct, float value) { UNSAFE.putFloat(null, struct + AIMatrix3x3.C2, value); }
    /** Unsafe version of {@link #c3(float) c3}. */
    public static void nc3(long struct, float value) { UNSAFE.putFloat(null, struct + AIMatrix3x3.C3, value); }

    // -----------------------------------

    /** An array of {@link AIMatrix3x3} structs. */
    public static class Buffer extends StructBuffer<AIMatrix3x3, Buffer> implements NativeResource {

        private static final AIMatrix3x3 ELEMENT_FACTORY = AIMatrix3x3.create(-1L);

        /**
         * Creates a new {@code AIMatrix3x3.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMatrix3x3#SIZEOF}, and its mark will be undefined.
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
        protected AIMatrix3x3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code a1} field. */
        public float a1() { return AIMatrix3x3.na1(address()); }
        /** @return the value of the {@code a2} field. */
        public float a2() { return AIMatrix3x3.na2(address()); }
        /** @return the value of the {@code a3} field. */
        public float a3() { return AIMatrix3x3.na3(address()); }
        /** @return the value of the {@code b1} field. */
        public float b1() { return AIMatrix3x3.nb1(address()); }
        /** @return the value of the {@code b2} field. */
        public float b2() { return AIMatrix3x3.nb2(address()); }
        /** @return the value of the {@code b3} field. */
        public float b3() { return AIMatrix3x3.nb3(address()); }
        /** @return the value of the {@code c1} field. */
        public float c1() { return AIMatrix3x3.nc1(address()); }
        /** @return the value of the {@code c2} field. */
        public float c2() { return AIMatrix3x3.nc2(address()); }
        /** @return the value of the {@code c3} field. */
        public float c3() { return AIMatrix3x3.nc3(address()); }

        /** Sets the specified value to the {@code a1} field. */
        public AIMatrix3x3.Buffer a1(float value) { AIMatrix3x3.na1(address(), value); return this; }
        /** Sets the specified value to the {@code a2} field. */
        public AIMatrix3x3.Buffer a2(float value) { AIMatrix3x3.na2(address(), value); return this; }
        /** Sets the specified value to the {@code a3} field. */
        public AIMatrix3x3.Buffer a3(float value) { AIMatrix3x3.na3(address(), value); return this; }
        /** Sets the specified value to the {@code b1} field. */
        public AIMatrix3x3.Buffer b1(float value) { AIMatrix3x3.nb1(address(), value); return this; }
        /** Sets the specified value to the {@code b2} field. */
        public AIMatrix3x3.Buffer b2(float value) { AIMatrix3x3.nb2(address(), value); return this; }
        /** Sets the specified value to the {@code b3} field. */
        public AIMatrix3x3.Buffer b3(float value) { AIMatrix3x3.nb3(address(), value); return this; }
        /** Sets the specified value to the {@code c1} field. */
        public AIMatrix3x3.Buffer c1(float value) { AIMatrix3x3.nc1(address(), value); return this; }
        /** Sets the specified value to the {@code c2} field. */
        public AIMatrix3x3.Buffer c2(float value) { AIMatrix3x3.nc2(address(), value); return this; }
        /** Sets the specified value to the {@code c3} field. */
        public AIMatrix3x3.Buffer c3(float value) { AIMatrix3x3.nc3(address(), value); return this; }

    }

}