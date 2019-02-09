/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the Touch Haptics engine.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code SampleRateHz} &ndash; Haptics engine frequency/sample-rate, sample time in seconds equals {@code 1.0/sampleRateHz}</li>
 * <li>{@code SampleSizeInBytes} &ndash; Size of each Haptics sample, sample value range is {@code [0, 2^(Bytes*8)-1]}</li>
 * <li>{@code QueueMinSizeToAvoidStarvation} &ndash; Queue size that would guarantee Haptics engine would not starve for data. Make sure size doesn't drop below it for best results.</li>
 * <li>{@code SubmitMinSamples} &ndash; Minimum number of samples that can be sent to Haptics through {@link OVR#ovr_SubmitControllerVibration SubmitControllerVibration}</li>
 * <li>{@code SubmitMaxSamples} &ndash; Maximum number of samples that can be sent to Haptics through {@link OVR#ovr_SubmitControllerVibration SubmitControllerVibration}</li>
 * <li>{@code SubmitOptimalSamples} &ndash; Optimal number of samples that can be sent to Haptics through {@link OVR#ovr_SubmitControllerVibration SubmitControllerVibration}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrTouchHapticsDesc {
 *     int SampleRateHz;
 *     int SampleSizeInBytes;
 *     int QueueMinSizeToAvoidStarvation;
 *     int SubmitMinSamples;
 *     int SubmitMaxSamples;
 *     int SubmitOptimalSamples;
 * }</code></pre>
 */
@NativeType("struct ovrTouchHapticsDesc")
public class OVRTouchHapticsDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SAMPLERATEHZ,
        SAMPLESIZEINBYTES,
        QUEUEMINSIZETOAVOIDSTARVATION,
        SUBMITMINSAMPLES,
        SUBMITMAXSAMPLES,
        SUBMITOPTIMALSAMPLES;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, POINTER_SIZE,
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SAMPLERATEHZ = layout.offsetof(0);
        SAMPLESIZEINBYTES = layout.offsetof(1);
        QUEUEMINSIZETOAVOIDSTARVATION = layout.offsetof(2);
        SUBMITMINSAMPLES = layout.offsetof(3);
        SUBMITMAXSAMPLES = layout.offsetof(4);
        SUBMITOPTIMALSAMPLES = layout.offsetof(5);
    }

    /**
     * Creates a {@code OVRTouchHapticsDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRTouchHapticsDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code SampleRateHz} field. */
    public int SampleRateHz() { return nSampleRateHz(address()); }
    /** Returns the value of the {@code SampleSizeInBytes} field. */
    public int SampleSizeInBytes() { return nSampleSizeInBytes(address()); }
    /** Returns the value of the {@code QueueMinSizeToAvoidStarvation} field. */
    public int QueueMinSizeToAvoidStarvation() { return nQueueMinSizeToAvoidStarvation(address()); }
    /** Returns the value of the {@code SubmitMinSamples} field. */
    public int SubmitMinSamples() { return nSubmitMinSamples(address()); }
    /** Returns the value of the {@code SubmitMaxSamples} field. */
    public int SubmitMaxSamples() { return nSubmitMaxSamples(address()); }
    /** Returns the value of the {@code SubmitOptimalSamples} field. */
    public int SubmitOptimalSamples() { return nSubmitOptimalSamples(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRTouchHapticsDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRTouchHapticsDesc malloc() {
        return wrap(OVRTouchHapticsDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRTouchHapticsDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRTouchHapticsDesc calloc() {
        return wrap(OVRTouchHapticsDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRTouchHapticsDesc} instance allocated with {@link BufferUtils}. */
    public static OVRTouchHapticsDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRTouchHapticsDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRTouchHapticsDesc} instance for the specified memory address. */
    public static OVRTouchHapticsDesc create(long address) {
        return wrap(OVRTouchHapticsDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTouchHapticsDesc createSafe(long address) {
        return address == NULL ? null : wrap(OVRTouchHapticsDesc.class, address);
    }

    /**
     * Returns a new {@link OVRTouchHapticsDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTouchHapticsDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRTouchHapticsDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTouchHapticsDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTouchHapticsDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTouchHapticsDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRTouchHapticsDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRTouchHapticsDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTouchHapticsDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVRTouchHapticsDesc} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRTouchHapticsDesc mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVRTouchHapticsDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRTouchHapticsDesc callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVRTouchHapticsDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTouchHapticsDesc mallocStack(MemoryStack stack) {
        return wrap(OVRTouchHapticsDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRTouchHapticsDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTouchHapticsDesc callocStack(MemoryStack stack) {
        return wrap(OVRTouchHapticsDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRTouchHapticsDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTouchHapticsDesc.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRTouchHapticsDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTouchHapticsDesc.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRTouchHapticsDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTouchHapticsDesc.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTouchHapticsDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTouchHapticsDesc.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #SampleRateHz}. */
    public static int nSampleRateHz(long struct) { return UNSAFE.getInt(null, struct + OVRTouchHapticsDesc.SAMPLERATEHZ); }
    /** Unsafe version of {@link #SampleSizeInBytes}. */
    public static int nSampleSizeInBytes(long struct) { return UNSAFE.getInt(null, struct + OVRTouchHapticsDesc.SAMPLESIZEINBYTES); }
    /** Unsafe version of {@link #QueueMinSizeToAvoidStarvation}. */
    public static int nQueueMinSizeToAvoidStarvation(long struct) { return UNSAFE.getInt(null, struct + OVRTouchHapticsDesc.QUEUEMINSIZETOAVOIDSTARVATION); }
    /** Unsafe version of {@link #SubmitMinSamples}. */
    public static int nSubmitMinSamples(long struct) { return UNSAFE.getInt(null, struct + OVRTouchHapticsDesc.SUBMITMINSAMPLES); }
    /** Unsafe version of {@link #SubmitMaxSamples}. */
    public static int nSubmitMaxSamples(long struct) { return UNSAFE.getInt(null, struct + OVRTouchHapticsDesc.SUBMITMAXSAMPLES); }
    /** Unsafe version of {@link #SubmitOptimalSamples}. */
    public static int nSubmitOptimalSamples(long struct) { return UNSAFE.getInt(null, struct + OVRTouchHapticsDesc.SUBMITOPTIMALSAMPLES); }

    // -----------------------------------

    /** An array of {@link OVRTouchHapticsDesc} structs. */
    public static class Buffer extends StructBuffer<OVRTouchHapticsDesc, Buffer> implements NativeResource {

        private static final OVRTouchHapticsDesc ELEMENT_FACTORY = OVRTouchHapticsDesc.create(-1L);

        /**
         * Creates a new {@code OVRTouchHapticsDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRTouchHapticsDesc#SIZEOF}, and its mark will be undefined.
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
        protected OVRTouchHapticsDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code SampleRateHz} field. */
        public int SampleRateHz() { return OVRTouchHapticsDesc.nSampleRateHz(address()); }
        /** Returns the value of the {@code SampleSizeInBytes} field. */
        public int SampleSizeInBytes() { return OVRTouchHapticsDesc.nSampleSizeInBytes(address()); }
        /** Returns the value of the {@code QueueMinSizeToAvoidStarvation} field. */
        public int QueueMinSizeToAvoidStarvation() { return OVRTouchHapticsDesc.nQueueMinSizeToAvoidStarvation(address()); }
        /** Returns the value of the {@code SubmitMinSamples} field. */
        public int SubmitMinSamples() { return OVRTouchHapticsDesc.nSubmitMinSamples(address()); }
        /** Returns the value of the {@code SubmitMaxSamples} field. */
        public int SubmitMaxSamples() { return OVRTouchHapticsDesc.nSubmitMaxSamples(address()); }
        /** Returns the value of the {@code SubmitOptimalSamples} field. */
        public int SubmitOptimalSamples() { return OVRTouchHapticsDesc.nSubmitOptimalSamples(address()); }

    }

}