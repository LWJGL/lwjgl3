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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHapticVibration {
 *     XrStructureType type;
 *     void const * next;
 *     XrDuration duration;
 *     float frequency;
 *     float amplitude;
 * }</code></pre>
 */
public class XrHapticVibration extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DURATION,
        FREQUENCY,
        AMPLITUDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DURATION = layout.offsetof(2);
        FREQUENCY = layout.offsetof(3);
        AMPLITUDE = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrHapticVibration} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticVibration(ByteBuffer container) {
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
    /** Returns the value of the {@code duration} field. */
    @NativeType("XrDuration")
    public long duration() { return nduration(address()); }
    /** Returns the value of the {@code frequency} field. */
    public float frequency() { return nfrequency(address()); }
    /** Returns the value of the {@code amplitude} field. */
    public float amplitude() { return namplitude(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHapticVibration type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrHapticVibration next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code duration} field. */
    public XrHapticVibration duration(@NativeType("XrDuration") long value) { nduration(address(), value); return this; }
    /** Sets the specified value to the {@code frequency} field. */
    public XrHapticVibration frequency(float value) { nfrequency(address(), value); return this; }
    /** Sets the specified value to the {@code amplitude} field. */
    public XrHapticVibration amplitude(float value) { namplitude(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticVibration set(
        int type,
        long next,
        long duration,
        float frequency,
        float amplitude
    ) {
        type(type);
        next(next);
        duration(duration);
        frequency(frequency);
        amplitude(amplitude);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticVibration set(XrHapticVibration src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticVibration} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticVibration malloc() {
        return wrap(XrHapticVibration.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHapticVibration} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticVibration calloc() {
        return wrap(XrHapticVibration.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHapticVibration} instance allocated with {@link BufferUtils}. */
    public static XrHapticVibration create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHapticVibration.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHapticVibration} instance for the specified memory address. */
    public static XrHapticVibration create(long address) {
        return wrap(XrHapticVibration.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHapticVibration createSafe(long address) {
        return address == NULL ? null : wrap(XrHapticVibration.class, address);
    }

    /**
     * Returns a new {@link XrHapticVibration.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticVibration.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticVibration.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticVibration.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticVibration.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticVibration.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHapticVibration.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticVibration.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHapticVibration.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticVibration} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrHapticVibration mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrHapticVibration} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrHapticVibration callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrHapticVibration} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticVibration mallocStack(MemoryStack stack) {
        return wrap(XrHapticVibration.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHapticVibration} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticVibration callocStack(MemoryStack stack) {
        return wrap(XrHapticVibration.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHapticVibration.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticVibration.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHapticVibration.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticVibration.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHapticVibration.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticVibration.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticVibration.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticVibration.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHapticVibration.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticVibration.NEXT); }
    /** Unsafe version of {@link #duration}. */
    public static long nduration(long struct) { return UNSAFE.getLong(null, struct + XrHapticVibration.DURATION); }
    /** Unsafe version of {@link #frequency}. */
    public static float nfrequency(long struct) { return UNSAFE.getFloat(null, struct + XrHapticVibration.FREQUENCY); }
    /** Unsafe version of {@link #amplitude}. */
    public static float namplitude(long struct) { return UNSAFE.getFloat(null, struct + XrHapticVibration.AMPLITUDE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHapticVibration.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticVibration.NEXT, value); }
    /** Unsafe version of {@link #duration(long) duration}. */
    public static void nduration(long struct, long value) { UNSAFE.putLong(null, struct + XrHapticVibration.DURATION, value); }
    /** Unsafe version of {@link #frequency(float) frequency}. */
    public static void nfrequency(long struct, float value) { UNSAFE.putFloat(null, struct + XrHapticVibration.FREQUENCY, value); }
    /** Unsafe version of {@link #amplitude(float) amplitude}. */
    public static void namplitude(long struct, float value) { UNSAFE.putFloat(null, struct + XrHapticVibration.AMPLITUDE, value); }

    // -----------------------------------

    /** An array of {@link XrHapticVibration} structs. */
    public static class Buffer extends StructBuffer<XrHapticVibration, Buffer> implements NativeResource {

        private static final XrHapticVibration ELEMENT_FACTORY = XrHapticVibration.create(-1L);

        /**
         * Creates a new {@code XrHapticVibration.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticVibration#SIZEOF}, and its mark will be undefined.
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
        protected XrHapticVibration getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticVibration.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHapticVibration.nnext(address()); }
        /** Returns the value of the {@code duration} field. */
        @NativeType("XrDuration")
        public long duration() { return XrHapticVibration.nduration(address()); }
        /** Returns the value of the {@code frequency} field. */
        public float frequency() { return XrHapticVibration.nfrequency(address()); }
        /** Returns the value of the {@code amplitude} field. */
        public float amplitude() { return XrHapticVibration.namplitude(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHapticVibration.Buffer type(@NativeType("XrStructureType") int value) { XrHapticVibration.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrHapticVibration.Buffer next(@NativeType("void const *") long value) { XrHapticVibration.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code duration} field. */
        public XrHapticVibration.Buffer duration(@NativeType("XrDuration") long value) { XrHapticVibration.nduration(address(), value); return this; }
        /** Sets the specified value to the {@code frequency} field. */
        public XrHapticVibration.Buffer frequency(float value) { XrHapticVibration.nfrequency(address(), value); return this; }
        /** Sets the specified value to the {@code amplitude} field. */
        public XrHapticVibration.Buffer amplitude(float value) { XrHapticVibration.namplitude(address(), value); return this; }

    }

}