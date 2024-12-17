/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrHapticPcmVibrationFB {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t bufferSize;
 *     float const * buffer;
 *     float sampleRate;
 *     XrBool32 append;
 *     uint32_t * samplesConsumed;
 * }}</pre>
 */
public class XrHapticPcmVibrationFB extends Struct<XrHapticPcmVibrationFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BUFFERSIZE,
        BUFFER,
        SAMPLERATE,
        APPEND,
        SAMPLESCONSUMED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BUFFERSIZE = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        SAMPLERATE = layout.offsetof(4);
        APPEND = layout.offsetof(5);
        SAMPLESCONSUMED = layout.offsetof(6);
    }

    protected XrHapticPcmVibrationFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHapticPcmVibrationFB create(long address, @Nullable ByteBuffer container) {
        return new XrHapticPcmVibrationFB(address, container);
    }

    /**
     * Creates a {@code XrHapticPcmVibrationFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticPcmVibrationFB(ByteBuffer container) {
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
    /** @return the value of the {@code bufferSize} field. */
    @NativeType("uint32_t")
    public int bufferSize() { return nbufferSize(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("float const *")
    public FloatBuffer buffer() { return nbuffer(address()); }
    /** @return the value of the {@code sampleRate} field. */
    public float sampleRate() { return nsampleRate(address()); }
    /** @return the value of the {@code append} field. */
    @NativeType("XrBool32")
    public boolean append() { return nappend(address()) != 0; }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code samplesConsumed} field. */
    @NativeType("uint32_t *")
    public IntBuffer samplesConsumed(int capacity) { return nsamplesConsumed(address(), capacity); }

    /** Sets the specified value to the {@code type} field. */
    public XrHapticPcmVibrationFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBHapticPcm#XR_TYPE_HAPTIC_PCM_VIBRATION_FB TYPE_HAPTIC_PCM_VIBRATION_FB} value to the {@code type} field. */
    public XrHapticPcmVibrationFB type$Default() { return type(FBHapticPcm.XR_TYPE_HAPTIC_PCM_VIBRATION_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrHapticPcmVibrationFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code buffer} field. */
    public XrHapticPcmVibrationFB buffer(@NativeType("float const *") FloatBuffer value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code sampleRate} field. */
    public XrHapticPcmVibrationFB sampleRate(float value) { nsampleRate(address(), value); return this; }
    /** Sets the specified value to the {@code append} field. */
    public XrHapticPcmVibrationFB append(@NativeType("XrBool32") boolean value) { nappend(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code samplesConsumed} field. */
    public XrHapticPcmVibrationFB samplesConsumed(@NativeType("uint32_t *") IntBuffer value) { nsamplesConsumed(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticPcmVibrationFB set(
        int type,
        long next,
        FloatBuffer buffer,
        float sampleRate,
        boolean append,
        IntBuffer samplesConsumed
    ) {
        type(type);
        next(next);
        buffer(buffer);
        sampleRate(sampleRate);
        append(append);
        samplesConsumed(samplesConsumed);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticPcmVibrationFB set(XrHapticPcmVibrationFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticPcmVibrationFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticPcmVibrationFB malloc() {
        return new XrHapticPcmVibrationFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHapticPcmVibrationFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticPcmVibrationFB calloc() {
        return new XrHapticPcmVibrationFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHapticPcmVibrationFB} instance allocated with {@link BufferUtils}. */
    public static XrHapticPcmVibrationFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHapticPcmVibrationFB(memAddress(container), container);
    }

    /** Returns a new {@code XrHapticPcmVibrationFB} instance for the specified memory address. */
    public static XrHapticPcmVibrationFB create(long address) {
        return new XrHapticPcmVibrationFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHapticPcmVibrationFB createSafe(long address) {
        return address == NULL ? null : new XrHapticPcmVibrationFB(address, null);
    }

    /** Downcasts the specified {@code XrHapticBaseHeader} instance to {@code XrHapticPcmVibrationFB}. */
    public static XrHapticPcmVibrationFB create(XrHapticBaseHeader value) {
        return new XrHapticPcmVibrationFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrHapticPcmVibrationFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticPcmVibrationFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticPcmVibrationFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticPcmVibrationFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticPcmVibrationFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticPcmVibrationFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHapticPcmVibrationFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticPcmVibrationFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHapticPcmVibrationFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrHapticBaseHeader.Buffer} instance to {@code XrHapticPcmVibrationFB.Buffer}. */
    public static XrHapticPcmVibrationFB.Buffer create(XrHapticBaseHeader.Buffer value) {
        return new XrHapticPcmVibrationFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrHapticPcmVibrationFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticPcmVibrationFB malloc(MemoryStack stack) {
        return new XrHapticPcmVibrationFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHapticPcmVibrationFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticPcmVibrationFB calloc(MemoryStack stack) {
        return new XrHapticPcmVibrationFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHapticPcmVibrationFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticPcmVibrationFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticPcmVibrationFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticPcmVibrationFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHapticPcmVibrationFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticPcmVibrationFB.NEXT); }
    /** Unsafe version of {@link #bufferSize}. */
    public static int nbufferSize(long struct) { return memGetInt(struct + XrHapticPcmVibrationFB.BUFFERSIZE); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static FloatBuffer nbuffer(long struct) { return memFloatBuffer(memGetAddress(struct + XrHapticPcmVibrationFB.BUFFER), nbufferSize(struct)); }
    /** Unsafe version of {@link #sampleRate}. */
    public static float nsampleRate(long struct) { return memGetFloat(struct + XrHapticPcmVibrationFB.SAMPLERATE); }
    /** Unsafe version of {@link #append}. */
    public static int nappend(long struct) { return memGetInt(struct + XrHapticPcmVibrationFB.APPEND); }
    /** Unsafe version of {@link #samplesConsumed(int) samplesConsumed}. */
    public static IntBuffer nsamplesConsumed(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + XrHapticPcmVibrationFB.SAMPLESCONSUMED), capacity); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHapticPcmVibrationFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticPcmVibrationFB.NEXT, value); }
    /** Sets the specified value to the {@code bufferSize} field of the specified {@code struct}. */
    public static void nbufferSize(long struct, int value) { memPutInt(struct + XrHapticPcmVibrationFB.BUFFERSIZE, value); }
    /** Unsafe version of {@link #buffer(FloatBuffer) buffer}. */
    public static void nbuffer(long struct, FloatBuffer value) { memPutAddress(struct + XrHapticPcmVibrationFB.BUFFER, memAddress(value)); nbufferSize(struct, value.remaining()); }
    /** Unsafe version of {@link #sampleRate(float) sampleRate}. */
    public static void nsampleRate(long struct, float value) { memPutFloat(struct + XrHapticPcmVibrationFB.SAMPLERATE, value); }
    /** Unsafe version of {@link #append(boolean) append}. */
    public static void nappend(long struct, int value) { memPutInt(struct + XrHapticPcmVibrationFB.APPEND, value); }
    /** Unsafe version of {@link #samplesConsumed(IntBuffer) samplesConsumed}. */
    public static void nsamplesConsumed(long struct, IntBuffer value) { memPutAddress(struct + XrHapticPcmVibrationFB.SAMPLESCONSUMED, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHapticPcmVibrationFB.BUFFER));
        check(memGetAddress(struct + XrHapticPcmVibrationFB.SAMPLESCONSUMED));
    }

    // -----------------------------------

    /** An array of {@link XrHapticPcmVibrationFB} structs. */
    public static class Buffer extends StructBuffer<XrHapticPcmVibrationFB, Buffer> implements NativeResource {

        private static final XrHapticPcmVibrationFB ELEMENT_FACTORY = XrHapticPcmVibrationFB.create(-1L);

        /**
         * Creates a new {@code XrHapticPcmVibrationFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticPcmVibrationFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHapticPcmVibrationFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticPcmVibrationFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHapticPcmVibrationFB.nnext(address()); }
        /** @return the value of the {@code bufferSize} field. */
        @NativeType("uint32_t")
        public int bufferSize() { return XrHapticPcmVibrationFB.nbufferSize(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("float const *")
        public FloatBuffer buffer() { return XrHapticPcmVibrationFB.nbuffer(address()); }
        /** @return the value of the {@code sampleRate} field. */
        public float sampleRate() { return XrHapticPcmVibrationFB.nsampleRate(address()); }
        /** @return the value of the {@code append} field. */
        @NativeType("XrBool32")
        public boolean append() { return XrHapticPcmVibrationFB.nappend(address()) != 0; }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code samplesConsumed} field. */
        @NativeType("uint32_t *")
        public IntBuffer samplesConsumed(int capacity) { return XrHapticPcmVibrationFB.nsamplesConsumed(address(), capacity); }

        /** Sets the specified value to the {@code type} field. */
        public XrHapticPcmVibrationFB.Buffer type(@NativeType("XrStructureType") int value) { XrHapticPcmVibrationFB.ntype(address(), value); return this; }
        /** Sets the {@link FBHapticPcm#XR_TYPE_HAPTIC_PCM_VIBRATION_FB TYPE_HAPTIC_PCM_VIBRATION_FB} value to the {@code type} field. */
        public XrHapticPcmVibrationFB.Buffer type$Default() { return type(FBHapticPcm.XR_TYPE_HAPTIC_PCM_VIBRATION_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrHapticPcmVibrationFB.Buffer next(@NativeType("void const *") long value) { XrHapticPcmVibrationFB.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code buffer} field. */
        public XrHapticPcmVibrationFB.Buffer buffer(@NativeType("float const *") FloatBuffer value) { XrHapticPcmVibrationFB.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code sampleRate} field. */
        public XrHapticPcmVibrationFB.Buffer sampleRate(float value) { XrHapticPcmVibrationFB.nsampleRate(address(), value); return this; }
        /** Sets the specified value to the {@code append} field. */
        public XrHapticPcmVibrationFB.Buffer append(@NativeType("XrBool32") boolean value) { XrHapticPcmVibrationFB.nappend(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code samplesConsumed} field. */
        public XrHapticPcmVibrationFB.Buffer samplesConsumed(@NativeType("uint32_t *") IntBuffer value) { XrHapticPcmVibrationFB.nsamplesConsumed(address(), value); return this; }

    }

}