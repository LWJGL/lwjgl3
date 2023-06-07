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
 * Haptic Effect Description.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure describes a PCM haptic effect.</p>
 * 
 * <p>The runtime <b>may</b> resample the provided samples in the {@code buffer}, and maintain an internal buffer which <b>should</b> be of {@link FBHapticPcm#XR_MAX_HAPTIC_PCM_BUFFER_SIZE_FB MAX_HAPTIC_PCM_BUFFER_SIZE_FB} length. The resampling <b>should</b> happen based on the {@code sampleRate} and the device’s sample rate.</p>
 * 
 * <p>If {@code append} is {@link XR10#XR_TRUE TRUE} and a preceding {@link XrHapticPcmVibrationFB} haptic effect on this action has not yet completed, then the runtime <b>must</b> finish playing the preceding samples and then play the new haptic effect. If a preceding haptic event on this action has not yet completed, and either the preceding effect is not an {@link XrHapticPcmVibrationFB} haptic effect or {@code append} is {@link XR10#XR_FALSE FALSE}, the runtime <b>must</b> cancel the preceding incomplete effects on that action and start playing the new haptic effect, as usual for the core specification.</p>
 * 
 * <p>When {@code append} is true and a preceding {@link XrHapticPcmVibrationFB} haptic effect on this action has not yet completed, then the application can provide a different {@code sampleRate} in the new haptic effect.</p>
 * 
 * <p>The runtime <b>must</b> populate the {@code samplesConsumed} with the count of the samples from {@code buffer} which were consumed. The {@code samplesConsumed} is populated before the {@link XR10#xrApplyHapticFeedback ApplyHapticFeedback} returns.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBHapticPcm XR_FB_haptic_pcm} extension <b>must</b> be enabled prior to using {@link XrHapticPcmVibrationFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBHapticPcm#XR_TYPE_HAPTIC_PCM_VIBRATION_FB TYPE_HAPTIC_PCM_VIBRATION_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code buffer} <b>must</b> be a pointer to an array of {@code bufferSize} {@code float} values</li>
 * <li>{@code samplesConsumed} <b>must</b> be a pointer to a {@code uint32_t} value</li>
 * <li>The {@code bufferSize} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHapticPcmVibrationFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #bufferSize};
 *     float const * {@link #buffer};
 *     float {@link #sampleRate};
 *     XrBool32 {@link #append};
 *     uint32_t * {@link #samplesConsumed};
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the number of samples in the buffer. */
    @NativeType("uint32_t")
    public int bufferSize() { return nbufferSize(address()); }
    /** a pointer to a float array representing the PCM samples. If you consider the haptic effect as a sampled analog audio, then this buffer will contain the samples representing that effect. The values in this buffer are expected to be in the range [-1.0, 1.0]. */
    @NativeType("float const *")
    public FloatBuffer buffer() { return nbuffer(address()); }
    /** the number of samples to be played per second, this is used to determine the duration of the haptic effect. */
    public float sampleRate() { return nsampleRate(address()); }
    /** if set to {@link XR10#XR_FALSE FALSE}, any existing samples will be cleared and a new haptic effect will begin, if {@link XR10#XR_TRUE TRUE}, samples will be appended to the currently playing effect */
    @NativeType("XrBool32")
    public boolean append() { return nappend(address()) != 0; }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return a pointer to an unsigned integer; it is populated by runtime, to tell the application about how many samples were consumed from the input {@code buffer}
     */
    @NativeType("uint32_t *")
    public IntBuffer samplesConsumed(int capacity) { return nsamplesConsumed(address(), capacity); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHapticPcmVibrationFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBHapticPcm#XR_TYPE_HAPTIC_PCM_VIBRATION_FB TYPE_HAPTIC_PCM_VIBRATION_FB} value to the {@link #type} field. */
    public XrHapticPcmVibrationFB type$Default() { return type(FBHapticPcm.XR_TYPE_HAPTIC_PCM_VIBRATION_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHapticPcmVibrationFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@link #buffer} field. */
    public XrHapticPcmVibrationFB buffer(@NativeType("float const *") FloatBuffer value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #sampleRate} field. */
    public XrHapticPcmVibrationFB sampleRate(float value) { nsampleRate(address(), value); return this; }
    /** Sets the specified value to the {@link #append} field. */
    public XrHapticPcmVibrationFB append(@NativeType("XrBool32") boolean value) { nappend(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #samplesConsumed} field. */
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
    @Nullable
    public static XrHapticPcmVibrationFB createSafe(long address) {
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
    @Nullable
    public static XrHapticPcmVibrationFB.Buffer createSafe(long address, int capacity) {
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
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHapticPcmVibrationFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticPcmVibrationFB.NEXT); }
    /** Unsafe version of {@link #bufferSize}. */
    public static int nbufferSize(long struct) { return UNSAFE.getInt(null, struct + XrHapticPcmVibrationFB.BUFFERSIZE); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static FloatBuffer nbuffer(long struct) { return memFloatBuffer(memGetAddress(struct + XrHapticPcmVibrationFB.BUFFER), nbufferSize(struct)); }
    /** Unsafe version of {@link #sampleRate}. */
    public static float nsampleRate(long struct) { return UNSAFE.getFloat(null, struct + XrHapticPcmVibrationFB.SAMPLERATE); }
    /** Unsafe version of {@link #append}. */
    public static int nappend(long struct) { return UNSAFE.getInt(null, struct + XrHapticPcmVibrationFB.APPEND); }
    /** Unsafe version of {@link #samplesConsumed(int) samplesConsumed}. */
    public static IntBuffer nsamplesConsumed(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + XrHapticPcmVibrationFB.SAMPLESCONSUMED), capacity); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHapticPcmVibrationFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticPcmVibrationFB.NEXT, value); }
    /** Sets the specified value to the {@code bufferSize} field of the specified {@code struct}. */
    public static void nbufferSize(long struct, int value) { UNSAFE.putInt(null, struct + XrHapticPcmVibrationFB.BUFFERSIZE, value); }
    /** Unsafe version of {@link #buffer(FloatBuffer) buffer}. */
    public static void nbuffer(long struct, FloatBuffer value) { memPutAddress(struct + XrHapticPcmVibrationFB.BUFFER, memAddress(value)); nbufferSize(struct, value.remaining()); }
    /** Unsafe version of {@link #sampleRate(float) sampleRate}. */
    public static void nsampleRate(long struct, float value) { UNSAFE.putFloat(null, struct + XrHapticPcmVibrationFB.SAMPLERATE, value); }
    /** Unsafe version of {@link #append(boolean) append}. */
    public static void nappend(long struct, int value) { UNSAFE.putInt(null, struct + XrHapticPcmVibrationFB.APPEND, value); }
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
        protected XrHapticPcmVibrationFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHapticPcmVibrationFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticPcmVibrationFB.ntype(address()); }
        /** @return the value of the {@link XrHapticPcmVibrationFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrHapticPcmVibrationFB.nnext(address()); }
        /** @return the value of the {@link XrHapticPcmVibrationFB#bufferSize} field. */
        @NativeType("uint32_t")
        public int bufferSize() { return XrHapticPcmVibrationFB.nbufferSize(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link XrHapticPcmVibrationFB#buffer} field. */
        @NativeType("float const *")
        public FloatBuffer buffer() { return XrHapticPcmVibrationFB.nbuffer(address()); }
        /** @return the value of the {@link XrHapticPcmVibrationFB#sampleRate} field. */
        public float sampleRate() { return XrHapticPcmVibrationFB.nsampleRate(address()); }
        /** @return the value of the {@link XrHapticPcmVibrationFB#append} field. */
        @NativeType("XrBool32")
        public boolean append() { return XrHapticPcmVibrationFB.nappend(address()) != 0; }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@link XrHapticPcmVibrationFB#samplesConsumed} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint32_t *")
        public IntBuffer samplesConsumed(int capacity) { return XrHapticPcmVibrationFB.nsamplesConsumed(address(), capacity); }

        /** Sets the specified value to the {@link XrHapticPcmVibrationFB#type} field. */
        public XrHapticPcmVibrationFB.Buffer type(@NativeType("XrStructureType") int value) { XrHapticPcmVibrationFB.ntype(address(), value); return this; }
        /** Sets the {@link FBHapticPcm#XR_TYPE_HAPTIC_PCM_VIBRATION_FB TYPE_HAPTIC_PCM_VIBRATION_FB} value to the {@link XrHapticPcmVibrationFB#type} field. */
        public XrHapticPcmVibrationFB.Buffer type$Default() { return type(FBHapticPcm.XR_TYPE_HAPTIC_PCM_VIBRATION_FB); }
        /** Sets the specified value to the {@link XrHapticPcmVibrationFB#next} field. */
        public XrHapticPcmVibrationFB.Buffer next(@NativeType("void const *") long value) { XrHapticPcmVibrationFB.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@link XrHapticPcmVibrationFB#buffer} field. */
        public XrHapticPcmVibrationFB.Buffer buffer(@NativeType("float const *") FloatBuffer value) { XrHapticPcmVibrationFB.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@link XrHapticPcmVibrationFB#sampleRate} field. */
        public XrHapticPcmVibrationFB.Buffer sampleRate(float value) { XrHapticPcmVibrationFB.nsampleRate(address(), value); return this; }
        /** Sets the specified value to the {@link XrHapticPcmVibrationFB#append} field. */
        public XrHapticPcmVibrationFB.Buffer append(@NativeType("XrBool32") boolean value) { XrHapticPcmVibrationFB.nappend(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrHapticPcmVibrationFB#samplesConsumed} field. */
        public XrHapticPcmVibrationFB.Buffer samplesConsumed(@NativeType("uint32_t *") IntBuffer value) { XrHapticPcmVibrationFB.nsamplesConsumed(address(), value); return this; }

    }

}